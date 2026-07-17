/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    final static Object a(byte param0, String param1, java.applet.Applet param2, Object[] param3) throws Throwable {
        int var4 = -103 % ((param0 - -7) / 52);
        return netscape.javascript.JSObject.getWindow(param2).call(param1, param3);
    }

    final static void a(java.applet.Applet param0, String param1, byte param2) throws Throwable {
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param0).eval(param1);
    }

    final static Object a(java.applet.Applet param0, boolean param1, String param2) throws Throwable {
        if (param1) {
            return null;
        }
        return netscape.javascript.JSObject.getWindow(param0).call(param2, (Object[]) null);
    }
}
