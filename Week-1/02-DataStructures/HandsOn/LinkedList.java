package com.cognizant.datastructures;

/**
 * Singly Linked List Implementation
 * Time Complexity:
 * - Insert at beginning: O(1)
 * - Insert at end: O(n)
 * - Delete: O(n)
 * - Search: O(n)
 */
public class LinkedList<T> {
    
    private Node<T> head;
    private int size;
    
    private static class Node<T> {
        T data;
        Node<T> next;
        
        Node(T data) {
            this.data = data;
        }
    }
    
    public LinkedList() {
        head = null;
        size = 0;
    }
    
    // Insert at beginning - O(1)
    public void insertAtBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    // Insert at end - O(n)
    public void insertAtEnd(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }
    
    // Insert at position - O(n)
    public void insertAtPosition(int position, T data) {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        
        if (position == 0) {
            insertAtBeginning(data);
            return;
        }
        
        Node<T> newNode = new Node<>(data);
        Node<T> current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }
    
    // Delete at position - O(n)
    public T deleteAtPosition(int position) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        
        T data;
        if (position == 0) {
            data = head.data;
            head = head.next;
        } else {
            Node<T> current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            data = current.next.data;
            current.next = current.next.next;
        }
        size--;
        return data;
    }
    
    // Search - O(n)
    public boolean contains(T data) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    // Traverse
    public void traverse() {
        Node<T> current = head;
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    public int getSize() {
        return size;
    }
}

// Test
class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.traverse();
        
        list.insertAtBeginning(5);
        list.traverse();
        
        list.insertAtPosition(2, 15);
        list.traverse();
        
        System.out.println("Contains 20? " + list.contains(20));
        System.out.println("Contains 100? " + list.contains(100));
        
        list.deleteAtPosition(1);
        list.traverse();
    }
}
