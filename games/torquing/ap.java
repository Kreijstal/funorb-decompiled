/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ap {
    private static ed field_a;

    final static int a(int[] param0, int param1, int[] param2, int param3) {
        return param0[param1] * param2[param3] + param0[param1 + 1] * param2[param3 + 1] + param0[param1 + 2] * param2[param3 + 2];
    }

    final static double a(double[] param0, int param1, double[] param2, int param3) {
        return param0[param1] * param2[param3] + param0[param1 + 1] * param2[param3 + 1] + param0[param1 + 2] * param2[param3 + 2];
    }

    private final static double a(double[] param0, int param1, double param2, double param3, double param4) {
        return ap.a(param0[param1], param0[param1 + 1], param0[param1 + 2], param2, param3, param4);
    }

    final static void a(double[] param0, double param1, double[] param2, double[] param3) {
        int var5 = 0;
        for (var5 = 0; var5 < param3.length; var5++) {
            param3[var5] = param0[var5] + param1 * param2[var5];
        }
    }

    final static void a(int[] param0, int param1, int[] param2, int param3, int[] param4, int param5) {
        param4[param5] = param0[2] * param2[1] - param0[1] * param2[2];
        param4[param5 + 1] = param0[0] * param2[2] - param0[2] * param2[0];
        param4[param5 + 2] = param0[1] * param2[0] - param0[0] * param2[1];
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, double param12, double param13, double param14) {
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        double var27 = 0.0;
        double var29 = 0.0;
        double var31 = 0.0;
        double var33 = 0.0;
        int stackIn_7_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_18_0 = 0;
        L0: {
          var18 = Math.abs(param9);
          var19 = Math.abs(param10);
          var20 = Math.abs(param11);
          if (var18 <= var19) {
            if (var19 <= var20) {
              stackOut_6_0 = 2;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L0;
            }
          } else {
            if (var18 <= var20) {
              stackOut_3_0 = 2;
              stackIn_7_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_7_0 = stackOut_2_0;
              break L0;
            }
          }
        }
        L1: {
          var21 = stackIn_7_0;
          if (var21 != 0) {
            if (var21 != 1) {
              if (var21 != 2) {
                var25 = 1;
                var24 = 1;
                var23 = 1;
                var22 = 1;
                var26 = 1;
                var29 = 1.0;
                var27 = 1.0;
                break L1;
              } else {
                var22 = param0 - param3;
                var23 = param6 - param3;
                var27 = param12 - (double)param3;
                var24 = param1 - param4;
                var25 = param7 - param4;
                var29 = param13 - (double)param4;
                var26 = param11;
                break L1;
              }
            } else {
              var22 = param2 - param5;
              var23 = param8 - param5;
              var27 = param14 - (double)param5;
              var24 = param0 - param3;
              var25 = param6 - param3;
              var29 = param12 - (double)param3;
              var26 = param10;
              break L1;
            }
          } else {
            var22 = param1 - param4;
            var23 = param7 - param4;
            var27 = param13 - (double)param4;
            var24 = param2 - param5;
            var25 = param8 - param5;
            var29 = param14 - (double)param5;
            var26 = param9;
            break L1;
          }
        }
        L2: {
          L3: {
            var31 = (var29 * (double)var23 - var27 * (double)var25) / (double)var26;
            var33 = (var27 * (double)var24 - var29 * (double)var22) / (double)var26;
            if (var31 < 0.0) {
              break L3;
            } else {
              if (var33 < 0.0) {
                break L3;
              } else {
                if (var31 + var33 > 1.0) {
                  break L3;
                } else {
                  stackOut_17_0 = 1;
                  stackIn_19_0 = stackOut_17_0;
                  break L2;
                }
              }
            }
          }
          stackOut_18_0 = 0;
          stackIn_19_0 = stackOut_18_0;
          break L2;
        }
        return stackIn_19_0 != 0;
    }

    final static void a(double param0, double param1, double param2, double param3, double param4, double param5, double param6, double param7, double param8, double param9, double param10, double param11, double[] param12) {
        double var25 = 0.0;
        double var27 = 0.0;
        double var29 = 0.0;
        double var31 = 0.0;
        double var33 = 0.0;
        double var35 = 0.0;
        double var37 = 0.0;
        double var39 = 0.0;
        double var41 = 0.0;
        L0: {
          param12[0] = param9 - param6;
          param12[1] = param10 - param7;
          param12[2] = param11 - param8;
          param12[3] = param0 - param6;
          param12[4] = param1 - param7;
          param12[5] = param2 - param8;
          var25 = ap.a(param12, 0, param12, 3) / ap.a(param12, 0, param12, 0);
          var25 = Math.max(Math.min(var25, 1.0), 0.0);
          var27 = 1.0 - var25;
          param12[0] = param3 - param6;
          param12[1] = param4 - param7;
          param12[2] = param5 - param8;
          var29 = ap.a(param12, 0, param12, 3) / ap.a(param12, 0, param12, 0);
          var29 = Math.max(Math.min(var29, 1.0), 0.0);
          var31 = 1.0 - var29;
          param12[0] = param9 - param3;
          param12[1] = param10 - param4;
          param12[2] = param11 - param5;
          param12[3] = param0 - param3;
          param12[4] = param1 - param4;
          param12[5] = param2 - param5;
          var33 = ap.a(param12, 0, param12, 3) / ap.a(param12, 0, param12, 0);
          var33 = Math.max(Math.min(var33, 1.0), 0.0);
          var35 = 1.0 - var33;
          param12[0] = var27 * param6 + var25 * param9;
          param12[1] = var27 * param7 + var25 * param10;
          param12[2] = var27 * param8 + var25 * param11;
          param12[3] = var31 * param6 + var29 * param3;
          param12[4] = var31 * param7 + var29 * param4;
          param12[5] = var31 * param8 + var29 * param5;
          param12[6] = var35 * param3 + var33 * param9;
          param12[7] = var35 * param4 + var33 * param10;
          param12[8] = var35 * param5 + var33 * param11;
          var37 = ap.a(param12, 0, param0, param1, param2);
          var39 = ap.a(param12, 3, param0, param1, param2);
          var41 = ap.a(param12, 6, param0, param1, param2);
          if (var37 >= var39) {
            if (var39 >= var41) {
              break L0;
            } else {
              param12[0] = param12[3];
              param12[1] = param12[4];
              param12[2] = param12[5];
              param12[3] = var39;
              return;
            }
          } else {
            if (var37 >= var41) {
              break L0;
            } else {
              param12[3] = var37;
              return;
            }
          }
        }
        param12[0] = param12[6];
        param12[1] = param12[7];
        param12[2] = param12[8];
        param12[3] = var41;
    }

    final static double b(double[] param0, int param1, double[] param2) {
        return ap.a(param0[param1], param0[param1 + 1], param0[param1 + 2], param2[0], param2[1], param2[2]);
    }

    final static int[] a(int[] param0, int[] param1) {
        return ap.a(param0, param1[0], param1[1], param1[2]);
    }

    final static void a(double[] param0, int param1) {
        double var2 = param0[param1];
        double var4 = param0[param1 + 1];
        double var6 = param0[param1 + 2];
        double var8 = var2 * var2 + var4 * var4 + var6 * var6;
        if (Math.abs(var8 - 1.0) < 1e-16) {
            return;
        }
        var8 = Math.sqrt(var8);
        param0[param1] = var2 / var8;
        param0[param1 + 1] = var4 / var8;
        param0[param1 + 2] = var6 / var8;
    }

    private final static int[] a(int[] param0, int param1, int param2, int param3) {
        if (param0 == null) {
            param0 = new int[12];
        }
        int discarded$0 = -25034;
        param1 = b.e(2048, param1);
        int discarded$1 = -25034;
        param2 = b.e(2048, param2);
        int discarded$2 = -25034;
        param3 = b.e(2048, param3);
        int var4 = be.field_l[param1];
        int var5 = be.field_o[param1];
        int var6 = be.field_l[param2];
        int var7 = be.field_o[param2];
        int var8 = be.field_l[param3];
        int var9 = be.field_o[param3];
        ap.a(param0, 3, 65536, 0, 0, param1, param2, param3, var4, var5, var6, var7, var8, var9);
        ap.a(param0, 6, 0, 65536, 0, param1, param2, param3, var4, var5, var6, var7, var8, var9);
        ap.a(param0, 9, 0, 0, 65536, param1, param2, param3, var4, var5, var6, var7, var8, var9);
        return param0;
    }

    private final static double a(double param0, double param1, double param2, double param3, double param4, double param5) {
        double var12 = param0 - param3;
        double var14 = param1 - param4;
        double var16 = param2 - param5;
        return Math.sqrt(var12 * var12 + var14 * var14 + var16 * var16);
    }

    public static void a() {
        field_a = null;
    }

    final static void a(double param0, double[] param1, double[] param2) {
        int var4 = 0;
        for (var4 = 0; var4 < param2.length; var4++) {
            param2[var4] = param2[var4] + param0 * param1[var4];
        }
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13) {
        int var14 = 0;
        param2 = param2 / 2;
        param3 = param3 / 2;
        param4 = param4 / 2;
        if (param7 != 0) {
            var14 = param3 * param12 + param2 * param13 >> 16;
            param3 = param3 * param13 - param2 * param12 >> 16;
            param2 = var14;
        }
        if (param5 != 0) {
            var14 = param3 * param9 - param4 * param8 >> 16;
            param4 = param3 * param8 + param4 * param9 >> 16;
            param3 = var14;
        }
        if (param6 != 0) {
            var14 = param4 * param10 + param2 * param11 >> 16;
            param4 = param4 * param11 - param2 * param10 >> 16;
            param2 = var14;
        }
        param2 = param2 * 2;
        param3 = param3 * 2;
        param4 = param4 * 2;
        param0[param1] = param2;
        param0[param1 + 1] = param3;
        param0[param1 + 2] = param4;
    }

    final static void a(double[] param0, int param1, double[] param2, int param3, double[] param4, int param5, double param6) {
        double var8 = 0.0;
        double var10 = 0.0;
        double[] var10_ref_double__ = null;
        int var11 = 0;
        double[] var12 = null;
        double var13 = 0.0;
        int var13_int = 0;
        double[] var14 = null;
        int var15 = 0;
        double[] var16 = null;
        ed var17 = null;
        ed var18 = null;
        var8 = ap.a(param2, 10, param2, 10);
        if (var8 >= 1e-16) {
          var10 = Math.sqrt(var8);
          field_a.a(param2[10] / var10, param2[11] / var10, param2[12] / var10, (byte) 76, -var10 * param6);
          var17 = ql.field_u;
          var18 = var17;
          var17.field_a = param0[6];
          var17.field_d = param0[7];
          var17.field_b = param0[8];
          var17.field_e = param0[9];
          var18.a(field_a, 65536);
          var13 = 1.0 / param6;
          param4[param5] = (var17.field_a - param0[6]) * var13;
          param4[param5 + 1] = (var17.field_d - param0[7]) * var13;
          param4[param5 + 2] = (var17.field_b - param0[8]) * var13;
          param4[param5 + 3] = (var17.field_e - param0[9]) * var13;
          return;
        } else {
          var10_ref_double__ = param4;
          var11 = param5;
          var16 = param4;
          var12 = var16;
          var13_int = param5 + 1;
          var14 = param4;
          var15 = param5 + 2;
          param4[param5 + 3] = 0.0;
          var14[var15] = 0.0;
          var16[var13_int] = 0.0;
          var10_ref_double__[var11] = 0.0;
          return;
        }
    }

    final static void a(double[] param0, int param1, double[] param2, int param3, double[] param4, int param5) {
        param4[param5] = param0[param1 + 2] * param2[param3 + 1] - param0[param1 + 1] * param2[param3 + 2];
        param4[param5 + 1] = param0[param1] * param2[param3 + 2] - param0[param1 + 2] * param2[param3];
        param4[param5 + 2] = param0[param1 + 1] * param2[param3] - param0[param1] * param2[param3 + 1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ed();
    }
}
