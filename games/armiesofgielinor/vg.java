/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg extends tc {
    static int field_p;
    static wk[] field_q;
    byte[] field_s;
    static String field_t;
    static String field_k;
    static int[] field_r;
    static String field_o;
    static boolean field_m;
    static String field_l;
    boolean field_n;

    final static boolean a(int param0) {
        return ik.field_d != null || iu.field_h;
    }

    public static void a(byte param0) {
        field_t = null;
        field_o = null;
        field_k = null;
        field_l = null;
        field_r = null;
        field_q = null;
    }

    vg() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Objective";
        field_o = "This unit has already moved.";
        field_r = new int[]{14, 15, 16, 13, 10, 12, 11, 14, 14, 14, 15, 14, 16, 14, 14, 16};
        field_l = "Armies Expansion";
        field_t = "This ground is producing <%0> Mana per turn";
        field_m = false;
    }
}
