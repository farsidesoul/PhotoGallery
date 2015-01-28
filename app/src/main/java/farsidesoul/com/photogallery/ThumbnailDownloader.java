package farsidesoul.com.photogallery;

import android.os.HandlerThread;
import android.util.Log;

/**
 * Created by dlumley on 28/01/2015.
 */
public class ThumbnailDownloader<Token> extends HandlerThread {
    private static final String TAG = "ThumbnailDownloader";

    public ThumbnailDownloader(){
        super(TAG);
    }

    public void queueThumbnail(Token token, String url){
        Log.i(TAG, "Got an URL: " + url);
    }
}
