/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ai extends cg {
    static bk field_k;
    static String field_l;
    static int[] field_j;
    static int field_m;

    public static void g() {
        field_l = null;
        int var1 = -1;
        field_k = null;
        field_j = null;
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (((ai) this).a(param0, -64) == pe.field_b) {
              stackOut_2_0 = d.field_j;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (param1) {
                field_m = -2;
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ai.I(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ')');
        }
        return (String) (Object) stackIn_7_0;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        var14 = Main.field_T;
        try {
          L0: {
            if (param1 <= param3) {
              return;
            } else {
              if (param3 + 1 < param2) {
                L1: {
                  if (5 + param3 >= param2) {
                    break L1;
                  } else {
                    if (param5 != param0) {
                      var7_int = (param5 >> 1) + ((param0 >> 1) - -(param0 & param5 & 1));
                      var8 = param3;
                      var9 = param0;
                      var10 = param5;
                      var11 = param3;
                      L2: while (true) {
                        if (var11 >= param2) {
                          ai.a(param0, param1, var8, param3, param4, var9, 8192);
                          ai.a(var10, param1, param2, var8, param4, param5, param6);
                          break L0;
                        } else {
                          L3: {
                            var12 = re.field_c[var11];
                            if (param4) {
                              stackOut_22_0 = p.field_n[var12];
                              stackIn_23_0 = stackOut_22_0;
                              break L3;
                            } else {
                              stackOut_21_0 = db.field_l[var12];
                              stackIn_23_0 = stackOut_21_0;
                              break L3;
                            }
                          }
                          var13 = stackIn_23_0;
                          if (var7_int < var13) {
                            L4: {
                              re.field_c[var11] = re.field_c[var8];
                              int incrementValue$1 = var8;
                              var8++;
                              re.field_c[incrementValue$1] = var12;
                              if (var9 <= var13) {
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            var11++;
                            continue L2;
                          } else {
                            L5: {
                              if (var13 > var10) {
                                var10 = var13;
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            var11++;
                            continue L2;
                          }
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                var7_int = -1 + param2;
                L6: while (true) {
                  if (var7_int <= param3) {
                    return;
                  } else {
                    var8 = param3;
                    L7: while (true) {
                      if (var7_int <= var8) {
                        var7_int--;
                        continue L6;
                      } else {
                        L8: {
                          var9 = re.field_c[var8];
                          var10 = re.field_c[1 + var8];
                          if (!oa.a(-29680, var9, param4, var10)) {
                            break L8;
                          } else {
                            re.field_c[var8] = var10;
                            re.field_c[1 + var8] = var9;
                            break L8;
                          }
                        }
                        var8++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var7, "ai.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    ai(hf param0) {
        super(param0);
    }

    final sg a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        sg stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        sg stackIn_11_0 = null;
        sg stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        sg stackOut_2_0 = null;
        sg stackOut_12_0 = null;
        sg stackOut_10_0 = null;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var4 = (CharSequence) (Object) param0;
            if (!pg.a(false, var4)) {
              stackOut_2_0 = pe.field_b;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              var5 = (CharSequence) (Object) param0;
              var3_int = ie.a(false, var5);
              if (param1 <= -58) {
                L1: {
                  if (var3_int <= 0) {
                    break L1;
                  } else {
                    if (var3_int <= 130) {
                      stackOut_12_0 = ii.field_e;
                      stackIn_13_0 = stackOut_12_0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                stackOut_10_0 = pe.field_b;
                stackIn_11_0 = stackOut_10_0;
                return stackIn_11_0;
              } else {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                return (sg) (Object) stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("ai.M(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
        return stackIn_13_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "to keep fullscreen or";
        field_k = new bk();
        field_j = new int[8192];
    }
}
