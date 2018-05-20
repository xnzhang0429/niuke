package utils;

public class LinkedNode {
    public int val;
    public LinkedNode next;
    public LinkedNode(int val){
        this.val = val;
    }
    public void printLink(LinkedNode start){
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
