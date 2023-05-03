public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int SumCredit = 1_000_000;
        float AnnualRate = 9.99F;
        int Months = 12;
        int MonthPay = service.calculate(SumCredit, AnnualRate, Months);
        System.out.println("Ваш ежемесячный платеж составит " + MonthPay + " рубля (-ей)");
    }
}