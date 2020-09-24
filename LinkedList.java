public class LinkedList {
    // head node
    Node head;


    //Node Structure
    class Node{
        int data;
        Node next;
        //constructor to create a node
        Node(int data){
            data=data;
            next=null;
        }
    }

    //Add a node at the front
    //Time complexity of push() is O(1) as it does constant amount of work.
    public void pushDataAtFront(int data){
        // new node creation
        Node newNode=new Node(data);
        //insert at front by taking the link of the head
        newNode.next=head;
        // now head is pointing the new node
        head=newNode;
    }
    //Add a node after a given node
    //order of 1
    public void appendNode(int data){

        System.out.println("give the given node");
        Node givenNode=new Node(data);
        if(givenNode==null){
            System.out.println("We cannot append");
        }
        Node secNode=new Node(data);
        secNode.next=givenNode.next;
        givenNode=secNode;

    }
    //Add a node at the End
    public void atEnd(int data){
        Node endNode=new Node(data);
        //It is the first as well as last node to append
        if(head==null){
            head=endNode;

        }
        endNode.next=null;
        Node last=head;


            while(last.next!=null) {
                last = last.next;
            }
            last.next=endNode;





 return;
    }


}

