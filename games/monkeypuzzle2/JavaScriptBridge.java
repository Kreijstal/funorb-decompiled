/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class JavaScriptBridge {
    final static Object callWithArguments(int param0, String param1, java.applet.Applet param2, Object[] param3) throws Throwable {
        if (param0 <= 120) {
          return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param2).call(param1, param3);
    }

    final static Object callWithoutArguments(int param0, String param1, java.applet.Applet param2) throws Throwable {
        if (param0 != -26159) {
          return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param2).call(param1, (Object[]) null);
    }

    final static void evaluate(boolean param0, java.applet.Applet param1, String param2) throws Throwable {
        if (!param0) {
          return;
        }
        netscape.javascript.JSObject.getWindow(param1).eval(param2);
    }
}
