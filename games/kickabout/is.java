/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class is {
    static boolean field_a;
    static int field_g;
    static int field_d;
    static hd field_b;
    static Random field_e;
    static boolean field_c;
    static String field_f;

    final static void a(hu param0, String param1, qj param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Kickabout.field_G;
        try {
          var5_int = 0;
          if (param4 != -1942293368) {
            return;
          }
          var6 = -1;
          for (var7 = 1; var7 < param1.length(); var7++) {
            var8 = param1.charAt(var7);
            if (var8 == 60) {
              var6 = (var5_int >> 8) + param2.field_b[0] + param0.a(param1.substring(0, var7));
            }
            if (var6 != -1) {
              param2.field_b[var7] = var6;
            } else {
              if (var8 == 32) {
                var5_int = var5_int + param3;
              }
              param2.field_b[var7] = param2.field_b[0] + (var5_int >> 8) + param0.a(param1.substring(0, var7 + 1)) - param0.a((char) var8);
            }
            if (var8 == 62) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("is.B(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(byte param0, vc param1) {
        try {
          int var2_int = 119 % ((-72 - param0) / 44);
          np.field_Jb.a(new hk(param1, 32), 3);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "is.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Kickabout.field_G;
        try {
          for (var1_int = 0; var1_int < e.field_n.length; var1_int++) {
            e.field_n[var1_int].a(param0 - 7232);
          }
          if (param0 != 7249) {
            field_e = (Random) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "is.A(" + param0 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 <= 110) {
          field_g = 118;
        }
        field_b = null;
        field_f = null;
        field_e = null;
    }

    static {
        field_a = false;
        field_g = 0;
        field_c = false;
        field_f = "Back";
        field_e = new Random();
    }
}
