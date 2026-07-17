/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee {
    final static Object a(byte param0, java.applet.Applet param1, String param2) throws Throwable {
        return netscape.javascript.JSObject.getWindow(param1).call(param2, (Object[]) null);
    }

    final static void a(String param0, byte param1, java.applet.Applet param2) throws Throwable {
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param2).eval(param0);
    }

    final static Object a(String param0, java.applet.Applet param1, int param2, Object[] param3) throws Throwable {
        if (param2 != 15647) {
            return param3[0];
        }
        return netscape.javascript.JSObject.getWindow(param1).call(param0, param3);
    }
}
