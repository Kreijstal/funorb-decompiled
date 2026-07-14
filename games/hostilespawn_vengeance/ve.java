/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    static vl field_b;
    static int field_a;
    static boolean[] field_c;
    static String field_d;

    final static void a(byte param0, int param1) {
        int var2 = 0;
        int var4 = HostileSpawn.field_I ? 1 : 0;
        uf.a(rf.field_c, fc.field_z, 1512033985, true, param1, 0, i.field_f);
        for (var2 = 0; var2 < fc.field_z; var2++) {
            db.field_s[var2 - -param1] = var2;
        }
        int var3 = -108 % ((param0 - 73) / 39);
        uf.a(kl.field_a, param1 + fc.field_z, 1512033985, false, param1 + param1, param1, bh.field_e);
        if (!(fc.field_z <= param1)) {
            fc.field_z = param1;
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 0) {
            return;
        }
        field_b = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new vl();
        field_d = "to keep fullscreen or";
    }
}
