public class AlexaSpeaker extends AlexaDevice{
    private Integer volume;
    private Integer maxHz;
    private Integer minHz;
    private Integer impedance;

    public Integer getVolume(AlexaSpeaker alexaDevice) {
        return alexaDevice.volume;
    }

    public void setVolume(Integer volume) {
        if (volume < 0) {
            this.volume = 0;
        } this.volume = volume;
    }

    public Integer getMaxHz() {
        return maxHz;
    }

    private void setMaxHz(Integer maxHz) {
        this.maxHz = maxHz;
    }

    public Integer getMinHz() {
        return minHz;
    }

    private void setMinHz(Integer minHz) {
        if (minHz < 0) {
            this.minHz = 0;
        }
        this.minHz = minHz;
    }

    public Integer getImpedance() {
        return impedance;
    }

    private void setImpedance(Integer impedance) {
        this.impedance = impedance;
    }

    public static class Builder extends AlexaDevice{
        private AlexaSpeaker speaker;

        public Builder() {
            speaker = new AlexaSpeaker();
        }

        public Builder limitVolumes(Integer min, Integer max) {
            speaker.maxHz = max;
            speaker.minHz = min;
            return this;
        }
        public Builder addImpedance(Integer impedance) {
            speaker.impedance = impedance;
            return this;
        }

        public Builder addDefaultVolume(){
            speaker.volume = 0;
            return this;
        }

        public AlexaSpeaker build(){
            speaker.setHasSpeaker(true);
            return speaker;
        }
    }
}
