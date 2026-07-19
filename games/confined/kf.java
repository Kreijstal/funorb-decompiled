/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf {
    final static Object a(int param0, String param1, java.applet.Applet param2) throws Throwable {
        if (param0 <= 73) {
            return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param2).call(param1, (Object[]) null);
    }

    final static void a(java.applet.Applet param0, boolean param1, String param2) throws Throwable {
        Object discarded$6 = netscape.javascript.JSObject.getWindow(param0).eval(param2);
        if (!param1) {
            return;
        }
    }

    final static Object a(byte param0, String param1, java.applet.Applet param2, Object[] param3) throws Throwable {
        if (param0 != 53) {
            return param3[2];
        }
        return netscape.javascript.JSObject.getWindow(param2).call(param1, param3);
    }
}
