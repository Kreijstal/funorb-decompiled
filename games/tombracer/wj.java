/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj {
    static jpa field_a;
    static String field_b;

    final static void a(cga param0, int param1, int param2) {
        int var4 = 0;
        kh var6 = null;
        kh var7 = null;
        if (param2 > -116) {
          wj.a((byte) 1);
          var6 = ql.field_k;
          var6.k(param1, -2988);
          var6.field_h = var6.field_h + 1;
          var4 = var6.field_h;
          var6.i(1, 0);
          var6.i(param0.field_j, 0);
          var6.i(param0.field_o, 0);
          var6.a(param0.field_k, (byte) -42);
          var6.a(param0.field_h, (byte) -20);
          var6.a(param0.field_m, (byte) -123);
          var6.a(param0.field_n, (byte) 92);
          int discarded$2 = var6.g(var4, 64);
          var6.d(var6.field_h - var4, (byte) 16);
          return;
        } else {
          var7 = ql.field_k;
          var7.k(param1, -2988);
          var7.field_h = var7.field_h + 1;
          var4 = var7.field_h;
          var7.i(1, 0);
          var7.i(param0.field_j, 0);
          var7.i(param0.field_o, 0);
          var7.a(param0.field_k, (byte) -42);
          var7.a(param0.field_h, (byte) -20);
          var7.a(param0.field_m, (byte) -123);
          var7.a(param0.field_n, (byte) 92);
          int discarded$3 = var7.g(var4, 64);
          var7.d(var7.field_h - var4, (byte) 16);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        String var7 = null;
        if (bta.field_q != param3) {
            var7 = lw.field_i;
        } else {
            var7 = jaa.field_a;
        }
        lba.a(param6, param5, param1, (byte) 53, param0, param2, var7, param4);
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 <= 35) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Treasure Values";
    }
}
