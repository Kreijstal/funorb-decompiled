/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk extends bc {
    static String field_d;
    private String field_c;
    static String field_e;
    private String field_b;

    final void a(fj param0, byte param1) {
        param0.a(((rk) this).field_c, (byte) -72);
        if (param1 != -71) {
            Object var4 = null;
            rk.a((byte[]) null, (int[]) null, -81, (byte) 58, -51);
        }
        param0.a((byte) -107, ((rk) this).field_b);
    }

    final static void a(byte[] param0, int[] param1, int param2, byte param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = Torquing.field_u;
        int var5 = -90 / ((-31 - param3) / 38);
        for (var6 = 0; var6 < u.field_v.length; var6++) {
            param4 = u.field_v[var6];
            var7 = var6 << -1433527420;
            while (true) {
                param4--;
                if (param4 == 0) {
                    break;
                }
                var7++;
                param2 = mn.field_bb[var7];
                param1[param0[param2]] = param1[param0[param2]] + 1;
                mn.field_bb[param1[param0[param2]]] = param2;
            }
        }
    }

    public static void b(boolean param0) {
        field_e = null;
        if (!param0) {
            field_d = null;
        }
        field_d = null;
    }

    final gq a(boolean param0) {
        if (param0) {
            Object var3 = null;
            rk.a((byte[]) null, (int[]) null, -108, (byte) -100, 71);
        }
        return im.field_J;
    }

    rk(String param0, String param1) {
        ((rk) this).field_c = param0;
        ((rk) this).field_b = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Name is available";
        field_e = "Quit";
    }
}
