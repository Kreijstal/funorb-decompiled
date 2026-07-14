/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf extends oh {
    static bi field_h;
    static String field_m;
    static bi field_k;
    static int field_n;
    static volatile int field_i;
    static wq[] field_j;
    static qr field_l;

    final static void a(int param0, int param1) {
        sl var2 = js.field_f;
        var2.h(param0, 255);
        var2.field_j = var2.field_j + 1;
        int var3 = var2.field_j;
        var2.c(2, (byte) -99);
        var2.a(0, id.field_c.length, id.field_c, 22186);
        var2.c(qj.field_b, (byte) -114);
        if (param1 <= 64) {
            return;
        }
        var2.c(rj.field_q, (byte) -58);
        var2.a(0, qj.field_f.length, qj.field_f, 22186);
        var2.b(var2.field_j + -var3, (byte) 126);
    }

    rf(fs param0, fs param1) {
    }

    public static void c(boolean param0) {
        field_m = null;
        field_l = null;
        if (!param0) {
            return;
        }
        field_h = null;
        field_k = null;
        field_j = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_n = 0;
        field_m = "Player names can be up to 12 letters, numbers and underscores";
        field_i = -1;
        field_h = new bi(270, 70);
        field_j = new wq[255];
        for (var0 = 0; var0 < field_j.length; var0++) {
            field_j[var0] = new wq();
        }
    }
}
