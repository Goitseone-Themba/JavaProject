//21000539 Goitseone Themba
package Lab3;

public class car {
    private String make = "";
    private  String model = "";
    private  String mileage = "";
    private String color = "";
    private Boolean insured = false;
    public car() {
        String make = "";
        String model = "";
        String mileage = "";
        String color = "";
        Boolean insured = false;
    }
    public car(String make, String model, String mileage, String color, Boolean insured) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.color = color;
        this.insured = insured;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }

    public String getMileage() {
        return mileage;
    }

    public String getColor() {
        return color;
    }

    public Boolean getInsured() {
        return insured;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setInsured(Boolean insured) {
        this.insured = insured;
    }

    @Override
    public String toString() {
        return "Make: " + make + "\nModel: " + model +
                "\nMileage: " + mileage + "\nColor " + color +
                "\nInsured: " + insured ;
    }
}
