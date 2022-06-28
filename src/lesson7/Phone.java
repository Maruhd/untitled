package lesson7;

import java.sql.SQLInvalidAuthorizationSpecException;

public class Phone {
    private String number;
    private String model;
    private String weight;

    public Phone() {
    }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(String number, String  model, String weight) {
        this.model = model;
        this.number = number;
        this.weight = weight;
    }
    public void receiveCall(String name) {
        System.out.println("Calling you " + name);
    }
    public void receiveCall(String name, String number) {
        System.out.println("Calling you " + " " + name + " " + number);
    }
    public void sendMessage(String message) {
        System.out.println("Message send to " + message);
    }
    public void sendMessage(String number, String number1, String number2) {
        System.out.println("There phone numbers " + number + " " + number1 + " " + number2);
    }
    public  void sendMessage(String name, String message) {
        System.out.println("Message send to " + name + " " + "Message text" + message);
    }
    public String getNumber() {
        return number;
    }
    public String setNumber() {
        this.number = number;
        return null;
    }
    public String getModel() {
        return model;
    }
    public String setModel() {
        this.model = model;
        return null;
    }
    public String getWeight() {
        return weight;
    }
    public String setWeight() {
        this.weight = weight;
        return null;
    }
    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
