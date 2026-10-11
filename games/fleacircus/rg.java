/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg extends ef {
    static String field_r;
    static int field_p;
    static String field_q;
    static int field_n;
    static fa field_o;

    final uj a(boolean param0) {
        if (!param0) {
          rg.b(false);
        }
        return ui.field_nb;
    }

    rg(long param0, String param1) {
        super(param0, param1);
    }

    final static gm b(byte param0, String param1) {
        String var2 = null;
        gm var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_10_0 = null;
        gm stackIn_17_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var6 = fleas.field_A ? 1 : 0;
        try {
          if (null == di.field_b) {
            return null;
          }
          if (param1 == null) {
            return null;
          }
          if (0 == param1.length()) {
            return null;
          }
          var7 = (CharSequence) ((Object) param1);
          var2 = uk.a(-100, var7);
          if (var2 == null) {
            stackIn_10_0 = null;
            return (gm) (stackIn_10_0);
          }
          var3 = (gm) (di.field_b.a((long)var2.hashCode(), 16571));
          var4 = 98 % ((-92 - param0) / 33);
          while (var3 != null) {
            var8 = (CharSequence) ((Object) var3.field_jb);
            var5 = uk.a(99, var8);
            if (var5.equals(var2)) {
              stackIn_17_0 = var3;
              return stackIn_17_0;
            }
            var3 = (gm) (di.field_b.a(-111));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_22_0 = var2_ref;
          stackIn_22_1 = new StringBuilder().append("rg.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = fleas.field_A ? 1 : 0;
        try {
          if (param0 != 4) {
            field_n = 55;
          }
          for (var1_int = 0; var1_int < 40; var1_int++) {
            qg.field_a[var1_int] = rk.field_s;
            dh.field_b[var1_int] = ck.field_o;
            ge.field_a[var1_int] = -4;
            cl.field_d[var1_int] = 0;
            jd.field_o[var1_int] = 0;
            nb.field_b = 0;
            qg.field_c = 149;
            va.field_t[var1_int] = 0;
            lh.field_e[qg.field_a[var1_int] / 4][dh.field_b[var1_int] / 4] = 1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "rg.F(" + param0 + ')');
        }
    }

    final static void a(int param0, dd param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var16 = 0;
        int var17 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var18 = 0;
        int var19 = 0;
        dd var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var29 = null;
        int[] var30 = null;
        var19 = fleas.field_A ? 1 : 0;
        try {
          if (gb.field_l > param0) {
            param2 = param2 - (gb.field_l - param0);
            param0 = gb.field_l;
          }
          if (param2 + param0 > gb.field_h) {
            param2 = gb.field_h - param0;
          }
          if (gb.field_b > param7) {
            param3 = param3 - (-param7 + gb.field_b);
            param7 = gb.field_b;
          }
          if (param7 + param3 > gb.field_i) {
            param3 = gb.field_i - param7;
          }
          if (param2 > 0 &&
            param3 > 0) {
            var21 = param1.c();
            var30 = gb.field_a;
            var10 = gb.field_d;
            var11 = gb.field_k;
            var29 = new int[4];
            gb.a(var29);
            param1.f();
            gb.g(var29[0], var29[1], var29[2], var29[3]);
            var13 = param7 * param1.field_w + param0;
            var14 = param1.field_w - param2;
            var25 = var21.field_B;
            var22 = var25;
            var15 = var22;
            for (var16 = param7; param3 + param7 > var16; var16++) {
              for (var17 = param0; var17 < param2 + param0; var17++) {
                var18 = var25[var13];
                if (0 != var18) {
                  if (var17 > 0 &&
                    var15[-1 + var13] == 0) {
                    gb.f(var17, var16, param6, param4);
                  } else {
                    if (var16 > 0 &&
                      var15[-param1.field_w + var13] == 0) {
                      gb.f(var17, var16, param6, param4);
                    } else {
                      if (-1 + param1.field_w > var17 &&
                        var15[1 + var13] == 0) {
                        gb.f(var17, var16, param6, param4);
                      } else {
                        if (var16 < param1.field_t - 1 &&
                          0 == var15[var13 + param1.field_w]) {
                          gb.f(var17, var16, param6, param4);
                        }
                      }
                    }
                  }
                }
                var13++;
              }
              var13 = var13 + var14;
            }
            var21.d(-param1.field_q, -param1.field_v);
            gb.a(var30, var10, var11);
            gb.b(var29);
            if (param5 > -3) {
              field_n = 126;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_44_0 = var8;
          stackIn_44_1 = new StringBuilder().append("rg.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_o = null;
        if (!param0) {
          String var2 = (String) null;
          rg.b((byte) 68, (String) null);
        }
        field_q = null;
        field_r = null;
    }

    static {
        field_r = "You have <%0> unread messages!";
        field_q = "Loading fonts";
        field_p = 0;
    }
}
