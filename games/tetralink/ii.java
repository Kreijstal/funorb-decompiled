/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii {
    final static Object a(byte param0, String param1, java.applet.Applet param2) throws Throwable {
        if (param0 < 50) {
            return null;
        }
        return netscape.javascript.JSObject.getWindow(param2).call(param1, (Object[]) null);
    }

    final static void a(int param0, String param1, java.applet.Applet param2) throws Throwable {
        if (param0 != -19149) {
            return;
        }
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param2).eval(param1);
    }

    final static Object a(Object[] param0, int param1, String param2, java.applet.Applet param3) throws Throwable {
        if (param1 != 6760) {
            return param0[4];
        }
        return netscape.javascript.JSObject.getWindow(param3).call(param2, param0);
    }
}
