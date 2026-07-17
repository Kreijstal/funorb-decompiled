/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nb extends le {
    long field_n;
    nb field_i;
    static cg field_l;
    static volatile int field_j;
    nb field_h;
    static String field_o;
    static vn[] field_k;
    static int field_m;

    final void c(byte param0) {
        if (!(null != ((nb) this).field_h)) {
            return;
        }
        ((nb) this).field_h.field_i = ((nb) this).field_i;
        ((nb) this).field_i.field_h = ((nb) this).field_h;
        ((nb) this).field_i = null;
        ((nb) this).field_h = null;
        if (param0 >= -6) {
            ((nb) this).field_i = null;
        }
    }

    public static void a(int param0) {
        field_o = null;
        field_k = null;
        field_l = null;
    }

    final static boolean c(int param0) {
        return vh.field_c == tk.field_a;
    }

    protected nb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
        field_o = "Waiting for graphics";
        field_l = new cg(12, 0, 1, 0);
    }
}
