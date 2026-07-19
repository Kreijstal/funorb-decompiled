/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mo {
    final static Object a(byte param0, String param1, java.applet.Applet param2) throws Throwable {
        int var3 = 88 / ((64 - param0) / 58);
        return netscape.javascript.JSObject.getWindow(param2).call(param1, (Object[]) null);
    }

    final static Object a(String param0, Object[] param1, int param2, java.applet.Applet param3) throws Throwable {
        if (param2 < 67) {
            return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param3).call(param0, param1);
    }

    final static void a(String param0, java.applet.Applet param1, byte param2) throws Throwable {
        if (param2 != 35) {
            return;
        }
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param1).eval(param0);
    }
}
