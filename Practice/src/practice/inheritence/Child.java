/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.inheritence;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Nayeem
 */
public class Child extends Parent {

    private int id;
    private final String NAME = "child";
    private final String TEXT = "this is from child";

    public Child(int id) {
        super(id);
    }

    public static void main(String... args) {
        //System.out.println(callMehod());
        Child child = new Child(1);
        child.callMethod();

    }

    @Override
    public void callMethod() {
        long time = System.currentTimeMillis();
        Date date = new Date(time);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mma");
        String dateAndTime = simpleDateFormat.format(date);
        System.out.println(TEXT + "\n" + time + "\n" + dateAndTime);
    }
}
