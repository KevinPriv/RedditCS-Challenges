package me.kbrewster.challenge4;


import java.util.ArrayList;
import java.util.Stack;

public class Polyroot {

    Polynomial polynomial;

    public Polyroot(int[] polyroots) {
        ArrayList<Term> terms = new ArrayList<>();
        boolean negative = false;
        terms.add(new Term(1, polyroots.length));
        for(int i = 0; i < polyroots.length; i++) {
                Term nextTerm = new Term(0, polyroots.length - i);
                for(int inner = 0; inner < polyroots.length; inner++) {
                    for (int outer = inner + 1; outer < polyroots.length; outer++) {
                        nextTerm.setCoefficient(nextTerm.getCoefficient() + (inner * outer));
                    }
            }
            negative = !negative;

        }
    }

    @Override
    public String toString() {
        return polynomial.toString();
    }
}
