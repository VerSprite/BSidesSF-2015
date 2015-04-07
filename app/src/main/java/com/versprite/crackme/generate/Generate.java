package com.versprite.crackme.generate;

import java.util.Arrays;
import android.app.Application;

public class Generate extends Application{

    public Boolean c(String key) {

        byte b[] = {0x42, 0x73, 0x31, 0x64, 0x33, 0x73, 0x5F, 0x53, 0x46, 0x30};
        byte k[] = key.getBytes();

        if(Arrays.equals(b, k)){
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }
}
