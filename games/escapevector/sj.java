/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj extends hg {
    static om field_l;
    String field_g;
    static String field_j;
    static int field_h;
    static String field_k;
    static int field_i;

    final static void a(int param0, byte param1) {
        if (!(mb.field_a == null)) {
            mb.field_a.g(2048);
        }
        mb.field_a = hl.c(uf.field_g, 100, qm.field_c * 6144 / 64, param0);
        rk.field_e.a((wg) (Object) mb.field_a);
    }

    public static void a() {
        field_j = null;
        field_k = null;
        field_l = null;
    }

    sj(String param0) {
        try {
            ((sj) this).field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "sj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new om(8, 0, 4, 1);
        field_j = "Discard";
        field_k = "Target locations";
    }
}
