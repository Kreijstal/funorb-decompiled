/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fo {
    final static Object a(java.applet.Applet param0, String param1, byte param2, Object[] param3) throws Throwable {
        return netscape.javascript.JSObject.getWindow(param0).call(param1, param3);
    }

    final static Object b(java.applet.Applet param0, int param1, String param2) throws Throwable {
        return netscape.javascript.JSObject.getWindow(param0).call(param2, (Object[]) null);
    }

    final static void a(java.applet.Applet param0, int param1, String param2) throws Throwable {
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param0).eval(param2);
    }
}
