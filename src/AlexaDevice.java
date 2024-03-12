import java.util.ArrayList;
import java.util.List;

public class AlexaDevice {
    private Boolean hasMic = false;
    private Boolean hasScreen = true;
    private Boolean hasSpeaker = false;
    private Boolean hasInternet = false;
    private Boolean hasBluetooth = false;

    private List<AlexaDevice> alexaCapabilities;

    public AlexaDevice() {
        this.alexaCapabilities = new ArrayList<>();
    }

    public Boolean getHasMic() {
        return hasMic;
    }

    public void setHasMic(Boolean hasMic) {
        this.hasMic = hasMic;
    }

    public Boolean getHasScreen() {
        return hasScreen;
    }

    public void setHasScreen(Boolean hasScreen) {
        this.hasScreen = hasScreen;
    }

    public Boolean getHasSpeaker() {
        return hasSpeaker;
    }

    public void setHasSpeaker(Boolean hasSpeaker) {
        this.hasSpeaker = hasSpeaker;
    }

    public Boolean getHasInternet() {
        return hasInternet;
    }

    public void setHasInternet(Boolean hasInternet) {
        this.hasInternet = hasInternet;
    }

    public Boolean getHasBluetooth() {
        return hasBluetooth;
    }

    public void setHasBluetooth(Boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }

    public List<AlexaDevice> getAlexaCapabilities() {
        return alexaCapabilities;
    }

    public void setAlexaCapabilities(List<AlexaDevice> alexaCapabilities) {
        this.alexaCapabilities = alexaCapabilities;
    }

    public void addCapability(AlexaDevice alexaDevice) {
        this.alexaCapabilities.add(alexaDevice);
    }

    public AlexaDevice getCapability(AlexaDevice alexaDevice) {
        int alexaIndex = this.alexaCapabilities.indexOf(alexaDevice);
        return this.alexaCapabilities.get(alexaIndex);
    }
}
