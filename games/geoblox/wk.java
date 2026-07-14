/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk {
    final static Object a(int param0, Object[] param1, java.applet.Applet param2, String param3) throws Throwable {
        if (param0 != -14882) {
            return null;
        }
        return netscape.javascript.JSObject.getWindow(param2).call(param3, param1);
    }

    final static Object a(byte param0, java.applet.Applet param1, String param2) throws Throwable {
        if (param0 != -6) {
            return null;
        }
        return netscape.javascript.JSObject.getWindow(param1).call(param2, (Object[]) null);
    }

    final static void a(java.applet.Applet param0, String param1, byte param2) throws Throwable {
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param0).eval(param1);
        int var3 = -79 % ((param2 - 64) / 58);
    }
}
