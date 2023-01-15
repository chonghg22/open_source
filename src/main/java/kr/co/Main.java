package kr.co;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args){
        String inputText = "1";
        String outputText = example(inputText);
        System.out.println("outputText::"+outputText);
    }

    public static String example(String testText){
        testText = CommonUtil.isNullCheck(testText,"hello");
        return testText;
    }

}