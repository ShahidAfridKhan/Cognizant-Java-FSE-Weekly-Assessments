package com.cognizant.designpatterns;

class person {

    private String fn, ln, em, ph, ad;
    private int ag;

    private person(build b) {
        fn = b.fn;
        ln = b.ln;
        ag = b.ag;
        em = b.em;
        ph = b.ph;
        ad = b.ad;
    }

    public String toString() {
        return "name: " + fn + " " + ln +
                ", age: " + ag +
                ", email: " + em +
                ", phone: " + ph +
                ", address: " + ad;
    }

    static class build {

        private String fn, ln, em, ph, ad;
        private int ag;

        public build(String fn, String ln) {
            this.fn = fn;
            this.ln = ln;
        }

        public build age(int ag) {
            this.ag = ag;
            return this;
        }

        public build email(String em) {
            this.em = em;
            return this;
        }

        public build phone(String ph) {
            this.ph = ph;
            return this;
        }

        public build addr(String ad) {
            this.ad = ad;
            return this;
        }

        public person get() {
            return new person(this);
        }
    }
}

class test {

    public static void main(String[] args) {

        person p = new person.build("john", "doe")
                .age(30)
                .email("john@example.com")
                .phone("123-456-7890")
                .addr("123 main st")
                .get();

        System.out.println(p);
    }
}