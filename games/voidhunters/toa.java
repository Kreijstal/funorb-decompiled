/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class toa {
    int field_a;
    int field_b;
    int[] field_c;

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_6_0 = 0;
        if (param0 == -8636) {
          L0: {
            L1: {
              if (0 == (2048 & param1)) {
                break L1;
              } else {
                if (0 == (55 & param2)) {
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    final int a(int param0) {
        byte[] var3;
        int stackIn_7_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            var3 = (byte[]) null;
            toa.a(104, -1.1755644083023071f, 21, 1.4921725988388062f, -0.9892958402633667f, (byte) 76, (vjb) null, -0.3563171923160553f, -2, 1.3547749519348145f, 48, -53, (byte[]) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_c == null) {
              break L2;
            } else {
              if (this.field_c.length != 0) {
                stackIn_7_0 = this.field_c[this.field_c.length - 1];
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackIn_7_0 = 0;
          break L1;
        }
        return stackIn_7_0;
    }

    final static void a(int param0, float param1, int param2, float param3, float param4, byte param5, vjb param6, float param7, int param8, float param9, int param10, int param11, byte[] param12) {
        int var13_int = 0;
        int var14 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var13 = null;
        var14 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param5 < -38) {
                break L1;
              } else {
                toa.a(80, -3, -102);
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
            stackIn_9_0 = (RuntimeException) (var13);

            stackIn_9_1 = new StringBuilder().append("toa.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');

            if (param12 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
    }

    toa(int param0, int param1, int param2) {
        this.field_a = param1;
        this.field_b = param0;
        this.field_c = new int[1 + param2];
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        L0: {
          var5 = VoidHunters.field_G;
          var3 = -63 / ((-8 - param0) / 54);
          if (this.field_c == null) {
            break L0;
          } else {
            if (this.field_c.length == 0) {
              break L0;
            } else {
              var4 = 1;
              L1: while (true) {
                if (var4 >= this.field_c.length) {
                  return this.field_c.length - 1;
                } else {
                  if ((param1 ^ -1) > (this.field_c[var4 - 1] + this.field_c[var4] >> -1833770719 ^ -1)) {
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
