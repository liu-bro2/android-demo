package android.util;

/**
 * Created by Bro2 on 2017/7/12
 *
 */

public class Log {
    public static int e(String tag, String msg, Throwable e) {
//        e.printStackTrace();
        return 0;
    }

    public static int e(String tag, String msg) {
        System.out.println(msg);
        return 0;
    }

    public static int d(String tag, String msg) {
        System.out.println(msg);
        return 0;
    }
}
