pageDownloader
==============
How to fetch contents from website?

Have you ever thought of fetching the contents of some website without actually opening the site or going to the sites source code. A simple webpage downloader.

This tutorial will show you a simple code using which you can download the contents of the site by just passing the url of the site.

First create a project in your preferred IDE. For this project I am using Netbeans 8 IDE. Name it PageDownloader.

 

 

Next we need to import some packages in our project.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
 

Create a public class and add a main() mathod which throws MalformedURLException which will handle wrong or malformed urls, next add IOExceptions.

public class pageDownloader{    
public static void main(String[] args) throws MalformedURLException, IOException {
 

Create an URL class object which is part of the java.net package.

URL url = new URL("http://www.nileshchakraborty.com/wp/big-data");
 

Use HttpURLConnection class which will handle the HTTP requests made by the project. Add request property which defines the User-Agent and browser object.

HttpURLConnection con = (HttpURLConnection) url.openConnection();
con.addRequestProperty("User-Agent", "Mozilla/4.76");
InputStream is =con.getInputStream();
 

Create an InputStream class object which will read the content of the page line by line. Finally the content is read line by line and the content is printed out into the console

BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line = null;

        // read each line and write to System.out
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
 

 

 

Full Source Here:

 

package pagedownloader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
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
        URL url = new URL("http://www.nileshchakraborty.com/wp/big-data");
        
        // Get the input stream through URL Connection
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.addRequestProperty("User-Agent", "Mozilla/4.76");
        InputStream is =con.getInputStream();

        // Once you have the Input Stream, it's just plain old Java IO stuff.

        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line = null;

        // read each line and write to System.out
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
    
}
 
Description available at : http://blog.nileshchakraborty.com/fetching-contents-from-website/
