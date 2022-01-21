import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

import org.testng.annotations.Test;


public class validator {
	@Test
	public void validator(){
	given().get("http://localhost:3000/").then().assertThat().body(matchesJsonSchemaInClasspath("db.json")).statusCode(200);
	}
}
