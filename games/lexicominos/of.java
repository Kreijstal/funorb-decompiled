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
            field_b = null;
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
        ij var13 = null;
        ng var14 = null;
        ij stackIn_12_0 = null;
        ng stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        ng stackOut_19_0 = null;
        ij stackOut_11_0 = null;
        ij stackOut_10_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var12 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var14 = new ng();
            var14.b(118, (kd) (Object) param2);
            var4 = param0.length;
            var5 = param0[0].length;
            var6 = new ij[var4];
            var7 = 0;
            L1: while (true) {
              if (var7 >= var5) {
                stackOut_19_0 = (ng) var14;
                stackIn_20_0 = stackOut_19_0;
                break L0;
              } else {
                var8 = -1;
                var9 = param2;
                var10 = 0;
                L2: while (true) {
                  if (var4 <= var10) {
                    var7++;
                    continue L1;
                  } else {
                    L3: {
                      if (param0[var10][var7] != 0) {
                        L4: {
                          var13 = var6[var10];
                          var11 = var13;
                          if (var10 <= 0) {
                            break L4;
                          } else {
                            if (var6[var10 - 1] == null) {
                              break L4;
                            } else {
                              L5: {
                                if (var11 != null) {
                                  stackOut_11_0 = var13.a(23446, var6[-1 + var10]);
                                  stackIn_12_0 = stackOut_11_0;
                                  break L5;
                                } else {
                                  stackOut_10_0 = var6[-1 + var10];
                                  stackIn_12_0 = stackOut_10_0;
                                  break L5;
                                }
                              }
                              var11 = stackIn_12_0;
                              break L4;
                            }
                          }
                        }
                        L6: {
                          if (var11 == null) {
                            var11 = new ij();
                            var14.b(111, (kd) (Object) var11);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var11.a(var9, var7, -1009900016, var10, var10 + -var8 - 1);
                        var9 = var11;
                        var6[var10] = var11;
                        var8 = var10;
                        break L3;
                      } else {
                        var6[var10] = null;
                        break L3;
                      }
                    }
                    var10++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3;
            stackOut_21_1 = new StringBuilder().append("of.A(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          L8: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44).append(0).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
        return stackIn_20_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new wf(256);
        field_c = null;
        field_b = "Secret achievement";
    }
}
