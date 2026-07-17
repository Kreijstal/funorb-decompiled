/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    final static Object a(String param0, int param1, java.applet.Applet param2) throws Throwable {
        return netscape.javascript.JSObject.getWindow(param2).call(param0, (Object[]) null);
    }

    final static Object a(Object[] param0, String param1, byte param2, java.applet.Applet param3) throws Throwable {
        int var4 = 16 % ((56 - param2) / 55);
        return netscape.javascript.JSObject.getWindow(param3).call(param1, param0);
    }

    final static void a(java.applet.Applet param0, String param1, int param2) throws Throwable {
        Object discarded$6 = netscape.javascript.JSObject.getWindow(param0).eval(param1);
        if (param2 != -12300) {
            return;
        }
    }
}
