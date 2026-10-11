/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    static int field_b;
    static kv field_c;
    static v field_a;

    final synchronized static long b(byte param0) {
        long var1 = 0L;
        long var1Lifetime1;
        if (param0 == 73) {
          var1 = System.currentTimeMillis();
          if (!(var1 >= fw.field_l)) {
            oia.field_f = oia.field_f + (fw.field_l - var1);
          }
          fw.field_l = var1;
          return var1 + oia.field_f;
        }
        f.b((byte) 126);
        var1Lifetime1 = System.currentTimeMillis();
        if (!(var1Lifetime1 >= fw.field_l)) {
          oia.field_f = oia.field_f + (fw.field_l - var1Lifetime1);
        }
        fw.field_l = var1Lifetime1;
        return var1Lifetime1 + oia.field_f;
    }

    final static void a(byte param0) {
        if (param0 < 88) {
          return;
        }
        ep.a(4, 8192);
    }

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
          f.b((byte) -90);
          field_c = null;
          return;
        }
        field_c = null;
    }

    static {
        field_b = -1;
    }
}
