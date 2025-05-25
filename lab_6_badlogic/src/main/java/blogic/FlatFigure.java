package blogic;

public class FlatFigure {
    double a, b, c, d;
    int al, bet;

    public FlatFigure(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        FFHelp.validateTriangle(a, b, c);
    }

    public FlatFigure(double a, double b, int alfa) {
        this.a = a;
        this.b = b;
        this.al = alfa;
        this.c = FFHelp.calculateTriangleSide(a, b, alfa);
    }

    public FlatFigure(double a, int alfa) {
        this.a = a;
        this.b = a;
        this.c = a;
        this.d = a;
        this.al = alfa;
        this.bet = 180 - alfa;
    }

    public FlatFigure(double a, double b, int alfa, int betta) {
        this.a = a;
        this.b = b;
        this.c = a;
        this.d = b;
        this.al = alfa;
        this.bet = betta;
        FFHelp.validateParallelogram(alfa, betta);
    }

    public double area() {
        if (FFHelp.isTriangle(a, b, c, d)) {
            return FFHelp.triangleArea(a, b, c, al);
        } else if (FFHelp.isRectangle(a, b, c, d, al, bet)) {
            return FFHelp.rectangleArea(a, b);
        } else if (FFHelp.isParallelogram(a, b, c, d, al, bet)) {
            return FFHelp.parallelogramArea(a, b, al);
        } else if (FFHelp.isRhombus(a, b, c, d, al, bet)) {
            return FFHelp.rhombusArea(a, al);
        }
        return 0;
    }
}