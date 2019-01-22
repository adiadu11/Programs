package com.ds;

public class LinkedList
{

    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    Node head;

    public LinkedList()
    {
        head = null;
    }

    public Node add(int data)
    {

        if (head == null)
        {
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
            return temp;
        }

        Node curr = head;

        while (curr.next != null)
        {
            curr = curr.next;
        }

        Node temp = new Node(data);
        curr.next = temp;
        return temp;
    }

    public int remove()
    {
        Node curr = head;
        if (head == null)
        {
            return -999;
        }

        if (curr.next == null)
        {
            Node temp = head;
            head = null;
            return temp.data;
        }

        while (curr.next.next != null)
            curr = curr.next;

        Node temp = curr.next;
        curr.next = null;
        return temp.data;
    }

    public int peek()
    {
        if (head == null)
        {
            return -999;
        }

        Node curr = head;

        while (curr.next != null)
        {
            curr = curr.next;
        }

        return curr.data;
    }

    public void print()
    {
        if (head == null)
        {
            return;
        }

        Node curr = head;

        while (curr != null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }

        System.out.println(curr.data);
    }

    public void reverse()
    {
        Node curr = head;
        Node prev = null;

        while (curr != null)
        {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
    }

    public void reverseRec()
    {
        head = reverseRec(head);
    }

    public Node reverseRec(Node first)
    {
        Node second = first.next;
        if (second == null)
            return first;

        Node x = reverseRec(first.next);

        first.next = second.next;
        second.next = first;
        return x;
    }


}
