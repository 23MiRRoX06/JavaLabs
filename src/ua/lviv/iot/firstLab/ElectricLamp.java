package ua.lviv.iot.firstLab;

public class ElectricLamp {

    private static int heightInMillimeters = 800;

    private String factoryManufacturer;

    private String countryManufacturer;

    private int warrantyWorkPeriodInDays;

    private int lightPowerInWatts;

    private String color;

    private int numberOfLightSources;

    protected String baseMaterial;

    protected String style;

    public String getFactoryManufacturer() {
        return factoryManufacturer;
    }

    public void setFactoryManufacturer(String factoryManufacturer) {
        this.factoryManufacturer = factoryManufacturer;
    }

    public String getCountryManufacturer() {
        return countryManufacturer;
    }

    public void setCountryManufacturer(String countryManufacturer) {
        this.countryManufacturer = countryManufacturer;
    }

    public int getWarrantyWorkPeriodInDays() {
        return warrantyWorkPeriodInDays;
    }

    public void setWarrantyWorkPeriodInDays(int warrantyWorkPeriodInDays) {
        this.warrantyWorkPeriodInDays = warrantyWorkPeriodInDays;
    }

    public double getLightPowerInWatts() {
        return lightPowerInWatts;
    }

    public void setLightPowerInWatts(int lightPowerInWatts) {
        this.lightPowerInWatts = lightPowerInWatts;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfLightSources() {
        return numberOfLightSources;
    }

    public void setNumberOfLightSources(int numberOfLightSources) {
        this.numberOfLightSources = numberOfLightSources;
    }

    public ElectricLamp(String factoryManufacturer, String countryManufacturer, int warrantyWorkPeriodInDays,
                        int lightPowerInWatts, String color, int numberOfLightSources, String baseMaterial, String style) {
        this.factoryManufacturer = factoryManufacturer;
        this.countryManufacturer = countryManufacturer;
        this.warrantyWorkPeriodInDays = warrantyWorkPeriodInDays;
        this.lightPowerInWatts = lightPowerInWatts;
        this.color = color;
        this.numberOfLightSources = numberOfLightSources;
        this.baseMaterial = baseMaterial;
        this.style = style;
    }

    public ElectricLamp(String factoryManufacturer, String countryManufacturer, int warrantyWorkPeriodInDays,
                        int lightPowerInWatts) {
        this(factoryManufacturer, countryManufacturer, warrantyWorkPeriodInDays, lightPowerInWatts, null, 0, null,
                null);
    }

    public ElectricLamp() {
        this("Brille", "Poland", 360, 60, "black", 1, "plastic", "loft");
    }

    @Override
    public String toString() {
        return "ElectricLamp [factoryManufacturer=" + factoryManufacturer + ", countryManufacturer="
                + countryManufacturer + ", warrantyWorkPeriodInDays=" + warrantyWorkPeriodInDays
                + ", lightPowerInWatts=" + lightPowerInWatts + ", color=" + color + ", numberOfLightSources="
                + numberOfLightSources + ", baseMaterial=" + baseMaterial + ", style=" + style + "]";
    }

    public void printHeightInMillimeters() {
        System.out.println("Height of lamp = " + heightInMillimeters);
    }

    public static void printStaticHeightInMillimeters() {
        System.out.println("Height of lamp = " + heightInMillimeters);
    }

    public void resetValues(String factoryManufacturer, String countryManufacturer, int warrantyWorkPeriodInDays,
                            int lightPowerInWatts, String color, int numberOfLightSources, String baseMaterial, String style) {
        this.factoryManufacturer = factoryManufacturer;
        this.countryManufacturer = countryManufacturer;
        this.warrantyWorkPeriodInDays = warrantyWorkPeriodInDays;
        this.lightPowerInWatts = lightPowerInWatts;
        this.color = color;
        this.numberOfLightSources = numberOfLightSources;
        this.baseMaterial = baseMaterial;
        this.style = style;
    }

}
