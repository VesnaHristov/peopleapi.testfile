package client;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

public class PeopleAPIclient {
    public HttpResponse getWelcomeRequest() throws Exception {
        Header contentType = new BasicHeader(HttpHeaders.CONTENT_TYPE, "application/json");
        SSLContext sslContext = SSLContextBuilder
                .create()
                .loadTrustMaterial(new TrustSelfSignedStrategy())
                .build();

        HttpGet request = new HttpGet("https://people-api1.herokuapp.com/");
        request.setHeader(contentType);

        HttpClient httpClient = HttpClients.custom().setSSLContext(sslContext).build();

        HttpResponse response = httpClient.execute(request);

        HttpEntity entity = response.getEntity();
        String body = EntityUtils.toString(response.getEntity());

        HttpEntity newEntity = new StringEntity(body, ContentType.get(entity));
        response.setEntity(newEntity);
        return response;
    }

    public HttpResponse getAllPeople() throws Exception {
        Header contentType = new BasicHeader(HttpHeaders.CONTENT_TYPE, "application/json");
        SSLContext sslContext = SSLContextBuilder
                .create()
                .loadTrustMaterial(new TrustSelfSignedStrategy())
                .build();

        HttpGet request = new HttpGet("https://people-api1.herokuapp.com/api/people");
        request.setHeader(contentType);

        HttpClient httpClient = HttpClients.custom().setSSLContext(sslContext).build();

        HttpResponse response = httpClient.execute(request);

        HttpEntity entity = response.getEntity();
        String body = EntityUtils.toString(response.getEntity());

        HttpEntity newEntity = new StringEntity(body, ContentType.get(entity));
        response.setEntity(newEntity);
        return response;
    }

    public HttpResponse getOnePerson() throws Exception {
        Header contentType = new BasicHeader(HttpHeaders.CONTENT_TYPE, "application/json");
        SSLContext sslContext = SSLContextBuilder
                .create()
                .loadTrustMaterial(new TrustSelfSignedStrategy())
                .build();

        HttpGet request = new HttpGet("https://people-api1.herokuapp.com/api/person/6141a1cf3ed8460004ca696a");
        request.setHeader(contentType);

        HttpClient httpClient = HttpClients.custom().setSSLContext(sslContext).build();

        HttpResponse response = httpClient.execute(request);

        HttpEntity entity = response.getEntity();
        String body = EntityUtils.toString(response.getEntity());

        HttpEntity newEntity = new StringEntity(body, ContentType.get(entity));
        response.setEntity(newEntity);
        return response;
    }

    public HttpResponse deleteOnePerson() throws Exception {
        Header contentType = new BasicHeader(HttpHeaders.CONTENT_TYPE, "application/json");
        SSLContext sslContext = SSLContextBuilder
                .create()
                .loadTrustMaterial(new TrustSelfSignedStrategy())
                .build();

        HttpDelete request = new HttpDelete("https://people-api1.herokuapp.com/api/person/6141a1cf3ed8460004ca696a");
        request.setHeader(contentType);

        HttpClient httpClient = HttpClients.custom().setSSLContext(sslContext).build();

        HttpResponse response = httpClient.execute(request);

        HttpEntity entity = response.getEntity();
        String body = EntityUtils.toString(response.getEntity());

        HttpEntity newEntity = new StringEntity(body, ContentType.get(entity));
        response.setEntity(newEntity);
        return response;
    }

    public HttpResponse postOnePerson() throws Exception {
        Header contentType = new BasicHeader(HttpHeaders.CONTENT_TYPE, "application/json");
        SSLContext sslContext = SSLContextBuilder
                .create()
                .loadTrustMaterial(new TrustSelfSignedStrategy())
                .build();

        HttpPost request = new HttpPost("https://people-api1.herokuapp.com/api/person");
        JSONObject payloadAsObject = new JSONObject(postOnePerson());
        payloadAsObject.put("name", "Vesna");
        payloadAsObject.put("surname", "Hristov");
        payloadAsObject.put("age", 38);
        payloadAsObject.put("isEmployed", false);
        payloadAsObject.put("location", "Skopje");

        request.setHeader(contentType);
        request.setEntity(new StringEntity(payloadAsObject.toString()));
        HttpClient httpClient = HttpClients.custom().setSSLContext(sslContext).build();

        HttpResponse response = httpClient.execute(request);

        HttpEntity entity = response.getEntity();
        String body = EntityUtils.toString(response.getEntity());

        HttpEntity newEntity = new StringEntity(body, ContentType.get(entity));
        response.setEntity(newEntity);
        return response;
    }

    public HttpResponse putPerson() throws Exception {
        Header contentType = new BasicHeader(HttpHeaders.CONTENT_TYPE, "application/json");
        SSLContext sslContext = SSLContextBuilder
                .create()
                .loadTrustMaterial(new TrustSelfSignedStrategy())
                .build();

        HttpPut request = new HttpPut("https://people-api1.herokuapp.com/api/person/6141a1cf3ed8460004ca696a");
        JSONObject payloadAsObject = new JSONObject(postOnePerson());
        payloadAsObject.put("isEmployed", true);
        payloadAsObject.put("location", "NY");

        request.setHeader(contentType);
        request.setEntity(new StringEntity(payloadAsObject.toString()));
        HttpClient httpClient = HttpClients.custom().setSSLContext(sslContext).build();

        HttpResponse response = httpClient.execute(request);

        HttpEntity entity = response.getEntity();
        String body = EntityUtils.toString(response.getEntity());

        HttpEntity newEntity = new StringEntity(body, ContentType.get(entity));
        response.setEntity(newEntity);
        return response;
    }

