/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends tc {
    int[] field_p;
    String field_u;
    static String field_l;
    int[] field_t;
    static int[][] field_s;
    int field_o;
    int[] field_n;
    static String field_r;
    id[] field_k;
    int field_m;
    ln field_q;
    private static String field_z;

    public static void a(byte param0) {
        int var1 = -111 / ((param0 - 44) / 53);
        field_s = null;
        field_l = null;
        field_r = null;
    }

    sd() {
        ((sd) this).field_k = new id[10];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "sd.A(";
        field_l = "Units must be able to move to be cloned.";
        field_r = "This unit has no use for flammable materials.";
    }
}
