package offer;

import com.sun.scenario.effect.Merge;
import utils.ListNode;

public class MergeLink {
    public static void main(String[] args){
        ListNode node = new ListNode();
        ListNode node1 = new ListNode();
        node = node.inite(node,10);
        node.printLink(node);
        System.out.print("node");
        node1 = node1.inite(node1,3);
        node.printLink(node1);
        System.out.print("node1");
     //   node.printLink(Merge(node,node1));

        node.printLink(Merge2(node,node1));

    }

    /**
     * 建立了新表存储，采用非递归
     * @param list1
     * @param list2
     * @return
     */
    public static ListNode Merge1(ListNode list1,ListNode list2) {
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        ListNode l3 = null;
        ListNode l4 = null;

        while(list1!=null&&list2!=null){
            if(list1.val>list2.val){
                if(l3 == null){
                    l3 = l4 = list2;
                }
                else{
                    l4.next = list2;
                    l4 = l4.next;
                }
                list2 = list2.next;
            }
            else{
                if(l3 == null){
                    l3 = l4 ;
                }
                else{
                    l4.next = list1;
                    l4 = l4.next;
                }
                list1 = list1.next;
            }
        }
        if(list1 == null){
            l4.next = list2;
        }else{
            l4.next = list1;
        }
        System.out.print("node1");
        return l3;
    }
    /*
    建立了新表存储，采用递归
     */
    public static ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        ListNode l3 = null;
        if(list1.val>list2.val){
            l3 = list2;
            l3.next = Merge(list1,list2.next);
        }
        else{
            l3 = list1;
            l3.next = Merge(list1.next,list2);
        }
        return l3;
    }

    public static ListNode Merge2(ListNode list1,ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        if(list1.val <= list2.val){
            list1.next = Merge(list1.next, list2);
            return list1;
        }else{
            list2.next = Merge(list1, list2.next);
            return list2;
        }
    }
}
