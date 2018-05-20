package offer;

import utils.LinkedNode;

public class DeleteNode13 {
    public static void main(String[] args){
        LinkedNode node = new LinkedNode(1);
        LinkedNode start = node;//保存链表头节点
        LinkedNode n = start;//获取要删除的节点
        for(int i=2;i<10;i++){
            node.next = new LinkedNode(i);
            node = node.next;
        }
        node = null;
        start.printLink(start);

        for(int i=0;i<8;i++){
            n = n.next;
        }
        start.printLink(deleteNode(start, n));
    }

    public static LinkedNode deleteNode(LinkedNode start, LinkedNode del){

        LinkedNode st = start;
        if(start.next==null){//只有一个节点,
            if(start==del){//并且为删除节点
                start = null;
                return start;
            }
            else{
                System.out.print("不包含该节点，无法删除");
                return null;
            }
        }
        if(del.next!=null){
            del.val = del.next.val;
            del.next = del.next.next;
            return start;
        }else{//删除节点为尾节点
            while(st.next.next!=null){
                st = st.next;
            }
            if(st.next.val==del.val){
                st.next = null;
                return start;
            }
            else{
                System.out.print("不包含该节点，无法删除");
                return null;
            }


        }

    }
}
