/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    static String[] field_a;

    final static void a(int param0, int param1, int param2, boolean param3, int param4, le param5, int param6, int param7) {
        int stackIn_16_0 = 0;
        int[] stackIn_18_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        ca stackIn_38_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        ca var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var44 = 0;
        le var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        byte[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var14Lifetime2;
        int var15Lifetime2;
        var40 = wizardrun.field_H;
        try {
          var45 = param5;
          if (var45.field_x != null &&
            var45.field_n > 1) {
            var61 = var45.field_x;
            te.a((byte) -112, var61, t.field_a, 0, 0);
          } else {
            ia.b(0);
          }
          if (param3) {
            field_a = (String[]) null;
          }
          var55 = new int[param5.field_y];
          var50 = var55;
          var41 = var50;
          var8 = var41;
          var65 = new int[param5.field_y];
          var62 = gk.field_g;
          var63 = hb.field_o;
          var64 = bl.field_b;
          for (var13 = 0; param5.field_y > var13; var13++) {
            var14 = param6 * var62[var13] + (var63[var13] * param2 + param4 * var64[var13]) >> 8;
            if (var14 < 0) {
              var14 = -var14;
            }
            if (var14 < 0) {
              stackIn_16_0 = 128;
            } else {
              if (var14 >= 128) {
                stackIn_16_0 = 256;
              } else {
                stackIn_16_0 = 128 + var14;
              }
            }
            var14Lifetime2 = stackIn_16_0;
            var15 = var64[var13] * param0 + param1 * var62[var13] + param7 * var63[var13] >> 8;
            stackIn_18_0 = qk.field_f;
            if (0 <= var15) {
              stackIn_19_1 = var15;
            } else {
              stackIn_19_1 = -var15;
            }
            var15Lifetime2 = stackIn_18_0[stackIn_19_1];
            var14Lifetime2 = var14Lifetime2 * (256 - var15Lifetime2) >>> 8;
            var55[var13] = var14Lifetime2;
            var65[var13] = var15Lifetime2;
          }
          var44 = 0;
          var13Lifetime1 = var44;
          while (var44 < kg.field_c) {
            var14Lifetime1 = cb.field_e[var44];
            var15Lifetime1 = param5.field_p[var14Lifetime1];
            var16 = param5.field_C[var14Lifetime1];
            var17 = param5.field_I[var14Lifetime1];
            if (gk.field_g.length <= param5.field_c[var14Lifetime1]) {
              stackIn_25_0 = -1;
            } else {
              stackIn_25_0 = param5.field_c[var14Lifetime1];
            }
            var18 = stackIn_25_0;
            if (param5.field_Q[var14Lifetime1] < gk.field_g.length) {
              stackIn_28_0 = param5.field_Q[var14Lifetime1];
            } else {
              stackIn_28_0 = -1;
            }
            var19 = stackIn_28_0;
            if (gk.field_g.length <= param5.field_d[var14Lifetime1]) {
              stackIn_31_0 = -1;
            } else {
              stackIn_31_0 = param5.field_d[var14Lifetime1];
            }
            var20 = stackIn_31_0;
            if (null != oh.field_a &&
              param5.field_O != null &&
              var14Lifetime1 < param5.field_O.length &&
              param5.field_O[var14Lifetime1] != -1 &&
              oh.field_a.length > param5.field_O[var14Lifetime1]) {
              stackIn_38_0 = oh.field_a[param5.field_O[var14Lifetime1]];
            } else {
              stackIn_38_0 = null;
            }
            var21 = stackIn_38_0;
            var22 = nl.field_A[var15Lifetime1];
            var23 = d.field_c[var15Lifetime1];
            var24 = nl.field_A[var16];
            var25 = d.field_c[var16];
            var26 = nl.field_A[var17];
            var27 = d.field_c[var17];
            if (var18 == var19 &&
              var19 == var20) {
              var28 = var55[var18];
              var29 = var65[var18];
              if (var21 != null) {
                stackIn_48_0 = var21.field_b;
              } else {
                stackIn_48_0 = 8355711;
              }
              var30 = stackIn_48_0;
              var31 = 16711935 & var30;
              var32 = 65280 & var30;
              var33 = (16711720 & var32 * var28) >>> 8 | -486604545 & var28 * var31 >>> 8;
              var33 = var33 + var29 * 65793;
              pj.a(var25, 0, var22, var24, var27, (var33 & 16711422) >> 1, var26, var23);
            } else {
              var28 = var55[var18];
              var29 = var55[var19];
              var30 = var55[var20];
              var31 = var65[var18];
              var32 = var65[var19];
              var33 = var65[var20];
              if (var21 == null) {
                stackIn_44_0 = 8355711;
              } else {
                stackIn_44_0 = var21.field_b;
              }
              var34 = stackIn_44_0;
              var35 = var34 & 16711935;
              var36 = 65280 & var34;
              var37 = 1006567679 & var35 * var28 >>> 8 | var36 * var28 >>> 8 & -402587904;
              var38 = (-16711765 & var35 * var29) >>> 8 | (var36 * var29 & 16711734) >>> 8;
              var38 = var38 + 65793 * var32;
              var37 = var37 + var31 * 65793;
              var39 = var30 * var35 >>> 8 & 1946091775 | var36 * var30 >>> 8 & -486473984;
              var39 = var39 + var33 * 65793;
              gk.a(var24, var23, var39 >> 16, var22, var37 >> 16, (65401 & var37) >> 8, (var38 & 65386) >> 8, var39 >> 8 & 255, var39 & 255, var38 & 255, var27, var26, -719, var38 >> 16, var25, 255 & var37);
            }
            var44++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_53_0 = var8_ref;
          stackIn_53_1 = new StringBuilder().append("pi.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static o[] b(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = wizardrun.field_H;
        o[] var1 = new o[wb.field_f];
        for (var2 = param0; var2 < wb.field_f; var2++) {
          var3 = tf.field_b[var2] * cg.field_k[var2];
          var4 = mf.field_j[var2];
          var5 = new int[var3];
          for (var6 = 0; var3 > var6; var6++) {
            var5[var6] = ic.field_b[kl.b(255, (int) var4[var6])];
          }
          var1[var2] = new o(hk.field_bb, eg.field_v, ph.field_q[var2], ne.field_h[var2], cg.field_k[var2], tf.field_b[var2], var5);
        }
        eb.a(param0 ^ 0);
        return var1;
    }

    final static Object a(byte[] param0, int param1, boolean param2) {
        kh var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        kh stackIn_5_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            stackIn_2_0 = null;
            return stackIn_2_0;
          }
          if (param0.length > 136) {
            var3 = new kh();
            ((dj) ((Object) var3)).a(param0, 121);
            stackIn_5_0 = var3;
            return stackIn_5_0;
          }
          if (param1 != 0) {
            field_a = (String[]) null;
          }
          if (param2) {
            stackIn_12_0 = vg.a(param0, -125);
            return stackIn_12_0;
          }
          stackIn_10_0 = (byte[]) (param0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("pi.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 32348) {
          pi.a(98);
        }
        field_a = null;
    }

    static {
        field_a = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
