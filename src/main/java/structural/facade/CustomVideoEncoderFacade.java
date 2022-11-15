package structural.facade;

public class CustomVideoEncoderFacade {

    public String encode(String filename) {

        var videoEncoder = new AdvancedVideoEncoder(
                "Test",
                1,
                true,
                "Test",
                "test",
                filename);

        if ("slowProcessor".equals(System.getProperty("processorType"))) {
            videoEncoder.setCodec(new CodecFast());
        } else {
            videoEncoder.setCodec(new CodecQuality());
        }
        return videoEncoder.encode();
    }



}
