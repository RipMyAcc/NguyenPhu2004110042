package com.phunguyen2004110042.tuan07;

public class Node {
    int data;
    Node next;
    public Node(){
    }
    public Node(int d){
        data = d;
        next=null;
    }
    public Node(int d, Node n){
        data = d;
        next =n;
    }
}
