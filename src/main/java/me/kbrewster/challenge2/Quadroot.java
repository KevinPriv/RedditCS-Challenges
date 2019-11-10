package me.kbrewster.challenge2;

public class Quadroot {
    private int a;
    private int b;

    public Quadroot(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Quadratic getQuadratic() {
        Term a = new Term(1, 2);
        Term b = new Term((-1 * (this.a + this.b)), 1);
        Term c = new Term(this.a * this.b, 0);
        return new Quadratic(a, b, c);
    }
}
