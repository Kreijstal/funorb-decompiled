/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a {
    final static Object a(java.applet.Applet param0, Object[] param1, String param2, int param3) throws Throwable {
        if (param3 != -13730) {
            return param1[5];
        }
        return netscape.javascript.JSObject.getWindow(param0).call(param2, param1);
    }

    final static Object a(String param0, java.applet.Applet param1, int param2) throws Throwable {
        if (param2 >= -119) {
            return null;
        }
        return netscape.javascript.JSObject.getWindow(param1).call(param0, (Object[]) null);
    }

    final static void a(java.applet.Applet param0, int param1, String param2) throws Throwable {
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param0).eval(param2);
    }
}
