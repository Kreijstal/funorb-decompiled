/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa {
    static int field_b;
    static int field_c;
    static boolean field_a;

    final synchronized static long a(int param0) {
        long var1 = 0L;
        int var3 = 0;
        var1 = System.currentTimeMillis();
        if (var1 < jl.field_g) {
          tb.field_n = tb.field_n + (-var1 + jl.field_g);
          var3 = 26 % ((26 - param0) / 45);
          jl.field_g = var1;
          return var1 - -tb.field_n;
        } else {
          var3 = 26 % ((26 - param0) / 45);
          jl.field_g = var1;
          return var1 - -tb.field_n;
        }
    }

    final static Boolean b() {
        Boolean var1 = lk.field_p;
        lk.field_p = null;
        return var1;
    }

    final static gk a(byte param0, int param1) {
        int discarded$0 = 1;
        int discarded$1 = 1;
        return j.a(false, (byte) -95, false, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
    }
}
