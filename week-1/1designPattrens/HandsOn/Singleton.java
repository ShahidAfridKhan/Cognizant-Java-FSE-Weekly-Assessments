package com.cognizant.designpatterns;

class single {

    private static single s = new single();

    private single() {
        System.out.println("object created");
    }

    public static single get() {
        return s;
    }

    public void log(String m) {
        System.out.println(m);
    }
}

class test {

    public static void main(String[] args) {

        single a = single.get();
        single b = single.get();

        a.log("hello");

        System.out.println(a == b);
    }
}