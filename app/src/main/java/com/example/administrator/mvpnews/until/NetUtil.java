package com.example.administrator.mvpnews.until;

import android.net.Uri;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Create by Administrator on 2018/2/4.
 */

public class NetUtil {
    public static String net(String urlString,String method){
        StringBuilder builder = new StringBuilder();
        HttpURLConnection connection = null;
       try {
            URL url = new URL(urlString);
            connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod(method);
            connection.setConnectTimeout(4000);
            connection.setReadTimeout(4000);
            InputStream inputStream = connection.getInputStream();
            String line = "";
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while((line=reader.readLine())!=null){
                builder.append(line);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            connection.disconnect();
        }
        return builder.toString();
    }
}
