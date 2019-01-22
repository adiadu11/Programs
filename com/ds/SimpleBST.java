package com.ds;

public class SimpleBST
{

    class Node
    {
        int key;
        Node left, right;

        Node(int k)
        {
            key = k;
            left = right = null;
        }
    }

    Node root;


    public SimpleBST()
    {
        root = null;
    }

    private boolean isEmpty(Node root)
    {
        if (root == null)
            return true;
        return false;
    }

    public void insert(int k)
    {


        if (isEmpty(root))
        {
            root = new Node(k);
        }

        insert(root, k);
    }

    public Node insert(Node node, int k)
    {

        if (isEmpty(node))
        {
            Node temp = new Node(k);
            return temp;
        }

        if (k > node.key)
        {
            node.right = insert(node.right, k);
        }

        if (k < node.key)
        {
            node.left = insert(node.left, k);
        }

        return node;
    }

    public int get(int k)
    {
        return get(root, k);
    }

    public int get(Node x, int k)
    {

        if (isEmpty(root) || isEmpty(x))
        {
            return -999;
        }

        if (k == x.key)
            return k;

        if (k > x.key)
        {
            return get(x.right, k);
        }

        if (k < x.key)
        {
            return get(x.left, k);
        }

        return -1;
    }

}
