/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends hg {
    boolean field_h;
    boolean field_g;
    static hh field_k;
    static String field_j;
    int[] field_i;

    public static void a(boolean param0) {
        if (param0) {
            boolean discarded$0 = jh.d(71);
            field_k = null;
            field_j = null;
            return;
        }
        field_k = null;
        field_j = null;
    }

    final static boolean d(int param0) {
        if (param0 != -4292) {
            Object var2 = null;
            jh.a(false, (String) null, true, (String) null);
            return hf.field_a;
        }
        return hf.field_a;
    }

    final static void a(boolean param0, String param1, boolean param2, String param3) {
        bm.field_g = param3;
        vk.field_v = param1;
        uf.a((byte) 71, mm.field_a, param0);
        if (param2) {
            jh.a(true);
        }
    }

    jh() {
        ((jh) this).field_h = false;
        ((jh) this).field_g = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Accept";
    }
}
