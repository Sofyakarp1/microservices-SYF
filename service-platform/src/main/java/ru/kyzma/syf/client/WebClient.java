package ru.kyzma.syf.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import io.vertx.core.http.HttpClient;
import org.apache.tomcat.util.json.JSONParser;
import org.codehaus.jettison.json.JSONObject;
import ru.kyzma.syf.model.RightechData;

public class WebClient {

//    public void getHttpClient(){
//        Vertx vertx = new Vertx();
//        HttpClient httpClient = vertx.createHttpClient();
//    }

    private Client client = new Client();
    private static String URL = "";
    private static String TOKEN = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJqdGkiOiI2MGJmNGNlYTgzMjM4MTAwMTBmM2ZmODIiLCJzdWIiOiI1ZjhkODYxMmUxODgzY2ZiZmQxNzI0MzUiLCJncnAiOiI1ZjhkODYxMmUxODgzYzVkMzExNzI0MzQiLCJvcmciOiI1ZjhkODYxMmUxODgzYzVkMzExNzI0MzQiLCJsaWMiOnRydWUsInVzZyI6ImFwaSIsImZ1bGwiOmZhbHNlLCJyaWdodHMiOjEuNSwiaWF0IjoxNjIzMTQ5ODAyLCJleHAiOjE2MjU2OTE2MDB9.DEDlA4zlInXmV2CofeFyefBaNi6eQimbJp4fqq7ftIc";

    public RightechData createConnection(){
        WebResource webResource = client.resource("https://dev.rightech.io/api/v1/objects/" + URL);

        ClientResponse response = webResource.header("Authorization", TOKEN).accept("application/json").get(ClientResponse.class);

        // Status 200 is successful.
        if (response.getStatus() != 200) {
            System.out.println("Failed with HTTP Error code: " + response.getStatus());
            String error = response.getEntity(String.class);
            System.out.println("Error: " + error);
            //return null;
        }
        String output = response.getEntity(String.class);
        System.out.println("Output from cloud .... \n");
//        JSONParser jsonParser = new JSONParser();
//        JSONObject jsonObject = (JSONObject) jsonParser.parse(output);
//        JSONObject json = (JSONObject) jsonObject.get("state");

//        GetResult getResult = new GetResult();
//        String result = getResult.getResultTimeData(json.get("time_action").toString(), json.get("time_rele_2").toString());
//        //String result = "опасная ситуация";
//        Data data = new Data((String) jsonObject.get("id"), json.get("sensor_action").toString(), json.get("sensor_rele").toString(), json.get("time_action").toString().replace(".", "\n"), json.get("time_rele_2").toString().replace(".", "\n"), result);
//        return data;
        return null;
    }
}
