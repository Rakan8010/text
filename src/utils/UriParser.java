package utils;

import java.util.HashMap;
import java.util.Map;

public class UriParser {
    private String URI;
    private String controllerCode;
    private String target;
    private boolean isValid = false;
    private Map<String, Object> parameter = new HashMap();

    public UriParser(String uri) {
        this.URI = uri;
        this.parse();
    }

    private void parse() {
        if (!this.URI.startsWith("/")) {
            this.isValid = false;
        } else {
            String[] uriSplit = this.URI.split("\\?", 2);
            if (uriSplit.length == 2) {
                String paramBody = uriSplit[1];
                String[] splitParam = paramBody.split("=", 2);
                this.parameter.put(splitParam[0], splitParam[1]);
            }

            String[] uriBodySplit = uriSplit[0].split("/");
            if (uriBodySplit.length != 3) {
                this.isValid = false;
            } else {
                this.controllerCode = uriBodySplit[1];
                this.target = uriBodySplit[2];
                this.isValid = true;
            }
        }
    }

    public String getControllerCode() {
        return this.controllerCode;
    }

    public String getTarget() {
        return this.target;
    }

    public Map<String, Object> getParameter() {
        return this.parameter;
    }

    public boolean isValid() {
        return this.isValid;
    }

    public String getURI(){
        return URI;
    }
}