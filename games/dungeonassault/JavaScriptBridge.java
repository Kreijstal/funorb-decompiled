/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class JavaScriptBridge {
    final static Object callWithoutArguments(byte param0, java.applet.Applet param1, String param2) throws Throwable {
        if (param0 != -21) {
          return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param1).call(param2, (Object[]) null);
    }

    final static void evaluate(String param0, byte param1, java.applet.Applet param2) throws Throwable {
        if (param1 != -46) {
          return;
        }
        netscape.javascript.JSObject.getWindow(param2).eval(param0);
    }

    final static Object callWithArguments(String param0, java.applet.Applet param1, int param2, Object[] param3) throws Throwable {
        if (param2 != 15647) {
          return param3[0];
        }
        return netscape.javascript.JSObject.getWindow(param1).call(param0, param3);
    }
}
