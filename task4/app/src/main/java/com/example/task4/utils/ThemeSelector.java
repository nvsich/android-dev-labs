package com.example.task4.utils;

import android.app.Activity;

import com.example.task4.R;

import java.util.Random;

public class ThemeSelector {
    private final static int BLACK = 0;
    private final static int BLUE = 1;
    private final static int PINK = 2;
    private final static int GRAY = 3;
    private final static int GREEN = 4;
    private final static int RED = 5;
    private final static int YELLOW = 6;
    private final static int PURPLE = 7;
    private final static int ORANGE = 8;
    private final static int TEAL = 9;

    public static void changeToRandomTheme(Activity activity) {
        Random random = new Random();
        int themeNumber = random.nextInt(10);

        changeToTheme(activity, themeNumber);
    }

    private static void changeToTheme(Activity activity, int theme) {
        switch (theme) {
            case BLACK:
                activity.setTheme(R.style.Theme_Task4_Black);
                break;
            case BLUE:
                activity.setTheme(R.style.Theme_Task4_Blue);
                break;
            case PINK:
                activity.setTheme(R.style.Theme_Task4_Pink);
                break;
            case GRAY:
                activity.setTheme(R.style.Theme_Task4_Gray);
                break;
            case GREEN:
                activity.setTheme(R.style.Theme_Task4_Green);
                break;
            case RED:
                activity.setTheme(R.style.Theme_Task4_Red);
                break;
            case YELLOW:
                activity.setTheme(R.style.Theme_Task4_Yellow);
            case PURPLE:
                activity.setTheme(R.style.Theme_Task4_Purple);
                break;
            case ORANGE:
                activity.setTheme(R.style.Theme_Task4_Orange);
                break;
            case TEAL:
                activity.setTheme(R.style.Theme_Task4_Teal);
                break;
        }
    }
}
