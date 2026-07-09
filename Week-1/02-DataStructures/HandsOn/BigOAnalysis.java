package com.cognizant.datastructures;

public class bigo{

    public static int first(int[] a){
        return a[0];
    }

    public static int linear(int[] a,int t){
        for(int i=0;i<a.length;i++){
            if(a[i]==t)
                return i;
        }
        return -1;
    }

    public static void bubble(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
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

    public static void mergeSort(int[] a){
        if(a.length<2)
            return;

        int m=a.length/2;
        int[] l=new int[m];
        int[] r=new int[a.length-m];

        System.arraycopy(a,0,l,0,m);
        System.arraycopy(a,m,r,0,a.length-m);

        mergeSort(l);
        mergeSort(r);
        merge(a,l,r);
    }

    public static void merge(int[] a,int[] l,int[] r){
        int i=0,j=0,k=0;
        while(i<l.length&&j<r.length){
            if(l[i]<=r[j])
                a[k++]=l[i++];
            else
                a[k++]=r[j++];
        }
        while(i<l.length)
            a[k++]=l[i++];
        while(j<r.length)
            a[k++]=r[j++];
    }

    public static int fib(int n){
        if(n<=1)
            return n;
        return fib(n-1)+fib(n-2);
    }
}