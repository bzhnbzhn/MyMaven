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

    public double getLength(int x, int y, int z) {
        return (Math.sqrt(x * x + y * y + z * z));
    }

    public double getLength(double x, double y, double z) {
        return (Math.sqrt(x * x + y * y + z * z));
    }

    public static double getScalarMultiplication(Vector vector1, Vector vector2) {
        return (vector1.x * vector2.x + vector2.y * vector2.y + vector2.z * vector2.z);
    }

    public static List<Vector> getRandomVectors(){
        List vectors = new ArrayList<>();
        int random = (int) (Math.random() * 10);
        for (int i = 0; i<random; i++){
            vectors.add(new Vector((int) Math.random() * 10,(int) Math.random() * 10,(int) Math.random() * 10));
        }
        return vectors;
    }
}

