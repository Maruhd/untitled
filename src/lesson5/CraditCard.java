package lesson5;

public class CraditCard {
   private int numbersCard;
    private String currentSum;

    public CraditCard(String currentSum, int numbersCard) {
        this.currentSum = currentSum;
        this.numbersCard = numbersCard;
    }

    public int getNumbersCard() {
        return numbersCard;
    }

    public String getCurrentSum() {
        return currentSum;
    }

    public void setNumbersCard(int numbersCard) {
        this.numbersCard = numbersCard;
    }

    public void setCurrentSum(String currentSum) {
        this.currentSum = currentSum;
    }

    int charge(int add) {
        if (add > 0) {
            System.out.println("Charge sum equals" + add);
        } else {
            System.out.println("Invalid charge sum");
        }
        int charge = numbersCard + add;
        numbersCard = charge;
        System.out.println();
        return numbersCard;
    }

    int withdraw(int del) {
        if (del > 0 && del <= numbersCard) {
            System.out.println("Withdraw sum equals" + del);
        } else {
            System.out.println("Invalid withdraw sum");
        }
        int withdraw = numbersCard - del;
        numbersCard = withdraw;
        System.out.println();
        return numbersCard;
    }

    void showCurrentInfo() {
        System.out.println("Current sum of your credit card is " + currentSum);
        System.out.println("Bill number of your credit card is " + numbersCard);
        System.out.println();
    }
}


