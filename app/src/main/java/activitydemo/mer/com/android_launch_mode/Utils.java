package activitydemo.mer.com.android_launch_mode;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;

import java.util.List;

import static activitydemo.mer.com.android_launch_mode.C_Activity.TAG;
import static android.app.ActivityManager.RunningTaskInfo;

public class Utils {
    public static void getActivityInfo(Context context) {
        ActivityManager m = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        List<RunningTaskInfo> runningTaskInfoList = m.getRunningTasks(Integer.MAX_VALUE);
        String topActivity = runningTaskInfoList.get(0).topActivity.getShortClassName();
        int numOfActivity = runningTaskInfoList.get(0).numActivities;
        Log.d(TAG, "Runing Activity : " + "Top Activity : " + topActivity + " Num of Activity : " + numOfActivity);
    }
}
