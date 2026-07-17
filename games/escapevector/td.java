/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static hh field_c;
    static String field_a;
    static int[] field_b;

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, int param1) {
        if (!(null == bk.field_r)) {
            bk.field_r.b(param1 ^ -129, param0);
        }
        if (param1 != 128) {
            td.a(112, 55);
            return;
        }
    }

    final synchronized static long b(int param0) {
        long var1 = 0L;
        var1 = System.currentTimeMillis();
        if (param0 == 128) {
          if (cd.field_t > var1) {
            al.field_e = al.field_e + (cd.field_t - var1);
            cd.field_t = var1;
            return var1 + al.field_e;
          } else {
            cd.field_t = var1;
            return var1 + al.field_e;
          }
        } else {
          return 9L;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Click";
        field_b = new int[128];
    }
}
