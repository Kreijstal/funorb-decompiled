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
        if (null == ((l) this).field_a) {
            return false;
        }
        if (param0) {
            field_b = null;
            return true;
        }
        return true;
    }

    final void a(boolean param0) {
        if (param0) {
            return;
        }
        if (!(((l) this).field_a != null)) {
            return;
        }
        ((l) this).field_a.field_f = ((l) this).field_f;
        ((l) this).field_f.field_a = ((l) this).field_a;
        ((l) this).field_a = null;
        ((l) this).field_f = null;
    }

    public static void b(int param0) {
        field_b = null;
        field_e = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new p();
        field_e = "(<%0> players want to join)";
    }
}
