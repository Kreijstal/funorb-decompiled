/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    static byte[][] field_d;
    static ff field_a;
    static int field_g;
    static kb field_e;
    static int[] field_b;
    static String field_f;
    static boolean[] field_c;

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          if (param0 != 64) {
            stackIn_3_0 = -27;
            return stackIn_3_0;
          }
          var3_int = 1;
          while (param2 > 1) {
            if (0 != (1 & param2)) {
              var3_int = var3_int * param1;
            }
            param2 = param2 >> 1;
            param1 = param1 * param1;
          }
          if (1 != param2) {
            stackIn_15_0 = var3_int;
            return stackIn_15_0;
          }
          stackIn_13_0 = param1 * var3_int;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var3), "ef.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 == 11051) {
          field_a = null;
          field_c = null;
          field_d = (byte[][]) null;
          field_f = null;
          field_e = null;
          field_b = null;
          return;
        }
        field_e = (kb) null;
        field_a = null;
        field_c = null;
        field_d = (byte[][]) null;
        field_f = null;
        field_e = null;
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          var3_int = 0;
          if (param2 != 69) {
            stackIn_3_0 = 7;
            return stackIn_3_0;
          }
          while (param1 > 0) {
            var3_int = 1 & param0 | var3_int << 1;
            param1--;
            param0 = param0 >>> 1;
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var3), "ef.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, o param1) {
        int var7 = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        var9 = SolKnight.field_L ? 1 : 0;
        try {
          if (0 == (3 & (param1.field_n | (param1.field_s | (param1.field_t | param1.field_p))))) {
            return;
          }
          var2_int = param1.field_p + (3 & param1.field_s);
          var3 = param1.field_t + (3 & param1.field_n);
          var2_int = var2_int + 4 - (var2_int & 3);
          var3 = 4 - ((var3 & 3) - var3);
          if (param0 < 113) {
            field_d = (byte[][]) null;
          }
          var4 = new int[var3 * var2_int];
          var5 = 0;
          var6 = var2_int * (param1.field_n & 3) + (3 & param1.field_s);
          for (var7 = 0; param1.field_t > var7; var7++) {
            for (var8 = 0; param1.field_p > var8; var8++) {
              incrementValue$0 = var6;
              var6++;
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$0] = param1.field_v[incrementValue$1];
            }
            var6 = var6 + (-param1.field_p + var2_int);
          }
          param1.field_p = var2_int;
          param1.field_s = param1.field_s & -4;
          param1.field_n = param1.field_n & -4;
          param1.field_t = var3;
          param1.field_v = var4;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("ef.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_d = new byte[50][];
        field_a = new ff(14, 0, 4, 1);
        field_b = new int[256];
        field_c = new boolean[64];
        field_f = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
