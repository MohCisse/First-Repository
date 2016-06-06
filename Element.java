/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intapp;

/**
 *
 * @author formation
 */
public class Element {

    String Element;
    int Next;

    public Element(String Element, int Next) {

        this.Element = Element;
        this.Next = Next;

    }


//    public String getElement(Element MonElement) {
//        return MonElement.Element;
//    }
//
//    public int getNext(Element MonElement) {
//        return MonElement.Next;
//    }

    public void setElement(String Element) {
        this.Element = Element;
    }

    public void setNext(int Next) {
        this.Next = Next;
    }
}
