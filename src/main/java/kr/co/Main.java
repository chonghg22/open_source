package kr.co;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args){
        String sampleText = "Hello";
        String result = isNullCheck(sampleText,"Bye");
        System.out.println("result::"+result);
    }

    public static String isNullCheck(Object obj, String defaultStr) {
        String result = defaultStr;
        if(obj != null && !"".equals(obj)){
            if(!"".equals(String.valueOf(obj))){
                result = String.valueOf(obj);
            }
        }
        return result.trim();
    }

}