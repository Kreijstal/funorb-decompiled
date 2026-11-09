/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BrowserScriptBridge {
    final static void evaluateScript(String script, int guard, java.applet.Applet applet) throws Throwable {
        if (guard != -15428) {
          return;
        }
        netscape.javascript.JSObject.getWindow(applet).eval(script);
    }

    final static Object call(int guard, java.applet.Applet applet, String functionName, Object[] arguments) throws Throwable {
        if (guard < -94) {
          return netscape.javascript.JSObject.getWindow(applet).call(functionName, arguments);
        }
        ((boolean[]) (arguments[3]))[5] = false;
        return netscape.javascript.JSObject.getWindow(applet).call(functionName, arguments);
    }

    final static Object call(java.applet.Applet applet, int guard, String functionName) throws Throwable {
        int var3 = 15 / ((34 - guard) / 49);
        return netscape.javascript.JSObject.getWindow(applet).call(functionName, (Object[]) null);
    }
}
