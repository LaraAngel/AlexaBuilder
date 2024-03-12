public class AlexaScreen extends AlexaDevice {
    private Integer screenSize;
    private String screenMaterial;
    private Integer refreshRate;

    public Integer getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Integer screenSize) {
        this.screenSize = screenSize;
    }

    public String getScreenMaterial() {
        return screenMaterial;
    }

    public void setScreenMaterial(String screenMaterial) {
        this.screenMaterial = screenMaterial;
    }

    public Integer getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(Integer refreshRate) {
        this.refreshRate = refreshRate;
    }
}
