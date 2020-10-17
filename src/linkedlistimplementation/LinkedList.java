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
    public void insert(E exisitngData, E newData){
        Node exisitngNode=getNode(exisitngData);
        Node newNode=new Node(newData);
        Node tempnode= exisitngNode.next;
        exisitngNode.next=newNode;
        newNode.next=tempnode;
    }
    public void pop(){
        head=head.next;
    }
    public void popLast(){
        Node lastNode=head;
        while(lastNode.next.next!=null){
            lastNode=lastNode.next;
        }
        lastNode.next=null;

    }
    public Node getNode(E Data){
        Node searchNode=head;
        while(searchNode!=null){
            if(searchNode.data.equals(Data)){

                break;
            }
            searchNode=searchNode.next;
        }
        return searchNode;
    }

    public boolean search(E searchData){
       if(getNode(searchData)==null) return false;
       else return true;
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
