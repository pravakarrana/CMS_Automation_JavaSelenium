package Com.E2M.CMS_Event2MobileTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.testng.annotations.Test;

@Test
public class ss {
	public static void main(String[] args) throws IOException
	{
	  URL url = new URL("http://truliantcms.com");
	  HttpURLConnection connection = (HttpURLConnection) url.openConnection();

	  connection.setRequestMethod("GET");

	  String resp = getResponseBody(connection);

	  System.out.println("RESPONSE CODE: " + connection.getResponseCode());
	  System.out.println(resp);
	}

	private static String getResponseBody(HttpURLConnection connection)
	    throws IOException
	{
	  try
	  {
	    BufferedReader reader = new BufferedReader(new InputStreamReader(
	        connection.getInputStream()));

	    StringBuilder responseBody = new StringBuilder();
	    String line = "";

	    while ((line = reader.readLine()) != null)
	    {
	      responseBody.append(line + "\n");
	    }

	    reader.close();
	    return responseBody.toString();
	  }
	  catch (IOException e)
	  {
	    e.printStackTrace();
	    return "";
	  }
	}
}
