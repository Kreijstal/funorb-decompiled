/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends lj {
    static ll field_v;
    private Object field_w;

    final boolean e(int param0) {
        if (param0 != 10999) {
            return false;
        }
        return false;
    }

    public static void a(boolean param0) {
        field_v = null;
        if (param0) {
            field_v = (ll) null;
        }
    }

    final Object c(byte param0) {
        if (param0 != 103) {
            return (Object) null;
        }
        return this.field_w;
    }

    final static boolean a(int param0, int[] param1, boolean param2) {
        RuntimeException var3 = null;
        int[] var4 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                var4 = (int[]) null;
                hb.a(-21, (int[]) null, true);
                break L1;
              }
            }
            L2: {
              if ((param1[param0 >> 304338277] & 1 << (31 & param0)) == 0) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("hb.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final static int a(int param0, int param1, byte[] param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var4_int = -1;
            var5 = param0;
            L1: while (true) {
              if (var5 >= param3) {
                L2: {
                  if (param1 < -106) {
                    break L2;
                  } else {
                    field_v = (ll) null;
                    break L2;
                  }
                }
                var4_int = var4_int ^ -1;
                stackIn_7_0 = var4_int;
                break L0;
              } else {
                var4_int = var4_int >>> 1042230088 ^ of.field_g[(param2[var5] ^ var4_int) & 255];
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("hb.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    hb(Object param0, int param1) {
        super(param1);
        try {
            this.field_w = param0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "hb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_v = new ll();
    }
}
