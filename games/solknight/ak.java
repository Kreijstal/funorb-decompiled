/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    static String field_c;
    static o[] field_e;
    static String[] field_b;
    static String[] field_d;
    static int field_a;

    final static void a(int param0, int param1, String[] param2, boolean param3, int param4, java.applet.Applet param5) {
        int var7 = 0;
        String var6 = null;
        int var8 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          n.field_c = param5.getParameter("overxgames");
          if (n.field_c == null) {
            n.field_c = "0";
          }
          sf.field_b = param5.getParameter("overxachievements");
          if (sf.field_b == null) {
            sf.field_b = "0";
          }
          var6 = param5.getParameter("currency");
          if (var6 == null) {
            uf.field_q = 2;
          } else {
            if (!ec.a(30418, (CharSequence) ((Object) var6))) {
              uf.field_q = 2;
            } else {
              uf.field_q = il.a((CharSequence) ((Object) var6), 6054);
            }
          }
          rb.field_f = param1;
          id.field_a = param0;
          ea.field_o = param4;
          qd.field_e = new o[param2.length];
          if (!param3) {
            field_d = (String[]) null;
          }
          for (var7 = 0; param2.length > var7; var7++) {
            qd.field_e[var7] = new o(317, 34);
          }
          ba.field_s = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_21_0 = var6_ref;
          stackIn_21_1 = new StringBuilder().append("ak.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != 3327) {
          return;
        }
        field_c = null;
        field_d = null;
        field_e = null;
        field_b = null;
    }

    final static boolean a(int param0) {
        if (param0 != 60) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          ak.a(-96, -50, (String[]) null, true, -119, (java.applet.Applet) null);
          if (null == lf.field_d) {
            return false;
          }
          if (ef.field_e.a(80)) {
            return true;
          }
          return false;
        }
        if (null == lf.field_d) {
          return false;
        }
        if (ef.field_e.a(80)) {
          return true;
        }
        return false;
    }

    final static int a(boolean param0) {
        if (kj.field_R < 2) {
          return 0;
        }
        if (0 == vd.field_b) {
          if (!lh.field_o.c((byte) -121)) {
            return 20;
          }
          if (!lh.field_o.a(2, "commonui")) {
            return 40;
          }
          if (!wk.field_c.c((byte) -121)) {
            return 50;
          }
          if (!wk.field_c.a(2, "commonui")) {
            return 60;
          }
          if (!jk.field_ub.c((byte) -121)) {
            return 70;
          }
          if (!jk.field_ub.b(true)) {
            return 80;
          }
        } else {
          if (null != af.field_c) {
            if (!af.field_c.c((byte) -121)) {
              return 14;
            }
            if (!af.field_c.b(82, "")) {
              return 29;
            }
            if (!af.field_c.a(2, "")) {
              return 29;
            }
          }
          if (!lh.field_o.c((byte) -121)) {
            return 43;
          }
          if (!lh.field_o.a(2, "commonui")) {
            return 57;
          }
          if (!wk.field_c.c((byte) -121)) {
            return 71;
          }
          if (!wk.field_c.a(2, "commonui")) {
            return 80;
          }
          if (!jk.field_ub.c((byte) -121)) {
            return 82;
          }
          if (!jk.field_ub.b(param0)) {
            return 86;
          }
        }
        if (param0) {
          return 100;
        }
        field_a = -19;
        return 100;
    }

    static {
        field_c = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_d = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
