package devices;

public class AlexaDevice {
    private AlexaSpeaker speaker = new AlexaSpeaker();
    private AlexaMic mic = new AlexaMic();
    private AlexaFrenchFries frenchFries = new AlexaFrenchFries();

    public AlexaSpeaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(AlexaSpeaker speaker) {
        this.speaker = speaker;
    }

    public AlexaMic getMic() {
        return mic;
    }

    public void setMic(AlexaMic mic) {
        this.mic = mic;
    }

    public AlexaFrenchFries getFrenchFries() {
        return frenchFries;
    }

    public void setFrenchFries(AlexaFrenchFries frenchFries) {
        this.frenchFries = frenchFries;
    }

    @Override
    public String toString() {
        return "AlexaDevice{" +
                "speaker=" + speaker +
                ", mic=" + mic +
                ", frenchFries=" + frenchFries +
                '}';
    }
}
