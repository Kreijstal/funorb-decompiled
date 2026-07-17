/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    final static Object a(int param0, String param1, java.applet.Applet param2, Object[] param3) throws Throwable {
        if (param0 <= 120) {
            return null;
        }
        return netscape.javascript.JSObject.getWindow(param2).call(param1, param3);
    }

    final static Object a(int param0, String param1, java.applet.Applet param2) throws Throwable {
        if (param0 != -26159) {
            return null;
        }
        return netscape.javascript.JSObject.getWindow(param2).call(param1, (Object[]) null);
    }

    final static void a(boolean param0, java.applet.Applet param1, String param2) throws Throwable {
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param1).eval(param2);
    }
}
