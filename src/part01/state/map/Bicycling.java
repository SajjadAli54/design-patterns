package part01.state.map;

public class Bicycling implements Travel {
    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

}
