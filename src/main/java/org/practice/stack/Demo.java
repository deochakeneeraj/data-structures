package org.practice.stack;

public class Demo {

    public static void main(String[] args) {
        Stack stack= new Stack(1);
        stack.push(5);
        stack.push(5);
        System.out.println("Popped "+stack.pop());
        stack.displayStack();
    }

}
