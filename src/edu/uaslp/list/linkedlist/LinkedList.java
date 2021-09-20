package edu.uaslp.list.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public void add(int data){
        Node node = new Node();

        node.data = data;

        if(head==null){
            head=node;
        }

        node.previous=tail;

        if(tail!=null){
            tail.next=node;
        }

        tail=node;
        size++;
    }

    public void insert(int data, int index){
        Node newNode= new Node();
        Node it=head;
        int counter=0;

        newNode.data=data;

        while(counter<index && it!=null){
            counter++;
            it=it.next;
        }

        it.previous.next=newNode;
        newNode.previous=it.previous;
        newNode.next=it;
        it.previous=newNode;

        size++;
    }

    public void delete(int index){
        int counter=0;
        Node it=head;

        while(counter<index && it!=null){
            counter++;
            it=it.next;
        }
        it.previous.next=it.next;
        it.next.previous=it.previous;
        it=null;
        size--;
    }

    public int getSize(){
        return size;
    }

    public int getAt(int index){
        int counter=0;
        Node it=head;

        while(counter<index && it!=null){
            counter++;
            it=it.next;
        }
        return it==null ? 0 : it.data;
    }

    public void printList(){
        int counter=0;
        Node it=head;

        while(counter<size && it!=null){
            System.out.println("Posicion "+counter+": "+it.data);
            counter++;
            it=it.next;
        }
        System.out.println("");
    }
}
