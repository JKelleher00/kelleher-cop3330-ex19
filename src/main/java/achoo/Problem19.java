package achoo;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 John Kelleher
 */
public class Problem19 {
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        System.out.print("Please enter your weight in pounds ");
        double wt = a.nextDouble();
        System.out.print("Please enter your height in inches ");
        double ht = a.nextDouble();
        double bmi = (wt / (ht * ht)) * 705;
        System.out.println("Your BMI is "+bmi);
        if(bmi<18.5)
            System.out.println("You are underweight, please see your doctor.");
        else if(bmi > 25)
            System.out.println("You are overweight, please see your doctor.");
        else System.out.println("You are in the ideal weight range.");
    }
}
