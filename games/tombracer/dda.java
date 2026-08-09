/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dda extends vg {
    static int[] field_f;
    private bs field_g;

    final bs a(byte param0) {
        if (param0 != -125) {
            dda.a(112);
        }
        return this.field_g;
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != 30967) {
            field_f = (int[]) null;
        }
    }

    dda(hca param0, bs param1) {
        try {
            this.field_g = param1;
            param0.C(-1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "dda.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(boolean param0, String param1) {
        RuntimeException var2 = null;
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
              if (!param0) {
                break L1;
              } else {
                field_f = (int[]) null;
                break L1;
              }
            }
            L2: {
              if (wp.a(119, param1) == null) {
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
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("dda.C(").append(param0).append(',');

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
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    static {
        int var0 = 0;
        field_f = new int[98];
        for (var0 = 0; var0 < 98; var0++) {
            field_f[var0] = 3;
        }
        field_f[5] = 2;
        field_f[33] = 2;
        field_f[31] = 2;
        field_f[43] = 2;
        field_f[30] = 2;
        field_f[39] = 2;
        field_f[32] = 2;
        field_f[29] = 2;
        field_f[41] = 2;
        field_f[40] = 2;
        field_f[42] = 2;
    }
}
