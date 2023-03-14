package methodoverloading;

public class IntroToOverloading {
    public int getPerimetOfSquare(double length, double width) {
        return (int) (length + width) * 2;
    }

    public int getPerimetOfSquare(int length, int width) {
        return (int) (length + width) * 2;
    }

    public int getPerimetOfSquare(long length, long width) {
        return (int) (length + width) * 2;
    }
}








