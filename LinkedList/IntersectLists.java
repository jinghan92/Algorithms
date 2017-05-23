
/**
 * Created by jinghanyang on 5/11/17.
 */
public class IntersectLists {

    public IntersectLists() {
    }

    public static void main(String[] args){
        LinkedList list1 = new LinkedList();

        // creating first linked list
        list1.insertBack(3);
        list1.insertBack(1);
        list1.insertBack(6);
        list1.insertBack(7);
        list1.insertBack(15);
        list1.insertBack(30);

        // print LinkedList.
        System.out.println(list1.toString());

        LinkedList list2 = new LinkedList();
        list2.insertBack(8);
        list2.insertBack(9);
        list2.insertBack(15);
        list2.insertBack(30);

        System.out.println(list2.toString());

        IntersectLists intersectLists = new IntersectLists();
        LinkedListNode linkedListNode = intersectLists.getCommonNode(list1, list2);

        System.out.println(linkedListNode.getData());

    }

    /* function to get the intersection node of two lists when they
    have same length */


    /* get count of the list
     */
    public static int getCount(LinkedList list){

        int count = 0;
        LinkedListNode current = list.getHead();
        while(current!=null){
            count += 1;
            current = current.getNext();
        }
        return count;
    }

    // get the long and short list
    public class Compare{
        private LinkedList longList;
        private LinkedList shortList;
        private int diff;

        public Compare(LinkedList list1, LinkedList list2) {

            int count1 = getCount(list1);
            int count2 = getCount(list2);
            if(count1 >= count2){
                this.diff = count1 - count2;
                this.longList = list1;
                this.shortList = list2;
            }else {
                this.diff = count2 - count1;
                this.longList = list2;
                this.shortList = list1;
            }
        }

        public LinkedList getLongList(){
            return longList;
        }

        public LinkedList getCuttedLongList(){
            LinkedList longListCutted = new LinkedList();
            longListCutted = longList;
            for(int i=0; i<diff; i++){
                longListCutted.removeFront();
            }
            return longListCutted;
        }

        public LinkedList getShortList(){
            return shortList;
        }

        public int getDiff(){
            return diff;
        }
    }

    // get common node of two linked lists, already cut the difference.

    public LinkedListNode getCommonNode(LinkedList list1, LinkedList list2){
        Compare com = new Compare(list1, list2);


        LinkedList l1 = com.getCuttedLongList();
        LinkedList l2 = com.getShortList();
        int d = com.diff;


        LinkedListNode h1 = l1.getHead();
        LinkedListNode h2 = l2.getHead();
        while(h1 != null){
            if(h1.getData() == h2.getData()){
                return h1;
            }
            h1 = h1.getNext();
            h2 = h2.getNext();
        }
        System.out.println("There is no common node !");
        return null;

    }

}
