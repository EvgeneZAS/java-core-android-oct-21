package JavaCore;
//Lesson1
public class Lesson1 {
    public static void main(String[] args) {
        System.out.println(exc1(4f,5f,10f,2f));
        System.out.println(exc2(5,5));
        exc3(4);
        System.out.println(exc4(-5));
        exc5("Паша");
    }

    //1
     public static float exc1(float a, float b, float c, float d) {
        float e = a * (b + (c / d));
        return e;
    }

    //2
    public static boolean exc2(int a, int b) {
        int c = a + b;
        boolean d = (c <= 20) && (c >= 10);
        return d;
    }

    //3
    public static void exc3(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }

    }
    //4
    public static boolean exc4(int a) {
        if (a < 0) {
            return true;
        } return false;
    }
    //5
    public static void exc5(String name) {
        System.out.println("Привет, " + name);
    }

}


