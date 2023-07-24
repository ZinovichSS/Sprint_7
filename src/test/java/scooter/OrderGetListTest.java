package scooter;

import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import io.restassured.response.ValidatableResponse;
import models.Order;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class OrderGetListTest {

    private OrderClient oc;
    private List<Order> orderList;

    @Before
    public void setUp(){
        oc = new OrderClient();
        orderList = new ArrayList<Order>();
    }

    @Test
    @DisplayName("Получение списка заказов")
    @Description("Проверяется возможность получения спика заказов")
    public void ordersListCanBeReturnedSuccess() {
        ValidatableResponse getOrdersResponse = oc.getOrders();

        int statusCode = getOrdersResponse.extract().statusCode();
        orderList = getOrdersResponse.extract().path("orders");

        assertThat(orderList.size(), greaterThan(0) );
        assertEquals(200, statusCode);
    }

}
