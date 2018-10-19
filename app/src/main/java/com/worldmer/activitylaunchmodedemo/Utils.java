package com.worldmer.activitylaunchmodedemo;

import android.app.ActivityManager;
import android.content.Context;

import java.util.List;

/**
 * Created by Yagnik on 19-Oct-18.
 */

public class Utils {


    public static String getTaskInfo(Context context) {
        String taskInfo;
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningTaskInfo> stack = activityManager.getRunningTasks(10);
        taskInfo = "No of Act :    " + stack.get(0).numActivities
                + "\n  Base  :    " + stack.get(0).baseActivity.getShortClassName()
                + "\n  Top :    " + stack.get(0).topActivity.getShortClassName();
        return taskInfo;
    }
}
