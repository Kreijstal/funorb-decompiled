/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    static wf field_a;
    static String field_b;
    static String field_c;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != -1) {
            field_b = (String) null;
        }
    }

    final static ng a(char[][] param0, int param1, ij param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        ij[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        ij var9 = null;
        int var10 = 0;
        ij var11 = null;
        int var12 = 0;
        ng var13 = null;
        ij var14 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        ij stackIn_15_0 = null;
        ng stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        ng stackOut_22_0 = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        ij stackOut_14_0 = null;
        ij stackOut_13_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var12 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var13 = new ng();
            var13.b(param1 ^ 118, param2);
            var4 = param0.length;
            var5 = param0[param1].length;
            var6 = new ij[var4];
            var7 = 0;
            L1: while (true) {
              stackOut_2_0 = var7;
              stackOut_2_1 = var5;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              L2: while (true) {
                if (stackIn_3_0 >= stackIn_3_1) {
                  stackOut_22_0 = (ng) (var13);
                  stackIn_23_0 = stackOut_22_0;
                  break L0;
                } else {
                  var8 = -1;
                  var9 = param2;
                  var10 = 0;
                  L3: while (true) {
                    if (var4 <= var10) {
                      var7++;
                      continue L1;
                    } else {
                      stackOut_6_0 = -1;
                      stackOut_6_1 = param0[var10][var7] ^ -1;
                      stackIn_3_0 = stackOut_6_0;
                      stackIn_3_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var12 != 0) {
                        continue L2;
                      } else {
                        L4: {
                          L5: {
                            if (stackIn_7_0 != stackIn_7_1) {
                              break L5;
                            } else {
                              var6[var10] = null;
                              if (var12 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L6: {
                            var14 = var6[var10];
                            var11 = var14;
                            if ((var10 ^ -1) >= -1) {
                              break L6;
                            } else {
                              if (var6[var10 - 1] == null) {
                                break L6;
                              } else {
                                L7: {
                                  if (var14 != null) {
                                    stackOut_14_0 = var14.a(param1 ^ 23446, var6[-1 + var10]);
                                    stackIn_15_0 = stackOut_14_0;
                                    break L7;
                                  } else {
                                    stackOut_13_0 = var6[-1 + var10];
                                    stackIn_15_0 = stackOut_13_0;
                                    break L7;
                                  }
                                }
                                var11 = stackIn_15_0;
                                break L6;
                              }
                            }
                          }
                          L8: {
                            if (var11 == null) {
                              var11 = new ij();
                              var13.b(111, var11);
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var11.a(var9, var7, -1009900016, var10, var10 + -var8 - 1);
                          var9 = var11;
                          var6[var10] = var11;
                          var8 = var10;
                          break L4;
                        }
                        var10++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var3);
            stackOut_24_1 = new StringBuilder().append("of.A(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          L10: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L10;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
        return stackIn_23_0;
    }

    static {
        field_a = new wf(256);
        field_c = null;
        field_b = "Secret achievement";
    }
}
