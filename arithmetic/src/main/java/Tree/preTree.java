package Tree;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
 int val = 0;
 TreeNode left = null;
  TreeNode right = null;
  public TreeNode(int val) {
     this.val = val;
  }
 }

public class preTree {
 public void preorder(List<Integer> list, TreeNode root){
      if(root==null)
        return;
       list.add(Integer.valueOf(root.val));
       preorder(list,root.left);
       preorder(list,root.right);

 }

 public ArrayList preorderTraversal (TreeNode root) {
  //添加遍历结果的数组
   ArrayList<Integer> list=new ArrayList<>();
   preorder(list,root);
   int[] news=new int[list.size()];
   for(int i=0;i<list.size();i++){
       news[i]= list.get(i);
   }
   return list;

 }
 //中序遍历
 public void inorder(List<Integer> list, TreeNode root){
  if(root==null)
   return;
  inorder(list,root.left);
  list.add(Integer.valueOf(root.val));
  inorder(list,root.right);


 }


 public int[] inorderTraversal (TreeNode root) {
     // write code here
     List<Integer> list = new ArrayList<>();
     inorder(list, root);
     int[] newints = new int[list.size()];
     for (int i = 0; i < list.size(); i++) {
         newints[i] = list.get(i).intValue();
     }

     return newints;

 }
    public void aferorder(ArrayList<Integer> list,TreeNode treeNode){
         if(treeNode==null)
             return;
         aferorder(list,treeNode.left);
         aferorder(list,treeNode.right);
         list.add(treeNode.val);
    }
    public ArrayList postorderTraversal (TreeNode root) {
        // write code here
        ArrayList<Integer> list=new ArrayList<>();
        aferorder(list,root);
        return list;
    }
 public static void main(String[] args) {
     List<Integer> integers=new ArrayList<>();
     integers.add(11);
     integers.add(12);
     int[] newints=new int[integers.size()];
     for(int i=0;i<integers.size();i++){
         newints[i] = integers.get(i).intValue();
         System.out.println(newints[i]);
     }


 }
}
