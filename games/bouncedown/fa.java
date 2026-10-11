/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa {
    static int field_b;
    static int field_c;
    static boolean field_a;

    final synchronized static long a(int param0) {
        int var3 = 0;
        long var1 = System.currentTimeMillis();
        int var3Lifetime1;
        if (var1 >= jl.field_g) {
          var3 = 26 % ((26 - param0) / 45);
          jl.field_g = var1;
          return var1 + tb.field_n;
        }
        tb.field_n = tb.field_n + (-var1 + jl.field_g);
        var3Lifetime1 = 26 % ((26 - param0) / 45);
        jl.field_g = var1;
        return var1 + tb.field_n;
    }

    final static Boolean b(int param0) {
        Boolean var1 = null;
        Boolean var1Lifetime1;
        if (param0 != 1) {
          fa.a(-89);
          var1 = lk.field_p;
          lk.field_p = null;
          return var1;
        }
        var1Lifetime1 = lk.field_p;
        lk.field_p = null;
        return var1Lifetime1;
    }

    final static gk a(byte param0, int param1) {
        if (param0 == -76) {
          return j.a(false, (byte) -95, false, param1, true, 1);
        }
        field_b = 107;
        return j.a(false, (byte) -95, false, param1, true, 1);
    }

    static {
        field_c = 0;
    }
}
