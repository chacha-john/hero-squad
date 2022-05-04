package chachaup;

import java.util.ArrayList;

public class Hero {
    private String heroName;
    private int heroAge;
    private String heroPower;
    private String heroWeakness;
    private Squad heroSquad;
    private static ArrayList<Hero> instances = new ArrayList<>();
    private int id;

    public Hero(String heroName, int heroAge, String heroPower, String heroWeakness){
        this.heroAge = heroAge;
        this.heroName = heroName;
        this.heroPower = heroPower;
        this.heroWeakness = heroWeakness;
        instances.add(this);
        this.id = instances.size();
    }

    public static ArrayList<Hero> getAll() {
        return instances;
    }

    public int getId() {
        return id;
    }

    public Squad getHeroSquad() {
        return heroSquad;
    }

    public void setHeroSquad(Squad heroSquad) {
        this.heroSquad = heroSquad;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public int getHeroAge() {
        return heroAge;
    }

    public void setHeroAge(int heroAge) {
        this.heroAge = heroAge;
    }

    public String getHeroPower() {
        return heroPower;
    }

    public void setHeroPower(String heroPower) {
        this.heroPower = heroPower;
    }

    public String getHeroWeakness() {
        return heroWeakness;
    }

    public void setHeroWeakness(String heroWeakness) {
        this.heroWeakness = heroWeakness;
    }
}
