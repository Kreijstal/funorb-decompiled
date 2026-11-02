/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class JavaScriptBridge {
    final static Object callWindowFunctionWithArguments(String param0, byte param1, java.applet.Applet param2, Object[] param3) throws Throwable {
        if (param1 != -41) {
          return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param2).call(param0, param3);
    }

    final static Object callWindowFunction(java.applet.Applet param0, byte param1, String param2) throws Throwable {
        if (param1 != -96) {
          return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param0).call(param2, (Object[]) null);
    }

    final static void a(java.applet.Applet param0, int param1, String param2) throws Throwable {
        netscape.javascript.JSObject.getWindow(param0).eval(param2);
        if (param1 != 27781) {
          return;
        }
    }
}
