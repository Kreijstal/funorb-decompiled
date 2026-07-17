/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bga extends bw {
    static sga field_m;
    static String field_h;
    int field_i;
    static kv[] field_j;
    static String field_f;
    static String field_k;
    byte[] field_g;
    static cc field_l;

    final static void c(byte param0) {
        if (!(null == oq.field_b)) {
            oq.field_b.p(-79);
        }
        vk.field_q = new gda();
        kka.field_l.e((wj) (Object) vk.field_q, 33);
    }

    public static void b(boolean param0) {
        field_l = null;
        field_j = null;
        field_f = null;
        field_k = null;
        field_h = null;
        field_m = null;
    }

    final static void a(int param0, boolean param1) {
        if (!(wh.field_p == null)) {
            wh.field_p.a(param1, param0 + 17884);
        }
        if (param0 != -10082) {
            field_f = null;
            return;
        }
    }

    private bga() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Your food is now going mouldy. If it's left alone long enough, a creature will spawn from it!";
        field_k = "Retry";
        field_f = "Cancel";
    }
}
