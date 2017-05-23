/**
 * Created by jinghanyang on 5/22/17.
 */
public class LinkedList {
    public LinkedListNode head;

    public LinkedList(){
        this.head = null;
    }

    public int removeFront(){
        if(head == null){
            System.out.println("Error - Attempting to call removeFront() on empty list");
            return 0;
        }else {
            int temp = head.getData();
            head = head.getNext();
            return temp;
        }
    }

    public void insertFront(int data){
        if(head == null){
            head = new LinkedListNode(data);
        }else{
            LinkedListNode newNode = new LinkedListNode(data);
            newNode.setNext(head);
            head = newNode;
        }
    }

    public void insertBack(int data){
        if(head == null){
            head = new LinkedListNode(data);
        }else{
            LinkedListNode newNode = new LinkedListNode(data);
            LinkedListNode current = head;
            while(current.getNext()!=null){
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public int removeBack(){
        if(head == null){
            System.out.println("Error - Attempting to call removeBack() on empty list.");
            return 0;
        }else if(head.getNext()==null){
            int temp = head.getData();
            head = null;
            return temp;
        }else {
            LinkedListNode current = head;
            while(current.getNext().getNext() != null){
                current = current.getNext();
            }
            int temp = current.getData();
            current.setNext(null);
            return temp;
        }
    }

    public LinkedListNode getHead(){
        return head;
    }

    public void setHead(LinkedListNode head){
        this.head = head;
    }

    public String toString(){
        String retStr = "Contents:\n";

        LinkedListNode current = head;
        while (current != null){
            retStr += current.getData()+"\n";
            current = current.getNext();
        }
        return retStr;
    }
}
