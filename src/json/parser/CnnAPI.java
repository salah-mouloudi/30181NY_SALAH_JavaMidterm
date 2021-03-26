package json.parser;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

class CNNAPI{
    /*
      You can get API_KEY from this below link. Once you have the API_KEY, you can fetch the top-headlines news.
      https://newsapi.org/s/cnn-api

      Fetch This following CNN API, It will return some news in Json data. Parse this data and construct
      https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=YOUR_API_KEY

      MY_API_KEY=0d9e35dfa3c140aab8bf9cdd70df957f

      After getting Json Format of the news, You can go to json validator link: https://jsonlint.com/ to see
      how it can be parsed.



	   Read the articles array and construct Headline news as source, author, title,description,url,urlToImage,publishedAt
	   and content. You need to design News Data Model and construct headline news.
	   You can store in Map and then into ArrayList as your choice of Data Structure.

	   You can follow How we implemented in Employee and JsonReaderUtil task.

	   Show output of all the headline news in to console.
	   Store into choice of your database and retrieve.

     */

    //    public static void main(String[] args) throws IOException, JSONException {
//        String apiKey = "b5cb2489183c441e851e3e7c468bc199";
//        String URL = "https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=b5cb2489183c441e851e3e7c468bc199" + apiKey;
//
//        JSONObject rootObject = new JSONObject(new String(Files.readAllBytes(new File("src/json/parser/data.json").toPath())));
//
//        // Continue implementing here..
//    }
//
//}
    public static void main(String[] args) throws Exception {

        String URL = "https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=b5cb2489183c441e851e3e7c468bc199";
        NewsDataClass news = null;
        List<NewsDataClass> list1 = new ArrayList<>();
        URL url1 = new URL(URL);
        URLConnection request = url1.openConnection();
        request.connect();
        JsonArray jsonArray = null;
        JsonObject rootObj = null;
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        if (root instanceof JsonObject) {
            rootObj = root.getAsJsonObject();
        } else if (root instanceof JsonArray) {
            jsonArray = root.getAsJsonArray();
        }
        if (jsonArray == null)
            jsonArray = rootObj.getAsJsonArray("articles");//Storing J object in the Array

        String source = null;
        String author = null;
        String title = null;
        String description = null;
        String url = null;
        String urlToImage = null;
        String publishedAt = null;
        String content = null;
        for (int i = 0; i < ((JsonArray) jsonArray).size() - 1; i++) {

            try {
                JsonObject jsonobject = jsonArray.get(i).getAsJsonObject();
                System.out.println("\n**************************************************************************************************************************************************************************************************************************************************************************************************");
                source = jsonobject.get("source").toString();
                System.out.println("\nSOURCE: "+source);
                author = jsonobject.get("author").toString();
                System.out.println("AUTHOR: "+author);
                title = jsonobject.get("title").toString();
                System.out.println("TITLE: "+title);
                description = jsonobject.get("description").toString();
                System.out.println("DESCRIPTION: "+description);
                url = jsonobject.get("url").toString();
                System.out.println("URL: "+ url);
                urlToImage = jsonobject.get("urlToImage").toString();
                System.out.println("URL TO IMAGE: "+urlToImage);
                publishedAt = jsonobject.get("publishedAt").toString();
                System.out.println("PUBLISHED AT: "+publishedAt);
                content = jsonobject.get("content").toString();
                System.out.println("CONTENT: "+content);


                news = new NewsDataClass(source, author, title, description, url, urlToImage, publishedAt, content);
                list1.add(news);


            } catch (Exception ex) {

            }
        }

    }

    private static class NewsDataClass {
        public NewsDataClass(String source, String author, String title, String description, String url, String urlToImage, String publishedAt, String content) {
        }
    }
}
