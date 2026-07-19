/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jv {
    static boolean field_a;
    static int field_c;
    static int[][] field_d;
    static wk[] field_b;
    static String field_e;

    final static int a(boolean param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_2_0 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (!param0) {
              var2_int = 0;
              L1: while (true) {
                stackOut_5_0 = var2_int;
                stackOut_5_1 = wp.field_H.length;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (stackIn_6_0 >= stackIn_6_1) {
                        break L4;
                      } else {
                        stackOut_7_0 = 0;
                        stackIn_18_0 = stackOut_7_0;
                        stackIn_8_0 = stackOut_7_0;
                        if (var4 != 0) {
                          break L3;
                        } else {
                          var3 = stackIn_8_0;
                          L5: while (true) {
                            L6: {
                              if (var3 >= wp.field_H[var2_int].length) {
                                break L6;
                              } else {
                                stackOut_10_0 = wp.field_H[var2_int][var3];
                                stackOut_10_1 = param1;
                                stackIn_6_0 = stackOut_10_0;
                                stackIn_6_1 = stackOut_10_1;
                                stackIn_11_0 = stackOut_10_0;
                                stackIn_11_1 = stackOut_10_1;
                                if (var4 != 0) {
                                  continue L2;
                                } else {
                                  if (stackIn_11_0 == stackIn_11_1) {
                                    stackOut_13_0 = var2_int;
                                    stackIn_14_0 = stackOut_13_0;
                                    decompiledRegionSelector0 = 2;
                                    break L0;
                                  } else {
                                    var3++;
                                    if (var4 == 0) {
                                      continue L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                            }
                            var2_int++;
                            if (var4 == 0) {
                              continue L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L3;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = -40;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "jv.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    public static void a(byte param0) {
        te discarded$0 = null;
        field_b = null;
        field_d = (int[][]) null;
        field_e = null;
        if (param0 != 36) {
            sn var2 = (sn) null;
            discarded$0 = jv.a((sn) null, -72, 76, (byte) 115);
        }
    }

    final static te a(sn param0, int param1, int param2, byte param3) {
        RuntimeException var4 = null;
        te stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        te stackOut_2_0 = null;
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
              if (param3 > 26) {
                break L1;
              } else {
                field_b = (wk[]) null;
                break L1;
              }
            }
            stackOut_2_0 = ne.a(-92, aa.a(param0, 100, param2, param1));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("jv.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_a = false;
        field_e = "The cannon cannot be built on a structure";
    }
}
