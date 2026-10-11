/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh extends me {
    static int field_m;
    static int field_n;
    static ti field_l;
    static String field_j;
    static String field_k;

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
          int var5 = 0;
          String var2 = null;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          boolean stackIn_16_0 = false;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref = null;
          RuntimeException var2_ref2 = null;
          var7 = Transmogrify.field_A ? 1 : 0;
          try {
            if (fl.field_c) {
              return true;
            }
            try {
              var2 = "tuhstatbut";
              var3 = (String) (kj.a(param0, false, "getcookies"));
              var4 = vi.a(';', var3, 0);
              for (var5 = param1; var5 < var4.length; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
            }
            stackIn_16_0 = (param0.getParameter("tuhstatbut") != null);
            return stackIn_16_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var2_ref2;
            stackIn_19_1 = new StringBuilder().append("vh.D(");
            if (param0 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw ch.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final rc a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        rc stackIn_5_0 = null;
        rc stackIn_8_0 = null;
        rc stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (tl.a(param1, 2993) != null) ? 0 : 1;
          var3_int = stackIn_3_0;
          if (param0 != 95) {
            stackIn_5_0 = (rc) null;
            return stackIn_5_0;
          }
          if (var3_int != 0) {
            stackIn_10_0 = hi.field_b;
            return stackIn_10_0;
          }
          stackIn_8_0 = ec.field_d;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("vh.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final String b(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(95, param1) == ec.field_d) {
            stackIn_3_0 = uc.field_c;
            return stackIn_3_0;
          }
          if (param0 != -1) {
            field_n = 50;
          }
          stackIn_7_0 = wj.field_i;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("vh.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_l = null;
        field_k = null;
        field_j = null;
        int var1 = 57 / ((-83 - param0) / 34);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        ba.field_q[cg.field_l] = param4;
        lk.field_d[cg.field_l] = cg.field_l;
        dk.field_k[cg.field_l] = param0;
        if (param0 < ua.field_d) {
          ue.field_a = param0;
        }
        if (!(param0 <= rc.field_c)) {
          vb.field_a = param0;
        }
        bh.field_a[cg.field_l] = param3;
        pd.field_a[cg.field_l] = param2;
        bg.field_j[cg.field_l] = param1;
        int var6 = param2 + param3 + param1;
        if (param5) {
          vh.a(59, 57, -75, 24, 38, false);
        }
        int var7 = var6 == 0 ? 0 : param3 * 1000 / var6;
        tb.field_d[cg.field_l] = var7;
        cg.field_l = cg.field_l + 1;
        if (!(vb.field_a >= var7)) {
          vb.field_a = var7;
        }
        if (var7 < ue.field_a) {
          ue.field_a = var7;
        }
    }

    vh(rg param0) {
        super(param0);
    }

    static {
        field_n = 0;
        field_j = "Start Game";
        field_k = "Unpacking languages";
    }
}
