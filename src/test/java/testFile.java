

import client.PeopleAPIclient;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

public class testFile {
PeopleAPIclient peopleAPIclient = new PeopleAPIclient();
HttpResponse response;



   @Test
    public void  testFile() throws Exception {
       peopleAPIclient.deleteOnePeron();

       String body = EntityUtils.toString(response.getEntity());

  }
}
