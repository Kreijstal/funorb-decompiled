/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg extends lh {
    int field_j;
    static String field_l;
    static String field_o;
    int field_m;
    static ob field_i;
    static int[] field_q;
    static sf field_n;
    static sf field_k;
    static String[] field_p;

    final static boolean a(String param0, int param1) {
        int var3 = 0;
        int var4 = fleas.field_A ? 1 : 0;
        int var2 = param0.charAt(0);
        for (var3 = param1; var3 < param0.length(); var3++) {
            if (var2 != param0.charAt(var3)) {
                return false;
            }
        }
        return true;
    }

    final static void a(int param0) {
        vh.field_o = vh.field_o ^ ni.field_j;
        pg.field_d = pg.field_d ^ ni.field_j;
        if (null != pb.field_f.c((byte) 47)) {
            hi.field_q = hi.field_q + 1;
            if ((hi.field_q + 1 ^ -1) == -336) {
                hi.field_q = 0;
                lh discarded$0 = pb.field_f.e(-22033);
            }
        }
        if (param0 > -74) {
            hg.a(15);
        }
        dh.field_d = dh.field_d - ag.field_f;
        se.field_b = se.field_b + ag.field_f;
    }

    public static void a(byte param0) {
        field_i = null;
        field_p = null;
        field_k = null;
        field_l = null;
        field_o = null;
        if (param0 < 104) {
            field_n = null;
        }
        field_q = null;
        field_n = null;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        int var4 = 1 << param1;
        if (param0 != -25389) {
            hg.a(72, -8, -103, 2);
        }
        if (!(0 == (kh.field_b & var4))) {
            return;
        }
        fleas.field_L = fleas.field_L | var4;
        kh.field_b = kh.field_b | var4;
        pb.field_f.a(false, (lh) (Object) new kb(param1));
        a.field_e.a(false, (lh) (Object) new hi(param1, param2, lj.field_h, se.field_b, dh.field_d, e.field_b));
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        kh.field_g = param4;
        if (param0 != 0) {
            hg.a(127);
        }
        hb.field_t = param1;
        cm.field_f = param3;
        ta.field_y = param2;
    }

    private hg() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Menu";
        field_o = "Start level";
        field_i = new ob();
        field_p = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
