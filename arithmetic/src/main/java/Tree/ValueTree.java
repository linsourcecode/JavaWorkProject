package Tree;
/**
 * 给定一个二叉树root和一个值 sum ，判断是否有从根节点到叶子节点的节点值之和等于 sum 的路径。
 * 1.该题路径定义为从树的根结点开始往下一直到叶子结点所经过的结点
 * 2.叶子节点是指没有子节点的节点
 * 3.路径只能从父节点到子节点，不能从子节点到父节点
 * 4.总节点数目为n
 *
 * **/
public class ValueTree {

    public boolean hasPathSum (TreeNode root, int sum) {
        // write code here
        if (root == null) {
            return false;
        }
        // 深度优先遍历
        return dfs(root, sum);
    }

    private boolean dfs(TreeNode curNode, int target) {
        // 目标路径不存在，开始回溯
        if (curNode == null) {
            return false;
        }
        // 更新目标值
        target -= curNode.val;
        if(target<0)
            return false;
        // 当当前节点为叶子节点并且目标路径存在时，返回 true
        if (curNode.left == null && curNode.right == null && target == 0) {
            return true;
        }
        // 对左右分支进行 dfs
        return dfs(curNode.left, target) || dfs(curNode.right, target);
    }
}
