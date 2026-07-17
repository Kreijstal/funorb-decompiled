/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends d {
    static fe field_M;
    int field_K;
    static int[] field_N;
    private re field_I;
    private int field_H;
    static String field_J;
    int field_L;

    public static void b(boolean param0) {
        field_N = null;
        field_M = null;
        field_J = null;
    }

    final int a(int param0, byte param1) {
        L0: {
          if (0 > param0) {
            break L0;
          } else {
            if (((jf) this).field_I.b(125) <= param0) {
              break L0;
            } else {
              L1: {
                if (param1 > 121) {
                  break L1;
                } else {
                  int discarded$2 = ((jf) this).a(112, (byte) -62);
                  break L1;
                }
              }
              return ((jf) this).field_I.a(0, param0);
            }
          }
        }
        return -1;
    }

    final static void c(int param0, int param1) {
        ue.b((byte) 77, param0);
        if (param1 < 84) {
            jf.c(-61, 78);
        }
    }

    final int a(byte param0) {
        if (param0 > -44) {
            int discarded$0 = ((jf) this).a(-3, (byte) 2);
        }
        return ((jf) this).field_I.b(117);
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (bi.field_e >= param0 + param2) {
            return param2;
        }
        if (0 <= -param0 + (param1 + param2)) {
            return -param0 + param2 - -param1;
        }
        return bi.field_e + -param0;
    }

    final int c(boolean param0) {
        if (!param0) {
            field_N = null;
        }
        return ((jf) this).field_H;
    }

    private jf() throws Throwable {
        throw new Error();
    }

    final boolean a(int param0, int param1, int param2, iq param3, int param4, byte param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var14 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, (byte) -115, param6)) {
              L1: {
                if (param5 < -107) {
                  break L1;
                } else {
                  field_N = null;
                  break L1;
                }
              }
              stackOut_24_0 = 0;
              stackIn_25_0 = stackOut_24_0;
              break L0;
            } else {
              L2: {
                var8_int = -param1 + (param0 - ((jf) this).field_K);
                var9 = ((jf) this).field_n + -(((jf) this).field_K * 2);
                if (var9 < var8_int) {
                  var8_int = var9;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var8_int < 0) {
                  var8_int = 0;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var8_int = ((jf) this).field_H * var8_int / var9;
                if (param4 == 1) {
                  ((jf) this).field_I.a((byte) 103, var8_int);
                  break L4;
                } else {
                  if (2 != param4) {
                    break L4;
                  } else {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L5: while (true) {
                      if (var12 >= ((jf) this).field_I.b(127)) {
                        if (var11 < 0) {
                          return true;
                        } else {
                          ((jf) this).field_I.b(var11, 7810);
                          break L4;
                        }
                      } else {
                        L6: {
                          var13 = -var8_int + ((jf) this).field_I.a(0, var12);
                          var13 = var13 * var13;
                          if (var10 > var13) {
                            var10 = var13;
                            var11 = var12;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var12++;
                        continue L5;
                      }
                    }
                  }
                }
              }
              stackOut_20_0 = 1;
              stackIn_21_0 = stackOut_20_0;
              return stackIn_21_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var8;
            stackOut_26_1 = new StringBuilder().append("jf.JA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L7;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L7;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_25_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Unable to add name - system busy";
    }
}
