package com.challenge.fastfood.utils;

import com.challenge.fastfood.entities.Client;
import com.challenge.fastfood.entities.Lunch;
import com.challenge.fastfood.entities.LunchItem;
import com.challenge.fastfood.entities.Payment;
import com.challenge.fastfood.interfaceadapters.controller.request.LunchRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestUtils {

    public static Client buildClientMock() {
        var client = EasyRandomUtils.nextObject(Client.class);
        client.setCpf("1".repeat(11));
        return client;
    }

    public static Lunch buildLunchMock() {
        return EasyRandomUtils.nextObject(Lunch.class);
    }

    public static List<Lunch> buildLunchListMock() {
        List<Lunch> lunchList = new ArrayList<>();
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;

        for (int i = 0; i < randomNumber; i++) {
            lunchList.add(buildLunchMock());
        }

        return lunchList;
    }

    public static Payment buildPaymentMock() {
        return EasyRandomUtils.nextObject(Payment.class);
    }

    public static LunchRequest buildLunchRequestMock(boolean isClientIdNull) {
        return new LunchRequest(
                isClientIdNull ? null : 1L,
                List.of(1L,2L),
                List.of(1L,2L),
                List.of(1L,2L),
                List.of(1L,2L)
        );
    }

    public static LunchItem buildLunchItemMock() {
        return EasyRandomUtils.nextObject(LunchItem.class);
    }

    public static List<LunchItem> buildLunchItemListMock() {
        List<LunchItem> lunchItemList = new ArrayList<>();
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;

        for (int i = 0; i < randomNumber; i++) {
            lunchItemList.add(buildLunchItemMock());
        }

        return lunchItemList;
    }
}