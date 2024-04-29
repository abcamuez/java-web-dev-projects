public class Laptop extends Computer {
    //properties
    //processorType
    private String processorType;
    private int brightness;
    private int batteryPercentage;

    public Laptop(String manufacturer, String model, double price){
        super(manufacturer, model, price);
//        processorType = aProcessorType;

    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String aProcessorType) {
        processorType = aProcessorType;
    }

    public int getBrightness() {
        return brightness;
    }

//    public void setBrightness(int brightness) {
//        this.brightness = brightness;
//    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(int batteryPercentage) {

    }

public void adjustBrightness(){
if(brightness < 100){
    brightness += 10;
    System.out.println("Brightness has been increased to" + brightness);
} else {
    System.out.println("This is set to maximum brightness");
}

}
public void checkBatteryStatus(){
    System.out.println("Battery is at" + batteryPercentage + "%");

}

}
