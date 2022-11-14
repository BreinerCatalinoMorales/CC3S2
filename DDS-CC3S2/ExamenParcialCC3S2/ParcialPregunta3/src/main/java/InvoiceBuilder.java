import java.math.BigDecimal;

public class InvoiceBuilder {
    private String country = "NL";
    private CustomerType customerType;
    private double value = 500;

    public InvoiceBuilder withCountry(String country) {
        this.country = country;
        return this;
    }

    public InvoiceBuilder asCompany() {
        CustomerType tipe = new CustomerType("PERSON");
        this.customerType = tipe;
        return this;
    }

    public InvoiceBuilder withAValueOf(double value) {
        this.value = value;
        return this;
    }

    public Invoice build() {
        return new Invoice(new BigDecimal(value), country, customerType);
    }

    public static void main(String[] args) {
        InvoiceBuilder invoiceBuilder = new InvoiceBuilder();
        Invoice invoice = new InvoiceBuilder()
                .asCompany()
                .withAValueOf(1203)
                .withCountry("PE")
                .build();
    }
}
