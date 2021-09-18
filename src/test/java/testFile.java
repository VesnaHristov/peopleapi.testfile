

import client.PeopleAPIclient;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

public class testFile {
PeopleAPIclient peopleAPIclient = new PeopleAPIclient();
HttpResponse response;
HttpResponse getpeople;
HttpResponse getOnePerson;
HttpResponse deleteOnePerson;

    @Test
    public void  testFile() throws Exception {
       peopleAPIclient.getWellcomeReqwest();
        getpeople = peopleAPIclient.getAllPeople();
        getOnePerson = peopleAPIclient.getOnePerson();
        peopleAPIclient.postOnePerson();
        deleteOnePerson = peopleAPIclient.deleteOnePerson();

        String body = EntityUtils.toString(response.getEntity());
        String getAllPeople = EntityUtils.toString(getpeople.getEntity());
        String bodyofOnePerson = EntityUtils.toString(getOnePerson.getEntity());

  }
}
