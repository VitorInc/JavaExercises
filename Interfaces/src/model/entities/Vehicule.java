package model.entities;

import java.util.Objects;

public class Vehicule {
    private String model;

    public Vehicule() {}

    public Vehicule(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicule:" +
                "model='"  +
                model      +
                '\''       +
                '}';
    }
}
