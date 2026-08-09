/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cla {
    static byte[] field_a;

    final static void a(byte param0, eaa param1, int param2, Random param3) {
        lh var4 = null;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 == 11) {
                break L1;
              } else {
                field_a = (byte[]) null;
                break L1;
              }
            }
            var4 = (lh) ((Object) param1.b((byte) 90));
            L2: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                L3: {
                  if (var4.b(true)) {
                    var4.field_k = (int)((double)(kla.a(64, param3, -2147483648) + 176) * -Math.abs(100.0 * Math.sin((double)(108 - param2) / 300.0)));
                    var4.field_p = -(int)((double)(128 + kla.a(10000, param3, -2147483648)) * Math.sin(var4.field_r));
                    var4.field_g = -(int)((double)(128 + kla.a(10000, param3, -2147483648)) * Math.cos(var4.field_r));
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var4 = (lh) ((Object) param1.c(param0 ^ 11));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4_ref);

            stackIn_12_1 = new StringBuilder().append("cla.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = 34 / ((param0 - 24) / 48);
    }

    static {
    }
}
