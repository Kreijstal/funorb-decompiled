/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static String field_a;
    static String field_c;
    static String field_d;
    static oj field_b;

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -97) {
            field_d = (String) null;
          }
          stackIn_3_0 = si.a(-26629, 10, param1, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("td.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_c = null;
        if (param0 != 6) {
          tf[] var2 = (tf[]) null;
          td.a(72, -37, -11, (tf[]) null, (byte) -29, -65);
        }
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, tf[] param3, byte param4, int param5) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          if (param3 != null &&
            0 < param2) {
            var6_int = param3[0].field_A;
            var7 = param3[2].field_A;
            var8 = param3[1].field_A;
            param3[0].d(param0, param1, param5);
            param3[2].d(param2 + param0 - var7, param1, param5);
            if (param4 != 121) {
              return;
            }
            t.a(wg.field_c);
            t.d(var6_int + param0, param1, -var7 + param2 + param0, param1 + param3[1].field_B);
            var9 = param0 + var6_int;
            var10 = -var7 + (param0 + param2);
            for (param0 = var9; var10 > param0; param0 = param0 + var8) {
              param3[1].d(param0, param1, param5);
            }
            t.b(wg.field_c);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("td.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0, hh[] param1) {
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var7 = 0;
        tf[] var8 = null;
        int var2_intLifetime1;
        int var3Lifetime1;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          lk.field_o = new hh[param1.length];
          for (var2_int = 0; lk.field_o.length > var2_int; var2_int++) {
            var3 = gd.field_e[var2_int].field_m;
            var4 = gd.field_e[var2_int].field_k;
            lk.field_o[var2_int] = new hh(var3, var4, 2);
            for (var5 = 0; var5 < var4; var5++) {
              for (var6 = 0; var3 > var6; var6++) {
                lk.field_o[var2_int].field_n[var6 + var5 * var3] = param1[var2_int].field_n[var6 + var5 * 5];
              }
            }
          }
          li.field_d = new tf(48, 48);
          li.field_d.c();
          if (param0 < 117) {
            var8 = (tf[]) null;
            td.a(-3, 104, 72, (tf[]) null, (byte) -122, -90);
          }
          for (var2_intLifetime1 = 0; 8 > var2_intLifetime1; var2_intLifetime1++) {
            var3Lifetime1 = (var2_intLifetime1 << 8) / 8;
            t.d(var2_intLifetime1, var2_intLifetime1, 32 + (-var2_intLifetime1 + 8) * 2, -(2 * var2_intLifetime1) + 16 + 32, 6, var3Lifetime1 * 65793);
          }
          t.d(8, 8, 32, 32, 6, 16777215);
          t.c(2, 2, 0, 0, t.field_j, t.field_d);
          qa.field_f.a(19692);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("td.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    static {
        field_a = "Log in / Create account";
        field_c = "It's a draw!";
    }
}
