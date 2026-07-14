/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    int field_c;
    static cn field_j;
    int field_b;
    static fd field_p;
    static cn[] field_q;
    int field_e;
    static int field_l;
    byte[] field_o;
    int field_h;
    int field_i;
    static cn field_f;
    int field_m;
    byte[] field_n;
    static String field_d;
    static boolean field_k;
    static r field_g;
    int field_a;

    final static void a(ec param0, java.math.BigInteger param1, java.math.BigInteger param2, byte param3, ec param4) {
        cb.a(param1, param4.field_o, param4.field_m, param0, 5471, param2, 0);
        if (param3 > -110) {
            field_k = false;
        }
    }

    final static void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = DungeonAssault.field_K;
        if (param0 > -74) {
            field_g = null;
        }
        jh.c();
        if (!(im.field_e != null)) {
            im.field_e = new cn(268, 268);
            im.field_e.field_w = -8;
            im.field_e.field_A = -8;
        }
        im.field_e.e();
        gf.a();
        int var1 = 0;
        for (var2 = 0; -8 < (var2 ^ -1); var2++) {
            for (var3 = 0; var3 < 7; var3++) {
                jm.a(12 + var2 * 36, var1, 3, 36 * var3 - -12);
                var1++;
            }
        }
        gf.d(2, 2, 0, 0, im.field_e.field_y, im.field_e.field_v);
        jh.b();
    }

    public static void a(byte param0) {
        if (param0 <= 44) {
            field_p = null;
        }
        field_q = null;
        field_j = null;
        field_p = null;
        field_g = null;
        field_f = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new fd(0);
        field_g = new r();
    }
}
