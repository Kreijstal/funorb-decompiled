/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class JavaScriptBridge {
    final static void evaluate(String param0, java.applet.Applet param1, byte param2) throws Throwable {
        netscape.javascript.JSObject.getWindow(param1).eval(param0);
        int var3 = 83 % ((param2 + 7) / 52);
    }

    final static Object callWithArguments(int param0, String param1, java.applet.Applet param2, Object[] param3) throws Throwable {
        if (param0 != -3729) {
          return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param2).call(param1, param3);
    }

    final static Object callWithoutArguments(java.applet.Applet param0, String param1, int param2) throws Throwable {
        int var3 = 54 / ((param2 + 38) / 54);
        return netscape.javascript.JSObject.getWindow(param0).call(param1, (Object[]) null);
    }
}
