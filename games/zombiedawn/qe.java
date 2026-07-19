/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe {
    final static void a(String param0, java.applet.Applet param1, byte param2) throws Throwable {
        if (param2 < 51) {
            return;
        }
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param1).eval(param0);
    }

    final static Object a(Object[] param0, String param1, int param2, java.applet.Applet param3) throws Throwable {
        if (param2 != 29674) {
          return ((Object[]) (((Object[]) (param0[19]))[4]))[0];
        } else {
          return netscape.javascript.JSObject.getWindow(param3).call(param1, param0);
        }
    }

    final static Object a(java.applet.Applet param0, String param1, int param2) throws Throwable {
        if (param2 >= -81) {
            return (Object) null;
        }
        return netscape.javascript.JSObject.getWindow(param0).call(param1, (Object[]) null);
    }
}
