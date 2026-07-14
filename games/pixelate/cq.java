/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cq {
    final static Object a(java.applet.Applet param0, byte param1, Object[] param2, String param3) throws Throwable {
        int var4 = -44 / ((13 - param1) / 49);
        return netscape.javascript.JSObject.getWindow(param0).call(param3, param2);
    }

    final static Object a(String param0, byte param1, java.applet.Applet param2) throws Throwable {
        if (param1 >= -38) {
            return null;
        }
        return netscape.javascript.JSObject.getWindow(param2).call(param0, (Object[]) null);
    }

    final static void a(java.applet.Applet param0, byte param1, String param2) throws Throwable {
        Object discarded$5 = netscape.javascript.JSObject.getWindow(param0).eval(param2);
        if (param1 > -111) {
            return;
        }
    }
}
