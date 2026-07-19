/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class es extends bw {
    static eaa field_j;
    private int field_f;
    static String field_h;
    private int field_i;
    private int field_g;

    final void a(int param0, int param1) {
        pr.field_h[this.field_g].a(12 + (this.field_i + param1), -20 + this.field_f, param0);
    }

    public static void b(boolean param0) {
        if (!param0) {
            field_h = (String) null;
            field_h = null;
            field_j = null;
            return;
        }
        field_h = null;
        field_j = null;
    }

    es(int param0, int param1, int param2) {
        this.field_i = param0;
        this.field_f = param1;
        this.field_g = param2;
    }

    static {
        field_h = "Lost";
    }
}
