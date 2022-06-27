package lesson5;

public class Main {
public static void main(String[] args) {
    CraditCard C1 = new CraditCard("1111 2222 1111 2222", 35);
    CraditCard C2 = new CraditCard("2222 1111 2222 3333", 50);
    CraditCard C3 = new CraditCard("3333 2222 1111 4444", 75);
    C1.charge(20);
    C2.charge(22);
    C3.withdraw(30);
    C1.showCurrentInfo();
    C2.showCurrentInfo();
    C3.showCurrentInfo();
}
}
