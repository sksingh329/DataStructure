package dataStructure;

public class Stack {
    private int[] stack;
    private int top;
    public Stack(int stackSize){
        stack = new int[stackSize];
        top = -1;
    }
    public boolean isStackEmpty(){
        if(top==-1) return true;
        else return false;
    }
    public boolean isStackFull(){
        if(top==stack.length-1) return true;
        else return false;
    }
    public void push(int value){
        if(!isStackFull()){
            //top +=1;
            stack[++top] = value;
        }else System.out.println("Stack is full");
    }
    public void pop(){
        if(!isStackEmpty()){
            System.out.println("Pop element is "+stack[top--]);
            //top -=1;
        }else{
            System.out.println("Stack is empty");
        }
    }
    public void peek(){
        if(!isStackEmpty()){
            System.out.println("Top element is "+stack[top]);
            //top -=1;
        }else{
            System.out.println("Stack is empty");
        }
    }
}
