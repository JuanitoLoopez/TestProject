package payments;

public interface PaymentGateway {

    PaymentResponse requiredPayment(PaymentRequest request);
}
