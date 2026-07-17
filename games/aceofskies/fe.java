/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe {
    final static void a(java.applet.Applet param0, int param1, String param2) throws Throwable {
        if (param1 != -7012) {
            return;
        }
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param0).eval(param2);
    }

    final static Object a(String param0, int param1, Object[] param2, java.applet.Applet param3) throws Throwable {
        if (param1 != -15201) {
            return null;
        }
        return netscape.javascript.JSObject.getWindow(param3).call(param0, param2);
    }

    final static Object a(String param0, byte param1, java.applet.Applet param2) throws Throwable {
        if (param1 != -108) {
            return null;
        }
        return netscape.javascript.JSObject.getWindow(param2).call(param0, (Object[]) null);
    }
}
