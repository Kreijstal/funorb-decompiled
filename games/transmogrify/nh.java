/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    int field_d;
    byte[] field_c;
    int field_a;
    int field_k;
    static String field_l;
    static int[] field_j;
    int field_e;
    int field_i;
    int field_f;
    static String field_h;
    int field_b;
    static String field_m;
    byte[] field_g;

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          var3_int = 1;
          if (param2 != 26186) {
            field_j = (int[]) null;
          }
          while (param1 > 1) {
            if ((1 & param1) != 0) {
              var3_int = var3_int * param0;
            }
            param0 = param0 * param0;
            param1 = param1 >> 1;
          }
          if (param1 != 1) {
            stackIn_11_0 = var3_int;
            return stackIn_11_0;
          }
          stackIn_9_0 = param0 * var3_int;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var3), "nh.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(ti param0, byte param1) {
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var8 = 0;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param1 < 31) {
            return;
          }
          if (((param0.field_m | param0.field_n) & 3) != 0) {
            var2_int = 4 - (param0.field_n & 3);
            var3 = -(3 & param0.field_m) + 4;
            var4 = param0.field_n + var2_int;
            var5 = new int[(param0.field_n + var2_int) * (param0.field_m + var3)];
            for (var6 = 0; var6 < param0.field_m; var6++) {
              for (var7 = 0; var7 < param0.field_n; var7++) {
                var5[(var6 + var3) * var4 + var2_int + var7] = param0.field_w[var7 + var6 * param0.field_n];
              }
            }
            param0.field_u = param0.field_u - var2_int;
            param0.field_n = param0.field_n + var2_int;
            param0.field_l = param0.field_l - var3;
            param0.field_w = var5;
            param0.field_m = param0.field_m + var3;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("nh.E(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final static gd a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        gd var8 = new gd(param4, param2, param3, param1, param0, param5);
        int var9 = -40 % ((param7 - 6) / 59);
        rh.field_r.a(var8, -107);
        ne.a((byte) 7, var8, param6);
        return var8;
    }

    public static void a(int param0) {
        field_l = null;
        field_j = null;
        field_h = null;
        field_m = null;
        int var1 = 43 % ((47 - param0) / 61);
    }

    final static rj b(int param0) {
        try {
          Throwable var1 = null;
          ti var2 = null;
          rj stackIn_3_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param0 != 1) {
              var2 = (ti) null;
              nh.a((ti) null, (byte) 65);
            }
            stackIn_3_0 = (rj) (Class.forName("sk").newInstance());
            return stackIn_3_0;
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = decompiledCaughtException;
            return null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_j = new int[8192];
        field_l = "Discard";
        field_h = "Cancel";
        field_m = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
