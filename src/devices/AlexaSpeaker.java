package devices;

import builder.AlexaBuilder;

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
                "}\n";
    }

    public static class AlexaSpeakerBuilder extends AlexaBuilder {
        private AlexaSpeaker speaker = new AlexaSpeaker();
        private AlexaBuilder parentBuilder;

        public AlexaSpeakerBuilder(AlexaBuilder parentBuilder) {
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

        public AlexaBuilder buildSpeaker() {
            parentBuilder.saveSpeaker(speaker);
            return parentBuilder;
        }
    }
}
