public class CreditPaymentService {
    public int calculate(int SumCredit, float AnnualRate, int Months) {
        int MonthPay;
        float MonthRate;
        MonthRate = AnnualRate / (100 * 12);
        MonthPay = (int) (SumCredit * MonthRate / (1 - Math.pow(1 + MonthRate, -Months)));
        return (MonthPay);
    }

    ;
}
