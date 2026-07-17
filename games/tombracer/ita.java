/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ita implements mw {
    static hja[] field_e;
    int field_d;
    static jea field_c;
    static int[] field_a;
    static int field_g;
    int field_b;
    static int field_f;
    float[] field_h;

    public static void a() {
        field_c = null;
        field_a = null;
        field_e = null;
    }

    ita(int param0, int param1) {
        ((ita) this).field_d = param0;
        ((ita) this).field_b = param1;
        ((ita) this).field_h = new float[param0 * param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[2];
        field_f = 0;
    }
}
