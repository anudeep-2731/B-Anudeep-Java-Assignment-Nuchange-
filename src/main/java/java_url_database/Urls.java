package java_url_database;

import java.util.UUID;

public class Urls {
    String id;
    String Url;
    int count;
Urls(String url){
    this.Url=url;
    count=0;
    id= UUID.randomUUID().toString();
}
}
