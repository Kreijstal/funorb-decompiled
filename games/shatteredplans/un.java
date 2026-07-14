/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class un extends hb {
    private static int[] field_f;
    private static int[] field_k;
    private pf field_h;
    static qr field_g;
    static u field_i;
    static String field_j;

    final int b(byte param0) {
        if (param0 != -61) {
            ((un) this).field_h = null;
        }
        return ((un) this).field_h.e(0);
    }

    final oh a(byte param0) {
        if (param0 <= 99) {
            field_j = null;
        }
        return ((un) this).field_h.d(0);
    }

    final oh a(boolean param0) {
        if (param0) {
            return null;
        }
        return ((un) this).field_h.a((byte) -71);
    }

    final static void a(String param0, byte param1, long param2, int param3, int param4) {
        jj.field_n = true;
        if (param1 <= 44) {
            field_k = null;
        }
        vs.field_d = param4;
        ac.field_o = param2;
        ah.field_S = param0;
        vp.field_r = param3;
    }

    un(pf param0) {
        ((un) this).field_h = param0;
    }

    public static void a(int param0) {
        field_g = null;
        field_f = null;
        field_k = null;
        field_j = null;
        if (param0 != 11) {
            un.a((String) null, (byte) -25, 15L, -37, -9);
        }
        field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_f = new int[8];
        field_k = new int[12];
        for (var0 = 0; -9 < (var0 ^ -1); var0++) {
            field_f[var0] = (-var0 + 7) * 789516;
        }
        for (var0 = 0; var0 < 12; var0++) {
            field_k[var0] = (-var0 + 11) * 526344;
        }
        field_i = new u();
        field_j = "Played";
    }
}
