/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ek {
    static String[] field_b;
    static boolean field_c;
    static String[][] field_a;

    public static void a(byte param0) {
        field_a = (String[][]) null;
        field_b = null;
        if (param0 != 19) {
            ek.a((byte) 93);
        }
    }

    final int a(long param0, int param1) {
        long var4;
        if (param1 > -57) {
          return 68;
        } else {
          L0: {
            var4 = this.a(0);
            if (0L < var4) {
              gf.a(var4, -10309);
              break L0;
            } else {
              break L0;
            }
          }
          return this.a(-1374, param0);
        }
    }

    abstract void a(boolean param0);

    final static ln[] a(int param0, bj param1, int param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == 20839) {
              break L0;
            } else {
              ek.a((byte) -67);
              break L0;
            }
          }
          if (cn.a(param3, param2 ^ 20581, param0, param1)) {
            return aa.a(-113);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("ek.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    abstract int a(int param0, long param1);

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        bj var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length() < nn.field_k) {
                  break L1;
                } else {
                  if (param1.length() > ah.field_h) {
                    break L1;
                  } else {
                    if (param0 < -56) {
                      stackIn_9_0 = 0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var3 = (bj) null;
                      ek.a(107, (bj) null, -97, 126);
                      return false;
                    }
                  }
                }
              }
            }
            stackIn_5_0 = 1;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2);

            stackIn_12_1 = new StringBuilder().append("ek.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    abstract long a(int param0);

    static {
        field_a = new String[][]{new String[]{"You can't breathe this horrible gas! Make sure you get to some fresh air before your oxygen bubble empties. Now, remember: gas rises, so you may be able to dig down to get out of this."}};
    }
}
