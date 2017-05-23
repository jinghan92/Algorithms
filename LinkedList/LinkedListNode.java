/**
 * Created by jinghanyang on 5/22/17.
 */
public class LinkedListNode {
    public int data;
    public LinkedListNode next;

    public LinkedListNode(int data){
        this.data = data;
        this.next = null;
    }

    public int getData(){
        return data;
    }

    public void setData(int d){
        data = d;
    }

    public LinkedListNode getNext(){
        return next;
    }

    public void setNext(LinkedListNode n){
        next = n;
    }
}
