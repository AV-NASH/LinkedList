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
        Node exisitngNode;
        Node newNode=new Node(newData);
        exisitngNode=head;

        while(exisitngNode!=null){
            if(exisitngNode.data.equals(exisitngData))
                break;
            exisitngNode=exisitngNode.next;
        }
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
    public boolean search(E searchData){
        boolean result=false;
        Node searchNode=head;
        while(searchNode!=null){
            if(searchNode.data.equals(searchData)){
                result=true;
                break;
            }
            searchNode=searchNode.next;
            }
        return result;
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
