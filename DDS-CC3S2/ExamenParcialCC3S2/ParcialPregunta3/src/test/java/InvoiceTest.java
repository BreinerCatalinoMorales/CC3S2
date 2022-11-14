import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


import java.math.BigDecimal;


public class InvoiceTest {
    @Test
    void TestInvoice() {
        CustomerType tipe=new CustomerType("COMPANY");
        Invoice invoice = new Invoice(new BigDecimal("2500"),"NL", tipe);
        BigDecimal v = invoice.calculate();
        assertEquals(new BigDecimal(250),v);
    }

}