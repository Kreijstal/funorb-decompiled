/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd {
    final static void a(java.applet.Applet param0, int param1, String param2) throws Throwable {
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param0).eval(param2);
    }

    final static Object a(java.applet.Applet param0, String param1, Object[] param2, int param3) throws Throwable {
        return netscape.javascript.JSObject.getWindow(param0).call(param1, param2);
    }

    final static Object a(byte param0, String param1, java.applet.Applet param2) throws Throwable {
        return netscape.javascript.JSObject.getWindow(param2).call(param1, (Object[]) null);
    }
}
