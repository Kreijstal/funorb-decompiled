/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei {
    final static Object a(java.applet.Applet param0, int param1, String param2) throws Throwable {
        if (param1 <= 96) {
            return null;
        }
        return netscape.javascript.JSObject.getWindow(param0).call(param2, (Object[]) null);
    }

    final static void a(String param0, java.applet.Applet param1) throws Throwable {
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param1).eval(param0);
    }

    final static Object a(String param0, java.applet.Applet param1, byte param2, Object[] param3) throws Throwable {
        return netscape.javascript.JSObject.getWindow(param1).call(param0, param3);
    }
}
