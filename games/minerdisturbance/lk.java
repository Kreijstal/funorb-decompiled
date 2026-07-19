/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk {
    final static void a(java.applet.Applet param0, String param1, byte param2) throws Throwable {
        Object discarded$6 = netscape.javascript.JSObject.getWindow(param0).eval(param1);
        if (param2 != -106) {
            return;
        }
    }

    final static Object a(String param0, java.applet.Applet param1, int param2, Object[] param3) throws Throwable {
        if (param2 != 16715) {
            return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param1).call(param0, param3);
    }

    final static Object a(byte param0, String param1, java.applet.Applet param2) throws Throwable {
        if (param0 != 18) {
            return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param2).call(param1, (Object[]) null);
    }
}
