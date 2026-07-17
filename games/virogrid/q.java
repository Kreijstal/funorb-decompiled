/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    final static void a(String param0, int param1, java.applet.Applet param2) throws Throwable {
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param2).eval(param0);
    }

    final static Object b(String param0, int param1, java.applet.Applet param2) throws Throwable {
        return netscape.javascript.JSObject.getWindow(param2).call(param0, (Object[]) null);
    }

    final static Object a(java.applet.Applet param0, int param1, Object[] param2, String param3) throws Throwable {
        return netscape.javascript.JSObject.getWindow(param0).call(param3, param2);
    }
}
