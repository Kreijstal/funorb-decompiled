/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wba extends ob {
    static vm field_o;
    static String[] field_q;
    static jea[] field_p;

    final void a(int param0, int param1) {
        this.field_g = param1;
        if (param0 != 255) {
            this.a((byte) 66, -128);
        }
    }

    final void a(byte param0, int param1) {
        if (param0 != 62) {
            this.a((byte) 7, -0.12800447642803192f);
            this.field_h = param1;
            return;
        }
        this.field_h = param1;
    }

    wba(int param0, int param1, int param2, int param3, int param4, float param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    public static void e(int param0) {
        field_o = null;
        if (param0 != -25657) {
            wba.e(-89);
            field_q = null;
            field_p = null;
            return;
        }
        field_q = null;
        field_p = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        this.field_m = param0;
        this.field_l = param3;
        this.field_k = param1;
        int var5 = -86 % ((-55 - param2) / 58);
    }

    final void a(byte param0, float param1) {
        this.field_j = param1;
        if (param0 <= 77) {
            field_q = (String[]) null;
        }
    }

    static {
        field_o = null;
        field_q = new String[42];
    }
}