    public HttpResponse httpGet(String s) throws Exception {
        Header contentType = new BasicHeader(HttpHeaders.CONTENT_TYPE, "application/json");
        SSLContext sslContext = SSLContextBuilder
                .create()
                .loadTrustMaterial(new TrustSelfSignedStrategy())
                .build();

        HttpGet request = new HttpGet("https://people-api1.herokuapp.com/api/person/6141a1cf3ed8460004ca696a");
        request.setHeader(contentType);

        HttpClient httpClient = HttpClients.custom().setSSLContext(sslContext).build();

        HttpResponse response = httpClient.execute(request);

        HttpEntity entity = response.getEntity();
        String body = EntityUtils.toString(response.getEntity());

        HttpEntity newEntity = new StringEntity(body, ContentType.get(entity));
        response.setEntity(newEntity);
        return response;
    }

    public HttpResponse httpPost(String s, JSONObject payloadAsObject) throws Exception  {
        Header contentType = new BasicHeader(HttpHeaders.CONTENT_TYPE, "application/json");
        SSLContext sslContext = SSLContextBuilder
                .create()
                .loadTrustMaterial(new TrustSelfSignedStrategy())
                .build();

        HttpPost request = new HttpPost("https://people-api1.herokuapp.com/api/person/6141a1cf3ed8460004ca696a");
        request.setHeader(contentType);

        HttpClient httpClient = HttpClients.custom().setSSLContext(sslContext).build();

        HttpResponse response = httpClient.execute(request);

        HttpEntity entity = response.getEntity();
        String body = EntityUtils.toString(response.getEntity());

        HttpEntity newEntity = new StringEntity(body, ContentType.get(entity));
        response.setEntity(newEntity);
        return response;
    }

    public HttpResponse httpPut(String s, JSONObject payloadAsObject) throws Exception  {
        Header contentType = new BasicHeader(HttpHeaders.CONTENT_TYPE, "application/json");
        SSLContext sslContext = SSLContextBuilder
                .create()
                .loadTrustMaterial(new TrustSelfSignedStrategy())
                .build();

        HttpPut request = new HttpPut("https://people-api1.herokuapp.com/api/person/6141a1cf3ed8460004ca696a");
        request.setHeader(contentType);

        HttpClient httpClient = HttpClients.custom().setSSLContext(sslContext).build();

        HttpResponse response = httpClient.execute(request);

        HttpEntity entity = response.getEntity();
        String body = EntityUtils.toString(response.getEntity());

        HttpEntity newEntity = new StringEntity(body, ContentType.get(entity));
        response.setEntity(newEntity);
        return response;
    }
    public class PeopleApiClient {
        public PeopleApiClient() throws Exception {
        }

        Header contentType = new BasicHeader(HttpHeaders.CONTENT_TYPE, "application/json");

        SSLContext sslContext = SSLContextBuilder
                .create()
                .loadTrustMaterial(new TrustSelfSignedStrategy())
                .build();

        public HttpResponse httpGet(String url) throws Exception {
            HttpGet requets = new HttpGet(url);

            requets.setHeader(contentType);

            HttpClient httpClient = HttpClients.custom().setSSLContext(sslContext).build();

            HttpResponse response = httpClient.execute(requets);

            HttpEntity entity = response.getEntity();

            String body = EntityUtils.toString(response.getEntity());

            HttpEntity newEntity = new StringEntity(body, ContentType.get(entity));
            response.setEntity(newEntity);

            return response;
        }

        public HttpResponse httpDelete(String url) throws Exception {
            HttpDelete request = new HttpDelete(url);

            HttpClient httpClient = HttpClients.custom().setSSLContext(sslContext).build();

            HttpResponse response = httpClient.execute(request);

            HttpEntity entity = response.getEntity();
            String body = EntityUtils.toString(response.getEntity());

            HttpEntity newEntity = new StringEntity(body, ContentType.get(entity));
            response.setEntity(newEntity);

            return response;

        }

        public HttpResponse httpPost(String url,String payload) throws Exception {
            HttpPost request = new HttpPost(url);

            request.setHeader(contentType);
            request.setEntity(new StringEntity(payload));

            HttpClient httpClient = HttpClients.custom().setSSLContext(sslContext).build();

            HttpResponse response = httpClient.execute(request);

            HttpEntity entity = response.getEntity();
            String body = EntityUtils.toString(response.getEntity());

            HttpEntity newEntity = new StringEntity(body, ContentType.get(entity));
            response.setEntity(newEntity);

            return response;
        }

        public HttpResponse httpPut(String url,String payload) throws Exception {
            HttpPut request = new HttpPut(url);

            request.setHeader(contentType);
            request.setEntity(new StringEntity(payload));

            HttpClient httpClient = HttpClients.custom().setSSLContext(sslContext).build();

            HttpResponse response = httpClient.execute(request);

            HttpEntity entity = response.getEntity();
            String body = EntityUtils.toString(response.getEntity());

            HttpEntity newEntity = new StringEntity(body, ContentType.get(entity));
            response.setEntity(newEntity);

            return response;
        }


    }
}