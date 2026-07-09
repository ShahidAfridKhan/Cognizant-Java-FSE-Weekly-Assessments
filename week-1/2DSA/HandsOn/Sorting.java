package com.cognizant.datastructures;

public class sort{

    public static void bubble(int[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
    }

    public static void quick(int[] a){
        quick(a,0,a.length-1);
    }

    public static void quick(int[] a,int l,int h){
        if(l<h){
            int p=part(a,l,h);
            quick(a,l,p-1);
            quick(a,p+1,h);
        }
    }

    public static int part(int[] a,int l,int h){
        int p=a[h];
        int i=l-1;

        for(int j=l;j<h;j++){
            if(a[j]<p){
                i++;
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }

        int t=a[i+1];
        a[i+1]=a[h];
        a[h]=t;

        return i+1;
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

    public static void insert(int[] a){
        for(int i=1;i<a.length;i++){
            int key=a[i];
            int j=i-1;

            while(j>=0&&a[j]>key){
                a[j+1]=a[j];
                j--;
            }

            a[j+1]=key;
        }
    }

    public static void print(int[] a){
        for(int i:a)
            System.out.print(i+" ");
        System.out.println();
    }

    public static void main(String[] args){
        int[] a={64,34,25,12,22,11,90};
        int[] b=a.clone();
        int[] c=a.clone();
        int[] d=a.clone();

        print(a);

        bubble(a);
        print(a);

        quick(b);
        print(b);

        mergeSort(c);
        print(c);

        insert(d);
        print(d);
    }
}