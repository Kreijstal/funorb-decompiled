/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id {
    static String field_a;
    static lc[] field_b;
    static dm[] field_c;

    public static void b(boolean param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        if (!param0) {
            field_a = (String) null;
        }
    }

    final static void a(boolean param0) {
        tl var1 = (tl) ((Object) n.field_l.e(1));
        if (!(var1 != null)) {
            throw new IllegalStateException();
        }
        vb.a(var1.field_q, var1.field_j, var1.field_k);
        vb.e(var1.field_n, var1.field_p, var1.field_i, var1.field_m);
        var1.field_q = null;
        if (!param0) {
            return;
        }
        sg.field_b.a(-110, var1);
    }

    static {
        int var0 = 0;
        field_a = "Resume Game";
        field_b = new lc[255];
        for (var0 = 0; var0 < field_b.length; var0++) {
            field_b[var0] = new lc();
        }
    }
}
