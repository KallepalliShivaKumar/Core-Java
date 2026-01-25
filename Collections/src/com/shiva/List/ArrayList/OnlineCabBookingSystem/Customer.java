package com.shiva.List.ArrayList.OnlineCabBookingSystem;

public record Customer(
        int custId,
        String customerName,
        String pickupLocation,
        String dropLocation,
        int distance,
        String phone
) {
    public Customer {
        if (custId <= 0) {
            throw new IllegalArgumentException("Id must be positive.");
        }

        if (customerName == null || customerName.isBlank()) {
            throw new IllegalArgumentException("Customer name must not be null or empty.");
        }

        if (pickupLocation == null || pickupLocation.isBlank()) {
            throw new IllegalArgumentException("Pickup location must not be null or empty.");
        }

        if (dropLocation == null || dropLocation.isBlank()) {
            throw new IllegalArgumentException("Drop location must not be null or empty.");
        }

        if (distance <= 0) {
            throw new IllegalArgumentException("Distance must be greater than zero.");
        }

        if (phone == null || !phone.matches("\\d{10}")) {
            throw new IllegalArgumentException(
                "Validation Error: Phone number must be 10 digits only"
            );
        }
    }
}
