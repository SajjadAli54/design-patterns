package part01.strategy;

public class JpegCompressor implements Compressor {

    @Override
    public void compress(String image) {
        System.out.println("Compressing via Jpeg method");
    }

}
