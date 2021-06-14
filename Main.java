package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverse(1535678999));
	// write your code here
        //System.out.println(1%10);
    }
    public static int reverse(int x) {
        int num = 0;
        while(x!=0)
        {   if((num<(Math.pow(-2,31)))||((num>(Math.pow(2,31))-1)))
            return 0;
            num = num * 10 ;
            if((num<(Math.pow(-2,31)))||((num>(Math.pow(2,31))-1)))
                return 0;
                    num=num+ x % 10;
            if((num<(Math.pow(-2,31)))||((num>(Math.pow(2,31))-1)))
                return 0;
            x = x / 10;
        }

            return num;

    }

}
