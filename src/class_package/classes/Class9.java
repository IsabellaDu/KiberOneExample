package class_package.classes;

public class Class9 {
    public static void main(String[] args) {

        System.out.println(sum(2, 3, 5));
        System.out.println(sum(2.2, 3.3));
        System.out.println(sum(2, 3));

    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int sum(int x, int y, int z) {
        return x + y + z;
    }

    public static int sum(double x, double y) {
        return (int) (x + y);
    }

    public static int volume(int a, int b, int h) {
        return a * b * h;
    }
}

