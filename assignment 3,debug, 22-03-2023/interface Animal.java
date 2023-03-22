interface Animal {
    void eat();
}

interface Dog extends Animal {
    void bark();
}

class BabyDog implements Dog {
    public void eat() {
        System.out.println("eating...");
    }
    public void bark() {
        System.out.println("barking...");
    }
    public void weep() {
        System.out.println("weeping...");
    }
}

class TestInheritance2 {
    public static void main(String args[]) {
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}
