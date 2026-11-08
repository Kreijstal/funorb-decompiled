/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class JavaScriptBridge {
    final static Object callFunction(java.applet.Applet param0, int param1, String param2) throws Throwable {
        if (param1 <= 96) {
          return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param0).call(param2, (Object[]) null);
    }

    final static void evaluate(String param0, java.applet.Applet param1, int param2) throws Throwable {
        if (param2 != 269) {
          return;
        }
        netscape.javascript.JSObject.getWindow(param1).eval(param0);
    }

    final static Object callFunctionWithArgs(String param0, java.applet.Applet param1, byte param2, Object[] param3) throws Throwable {
        if (param2 != 114) {
          return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param1).call(param0, param3);
    }
}
