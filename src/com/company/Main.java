package com.company;

public class Main {

    public static void main(String[] args) {
        //Homework 4
	    String action;
        int T = 18;

        //Homework 5
        int A = 100;
        int B = 20;

        //homework 6
        int price = 0;
        int weight = 11;
        int price5 = 3 + 2*(5-2);
        

    //homework 6
        if(weight > 5)
            price = price5 + 2*(weight-5);

        System.out.println(price);



        //if(weight <=5 && weight > 2)
            //price = 3 + 2*(weight-2);

            //System.out.println(price);



    //Homework 5a
    //if(A >= 100)
        //if(B <= 50)
            //System.out.println(1);
    //else
            //System.out.println(0);



    //Homework 5b
        if(A >= 100){
            if(B <= 50)
                System.out.println(1);}
        else if(B >= 100){
            if(A <= 50)
                System.out.println(1);}
        else
            System.out.println(0);



    //Homework 4
    if(T < 17)
        action = "hit";
    else if (T > 21)
        action = "bust";
    else
        action = "stay";

        System.out.println(action);
    }
}
