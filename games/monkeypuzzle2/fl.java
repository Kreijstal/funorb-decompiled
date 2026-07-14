/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static int field_b;
    static sd field_c;
    static int field_d;
    static int[] field_a;

    final static void b(int param0) {
        int var1 = 0;
        int var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        for (var1 = 0; -18 < (var1 ^ -1); var1++) {
            pe.field_d[var1].field_e[0] = (float)(-(10 * var1) + 320);
            pe.field_d[var1].field_e[1] = (float)(-20 - 20 * var1);
            pe.field_d[var1].field_i[0] = (float)(320 + -(10 * var1));
            pe.field_d[var1].field_i[1] = (float)(-20 - 20 * var1);
            pe.field_d[var1].field_f[0] = 0.0f;
            pe.field_d[var1].field_f[1] = 1000.0f;
        }
        var1 = -38 / ((param0 - 78) / 46);
        bl.field_f = 640;
        mh.field_D = 640;
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 != -45) {
            fl.a((byte) 31);
        }
    }

    final static void a(int param0) {
        if ((ol.field_e ^ -1) > param0) {
            w.a(-1, 32 + ol.field_e);
            return;
        }
        w.a(-1, 256);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[11];
        field_c = new sd();
    }
}
