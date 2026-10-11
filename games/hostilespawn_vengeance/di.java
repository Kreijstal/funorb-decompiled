/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    static String field_a;
    static String field_c;
    static bd[] field_b;

    final static void a(int param0, int param1, pf param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_16_0 = 0;
        int[] stackIn_18_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        u stackIn_39_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
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
        u var21 = null;
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
        pf var44 = null;
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
        var40 = HostileSpawn.field_I ? 1 : 0;
        try {
          var44 = param2;
          if (null != var44.field_x &&
            var44.field_f > 1) {
            var60 = var44.field_x;
            jc.a(ke.field_z, 0, 0, var60, 8965);
          } else {
            jc.a(-122);
          }
          if (param4 != -536936193) {
            field_b = (bd[]) null;
          }
          var54 = new int[param2.field_L];
          var49 = var54;
          var41 = var49;
          var8 = var41;
          var64 = new int[param2.field_L];
          var62 = oa.field_c;
          var61 = in.field_c;
          var63 = dl.field_o;
          for (var13 = 0; param2.field_L > var13; var13++) {
            var14 = param1 * var61[var13] + var62[var13] * param5 + var63[var13] * param0 >> 8;
            if (var14 < 0) {
              var14 = -var14;
            }
            if (var14 < 0) {
              stackIn_16_0 = 128;
            } else {
              if (var14 < 128) {
                stackIn_16_0 = var14 + 128;
              } else {
                stackIn_16_0 = 256;
              }
            }
            var14Lifetime2 = stackIn_16_0;
            var15 = param7 * var63[var13] + param3 * var62[var13] + param6 * var61[var13] >> 8;
            stackIn_18_0 = pk.field_i;
            if (var15 < 0) {
              stackIn_19_1 = -var15;
            } else {
              stackIn_19_1 = var15;
            }
            var15Lifetime2 = stackIn_18_0[stackIn_19_1];
            var14Lifetime2 = (-var15Lifetime2 + 256) * var14Lifetime2 >>> 8;
            var54[var13] = var14Lifetime2;
            var64[var13] = var15Lifetime2;
          }
          for (var13Lifetime1 = 0; var13Lifetime1 < th.field_Lb; var13Lifetime1++) {
            var14Lifetime1 = lh.field_d[var13Lifetime1];
            var15Lifetime1 = param2.field_i[var14Lifetime1];
            var16 = param2.field_P[var14Lifetime1];
            var17 = param2.field_z[var14Lifetime1];
            if (param2.field_m[var14Lifetime1] >= oa.field_c.length) {
              stackIn_25_0 = -1;
            } else {
              stackIn_25_0 = param2.field_m[var14Lifetime1];
            }
            var18 = stackIn_25_0;
            if (param2.field_y[var14Lifetime1] >= oa.field_c.length) {
              stackIn_28_0 = -1;
            } else {
              stackIn_28_0 = param2.field_y[var14Lifetime1];
            }
            var19 = stackIn_28_0;
            if (oa.field_c.length > param2.field_q[var14Lifetime1]) {
              stackIn_31_0 = param2.field_q[var14Lifetime1];
            } else {
              stackIn_31_0 = -1;
            }
            var20 = stackIn_31_0;
            if (ce.field_f != null &&
              null != param2.field_g &&
              var14Lifetime1 < param2.field_g.length &&
              param2.field_g[var14Lifetime1] != -1 &&
              ce.field_f.length > param2.field_g[var14Lifetime1]) {
              stackIn_39_0 = ce.field_f[param2.field_g[var14Lifetime1]];
            } else {
              stackIn_39_0 = null;
            }
            var21 = stackIn_39_0;
            var22 = tb.field_K[var15Lifetime1];
            var23 = lc.field_c[var15Lifetime1];
            var24 = tb.field_K[var16];
            var25 = lc.field_c[var16];
            var26 = tb.field_K[var17];
            var27 = lc.field_c[var17];
            if (var18 == var19 &&
              var20 == var19) {
              var28 = var54[var18];
              var29 = var64[var18];
              if (var21 != null) {
                stackIn_49_0 = var21.field_i;
              } else {
                stackIn_49_0 = 8355711;
              }
              var30 = stackIn_49_0;
              var31 = 16711935 & var30;
              var32 = var30 & 65280;
              var33 = (var32 * var28 & 16711842) >>> 8 | (var31 * var28 & -16711843) >>> 8;
              var33 = var33 + 65793 * var29;
              oe.a(var22, (byte) -121, var23, var26, 8355711 & var33 >> 1, var25, var27, var24);
            } else {
              var28 = var54[var18];
              var29 = var54[var19];
              var30 = var54[var20];
              var31 = var64[var18];
              var32 = var64[var19];
              var33 = var64[var20];
              if (var21 != null) {
                stackIn_45_0 = var21.field_i;
              } else {
                stackIn_45_0 = 8355711;
              }
              var34 = stackIn_45_0;
              var35 = var34 & 16711935;
              var36 = var34 & 65280;
              var37 = var28 * var35 >>> 8 & 738132223 | -1207894272 & var36 * var28 >>> 8;
              var38 = (var35 * var29 & -16711797) >>> 8 | (16711793 & var29 * var36) >>> 8;
              var37 = var37 + var31 * 65793;
              var38 = var38 + 65793 * var32;
              var39 = var30 * var35 >>> 8 & -536936193 | 1040252672 & var30 * var36 >>> 8;
              var39 = var39 + var33 * 65793;
              ml.a(var25, var39 >> 16, var22, var37 & 255, 255 & var38 >> 8, var39 & 255, var27, var37 >> 16, var23, 255 & var38, var24, (var37 & 65322) >> 8, 255 & var39 >> 8, var38 >> 16, false, var26);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_54_0 = var8_ref;
          stackIn_54_1 = new StringBuilder().append("di.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        if (param0 <= 51) {
          pf var2 = (pf) null;
          di.a(34, -107, (pf) null, 22, 29, -106, 117, -16);
        }
    }

    final static int a(double param0, int param1, double param2, double param3) {
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_83_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        double var8 = 0.0;
        double var10 = 0.0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        var17 = HostileSpawn.field_I ? 1 : 0;
        try {
          var7_int = 90 / ((param1 - 85) / 37);
          param3 = param3 * 0.02454369260617026;
          var8 = -Math.sin(param3);
          var10 = -Math.cos(param3);
          var12 = (int)param2;
          if ((double)var12 > param2) {
            var12--;
          }
          var13 = (int)param0;
          if ((double)var13 > param0) {
            var13--;
          }
          param2 = param2 - (double)var12;
          param0 = param0 - (double)var13;
          var14 = var12;
          var15 = var13;
          var16 = var12 + var13 * ln.field_a.field_d;
          while (ln.field_a.field_c[var16] != 2) {
            var12 = var14;
            var13 = var15;
            param2 = param2 + var8;
            param0 = param0 + var10;
            if (!(1.0 <= param2)) {
              if (0.0 > param2) {
                param2 = param2 + 1.0;
                var14--;
                var16--;
              }
            } else {
              var14++;
              param2 = param2 - 1.0;
              var16++;
            }
            if (!(1.0 <= param0)) {
              if (0.0 > param0) {
                param0 = param0 + 1.0;
                var16 = var16 - ln.field_a.field_d;
                var15--;
              }
            } else {
              var15++;
              var16 = var16 + ln.field_a.field_d;
              param0 = param0 - 1.0;
            }
            if (ln.field_a.field_d > var14 &&
              var14 >= 0 &&
              var15 < ln.field_a.field_a &&
              var15 >= 0) {
              continue;
            }
            stackIn_23_0 = 128;
            return stackIn_23_0;
          }
          if (var12 == var14) {
            stackIn_28_0 = (var15 < var13) ? 128 : 0;
            return stackIn_28_0;
          }
          if (var15 == var13) {
            stackIn_33_0 = (var12 > var14) ? 192 : 64;
            return stackIn_33_0;
          }
          if (var12 <= var14) {
            if (0.0 < var10 &&
              2 == ln.field_a.field_c[-ln.field_a.field_d + var16]) {
              stackIn_48_0 = 64;
              return stackIn_48_0;
            }
            if (var10 < 0.0 &&
              ln.field_a.field_c[ln.field_a.field_d + var16] == 2) {
              stackIn_53_0 = 64;
              return stackIn_53_0;
            }
          } else {
            if (var10 > 0.0 &&
              ln.field_a.field_c[-ln.field_a.field_d + var16] == 2) {
              stackIn_39_0 = 192;
              return stackIn_39_0;
            }
            if (0.0 > var10 &&
              ln.field_a.field_c[var16 + ln.field_a.field_d] == 2) {
              stackIn_43_0 = 192;
              return stackIn_43_0;
            }
          }
          if (var15 >= var13) {
            if (0.0 > var8 &&
              ln.field_a.field_c[var16 + 1] == 2) {
              stackIn_69_0 = 0;
              return stackIn_69_0;
            }
            if (var8 > 0.0 &&
              ln.field_a.field_c[var16 - 1] == 2) {
              stackIn_74_0 = 0;
              return stackIn_74_0;
            }
          } else {
            if (0.0 > var8 &&
              ln.field_a.field_c[var16 + 1] == 2) {
              stackIn_59_0 = 128;
              return stackIn_59_0;
            }
            if (0.0 < var8 &&
              ln.field_a.field_c[-1 + var16] == 2) {
              stackIn_64_0 = 128;
              return stackIn_64_0;
            }
          }
          if (var12 <= var14) {
            stackIn_83_0 = (var15 < var13) ? 96 : 32;
            return stackIn_83_0;
          }
          stackIn_79_0 = (var13 <= var15) ? 224 : 160;
          return stackIn_79_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var7), "di.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_a = "Visit the Account Management section on the main site to view.";
        field_c = "<col=ffffff>Rocket<nbsp>launcher</col><br>The rocket launcher fires electromagnetic pulse (EMP) rockets that instantly disable electrical equipment. The blast is also effective against groups of organic targets.";
    }
}
