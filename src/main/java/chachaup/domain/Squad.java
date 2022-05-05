package chachaup;

import java.util.ArrayList;

public class Squad {
    private int squadMaxSize;
    private String squadName;
    private String squadCause;
    private static ArrayList<Squad> instances = new ArrayList<>();

    public Squad(String squadName, int squadMaxSize, String squadCause) {
        this.squadCause = squadCause;
        this.squadMaxSize = squadMaxSize;
        this.squadName = squadName;
        instances.add(this);
    }

    public static ArrayList<Squad> getInstances() {
        return instances;
    }

    public static void setInstances(ArrayList<Squad> instances) {
        Squad.instances = instances;
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
