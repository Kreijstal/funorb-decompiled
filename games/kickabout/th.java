/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class th {
    static int[] field_c;
    static String field_b;
    static boolean field_d;
    static boolean[] field_a;

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
        if (param0) {
            field_d = false;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static int b(byte param0) {
        if (param0 <= 48) {
            return 114;
        }
        return new Date().getYear() - -1900;
    }

    final static void a(int param0, int param1, byte[] param2, int[] param3, int param4) {
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        byte dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            var5_int = param0;
            L1: while (true) {
              if (qe.field_b.length <= var5_int) {
                break L0;
              } else {
                param4 = qe.field_b[var5_int];
                var6 = var5_int << -763129436;
                L2: while (true) {
                  incrementValue$5 = param4;
                  param4--;
                  if (0 == incrementValue$5) {
                    var5_int++;
                    continue L1;
                  } else {
                    incrementValue$6 = var6;
                    var6++;
                    param1 = nb.field_e[incrementValue$6];
                    dupTemp$7 = param2[param1];
                    dupTemp$8 = param3[dupTemp$7];
                    param3[dupTemp$7] = dupTemp$8 + 1;
                    nb.field_e[dupTemp$8] = param1;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("th.C(").append(param0).append(',').append(param1).append(',');

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
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0) {
        gn var1 = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var3 = Kickabout.field_G;
        try {
          L0: {
            var2 = -16 % ((param0 - 22) / 35);
            var1 = pn.field_z.g(24009);
            L1: while (true) {
              if (!(var1 instanceof wh)) {
                break L0;
              } else {
                ((wh) ((Object) var1)).b(112);
                var1 = var1.field_d;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1_ref), "th.B(" + param0 + ')');
        }
    }

    static {
        int var0 = 0;
        field_c = new int[]{498, 408, 448, 598};
        field_d = false;
        field_a = new boolean[73];
        field_b = "Loading beach";
        for (var0 = 0; field_a.length > var0; var0++) {
            field_a[var0] = false;
        }
        field_a[16] = true;
        field_a[25] = true;
        field_a[43] = true;
        field_a[31] = true;
        field_a[70] = true;
        field_a[12] = true;
    }
}
