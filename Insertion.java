package com.company;

import java.util.Scanner;

class sorting
{
    public void s()
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i,j,temp;
        int []a = new int[n];
        for(i=0;i<n;i++)
            a[i]=in.nextInt();
        for(i=1;i<n;i++)
        {
            j=i-1;
            int k=a[i];
            while(k<a[j] && j>=0)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=k;
        }
        for(i=0;i<n;i++)
        System.out.println(a[i]);
    }
}
public class Main {

    public static void main(String[] args) {
        sorting s = new sorting();
        s.s();
    }
}
