package me.kbrewster.challenge2;

public class Quadratic {
    private Term a;
    private Term b;
    private Term c;

    public Quadratic(Term a, Term b, Term c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Quadratic(int a, int b, int c) {
        this.a = new Term(a, 2);
        this.b = new Term(b, 1);
        this.c = new Term(c, 0);
    }

    public Term getTermA() {
        return a;
    }

    public Term getTermB() {
        return b;
    }

    public Term getTermC() {
        return c;
    }

    @Override
    public String toString() {
        String quadratic = "";
        if(a.getOperator() == '-') {
            quadratic += '-';
        }
        quadratic += a.toString();
        if(!b.isCoefficientZero()) {
            quadratic += b.getOperator();
            quadratic += b.toString();
        }
        if(!c.isCoefficientZero()) {
            quadratic += c.getOperator();
            quadratic += c.toString();
        }

        return quadratic + "=0";
    }
}
