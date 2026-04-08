class Demo {   // NOT public

    private final int privateVar = 10;
    int defaultVar = 20;
    public int publicVar = 30;
    protected int protectedVar = 40;

    public void show() {
        System.out.println(privateVar);
        System.out.println(defaultVar);
        System.out.println(publicVar);
        System.out.println(protectedVar);
    }
}

public class AccessModifiers {   // file name MUST match this
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
    }
}