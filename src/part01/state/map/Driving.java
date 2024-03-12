package part01.state.map;

public class Driving implements Travel {
    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }

}
