/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oa {
    static ao field_a;
    static String field_b;

    final static fq a(ga param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        fq stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param0.d((byte) 69);
          if (param1 != 14) {
            field_a = (ao) null;
          }
          var3 = param0.g(31365);
          var4 = param0.d((byte) 69);
          stackIn_3_0 = new fq(var2_int, var3, var4);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("oa.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int b(byte param0) {
        if (param0 <= -11) {
          return new Date().getYear() + 1900;
        }
        field_a = (ao) null;
        return new Date().getYear() + 1900;
    }

    final static void a(int param0) {
        ki.a(26);
        hh.b(param0);
    }

    final static boolean a(int param0, int[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0 != -9) {
            oa.a(-15);
          }
          var2_int = 0;
          while (true) {
            if (var2_int >= 8) {
              return false;
            }
            if (param1[var2_int] == 0) {
              var2_int++;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("oa.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static int a(byte param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (he.field_a) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          var1_int = 0;
          if (param0 <= 4) {
            var6 = (int[]) null;
            oa.a(114, (int[]) null);
          }
          for (var2 = 0; op.field_m.field_z.length > var2; var2++) {
            var3 = op.field_m.field_z[var2];
            if (var3 > 0) {
              var4 = -var3 + op.field_m.a((byte) 32, var2, 750);
              if (var4 > 50) {
                var4 = var3;
              }
              stackIn_15_0 = var1_int;
              if (fb.field_e.field_M != var2) {
                stackIn_16_1 = var4 / 20;
              } else {
                stackIn_16_1 = var4 / 40;
              }
              var1_int = stackIn_15_0 + stackIn_16_1;
            }
          }
          stackIn_20_0 = var1_int;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "oa.A(" + param0 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 != 3732) {
          return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_a = new ao(14, 0, 4, 1);
        field_b = "<%0> has been removed.";
    }
}
