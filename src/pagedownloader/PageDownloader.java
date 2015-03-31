/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pagedownloader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.regex.*;
/**
 *
 * @author Nilesh
 */
public class PageDownloader {

    /**
     * @param args the command line arguments
     * @throws java.net.MalformedURLException
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        // TODO code application logic here
        URL url = new URL("http://www.nileshchakraborty.com/");
        
        // Get the input stream through URL Connection
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.addRequestProperty("User-Agent", "Mozilla/4.76");
        InputStream is =con.getInputStream();

        // Once you have the Input Stream, it's just plain old Java IO stuff.

        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line = null;
        String page = null; 
        // read each line and write to System.out
        while ((line = br.readLine()) != null) {
            page += line; 
        }
        
    }
    
}
