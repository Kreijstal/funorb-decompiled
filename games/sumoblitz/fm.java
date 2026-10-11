/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm implements mh {
    static String field_a;
    static qr field_b;

    public static void a(byte param0) {
        if (param0 >= -100) {
          fm.a((byte) -19);
        }
        field_a = null;
        field_b = null;
    }

    public final void a(pk param0, int param1, int param2, boolean param3, int param4) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
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
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param2 != 5592405) {
            fm.a((byte) 119);
          }
          for (var6_int = 0; param0.field_p >= var6_int; var6_int++) {
            var7 = 152 + 48 * var6_int / param0.field_p;
            var8 = var7 << 16 | var7 << 8 | var7;
            lk.f(param4 + param0.field_r, var6_int + param0.field_v + param1, param0.field_q, var8);
          }
          for (var6_intLifetime1 = 1; var6_intLifetime1 <= 5; var6_intLifetime1++) {
            var7Lifetime1 = -(param0.field_q >> 1) + (param0.field_q + (param4 + param0.field_r) + (-5 + var6_intLifetime1));
            var8Lifetime1 = -(2 * var6_intLifetime1) + (param0.field_q >> 1);
            var9 = (-4 + param0.field_p >> 1) + (param1 + param0.field_v + var6_intLifetime1);
            if (var9 >= lk.field_i &&
              lk.field_e > var9) {
              if (lk.field_k < var7Lifetime1) {
                lk.field_a[var9 * lk.field_b - (-var7Lifetime1 + 1)] = eb.a(16711422, lk.field_a[var7Lifetime1 + (var9 * lk.field_b - 1)]) >> 1;
              }
              if (var7Lifetime1 + var8Lifetime1 < lk.field_j) {
                lk.field_a[var8Lifetime1 + (var9 * lk.field_b + var7Lifetime1)] = eb.a(8355711, lk.field_a[var9 * lk.field_b + var7Lifetime1 + var8Lifetime1] >> 1);
              }
            }
            lk.f(var7Lifetime1, var9, var8Lifetime1, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_20_0 = var6;
          stackIn_20_1 = new StringBuilder().append("fm.A(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_a = "Age:";
        field_b = new qr();
    }
}
