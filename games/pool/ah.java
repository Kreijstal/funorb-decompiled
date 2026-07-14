/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    static int[] field_c;
    static String field_b;
    static int field_i;
    int field_d;
    static String field_g;
    int field_f;
    static String field_h;
    int field_a;
    static so[] field_e;
    int field_j;

    public static void a(boolean param0) {
        field_g = null;
        field_e = null;
        field_c = null;
        field_h = null;
        field_b = null;
        if (param0) {
            field_g = null;
        }
    }

    ah() {
    }

    ah(ah param0) {
        ((ah) this).field_a = param0.field_a;
        ((ah) this).field_j = param0.field_j;
        ((ah) this).field_f = param0.field_f;
        ((ah) this).field_d = param0.field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "The game options are not all set.";
        field_b = "<%0> has resigned.";
        field_h = "Press <img=4> or <img=0> click on the cue ball to enter shot mode.";
    }
}
