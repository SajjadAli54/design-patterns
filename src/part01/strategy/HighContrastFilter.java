package part01.strategy;

public class HighContrastFilter implements Filter {

    @Override
    public void apply(String image) {
        System.out.println("Applying High Contrast filter");
    }

}
