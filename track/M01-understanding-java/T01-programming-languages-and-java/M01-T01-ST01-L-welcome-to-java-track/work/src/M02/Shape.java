
interface Shape {
    public abstract void input();

    public abstract void disp();

    public static void main(String[] args) {
        Square s = new Square();
        s.input();
        s.disp();
        //Shape ref = new Shape();//Error

        Shape ref;

        ref = s;
        ref.input();
        ref.disp();
    }
}

class Square implements Shape {

    @Override
    public void input() {
        System.out.println("Input");
    }

    @Override
    public void disp() {
        System.out.println("disp");
    }
}
