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
        Node it=head;
        int counter=0;

        if(index<0 || index>=size){
            return;
        }

        if(index==size){//(index==0 && size==0)
            add(data);
            return;
        }

        Node newNode= new Node();
        newNode.data=data;

        while(counter<index && it!=null){
            counter++;
            it=it.next;
        }

        newNode.previous=it.previous;
        newNode.next=it;

        if(it.previous==null){
            head=newNode;
        }else{
            it.previous.next=newNode;
        }

        it.previous=newNode;

        size++;
    }

    public void delete(int index){
        int counter=0;
        Node it=head;

        if(index<0 || index>=size){
            return;
        }

        while(counter<index && it!=null){
            counter++;
            it=it.next;
        }
        if (it != null) {
            if(it.previous==null){
                head=it.next;
            }else{
                it.previous.next=it.next;
            }

            if(it.next==null){
                tail=it.previous;
            }else{
                it.next.previous=it.previous;
            }
        }
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
