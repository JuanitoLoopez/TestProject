package payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {
    private PaymentGateway paymentGateway;
    private  PaymentProcessor paymentProcessor;

    @Before
    public void setup() {
        // Preparación del escenario. Juntando las partes comunes en un método.
        paymentGateway = Mockito.mock(PaymentGateway.class);
        paymentProcessor = new PaymentProcessor(paymentGateway);
    }

    @Test
    public void payment_is_correct() {
        //Preparación del escenario. Preparamos los objetos que queremos utilizar en el test.
        Mockito.when(paymentGateway.requiredPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        //Ejecución del método, Llamada al metodo que queremos probar. Y comprobación del resultado.
        assertTrue(paymentProcessor.makePayment(1000));
    }
    @Test
    public void payment_is_wrong() {
        Mockito.when(paymentGateway.requiredPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        assertFalse(paymentProcessor.makePayment(1000));
    }

}