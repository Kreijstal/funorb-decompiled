/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb implements io {
    static vn field_b;
    static int field_a;
    static vo field_d;
    static int field_c;

    public final void a(int param0, boolean param1, int param2, ga param3, int param4) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
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
        var10 = ZombieDawn.field_J;
        try {
          for (var6_int = 0; param3.field_n >= var6_int; var6_int++) {
            var7 = 152 + 48 * var6_int / param3.field_n;
            var8 = var7 | (var7 << 16 | var7 << 8);
            bi.b(param3.field_k + param4, var6_int + param2 + param3.field_j, param3.field_i, var8);
          }
          var6_intLifetime1 = 1;
          if (param0 != 16777215) {
            field_a = -128;
          }
          while (var6_intLifetime1 <= 5) {
            var7Lifetime1 = -5 + (param4 + param3.field_k + param3.field_i) + (-(param3.field_i >> 1) + var6_intLifetime1);
            var8Lifetime1 = -(var6_intLifetime1 * 2) + (param3.field_i >> 1);
            var9 = var6_intLifetime1 + ((param3.field_n - 4 >> 1) + param3.field_j) + param2;
            if (bi.field_l <= var9 &&
              bi.field_d > var9) {
              if (bi.field_g < var7Lifetime1) {
                bi.field_c[var9 * bi.field_f + var7Lifetime1 - 1] = eg.a(bi.field_c[-1 + (var9 * bi.field_f + var7Lifetime1)], 16711422) >> 1;
              }
              if (var8Lifetime1 + var7Lifetime1 < bi.field_b) {
                bi.field_c[bi.field_f * var9 - (-var7Lifetime1 - var8Lifetime1)] = eg.a(bi.field_c[var8Lifetime1 + (bi.field_f * var9 + var7Lifetime1)] >> 1, 8355711);
              }
            }
            bi.b(var7Lifetime1, var9, var8Lifetime1, 0);
            var6_intLifetime1++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("eb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        if (param0) {
          int[] var2 = (int[]) null;
          eb.a((int[]) null, 39, 33, 88, 74);
        }
        field_b = null;
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = ZombieDawn.field_J;
        try {
          while (true) {
            param2--;
            if (param2 < 0) {
              if (param1 != 1393669633) {
                field_c = -108;
              }
              return;
            }
            var9 = param0;
            var5 = var9;
            var6 = param3;
            var7 = param4;
            var9[var6] = var7 + eg.a(var9[var6] >> 1, 8355711);
            param3++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("eb.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
    }
}
