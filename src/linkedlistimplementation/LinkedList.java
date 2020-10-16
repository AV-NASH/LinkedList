package linkedlistimplementation;

public class LinkedList<E> {
    Node head=null;

    public void add(E data){
        Node node=new Node(data);

        if(head==null)
            head=node;
        else{
            node.next=head;
            head=node;
        }
    }

    public void append(E data){
        Node node=new Node(data);

        if(head==null)
            head=node;
        else{
            Node tempNode=head;
            while(tempNode.next!=null)
                tempNode=tempNode.next;
            tempNode.next=node;
        }
    }


    public void printList(){
        if(head==null) System.out.println("LinkedList empty");
        else{
        Node node=head;
        while(node!=null){
            System.out.println(node.data);
            node=node.next;
        }

        }
    }
}
