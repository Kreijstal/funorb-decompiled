/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tpa {
    static ri field_a;
    String[] field_e;
    int field_d;
    boolean field_g;
    boolean field_c;
    static int field_b;
    String field_f;

    public static void a(int param0) {
        if (param0 != 2) {
            tpa.a(-52);
            field_a = null;
            return;
        }
        field_a = null;
    }

    tpa(boolean param0) {
        this.field_g = param0 ? true : false;
    }

    static {
        field_a = new ri(10, 2, 2, 0);
    }
}
