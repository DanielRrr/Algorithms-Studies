   public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double dx = (b - a);
        double sum0;
        double sum1 = f.applyAsDouble(a) * (b - a);
        int it = 1;

        do {
            dx /= 2.;
            it *= 2;
            sum0 = sum1;
            sum1 = .0;

            for (double x = a, eps = dx / 2.; x + eps < b; x += dx) {
                sum1 += dx * f.applyAsDouble(x);
            }
        } while (Math.abs(sum0 - sum1) > 0.0001 && it < 100000000);

        return sum1;
    }
