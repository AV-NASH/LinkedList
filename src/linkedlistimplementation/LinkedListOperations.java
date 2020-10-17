package linkedlistimplementation;

public class LinkedListOperations {
    public static void main(String[] args) {
        System.out.println("Welcome to linked list program");
        LinkedList linkedList=new LinkedList();
        linkedList.add(70);

        linkedList.add(30);
        linkedList.add(56);
        linkedList.printList();
        System.out.println("-----");
      if( linkedList.search(30))
          System.out.println("Elemt is present");


    }
}
