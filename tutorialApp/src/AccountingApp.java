class Accounting {
    public double vos;
    public double vatRate;
    public double expenseRate;
    public double getVat() {
        return vos*vatRate;

    }public double getTotal() {
        return vos + getVat();
    }
    public double getExpense() {
        return vos*expenseRate;
    }
    public double getIncome() {
        return vos - getExpense();
    }
    public String getdividendRates () {
        String output= "";
        double[] dividendRates = new double[3];
        dividendRates[0] = 0.5;
        dividendRates[1] = 0.3;
        dividendRates[2] = 0.2;
        int i = 0;
        int temp = 1;
        while (i < 3) {
            System.out.println("Dividend"+temp+" : " + getIncome()*dividendRates[i]);
            i++;
            temp++;
        }
        return output;
    }
    public void print() {
        System.out.println("Value of supply: " + vos);
        System.out.println("VAT :" + getVat());
        System.out.println("Total :" + getTotal());
        System.out.println("Expense :" + getExpense());
        System.out.println("Income :" + getIncome());
        System.out.println(getdividendRates());
    }
}
public class AccountingApp {
    public static void main(String[] args) {
//        if (income > 10000.0) {
//            dividend1 = income * dividendRates[0];
//            dividend2 = income * dividendRates[1];
//            dividend3 = income * dividendRates[2];
//            } else {
//            dividend1 = income * dividendRates[3];
//            dividend2 = income * dividendRates[4];
//            dividend3 = income * dividendRates[4];
//        }
        Accounting a1 = new Accounting();
        a1.vos = 10000.0;
        a1.vatRate = 0.1;
        a1.expenseRate = 0.3;
        a1.print();
    }
}
