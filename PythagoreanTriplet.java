import java.util.List;
import java.util.ArrayList;
class PythagoreanTriplet {
    private final int a;
    private final int b;
    private final int c;
    public PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public static Builder makeTripletsList() {
        return new Builder();
    }
    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (other == this) {
            return true;
        }
        if (other instanceof PythagoreanTriplet) {
            var o = (PythagoreanTriplet) other;
            return a == o.a && b == o.b && c == o.c;
        }
        return false;
    }
   
    public static class Builder {
        private int maxFactor;
        private int sum;
        
        public Builder withFactorsLessThanOrEqualTo(int maxFactor) {
            this.maxFactor = maxFactor;
            return this;
        }
        public Builder thatSumTo(int sum) {
            this.sum = sum;
            return this;
        }
        public List<PythagoreanTriplet> build() {
            var list = new ArrayList<PythagoreanTriplet>();
            
            for (int a = 1; a <= maxFactor / 2; ++a) {
                for (int b = a + 1; b <= maxFactor / 2; ++b) {
                    int c = sum - (a + b);
                    if (c > b && a * a + b * b == c * c) {
                        list.add(new PythagoreanTriplet(a, b, c));
                    }
                }
            }
            
            return list;
        }
    }
}
