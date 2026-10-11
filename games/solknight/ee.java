/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee extends gg {
    byte[] field_k;
    static kl field_j;
    static int field_l;
    static boolean field_i;
    static gb field_h;

    final static rj e(int param0) {
        if (param0 != -1) {
          field_l = -11;
        }
        return (rj) ((Object) new dk());
    }

    final static void f(int param0) {
        int var1 = 0;
        int var2 = SolKnight.field_L ? 1 : 0;
        ce.field_b = false;
        v.field_a = null;
        if (param0 != 0) {
          field_i = false;
        }
        if (k.field_b) {
          ah.field_e.m(125);
        } else {
          var1 = c.field_H;
          if (var1 <= 0) {
          } else {
            if (1 != var1) {
              v.field_a = bb.a(vc.field_b, new String[]{Integer.toString(var1)}, param0 ^ -63);
            } else {
              v.field_a = bf.field_m;
            }
            v.field_a = ci.a(new CharSequence[]{(CharSequence) ((Object) v.field_a), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) pd.field_b)}, (byte) -93);
          }
          ah.field_e.f(true);
          ql.d(18962);
        }
    }

    final static void d(int param0) {
        int var3 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        String stackIn_29_0 = null;
        String stackIn_36_0 = null;
        String stackIn_42_0 = null;
        boolean stackIn_43_1 = false;
        hi stackIn_48_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        hi var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = SolKnight.field_L ? 1 : 0;
        try {
          var1_int = th.field_J;
          var2 = 0;
          if (te.field_M == 2) {
            var3_long = -fg.field_f + je.a(1);
            var2 = (int)((-var3_long + 10999L) / 1000L);
            if (0 > var2) {
              var2 = 0;
            }
          }
          if (param0 != -4537) {
            field_l = -128;
          }
          for (var3 = 0; var3 < vc.field_d.length; var3++) {
            var4 = oa.field_l[var3];
            if (var4 >= 0) {
              if (bc.field_K.field_f != var4) {
                var5 = rj.field_c;
              } else {
                var5 = pb.field_b;
              }
            } else {
              var5 = hc.field_d;
            }
            var6 = vc.field_d[var3];
            if (2 == te.field_M &&
              var2 == 1) {
              if (ak.field_b.length >= i.field_I.length) {
                stackIn_21_0 = ak.field_b.length;
              } else {
                stackIn_21_0 = i.field_I.length;
              }
              var7 = stackIn_21_0;
              if (qc.field_h.length < qa.field_o.length) {
                stackIn_24_0 = qa.field_o.length;
              } else {
                stackIn_24_0 = qc.field_h.length;
              }
              var8 = stackIn_24_0;
              if (var3 >= 6 &&
                6 + var7 > var3) {
                if (-var7 + (-6 + var3) + ak.field_b.length >= 0) {
                  stackIn_29_0 = ak.field_b[var3 - 6 - (-ak.field_b.length + var7)];
                } else {
                  stackIn_29_0 = "";
                }
                var6 = stackIn_29_0;
              }
              if (var7 + 7 <= var3 &&
                var3 < 7 - (-var7 - var8)) {
                if (qc.field_h.length > -var7 - 7 + var3) {
                  stackIn_36_0 = qc.field_h[-var7 + var3 - 7];
                } else {
                  stackIn_36_0 = "";
                }
                var6 = stackIn_36_0;
              }
            }
            if (var4 == -2) {
              var6 = Integer.toString(var2);
            }
            stackIn_42_0 = var6;
            stackIn_43_1 = !(var4 < 0);
            var7Lifetime1 = fa.a(stackIn_42_0, stackIn_43_1, (byte) 99);
            var8Lifetime1 = sb.field_d - (var7Lifetime1 >> 1);
            if (var4 >= 0) {
              var1_int = var1_int + vg.field_N;
              if (bc.field_K.field_f != var4) {
                stackIn_48_0 = kb.field_d;
              } else {
                stackIn_48_0 = ai.field_a;
              }
              var9 = stackIn_48_0;
              if (var9 != null) {
                var9.a(false, var7Lifetime1 + (bl.field_i << 1), var1_int, we.field_c + (g.field_l << 1), var8Lifetime1 - bl.field_i);
              }
              var1_int = var1_int + g.field_l;
            }
            if (var4 < 0) {
              ke.field_H.c(var6, var8Lifetime1, var1_int + ha.field_g, var5, -1);
              var1_int = var1_int + uc.field_i;
            } else {
              kb.field_f.c(var6, var8Lifetime1, var1_int + ph.field_k, var5, -1);
              var1_int = var1_int + (we.field_c + (vg.field_N + g.field_l));
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1), "ee.D(" + param0 + ')');
        }
    }

    ee(byte[] param0) {
        try {
          this.field_k = param0;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "ee.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void g(int param0) {
        int var15 = 0;
        int var17_int = 0;
        int var18 = 0;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        uh var4_ref_uh = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        uh var17 = null;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        uh var17Lifetime1;
        uh var17Lifetime2;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        double var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = SolKnight.field_L ? 1 : 0;
        try {
          aj.field_m = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          var1_int = wk.field_d.length;
          var21 = new int[var1_int];
          var20 = var21;
          var2 = var20;
          for (var3 = 0; var3 < var1_int; var3++) {
            var4_ref_uh = wk.field_d[var3];
            var17 = var4_ref_uh;
            var17Lifetime2 = var4_ref_uh;
            var4_ref_uh.b(32767);
            jh.a((byte) 126, var3);
            var5 = var4_ref_uh.field_E + var4_ref_uh.field_Q >> 1;
            var6 = var4_ref_uh.field_t + var4_ref_uh.field_m >> 1;
            var7 = var4_ref_uh.field_N + var4_ref_uh.field_G >> 1;
            var8 = aj.field_m[9] >> 2;
            var9 = aj.field_m[10] >> 2;
            var10_int = aj.field_m[11] >> 2;
            var11 = var8 * qf.field_e[3] + var9 * qf.field_e[4] + qf.field_e[5] * var10_int >> 14;
            var12 = qf.field_e[8] * var10_int + qf.field_e[7] * var9 + var8 * qf.field_e[6] >> 14;
            var13 = qf.field_e[9] * var8 + var9 * qf.field_e[10] + qf.field_e[11] * var10_int >> 14;
            var2[var3] = var12 * var6 + var11 * var5 + var13 * var7 >> 16;
          }
          if (param0 < 30) {
            field_j = (kl) null;
          }
          var3Lifetime1 = aj.field_m[9] >> 8;
          var4 = aj.field_m[10] >> 8;
          var5Lifetime1 = aj.field_m[11] >> 8;
          var6Lifetime1 = ad.field_h << 4;
          var7Lifetime1 = 0;
          var8Lifetime1 = uk.a((byte) -64, var6Lifetime1) >> 8;
          var9Lifetime1 = rd.a((byte) -30, var6Lifetime1) >> 8;
          if (gb.field_j != -1 &&
            ad.field_m != -1) {
            var9Lifetime1 = -128;
            var7Lifetime1 = gb.field_j - 320;
            var8Lifetime1 = 240 - ad.field_m;
          }
          var10 = 256.0 / Math.sqrt((double)(var8Lifetime1 * var8Lifetime1 + var7Lifetime1 * var7Lifetime1 + var9Lifetime1 * var9Lifetime1));
          var8Lifetime1 = (int)((double)var8Lifetime1 * var10);
          var9Lifetime1 = (int)((double)var9Lifetime1 * var10);
          var7Lifetime1 = (int)((double)var7Lifetime1 * var10);
          var12Lifetime1 = var7Lifetime1 - var3Lifetime1;
          var13Lifetime1 = var8Lifetime1 - var4;
          var14 = var9Lifetime1 - var5Lifetime1;
          var10Lifetime1 = 256.0 / Math.sqrt((double)(var14 * var14 + var13Lifetime1 * var13Lifetime1 + var12Lifetime1 * var12Lifetime1));
          var13Lifetime1 = (int)((double)var13Lifetime1 * var10Lifetime1);
          var12Lifetime1 = (int)((double)var12Lifetime1 * var10Lifetime1);
          var14 = (int)((double)var14 * var10Lifetime1);
          for (var15 = 0; var15 < wk.field_d.length; var15++) {
            var16 = 0;
            for (var17_int = 1; var17_int < wk.field_d.length; var17_int++) {
              if (var21[var17_int] > var21[var16]) {
                var16 = var17_int;
              }
            }
            var2[var16] = -2147483648;
            var17Lifetime1 = wk.field_d[var16];
            jh.a((byte) 126, var16);
            for (var18 = 0; var18 < 3; var18++) {
              qf.field_e[var18] = qf.field_e[var18] + bg.field_v[var15][var18];
            }
            mb.a(var17Lifetime1, false, aj.field_m, qf.field_e, true, false, 5);
            bi.a((byte) 77, var12Lifetime1, var14, var9Lifetime1, var17Lifetime1, var13Lifetime1, var8Lifetime1, var7Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1), "ee.A(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_j = null;
        int var1 = -126 % ((-79 - param0) / 34);
    }

    static {
        field_j = new kl();
    }
}
