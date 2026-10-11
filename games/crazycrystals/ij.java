/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ij extends jb {
    long field_k;
    ij field_g;
    ij field_j;
    private static long[] field_f;
    static boolean field_i;
    static boolean field_h;

    final static long a(boolean param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        long stackIn_6_0 = 0L;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = CrazyCrystals.field_B;
        try {
          var2_int = param1.length();
          var3 = 0L;
          var5 = 0;
          if (!param0) {
            field_h = false;
          }
          while (var2_int > var5) {
            var3 = (long)dg.a(param1.charAt(var5), 17176) - var3 + (var3 << 5);
            var5++;
          }
          stackIn_6_0 = var3;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("ij.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, f[][] param3) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var4_intLifetime1;
        int var4_intLifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        var6 = CrazyCrystals.field_B;
        try {
          for (var4_int = -2 - param2 + param3.length; 1 + param2 <= var4_int; var4_int--) {
            for (var5 = 1 + param0; -1 - param0 + param3[0].length > var5; var5++) {
              param3[var4_int][var5] = param3[var4_int][var5].a(110, var4_int, param3, var5);
            }
          }
          for (var4_intLifetime1 = param3.length - param2 + param1; var4_intLifetime1 >= 1 + param2; var4_intLifetime1--) {
            for (var5Lifetime1 = param0 + 1; var5Lifetime1 < param3[0].length - param0 - 1; var5Lifetime1++) {
              param3[var4_intLifetime1][var5Lifetime1].a(param3, var5Lifetime1, var4_intLifetime1, -100);
            }
          }
          for (var4_intLifetime2 = param2 + 1; var4_intLifetime2 < -1 - param2 + param3.length; var4_intLifetime2++) {
            for (var5Lifetime2 = 1 + param0; param3[0].length - param0 - 1 > var5Lifetime2; var5Lifetime2++) {
              param3[var4_intLifetime2][var5Lifetime2] = param3[var4_intLifetime2][var5Lifetime2].a(var4_intLifetime2, param3, false, var5Lifetime2).c(-1);
            }
          }
          ja.a(param2, param3, param0, true, 1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("ij.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    public static void d(int param0) {
        if (param0 != 1) {
          ij.d(31);
        }
        field_f = null;
    }

    final void a(int param0) {
        if (null == this.field_g) {
          return;
        }
        this.field_g.field_j = this.field_j;
        this.field_j.field_g = this.field_g;
        if (param0 != 1) {
          this.a(37);
        }
        this.field_j = null;
        this.field_g = null;
    }

    protected ij() {
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_f = new long[256];
        for (var2 = 0; var2 < 256; var2++) {
          var0 = (long)var2;
          for (var3 = 0; var3 < 8; var3++) {
            if ((var0 & 1L) != 1L) {
              var0 = var0 >>> 1;
            } else {
              var0 = var0 >>> 1 ^ -3932672073523589310L;
            }
          }
          field_f[var2] = var0;
        }
        field_h = false;
    }
}
