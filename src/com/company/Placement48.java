package com.company;

//LinkedList from scratch

//addFirst
//addLast
//deleteFirst
//deleteLast
//search
//reverse list using iteration method
//getSize
//printList




import java.util.Scanner;

public class Placement48 {
    Node head;
    private int size;

    Placement48(){
        size=0;
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;

        size++;
    }
    public void addLast(int data){
        Node currNode=head;
        Node newNode=new Node(data);
        while(currNode.next!=null){
            currNode=currNode.next;

        }
        currNode.next=newNode;

        size++;
    }
    public void printList(){
        Node currNode=head;
        while(currNode!=null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
            System.out.print("Null \n");
    }

    public void deleteFirst(){
        if(head==null) {
            System.out.println("The list is empty.");
        }
        head=head.next;

        size--;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("The list is empty.");
        }

        size--;
        if(head.next==null){
            head=null;
        }
        Node secondLastNode=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLastNode=secondLastNode.next;
        }
        secondLastNode.next=null;
    }

    public int getSize(){
        return size;
    }

    public Node reverseRecursive(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node newHead=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }

    public void reverse(){
        if(head==null||head.next==null){
            return ;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            prevNode=currNode;
            currNode=nextNode;


        }
        head.next=null;
        head=prevNode;
    }

//    public int search(int num){
//        Node currNode=head;
//        size=0;
//        while(currNode!=null){
//
//            if(currNode.data==num){System.out.println(size);
//            }
//            currNode=currNode.next;
//            size++;
//        }
//        return size;
//    }
    public static void main(String[]args){
        Placement48 list=new Placement48();
        Scanner sc=new Scanner(System.in);
        //int data=sc.nextInt();
        //list.addFirst(data);
        list.addFirst(1);
        list.addFirst(5);
        list.addFirst(7);
        list.addLast(3);
        list.addLast(8);
        list.addLast(2);
        list.addLast(3);
        list.printList();
       // list.deleteFirst();
       // list.deleteLast();
       // list.deleteLast();
       // list.printList();
        System.out.println("Size of the list is: "+list.getSize());
       list.head= list.reverseRecursive(list.head);
        list.printList();
//        int num=7;
//        System.out.println(list.search(num));
    }
}
