/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eo {
    final static Object a(int param0, String param1, java.applet.Applet param2) throws Throwable {
        if (param0 != 21896) {
            return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param2).call(param1, (Object[]) null);
    }

    final static Object a(java.applet.Applet param0, Object[] param1, boolean param2, String param3) throws Throwable {
        if (param2) {
            return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param0).call(param3, param1);
    }

    final static void a(java.applet.Applet param0, int param1, String param2) throws Throwable {
        if (param1 != -31645) {
            return;
        }
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param0).eval(param2);
    }
}
