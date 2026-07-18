/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac {
    final static Object a(java.applet.Applet param0, String param1, byte param2) throws Throwable {
        return netscape.javascript.JSObject.getWindow(param0).call(param1, (Object[]) null);
    }

    final static void a(String param0, java.applet.Applet param1, int param2) throws Throwable {
        Object discarded$5 = netscape.javascript.JSObject.getWindow(param1).eval(param0);
        if (param2 < 97) {
            return;
        }
    }

    final static Object a(java.applet.Applet param0, String param1, Object[] param2, byte param3) throws Throwable {
        return netscape.javascript.JSObject.getWindow(param0).call(param1, param2);
    }
}
