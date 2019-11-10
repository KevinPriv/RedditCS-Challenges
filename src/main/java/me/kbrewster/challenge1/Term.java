package me.kbrewster.challenge1;

/**
 * Container holding information about a singular term e.g. 5x, 3x^2, 6
 * #toString allows for the term to be printed.
 */
public class Term {
    private int coefficient;
    private int power;

    public Term(int coefficient, int power) {
        this.coefficient = coefficient;
        this.power = power;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public int getPower() {
        return power;
    }

    public boolean isCoefficientZero() {
        return this.coefficient == 0;
    }

    public boolean isCoefficientOne() {
        return this.coefficient == 1 || this.coefficient == -1;
    }

    public char getOperator() {
        if(this.coefficient >= 0)
            return '+';
        return '-';
    }

    /**
     * Generates the stringified term, in terms of x
     * @return returns absolute term (use #getOperator to receive the sign)
     */
    @Override
    public String toString() {
        String prefix = Integer.toString(Math.abs(this.coefficient));
        String suffix;
        if(this.isCoefficientZero()) {
            return ""; // No term if coefficient is 0
        } else if(this.isCoefficientOne() && this.power != 0) {
            prefix = ""; // the 1/-1 coefficient can be emitted as long as the power is 0
        }
        switch (this.power) {
            case 0: // if power == 0, no x is needed
                suffix = "";
                break;
            case 1: // if power == 1, can be displayed just as x
                suffix = "x";
                break;
            default: // otherwise it can be displayed as x^power
                suffix = "x^" + this.power;
        }

        return prefix + suffix;
    }
}
