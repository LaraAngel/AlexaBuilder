import builder.AlexaBuilder;
import devices.AlexaDevice;

public class Main {
    public static void main(String[] args) {
        AlexaDevice alexa = new AlexaBuilder()
                .defineSpeaker()
                .setMinHz(50)
                .setMaxHz(20000)
                .buildSpeaker()
                .defineMic()
                .setLanguage("English")
                .setFrequency(1000)
                .buildMic()
                .buildAlexa();
        System.out.println(alexa.toString());
    }
}