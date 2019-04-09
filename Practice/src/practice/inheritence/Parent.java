/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.inheritence;

/**
 *
 * @author Nayeem
 */
public class Parent {

    private int id;
    private final String NAME = "parent";
    private final String TEXT = "this is from parent";

    public Parent(int id) {
        this.id = id;
    }

    public void callMethod() {
        System.out.println(TEXT);
    }

}
