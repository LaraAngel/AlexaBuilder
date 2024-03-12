public class Main {
    public static void main(String[] args) {

        AlexaDevice alexaDevice = new AlexaDevice();
        AlexaScreen alexaScreen = new AlexaScreen();
        AlexaSpeaker alexaSpeaker = new AlexaSpeaker.Builder().limitVolumes(1,2).addDefaultVolume().build();

        alexaDevice.addCapability(alexaScreen);
        alexaDevice.addCapability(alexaSpeaker);
        AlexaDevice ad = alexaDevice.getCapability(alexaSpeaker);
        System.out.print(ad.getHasSpeaker());
        System.out.print(ad.getHasBluetooth());
        System.out.print(ad.getHasMic());

        System.out.println(alexaSpeaker.getVolume((AlexaSpeaker) ad));
    }
}