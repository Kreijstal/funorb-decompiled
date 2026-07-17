/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de {
    static bd field_c;
    static li field_d;
    static th field_a;
    static int[] field_b;

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != 4) {
            de.a(57);
        }
        field_a = null;
        field_d = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
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
        var14 = stellarshard.field_B;
        try {
          L0: {
            if (param0 < param4) {
              if (param0 + 1 >= param3) {
                return;
              } else {
                L1: {
                  if (5 + param0 >= param3) {
                    break L1;
                  } else {
                    if (param6 != param2) {
                      var7_int = (param1 & (param2 & param6)) + ((param2 >> 1) - -(param6 >> 1));
                      var8 = param0;
                      var9 = param6;
                      var10 = param2;
                      var11 = param0;
                      L2: while (true) {
                        if (param3 <= var11) {
                          de.a(param0, param1, var9, var8, param4, param5, param6);
                          de.a(var8, param1, param2, param3, param4, param5, var10);
                          break L0;
                        } else {
                          L3: {
                            var12 = fj.field_b[var11];
                            if (!param5) {
                              stackOut_22_0 = vh.field_h[var12];
                              stackIn_23_0 = stackOut_22_0;
                              break L3;
                            } else {
                              stackOut_21_0 = se.field_B[var12];
                              stackIn_23_0 = stackOut_21_0;
                              break L3;
                            }
                          }
                          L4: {
                            var13 = stackIn_23_0;
                            if (var7_int >= var13) {
                              if (var13 > var10) {
                                var10 = var13;
                                break L4;
                              } else {
                                break L4;
                              }
                            } else {
                              L5: {
                                fj.field_b[var11] = fj.field_b[var8];
                                if (var9 > var13) {
                                  var9 = var13;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              int incrementValue$1 = var8;
                              var8++;
                              fj.field_b[incrementValue$1] = var12;
                              break L4;
                            }
                          }
                          var11++;
                          continue L2;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                var7_int = param3 + -1;
                L6: while (true) {
                  if (var7_int <= param0) {
                    return;
                  } else {
                    var8 = param0;
                    L7: while (true) {
                      if (var8 >= var7_int) {
                        var7_int--;
                        continue L6;
                      } else {
                        L8: {
                          var9 = fj.field_b[var8];
                          var10 = fj.field_b[var8 - -1];
                          if (!hf.a(var10, param5, var9, (byte) 41)) {
                            break L8;
                          } else {
                            fj.field_b[var8] = var10;
                            fj.field_b[1 + var8] = var9;
                            break L8;
                          }
                        }
                        var8++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var7, "de.C(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    final static bk a(String param0, int param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        bk stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        bk stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -16) {
                break L1;
              } else {
                var3 = null;
                bk discarded$2 = de.a((String) null, 4);
                break L1;
              }
            }
            stackOut_2_0 = new bk(param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("de.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new li(1, 2, 2, 0);
        field_a = new th();
        field_b = new int[4];
    }
}
