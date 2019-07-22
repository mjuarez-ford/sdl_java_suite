package com.smartdevicelink.proxy.rpc;

import com.smartdevicelink.proxy.RPCStruct;

/**
 * @since SmartDeviceLink 6.0
 */
public class TemplateConfiguration extends RPCStruct {
    /**
     * Predefined or dynamically created window template.
     * Currently only predefined window template layouts are defined.
     */
    public static final String KEY_TEMPLATE = "template";
    public static final String KEY_DAY_COLOR_SCHEME = "dayColorScheme";
    public static final String KEY_NIGHT_COLOR_SCHEME = "nightColorScheme";

    public String getKeyTemplate() {
        return KEY_TEMPLATE;
    }

    public void setDayColorScheme(TemplateColorScheme dayColorScheme) {

    }

    public TemplateColorScheme getDayColorScheme() {
        return (TemplateColorScheme) getObject(TemplateColorScheme.class, KEY_DAY_COLOR_SCHEME);
    }

    public TemplateColorScheme getNightColorScheme() {
        return (TemplateColorScheme) getObject(TemplateColorScheme.class, KEY_NIGHT_COLOR_SCHEME);
    }
}
