/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se {
    static int field_j;
    int field_b;
    static boolean field_h;
    int field_g;
    int field_e;
    int field_i;
    static ci[] field_c;
    int field_a;
    r field_d;
    int field_f;

    public static void a(int param0) {
        if (param0 != -1) {
            se.a(74);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final void a(int param0, int param1, int param2, int param3, r param4) {
        this.field_d = param4;
        this.field_b = param1;
        this.field_a = param0;
        if (param3 != -22899) {
            return;
        }
        try {
            this.field_g = param2;
            if (param4 != null && (param4.field_t ^ -1) == -10) {
                param1 = 12;
            }
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "se.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    se() {
        this.field_f = -1;
        this.field_e = -1;
    }

    static {
        field_h = true;
    }
}
