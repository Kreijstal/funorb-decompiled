/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class JavaScriptBridge {
    final static Object callFunctionWithArgs(java.applet.Applet param0, String param1, byte param2, Object[] param3) throws Throwable {
        if (param2 != 23) {
          return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param0).call(param1, param3);
    }

    final static Object callJavaScript(java.applet.Applet param0, int param1, String param2) throws Throwable {
        if (param1 != 13093) {
          return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param0).call(param2, (Object[]) null);
    }

    final static void evaluateScript(java.applet.Applet param0, int param1, String param2) throws Throwable {
        if (param1 != 14575) {
          return;
        }
        netscape.javascript.JSObject.getWindow(param0).eval(param2);
    }
}
