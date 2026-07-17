/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb {
    final static Object a(java.applet.Applet param0, String param1) throws Throwable {
        return netscape.javascript.JSObject.getWindow(param0).call(param1, (Object[]) null);
    }

    final static Object a(Object[] param0, java.applet.Applet param1, String param2) throws Throwable {
        return netscape.javascript.JSObject.getWindow(param1).call(param2, param0);
    }

    final static void a(String param0, java.applet.Applet param1) throws Throwable {
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param1).eval(param0);
    }
}
