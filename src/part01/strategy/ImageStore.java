package part01.strategy;

public class ImageStore {
    private Compressor compressor;
    private Filter filter;

    public ImageStore(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String image) {
        compressor.compress(image);
        filter.apply(image);
    }
}
