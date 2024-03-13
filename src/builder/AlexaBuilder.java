package builder;

import devices.AlexaDevice;
import devices.AlexaFrenchFries;
import devices.AlexaMic;
import devices.AlexaSpeaker;

public class AlexaBuilder {
    private AlexaDevice alexa;

    public AlexaBuilder() {
        alexa = new AlexaDevice();
    }

    public AlexaSpeaker.AlexaSpeakerBuilder defineSpeaker() {
        return new AlexaSpeaker.AlexaSpeakerBuilder(this);
    }

    public AlexaBuilder saveSpeaker(AlexaSpeaker speaker) {
        alexa.setSpeaker(speaker);
        return this;
    }

    public AlexaMic.AlexaMicBuilder defineMic() {
        return new AlexaMic.AlexaMicBuilder(this);
    }

    public AlexaBuilder saveMic(AlexaMic mic) {
        alexa.setMic(mic);
        return this;
    }

    public AlexaFrenchFries.AlexaFrenchFriesBuilder defineFrenchFries() {
        return new AlexaFrenchFries.AlexaFrenchFriesBuilder(this);
    }

    public AlexaBuilder saveFrenchFries(AlexaFrenchFries frenchFries) {
        alexa.setFrenchFries(frenchFries);
        return this;
    }

    public AlexaDevice buildAlexa() {
        return alexa;
    }


}