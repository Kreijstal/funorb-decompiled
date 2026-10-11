/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn extends ji {
    static pm field_y;
    static int field_z;
    static String field_B;
    static String field_A;

    final static ch a(int param0, boolean param1, String param2) {
        ch var3 = null;
        RuntimeException var3_ref = null;
        ch stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new ch(false);
          var3.field_j = param2;
          if (!param1) {
            fn.g(-82);
          }
          var3.field_h = param0;
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("fn.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, boolean param2, int param3, int param4, boolean param5, int param6, boolean param7, boolean param8, int param9, int param10, boolean param11) {
        ok.a(param6, param10, param1, param5, param11, param7, 16777215, 12423, param2, param3, param9, param8, param4, 16777215);
        if (param0 <= 84) {
          String var13 = (String) null;
          fn.a(113, true, (String) null);
          return;
        }
    }

    public static void g(int param0) {
        field_B = null;
        field_y = null;
        field_A = null;
        if (param0 == 4096) {
          return;
        }
        fn.g(36);
    }

    public fn() {
        super(0, true);
    }

    private final int d(int param0, int param1, int param2) {
        int var4 = 57 * param2 + param0;
        if (param1 == 2147483647) {
          var4 = var4 << 1 ^ var4;
          return -(((15731 * (var4 * var4) + 789221) * var4 + 1376312589 & 2147483647) / 262144) + 4096;
        }
        fn.a(42, 102, 48, -125, -26, (byte) 110, 39, -15);
        var4 = var4 << 1 ^ var4;
        return -(((15731 * (var4 * var4) + 789221) * var4 + 1376312589 & 2147483647) / 262144) + 4096;
    }

    final int[] c(int param0, int param1) {
        int var5 = 0;
        int[] var3;
        int var4;
        int var6;
        int[] var7;
        var6 = Vertigo2.field_L ? 1 : 0;
        if (param1 <= 91) {
          return (int[]) null;
        }
        var7 = this.field_x.a(param0, (byte) -108);
        var3 = var7;
        if (!this.field_x.field_i) {
          return var3;
        }
        var4 = lf.field_y[param0];
        for (var5 = 0; we.field_M > var5; var5++) {
          var7[var5] = this.d(rh.field_O[var5], 2147483647, var4) % 4096;
        }
        return var3;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7) {
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[] var18 = null;
        int var12Lifetime1;
        int var12Lifetime2;
        var14 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param5 != -11) {
            return;
          }
          var9 = param3 - param4;
          var8_int = param2 + param4;
          for (var12 = param2; var8_int > var12; var12++) {
            ki.a(-75, param1, vl.field_e[var12], param0, param7);
          }
          var11 = param0 - param4;
          var10 = param1 + param4;
          for (var12Lifetime1 = param3; var12Lifetime1 > var9; var12Lifetime1--) {
            ki.a(-83, param1, vl.field_e[var12Lifetime1], param0, param7);
          }
          for (var12Lifetime2 = var8_int; var9 >= var12Lifetime2; var12Lifetime2++) {
            var18 = vl.field_e[var12Lifetime2];
            ki.a(-87, param1, var18, var10, param7);
            ki.a(-90, var10, var18, var11, param6);
            ki.a(-83, var11, var18, param0, param7);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var8), "fn.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        field_B = "Resign";
        field_A = "<%0> has been removed.";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$946cf173619b(int param0, int param1, boolean param2, int param3, int param4, boolean param5, int param6, boolean param7, boolean param8, int param9, int param10, boolean param11) {
        ok.a(param6, param10, param1, param5, param11, param7, 16777215, 12423, param2, param3, param9, param8, param4, 16777215);
        if (param0 <= 84) {
          String var13 = (String) null;
          fn.a(113, true, (String) null);
          return;
        }
    }
}
