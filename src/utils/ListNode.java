package utils;

public class ListNode {
    public int val;
    public ListNode next = null;

    public ListNode() {}
    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode inite(ListNode l,int len){
        ListNode li = l;
        for(int i=1;i<len;i++){
            l.next = new ListNode(i);
            l = l.next;
        }
        return li;
    }

    public void printLink(ListNode start){
        if(start==null){
            System.out.print("该链表为空");
            return ;
        }
        while(start.next!=null){
            System.out.print(start.val);
            start = start.next;
        }
        System.out.print(start.val);//打印最后一个节点
        return ;
    }
}
