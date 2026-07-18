/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pp {
    static vh field_c;
    static int field_b;
    static double field_d;
    static int field_a;

    public static void a(byte param0) {
        field_c = null;
        int var1 = -30;
    }

    final static void a(eg param0, short param1, boolean param2, int[] param3, int[] param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
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
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var21 = Pool.field_O;
        try {
          L0: {
            var6 = 0;
            var7 = 0;
            var8 = 0;
            var5_int = 0;
            L1: while (true) {
              L2: {
                if (param0.field_K <= var5_int) {
                  break L2;
                } else {
                  if (-8246 == param0.field_n[var5_int]) {
                    L3: {
                      if (null != param0.field_Q) {
                        param0.field_Q[var5_int] = (byte) 2;
                        break L3;
                      } else {
                        if (null != param0.field_f) {
                          param0.field_f[var5_int] = (byte) -1;
                          break L3;
                        } else {
                          param0.field_Q = new byte[param0.field_K];
                          param0.field_Q[var5_int] = (byte) 2;
                          break L3;
                        }
                      }
                    }
                    L4: {
                      var9 = param0.field_g[param0.field_N[var5_int]];
                      var10 = param0.field_Y[param0.field_N[var5_int]];
                      var11 = param0.field_q[param0.field_N[var5_int]];
                      var12 = param0.field_g[param0.field_v[var5_int]];
                      var13 = param0.field_Y[param0.field_v[var5_int]];
                      var14 = param0.field_q[param0.field_v[var5_int]];
                      var15 = param0.field_g[param0.field_X[var5_int]];
                      var16 = param0.field_Y[param0.field_X[var5_int]];
                      var17 = param0.field_q[param0.field_X[var5_int]];
                      var6 = var9 - var12;
                      var8 = -var14 + var11;
                      var7 = -var13 + var10;
                      var18 = var6 * var6 + (var7 * var7 - -(var8 * var8));
                      var6 = var9 - var15;
                      var8 = var11 - var17;
                      var7 = -var16 + var10;
                      var19 = var6 * var6 + (var7 * var7 - -(var8 * var8));
                      var6 = var12 + -var15;
                      var8 = var14 + -var17;
                      var7 = var13 - var16;
                      var20 = var7 * var7 + var6 * var6 + var8 * var8;
                      if (var19 >= var18) {
                        break L4;
                      } else {
                        if (var20 < var18) {
                          L5: {
                            var8 = var11 - -var14 >> 1;
                            if (param4 == null) {
                              break L5;
                            } else {
                              param4[0] = -var9 + var12;
                              param4[1] = -var10 + var13;
                              param4[2] = var14 - var11;
                              break L5;
                            }
                          }
                          var7 = var13 + var10 >> 1;
                          var6 = var9 - -var12 >> 1;
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var19 <= var20) {
                      var7 = var13 + var16 >> 1;
                      var8 = var14 - -var17 >> 1;
                      var6 = var12 + var15 >> 1;
                      if (param4 == null) {
                        break L2;
                      } else {
                        param4[2] = -var14 + var17;
                        param4[0] = -var12 + var15;
                        param4[1] = -var13 + var16;
                        break L2;
                      }
                    } else {
                      L6: {
                        var6 = var15 + var9 >> 1;
                        if (param4 != null) {
                          param4[2] = -var11 + var17;
                          param4[1] = var16 + -var10;
                          param4[0] = var15 + -var9;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var7 = var16 + var10 >> 1;
                      var8 = var17 + var11 >> 1;
                      break L2;
                    }
                  } else {
                    var5_int++;
                    continue L1;
                  }
                }
              }
              L7: {
                L8: {
                  if (var6 != 0) {
                    break L8;
                  } else {
                    if (var7 != 0) {
                      break L8;
                    } else {
                      if (var8 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                param3[0] = param3[0] + var6;
                param3[1] = param3[1] + var7;
                param3[2] = param3[2] + var8;
                eg discarded$1 = cq.a(var6, 85, var8, param0, var7);
                break L7;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var5;
            stackOut_32_1 = new StringBuilder().append("pp.D(");
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L9;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L9;
            }
          }
          L10: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',').append(-8246).append(',').append(true).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param3 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L10;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L10;
            }
          }
          L11: {
            stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
            stackOut_38_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param4 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L11;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L11;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ')');
        }
    }

    final static boolean a(boolean param0) {
        return fe.a(oa.field_g, -13671, 26) || ko.a(0, (byte) -127);
    }

    final static void a(String param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var2_int = wn.field_i;
        int var3 = gg.field_f;
        try {
            var4 = uo.field_Lb.field_I.b(param0, 500);
            var5 = 6 + uo.field_Lb.field_I.a(param0, 500);
            var6 = 2 + var4 * ad.field_x;
            var7 = de.a(var5, 12, var2_int, 0);
            var8 = sh.a(var6, var3, -1, 20);
            qh.b(var7, var8, var5, var6, 0);
            qh.f(1 + var7, 1 + var8, var5 + -2, -2 + var6, 16777088);
            int discarded$0 = uo.field_Lb.field_I.a(param0, 3 + var7, wh.field_b + (var8 - -1 + -uo.field_Lb.field_I.field_C), 500, 1000, 0, -1, 0, 0, ad.field_x);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "pp.C(" + (param0 != null ? "{...}" : "null") + ',' + 1259627265 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = Math.atan2(1.0, 0.0);
    }
}
