package com.srain.cube.image.util;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

import android.os.Build;
import android.util.Log;

/**
 * Downloader is a interface for download bitmap
 */
public interface Downloader {

    public boolean downloadUrlToStream(String urlString, OutputStream outputStream);

    /**
     * should return the httpurlconnection inputstream
     *
     * @param url the quest url
     * @return
     */
    public InputStream getDownLoadInputStream(String url);
}

