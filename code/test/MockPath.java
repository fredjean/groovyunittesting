package com.sun.scn.ui.common.wizard;

import org.zkoss.zk.ui.Component;
import org.zkoss.zul.Window;

public class MockPath {
    public static String passedPath;

    public static Component getComponent(String path) {
        passedPath = path;
        return new Window();
    }
}