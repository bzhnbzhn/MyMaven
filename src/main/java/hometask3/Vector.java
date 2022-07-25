package hometask3;

import java.util.ArrayList;
import java.util.List;

public class Vector {
    private int x;
    private int y;
    private int z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "x = " + this.x + " y = " + this.y + " z = " + this.z;
    }

    public Vector() {
        this.x = getRandomCoordinate();
        this.y = getRandomCoordinate();
        this.z = getRandomCoordinate();
    }

    public static int getRandomCoordinate() {
        return (int) (Math.random() * 10);
    }

    public double getLength() {
        return (Math.sqrt(x * x + y * y + z * z));
    }

    public static double getScalarMultiplication(Vector vector1, Vector vector2) {
        return (vector1.x * vector2.x + vector2.y * vector2.y + vector2.z * vector2.z);
    }

    public static double getScalarMultiplication() {
        List<Vector> vectors = getRandomVectors(2);
        return getScalarMultiplication(vectors.get(0), vectors.get(1));
    }

    public static List<Vector> getRandomVectors(int size) {
        List<Vector> vectors = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            vectors.add(new Vector());
        }
        return vectors;
    }

    public static void main(String[] args) {
        System.out.println(Vector.getScalarMultiplication());
    }
}


