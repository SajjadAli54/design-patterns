package part01.strategy;

public class PngCompressor implements Compressor {

    @Override
    public void compress(String image) {
        System.out.println("Compressing via png");
    }

}
