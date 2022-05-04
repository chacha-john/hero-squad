package chachaup;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        staticFileLocation("/public");
        get("/",(request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model,"index.hbs");
        }, new HandlebarsTemplateEngine());
        get("/hero",(request,response) -> {
            Map<String,Object> model = new HashMap<>();
            return new ModelAndView(model,"add-hero.hbs");
        }, new HandlebarsTemplateEngine());
    }
}