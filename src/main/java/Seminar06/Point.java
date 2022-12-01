package Seminar06;

public class Point {
    int x;
    int y;


    public String toCoord() {
        return "x: " + x + "\ny: " + y;
    }

    public static void main(String[] args) {
        Point point = new Point();
        point.x = 5;
        point.y = 3;

        //System.out.println(point.x + " " + point.y);
        System.out.println(point.toCoord());
    }
}
