package DataStructure.LinkedList;

public class LinkList {
    Node head;

    public void displayList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
         // Source from GeekforGeeks
        
        LinkList singlell = new LinkList();
        
        // create a node
        singlell.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        /*
        singlell.head       second             third 
             |                |                  | 
             |                |                  | 
         +----+------+     +----+------+     +----+------+ 
         | 10  | null |    | 20  | null|     |  30 | null | 
         +----+------+     +----+------+     +----+------+ */
        
        // connect node to next node
        singlell.head.next = second;
        second.next = third;
        /*
        singlell.head      second              third 
            |                |                  | 
            |                |                  | 
        +----+------+     +----+------+     +----+------+ 
        | 10 |  o------->| 20  |  o------->|  30 | null | 
        +----+------+     +----+------+     +----+------+ */

        singlell.displayList();

        System.out.println("\n\nEnd of the program ");
    }
    
}

class Node{
    int data;
    Node next;

    Node(int d){
        this.data = d;
        this.next = null;
    }

}