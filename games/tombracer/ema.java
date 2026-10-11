/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ema implements isa {
    static String field_a;
    static int field_b;

    public final void a(ae param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var6_intLifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          for (var6_int = 0; param0.field_p >= var6_int; var6_int++) {
            var7 = 152 + var6_int * 48 / param0.field_p;
            var8 = var7 | (var7 << 16 | var7 << 8);
            bea.c(param0.field_i + param1, param0.field_n + (param3 + var6_int), param0.field_m, var8);
          }
          if (param2 != 16777215) {
            ema.a(false, 4, -88, -72, -24);
          }
          for (var6_intLifetime1 = 1; var6_intLifetime1 <= 5; var6_intLifetime1++) {
            var7Lifetime1 = param0.field_m + param0.field_i + (param1 - (param0.field_m >> 1) - 5) + var6_intLifetime1;
            var8Lifetime1 = (param0.field_m >> 1) - var6_intLifetime1 * 2;
            var9 = (param0.field_p - 4 >> 1) + (param0.field_n + (param3 + var6_intLifetime1));
            if (bea.field_h <= var9 &&
              bea.field_k > var9) {
              if (var7Lifetime1 > bea.field_b) {
                bea.field_l[var9 * bea.field_g - (-var7Lifetime1 + 1)] = sea.c(16711422, bea.field_l[var7Lifetime1 + (bea.field_g * var9 - 1)]) >> 1;
              }
              if (var7Lifetime1 + var8Lifetime1 < bea.field_d) {
                bea.field_l[var7Lifetime1 + var9 * bea.field_g + var8Lifetime1] = sea.c(8355711, bea.field_l[var8Lifetime1 + bea.field_g * var9 + var7Lifetime1] >> 1);
              }
            }
            bea.c(var7Lifetime1, var9, var8Lifetime1, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_19_0 = var6;
          stackIn_19_1 = new StringBuilder().append("ema.B(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static boolean a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6;
        int var7;
        jpa var8;
        jpa var9;
        int stackIn_17_0 = 0;
        int var6Lifetime1;
        var8 = lm.field_p[param3];
        var9 = var8;
        var6 = 0;
        if (param0) {
          var9.b();
        }
        if (param2 >= param1 &&
          0 <= param4 &&
          param2 < var9.field_i &&
          param4 < var9.field_a) {
          var6Lifetime1 = var9.field_f[param2 + param4 * var8.field_i];
          if (var6Lifetime1 >= 0) {
            stackIn_17_0 = (0 < var8.field_g[var6Lifetime1]) ? 1 : 0;
          } else {
            stackIn_17_0 = 0;
          }
          var7 = stackIn_17_0;
          if (param0) {
            var9.b();
          }
          return var7 != 0;
        }
        if (!param0) {
          return false;
        }
        var9.b();
        return false;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 48) {
          ema.a(false, 111, 21, -70, 126);
        }
    }

    static {
        field_a = "Your email address is used to identify this account";
    }
}
