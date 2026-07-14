package com.cognizant.designpatterns;

interface shape {
    void draw();
}

class circle implements shape {
    public void draw() {
        System.out.println("drawing circle");
    }
}

class rect implements shape {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

class tri implements shape {
    public void draw() {
        System.out.println("drawing triangle");
    }
}

class factory {

    public static shape get(String s) {

        if (s == null)
            return null;

        if (s.equalsIgnoreCase("circle"))
            return new circle();

        if (s.equalsIgnoreCase("rectangle"))
            return new rect();

        if (s.equalsIgnoreCase("triangle"))
            return new tri();

        return null;
    }
}

class test {

    public static void main(String[] args) {

        shape a = factory.get("circle");
        a.draw();

        shape b = factory.get("rectangle");
        b.draw();

        shape c = factory.get("triangle");
        c.draw();
    }
}