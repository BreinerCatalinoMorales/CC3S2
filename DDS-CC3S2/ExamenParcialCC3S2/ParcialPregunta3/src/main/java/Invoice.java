import java.math.BigDecimal;
public class Invoice {
    private final BigDecimal value;
    private final String country;
    private final CustomerType customerType;

    public Invoice( BigDecimal value , String country, CustomerType customerType) {
        this.value = value;
        this.country = country;
        this.customerType = customerType;
    }

    public BigDecimal calculate() {
        double ratio = 0.1;
        return value.multiply(BigDecimal.valueOf(ratio));
    }
}
