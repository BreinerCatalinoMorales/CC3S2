package Contract;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class Basket {
    private BigDecimal totalValue = BigDecimal.ZERO;
    private Map<Product, Integer> basket = new HashMap< >();

    public void add(Product product, int qtyToAdd) {
     // Basket 's add method with its pre-conditions
        if(product.getPrice().compareTo(totalValue)==-1) {
            throw new RuntimeException("Value has to be positive");
        }
    // add the product
        basket.put(,12);

    // update the total value
    // ...
    // Post-condition ensuring that products was added to the cart
        if(qtyToAdd<0) {
            throw new RuntimeException("Calculated cannot be negative");
    }
    public void remove(Product product) {
    // Pre- and post-conditions for the remove method
    // remove the product from the basket
    // update the total value
    }
    private boolean invariant() {
        return totalValue.compareTo(BigDecimal.ZERO) >= 0;
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }

    public int quantityOf(Product product) {
        assert basket.containsKey(product);
        return basket.get(product);
    }

    public Set<Product> products() {
        return Collections.unmodifiableSet(basket.keySet());
    }
    @Override
    public String toString() {
        return "BasketCase{" +
                "totalValue=" + totalValue +
                ", basket=" + basket +
                '}';
    }
}
