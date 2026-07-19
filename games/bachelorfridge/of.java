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
        kv stackIn_33_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        kv stackOut_32_0 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var20 = BachelorFridge.field_y;
        try {
          L0: {
            var22 = new kv(param0.field_q + (param5 + param5), param5 + param0.field_p + param5);
            var22.field_t = -param5 + param0.field_t;
            var22.field_o = param5 + param0.field_o - -param5;
            var22.field_u = param0.field_u + -param5;
            var7 = 107 / ((param4 - 43) / 36);
            var22.field_n = param5 + (param0.field_n + param5);
            var26 = var22.field_v;
            var24 = var26;
            var8 = var24;
            var28 = param0.field_v;
            var10 = param5 * param5;
            var11 = (param5 << -1694650271) + var10 + 1 << -47069983;
            var12 = -param5;
            L1: while (true) {
              if (var12 > param5) {
                var21 = 0;
                var12 = var21;
                L2: while (true) {
                  if (var26.length <= var21) {
                    stackOut_32_0 = (kv) (var22);
                    stackIn_33_0 = stackOut_32_0;
                    break L0;
                  } else {
                    L3: {
                      var13 = var26[var21];
                      if (-2147483648 != (var13 ^ -1)) {
                        if (0 != var13) {
                          var8[var21] = param1[var13];
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        var26[var21] = 0;
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
                        L6: {
                          var15 = (-var13 + var10) * param3 / var10;
                          if (!param2) {
                            break L6;
                          } else {
                            if (var14 != 0) {
                              break L6;
                            } else {
                              if (-1 == (var12 ^ -1)) {
                                var15 = 2147483647;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        var16 = 0;
                        var17 = var14 - (-param5 - (param5 + var12) * var22.field_q);
                        var18 = 0;
                        L7: while (true) {
                          if (var18 >= param0.field_p) {
                            break L5;
                          } else {
                            var19 = 0;
                            L8: while (true) {
                              if (var19 >= param0.field_q) {
                                var17 = var17 + (param5 << -633914751);
                                var18++;
                                continue L7;
                              } else {
                                if (var28[var16] != 0) {
                                  L9: {
                                    if (var26[var17] < var15) {
                                      var26[var17] = var15;
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                  var16++;
                                  var17++;
                                  var19++;
                                  continue L8;
                                } else {
                                  var16++;
                                  var17++;
                                  var19++;
                                  continue L8;
                                }
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
          L10: {
            var6 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) (var6);
            stackOut_34_1 = new StringBuilder().append("of.B(");
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L10;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L10;
            }
          }
          L11: {
            stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
            stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L11;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L11;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_33_0;
    }

    final ii a(op param0, int param1) {
        RuntimeException var3 = null;
        sm var4 = null;
        int var5 = 0;
        int var6 = 0;
        aga var7 = null;
        int var8 = 0;
        aga var9 = null;
        ii stackIn_3_0 = null;
        op stackIn_6_0 = null;
        sm stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        op stackOut_4_0 = null;
        sm stackOut_13_0 = null;
        op stackOut_5_0 = null;
        ii stackOut_2_0 = null;
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
            var9 = this.field_h.a(19, param0);
            var4 = new sm(this.field_g, new nq(var9));
            var5 = 0;
            if (param1 == 3) {
              stackOut_4_0 = (op) (param0);
              stackIn_6_0 = stackOut_4_0;
              L1: while (true) {
                if (stackIn_6_0.field_z <= var5) {
                  stackOut_13_0 = (sm) (var4);
                  stackIn_14_0 = stackOut_13_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var6 = 0;
                  L2: while (true) {
                    if (var6 >= param0.field_B) {
                      var5++;
                      stackOut_5_0 = (op) (param0);
                      stackIn_6_0 = stackOut_5_0;
                      continue L1;
                    } else {
                      if (param0.field_a[var5][var6].field_l != null) {
                        var7 = param0.field_a[var5][var6].field_l;
                        var4.field_o.a(new iv(new nq(var7), false, 1, 0, 5), true);
                        var6++;
                        continue L2;
                      } else {
                        var6++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = (ii) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3);
            stackOut_15_1 = new StringBuilder().append("of.A(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return (ii) ((Object) stackIn_14_0);
        }
    }

    final static void b(int param0) {
        kv discarded$0 = null;
        bp.d(18);
        if (param0 < 79) {
            int[] var2 = (int[]) null;
            discarded$0 = of.a((kv) null, (int[]) null, false, -80, -115, 44);
        }
    }

    of(int param0, aga param1) {
        super(param0, param1);
    }

    static {
    }
}
