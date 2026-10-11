/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cf {
    static ka field_c;
    static Calendar field_e;
    static int field_f;
    static rk field_d;
    static int field_a;
    static int field_b;

    final boolean b(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 != 668905488) {
          field_f = 71;
        }
        stackIn_8_0 = (this == cd.field_s) || (this == le.field_a) || (qc.field_d == this);
        return stackIn_8_0;
    }

    final static void a(int param0, String param1) {
        System.out.println("Error: " + kl.a(param1, "\n", 0, "%0a"));
        if (param0 != 1) {
          int[] var3 = (int[]) null;
          cf.a(41, (int[]) null, (int[]) null, -115, false);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_e = null;
        int var1 = -94 / ((-6 - param0) / 49);
        field_d = null;
        field_c = null;
    }

    final static void a(int param0, int[] param1, int[] param2, int param3, boolean param4) {
        int var10 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var5_intLifetime1;
        var11 = TorChallenge.field_F ? 1 : 0;
        try {
          if (0 >= param3) {
            return;
          }
          if (param0 <= 0) {
            return;
          }
          if (param3 > param0) {
            return;
          }
          param1[0] = param2[0];
          param1[-1 + param3] = param2[-1 + param0];
          if (param4) {
            field_a = 68;
          }
          var5_int = 0;
          var6 = 0;
          var7 = 0;
          var8 = 1;
          var9 = 1;
          for (var10 = 1; var10 < param0; var10++) {
            var5_intLifetime1 = fj.a(1870096848, var10 * param3 << 16, lj.field_j[param0]) >> 16;
            if (var6 < var5_intLifetime1) {
              if (var6 > 0 &&
                var6 < param3) {
                param1[var6] = fj.a(1870096848, var7 << 16, lj.field_j[var10 - var9]) >> 16;
              }
              var7 = 0;
              var6 = var5_intLifetime1;
              var8 = 1;
            }
            if (var5_intLifetime1 == var6) {
              var7 = var7 + param2[var10];
              if (var8 != 0) {
                var9 = var10;
                var8 = 0;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("cf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_e = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_a = 50;
        field_b = -1;
    }
}
