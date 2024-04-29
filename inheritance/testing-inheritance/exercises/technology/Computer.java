public class Computer {
    //properties
    //manufacturer
    private String manufacturer;
    //model
    private String model;
    // price
    private double price;
    //isOn
    private boolean on = true;

    public Computer(String aManufacturer, String aModel, double aPrice){
        manufacturer = aManufacturer;
        model = aModel;
        price = aPrice;
    }
    /**** Getters and Setters ****/
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String aManufacturer) {
       manufacturer = aManufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String aModel) {
        model = aModel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double aPrice) {
       price = aPrice;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean aOn) {
        on = aOn;
    }
/**** Instance Methods ****/
    //    methods: turnOn(), and turnOff()

    public void turnOn() {

        if (!on) {
            System.out.println("Device is powering on");
            on = true;
        } else {
            System.out.println("Device is already powered on.");

        }
    }
    public void turnOff() {
        if(on) {
            System.out.println("Device is shutting down.");
            on = false;
    } else {
            System.out.println("Device is already off.");
        }


}

}
