package API;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/api")
public class Api {
    @GET
    @Path("/")
    @Produces("text/JSON")
    public String getClichedMessage() {
        // Return some cliched textual content
        return "Hello World";
    }
}
