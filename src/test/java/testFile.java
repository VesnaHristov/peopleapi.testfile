import client.PeopleAPIclient;
import netscape.javascript.JSException;
import netscape.javascript.JSObject;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testFile {
    PeopleAPIclient peopleAPIclient = new PeopleAPIclient();
    HttpResponse response;

    @Test
    public void  welcomeMessagePeopleAPITest() throws Exception {
        String expectedMessage = "Welcome to People API";
        response = peopleAPIclient.getWelcomeRequest();

        String body = EntityUtils.toString(response.getEntity());
        JSONObject bodyAsObject = new JSONObject(body);

        String messageAsString = bodyAsObject.get("message").toString();

        Assert.assertEquals(messageAsString,expectedMessage);
    }
    @Test
    public void getOnePeson() throws  Exception {
            String expectedMessage = "Person successfully fetched";
            response = peopleAPIclient.httpGet("https://people-api1.herokuapp.com/api/person/6141a1cf3ed8460004ca696a");
        String body = EntityUtils.toString(response.getEntity());
        JSONObject bodyAsObject = new JSONObject(body);
        String personDataAsString = bodyAsObject.get("person1").toString();
        JSONObject personData = new JSONObject(personDataAsString);
        String name = personData.get("name").toString();
        Assert.assertEquals(name, "Vesna");
    }
    @Test
    public void getAllPeople() throws Exception {
        response = peopleAPIclient.httpGet("https://people-api1.herokuapp.com/api/people");

        String body = EntityUtils.toString(response.getEntity());
        JSONObject bodyAsObject = new JSONObject(body);
        String messageAsString = bodyAsObject.get("message").toString();
    }
    }
