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
        return new Date().getYear() + 1900;
    }

    final static void a(int param0, int param1, byte[] param2, int[] param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Kickabout.field_G;
        try {
          var5_int = param0;
          while (true) {
            if (qe.field_b.length <= var5_int) {
              return;
            }
            param4 = qe.field_b[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param4;
              param4--;
              if (0 == incrementValue$0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var6;
              var6++;
              param1 = nb.field_e[incrementValue$1];
              dupTemp$2 = param2[param1];
              dupTemp$3 = param3[dupTemp$2];
              param3[dupTemp$2] = dupTemp$3 + 1;
              nb.field_e[dupTemp$3] = param1;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("th.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(')').toString());
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
          var2 = -16 % ((param0 - 22) / 35);
          var1 = pn.field_z.g(24009);
          while (var1 instanceof wh) {
            ((wh) (var1)).b(112);
            var1 = var1.field_d;
          }
          return;
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
