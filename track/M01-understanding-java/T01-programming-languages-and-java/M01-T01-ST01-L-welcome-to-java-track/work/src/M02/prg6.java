
public class Demo {

    static int count = 0;

    Demo() {
        count++;
    }
}

public class prg6 {

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();
        Demo d4 = new Demo();

        System.out.println("Num of Objects " + Demo.count);
    }
}
