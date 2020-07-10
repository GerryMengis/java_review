package DataStructure.LinkedList;

public class SingleLL {
    Node head;
    
// creating a null linklist 
   static class Node{
       int value;
       Node next;
       Node(int value){
           this.value = value;
           this.next = null;
       }
    }

    public void addValue(int value){
        /* Add the first value of a linklist */
        if(head == null){
            head = new Node(value);
            return;
        }

       /*  Add more value to the next node */
        Node new_node = new Node(value); 
        new_node.next = null;

        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = new_node;
       } 

    public void insertAtFront(int new_value){
    /* insert a value at the biggening of the node */
        Node new_node = new Node(new_value);
        new_node.next = head;
        head = new_node;
    }
    public void insertAtMiddle(Node prev_node, int new_value){
     /* Insert a value at the end of the node */
     if(prev_node == null){
         System.out.println("The is middle");
         return;
     }
     Node new_node = new Node(new_value);
     new_node.next = prev_node.next;
     prev_node.next = new_node;
    }
    
    public void removeFromBiggenning(int key){
        Node temp = head;
        Node prev = null;
        if(temp != null && temp.value == key){
            head = temp.next;
            return;
        }

        while(temp != null && temp.value != key){
            prev = temp;
            temp = temp.next;
        }

        if(temp == null) return;
        prev.next = temp.next;

    }

    public void displayList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

 public static void main(String[] args) {
        SingleLL singleLL = new SingleLL();
        singleLL.addValue(10);
        singleLL.addValue(20);
        singleLL.addValue(30);
        singleLL.insertAtFront(5);
        singleLL.addValue(50);
        singleLL.insertAtMiddle(singleLL.head.next,40);
        singleLL.addValue(70);
        singleLL.insertAtMiddle(singleLL.head.next,100);

        singleLL.removeFromBiggenning(5);
        singleLL.removeFromBiggenning(40);
        singleLL.removeFromBiggenning(1000);
    
        singleLL.displayList();

        System.out.println("\n\nEnd of the program ");
        
    }
    
}