package offer;

import utils.LinkedNode;

public class DeleteKNode {
    public static void main(String[] args){
        LinkedNode node = new LinkedNode(1);
        LinkedNode start = node;//保存链表头节点
        for(int i=2;i<6;i++){
            node.next = new LinkedNode(i);
            node = node.next;
        }
        node = null;
        start.printLink( FindKthToTail(start,5));
    }


        public static LinkedNode FindKthToTail(LinkedNode head, int k) {
            if(head==null||k==0){
                return null;
            }
            LinkedNode node = head;//记录头节点
            LinkedNode node1 = head;//记录头节点
            for(int i=1;i<k;i++){
                if(node!=null){
                    node = node.next;
                }
                else{
                    return null;
                }
            }

            if(node==null) return null;
            while(node.next!=null){
                node = node.next;
                node1 = node1.next;
            }
            return node1;
        }

}
