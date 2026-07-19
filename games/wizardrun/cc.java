/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc implements bf {
    static kl field_a;
    static String field_b;

    public final void a(int param0, int param1, ub param2, boolean param3, boolean param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        o var8 = null;
        ub var9 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var6_int = param2.field_o + param0;
              var7 = param1 - -param2.field_l;
              pe.a(param2.field_n, (byte) -14, var7, param2.field_r, var6_int);
              if (param3) {
                break L1;
              } else {
                var9 = (ub) null;
                this.a(0, 116, (ub) null, true, true);
                break L1;
              }
            }
            L2: {
              var8 = te.field_k[1];
              if (!(param2 instanceof pl)) {
                break L2;
              } else {
                if (((pl) ((Object) param2)).field_z) {
                  var8.a(1 + var6_int + (param2.field_r + -var8.field_x >> -754482847), (param2.field_n - var8.field_s >> 1819292129) + (var7 - -1), 256);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            if (!param2.d((byte) 53)) {
              break L0;
            } else {
              nh.a((byte) 69, param2.field_r - 4, var7 - -2, param2.field_n - 4, 2 + var6_int);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var6);
            stackOut_9_1 = new StringBuilder().append("cc.B(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        int var1 = 38 / ((param0 - 13) / 57);
        field_a = null;
    }

    static {
        field_b = "World:<col=ffff00>1</col> Stage:<col=ffff00>1";
    }
}
