package kr.co;

public class CommonUtil {
    public static String isNullCheck(Object obj, String defaultText) {
        String result = defaultText;
        if(obj != null && !"".equals(obj)){
            if(!"".equals(String.valueOf(obj))){
                result = String.valueOf(obj);
            }
        }
        return result.trim();
    }
}
