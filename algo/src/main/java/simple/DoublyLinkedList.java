package simple;

public class DoublyLinkedList {

    class Node{
        Node prev,next;
        int value;

        Node(int value){
            this.prev = null;
            this.next = null;
            this.value = value;
        }
    }

    Node head, tail;

    public DoublyLinkedList(){
        head = tail = null;
    }

    public void insertNode(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }else{
            Node currentNode = head;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            newNode.prev = currentNode;
        }
        tail = newNode;
    }

    public void setHead(int value){
        Node newNode = new Node(value);
        if(head == null) {
            tail = newNode;
        } else{
            Node currentNode = head;
            currentNode.prev = newNode;
            newNode.next = currentNode;
        }
        head = newNode;
    }

    public void setTail(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = tail = newNode;
        } else{
            Node currentNode = tail;
            currentNode.next = newNode;
            newNode.prev = currentNode;
            tail = newNode;
        }
    }

    public void remove(int valueToDelete){
        if(head == null){
            System.out.println("LL is empty");
            return;
        } else if(head.value == valueToDelete) {
            Node currentNode = head;
            Node nextNode = head.next;
            head = nextNode;
            currentNode = null;
            return;
        } else if(tail.value == valueToDelete) {
            Node currentNode = tail;
            Node prevNode = tail.prev;
            prevNode.next = null;
            tail = prevNode;
            currentNode = null;
            return;
        } else{
            Node currentNode = head;
            boolean flag = false;
            while(currentNode != null){
                if(currentNode.value == valueToDelete) {
                    flag = true;
                    Node prevNode = currentNode.prev;
                    Node nextNode = currentNode.next;
                    prevNode.next = nextNode;
                    nextNode.prev = prevNode;
                    //currentNode = null;
                    //return;
                }
                currentNode = currentNode.next;
            }
            if(flag == false){
                System.out.println("Value not found in LL");
            }
        }
    }

    public void insertBefore(int valueToSearch, int valueToInsert){
        Node newNode = new Node(valueToInsert);
        if(head == null) {
            System.out.println("LL is empty");
            return;
        } else if(head.value == valueToSearch){
            setHead(valueToInsert);
            return;
        }else{
            Node currentNode = head;
            while(currentNode != null){
                System.out.println("Reached here");
                if(currentNode.value == valueToSearch){
                    Node prevNode = currentNode.prev;
                    prevNode.next = newNode;
                    newNode.prev = prevNode;
                    currentNode.prev = newNode;
                    newNode.next = currentNode;
                    return;
                }
                currentNode = currentNode.next;
            }
            System.out.println("Node with given value not exist in LL");
        }
    }

    public void insertAfter(int valueToSearch, int valueToInsert){
        Node newNode = new Node(valueToInsert);
        if(head == null){
            System.out.println("LL is empty");
            return;
        } else if(tail.value == valueToSearch){
            setTail(valueToInsert);
            return;
        } else{
            Node currentNode = head;
            while(currentNode != null){
                if(currentNode.value == valueToSearch){
                    Node nextNode = currentNode.next;
                    currentNode.next = newNode;
                    newNode.prev = currentNode;
                    nextNode.prev = newNode;
                    newNode.next = nextNode;
                    return;
                }
                currentNode = currentNode.next;
            }
            System.out.println("Node with given value not exist in LL");
        }
    }

    public void insertAtPosition(int position, int valueToInsert){
        Node newNode = new Node(valueToInsert);
        int countNodes = getNumberOfNodes();
        if(position == 1) setHead(valueToInsert);
        else if(position >= countNodes){
            setTail(valueToInsert);
        }
        else{
            Node currentNode = head;
            int pos = 2;
            while(pos < position){
                pos ++;
                currentNode = currentNode.next;
            }
            Node nextNode = currentNode.next;
            currentNode.next = newNode;
            newNode.prev = currentNode;
            nextNode.prev = newNode;
            newNode.next = nextNode;
        }
    }

    public int getNumberOfNodes(){
        int count = 0;
        if(head == null) count = 0;
        else{
            Node currentNode = head;
            while(currentNode != null){
                count++;
                currentNode = currentNode.next;
            }
        }
        return count;
    }

    public void displayNode(){
        if(head == null) System.out.println("LL is empty");
        else{
            Node currentNode = head;
            while(currentNode != null){
                System.out.println(currentNode.value);
                currentNode = currentNode.next;
            }
        }
    }

    public boolean containsNodeWithValue(int searchValue){
        boolean found = false;
        if(head == null) return false;
        else{
            Node currentNode = head;
            while(currentNode != null){
                if(currentNode.value == searchValue)
                    return true;
                currentNode = currentNode.next;
            }
        }
        return false;
    }
}
