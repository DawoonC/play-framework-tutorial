package controllers;

import play.*;
import play.data.*;
import play.mvc.*;
import static play.data.Form.*;

import models.*;
import views.html.*;

// Accessing the JDBC datasource
// DataSource ds = DB.getDatasource();

// Obtaining a JDBC connection
// Connection conn = DB.getConnection();

public class Application extends Controller {

    public static Result index() {
        return ok(index.render(
            Project.find.all(),
            Task.find.all()
        ));
    }

}
