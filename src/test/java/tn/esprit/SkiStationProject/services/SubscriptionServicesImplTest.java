package tn.esprit.SkiStationProject.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import tn.esprit.SkiStationProject.entities.Subscription;
import tn.esprit.SkiStationProject.entities.enums.TypeSubscription;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@SpringBootTest
class SubscriptionServicesImplTest {
    @Autowired
    private SubscriptionServicesImpl subscriptionServicesImpl;

    @Test
    public void testAddSubscription() {
        // Create a Subscription object and set its properties
        Subscription subscription = new Subscription();
        subscription.setTypeSub(TypeSubscription.ANNUAL); // Replace with your SubscriptionType enum
        LocalDate startDate = LocalDate.now();
        subscription.setStartDate(startDate);

        // Act
        Subscription addedSubscription = subscriptionServicesImpl.addSubscription(subscription);

        // Assert
        // Verify that the correct end date is set based on the subscription type
        LocalDate expectedEndDate = startDate.plusYears(1);
        assertEquals(expectedEndDate, addedSubscription.getEndDate());

        // You can add more assertions as needed
    }

}