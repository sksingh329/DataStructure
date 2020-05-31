package dataStructure;

public class Queue {
    private int[] queue;
    private int head;
    private int tail;
    public Queue(int queueSize){
        queue = new int[queueSize];
        head = tail = 0;
    }
    public boolean isQueueEmpty(){
        if(head == 0 && tail == 0) return true;
        else return false;
    }
    public boolean isQueueFull(){
        if((head==0&&tail==queue.length-1)||(head==tail+1)) return true;
        else return false;
    }
    public void enqueue(int value){
        if(!isQueueFull()){
            queue[tail] = value;
            if(tail==queue.length-1) tail = 0;
            else tail++;
        }else{
            System.out.println("head="+head+",tail="+tail);
            System.out.println("Queue is full "+value);
        }
    }
    public void dequeue(){
        if(!isQueueEmpty()){
            System.out.println("Dequeued element is "+queue[head]);
            if(head==queue.length-1) head =0;
            else head++;
        }
        else System.out.println("Queue is empty");
    }
}
