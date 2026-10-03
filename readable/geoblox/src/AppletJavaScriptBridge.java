/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AppletJavaScriptBridge {
    final static Object callWithArguments(int callGuard, Object[] arguments, java.applet.Applet applet, String functionName) throws Throwable {
        if (callGuard != -14882) {
            return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(applet).call(functionName, arguments);
    }

    final static Object callWithoutArguments(byte callGuard, java.applet.Applet applet, String functionName) throws Throwable {
        if (callGuard != -6) {
            return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(applet).call(functionName, (Object[]) null);
    }

    final static void evaluateScript(java.applet.Applet applet, String script, byte scriptGuard) throws Throwable {
        netscape.javascript.JSObject.getWindow(applet).eval(script);
        int unusedGuardRemainder = -79 % ((scriptGuard - 64) / 58);
    }
}
