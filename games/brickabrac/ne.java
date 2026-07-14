/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    final static void a(java.applet.Applet param0, String param1, int param2) throws Throwable {
        if (param2 != 5797) {
            return;
        }
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param0).eval(param1);
    }

    final static Object a(Object[] param0, int param1, java.applet.Applet param2, String param3) throws Throwable {
        if (param1 < 62) {
            return null;
        }
        return netscape.javascript.JSObject.getWindow(param2).call(param3, param0);
    }

    final static Object a(String param0, int param1, java.applet.Applet param2) throws Throwable {
        if (param1 > -117) {
            return null;
        }
        return netscape.javascript.JSObject.getWindow(param2).call(param0, (Object[]) null);
    }
}
