package Tree;


import java.util.*;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 * }
 */

public class Solution {
    /**
     *
     * @param root TreeNode类
     * @return int整型ArrayList<ArrayList<>>
     */
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        if (root == null) {

            return arrayLists;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        //while的每次循环都会开启下一层级的遍历
        while (!queue.isEmpty()) {
            //保存每一层的遍历的结果
            ArrayList<Integer> row = new ArrayList<>();
            int size = queue.size();
            //取前面的size大小保证每次循环只遍历一层
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();
                row.add(treeNode.val);
                if (treeNode.left != null)
                    queue.add(treeNode.left);
                if (treeNode.right != null)
                    queue.add(treeNode.right);
            }
            arrayLists.add(row);


        }
        return  arrayLists;
    }
}