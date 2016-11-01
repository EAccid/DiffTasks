package iterable;

import java.util.HashMap;
import java.util.Map;

public class Query {
    private Map<String, Object> parameters = new HashMap<String, Object>();
    public void setParameter(String parameterName, Object parameterValue){
        parameters.put(parameterName, parameterValue);
    }
    public void performQuery(String textQuery) {
        System.out.println(textQuery);
        for (String parameter : parameters.keySet()
                ) {
                    System.out.println(parameter + ": " + parameters.get(parameter));
        }
    }
}
