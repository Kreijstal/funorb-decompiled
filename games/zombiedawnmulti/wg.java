/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg {
    static String field_a;
    static String field_c;
    static String field_d;
    static String field_b;

    final static String a(int param0, java.applet.Applet param1) {
        try {
          int var6 = 0;
          String var2 = null;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          int var8 = 0;
          String stackIn_6_0 = null;
          String stackIn_12_0 = null;
          String stackIn_14_0 = null;
          RuntimeException stackIn_17_0 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref = null;
          RuntimeException var2_ref2 = null;
          var8 = ZombieDawnMulti.field_E ? 1 : 0;
          try {
            try {
              var2 = param1.getParameter("cookieprefix");
              var3 = var2 + "settings";
              var4 = (String) (fo.b(param1, 13093, "getcookies"));
              var5 = mk.a(';', false, var4);
              for (var6 = param0; var5.length > var6; var6++) {
                var7 = var5[var6].indexOf('=');
                if (var7 >= 0 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_6_0 = var5[var6].substring(1 + var7).trim();
                  return stackIn_6_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
            }
            if (null == oe.field_c) {
              stackIn_14_0 = param1.getParameter("settings");
              return stackIn_14_0;
            }
            stackIn_12_0 = oe.field_c;
            return stackIn_12_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = var2_ref2;
            stackIn_17_1 = new StringBuilder().append("wg.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw fa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int c(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var1_int = 0;
          while (ba.c(-1)) {
            mo.field_Jb.d(99);
            if (!mo.field_Jb.c(-85)) {
              continue;
            }
            var1_int = 1;
          }
          mo.field_Jb.a(aj.a(bo.field_d, false, bd.field_g), 56, aj.a(ka.field_t, false, vb.field_f));
          if (param0 >= -26) {
            stackIn_7_0 = 112;
            return stackIn_7_0;
          }
          if (mo.field_Jb.c(-85)) {
            var1_int = 1;
          }
          var2 = 0;
          if (var1_int != 0 &&
            mo.field_Jb.field_d >= 0) {
            var2 = oq.field_x[mo.field_Jb.field_d];
            if (var2 == 2) {
              mo.i(-38);
            }
          }
          stackIn_16_0 = var2;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "wg.C(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        field_b = null;
        field_c = null;
        if (param0 > -60) {
          field_a = (String) null;
        }
    }

    final static void b(byte param0) {
        if (param0 > 36) {
          io.a(8355711, nc.field_e, kc.field_c, wa.field_a, vo.field_m);
          return;
        }
        field_a = (String) null;
        io.a(8355711, nc.field_e, kc.field_c, wa.field_a, vo.field_m);
    }

    static {
        field_a = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
        field_b = "Day";
        field_d = "That name is not available";
        field_c = "Please try again in a few minutes.";
    }
}
