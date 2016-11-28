package android.util;

/**
 * @author Jiao Fuhao(阿焦)
 * @date 2016/11/28 下午 7:31
 * @email jiaofuhao2012@163.com
 */
public class PatternUtil {

    public static boolean isNull(String content) {
        return content == null || content.equals("") ? true : false;
    }
}
