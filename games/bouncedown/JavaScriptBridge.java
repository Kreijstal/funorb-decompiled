/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class JavaScriptBridge {
    final static Object callWithoutArguments(java.applet.Applet param0, String param1, int param2) throws Throwable {
        if (param2 != -31185) {
          return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param0).call(param1, (Object[]) null);
    }

    final static Object callWithArguments(boolean param0, Object[] param1, java.applet.Applet param2, String param3) throws Throwable {
        if (!param0) {
          return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param2).call(param3, param1);
    }

    final static void evaluate(byte param0, java.applet.Applet param1, String param2) throws Throwable {
        netscape.javascript.JSObject.getWindow(param1).eval(param2);
        if (param0 != 91) {
          return;
        }
    }
}
