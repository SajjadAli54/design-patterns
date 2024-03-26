package part01.strategy;

public class BlackWhiteFilter implements Filter {

    @Override
    public void apply(String image) {
        System.out.println("Applying black and white filter");
    }

}
