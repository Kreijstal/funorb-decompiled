/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    static int field_b;
    static kv field_c;
    static v field_a;

    final synchronized static long b(byte param0) {
        long var1 = 0L;
        if (param0 != 73) {
          L0: {
            var1 = System.currentTimeMillis();
            if (~var1 > ~fw.field_l) {
              oia.field_f = oia.field_f + (fw.field_l - var1);
              break L0;
            } else {
              break L0;
            }
          }
          fw.field_l = var1;
          return var1 - -oia.field_f;
        } else {
          L1: {
            var1 = System.currentTimeMillis();
            if (~var1 > ~fw.field_l) {
              oia.field_f = oia.field_f + (fw.field_l - var1);
              break L1;
            } else {
              break L1;
            }
          }
          fw.field_l = var1;
          return var1 - -oia.field_f;
        }
    }

    final static void a(byte param0) {
        ep.a(4, 8192);
    }

    public static void a(boolean param0) {
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
    }
}
