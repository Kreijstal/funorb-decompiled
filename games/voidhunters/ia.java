/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia {
    final static Object a(Object[] param0, java.applet.Applet param1, String param2, byte param3) throws Throwable {
        int var4 = 39 / ((param3 - 8) / 48);
        return netscape.javascript.JSObject.getWindow(param1).call(param2, param0);
    }

    final static Object a(java.applet.Applet param0, String param1, int param2) throws Throwable {
        if (param2 != 12348) {
            return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param0).call(param1, (Object[]) null);
    }

    final static void a(byte param0, java.applet.Applet param1, String param2) throws Throwable {
        if (param0 > -110) {
            return;
        }
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param1).eval(param2);
    }
}
