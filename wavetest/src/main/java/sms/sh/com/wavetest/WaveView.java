package sms.sh.com.wavetest;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2018\3\6 0006.
 */

public class WaveView extends View {

    private static final String TAG ="WaveView";

    private final Paint mPaint = new Paint();
    private final Path mFirstPath = new Path();
    private final Path mSecodPath = new Path();

    /**

     * @param context
     */

    public WaveView(Context context) {
        super(context);
    }

    public WaveView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public WaveView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
