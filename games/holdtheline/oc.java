/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    static ah field_d;
    static nn field_c;
    static int field_a;
    static String field_b;

    final static bm[] a(String param0, gn param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        bm[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 32) {
            field_a = 48;
          }
          var4_int = param1.c(param3, 3);
          var5 = param1.a(var4_int, param0, false);
          stackIn_3_0 = il.a((byte) 21, param1, var4_int, var5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("oc.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static ef a(int param0, int param1, int param2, int param3, ib param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        ef var7 = null;
        int var8 = 0;
        java.awt.Frame var9 = null;
        ef stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = mk.a(2, param5, param1, param2, param4, param0);
          var6 = var9;
          if (var9 == null) {
            return null;
          }
          var8 = -92 % ((-69 - param3) / 53);
          var7 = new ef();
          var7.field_f = var9;
          var7.field_f.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, 0, param5, param2);
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_4_0 = var7;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_7_0 = var6_ref;
          stackIn_7_1 = new StringBuilder().append("oc.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0, String param1) {
        sg.field_Y = param1;
        if (param0 != 16711680) {
          return;
        }
        try {
          go.a(0, 12);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "oc.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        if (param0 != -1) {
          oc.a(-20);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        int incrementValue$0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
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
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var16Lifetime4;
        int var17Lifetime1;
        int var17Lifetime2;
        int var17Lifetime3;
        int var17Lifetime4;
        int var18Lifetime1;
        int var18Lifetime2;
        int var18Lifetime3;
        int var18Lifetime4;
        int var19Lifetime1;
        int var19Lifetime2;
        int var19Lifetime3;
        int var19Lifetime4;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        int var15Lifetime1Lifetime1;
        int var15Lifetime1Lifetime2;
        int var15Lifetime1Lifetime3;
        int var15Lifetime1Lifetime4;
        int var16Lifetime4Lifetime1;
        int var16Lifetime4Lifetime2;
        int var16Lifetime4Lifetime3;
        int var16Lifetime4Lifetime4;
        int var17Lifetime4Lifetime1;
        int var17Lifetime4Lifetime2;
        int var17Lifetime4Lifetime3;
        int var17Lifetime4Lifetime4;
        int var18Lifetime4Lifetime1;
        int var18Lifetime4Lifetime2;
        int var18Lifetime4Lifetime3;
        int var18Lifetime4Lifetime4;
        int var19Lifetime4Lifetime1;
        int var19Lifetime4Lifetime2;
        int var19Lifetime4Lifetime3;
        int var19Lifetime4Lifetime4;
        int var20Lifetime4Lifetime1;
        int var20Lifetime4Lifetime2;
        int var20Lifetime4Lifetime3;
        int var20Lifetime4Lifetime4;
        var21 = HoldTheLine.field_D;
        try {
          if (param5 == 256) {
            tc.c(param2, param1, param0, param3);
          }
          if (param5 != 256 &&
            param5 != 0) {
            var7 = 84 / ((param4 + 20) / 63);
            var6_int = -16711936 & param5 * (16711935 & param3);
            param3 = param5 * (param3 & 65280) & 16711680;
            param5 = -param5 + 256;
            if (param0 == 0) {
              var8 = param2;
              var9 = param1;
              var10 = var6_int;
              var11 = param3;
              var12 = param5;
              if (tc.field_d <= var8 &&
                tc.field_e > var8 &&
                var9 >= tc.field_a &&
                var9 < tc.field_i) {
                var13 = tc.field_j * var9 + var8;
                var14 = tc.field_b[var13];
                var15 = var10 + (-16711936 & (var14 & 16711935) * var12);
                var14 = var11 + (16711680 & var12 * (var14 & 65280));
                tc.field_b[var13] = kc.a(var15, var14) >>> 8;
              }
              return;
            }
            if (param0 < 0) {
              param0 = -param0;
            }
            if (tc.field_d <= param0 + param2 &&
              param2 - param0 < tc.field_e &&
              tc.field_a <= param0 + param1 &&
              -param0 + param1 < tc.field_i) {
              var8Lifetime1 = param2 + tc.field_j * param1;
              var9Lifetime1 = var8Lifetime1;
              var10Lifetime1 = var8Lifetime1 - tc.field_j * param0;
              var11Lifetime1 = param0 * tc.field_j + var8Lifetime1;
              var12Lifetime1 = param0;
              var13Lifetime1 = 0;
              param0 = param0 * param0;
              var14Lifetime1 = -var12Lifetime1 + param0;
              if (param2 - var12Lifetime1 >= tc.field_d &&
                tc.field_a <= param1 &&
                tc.field_i > param1) {
                var15Lifetime1 = -var12Lifetime1 + var8Lifetime1;
                var16 = var6_int;
                var17 = param3;
                var18 = param5;
                var19 = tc.field_b[var15Lifetime1];
                var20 = var16 + ((var19 & 16711935) * var18 & -16711936);
                var19 = var17 + (16711680 & (var19 & 65280) * var18);
                tc.field_b[var15Lifetime1] = kc.a(var19, var20) >>> 8;
              }
              if (tc.field_e > var12Lifetime1 + param2 &&
                tc.field_a <= param1 &&
                param1 < tc.field_i) {
                var15Lifetime1Lifetime1 = var8Lifetime1 + var12Lifetime1;
                var16Lifetime1 = var6_int;
                var17Lifetime1 = param3;
                var18Lifetime1 = param5;
                var19Lifetime1 = tc.field_b[var15Lifetime1Lifetime1];
                var20Lifetime1 = (var18Lifetime1 * (16711935 & var19Lifetime1) & -16711936) + var16Lifetime1;
                var19Lifetime1 = var17Lifetime1 + (16711680 & (var19Lifetime1 & 65280) * var18Lifetime1);
                tc.field_b[var15Lifetime1Lifetime1] = kc.a(var20Lifetime1, var19Lifetime1) >>> 8;
              }
              if (tc.field_a <= param1 - var12Lifetime1 &&
                tc.field_d <= param2 &&
                tc.field_e > param2) {
                var15Lifetime1Lifetime2 = var10Lifetime1;
                var16Lifetime2 = var6_int;
                var17Lifetime2 = param3;
                var18Lifetime2 = param5;
                var19Lifetime2 = tc.field_b[var15Lifetime1Lifetime2];
                var20Lifetime2 = (var18Lifetime2 * (16711935 & var19Lifetime2) & -16711936) + var16Lifetime2;
                var19Lifetime2 = (var18Lifetime2 * (var19Lifetime2 & 65280) & 16711680) + var17Lifetime2;
                tc.field_b[var15Lifetime1Lifetime2] = kc.a(var20Lifetime2, var19Lifetime2) >>> 8;
              }
              if (var12Lifetime1 + param1 < tc.field_i &&
                param2 >= tc.field_d &&
                tc.field_e > param2) {
                var15Lifetime1Lifetime3 = var11Lifetime1;
                var16Lifetime3 = var6_int;
                var17Lifetime3 = param3;
                var18Lifetime3 = param5;
                var19Lifetime3 = tc.field_b[var15Lifetime1Lifetime3];
                var20Lifetime3 = var16Lifetime3 + (-16711936 & var18Lifetime3 * (var19Lifetime3 & 16711935));
                var19Lifetime3 = var17Lifetime3 + (16711680 & var18Lifetime3 * (var19Lifetime3 & 65280));
                tc.field_b[var15Lifetime1Lifetime3] = kc.a(var19Lifetime3, var20Lifetime3) >>> 8;
              }
              while (true) {
                var9Lifetime1 = var9Lifetime1 + tc.field_j;
                incrementValue$0 = var13Lifetime1;
                var13Lifetime1++;
                var14Lifetime1 = var14Lifetime1 + (incrementValue$0 + var13Lifetime1);
                var8Lifetime1 = var8Lifetime1 - tc.field_j;
                if (param0 < var14Lifetime1) {
                  var11Lifetime1 = var11Lifetime1 - tc.field_j;
                  var12Lifetime1--;
                  var14Lifetime1 = var14Lifetime1 - (var12Lifetime1 + var12Lifetime1);
                  var10Lifetime1 = var10Lifetime1 + tc.field_j;
                }
                if (var12Lifetime1 < var13Lifetime1) {
                  return;
                }
                if (tc.field_a <= param1 - var12Lifetime1 &&
                  -var12Lifetime1 + param1 < tc.field_i) {
                  if (tc.field_d <= -var13Lifetime1 + param2 &&
                    param2 - var13Lifetime1 < tc.field_e) {
                    var15Lifetime1Lifetime4 = var10Lifetime1 - var13Lifetime1;
                    var16Lifetime4 = var6_int;
                    var17Lifetime4 = param3;
                    var18Lifetime4 = param5;
                    var19Lifetime4 = tc.field_b[var15Lifetime1Lifetime4];
                    var20Lifetime4 = var16Lifetime4 + (-16711936 & (16711935 & var19Lifetime4) * var18Lifetime4);
                    var19Lifetime4 = var17Lifetime4 + (16711680 & (var19Lifetime4 & 65280) * var18Lifetime4);
                    tc.field_b[var15Lifetime1Lifetime4] = kc.a(var19Lifetime4, var20Lifetime4) >>> 8;
                  }
                  if (tc.field_d <= var13Lifetime1 + param2 &&
                    var13Lifetime1 + param2 < tc.field_e) {
                    var15Lifetime1Lifetime4 = var13Lifetime1 + var10Lifetime1;
                    var16Lifetime4 = var6_int;
                    var17Lifetime4 = param3;
                    var18Lifetime4 = param5;
                    var19Lifetime4 = tc.field_b[var15Lifetime1Lifetime4];
                    var20Lifetime4 = (-16711936 & var18Lifetime4 * (var19Lifetime4 & 16711935)) + var16Lifetime4;
                    var19Lifetime4 = var17Lifetime4 + (16711680 & (var19Lifetime4 & 65280) * var18Lifetime4);
                    tc.field_b[var15Lifetime1Lifetime4] = kc.a(var20Lifetime4, var19Lifetime4) >>> 8;
                  }
                }
                if (-var13Lifetime1 + param1 >= tc.field_a &&
                  param1 - var13Lifetime1 < tc.field_i) {
                  if (tc.field_d <= param2 - var12Lifetime1 &&
                    tc.field_e > -var12Lifetime1 + param2) {
                    var15Lifetime1Lifetime4 = -var12Lifetime1 + var8Lifetime1;
                    var16Lifetime4Lifetime1 = var6_int;
                    var17Lifetime4Lifetime1 = param3;
                    var18Lifetime4Lifetime1 = param5;
                    var19Lifetime4Lifetime1 = tc.field_b[var15Lifetime1Lifetime4];
                    var20Lifetime4Lifetime1 = var16Lifetime4Lifetime1 + ((16711935 & var19Lifetime4Lifetime1) * var18Lifetime4Lifetime1 & -16711936);
                    var19Lifetime4Lifetime1 = (16711680 & var18Lifetime4Lifetime1 * (var19Lifetime4Lifetime1 & 65280)) + var17Lifetime4Lifetime1;
                    tc.field_b[var15Lifetime1Lifetime4] = kc.a(var19Lifetime4Lifetime1, var20Lifetime4Lifetime1) >>> 8;
                  }
                  if (var12Lifetime1 + param2 >= tc.field_d &&
                    tc.field_e > param2 + var12Lifetime1) {
                    var15Lifetime1Lifetime4 = var8Lifetime1 + var12Lifetime1;
                    var16Lifetime4Lifetime1 = var6_int;
                    var17Lifetime4Lifetime1 = param3;
                    var18Lifetime4Lifetime1 = param5;
                    var19Lifetime4Lifetime1 = tc.field_b[var15Lifetime1Lifetime4];
                    var20Lifetime4Lifetime1 = (-16711936 & (16711935 & var19Lifetime4Lifetime1) * var18Lifetime4Lifetime1) + var16Lifetime4Lifetime1;
                    var19Lifetime4Lifetime1 = (var18Lifetime4Lifetime1 * (var19Lifetime4Lifetime1 & 65280) & 16711680) + var17Lifetime4Lifetime1;
                    tc.field_b[var15Lifetime1Lifetime4] = kc.a(var19Lifetime4Lifetime1, var20Lifetime4Lifetime1) >>> 8;
                  }
                }
                if (tc.field_a <= var13Lifetime1 + param1 &&
                  tc.field_i > param1 + var13Lifetime1) {
                  if (tc.field_d <= -var12Lifetime1 + param2 &&
                    param2 - var12Lifetime1 < tc.field_e) {
                    var15Lifetime1Lifetime4 = -var12Lifetime1 + var9Lifetime1;
                    var16Lifetime4Lifetime2 = var6_int;
                    var17Lifetime4Lifetime2 = param3;
                    var18Lifetime4Lifetime2 = param5;
                    var19Lifetime4Lifetime2 = tc.field_b[var15Lifetime1Lifetime4];
                    var20Lifetime4Lifetime2 = var16Lifetime4Lifetime2 + ((16711935 & var19Lifetime4Lifetime2) * var18Lifetime4Lifetime2 & -16711936);
                    var19Lifetime4Lifetime2 = ((65280 & var19Lifetime4Lifetime2) * var18Lifetime4Lifetime2 & 16711680) + var17Lifetime4Lifetime2;
                    tc.field_b[var15Lifetime1Lifetime4] = kc.a(var19Lifetime4Lifetime2, var20Lifetime4Lifetime2) >>> 8;
                  }
                  if (param2 + var12Lifetime1 >= tc.field_d &&
                    var12Lifetime1 + param2 < tc.field_e) {
                    var15Lifetime1Lifetime4 = var9Lifetime1 + var12Lifetime1;
                    var16Lifetime4Lifetime2 = var6_int;
                    var17Lifetime4Lifetime2 = param3;
                    var18Lifetime4Lifetime2 = param5;
                    var19Lifetime4Lifetime2 = tc.field_b[var15Lifetime1Lifetime4];
                    var20Lifetime4Lifetime2 = var16Lifetime4Lifetime2 + ((var19Lifetime4Lifetime2 & 16711935) * var18Lifetime4Lifetime2 & -16711936);
                    var19Lifetime4Lifetime2 = ((var19Lifetime4Lifetime2 & 65280) * var18Lifetime4Lifetime2 & 16711680) + var17Lifetime4Lifetime2;
                    tc.field_b[var15Lifetime1Lifetime4] = kc.a(var19Lifetime4Lifetime2, var20Lifetime4Lifetime2) >>> 8;
                  }
                }
                if (param1 + var12Lifetime1 < tc.field_a) {
                  continue;
                }
                if ((param1 + var12Lifetime1) >= tc.field_i) {
                  continue;
                }
                if (tc.field_d <= param2 - var13Lifetime1 &&
                  tc.field_e > param2 - var13Lifetime1) {
                  var15Lifetime1Lifetime4 = -var13Lifetime1 + var11Lifetime1;
                  var16Lifetime4Lifetime3 = var6_int;
                  var17Lifetime4Lifetime3 = param3;
                  var18Lifetime4Lifetime3 = param5;
                  var19Lifetime4Lifetime3 = tc.field_b[var15Lifetime1Lifetime4];
                  var20Lifetime4Lifetime3 = var16Lifetime4Lifetime3 + (-16711936 & var18Lifetime4Lifetime3 * (16711935 & var19Lifetime4Lifetime3));
                  var19Lifetime4Lifetime3 = var17Lifetime4Lifetime3 + (var18Lifetime4Lifetime3 * (var19Lifetime4Lifetime3 & 65280) & 16711680);
                  tc.field_b[var15Lifetime1Lifetime4] = kc.a(var19Lifetime4Lifetime3, var20Lifetime4Lifetime3) >>> 8;
                }
                if (tc.field_d > param2 + var13Lifetime1) {
                  continue;
                }
                if (tc.field_e <= var13Lifetime1 + param2) {
                  continue;
                }
                var15Lifetime1Lifetime4 = var13Lifetime1 + var11Lifetime1;
                var16Lifetime4Lifetime4 = var6_int;
                var17Lifetime4Lifetime4 = param3;
                var18Lifetime4Lifetime4 = param5;
                var19Lifetime4Lifetime4 = tc.field_b[var15Lifetime1Lifetime4];
                var20Lifetime4Lifetime4 = var16Lifetime4Lifetime4 + (var18Lifetime4Lifetime4 * (16711935 & var19Lifetime4Lifetime4) & -16711936);
                var19Lifetime4Lifetime4 = var17Lifetime4Lifetime4 + (16711680 & var18Lifetime4Lifetime4 * (var19Lifetime4Lifetime4 & 65280));
                tc.field_b[var15Lifetime1Lifetime4] = kc.a(var20Lifetime4Lifetime4, var19Lifetime4Lifetime4) >>> 8;
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var6), "oc.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static oe a(float param0, int param1, oe param2) {
        oe var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        oe stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new oe(param2.field_e * (1.0f - param0), param2.field_b, param2.field_c);
          gk.field_d[2] = (float)param2.field_m.field_h;
          gk.field_d[1] = (float)param2.field_l.field_h;
          gk.field_d[0] = (float)param2.field_k.field_h;
          var4 = (int)lk.a(gk.field_d, 0, 2, param1 - 16711936, param0);
          if (param1 != 16711935) {
            field_d = (ah) null;
          }
          var5 = (int)lk.a(gk.field_d, 1, 1, param1 - 16711936, param0);
          gk.field_d[0] = (float)param2.field_k.field_f;
          gk.field_d[2] = (float)param2.field_m.field_f;
          gk.field_d[1] = (float)param2.field_l.field_f;
          var6 = (int)lk.a(gk.field_d, 0, 2, -1, param0);
          var7 = (int)lk.a(gk.field_d, 1, 1, param1 - 16711936, param0);
          var3.field_k = new qm(var4, var6);
          var3.field_l = new qm(var5, var7);
          var3.field_m = new qm(param2.field_m);
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("oc.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(lf param0, int param1, qi param2, int param3, String param4) {
        int var7 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = HoldTheLine.field_D;
        try {
          var5_int = 0;
          var6 = -1;
          if (param3 < 111) {
            field_b = (String) null;
          }
          for (var7 = 1; param4.length() > var7; var7++) {
            var8 = param4.charAt(var7);
            if (var8 == 60) {
              var6 = param0.field_c[0] + (var5_int >> 8) + param2.a(param4.substring(0, var7));
            }
            if (var6 != -1) {
              param0.field_c[var7] = var6;
            } else {
              if (var8 == 32) {
                var5_int = var5_int + param1;
              }
              param0.field_c[var7] = (var5_int >> 8) + (param0.field_c[0] + (param2.a(param4.substring(0, 1 + var7)) - param2.a((char) var8)));
            }
            if (var8 == 62) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("oc.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    static {
        field_d = new ah();
        field_b = "Unpacking music";
    }
}
