package simple;

import simple.DoublyLinkedList;

public class DoublyLinkedListTest {

    public static void main(String[] args) {
        DoublyLinkedList ll = new DoublyLinkedList();

        ll.insertNode(10);
        ll.insertNode(20);
        ll.insertNode(30);

        ll.setHead(5);
        ll.setTail(35);

        //ll.insertBefore(50,7);

        ll.insertAfter(30,32);

        ll.insertAfter(35,50);

        ll.insertAtPosition(10,15);

        ll.remove(100);

        ll.displayNode();

        //System.out.println(ll.containsNodeWithValue(40));
    }
}
