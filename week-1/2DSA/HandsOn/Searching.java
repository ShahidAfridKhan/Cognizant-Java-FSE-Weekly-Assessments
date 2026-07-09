package com.cognizant.datastructures;

public class search{

    public static int linear(int[] a,int t){
        for(int i=0;i<a.length;i++){
            if(a[i]==t)
                return i;
        }
        return -1;
    }

    public static int binary(int[] a,int t){
        int l=0,r=a.length-1;

        while(l<=r){
            int m=(l+r)/2;

            if(a[m]==t)
                return m;
            if(a[m]<t)
                l=m+1;
            else
                r=m-1;
        }
        return -1;
    }

    public static int binaryRec(int[] a,int t,int l,int r){
        if(l>r)
            return -1;

        int m=(l+r)/2;

        if(a[m]==t)
            return m;
        if(a[m]<t)
            return binaryRec(a,t,m+1,r);
        return binaryRec(a,t,l,m-1);
    }

    public static void main(String[] args){
        int[] a={64,34,25,12,22,11,90};
        int[] b={11,12,22,25,34,64,90};

        System.out.println(linear(a,25));
        System.out.println(linear(a,100));

        System.out.println(binary(b,25));
        System.out.println(binary(b,100));

        System.out.println(binaryRec(b,25,0,b.length-1));
        System.out.println(binaryRec(b,100,0,b.length-1));
    }
}