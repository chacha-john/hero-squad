package chachaup;

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
            model.put("heroes",heroes);
            return new ModelAndView(model,"index.hbs");
        }, new HandlebarsTemplateEngine());
        get("/hero",(request,response) -> {
            Map<String,Object> model = new HashMap<>();
            return new ModelAndView(model,"add-hero.hbs");
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
    }
}