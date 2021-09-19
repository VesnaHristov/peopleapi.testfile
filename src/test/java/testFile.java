

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
       response = peopleAPIclient.getWelcomeRequest();

      String body = EntityUtils.toString(response.getEntity());
       JSONObject bodyAsObject = new JSONObject(body);

      String messageAsString = bodyAsObject.get("message").toString();

       Assert.assertEquals(messageAsString,"Welcome To People API");
    }

}
