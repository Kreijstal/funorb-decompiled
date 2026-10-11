/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends pu {
    static int field_n;
    static String field_m;
    static int field_p;
    static ai[] field_o;
    static ee[] field_l;
    static int field_q;

    final static void a(kv param0, kv param1, kv param2, ee param3, int param4, kv param5, byte param6) {
        int incrementValue$2 = 0;
        int incrementValue$1 = 0;
        int incrementValue$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_26_0 = 0;
        int stackIn_50_0 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_84_2 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_87_2 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_90_2 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_93_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int[] var31 = null;
        int[] var32 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        int var15Lifetime1;
        int var15Lifetime2;
        int var16Lifetime1;
        int var16Lifetime2;
        int var17Lifetime1;
        int var17Lifetime2;
        int var18Lifetime1;
        int var18Lifetime2;
        int var19Lifetime1;
        int var19Lifetime2;
        int var20Lifetime1;
        int var20Lifetime2;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        int var24Lifetime1;
        int var24Lifetime2;
        int var25Lifetime1;
        int var26Lifetime1;
        var30 = BachelorFridge.field_y;
        try {
          var32 = nla.field_a;
          var31 = var32;
          var7 = var31;
          var8 = -6;
          var9 = 0;
          stackIn_4_0 = (param4 < 40) ? param4 : 40;
          var10 = stackIn_4_0;
          stackIn_7_0 = (param4 < 255) ? param4 : 255;
          var11 = stackIn_7_0;
          stackIn_12_0 = 255;
          if (param4 < 45) {
            stackIn_13_1 = 0;
          } else {
            if (param4 <= 445) {
              stackIn_11_1 = param4 - 45;
            } else {
              stackIn_11_1 = 400;
            }
            stackIn_13_1 = stackIn_11_1 * 255 / 400;
          }
          var12 = stackIn_12_0 ^ stackIn_13_1;
          var13 = 0;
          if (param3.field_f < -var8) {
            var13 = -(param3.field_f + var8);
          }
          var14 = var13;
          var15 = var8;
          var16 = var9;
          stackIn_17_0 = param5.field_q * var16;
          if (var15 >= 0) {
            stackIn_18_1 = var15;
          } else {
            stackIn_18_1 = 0;
          }
          var17 = stackIn_17_0 + stackIn_18_1;
          stackIn_20_0 = -param3.field_a;
          stackIn_20_1 = param5.field_q;
          if (var15 >= 0) {
            stackIn_21_2 = 0;
          } else {
            stackIn_21_2 = var15;
          }
          var18 = stackIn_20_0 + (stackIn_20_1 - stackIn_21_2);
          for (var19 = 0; param3.field_b > var19; var19++) {
            if (var15 < 0) {
              stackIn_26_0 = -var15;
            } else {
              stackIn_26_0 = 0;
            }
            for (var20 = stackIn_26_0; param3.field_a > var20; var20++) {
              if (var19 >= param3.field_c &&
                var19 < param3.field_e + param3.field_c &&
                var20 >= param3.field_f &&
                var20 < param3.field_d + param3.field_f) {
                incrementValue$2 = var14;
                var14++;
                var21 = param3.field_g[incrementValue$2];
                if (var21 <= 0) {
                  param0.field_v[var17] = param5.field_v[var17];
                } else {
                  var21 = 255 & param3.field_h[var21];
                  if (var12 >= var21) {
                    param0.field_v[var17] = param5.field_v[var17];
                  } else {
                    var22 = var32.length * (-var12 + var21) >> 8;
                    var23 = var32[var22];
                    var24 = (var23 & 16711680) >> 16;
                    var25 = var23 >> 8 & 255;
                    var26 = var23 & 255;
                    if (var22 < -1 + var32.length) {
                      var27 = 255 & var32.length * (-var12 + var21);
                      var28 = var27 ^ 255;
                      var29 = var7[var22 + 1];
                      var25 = (var29 >> 8 & 255) * var27 + var28 * var25 >> 8;
                      var26 = var27 * (var29 & 255) + var26 * var28 >> 8;
                      var24 = var27 * (var29 >> 16 & 255) + var24 * var28 >> 8;
                    }
                    var25 = (255 & param5.field_v[var17] >> 8) * var25 >> 8;
                    var26 = var26 * (param5.field_v[var17] & 255) >> 8;
                    var24 = (255 & param5.field_v[var17] >> 16) * var24 >> 8;
                    param0.field_v[var17] = mp.a(mp.a(var24 << 16, var25 << 8), var26);
                  }
                }
              } else {
                param0.field_v[var17] = param5.field_v[var17];
              }
              var17++;
            }
            var17 = var17 + var18;
            var14 = var14 + var13;
          }
          var14Lifetime1 = 0;
          var16Lifetime1 = param2.field_u + var9;
          var15Lifetime1 = param2.field_t + var8;
          if (0 > var15Lifetime1) {
            var14Lifetime1 = -var15Lifetime1;
          }
          var13Lifetime1 = var14Lifetime1;
          stackIn_50_0 = (0 > var15Lifetime1) ? 0 : var15Lifetime1;
          var17Lifetime1 = stackIn_50_0 + param2.field_t + (param2.field_u + var16Lifetime1) * param5.field_q;
          var18Lifetime1 = -param2.field_q + param5.field_q + var13Lifetime1;
          for (var19Lifetime1 = 0; param2.field_p > var19Lifetime1; var19Lifetime1++) {
            for (var20Lifetime1 = var13Lifetime1; var20Lifetime1 < param2.field_q; var20Lifetime1++) {
              incrementValue$1 = var14Lifetime1;
              var14Lifetime1++;
              var21Lifetime1 = param2.field_v[incrementValue$1];
              var22Lifetime1 = param0.field_v[var17Lifetime1];
              var23Lifetime1 = var11 * (var21Lifetime1 >>> 24) >> 8;
              if (0 < var23Lifetime1) {
                var24Lifetime1 = 255 ^ var23Lifetime1;
                param0.field_v[var17Lifetime1] = mp.a(dda.a(16711935, dda.a(16711935, var22Lifetime1) * var24Lifetime1 + var23Lifetime1 * dda.a(var21Lifetime1, 16711935) >> 8), dda.a(dda.a(var21Lifetime1, 65280) * var23Lifetime1 + dda.a(65280, var22Lifetime1) * var24Lifetime1 >> 8, 65280));
              }
              var17Lifetime1++;
            }
            var14Lifetime1 = var14Lifetime1 + var13Lifetime1;
            var17Lifetime1 = var17Lifetime1 + var18Lifetime1;
          }
          var15Lifetime2 = param1.field_t + var8;
          if (param6 != 27) {
            field_m = (String) null;
          }
          for (var19Lifetime2 = 0; var19Lifetime2 < eq.field_c.length; var19Lifetime2++) {
            var16Lifetime2 = var9 + eq.field_c[var19Lifetime2];
            var20Lifetime2 = ce.field_u[var19Lifetime2] - var10;
            if (var20Lifetime2 < 0) {
              var20Lifetime2 = 0;
            }
            var18Lifetime2 = -param1.field_q + param5.field_q;
            var17Lifetime2 = var15Lifetime2 + var16Lifetime2 * param0.field_q;
            var14Lifetime2 = param1.field_q * (-var9 + eq.field_c[var19Lifetime2] + var20Lifetime2);
            for (var21Lifetime2 = 0; var21Lifetime2 < ce.field_u[var19Lifetime2]; var21Lifetime2++) {
              if (var21Lifetime2 < var10) {
                for (var22Lifetime2 = 0; var22Lifetime2 < param1.field_q; var22Lifetime2++) {
                  incrementValue$0 = var14Lifetime2;
                  var14Lifetime2++;
                  var23Lifetime2 = param1.field_v[incrementValue$0];
                  var24Lifetime2 = param0.field_v[var17Lifetime2];
                  var25Lifetime1 = var23Lifetime2 >>> 24;
                  if (var25Lifetime1 > 0) {
                    var26Lifetime1 = var25Lifetime1 ^ 255;
                    param0.field_v[var17Lifetime2] = mp.a(dda.a(16711935, var26Lifetime1 * dda.a(16711935, var24Lifetime2) + dda.a(16711935, var23Lifetime2) * var25Lifetime1 >> 8), dda.a(var25Lifetime1 * dda.a(var23Lifetime2, 65280) + dda.a(65280, var24Lifetime2) * var26Lifetime1 >> 8, 65280));
                  }
                  var17Lifetime2++;
                }
                var17Lifetime2 = var17Lifetime2 + var18Lifetime2;
                continue;
              }
              break;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_80_0 = var7_ref;
          stackIn_80_1 = new StringBuilder().append("ld.C(");
          if (param0 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          stackIn_83_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',');
          if (param1 == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          stackIn_86_1 = ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(',');
          if (param2 == null) {
            stackIn_87_2 = "null";
          } else {
            stackIn_87_2 = "{...}";
          }
          stackIn_89_1 = ((StringBuilder) (Object) stackIn_86_1).append(stackIn_87_2).append(',');
          if (param3 == null) {
            stackIn_90_2 = "null";
          } else {
            stackIn_90_2 = "{...}";
          }
          stackIn_92_1 = ((StringBuilder) (Object) stackIn_89_1).append(stackIn_90_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_93_2 = "null";
          } else {
            stackIn_93_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_92_1).append(stackIn_93_2).append(',').append(param6).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_o = null;
        if (!param0) {
          field_q = -18;
        }
        field_l = null;
        field_m = null;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        gma.field_e[param1] = new si(param1, param0, param0);
        if (param2 != 45) {
          ld.b(true);
        }
    }

    static {
        field_n = -1;
        field_m = "Select a creature to bring up your actions again.";
    }
}
