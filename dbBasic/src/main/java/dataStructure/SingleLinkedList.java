package dataStructure;

public class SingleLinkedList {
    private class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    Node head;
    public void addFirst(int data){
        Node newNode = new Node(data);
        //If list is empty then add first element in linked list
        if(head == null) head = newNode;
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    public int getFirst(){
        return head.data;
    }
    public int getLast(){
        Node currentNode = head;
        while(currentNode.next!=null)
            currentNode = currentNode.next;
        return currentNode.data;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null) head = newNode;
        else {
            Node currentNode = head;
            while (currentNode.next != null)
                currentNode = currentNode.next;
            currentNode.next = newNode;
        }
    }
    public int size(){
        int count=0;
        if(head == null) {
            count = 0;
        }
        else{
            Node currentNode = head;
            count = 1;
            while (currentNode.next != null){
                currentNode = currentNode.next;
                count++;
            }
        }
        return count;
    }
    public void deleteValue(int data){
        if(head == null) return;
        if(head.data == data){
            head = head.next;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null){
            if(currentNode.next.data == data){
                currentNode.next = currentNode.next.next;
                return;
            }
            currentNode = currentNode.next;
        }
    }
}
