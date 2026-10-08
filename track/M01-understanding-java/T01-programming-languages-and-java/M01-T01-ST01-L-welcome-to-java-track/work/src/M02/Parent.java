
public class Parent {

    void display1() {
        System.out.println("Inside Parent display1");
    }

    void display2() {
        System.out.println("Inside Parent display2");
    }

    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.display1();
        c1.display2();
        c1.display3();

        Child2 c2 = new Child2();
        c2.display1();
        c2.display2();
        c2.display4();

        Child3 c3 = new Child3();
        c3.display1();
        c3.display2();
        c3.display5();
    }
}

class Child1 extends Parent {

    @Override
    void display1() {
        System.out.println("Inside Child1 display1");
    }

    void display3() {
        System.out.println("Inside Child1 display3");
    }
}

class Child2 extends Parent {

    @Override
    void display2() {
        System.out.println("Inside Child2 display2");
    }

    void display4() {
        System.out.println("Inside Child2 display4");
    }
}

class Child3 extends Parent {

    @Override
    void display2() {
        System.out.println("Inside Child3 display2");
    }

    void display5() {
        System.out.println("Inside Child3 display5");
    }
}
