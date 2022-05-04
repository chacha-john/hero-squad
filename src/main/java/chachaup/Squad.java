package chachaup;

public class Squad {
    private int squadMaxSize;
    private String squadName;
    private String squadCause;

    public Squad(String squadName, int squadMaxSize, String squadCause) {
        this.squadCause = squadCause;
        this.squadMaxSize = squadMaxSize;
        this.squadName = squadName;
    }

    public int getSquadMaxSize() {
        return squadMaxSize;
    }

    public void setSquadMaxSize(int squadMaxSize) {
        this.squadMaxSize = squadMaxSize;
    }

    public String getSquadName() {
        return squadName;
    }

    public void setSquadName(String squadName) {
        this.squadName = squadName;
    }

    public String getSquadCause() {
        return squadCause;
    }

    public void setSquadCause(String squadCause) {
        this.squadCause = squadCause;
    }
}
