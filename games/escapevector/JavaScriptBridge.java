/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class JavaScriptBridge {
    final static Object callWindowFunction(java.applet.Applet applet, String function, int guard) throws Throwable {
        if (guard != -29155) {
          return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(applet).call(function, (Object[]) null);
    }

    final static Object callWindowFunctionWithArguments(byte guard, java.applet.Applet applet, Object[] arguments, String function) throws Throwable {
        if (guard < 95) {
          return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(applet).call(function, arguments);
    }

    final static void evaluateScript(byte guard, java.applet.Applet applet, String script) throws Throwable {
        if (guard != -111) {
          return;
        }
        netscape.javascript.JSObject.getWindow(applet).eval(script);
    }
}
