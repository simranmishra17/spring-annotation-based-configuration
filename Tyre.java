package org.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tyre {

    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override public String toString() {
        return "Tyre{" +
            "brand='" + brand + '\'' +
            '}';
    }
}
