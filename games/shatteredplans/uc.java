/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc extends vd {
    static int field_v;
    static String field_z;
    static String field_y;
    static boolean field_B;
    static int field_A;
    private int field_x;
    private int field_u;
    static int[] field_w;

    final static ro a(int param0, String param1) {
        ro stackIn_4_0 = null;
        ro stackIn_7_0 = null;
        ro stackIn_11_0 = null;
        int stackIn_20_0 = 0;
        ro stackIn_24_0 = null;
        ro stackIn_38_0 = null;
        ro stackIn_42_0 = null;
        ro stackIn_48_0 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_4_0 = fg.field_a;
            return stackIn_4_0;
          }
          if (var2_int > 64) {
            stackIn_7_0 = cm.field_e;
            return stackIn_7_0;
          }
          if (param1.charAt(0) == 34) {
            if (param1.charAt(-1 + var2_int) != 34) {
              stackIn_11_0 = as.field_t;
              return stackIn_11_0;
            }
            var3 = 0;
            for (var4 = 1; -1 + var2_int > var4; var4++) {
              var5 = param1.charAt(var4);
              if (var5 == 92) {
                stackIn_20_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_20_0;
              } else {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_24_0 = as.field_t;
                  return stackIn_24_0;
                }
                var3 = 0;
              }
            }
            return null;
          }
          var3Lifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < var2_int; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param1.charAt(var4Lifetime1);
            if (var5Lifetime1 == 46) {
              if (0 != var4Lifetime1 &&
                var4Lifetime1 != -1 + var2_int &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_38_0 = as.field_t;
                return stackIn_38_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (hr.field_c.indexOf(var5Lifetime1) == -1) {
                stackIn_42_0 = as.field_t;
                return stackIn_42_0;
              }
              var3Lifetime1 = 0;
            }
          }
          if (param0 < -43) {
            return null;
          }
          stackIn_48_0 = (ro) null;
          return stackIn_48_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_52_0 = var2;
          stackIn_52_1 = new StringBuilder().append("uc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(')').toString());
        }
    }

    final static hh a(byte[] param0, int param1) {
        hh var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        hh stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            stackIn_2_0 = null;
            return (hh) (stackIn_2_0);
          }
          var2 = new hh(param0, cf.field_H, sj.field_a, mc.field_s, cm.field_g, hd.field_q);
          pd.a(param1 ^ param1);
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("uc.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void e(byte param0) {
        field_z = null;
        field_w = null;
        if (param0 <= 61) {
          byte[] var2 = (byte[]) null;
          uc.a((byte[]) null, -44);
        }
        field_y = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, String param5, boolean param6, bi[] param7, byte param8, int param9, bi[] param10, nq param11, boolean param12, int param13, int param14) {
        try {
          if (param8 != -87) {
            uc.e((byte) -47);
          }
          ub.a(param2, param11, nr.field_h, param1, param3, param9, param11, param4, em.field_j, 0, param1, new v(param10), param2, ih.field_b, wo.field_a, param13, param0, dn.field_l, qi.field_j, new v(param7));
          kb.a(param6, true, param12, param14, param5);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "uc.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ',' + param9 + ',' + (param10 != null ? "{...}" : "null") + ',' + (param11 != null ? "{...}" : "null") + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    final static boolean d(byte param0) {
        if (-1 == rr.field_t) {
          if (!es.a(-57, 1)) {
            return false;
          }
          rr.field_t = sa.field_a.j(-54);
          sa.field_a.field_j = 0;
        }
        if (-2 == rr.field_t) {
          if (!es.a(118, 2)) {
            return false;
          }
          rr.field_t = sa.field_a.f(-20976);
          sa.field_a.field_j = 0;
        }
        if (param0 > -25) {
          nq var2 = (nq) null;
          uc.a(-68, -91, -81, 82, -51, (String) null, true, (bi[]) null, (byte) -67, 2, (bi[]) null, (nq) null, true, 22, -30);
        }
        return es.a(-78, rr.field_t);
    }

    uc(int param0, int param1, int param2, int param3, int param4, int param5) {
        super(param0, param1, param2, param3);
        this.field_u = param5;
        this.field_x = param4;
    }

    final void a(int param0) {
        int var3 = 0;
        int var2 = 0;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!this.field_s) {
          return;
        }
        for (var3 = 0; this.field_m > var3; var3++) {
          var2 = ui.a(this.field_x, this.field_u, -115, 256 * var3 / this.field_m);
          gf.j(var3 + this.field_k, this.field_t, this.field_i, var2);
        }
        int var4 = 3 % ((67 - param0) / 47);
    }

    static {
        field_y = "End Game";
        field_v = 0;
        field_z = "All games";
    }
}
