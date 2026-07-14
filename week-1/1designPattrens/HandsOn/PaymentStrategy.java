package com.cognizant.designpatterns;

interface pay {
    void pay(double a);
}

class card implements pay {
    private String no;

    public card(String no) {
        this.no = no;
    }

    public void pay(double a) {
        System.out.println("paid " + a + " using card: " + no);
    }
}

class paypal implements pay {
    private String id;

    public paypal(String id) {
        this.id = id;
    }

    public void pay(double a) {
        System.out.println("paid " + a + " using paypal: " + id);
    }
}

class bitcoin implements pay {
    private String ad;

    public bitcoin(String ad) {
        this.ad = ad;
    }

    public void pay(double a) {
        System.out.println("paid " + a + " using bitcoin: " + ad);
    }
}

class process {
    private pay p;

    public void set(pay p) {
        this.p = p;
    }

    public void run(double a) {
        if (p == null) {
            System.out.println("payment not set");
            return;
        }

        p.pay(a);
    }
}

class test {
    public static void main(String[] args) {

        process p = new process();

        card c = new card("1234-5678-9012-3456");
        paypal pp = new paypal("user@paypal.com");
        bitcoin b = new bitcoin("1a1z7agoat3wla7r2yhm2gro58rk6hs6gx");

        p.set(c);
        p.run(100);

        p.set(pp);
        p.run(50);

        p.set(b);
        p.run(75);
    }
}