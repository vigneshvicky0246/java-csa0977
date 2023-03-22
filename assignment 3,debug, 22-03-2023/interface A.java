interface A {
    void msg();
}

interface B {
    void msg();
}

class C implements A, B {
    public void msg() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        C obj = new C();
        obj.msg(); // This will call the msg() method implemented in class C.
    }
}
