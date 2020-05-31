package dataStrucutreTest;

import dataStructure.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack(2);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.peek();
        stack.pop();
    }
}
