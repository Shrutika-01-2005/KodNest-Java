class Demo {

    static {
        System.out.println("1st static-Block executed.");
    }

    static {
        System.out.println("2nd static-Block executed.");
    }

    static {
        System.out.println("3rd static-Block executed.");
    }

    {
        if (this != null) {
            System.out.println("1st NONstatic-Block executed.");
        }
    }

    {
        if (this != null) {
            System.out.println("2nd NONstatic-Block executed.");
        }
    }

    {
        if (this != null) {
            System.out.println("3rd NONstatic-Block executed.");
        }
    }
}

public class pgm7 {

    public static void main(String[] args) {
        Demo[] demos = { new Demo(), new Demo(), new Demo(), new Demo() };
        System.out.println("Total objects created: " + demos.length);
    }
}
