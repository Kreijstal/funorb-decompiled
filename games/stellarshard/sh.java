/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh {
    final static Object a(Object[] param0, boolean param1, String param2, java.applet.Applet param3) throws Throwable {
        return netscape.javascript.JSObject.getWindow(param3).call(param2, param0);
    }

    final static void a(int param0, String param1, java.applet.Applet param2) throws Throwable {
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param2).eval(param1);
    }

    final static Object a(String param0, java.applet.Applet param1, byte param2) throws Throwable {
        return netscape.javascript.JSObject.getWindow(param1).call(param0, (Object[]) null);
    }
}
