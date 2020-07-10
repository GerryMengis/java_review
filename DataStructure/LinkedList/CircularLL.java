package DataStructure.LinkedList;


public class CircularLL {
    public static void main(String[] args) {
        CircularLinkedList c = new CircularLinkedList();
        c.AddAtStart(3);
        c.AddAtEnd(4);
        c.AddAtStart(2);
        c.AddAtStart(1);
        c.DeleteNodeFromStart();

        c.display();
    }
}

class CircularLinkedList{
    public Node head;
    public Node tail;
    int size = 0;

    public void AddAtStart(int data){
        Node n = new Node(data);
        if(size == 0){
            head = n;
            tail = n;
            n.next = head;
        }
        else{
            Node temp = head;
            n.next = temp;
            head = n;
            tail.next = head;
        }
        size += 1;
        
    }

    public void AddAtEnd(int data){
        if(size == 0){
            AddAtStart(data);
        }
        else{
            Node n = new Node(data);
            tail.next = n;
            tail = n;
            tail.next = head;
            size += size;
        }

    }

    public void DeleteNodeFromStart(){
        if(size == 0){
            System.out.println("Data is empty");
        }
        else{
            head = head.next;
            tail.next = head;
            size -= 1;
        }
    }
    
public void display(){
    Node temp = head;
    if(size <= 0){
     // System.out.println(temp.data + " ");
    }
    else{
        do{
         System.out.print(" " + temp.data);
         temp = temp.next;

        }while(temp != head);
    }
    System.out.println();

 }
}

class Node{
Node next = null;
int data;
Node(int data){
    this.data = data;
}
}
