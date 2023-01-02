package org.practice.stack;

import org.practice.exceptions.StackOverflowException;

public class Stack {
    private Object[] stack;
    private int top;
    private int maxSize;

    public Stack (){
        System.out.println("Default executed");
        this.top=-1;
    }

    public Stack(int maxSize){
        this();
        this.stack= new Object[maxSize];
        this.maxSize=maxSize;
    }

    private boolean isEmpty(){
        return this.top==-1?true:false;
    }
    private boolean isFull(){
        return this.top==maxSize-1?true:false;
    }

    public Object pop(){
        if (this.isEmpty())return null;
        Object  data= this.stack[this.top];
        this.stack[top--]=null;
        return data;
    }


    public void push(Object data){

        try{
            if (this.isFull())
                throw new StackOverflowException("Cannot push more elements in stack");
            this.stack[++this.top]=data;
        }catch(StackOverflowException e){
            System.out.println(e);
            data=null;
        }finally {
            this.displayStack();
        }
    }

    public void displayStack(){
        System.out.println("Displaying stack");
        if (top==-1){
            System.out.println("Stack empty");
            return;
        }
        for(Object element:this.stack){
            System.out.println(element);
        }
    }
}
