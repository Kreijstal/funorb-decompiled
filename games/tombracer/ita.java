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

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 != 48) {
            field_g = -90;
            field_e = null;
            return;
        }
        field_e = null;
    }

    ita(int param0, int param1) {
        this.field_d = param0;
        this.field_b = param1;
        this.field_h = new float[param0 * param1];
    }

    static {
        field_a = new int[2];
        field_f = 0;
    }
}
