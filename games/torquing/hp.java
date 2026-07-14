/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hp {
    final static Object a(java.applet.Applet param0, Object[] param1, int param2, String param3) throws Throwable {
        if (param2 != 28989) {
            return param1[10];
        }
        return netscape.javascript.JSObject.getWindow(param0).call(param3, param1);
    }

    final static Object a(java.applet.Applet param0, byte param1, String param2) throws Throwable {
        if (param1 != -85) {
            return null;
        }
        return netscape.javascript.JSObject.getWindow(param0).call(param2, (Object[]) null);
    }

    final static void a(String param0, int param1, java.applet.Applet param2) throws Throwable {
        if (param1 != 27476) {
            return;
        }
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param2).eval(param0);
    }
}
