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
        ij stackIn_12_0 = null;
        ng stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (var7 >= var5) {
                stackIn_20_0 = (ng) (var13);
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
                      if (-1 != (param0[var10][var7] ^ -1)) {
                        L4: {
                          var14 = var6[var10];
                          var11 = var14;
                          if ((var10 ^ -1) >= -1) {
                            break L4;
                          } else {
                            if (var6[var10 - 1] == null) {
                              break L4;
                            } else {
                              L5: {
                                if (var14 != null) {
                                  stackIn_12_0 = var14.a(param1 ^ 23446, var6[-1 + var10]);
                                  break L5;
                                } else {
                                  stackIn_12_0 = var6[-1 + var10];
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
                            var13.b(111, var11);
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
            stackIn_23_0 = (RuntimeException) (var3);

            stackIn_23_1 = new StringBuilder().append("of.A(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_24_0), stackIn_27_2 + ')');
        }
        return stackIn_20_0;
    }

    static {
        field_a = new wf(256);
        field_c = null;
        field_b = "Secret achievement";
    }
}
