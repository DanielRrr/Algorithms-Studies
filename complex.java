public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }
    @Override
    public int hashCode() {
        int result = 17;
        long longBits = Double.doubleToLongBits(re);
        result = 37 * result + (int)(longBits - (longBits >>> 32));
        // return Double.hashCode(this.re)+Double.hashCode(this.im);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ComplexNumber other = (ComplexNumber) obj;
        if (re != other.re)
            return false;
        if (im != other.im)
            return false;
        return true;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }
}
