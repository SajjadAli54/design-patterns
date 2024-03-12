package part01.state.map;

public class Transit implements Travel {
    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }

}
