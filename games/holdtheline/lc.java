/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    private String field_a;
    private boolean field_e;
    private boolean field_b;
    static int field_h;
    static String field_f;
    static int field_g;
    static vi field_d;
    static go field_c;

    final boolean a(byte param0) {
        if (param0 != -34) {
            lc.b(-70);
            return ((lc) this).field_b;
        }
        return ((lc) this).field_b;
    }

    final String b(byte param0) {
        if (param0 != 66) {
            ((lc) this).a(true, 65);
            return ((lc) this).field_a;
        }
        return ((lc) this).field_a;
    }

    public static void b(int param0) {
        field_d = null;
        field_c = null;
        field_f = null;
        if (param0 >= -19) {
            lc.b(38);
        }
    }

    final boolean a(int param0) {
        if (param0 != 250) {
            field_g = 99;
            return ((lc) this).field_e;
        }
        return ((lc) this).field_e;
    }

    lc(String param0) {
        ((lc) this).field_b = false;
        ((lc) this).field_e = false;
        ((lc) this).field_a = param0;
    }

    final void a(boolean param0, int param1) {
        if (param1 < 74) {
            return;
        }
        ((lc) this).field_b = param0 ? true : false;
        ((lc) this).field_e = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Password: ";
        field_h = 250;
    }
}
