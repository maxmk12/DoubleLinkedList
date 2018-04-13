/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedlistlab;

/**
 *
 * @author Denise
 */
public class Node {
    private Node next;
    private Node prev;
    String name;
    public Node(Node n, Node p, String i){
        next = n;
        prev = p;
        name = i;
    }
    
    public Node getNext(){
        return next;
    }
    
    public Node getPrev(){
        return prev;
    }
    
    public void setNext(Node n){
        next = n;
    }
    
    public void setPrev(Node p){
        prev = p;
    }
    
    public String getName(){
        return name;
    }
}
