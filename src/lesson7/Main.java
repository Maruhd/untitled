package lesson7;

public class Main {
    public static void main(String[] args) {
        Phone object = new Phone("789456123", "Nokia", "120.6");
        Phone object1 = new Phone("987654321", "Xiaomi", "119.1");
        Phone object2 = new Phone("123456789", "Samsung", "130.7");
        System.out.println(object);
        System.out.println(object1);
        System.out.println(object2);
        System.out.println();
        object.receiveCall("Alex");
        object1.receiveCall("Sokol");
        object2.receiveCall("Bron");
        System.out.println();
        String[] phoneNumber = {
                "234567891",
                "345678912",
                "456789123",
                "567891234",
                "678912345",
                "789123456",
                "891234567",
                "891234577"
        };
        object.sendMessage("25741369", "7531594682", "741369258");
        object.sendMessage("Privet");
        System.out.println();
        object.sendMessage("Alex");
        object1.sendMessage("Sokol", "Privet, gde ti");
        object2.sendMessage("Bron", "Zdarova, che ti?");
    }

}
