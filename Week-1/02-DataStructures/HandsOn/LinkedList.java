package com.cognizant.datastructures;

public class list<T>{

    node<T> head;
    int size;

    static class node<T>{
        T data;
        node<T> next;

        node(T data){
            this.data=data;
        }
    }

    public void addFirst(T data){
        node<T> n=new node<>(data);
        n.next=head;
        head=n;
        size++;
    }

    public void addLast(T data){
        node<T> n=new node<>(data);
        if(head==null){
            head=n;
        }else{
            node<T> t=head;
            while(t.next!=null){
                t=t.next;
            }
            t.next=n;
        }
        size++;
    }

    public void add(int pos,T data){
        if(pos<0||pos>size)
            return;

        if(pos==0){
            addFirst(data);
            return;
        }

        node<T> n=new node<>(data);
        node<T> t=head;

        for(int i=0;i<pos-1;i++)
            t=t.next;

        n.next=t.next;
        t.next=n;
        size++;
    }

    public T delete(int pos){
        if(pos<0||pos>=size)
            return null;

        T val;

        if(pos==0){
            val=head.data;
            head=head.next;
        }else{
            node<T> t=head;
            for(int i=0;i<pos-1;i++)
                t=t.next;

            val=t.next.data;
            t.next=t.next.next;
        }

        size--;
        return val;
    }

    public boolean find(T data){
        node<T> t=head;
        while(t!=null){
            if(t.data.equals(data))
                return true;
            t=t.next;
        }
        return false;
    }

    public void show(){
        node<T> t=head;
        while(t!=null){
            System.out.print(t.data+" -> ");
            t=t.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        list<Integer> l=new list<>();

        l.addLast(10);
        l.addLast(20);
        l.addLast(30);
        l.show();

        l.addFirst(5);
        l.show();

        l.add(2,15);
        l.show();

        System.out.println(l.find(20));
        System.out.println(l.find(100));

        l.delete(1);
        l.show();
    }
}