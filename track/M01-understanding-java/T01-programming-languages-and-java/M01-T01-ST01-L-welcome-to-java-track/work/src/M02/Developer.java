
public class Developer {

    void work() {
        System.out.println("Developer working");
    }

    void project() {
        System.out.println("Developer doing project");
    }

    public static void main(String[] args) {
        JavaDeveloper jd = new JavaDeveloper();
        accessMethod(jd);

        PythonDeveloper pd = new PythonDeveloper();
        accessMethod(pd);
    }

    public static void accessMethod(Developer dev) {
        dev.work();
        dev.project();
    }
}

class JavaDeveloper extends Developer {

    @Override
    void work() {
        System.out.println("JavaDeveloper working");
    }

    @Override
    void project() {
        System.out.println("JavaDeveloper doing project");
    }
}

class PythonDeveloper extends Developer {

    @Override
    void work() {
        System.out.println("PythonDeveloper working");
    }

    @Override
    void project() {
        System.out.println("PythonDeveloper doing project");
    }
}
