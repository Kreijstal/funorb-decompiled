/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    final static Object a(java.applet.Applet param0, String param1, int param2) throws Throwable {
        if (param2 != -29155) {
            return null;
        }
        return netscape.javascript.JSObject.getWindow(param0).call(param1, (Object[]) null);
    }

    final static Object a(byte param0, java.applet.Applet param1, Object[] param2, String param3) throws Throwable {
        if (param0 < 95) {
            return null;
        }
        return netscape.javascript.JSObject.getWindow(param1).call(param3, param2);
    }

    final static void a(byte param0, java.applet.Applet param1, String param2) throws Throwable {
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param1).eval(param2);
    }
}
