/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb {
    static he[] field_a;
    static he[] field_b;
    static java.security.SecureRandom field_c;

    final static void a(java.applet.Applet param0, int param1, int param2, int param3, String[] param4, int param5) {
        int var7 = 0;
        String var6 = null;
        int var8 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param1 != 2) {
            wb.a(123);
          }
          dc.field_f = param0.getParameter("overxgames");
          if (null == dc.field_f) {
            dc.field_f = "0";
          }
          fl.field_d = param0.getParameter("overxachievements");
          if (null == fl.field_d) {
            fl.field_d = "0";
          }
          var6 = param0.getParameter("currency");
          if (var6 != null &&
            jf.a((CharSequence) ((Object) var6), 7552)) {
            gd.field_a = hh.a(10, (CharSequence) ((Object) var6));
          } else {
            gd.field_a = 2;
          }
          em.field_d = param3;
          rh.field_e = param5;
          qf.field_d = param2;
          bh.field_c = new nh[param4.length];
          for (var7 = 0; var7 < param4.length; var7++) {
            bh.field_c[var7] = new nh(317, 34);
          }
          bc.field_b = param4;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_20_0 = var6_ref;
          stackIn_20_1 = new StringBuilder().append("wb.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (param0 != 34) {
          return;
        }
        hl.field_d = false;
        r.field_d = 8;
    }

    public static void b(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != 34) {
          wb.a(84);
        }
    }

    final static void a(boolean param0, int param1, je param2) {
        aa.field_e.a(param2, 255);
        if (!param0) {
          return;
        }
        try {
          hl.a(param2, 126, param1);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "wb.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new he[1];
    }
}
