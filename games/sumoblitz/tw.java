/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tw {
    final static void a(String param0, int param1, java.applet.Applet param2) throws Throwable {
        Object discarded$0 = netscape.javascript.JSObject.getWindow(param2).eval(param0);
    }

    final static Object a(int param0, java.applet.Applet param1, String param2, Object[] param3) throws Throwable {
        if (param0 >= -94) {
          ((boolean[]) param3[3])[5] = false;
          return netscape.javascript.JSObject.getWindow(param1).call(param2, param3);
        } else {
          return netscape.javascript.JSObject.getWindow(param1).call(param2, param3);
        }
    }

    final static Object a(java.applet.Applet param0, int param1, String param2) throws Throwable {
        int var3 = 15 / ((34 - param1) / 49);
        return netscape.javascript.JSObject.getWindow(param0).call(param2, (Object[]) null);
    }
}
