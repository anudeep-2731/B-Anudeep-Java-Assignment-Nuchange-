package java_url_database;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import com.google.gson.Gson; 

public class UrlDatabase {
	 public static Urls findUrl(String url,Set<Urls> UrlTable){
	        for(Urls temp:UrlTable){
	            if(temp.Url.equals(url)){
	              return temp;
	            }
	        }
	        return null;
	    }
	    public static void main(String[] args){
	       Set<Urls> UrlTable=new HashSet<>();
	        String command,url;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Database Started");
	        command=sc.nextLine();
	        if(command.equals("run java urldatabase")){
	        do{
	        	System.out.println("Java Database started");
	           command=sc.next();
	           if(command.equals("storeurl")){
	               url=sc.next();
	               Urls k=findUrl(url,UrlTable);
	               if(k==null) {
	                   Urls temp = new Urls(url);
	                   UrlTable.add(temp);
	                   System.out.println("Url added");
	               }
	           }
	           else if(command.equals("get")){
	               url=sc.next();
	               Urls k=findUrl(url,UrlTable);
	               k.count++;
	               System.out.println(k.id);
	           }
	           else if(command.equals("count")){
	               url=sc.next();
	               Urls k=findUrl(url,UrlTable);
	               System.out.println(k.count);
	           }
	           else if(command.equals("list")) {
	        	   System.out.println(new Gson().toJson(UrlTable));
	           }
	           else{
	        	   System.out.println("Java UrlDatabase Stoped");
	        	   sc.close();
	               break;
	           }
	        }while(true);
	        }
	    }
}

