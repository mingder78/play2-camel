package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class Application extends Controller
{
    public static Result index()
    {
        MyLogger.log("Here's my log message");
        return ok(index.render("Your new application is ready."));
    }
}
