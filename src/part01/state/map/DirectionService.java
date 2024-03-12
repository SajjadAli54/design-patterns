package part01.state.map;

public class DirectionService {
    private Travel travel;

    public void setTravel(Travel travel) {
        this.travel = travel;
    }

    public Travel getTravel() {
        return travel;
    }

    public Object getEta() {
        return travel.getEta();
    }

}
