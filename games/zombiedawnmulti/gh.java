/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh {
    static String[] field_f;
    boolean field_e;
    boolean field_d;
    static int field_a;
    int field_c;
    static boolean field_g;
    String[] field_b;
    String field_h;

    final static boolean a(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 < 48) {
          return true;
        }
        stackIn_7_0 = (10 <= a.field_b) && (!og.field_N) && (!vo.e(1));
        return stackIn_7_0;
    }

    final static void a(md param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_18_0 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        af stackIn_40_0 = null;
        int stackIn_46_0 = 0;
        int stackIn_50_0 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
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
        af var21 = null;
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
        md var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var14Lifetime2;
        int var15Lifetime2;
        var40 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var44 = param0;
          if (var44.field_z != null &&
            var44.field_m > 1) {
            var60 = var44.field_z;
            si.a(0, 255, var60, nn.field_c, 0);
          } else {
            pn.b(8);
          }
          if (param2 < 44) {
            gh.a(-93);
          }
          var54 = new int[param0.field_o];
          var49 = var54;
          var41 = var49;
          var8 = var41;
          var64 = new int[param0.field_o];
          var62 = eb.field_J;
          var61 = bq.field_g;
          var63 = wp.field_i;
          for (var13 = 0; param0.field_o > var13; var13++) {
            var14 = var61[var13] * param7 + (var62[var13] * param1 + var63[var13] * param5) >> 8;
            if (0 > var14) {
              var14 = -var14;
            }
            if (var14 >= 0) {
              if (var14 >= 128) {
                stackIn_18_0 = 256;
              } else {
                stackIn_18_0 = 128 + var14;
              }
            } else {
              stackIn_18_0 = 128;
            }
            var14Lifetime2 = stackIn_18_0;
            var15 = var61[var13] * param6 + (var62[var13] * param3 + param4 * var63[var13]) >> 8;
            stackIn_20_0 = na.field_K;
            if (var15 >= 0) {
              stackIn_21_1 = var15;
            } else {
              stackIn_21_1 = -var15;
            }
            var15Lifetime2 = stackIn_20_0[stackIn_21_1];
            var14Lifetime2 = var14Lifetime2 * (256 - var15Lifetime2) >>> 8;
            var54[var13] = var14Lifetime2;
            var64[var13] = var15Lifetime2;
          }
          for (var13Lifetime1 = 0; tf.field_Eb > var13Lifetime1; var13Lifetime1++) {
            var14Lifetime1 = ah.field_f[var13Lifetime1];
            var15Lifetime1 = param0.field_y[var14Lifetime1];
            var16 = param0.field_L[var14Lifetime1];
            var17 = param0.field_H[var14Lifetime1];
            if (param0.field_F[var14Lifetime1] < eb.field_J.length) {
              stackIn_27_0 = param0.field_F[var14Lifetime1];
            } else {
              stackIn_27_0 = -1;
            }
            var18 = stackIn_27_0;
            if (param0.field_K[var14Lifetime1] >= eb.field_J.length) {
              stackIn_30_0 = -1;
            } else {
              stackIn_30_0 = param0.field_K[var14Lifetime1];
            }
            var19 = stackIn_30_0;
            if (eb.field_J.length > param0.field_x[var14Lifetime1]) {
              stackIn_33_0 = param0.field_x[var14Lifetime1];
            } else {
              stackIn_33_0 = -1;
            }
            var20 = stackIn_33_0;
            if (qh.field_f != null &&
              null != param0.field_c &&
              param0.field_c.length > var14Lifetime1 &&
              param0.field_c[var14Lifetime1] != -1 &&
              param0.field_c[var14Lifetime1] < qh.field_f.length) {
              stackIn_40_0 = qh.field_f[param0.field_c[var14Lifetime1]];
            } else {
              stackIn_40_0 = null;
            }
            var21 = stackIn_40_0;
            var22 = lo.field_j[var15Lifetime1];
            var23 = jk.field_k[var15Lifetime1];
            var24 = lo.field_j[var16];
            var25 = jk.field_k[var16];
            var26 = lo.field_j[var17];
            var27 = jk.field_k[var17];
            if (var18 == var19 &&
              var19 == var20) {
              var28 = var54[var18];
              var29 = var64[var18];
              if (var21 == null) {
                stackIn_50_0 = 8355711;
              } else {
                stackIn_50_0 = var21.field_f;
              }
              var30 = stackIn_50_0;
              var31 = var30 & 16711935;
              var32 = var30 & 65280;
              var33 = (var28 * var31 & -16711894) >>> 8 | (16711900 & var32 * var28) >>> 8;
              var33 = var33 + var29 * 65793;
              mo.a(var22, 8355711 & var33 >> 1, var23, var24, var25, var26, var27, (byte) 58);
            } else {
              var28 = var54[var18];
              var29 = var54[var19];
              var30 = var54[var20];
              var31 = var64[var18];
              var32 = var64[var19];
              var33 = var64[var20];
              if (var21 == null) {
                stackIn_46_0 = 8355711;
              } else {
                stackIn_46_0 = var21.field_f;
              }
              var34 = stackIn_46_0;
              var35 = 16711935 & var34;
              var36 = var34 & 65280;
              var37 = (16711726 & var36 * var28) >>> 8 | -1962999553 & var35 * var28 >>> 8;
              var38 = 1258225919 & var35 * var29 >>> 8 | (16711826 & var36 * var29) >>> 8;
              var37 = var37 + var31 * 65793;
              var39 = (16711695 & var36 * var30) >>> 8 | -1140915969 & var30 * var35 >>> 8;
              var38 = var38 + var32 * 65793;
              var39 = var39 + var33 * 65793;
              qe.a(var39 >> 16, 255 & var37, var37 >> 16, var37 >> 8 & 255, 255 & var39, var27, 255 & var38, var26, var23, (var39 & 65366) >> 8, (65470 & var38) >> 8, var38 >> 16, var25, var24, var22, 121);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_55_0 = var8_ref;
          stackIn_55_1 = new StringBuilder().append("gh.C(");
          if (param0 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static double a(double param0, byte param1) {
        if (param1 <= 4) {
          field_a = -9;
        }
        return ah.field_a[(int)(32768.0 * param0 / 3.141592653589793) & 65535];
    }

    final static boolean a(int param0, int param1) {
        if (param1 != 11653) {
          gh.a(-108, 3);
        }
        return 0 != (w.field_m & 1 << -param0) ? true : false;
    }

    public static void a(byte param0) {
        field_f = null;
        int var1 = 2 / ((param0 + 7) / 59);
    }

    gh(boolean param0) {
        this.field_d = param0 ? true : false;
    }

    static {
    }
}
