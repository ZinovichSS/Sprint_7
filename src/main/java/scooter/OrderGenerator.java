package scooter;

import models.Order;
import org.apache.commons.lang3.RandomStringUtils;


public class OrderGenerator {
    public static Order exampleOrder(){
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String address = "Lenina, 142 apt.";
        String metroStation = "Mayakovskaya";
        String phone = "89111111111";
        int rentTime = 45;
        String deliveryDate = "2023-07-30";
        String comment = "At the bus stop";
        String[] color = new String[]{"BLACK","GREY"};
        return new Order(firstName, lastName, address, metroStation, phone, rentTime, deliveryDate, comment, color);
    }
}
