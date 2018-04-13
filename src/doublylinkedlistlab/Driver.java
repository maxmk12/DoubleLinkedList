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
public class Driver {
    public static void main(String[] args){
        LL l = new LL();
        LL nL = new LL();
        
        l.createList();
        //l.print();
        //System.out.println("-------------------");
        nL = l.cpy(l);
        nL.print();
        //System.out.println("-------------------");
        
    }
}
