/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
    final static Object a(String param0, Object[] param1, java.applet.Applet param2, int param3) throws Throwable {
        return netscape.javascript.JSObject.getWindow(param2).call(param0, param1);
    }

    final static Object a(String param0, java.applet.Applet param1, int param2) throws Throwable {
        return netscape.javascript.JSObject.getWindow(param1).call(param0, (Object[]) null);
    }

    final static void a(java.applet.Applet param0, String param1, byte param2) throws Throwable {
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param0).eval(param1);
    }
}
