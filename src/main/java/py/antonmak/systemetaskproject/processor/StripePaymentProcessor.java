package py.antonmak.systemetaskproject.processor;

import org.springframework.stereotype.Component;

@Component
public class StripePaymentProcessor {
    public boolean pay(float price) {
        return price >= 100;
    }
}
