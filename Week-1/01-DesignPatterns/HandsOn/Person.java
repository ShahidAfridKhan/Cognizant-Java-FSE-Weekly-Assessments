package com.cognizant.designpatterns;

public class person{
    private String fn,ln,email,phone,addr;
    private int age;

    private person(build b){
        fn=b.fn;
        ln=b.ln;
        age=b.age;
        email=b.email;
        phone=b.phone;
        addr=b.addr;
    }

    public String toString(){
        return "person{fn='"+fn+"', ln='"+ln+"', age="+age+", email='"+email+"', phone='"+phone+"', addr='"+addr+"'}";
    }

    static class build{
        private String fn,ln,email,phone,addr;
        private int age;

        public build(String fn,String ln){
            this.fn=fn;
            this.ln=ln;
        }

        public build age(int age){
            this.age=age;
            return this;
        }

        public build email(String email){
            this.email=email;
            return this;
        }

        public build phone(String phone){
            this.phone=phone;
            return this;
        }

        public build addr(String addr){
            this.addr=addr;
            return this;
        }

        public person get(){
            return new person(this);
        }
    }
}

class test{
    public static void main(String[] args){
        person p=new person.build("john","doe")
                .age(30)
                .email("john@example.com")
                .phone("123-456-7890")
                .addr("123 main st")
                .get();

        System.out.println(p);
    }
}