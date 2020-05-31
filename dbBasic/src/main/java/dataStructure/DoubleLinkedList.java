package dataStructure;

public class DoubleLinkedList {
    private class Node{
        int data;
        Node next,prev;
        public Node(int data){
            this.data = data;
            next = prev = null;
        }
    }
    Node head;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null) head = newNode;
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public int getFirst(){
        return head.data;
    }
    public int getLast(){
        Node currentNode = head;
        while(currentNode.next!=null){
            currentNode = currentNode.next;
        }
        return currentNode.data;
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
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null) head = newNode;
        else {
            Node currentNode = head;
            while (currentNode.next != null)
                currentNode = currentNode.next;
            currentNode.next = newNode;
            newNode.prev = currentNode;
        }
    }
    private Node search(int data){
        Node currentNode = head;
        while(currentNode!=null && currentNode.data!=data)
            currentNode = currentNode.next;
        return currentNode;
    }
    public boolean isExist(int data){
        if(search(data)!=null) return true;
        else return false;
    }
    public void deleteValue(int data){
        if(head == null) return;
        Node deleteNode = search(data);
        if(deleteNode.prev != null) deleteNode.prev.next = deleteNode.next;
        else head = deleteNode.next;
        if(deleteNode.next!=null) deleteNode.next.prev = deleteNode.prev;
    }
}
