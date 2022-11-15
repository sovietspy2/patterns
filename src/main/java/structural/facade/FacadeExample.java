package structural.facade;

public class FacadeExample {

    public static void run() {

        var filename = "file.name.mp3";

        CustomVideoEncoderFacade customVideoEncoderFacade = new CustomVideoEncoderFacade();

        customVideoEncoderFacade.encode(filename);

    }
}
