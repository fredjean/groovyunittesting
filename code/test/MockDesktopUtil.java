package com.sun.scn.ui.common.wizard;

// Skipping imports

public class MockDesktopUtil {
    public static String passedUrl;
    
    public Component loadResourceIntoParent(String uri, Component parent) {
        passedUrl = uri;
        if(parent == null) {
            throw new NullPointerException("Parent is null!");
        }
        return new Label("Blah!");
    }
}
