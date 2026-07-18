/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of extends td {
    final static kv a(kv param0, int[] param1, boolean param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var7 = 0;
        int[] var8 = null;
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
        kv var22 = null;
        int[] var24 = null;
        int[] var26 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        kv stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        kv stackOut_24_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var20 = BachelorFridge.field_y;
        try {
          L0: {
            var22 = new kv(param0.field_q + (param5 + param5), param5 + param0.field_p + param5);
            var22.field_t = -param5 + param0.field_t;
            var22.field_o = param5 + param0.field_o - -param5;
            var22.field_u = param0.field_u + -param5;
            var7 = 107 / ((param4 - 43) / 36);
            var22.field_n = param5 + (param0.field_n + param5);
            var30 = var22.field_v;
            var28 = var30;
            var26 = var28;
            var24 = var26;
            var8 = var24;
            var29 = param0.field_v;
            var10 = param5 * param5;
            var11 = (param5 << 1) + var10 + 1 << 1;
            var12 = -param5;
            L1: while (true) {
              if (var12 > param5) {
                var21 = 0;
                var12 = var21;
                L2: while (true) {
                  if (var30.length <= var21) {
                    stackOut_24_0 = (kv) var22;
                    stackIn_25_0 = stackOut_24_0;
                    break L0;
                  } else {
                    L3: {
                      var13 = var30[var21];
                      if (var13 != 2147483647) {
                        if (0 != var13) {
                          var8[var21] = param1[var13];
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        var30[var21] = 0;
                        break L3;
                      }
                    }
                    var21++;
                    continue L2;
                  }
                }
              } else {
                var11 = var11 + (-1 + var12 * 2);
                var13 = var11;
                var14 = -param5;
                L4: while (true) {
                  if (var14 > param5) {
                    var12++;
                    continue L1;
                  } else {
                    L5: {
                      var13 = var13 + (-1 + var14 * 2);
                      if (var10 < var13) {
                        break L5;
                      } else {
                        var15 = (-var13 + var10) * param3 / var10;
                        var16 = 0;
                        var17 = var14 - (-param5 - (param5 + var12) * var22.field_q);
                        var18 = 0;
                        L6: while (true) {
                          if (var18 >= param0.field_p) {
                            break L5;
                          } else {
                            var19 = 0;
                            L7: while (true) {
                              if (var19 >= param0.field_q) {
                                var17 = var17 + (param5 << 1);
                                var18++;
                                continue L6;
                              } else {
                                L8: {
                                  if (var29[var16] == 0) {
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                var16++;
                                var17++;
                                var19++;
                                continue L7;
                              }
                            }
                          }
                        }
                      }
                    }
                    var14++;
                    continue L4;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var6;
            stackOut_26_1 = new StringBuilder().append("of.B(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          L10: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L10;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + false + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_25_0;
    }

    final ii a(op param0, int param1) {
        RuntimeException var3 = null;
        sm var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        aga var9 = null;
        Object stackIn_3_0 = null;
        op stackIn_6_0 = null;
        sm stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        op stackOut_4_0 = null;
        sm stackOut_13_0 = null;
        op stackOut_5_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            var9 = ((of) this).field_h.a(19, param0);
            var4 = new sm(((of) this).field_g, new nq(var9));
            var5 = 0;
            if (param1 == 3) {
              stackOut_4_0 = (op) param0;
              stackIn_6_0 = stackOut_4_0;
              L1: while (true) {
                if (stackIn_6_0.field_z <= var5) {
                  stackOut_13_0 = (sm) var4;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  var6 = 0;
                  L2: while (true) {
                    if (var6 >= param0.field_B) {
                      var5++;
                      stackOut_5_0 = (op) param0;
                      stackIn_6_0 = stackOut_5_0;
                      continue L1;
                    } else {
                      L3: {
                        if (param0.field_a[var5][var6].field_l == null) {
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var6++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (ii) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("of.A(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ')');
        }
        return (ii) (Object) stackIn_14_0;
    }

    final static void b(int param0) {
        bp.d(18);
        if (param0 < 79) {
            Object var2 = null;
            kv discarded$0 = of.a((kv) null, (int[]) null, false, -80, -115, 44);
        }
    }

    of(int param0, aga param1) {
        super(param0, param1);
    }

    static {
    }
}
