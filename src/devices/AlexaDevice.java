package devices;

public class AlexaDevice {
    private AlexaSpeaker speaker = new AlexaSpeaker();
    private AlexaMic mic = new AlexaMic();

    private AlexaDevice(){}

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

    public static class AlexaBuilder {
        private AlexaDevice alexa;

        public AlexaBuilder() {
            alexa = new AlexaDevice();
        }

        public AlexaSpeaker.AlexaSpeakerBuilder defineSpeaker() {
            return new AlexaSpeaker.AlexaSpeakerBuilder(this);
        }

        public AlexaMic.AlexaMicBuilder defineMic(){
            return new AlexaMic.AlexaMicBuilder(this);
        }

        public AlexaBuilder saveSpeaker(AlexaSpeaker speaker) {
            alexa.setSpeaker(speaker);
            return this;
        }

        public AlexaBuilder saveMic(AlexaMic mic) {
            alexa.setMic(mic);
            return this;
        }

        public AlexaDevice buildAlexa() {
            return alexa;
        }
    }
}
