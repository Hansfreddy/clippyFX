package ch.ucreek;

public class Boundaries {

    private int lower;
    private int upper;

    public Boundaries(int lower, int upper) {
        this.lower = lower;
        this.upper = upper;
    }

    public int getLower() {
        return lower;
    }

    public int getUpper() {
        return upper;
    }

    public boolean contained(int x) {
        return x >= lower && x <= upper;
    }

}
