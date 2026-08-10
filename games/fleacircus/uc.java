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
        gb.a(this.field_g, this.field_h, this.field_f);
        if (param0 <= 56) {
            this.a((byte) -122);
        }
    }

    abstract void a(java.awt.Component param0, int param1, int param2, int param3);

    final static void a(byte param0, boolean param1, wk param2) {
        try {
            mi.a((byte) 12, 256, param1, param2);
            if (param0 != 5) {
                uc.c((byte) 91);
            }
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "uc.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = fleas.field_A ? 1 : 0;
        try {
            ml.field_O = ia.field_m[fleas.field_E][tj.field_a].field_f;
            if (param0 != 84) {
                field_d = (dd) null;
            }
            for (var1_int = 0; (var1_int ^ -1) > -41; var1_int++) {
                for (var2 = 0; var2 < 21; var2++) {
                    fl.field_c[var1_int][var2] = ia.field_m[fleas.field_E][tj.field_a].field_c[var1_int][var2];
                }
            }
            fg.a((byte) 13);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "uc.F(" + param0 + ')');
        }
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
        field_a = new StringBuilder(12);
        field_d = new dd(270, 70);
    }
}
