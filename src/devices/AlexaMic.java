package devices;

public class AlexaMic {
    private Integer frequency;
    private String language;

    @Override
    public String toString() {
        return "devices.AlexaMic{" +
                "frequency=" + frequency +
                ", language='" + language + '\'' +
                '}';
    }

    public static class AlexaMicBuilder {
        private AlexaMic mic = new AlexaMic();
        private AlexaDevice.AlexaBuilder parentBuilder;

        public AlexaMicBuilder(AlexaDevice.AlexaBuilder parentBuilder) {
            this.parentBuilder = parentBuilder;
        }

        public AlexaMicBuilder setLanguage(String lang){
            mic.language = lang;
            return this;
        }

        public AlexaMicBuilder setFrequency(Integer frequency){
            mic.frequency = frequency;
            return this;
        }

        public AlexaDevice.AlexaBuilder buildMic() {
            parentBuilder.saveMic(mic);
            return parentBuilder;
        }
    }
}
