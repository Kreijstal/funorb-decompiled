/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends qe {
    static String[] field_r;
    static String field_z;
    static String[] field_p;
    static String field_u;
    static int field_y;
    static int field_o;
    static int field_s;
    static int[] field_A;
    static km field_w;
    static int[] field_B;
    static String field_n;
    static ao field_q;
    static int[] field_x;
    static int field_t;
    static String[] field_v;

    final String a(int param0, String param1) {
        if (!(((ve) this).a(param1, true) != ee.field_c)) {
            return ma.field_a;
        }
        if (param0 != -26358) {
            return null;
        }
        return bk.field_c;
    }

    final static int a(int param0, int param1, byte param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = Virogrid.field_F ? 1 : 0;
        int var3 = 0;
        int var4 = tl.field_i;
        if (param2 != 66) {
            int discarded$0 = ve.a(38, -113, (byte) -85);
        }
        while (var3 < vg.field_F.length) {
            var5 = wf.field_f[var3];
            if (-1 < (var5 ^ -1)) {
                var4 = var4 + bn.field_b;
            } else {
                var6 = an.a(true, (byte) 114, vg.field_F[var3]);
                var4 = var4 + hd.field_e;
                var7 = mh.field_g - (var6 >> 1816767009);
                if (wf.a(var7 + -dj.field_e, param1, var6 + (dj.field_e << -1329871103), true, var4, param0, (ng.field_P << -1082834719) + di.field_o)) {
                    return var5;
                }
                var4 = var4 + (di.field_o + (ng.field_P << -1903879359) + hd.field_e);
            }
            var3++;
        }
        return -1;
    }

    public static void c(boolean param0) {
        field_q = null;
        field_u = null;
        if (!param0) {
            return;
        }
        field_v = null;
        field_w = null;
        field_A = null;
        field_p = null;
        field_x = null;
        field_r = null;
        field_B = null;
        field_n = null;
        field_z = null;
    }

    ve(wa param0) {
        super(param0);
    }

    final static void c(byte param0) {
        if ((j.field_l ^ -1) != -11) {
            // ifne L35
        }
        ii.b((byte) -107);
        j.field_l = 11;
        j.field_g = true;
        int var1 = 82 % ((18 - param0) / 59);
    }

    final wl a(String param0, boolean param1) {
        if (!param1) {
            field_B = null;
        }
        int var3 = null == vd.a(param0, 119) ? 1 : 0;
        if (!(var3 != 0)) {
            return ee.field_c;
        }
        return bm.field_i;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Passwords can only contain letters and numbers";
        field_t = 20;
        field_r = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_y = 0;
        field_B = new int[4];
        field_p = new String[4];
        field_A = new int[4];
        field_v = new String[4];
        field_n = "Change display name";
    }
}
