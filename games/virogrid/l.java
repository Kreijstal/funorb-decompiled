/*
 * Decompiled by CFR-JS 0.4.0.
 */
class l {
    l field_a;
    long field_d;
    static p field_c;
    static km field_b;
    static String field_e;
    l field_f;

    final boolean b(boolean param0) {
        if (null == this.field_a) {
            return false;
        }
        if (param0) {
            field_b = (km) null;
            return true;
        }
        return true;
    }

    final void a(boolean param0) {
        if (param0) {
            return;
        }
        if (!(this.field_a != null)) {
            return;
        }
        this.field_a.field_f = this.field_f;
        this.field_f.field_a = this.field_a;
        this.field_a = null;
        this.field_f = null;
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != -6325) {
            return;
        }
        field_e = null;
        field_c = null;
    }

    static {
        field_c = new p();
        field_e = "(<%0> players want to join)";
    }
}
