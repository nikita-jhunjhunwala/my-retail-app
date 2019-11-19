package com.target.assessment.http;

import com.target.assessment.exceptions.NotImplementedException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;

import java.io.IOException;


public abstract class AbstractHttpClient {

    private HttpClient httpClient;

    public AbstractHttpClient(HttpClient client) {
        this.httpClient = client;
    }

    public HttpResponse executeGet(String url) throws IOException {
        HttpGet httpGetRequest = new HttpGet(url);
        HttpResponse response = httpClient.execute(httpGetRequest);
        return response;
    }

    public HttpResponse executePut() throws NotImplementedException {
        throw new NotImplementedException("This feature is not supported");
    }

}
