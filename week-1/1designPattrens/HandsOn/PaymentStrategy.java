package com.cognizant.designpatterns;

public interface pay{
    void pay(double amt);
}
class card implements pay{
    private String no;
    public card(String no){
        this.no=no;
    }
    public void pay(double amt){
        System.out.println("paid "+amt+" using card: "+no);
    }
}
class paypal implements pay{
    private String mail;
    public paypal(String mail){
        this.mail=mail;
    }
    public void pay(double amt){
        System.out.println("paid "+amt+" using paypal: "+mail);
    }
}
class bitcoin implements pay{
    private String addr;
    public bitcoin(String addr){
        this.addr=addr;
    }
    public void pay(double amt){
        System.out.println("paid "+amt+" using bitcoin: "+addr);
    }
}
class process{
    private pay p;
    public void set(pay p){
        this.p=p;
    }
    public void run(double amt){
        if(p==null){
            System.out.println("payment not set");
            return;
        }
        p.pay(amt);
    }
}
class test{
    public static void main(String[] args){
        process p=new process();

        p.set(new card("1234-5678-9012-3456"));
        p.run(100);

        p.set(new paypal("user@paypal.com"));
        p.run(50);

        p.set(new bitcoin("1A1z7agoat3WLa7R2Yhm2gro58Rk6Hs6gX"));
        p.run(75);
    }
}