package p2;

public class TestVector {
    public static void main(String[] args) {

        System.out.println("1. Test Vector class:");
        Vector v1 = new Vector();
        System.out.println("Default vector - x: " + v1.getX() + ", y: " + v1.getY() + ", z: " + v1.getZ());

        Vector v2 = new Vector(1, 2, 3);
        System.out.println("Vector with values (1,2,3) - x: " + v2.getX() + ", y: " + v2.getY() + ", z: " + v2.getZ());

        v1.setX(4);
        v1.setY(5);
        v1.setZ(6);
        System.out.println(
                "Vector after setting values (4,5,6) - x: " + v1.getX() + ", y: " + v1.getY() + ", z: " + v1.getZ());

        System.out.println();

        System.out.println("2. Test vector operations:");
        Vector sum = v1.add(v2);
        System.out.println("Addition result - x: " + sum.getX() + ", y: " + sum.getY() + ", z: " + sum.getZ());

        Vector diff = v1.subtract(v2);
        System.out.println("Subtraction result - x: " + diff.getX() + ", y: " + diff.getY() + ", z: " + diff.getZ());

        Vector scaled = v2.multiply(2);
        System.out.println(
                "Multiply by 2 result - x: " + scaled.getX() + ", y: " + scaled.getY() + ", z: " + scaled.getZ());

        double dotProd = v1.dotProduct(v2);
        System.out.println("Dot product result: " + dotProd);
    }
}