/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    final static void a(java.applet.Applet param0, String param1, int param2) throws Throwable {
        Object discarded$6 = netscape.javascript.JSObject.getWindow(param0).eval(param1);
        if (param2 != -24531) {
            return;
        }
    }

    final static Object a(byte param0, String param1, java.applet.Applet param2) throws Throwable {
        if (param0 >= -4) {
            return null;
        }
        return netscape.javascript.JSObject.getWindow(param2).call(param1, (Object[]) null);
    }

    final static Object a(java.applet.Applet param0, Object[] param1, int param2, String param3) throws Throwable {
        return netscape.javascript.JSObject.getWindow(param0).call(param3, param1);
    }
}
