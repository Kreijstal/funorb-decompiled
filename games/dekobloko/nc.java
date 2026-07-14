/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc {
    final static void a(byte param0, java.applet.Applet param1, String param2) throws Throwable {
        Object discarded$6 = netscape.javascript.JSObject.getWindow(param1).eval(param2);
        if (param0 != -51) {
            return;
        }
    }

    final static Object a(String param0, int param1, java.applet.Applet param2, Object[] param3) throws Throwable {
        if (param1 != -14541) {
            return null;
        }
        return netscape.javascript.JSObject.getWindow(param2).call(param0, param3);
    }

    final static Object a(boolean param0, String param1, java.applet.Applet param2) throws Throwable {
        if (!param0) {
            return null;
        }
        return netscape.javascript.JSObject.getWindow(param2).call(param1, (Object[]) null);
    }
}
