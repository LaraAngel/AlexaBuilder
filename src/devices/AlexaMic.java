package devices;

import builder.AlexaBuilder;

public class AlexaMic {
    private Integer frequency;
    private String language;

    @Override
    public String toString() {
        return "devices.AlexaMic{" +
                "frequency=" + frequency +
                ", language='" + language + '\'' +
                "}\n";
    }

    public static class AlexaMicBuilder extends AlexaBuilder {
        private AlexaMic mic = new AlexaMic();
        private AlexaBuilder parentBuilder;

        public AlexaMicBuilder(AlexaBuilder parentBuilder) {
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

        public AlexaBuilder buildMic() {
            parentBuilder.saveMic(mic);
            return parentBuilder;
        }
    }
}
