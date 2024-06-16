public class Main {

    public static void main(String[] args) {
        // Przykładowe wywołanie metody solveEquation
        double[] roots = solveEquation(1, -3, 2);
        if (roots != null) {
            for (double root : roots) {
                System.out.println("Root: " + root);
            }
        } else {
            System.out.println("No real roots.");
        }
    }

    public static double[] solveEquation(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("Coefficient 'a' must not be zero.");
        }

        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return new double[]{root1, root2};
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            return null; // brak pierwiastków rzeczywistych
        }
    }
}
