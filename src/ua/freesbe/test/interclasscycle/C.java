package ua.freesbe.test.interclasscycle;


public class C {
    public static void main(String[] args) {
        System.out.println(D.b());
    }
}

class E {
    public static int a = D.b();
    public static int c() {return 1;}
}

class D {
    public static int b() { return  E.c();}
}
