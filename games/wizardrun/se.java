/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se {
    static int field_a;
    static volatile boolean field_b;

    final static void a(int param0, int param1, int param2, int param3, int[] param4) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = wizardrun.field_H;
        try {
          L0: {
            L1: while (true) {
              param3--;
              if (param3 < 0) {
                if (param1 > 74) {
                  break L0;
                } else {
                  se.a(-78, -67, 96);
                  return;
                }
              } else {
                var9 = param4;
                var5 = var9;
                var6 = param0;
                var7 = param2;
                var9[var6] = var7 - -(kl.b(var9[var6], 16711422) >> 2001809345);
                param0++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5_ref);

            stackIn_8_1 = new StringBuilder().append("se.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                field_a = -111;
                break L1;
              }
            }
            L2: {
              if (param0 > param1) {
                var3_int = param1;
                param1 = param0;
                param0 = var3_int;
                L3: while (true) {
                  if (param0 == 0) {
                    break L2;
                  } else {
                    var3_int = param1 % param0;
                    param1 = param0;
                    param0 = var3_int;
                    continue L3;
                  }
                }
              } else {
                L4: while (true) {
                  if (param0 == 0) {
                    break L2;
                  } else {
                    var3_int = param1 % param0;
                    param1 = param0;
                    param0 = var3_int;
                    continue L4;
                  }
                }
              }
            }
            stackIn_10_0 = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var3), "se.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_10_0;
    }

    final static o a(int param0, kl param1, int param2, int param3) {
        RuntimeException var4 = null;
        o stackIn_2_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 > 46) {
              if (h.a(param0, param2, param1, -124)) {
                return sl.g(0);
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (o) null;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("se.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L1;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L1;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_2_0;
    }

    static {
        field_b = true;
    }
}
