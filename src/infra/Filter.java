package infra;

import config.ApplicationConfig;

public class Filter {
    public Request request;

    public Filter(Request request){
        this.request = request;
    }

    private boolean isAnonymous(String uri){
         String[] anonymousUriList =  ApplicationConfig.anonymousUrilist;

         for(String regUrl : anonymousUriList){
             if(regUrl,equals(uri)){
                 return true;
             }
         }
         return false;

    }
    private boolean isAnonymous(String Url){
        String[] hasAutUrlList
    }
}
