/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class JavaScriptBridge {
    final static Object callWithArguments(java.applet.Applet param0, Object[] param1, String param2, int param3) throws Throwable {
        if (param3 != -13730) {
          return param1[5];
        }
        return netscape.javascript.JSObject.getWindow(param0).call(param2, param1);
    }

    final static Object callWithoutArguments(String param0, java.applet.Applet param1, int param2) throws Throwable {
        if (param2 >= -119) {
          return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param1).call(param0, (Object[]) null);
    }

    final static void evaluate(java.applet.Applet param0, int param1, String param2) throws Throwable {
        if (param1 != 17467) {
          return;
        }
        netscape.javascript.JSObject.getWindow(param0).eval(param2);
    }
}
