/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp {
    static String field_b;
    static boolean field_a;

    final static int a(of param0, int param1, id param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_6_0 = 0;
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
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.field_m == null) {
                  break L1;
                } else {
                  if (param2 == null) {
                    break L1;
                  } else {
                    if (param0.field_p != param2.field_l) {
                      break L1;
                    } else {
                      L2: {
                        if (param1 == -1) {
                          break L2;
                        } else {
                          field_a = true;
                          break L2;
                        }
                      }
                      var4_int = param2.field_q.length;
                      var5 = param0.field_m[param3].length / var4_int;
                      var6 = 0;
                      L3: while (true) {
                        L4: {
                          if (var5 <= var6) {
                            stackOut_24_0 = -1;
                            stackIn_25_0 = stackOut_24_0;
                            break L4;
                          } else {
                            stackOut_12_0 = (param0.field_r[param3][var6] < param2.field_s ? -1 : (param0.field_r[param3][var6] == param2.field_s ? 0 : 1));
                            stackIn_25_0 = stackOut_12_0;
                            stackIn_13_0 = stackOut_12_0;
                            if (var8 != 0) {
                              break L4;
                            } else {
                              L5: {
                                if (stackIn_13_0 != 0) {
                                  break L5;
                                } else {
                                  if (!ea.a(param0.field_o[param3][var6], (byte) -25)) {
                                    break L5;
                                  } else {
                                    var7 = 0;
                                    L6: while (true) {
                                      L7: {
                                        if (var4_int <= var7) {
                                          stackOut_21_0 = var6;
                                          stackIn_22_0 = stackOut_21_0;
                                          break L7;
                                        } else {
                                          stackOut_17_0 = param2.field_q[var7] ^ -1;
                                          stackIn_22_0 = stackOut_17_0;
                                          stackIn_18_0 = stackOut_17_0;
                                          if (var8 != 0) {
                                            break L7;
                                          } else {
                                            if (stackIn_18_0 != (param0.field_m[param3][var6 * var4_int + var7] ^ -1)) {
                                              break L5;
                                            } else {
                                              var7++;
                                              continue L6;
                                            }
                                          }
                                        }
                                      }
                                      decompiledRegionSelector0 = 2;
                                      break L0;
                                    }
                                  }
                                }
                              }
                              var6++;
                              continue L3;
                            }
                          }
                        }
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                }
              }
            }
            stackOut_6_0 = -1;
            stackIn_7_0 = stackOut_6_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var4);
            stackOut_26_1 = new StringBuilder().append("kp.C(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          L9: {
            stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param1).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L9;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_25_0;
          } else {
            return stackIn_22_0;
          }
        }
    }

    public static void a(int param0) {
        int discarded$2 = 0;
        id var2 = null;
        if (param0 != -1) {
          var2 = (id) null;
          discarded$2 = kp.a((of) null, -64, (id) null, -29);
          field_b = null;
          return;
        } else {
          field_b = null;
          return;
        }
    }

    final static void a(int param0, id param1, int param2) {
        int discarded$0 = 0;
        try {
            if (param2 <= 60) {
                id var4 = (id) null;
                discarded$0 = kp.a((of) null, 14, (id) null, -12);
            }
            ow.field_f.a((ms) (param1), (byte) 39);
            km.a((byte) 69, param0, param1);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "kp.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_b = "Classic";
        field_a = false;
    }
}
