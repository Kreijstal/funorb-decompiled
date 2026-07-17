/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kka extends ob {
    static String field_p;
    static String field_o;
    static String field_r;
    static float field_q;

    public static void c(byte param0) {
        field_r = null;
        field_o = null;
        field_p = null;
    }

    kka(int param0, int param1, int param2, int param3, int param4, float param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        ((kka) this).field_l = param3;
        int var5 = -61 / ((-55 - param2) / 58);
        ((kka) this).field_m = param0;
        ((kka) this).field_k = param1;
    }

    final void a(byte param0, int param1) {
        if (param0 != 62) {
            ((kka) this).a((byte) 4, 0.1830597221851349f);
            ((kka) this).field_h = param1;
            return;
        }
        ((kka) this).field_h = param1;
    }

    final void a(byte param0, float param1) {
        if (param0 < 77) {
            ((kka) this).a((byte) 113, -0.27641594409942627f);
            ((kka) this).field_j = param1;
            return;
        }
        ((kka) this).field_j = param1;
    }

    final void a(int param0, int param1) {
        if (param0 != 255) {
            return;
        }
        ((kka) this).field_g = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Resizable";
        field_r = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_p = "to return to the normal view.";
    }
}
