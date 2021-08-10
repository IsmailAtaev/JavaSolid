package com.task.calculate;

import com.task.one.Number;
import com.task.two.Circle;



/**
 *
 */

public class calculate {

    //* find small value  return small number, throw null pointer exception;
    public static int findSmallerNumber(Number a, Number b) throws NullPointerException, Exception {
        if (a.getValueInt() == null || b.getValueInt() == null) {
            throw new NullPointerException("smallerNumber method");
        }
        return (a.getValueInt() >= b.getValueInt()) ? a.getValueInt() : b.getValueInt();
    }

    public static  double getCircleAreaOfSmeller





}