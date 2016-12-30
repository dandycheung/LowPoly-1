package me.fichardu.lowpoly;

/**
 * Created by xf on 2016/12/29
 */

public class LowPoly {

    static {
        System.loadLibrary("lowPoly");
    }

    public static native int[] lowPoly(int[] pixels, int width, int height, int accuracy, int pointCount);

    public static native int[] sobel(int[] pixels, int width, int height);

    public static native int[] delaunay(int width, int height, int pointCount);

}