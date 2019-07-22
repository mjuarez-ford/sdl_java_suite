package com.smartdevicelink.proxy.rpc.enums;

/**
 * @since SmartDeviceLink 6.0
 */
public enum WindowType {
    /**
     * This window type describes the main window on a display.
     */
    MAIN,
    /**
     * A widget is a small window that the app can create to provide information and soft buttons for quick app control.
     */
    WIDGET;

    /**
     * Convert String to WindowType
     * @param value String
     * @return WindowType
     */
    public static WindowType valueForString(String value) {
        try{
            return valueOf(value);
        }catch(Exception e){
            return null;
        }
    }


}
