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
public class LL {
    private Node first;
    private String[] names;
    private Node temp;
    private Node temp2;
    private Node cpyFirst;
    public LL(){
        
        
    }
    
    public void createList(){
        String[] names = new String[10];
        names[0] = "joe";
        names[1] = "max";
        names[2] = "Erin";
        names[3] = "abby";
        names[4] = "Jared";
        names[5] = "mike";
        names[6] = "francis";
        names[7] = "piper";
        names[8] = "Don";
        names[9] ="denise";
        
        for(int i = 0; i <= 9; i++){
           
            if (i == 0){
                first = new Node(null, null, names[0]);
            }
            else { 
                temp = first;
                Node k = new Node(temp, null, names[i]);
                k.setNext(temp);
                temp.setPrev(k);
                first = k;
            }
            temp = first;
        }
        
    }
    
    public void print(){
        temp = first;
        while(temp != null){
            System.out.println(temp.getName());
            temp = temp.getNext();
        }
        
    }
    
    public LL cpy(LL l){
        LL reversed = new LL();
        temp = l.first;
        while(temp.getNext() != null){
            temp = temp.getNext();
        }
        for(int i = 0; temp.getPrev() != null; i++){
            if (i == 0){
                reversed.cpyFirst = new Node(null, null, temp.getName());
                temp = temp.getPrev();
            }
            else { 
                temp2 = first;
                Node k = new Node(temp2, null, temp.getName());
                k.setNext(temp2);
                temp2.setPrev(k);
                reversed.cpyFirst = k;
                temp = temp.getPrev();
            }
            
        }
        
        return reversed;
        
    }
    
}
