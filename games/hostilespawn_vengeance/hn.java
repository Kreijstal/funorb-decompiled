/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hn {
    static String field_c;
    static String field_d;
    static bd field_e;
    static int field_a;
    static int field_b;

    final synchronized static long a(byte param0) {
        long var1 = 0L;
        var1 = System.currentTimeMillis();
        if ((gb.field_e ^ -1L) >= (var1 ^ -1L)) {
          gb.field_e = var1;
          if (param0 != 80) {
            return 95L;
          } else {
            return var1 + td.field_c;
          }
        } else {
          td.field_c = td.field_c + (-var1 + gb.field_e);
          gb.field_e = var1;
          if (param0 != 80) {
            return 95L;
          } else {
            return var1 + td.field_c;
          }
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_d = null;
        field_e = null;
        if (param0) {
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Waiting for sound effects";
        field_d = "Resume Game";
        field_b = -1;
    }
}
