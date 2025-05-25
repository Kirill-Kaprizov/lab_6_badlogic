package blogic;

public class FFHelp {
    public static boolean isTriangle(double a, double b, double c, double d) {
        return d == 0 && (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static boolean isRectangle(double a, double b, double c, double d, int al, int bet) {
        return al == 90 && bet == 90 && a == c && b == d;
    }

    public static boolean isParallelogram(double a, double b, double c, double d, int al, int bet) {
        return al + bet == 180 && a == c && b == d;
    }

    public static boolean isRhombus(double a, double b, double c, double d, int al, int bet) {
        return a == b && b == c && c == d && al + bet == 180;
    }

    public static double triangleArea(double a, double b, double c, int al) {
        if (al == 90) {
            return 0.5 * a * b;
        } else {
            double p = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
    }

    public static double rectangleArea(double a, double b) {
        return a * b;
    }

    public static double parallelogramArea(double a, double b, int al) {
        return a * b * Math.sin(al * Math.PI / 180);
    }

    public static double rhombusArea(double a, int al) {
        return a * a * Math.sin(al * Math.PI / 180);
    }

    public static void validateTriangle(double a, double b, double c) {
        if (c < a + b && b < c + a && a < c + b) {
            System.out.println("ok Triangle");
        } else {
            System.out.println("bad Triangle");
        }
    }

    public static void validateParallelogram(int al, int bet) {
        if (al + bet == 180) {
            System.out.println("ok Parallelogram");
        } else {
            System.out.println("bad Parallelogram");
        }
    }

    public static double calculateTriangleSide(double a, double b, int al) {
        if (al == 90) {
            return Math.sqrt(a * a + b * b);
        } else {
            return Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(al * Math.PI / 180));
        }
    }
}