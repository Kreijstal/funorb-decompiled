/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends l {
    jh field_g;
    l field_h;
    static int[] field_j;
    static int field_k;
    int field_i;

    final static void a(java.awt.Component param0, i param1, pd param2, boolean param3, byte param4, int param5) {
        if (param4 >= -4) {
          return;
        }
        try {
          wl.a(param2, param1, 1024, 106, param3, param0, param5, param5);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "pe.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = Virogrid.field_F ? 1 : 0;
        int var9Lifetime1;
        try {
          var5_int = df.field_e * param0 + param2;
          var6 = param4 * df.field_e + var5_int;
          var7 = (param1 & 16711422) >> 1;
          var8 = 0;
          for (var9 = var5_int; var6 > var9; var9 = var9 + df.field_e) {
            df.field_d[var9] = 0 == var8 % 2 ? var7 : param1;
            var8++;
          }
          var9Lifetime1 = -57 / ((-54 - param3) / 53);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "pe.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        field_j = null;
        int var1 = -99 / ((-23 - param0) / 53);
    }

    final static String a(String param0, String param1, eh param2, int param3, int param4) {
        RuntimeException var5 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2.c(param4)) {
            stackIn_3_0 = (String) (param0);
            return stackIn_3_0;
          }
          stackIn_5_0 = param1 + " - " + param2.b((byte) 113, param3) + "%";
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("pe.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0) {
        String[][] dupTemp$0 = null;
        int[][] dupTemp$1 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        dh var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        hg var13 = null;
        int var14 = 0;
        hg var15 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = Virogrid.field_F ? 1 : 0;
        try {
          var13 = sh.field_qb;
          var15 = var13;
          var2 = var15.g(11132);
          var3 = (dh) (bl.field_D.a((byte) -67));
          while (var3 != null) {
            if (var2 != var3.field_i) {
              var3 = (dh) (bl.field_D.a(16213));
              continue;
            }
            break;
          }
          if (var3 == null) {
            tn.a(false);
            return;
          }
          var4 = var15.g(param0 + 11133);
          if (param0 != ~var4) {
            rc.field_h[0] = mi.field_d;
            var5 = var3.field_g;
            for (var6_int = 1; var6_int < var4; var6_int++) {
              rc.field_h[var6_int] = var13.h(-121);
            }
            fj.a((byte) 125, var5, var4);
            for (var6_intLifetime1 = 0; var4 > var6_intLifetime1; var6_intLifetime1++) {
              lj.a(true, var15);
              if (var6_intLifetime1 == 0) {
                var3.field_m = ug.field_b;
                var3.field_u = lm.field_j;
                var3.field_h = ve.field_s;
                var3.field_q = ng.field_X;
                fd.a(ng.field_X, lm.field_j, ~param0, ve.field_s, var6_intLifetime1, ug.field_b);
              } else {
                fd.a(ng.field_X, lm.field_j, ~param0, ve.field_s, var6_intLifetime1, ug.field_b);
              }
            }
            sb.a(var5, (byte) 46);
            dupTemp$0 = new String[2][var5];
            var3.field_j = dupTemp$0;
            var6 = dupTemp$0;
            dupTemp$1 = new int[2][4 * var5];
            var3.field_t = dupTemp$1;
            var7 = dupTemp$1;
            var8 = ka.field_m;
            var9 = 0;
            var10 = 0;
            while (var8 > var9) {
              var11 = lk.field_Tb[var9];
              var6[0][var10] = rc.field_h[var11];
              var7[0][var10 * 4] = wh.field_c[var11];
              var7[0][4 * var10 + 1] = vc.field_jb[var11];
              var7[0][2 + 4 * var10] = tg.field_A[var11];
              var7[0][3 + 4 * var10] = kf.field_j[var11];
              if (jc.a(rc.field_h[var11], true) &&
                0 == vc.field_jb[var11] - (-tg.field_A[var11] - kf.field_j[var11])) {
                var6[0][var10] = null;
                var10--;
              }
              var10++;
              var9++;
            }
            var9Lifetime1 = 0;
            var14 = 0;
            var10Lifetime1 = var14;
            while (var8 > var9Lifetime1) {
              var11Lifetime1 = lk.field_Tb[var9Lifetime1 + var5];
              var6[1][var14] = rc.field_h[var11Lifetime1];
              var7[1][4 * var14] = wh.field_c[var11Lifetime1];
              var7[1][1 + 4 * var14] = vc.field_jb[var11Lifetime1];
              var7[1][4 * var14 + 2] = tg.field_A[var11Lifetime1];
              var7[1][var14 * 4 + 3] = kf.field_j[var11Lifetime1];
              if (jc.a(rc.field_h[var11Lifetime1], true) &&
                vc.field_jb[var11Lifetime1] - (-tg.field_A[var11Lifetime1] - kf.field_j[var11Lifetime1]) == 0) {
                var6[1][var14] = null;
                var14--;
              }
              var9Lifetime1++;
              var14++;
            }
          }
          var3.field_s = true;
          var3.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1), "pe.F(" + param0 + ')');
        }
    }

    final static void b(byte param0) {
        db.field_k = null;
        k.field_c = null;
        gb.field_F = null;
        lj.field_j = (byte[][]) null;
        if (param0 != -28) {
          field_k = 63;
        }
        mb.field_bb = null;
        el.field_w = null;
    }

    pe(jh param0, l param1) {
        try {
          this.field_g = param0;
          this.field_i = param0.l();
          this.field_h = param1;
          this.field_g.f(this.field_i * ag.field_c + 128 >> 8);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "pe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = 0;
    }
}
