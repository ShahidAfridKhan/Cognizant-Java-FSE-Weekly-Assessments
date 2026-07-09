package com.cognizant.datastructures;

public class recur{

    public static int fact(int n){
        if(n<=1)
            return 1;
        return n*fact(n-1);
    }

    public static int fib(int n){
        if(n<=1)
            return n;
        return fib(n-1)+fib(n-2);
    }

    public static int fibMemo(int n,int[] m){
        if(n<=1)
            return n;
        if(m[n]!=-1)
            return m[n];
        m[n]=fibMemo(n-1,m)+fibMemo(n-2,m);
        return m[n];
    }

    public static int power(int a,int b){
        if(b==0)
            return 1;
        if(b%2==0){
            int h=power(a,b/2);
            return h*h;
        }
        return a*power(a,b-1);
    }

    public static int binary(int[] a,int t,int l,int r){
        if(l>r)
            return -1;

        int m=(l+r)/2;

        if(a[m]==t)
            return m;
        if(a[m]<t)
            return binary(a,t,m+1,r);
        return binary(a,t,l,m-1);
    }

    public static int sum(int[] a,int i){
        if(i==a.length)
            return 0;
        return a[i]+sum(a,i+1);
    }

    public static int tail(int n,int ans){
        if(n<=1)
            return ans;
        return tail(n-1,n*ans);
    }

    public static String rev(String s){
        if(s.length()==0)
            return s;
        return rev(s.substring(1))+s.charAt(0);
    }

    public static void main(String[] args){
        System.out.println(fact(5));
        System.out.println(fib(10));

        int[] m=new int[11];
        for(int i=0;i<m.length;i++)
            m[i]=-1;

        System.out.println(fibMemo(10,m));
        System.out.println(power(2,10));

        int[] a={1,2,3,4,5};
        System.out.println(sum(a,0));

        System.out.println(tail(5,1));
        System.out.println(rev("hello"));
    }
}