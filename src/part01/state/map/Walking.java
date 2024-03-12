package part01.state.map;

public class Walking implements Travel {

    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }
}
