package org.example;

public class loop {
    public static void main(String[] args)
    {
        int[] number3= {10, 15, 20, 25, 30};
        int sum = 0;
        for(int i = 0; i<5; i++)
        {
            System.out.println(i);
        }


        for(int num: number3)
        {
            sum = sum + num;
            System.out.println(sum);
        }


        int i = 10;
        while(i>0)
        {
            System.out.println(i);
            i--;
        }


        int j = 8;
        do{
            System.out.println(j);
            j--;
        }
        while(j>0);
    }
}
