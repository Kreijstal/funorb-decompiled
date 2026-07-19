/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj {
    final static void a(byte param0, java.applet.Applet param1, String param2) throws Throwable {
        if (param0 > -38) {
            return;
        }
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param1).eval(param2);
    }

    final static Object a(String param0, byte param1, java.applet.Applet param2) throws Throwable {
        int var3 = -118 / ((38 - param1) / 39);
        return netscape.javascript.JSObject.getWindow(param2).call(param0, (Object[]) null);
    }

    final static Object a(java.applet.Applet param0, String param1, Object[] param2, int param3) throws Throwable {
        if (param3 < 60) {
            return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param0).call(param1, param2);
    }
}
