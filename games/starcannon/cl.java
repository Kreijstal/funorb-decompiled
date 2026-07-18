/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends od {
    static int field_j;
    static pf field_k;

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    cl(long param0, String param1) {
        super(param0, param1);
    }

    final s b(byte param0) {
        if (param0 != 1) {
            Object var3 = null;
            hl discarded$0 = cl.a(-8, (hl) null, false, true, (int[]) null, -126);
        }
        return ef.field_e;
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4) {
        int discarded$0 = 1;
        wj.b();
        ki.c(param2, param3, param4, param1);
    }

    final static hl a(int param0, hl param1, boolean param2, boolean param3, int[] param4, int param5) {
        RuntimeException var6 = null;
        int[] var7 = null;
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
        hl var21 = null;
        int[] var23 = null;
        int[] var25 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        Object stackIn_3_0 = null;
        hl stackIn_34_0 = null;
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
        hl stackOut_33_0 = null;
        Object stackOut_2_0 = null;
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
        var19 = StarCannon.field_A;
        try {
          L0: {
            if (!param3) {
              var21 = new hl(param0 + (param0 + param1.field_u), param0 + param1.field_v - -param0);
              var21.field_x = param0 + (param1.field_x - -param0);
              var21.field_q = param0 + (param0 + param1.field_q);
              var21.field_y = -param0 + param1.field_y;
              var21.field_w = param1.field_w - param0;
              var29 = var21.field_B;
              var27 = var29;
              var25 = var27;
              var23 = var25;
              var7 = var23;
              var28 = param1.field_B;
              var9 = param0 * param0;
              var10 = (param0 << 1) + (var9 + 1) << 1;
              var11 = -param0;
              L1: while (true) {
                if (param0 < var11) {
                  var20 = 0;
                  var11 = var20;
                  L2: while (true) {
                    if (var20 >= var29.length) {
                      stackOut_33_0 = (hl) var21;
                      stackIn_34_0 = stackOut_33_0;
                      break L0;
                    } else {
                      L3: {
                        var12 = var29[var20];
                        if (var12 != 2147483647) {
                          if (var12 == 0) {
                            break L3;
                          } else {
                            var7[var20] = param4[var12];
                            break L3;
                          }
                        } else {
                          var29[var20] = 0;
                          break L3;
                        }
                      }
                      var20++;
                      continue L2;
                    }
                  }
                } else {
                  var10 = var10 + (var11 * 2 - 1);
                  var12 = var10;
                  var13 = -param0;
                  L4: while (true) {
                    if (param0 < var13) {
                      var11++;
                      continue L1;
                    } else {
                      L5: {
                        var12 = var12 + (var13 * 2 + -1);
                        if (var12 <= var9) {
                          L6: {
                            var14 = (var9 + -var12) * param5 / var9;
                            if (!param2) {
                              break L6;
                            } else {
                              if (0 != var13) {
                                break L6;
                              } else {
                                if (var11 == 0) {
                                  var14 = 2147483647;
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var15 = 0;
                          var16 = (var11 - -param0) * var21.field_u + (param0 + var13);
                          var17 = 0;
                          L7: while (true) {
                            if (var17 >= param1.field_v) {
                              break L5;
                            } else {
                              var18 = 0;
                              L8: while (true) {
                                if (var18 >= param1.field_u) {
                                  var16 = var16 + (param0 << 1);
                                  var17++;
                                  continue L7;
                                } else {
                                  L9: {
                                    if (0 == var28[var15]) {
                                      break L9;
                                    } else {
                                      if (var14 <= var29[var16]) {
                                        break L9;
                                      } else {
                                        var29[var16] = var14;
                                        break L9;
                                      }
                                    }
                                  }
                                  var15++;
                                  var16++;
                                  var18++;
                                  continue L8;
                                }
                              }
                            }
                          }
                        } else {
                          break L5;
                        }
                      }
                      var13++;
                      continue L4;
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (hl) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var6;
            stackOut_35_1 = new StringBuilder().append("cl.E(").append(param0).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param1 == null) {
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
            stackOut_38_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',').append(param2).append(',').append(param3).append(',');
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
          throw sd.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ',' + param5 + ')');
        }
        return stackIn_34_0;
    }

    public static void d() {
        field_k = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new pf();
    }
}
