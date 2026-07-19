/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm {
    final static void a(byte param0, String param1, java.applet.Applet param2) throws Throwable {
        if (param0 != -17) {
            return;
        }
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param2).eval(param1);
    }

    final static Object a(boolean param0, String param1, Object[] param2, java.applet.Applet param3) throws Throwable {
        if (!param0) {
            return param2[12];
        }
        return netscape.javascript.JSObject.getWindow(param3).call(param1, param2);
    }

    final static Object a(int param0, String param1, java.applet.Applet param2) throws Throwable {
        if (param0 != -31183) {
            return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param2).call(param1, (Object[]) null);
    }
}
