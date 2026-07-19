/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa {
    final static void a(String param0, java.applet.Applet param1, int param2) throws Throwable {
        if (param2 != -30196) {
            return;
        }
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param1).eval(param0);
    }

    final static Object a(boolean param0, java.applet.Applet param1, String param2) throws Throwable {
        if (!param0) {
            return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param1).call(param2, (Object[]) null);
    }

    final static Object a(java.applet.Applet param0, int param1, String param2, Object[] param3) throws Throwable {
        if (param1 != 22347) {
            return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param0).call(param2, param3);
    }
}
