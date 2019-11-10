package me.kbrewster.challenge3;

public class Polynomial {
    private Term[] polynomial;

    public Polynomial(Term[] polynomial) {
        this.polynomial = polynomial;
    }

    public Polynomial(int[] polynomial) {
        this.polynomial = new Term[polynomial.length];
        if(polynomial.length == 1)
            throw new Error("Cannot create a polynomial of length 1");
        if(polynomial[0] == 0)
            throw new Error("Cannot start polynomial with 0");
        for (int i = 0; i < polynomial.length; i++) {
            this.polynomial[i] = new Term(polynomial[i], (polynomial.length - 1) - i);
        }
    }

    @Override
    public String toString() {
        StringBuilder polynomial = new StringBuilder();
        for (int i = 0; i < this.polynomial.length; i++) {
            String term = this.polynomial[i].toString();
            if(!(term.equals("") || (this.polynomial[i].getOperator() == '+' && i == 0))) {
                polynomial.append(this.polynomial[i].getOperator());
            }
            polynomial.append(term);

        }
        polynomial.append("=0");
        return polynomial.toString();
    }
}
