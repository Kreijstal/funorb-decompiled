/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    final static Object a(java.applet.Applet param0, int param1, Object[] param2, String param3) throws Throwable {
        if (param1 != -11455) {
            return null;
        }
        return netscape.javascript.JSObject.getWindow(param0).call(param3, param2);
    }

    final static void a(boolean param0, String param1, java.applet.Applet param2) throws Throwable {
        if (!param0) {
            return;
        }
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param2).eval(param1);
    }

    final static Object a(String param0, java.applet.Applet param1, boolean param2) throws Throwable {
        return netscape.javascript.JSObject.getWindow(param1).call(param0, (Object[]) null);
    }
}
