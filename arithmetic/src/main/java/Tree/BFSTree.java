package Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/***
 *
 *   给定一个二叉树，返回该二叉树层序遍历的结果，（从左到右，一层一层地遍历）
 *      思路：建立两个数组，一个是 ArrayList<ArrayList<Integer>> 保存每个层级遍历的结果的数组
 *           另外一个是 Queue<TreeNode> 会保存下一层级的遍历节点
 */

public class BFSTree {
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>> arrayLists=new ArrayList<>();
        if(arrayLists==null)
            return arrayLists;
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.add(root);
        //while的每次循环都会开启下一层级的遍历
        while (!queue.isEmpty()){
            ArrayList<Integer> row=new ArrayList<>();
            int size = queue.size();
            //取前面的size大小保证每次循环只遍历一层
            for (int i=0;i<size;i++){
                 TreeNode treeNode= queue.poll();
                 row.add(treeNode.val);
                if(treeNode.left != null)
                    queue.add(treeNode.left);
                if(treeNode.right != null)
                    queue.add(treeNode.right);
            }
            arrayLists.add(row);


        }
        return  arrayLists;
    }
}
