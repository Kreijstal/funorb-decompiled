/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac {
    final static Object a(java.applet.Applet param0, String param1, int param2) throws Throwable {
        return netscape.javascript.JSObject.getWindow(param0).call(param1, (Object[]) null);
    }

    final static Object a(boolean param0, Object[] param1, java.applet.Applet param2, String param3) throws Throwable {
        return netscape.javascript.JSObject.getWindow(param2).call(param3, param1);
    }

    final static void a(byte param0, java.applet.Applet param1, String param2) throws Throwable {
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param1).eval(param2);
    }
}
