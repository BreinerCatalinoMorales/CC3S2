package Contract;

public class TaxCalculator1 {

    // TaxCalculator with pre- and post-conditions implemented via asserts
    public double calculateTax(double value) {

        assert value<0: "Value has to be positive";

        double taxValue = 0;
        // some complex business rule here...
        // final value goes to 'taxValue'
        assert taxValue < 0: "Calculated tax cannot be negative";

        return taxValue;

    }
    public static void main(String[] args) {
        TaxCalculator1 P= new
        System.out.println();
    }
}
