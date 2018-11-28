package Domain.Payment;

public class DirectPayment extends Payment{
    private String id;
    private BetaalType betaalType;

    public enum BetaalType{
        DEBET, CREDIT
    }
}
