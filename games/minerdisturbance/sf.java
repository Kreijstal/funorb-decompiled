/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf {
    static int[] field_a;

    public static void a(int param0) {
        if (param0 != 8192) {
            sf.a((byte) 91);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final synchronized static long a(byte param0) {
        long var1;
        int var3;
        var3 = -9 / ((47 - param0) / 49);
        var1 = System.currentTimeMillis();
        if (em.field_A > var1) {
          fc.field_u = fc.field_u + (-var1 + em.field_A);
          em.field_A = var1;
          return var1 - -fc.field_u;
        } else {
          em.field_A = var1;
          return var1 - -fc.field_u;
        }
    }

    static {
        field_a = new int[8192];
    }
}
