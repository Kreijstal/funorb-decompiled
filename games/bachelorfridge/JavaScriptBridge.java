/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class JavaScriptBridge {
    final static Object callWithoutArguments(java.applet.Applet param0, String param1, byte param2) throws Throwable {
        if (param2 != 64) {
          return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param0).call(param1, (Object[]) null);
    }

    final static void evaluate(String param0, java.applet.Applet param1, int param2) throws Throwable {
        netscape.javascript.JSObject.getWindow(param1).eval(param0);
        if (param2 < 97) {
          return;
        }
    }

    final static Object callWithArguments(java.applet.Applet param0, String param1, Object[] param2, byte param3) throws Throwable {
        if (param3 != 73) {
          return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param0).call(param1, param2);
    }
}
