package com.example.ap_pro_ject;

public class stickgame {
    // singelton design pattern
    private static stickhero sh1;
    private void stickhero() {
    }

    public static stickhero getInstance() {
        if (sh1 == null) {
            sh1 = new stickhero();
        }
        return sh1;
    }

    public static stickhero getSh1() {
        return sh1;
    }

    public static void setSh1(stickhero sh1) {
        stickgame.sh1 = sh1;
    }

}
