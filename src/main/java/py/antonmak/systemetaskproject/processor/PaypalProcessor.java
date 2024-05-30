package py.antonmak.systemetaskproject.processor;

import org.springframework.stereotype.Component;

@Component
public class PaypalProcessor {
    public void makePayment(int price) throws RuntimeException {
        if (price > 100_000) {
            throw new RuntimeException();
        }
    }
}
