/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends hf {
    byte[] field_h;
    static nd field_f;
    static int[] field_i;
    static ck field_g;

    pj(byte[] param0) {
        ((pj) this).field_h = param0;
    }

    public static void b(boolean param0) {
        field_i = null;
        field_g = null;
        if (param0) {
            pj.b(false);
            field_f = null;
            return;
        }
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new nd();
        field_i = new int[16384];
        field_g = new ck(0, 2, 2, 1);
    }
}
