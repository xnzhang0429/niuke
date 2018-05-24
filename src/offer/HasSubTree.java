package offer;

import utils.IniteTree;
import utils.TreeNode;

public class HasSubTree {
    public static void main(String[] args){
        int array[] = {6,2,8,0,4,9,1,5};
        TreeNode root1 = new IniteTree().initeTree(array);
        int array1[] = {6,2,8,0,4,9,1,5};
        TreeNode root2 = new IniteTree().initeTree(array);
        HasSubtree(root1,root2);
    }

    public static boolean HasSubtree(TreeNode root1,TreeNode root2){
        if(root2==null)
            return true;
        if(root1==null&&root2!=null)
            return false;

        boolean result = false;
        if(root1!=null&&root2!=null){
            if (root1.val==root2.val){
                result = doseTree1HasTree2(root1,root2);
             }
             if(!result){
                result = HasSubtree(root1.left,root2);
             }
             if(!result){
                 result = HasSubtree(root1.right,root2);
             }
        }
        return result;
    }

    public static boolean doseTree1HasTree2(TreeNode root1,TreeNode root2){
        if(root1==null)
            return false;
        if(root2==null)
            return true;
        if(root1.val!=root2.val)
            return false;
        return doseTree1HasTree2(root1.left,root2.left)&&doseTree1HasTree2(root1.right,root2.right);
    }
}
