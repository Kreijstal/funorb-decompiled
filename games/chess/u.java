/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    final static void a(byte param0, String param1, java.applet.Applet param2) throws Throwable {
        if (param0 != -81) {
            return;
        }
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param2).eval(param1);
    }

    final static Object a(java.applet.Applet param0, boolean param1, Object[] param2, String param3) throws Throwable {
        if (!param1) {
            return ((Object[]) param2[4])[22];
        }
        return netscape.javascript.JSObject.getWindow(param0).call(param3, param2);
    }

    final static Object a(boolean param0, String param1, java.applet.Applet param2) throws Throwable {
        if (!param0) {
            return null;
        }
        return netscape.javascript.JSObject.getWindow(param2).call(param1, (Object[]) null);
    }
}
