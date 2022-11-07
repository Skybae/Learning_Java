package com.company;

//stack using linked list
//push operation
//peep operation
//pop operation
//time complexity for each operation is O(1).

public class Placement50 {
     private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        public static Node head=null;
        public static boolean isEmpty(){
            return head==null;
        }
        public static void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;

        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;

        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            Node top=head;
            head=head.next;
            return top.data;

        }
    }

    public static void main(String[]args){
Stack stack=new Stack();
stack.push(1);
stack.push(2);
stack.push(3);


        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
stack.pop();
        }

    }
}
