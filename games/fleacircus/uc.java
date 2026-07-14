/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uc {
    int[] field_g;
    java.awt.Image field_b;
    int field_f;
    static StringBuilder field_a;
    int field_h;
    static dd field_d;
    static ve field_c;
    static nf field_e;

    final void a(byte param0) {
        gb.a(((uc) this).field_g, ((uc) this).field_h, ((uc) this).field_f);
        if (param0 <= 56) {
            ((uc) this).a((byte) -122);
        }
    }

    abstract void a(java.awt.Component param0, int param1, int param2, int param3);

    final static void a(byte param0, boolean param1, wk param2) {
        mi.a((byte) 12, 256, param1, param2);
        if (param0 != 5) {
            uc.c((byte) 91);
        }
    }

    final static void b(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = fleas.field_A ? 1 : 0;
        ml.field_O = ia.field_m[fleas.field_E][tj.field_a].field_f;
        if (param0 != 84) {
            field_d = null;
        }
        for (var1 = 0; (var1 ^ -1) > -41; var1++) {
            for (var2 = 0; var2 < 21; var2++) {
                fl.field_c[var1][var2] = ia.field_m[fleas.field_E][tj.field_a].field_c[var1][var2];
            }
        }
        fg.a((byte) 13);
    }

    abstract void a(java.awt.Graphics param0, int param1, int param2, byte param3);

    public static void c(byte param0) {
        field_e = null;
        if (param0 >= -69) {
            return;
        }
        field_a = null;
        field_d = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new StringBuilder(12);
        field_d = new dd(270, 70);
    }
}
