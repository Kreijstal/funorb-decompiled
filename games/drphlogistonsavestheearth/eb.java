/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    static he[] field_c;
    static String[] field_d;
    static int[] field_b;
    static he[] field_a;
    static byte[][] field_f;
    static nh[] field_e;
    static nh field_g;

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_c = null;
        if (param0 != 5) {
            Object var2 = null;
            eb.a((String) null, false, true, -94);
        }
        field_d = null;
        field_b = null;
        field_g = null;
        field_e = null;
    }

    final static void a(String param0, boolean param1, boolean param2, int param3) {
        cf.a((byte) -107);
        ng.field_c.j(300);
        pi.field_O = new wa(qf.field_c, (String) null, sg.field_a, param1, param2);
        fb.field_e = new el(ng.field_c, (vg) (Object) pi.field_O);
        if (param3 != 10) {
            return;
        }
        ng.field_c.a((byte) -125, (vg) (Object) fb.field_e);
    }

    final static void a(byte param0) {
        int var2 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 != 20) {
            return;
        }
        nl var3 = (nl) (Object) dl.field_M.h(param0 ^ -11163);
        while (var3 != null) {
            rc.a(5, var3, -11659);
            var3 = (nl) (Object) dl.field_M.e(0);
        }
        vi.field_c = ck.a(0, 5, 1, true);
    }

    final static boolean a(od param0, int param1) {
        int var2 = param0.l(31760);
        if (param1 < 6) {
            return true;
        }
        int var3 = (var2 ^ -1) == -2 ? 1 : 0;
        return var3 != 0;
    }

    final static fl[] a(bl param0, boolean param1) {
        int var5 = 0;
        fl var6 = null;
        int var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!param1) {
            return null;
        }
        if (!(param0.a(-20))) {
            return new fl[]{};
        }
        il var8 = param0.a((byte) -107);
        while (var8.field_b == 0) {
            kk.a(10L, true);
        }
        if (!((var8.field_b ^ -1) != -3)) {
            return new fl[]{};
        }
        int[] var12 = (int[]) var8.field_g;
        int[] var11 = var12;
        int[] var10 = var11;
        int[] var9 = var10;
        int[] var3 = var9;
        fl[] var4 = new fl[var12.length >> 1061568130];
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new fl();
            var4[var5] = var6;
            var6.field_g = var3[var5 << 698699138];
            var6.field_h = var3[(var5 << -86045406) - -1];
            var6.field_b = var3[2 + (var5 << 484328738)];
            var6.field_c = var3[(var5 << 793747810) - -3];
        }
        return var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_f = new byte[250][];
        field_e = new nh[9];
    }
}
