/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm {
    final static Object a(Object[] param0, java.applet.Applet param1, String param2, int param3) throws Throwable {
        if (param3 != 25449) {
            return null;
        }
        return netscape.javascript.JSObject.getWindow(param1).call(param2, param0);
    }

    final static Object a(int param0, String param1, java.applet.Applet param2) throws Throwable {
        if (param0 != 30858) {
            return null;
        }
        return netscape.javascript.JSObject.getWindow(param2).call(param1, (Object[]) null);
    }

    final static void a(String param0, java.applet.Applet param1, byte param2) throws Throwable {
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param1).eval(param0);
        int var3 = 86 / ((param2 - 62) / 32);
    }
}
