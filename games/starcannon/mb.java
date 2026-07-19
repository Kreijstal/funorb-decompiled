/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb {
    final static Object a(java.applet.Applet param0, String param1, boolean param2) throws Throwable {
        if (!param2) {
            return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param0).call(param1, (Object[]) null);
    }

    final static Object a(Object[] param0, java.applet.Applet param1, String param2, int param3) throws Throwable {
        if (param3 != -27504) {
            return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param1).call(param2, param0);
    }

    final static void a(String param0, java.applet.Applet param1, int param2) throws Throwable {
        Object discarded$6 = netscape.javascript.JSObject.getWindow(param1).eval(param0);
        if (param2 != 790) {
            return;
        }
    }
}
