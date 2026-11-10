/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class JavaScriptBridge {
    final static Object callWindowFunction(java.applet.Applet param0, int param1, String param2) throws Throwable {
        if (param1 != 2864) {
          return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param0).call(param2, (Object[]) null);
    }

    final static void evaluateScript(java.applet.Applet param0, int param1, String param2) throws Throwable {
        netscape.javascript.JSObject.getWindow(param0).eval(param2);
        if (param1 != 19467) {
          return;
        }
    }

    final static Object callWithArguments(int param0, String param1, java.applet.Applet param2, Object[] param3) throws Throwable {
        if (param0 >= -57) {
          return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param2).call(param1, param3);
    }
}
