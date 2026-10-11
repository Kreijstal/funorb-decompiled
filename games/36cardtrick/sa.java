/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa {
    static int field_a;
    static int field_d;
    static int field_c;
    static int field_b;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        jc.field_O.a(param7, param5, param0, param6, param3, param1, param2);
        if (param4 != 0) {
          field_c = 35;
        }
    }

    final static void a(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var5 = Main.field_T;
        try {
          var2 = -116 / ((39 - param0) / 61);
          var6 = mb.field_c;
          var1 = var6;
          var3 = 0;
          var4 = var6.length;
          while (var4 > var3) {
            var6[var3++] = 0;
            var6[var3++] = 0;
            var6[var3++] = 0;
            var6[var3++] = 0;
            var6[var3++] = 0;
            var6[var3++] = 0;
            var6[var3++] = 0;
            var6[var3++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1_ref), "sa.B(" + param0 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Main.field_T;
        try {
          var3_int = 1;
          while (1 < param2) {
            if ((1 & param2) != 0) {
              var3_int = var3_int * param1;
            }
            param2 = param2 >> 1;
            param1 = param1 * param1;
          }
          if (param2 == 1) {
            stackIn_11_0 = var3_int * param1;
            return stackIn_11_0;
          }
          if (param0 != 22316) {
            sa.a(-72);
          }
          stackIn_15_0 = var3_int;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3), "sa.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_b = 0;
        field_c = 0;
    }
}
