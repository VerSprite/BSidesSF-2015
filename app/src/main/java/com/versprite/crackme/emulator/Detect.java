package com.versprite.crackme.emulator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import android.app.Application;
import android.util.Log;



public class Detect extends Application{

    private String[] props = {"ro.secure", "ro.product.name", "ro.build.host", "ro.build.tags"};
    private Boolean d = Boolean.TRUE;

    public Boolean detectEmulator() {

        String genymotion = "buildbot.soft.genymobile.com";
        String vbox = "vbox86p";

        for(String prop : props) {
            try {
                @SuppressWarnings("rawtype")
                Class system_properties = Class.forName("android.os.SystemProperties");

                @SuppressWarnings("rawtypes")
                Class[] paramTypes = new Class[1];
                paramTypes[0] = String.class;
                Method get = system_properties.getMethod("get", paramTypes);
                Object[] params = new Object[1];
                params[0] = prop;
                String result = (String) get.invoke(system_properties, prop);

                if(result.equals(0) || result.equals(genymotion) || result.equals(vbox)){
                    Log.d("Emulator Detected!", result);
                    return d;
                }

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        return Boolean.FALSE;
    }
}
