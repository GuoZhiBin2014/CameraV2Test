package com.example.gzb.camerav2test;

/**
 * Created by gzb on 18-3-15.
 */

public class NativeUtil {

    static {
        System.loadLibrary("native-lib");
    }

    public static native String stringFromJNI();

}
