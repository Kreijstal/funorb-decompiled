/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk {
    long field_f;
    static ri[] field_b;
    ha field_g;
    static int[] field_e;
    nj field_d;
    private cj field_a;
    java.awt.Canvas field_c;

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        if (param0 != 4) {
            bk.a(-95);
        }
    }

    final cj b(int param0) {
        if (!(null != ((bk) this).field_a)) {
            ((bk) this).field_a = new cj();
        }
        int var2 = 105 % ((param0 - 3) / 46);
        ((bk) this).field_a.a(-108, (bk) this);
        return ((bk) this).field_a;
    }

    bk(ha param0, nj param1, java.awt.Canvas param2) {
        try {
            ((bk) this).field_c = param2;
            ((bk) this).field_g = param0;
            ((bk) this).field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "bk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[4];
    }
}
