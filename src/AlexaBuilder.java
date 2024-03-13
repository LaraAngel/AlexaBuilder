public class AlexaBuilder {
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

    protected AlexaBuilder saveSpeaker(AlexaSpeaker speaker) {
        alexa.setSpeaker(speaker);
        return this;
    }

    protected AlexaBuilder saveMic(AlexaMic mic) {
        alexa.setMic(mic);
        return this;
    }

    public AlexaDevice buildAlexa() {
        return alexa;
    }


}