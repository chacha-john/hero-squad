package chachaup.domain;

import java.util.ArrayList;

public class Squad {
    private int squadMaxSize;
    private String squadName;
    private String squadCause;
    private static ArrayList<Squad> instances = new ArrayList<>();
    private int id;

    public Squad(String squadName, int squadMaxSize, String squadCause) {
        this.squadCause = squadCause;
        this.squadMaxSize = squadMaxSize;
        this.squadName = squadName;
        instances.add(this);
        this.id = instances.size();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static ArrayList<Squad> getAll() {
        return instances;
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
