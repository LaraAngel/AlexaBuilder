package devices;

public class AlexaSpeaker {
    private Integer volume;
    private Integer minHz;
    private Integer maxHz;

    @Override
    public String toString() {
        return "devices.AlexaSpeaker{" +
                "volume=" + volume +
                ", minHz=" + minHz +
                ", maxHz=" + maxHz +
                '}';
    }

    public static class AlexaSpeakerBuilder {
        private AlexaSpeaker speaker = new AlexaSpeaker();
        private AlexaDevice.AlexaBuilder parentBuilder;

        public AlexaSpeakerBuilder(AlexaDevice.AlexaBuilder parentBuilder) {
            this.parentBuilder = parentBuilder;
        }

        public AlexaSpeakerBuilder setMinHz(Integer hz){
            speaker.minHz = hz;
            return this;
        }

        public AlexaSpeakerBuilder setMaxHz(Integer hz){
            speaker.maxHz = hz;
            return this;
        }

        public AlexaDevice.AlexaBuilder buildSpeaker() {
            parentBuilder.saveSpeaker(speaker);
            return parentBuilder;
        }
    }
}
