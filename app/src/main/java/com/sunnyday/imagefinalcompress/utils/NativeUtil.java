package com.sunnyday.imagefinalcompress.utils;

import android.graphics.Bitmap;

/**
 * Create by SunnyDay on 16:24 2022/04/29
 */
class NativeUtil {
    static {
        System.loadLibrary("libjpegbither");
    }
    /**
     * @param bitmap        原图
     * @param w             原图宽
     * @param h             原图高
     * @param quality       质量
     * @param fileNameBytes 文件名
     * @param optimize      是否开启压缩
     * @function 图片压缩.
     */
    private native static String compressBitmap(Bitmap bitmap, int w, int h, int quality, byte[] fileNameBytes, boolean optimize);
}
