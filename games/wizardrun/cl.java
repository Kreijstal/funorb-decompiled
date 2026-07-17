/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    final static void a(java.applet.Applet param0, String param1, byte param2) throws Throwable {
        if (param2 > -88) {
            return;
        }
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param0).eval(param1);
    }

    final static Object a(java.applet.Applet param0, int param1, String param2) throws Throwable {
        return netscape.javascript.JSObject.getWindow(param0).call(param2, (Object[]) null);
    }

    final static Object a(Object[] param0, String param1, int param2, java.applet.Applet param3) throws Throwable {
        if (param2 != 30383) {
            return null;
        }
        return netscape.javascript.JSObject.getWindow(param3).call(param1, param0);
    }
}
