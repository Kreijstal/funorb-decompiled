/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class toa {
    int field_a;
    int field_b;
    int[] field_c;

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -8636) {
          L0: {
            L1: {
              if (0 == (2048 & param1)) {
                break L1;
              } else {
                if (0 == (55 & param2)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    final int a(int param0) {
        Object var3 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            var3 = null;
            toa.a(104, -1.1755644083023071f, 21, 1.4921725988388062f, -0.9892958402633667f, (byte) 76, (vjb) null, -0.3563171923160553f, -2, 1.3547749519348145f, 48, -53, (byte[]) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((toa) this).field_c == null) {
              break L2;
            } else {
              if (((toa) this).field_c.length != 0) {
                stackOut_6_0 = ((toa) this).field_c[((toa) this).field_c.length - 1];
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0;
    }

    final static void a(int param0, float param1, int param2, float param3, float param4, byte param5, vjb param6, float param7, int param8, float param9, int param10, int param11, byte[] param12) {
        int var13_int = 0;
        RuntimeException var13 = null;
        int var14 = 0;
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
        var14 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param5 < -38) {
                break L1;
              } else {
                boolean discarded$2 = toa.a(80, -3, -102);
                break L1;
              }
            }
            var13_int = 0;
            L2: while (true) {
              if (param2 <= var13_int) {
                break L0;
              } else {
                nq.a(param7, param10, param1, param0, param11, var13_int, param9, param6, param2, param3, param8, param12, (byte) 126, param4);
                param8 = param8 + param0 * param11;
                var13_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var13 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var13;
            stackOut_7_1 = new StringBuilder().append("toa.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param6 == null) {
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param12 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    toa(int param0, int param1, int param2) {
        ((toa) this).field_a = param1;
        ((toa) this).field_b = param0;
        ((toa) this).field_c = new int[1 + param2];
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = VoidHunters.field_G;
          var3 = -63 / ((-8 - param0) / 54);
          if (((toa) this).field_c == null) {
            break L0;
          } else {
            if (((toa) this).field_c.length == 0) {
              break L0;
            } else {
              var4 = 1;
              L1: while (true) {
                if (var4 >= ((toa) this).field_c.length) {
                  return ((toa) this).field_c.length - 1;
                } else {
                  if (param1 < ((toa) this).field_c[var4 - 1] + ((toa) this).field_c[var4] >> 1) {
                    return var4 - 1;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
        return 0;
    }

    static {
    }
}
