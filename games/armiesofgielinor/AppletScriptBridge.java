/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AppletScriptBridge {
    final static void evaluateScript(byte obfuscationGuard, java.applet.Applet applet, String script) throws Throwable {
        if (obfuscationGuard > -38) {
          return;
        }
        netscape.javascript.JSObject.getWindow(applet).eval(script);
    }

    final static Object callScriptFunction(String functionName, byte obfuscationGuard, java.applet.Applet applet) throws Throwable {
        int var3 = -118 / ((38 - obfuscationGuard) / 39);
        return netscape.javascript.JSObject.getWindow(applet).call(functionName, (Object[]) null);
    }

    final static Object callScriptFunction(java.applet.Applet applet, String functionName, Object[] arguments, int obfuscationGuard) throws Throwable {
        if (obfuscationGuard < 60) {
          return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(applet).call(functionName, arguments);
    }
}
