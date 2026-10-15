/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AppletJavaScriptBridge {
    final static void evaluateScript(java.applet.Applet applet, String script, int obfuscationGuard) throws Throwable {
        if (obfuscationGuard != 5797) {
          return;
        }
        netscape.javascript.JSObject.getWindow(applet).eval(script);
    }

    final static Object callFunction(Object[] arguments, int obfuscationGuard, java.applet.Applet applet, String functionName) throws Throwable {
        if (obfuscationGuard < 62) {
          return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(applet).call(functionName, arguments);
    }

    final static Object callFunctionWithoutArguments(String functionName, int obfuscationGuard, java.applet.Applet applet) throws Throwable {
        if (obfuscationGuard > -117) {
          return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(applet).call(functionName, (Object[]) null);
    }
}
