/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends q {
    static eb field_k;
    static String field_m;
    int field_l;
    int field_j;

    final static void a(java.awt.Component param0, int param1) {
        try {
          param0.removeKeyListener(ha.field_b);
          param0.removeFocusListener(ha.field_b);
          hb.field_y = param1;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "og.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0) {
        String var2 = (String) null;
        uj.a((String) null, -32082, "");
        int var1 = 51 / ((param0 - 47) / 32);
    }

    public static void a(byte param0) {
        field_m = null;
        field_k = null;
        if (param0 <= 124) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          og.a((java.net.URL) null, (java.applet.Applet) null, (byte) 62);
        }
    }

    final static java.net.URL a(java.net.URL param0, java.applet.Applet param1, byte param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          if (param2 > -65) {
            field_m = (String) null;
          }
          var4 = null;
          if (rd.field_t != null &&
            !rd.field_t.equals(param1.getParameter("settings"))) {
            var3 = rd.field_t;
            var4 = var3;
            var4 = var3;
          }
          if (null != jb.field_e &&
            !jb.field_e.equals(param1.getParameter("session"))) {
            var4 = jb.field_e;
          }
          stackIn_10_0 = pg.a(-1, (String) (var4), param0, 47, (String) (var3));
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("og.C(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rb.a((Throwable) (stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    private og() throws Throwable {
        throw new Error();
    }

    static {
        field_k = new eb(64);
    }
}
