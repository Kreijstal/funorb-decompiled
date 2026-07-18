/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk extends kg {
    static int field_lb;
    String field_mb;
    static int[][][] field_nb;
    String field_F;
    int field_ob;

    qk() {
        super(0L, (kg) null);
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_13_0 = 0;
        var15 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < 0) {
                var8_int = 127;
                break L1;
              } else {
                var8_int = ll.field_e[param0][param6][param3];
                break L1;
              }
            }
            L2: {
              var9 = param1 - param7;
              var10 = param2 - param5;
              if (var10 < 0) {
                var10 = -var10;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var11 = 0;
              var12 = -43 % ((param4 - 57) / 60);
              if (var9 >= 0) {
                break L3;
              } else {
                var9 = -var9;
                break L3;
              }
            }
            L4: {
              if (var9 >= 32) {
                var9 = -var9 + 64;
                break L4;
              } else {
                break L4;
              }
            }
            if (var9 <= 64) {
              if (16 >= var9) {
                if (var10 * 64 > 240) {
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  return stackIn_21_0;
                } else {
                  var10 = var10 * 4 - -1;
                  var13 = var9 * var9 + var10 * var10;
                  var14 = 0;
                  L5: while (true) {
                    if (var13 <= 0) {
                      var11 = -var14 + 9;
                      var11 = var11 * var8_int >> 3;
                      stackOut_25_0 = var11;
                      stackIn_26_0 = stackOut_25_0;
                      break L0;
                    } else {
                      var13 = var13 >> 1;
                      var14++;
                      continue L5;
                    }
                  }
                }
              } else {
                stackOut_16_0 = 0;
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0;
              }
            } else {
              stackOut_13_0 = -1;
              stackIn_14_0 = stackOut_13_0;
              return stackIn_14_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var8, "qk.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        return stackIn_26_0;
    }

    final static ka a(String param0, String param1, lj param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ka stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        ka stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param2.a(param0, param3 ^ -117);
              if (param3 == 0) {
                break L1;
              } else {
                qk.d((byte) -119);
                break L1;
              }
            }
            var5 = param2.a(var4_int, param1, (byte) 115);
            stackOut_2_0 = jj.a((byte) 62, param2, var4_int, var5);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("qk.C(");
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
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final static void d(byte param0) {
        L0: {
          if (null != da.field_c) {
            da.field_c.o(77);
            break L0;
          } else {
            break L0;
          }
        }
        m.field_j = new ib();
        if (param0 >= -43) {
          return;
        } else {
          bg.field_K.c(0, (ee) (Object) m.field_j);
          return;
        }
    }

    final static void a(boolean param0, int param1) {
        ll.a(0, true, param0);
    }

    public static void c() {
        field_nb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_nb = new int[][][]{new int[2][], new int[2][], new int[2][], new int[2][], new int[2][]};
    }
}
