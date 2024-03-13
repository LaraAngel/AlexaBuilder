package devices;

public class AlexaDevice {
    private AlexaSpeaker speaker = new AlexaSpeaker();
    private AlexaMic mic = new AlexaMic();

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

    @Override
    public String toString() {
        return "devices.AlexaDevice{" +
                "speaker=" + speaker.toString() +
                ", mic=" + mic.toString() +
                '}';
    }
}
