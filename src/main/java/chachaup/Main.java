package chachaup;

import chachaup.domain.Hero;
import chachaup.domain.Squad;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        staticFileLocation("/public");


        get("/",(request, response) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<Hero> heroes = Hero.getAll();
            ArrayList<Squad> squads = Squad.getAll();
            model.put("heroes",heroes);
            model.put("squads",squads);
            return new ModelAndView(model,"index.hbs");
        }, new HandlebarsTemplateEngine());


        get("/hero/form",(request,response) -> {
            Map<String,Object> model = new HashMap<>();
            return new ModelAndView(model,"add-hero.hbs");
        }, new HandlebarsTemplateEngine());


        get("/hero/all",(request,response) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<Hero> heroes = Hero.getAll();
            model.put("heroes",heroes);
            return new ModelAndView(model,"hero-all.hbs");
        }, new HandlebarsTemplateEngine());


        post("/hero/new",(request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String heroName = request.queryParams("heroName");
            String heroPower = request.queryParams("heroPower");
            String heroWeakness = request.queryParams("heroWeakness");
            int heroAge = Integer.parseInt(request.queryParams("heroAge"));

            Hero hero = new Hero(heroName,heroAge,heroPower,heroWeakness);
            return new ModelAndView(model,"heroes.hbs");
        }, new HandlebarsTemplateEngine());


        get("/squad/form",(request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model,"add-squad.hbs");
        }, new HandlebarsTemplateEngine());

        get("/squad/all",(request,response) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<Squad> squads = Squad.getAll();
            model.put("squads",squads);
            return new ModelAndView(model,"squad-all.hbs");
        }, new HandlebarsTemplateEngine());

        post("/squad/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String squadName = request.queryParams("squadName");
            String squadCause = request.queryParams("squadCause");
            int squadMaxSize = Integer.parseInt(request.queryParams("squadMaxSize"));

            Squad squad = new Squad(squadName,squadMaxSize,squadCause);
            model.put("squad",squad);
            return new ModelAndView(model, "squads.hbs");
        }, new HandlebarsTemplateEngine());
    }
}