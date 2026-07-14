/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    final static void a(java.applet.Applet param0, String param1, byte param2) throws Throwable {
        if (param2 != 123) {
            return;
        }
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param0).eval(param1);
    }

    final static Object a(String param0, java.applet.Applet param1, byte param2) throws Throwable {
        if (param2 < 37) {
            return null;
        }
        return netscape.javascript.JSObject.getWindow(param1).call(param0, (Object[]) null);
    }

    final static Object a(java.applet.Applet param0, String param1, Object[] param2, int param3) throws Throwable {
        if (param3 > -36) {
            return null;
        }
        return netscape.javascript.JSObject.getWindow(param0).call(param1, param2);
    }
}
