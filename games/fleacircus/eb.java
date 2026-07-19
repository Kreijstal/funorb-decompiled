/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    final static Object a(String param0, Object[] param1, int param2, java.applet.Applet param3) throws Throwable {
        if (param2 != -11745) {
            return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param3).call(param0, param1);
    }

    final static void a(String param0, int param1, java.applet.Applet param2) throws Throwable {
        Object discarded$6 = netscape.javascript.JSObject.getWindow(param2).eval(param0);
        if (param1 != -28924) {
            return;
        }
    }

    final static Object a(String param0, java.applet.Applet param1, int param2) throws Throwable {
        if (param2 != -250) {
            return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param1).call(param0, (Object[]) null);
    }
}
