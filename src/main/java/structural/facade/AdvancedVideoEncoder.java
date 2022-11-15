package structural.facade;

public class AdvancedVideoEncoder {

    private Codec codec;
    private String encoding;
    private Integer flagA;
    private boolean flagB;
    private String OptionA;
    private String OptionB;

    private String filename;

    public AdvancedVideoEncoder(String encoding, Integer flagA, boolean flagB, String optionA, String optionB, String filename) {
        this.encoding = encoding;
        this.flagA = flagA;
        this.flagB = flagB;
        OptionA = optionA;
        OptionB = optionB;
        this.filename = filename;
    }

    public void setCodec(Codec c) {
        codec = c;
    }

    public String encode() {
        // processing
        return "newFile.txt";
    }
}
