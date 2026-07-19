/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd {
    final static void a(int param0, java.applet.Applet param1, String param2) throws Throwable {
        Object discarded$5 = netscape.javascript.JSObject.getWindow(param1).eval(param2);
        if (param0 <= 26) {
            return;
        }
    }

    final static Object a(java.applet.Applet param0, String param1, byte param2) throws Throwable {
        if (param2 < 93) {
            return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param0).call(param1, (Object[]) null);
    }

    final static Object a(int param0, java.applet.Applet param1, String param2, Object[] param3) throws Throwable {
        if (param0 != -4476) {
            return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param1).call(param2, param3);
    }
}
