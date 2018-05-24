package utils;

import java.util.LinkedList;
import java.util.List;

public class IniteTree {
    private static List<TreeNode> nodeList = null;
    public static TreeNode initeTree(int array[]){
        nodeList = new LinkedList<TreeNode>();
        for(int i=0;i<array.length;i++){
            nodeList.add(new TreeNode(array[i]));
        }

        for(int i=0;i<(array.length/2-1);i++){//实现满二叉树的初始化
            nodeList.get(i).left = nodeList.get(2*i+1);
            nodeList.get(i).right = nodeList.get(2*i+2);
        }

        nodeList.get(2).left = null;
        nodeList.get(2).right = nodeList.get(5);
        nodeList.get(3).right = nodeList.get(6);
        nodeList.get(4).right = nodeList.get(7);
        return nodeList.get(0);
    }
}
