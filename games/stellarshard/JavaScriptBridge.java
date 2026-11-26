/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class JavaScriptBridge {
    final static Object callWithArguments(Object[] param0, boolean param1, String param2, java.applet.Applet param3) throws Throwable {
        if (param1) {
          return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param3).call(param2, param0);
    }

    final static void evaluate(int param0, String param1, java.applet.Applet param2) throws Throwable {
        if (param0 != -13847) {
          return;
        }
        netscape.javascript.JSObject.getWindow(param2).eval(param1);
    }

    final static Object callWithoutArguments(String param0, java.applet.Applet param1, byte param2) throws Throwable {
        if (param2 != 78) {
          return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param1).call(param0, (Object[]) null);
    }
}
