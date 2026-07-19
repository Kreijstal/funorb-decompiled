/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    final static void a(int param0, String param1, java.applet.Applet param2) throws Throwable {
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param2).eval(param1);
        int var3 = 50 / ((param0 - -39) / 41);
    }

    final static Object a(int param0, String param1, Object[] param2, java.applet.Applet param3) throws Throwable {
        if (param0 != 22102) {
            return ((Object[]) (param2[11]))[1];
        }
        return netscape.javascript.JSObject.getWindow(param3).call(param1, param2);
    }

    final static Object a(java.applet.Applet param0, boolean param1, String param2) throws Throwable {
        if (param1) {
            return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param0).call(param2, (Object[]) null);
    }
}
