/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ocb extends eca {
    static String field_j;
    static String[] field_m;
    private uf field_f;
    static int[] field_h;
    private uf field_k;
    static String field_i;
    static String field_g;
    static int field_l;

    final String b(String param0, int param1) {
        String var3 = ((ocb) this).field_f.field_j.toLowerCase();
        String var4 = param0.toLowerCase();
        if (var4.length() == 0) {
            return null;
        }
        String var5 = var4;
        if (hcb.a(var5, 15)) {
            return ema.field_r;
        }
        if (ws.a((byte) 109, var5)) {
            return ipa.field_o;
        }
        if (mea.a(126, var5)) {
            return qab.field_a;
        }
        if (!(!this.a(param0, false))) {
            return gnb.field_f;
        }
        if ((var3.length() ^ -1) >= param1) {
            return cqa.field_q;
        }
        if (qnb.a(var5, -1, var3)) {
            return jta.field_q;
        }
        if (!(!njb.a(var3, 95, var5))) {
            return lna.field_p;
        }
        if (wg.a(var5, var3, true)) {
            return jta.field_q;
        }
        return ema.field_r;
    }

    final static llb a(int param0, int param1, int param2, no param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        llb var13 = new llb(0L, (llb) null);
        if (param2 != 10204) {
            field_i = null;
        }
        var13.field_gb = va.a(-26998, param4, param11);
        var13.field_mb = va.a(param2 + -37202, param5, param6);
        var13.field_A = va.a(param2 ^ -20138, param12, param9);
        var13.field_nb = va.a(-26998, param7, param1);
        var13.field_ub = va.a(param2 + -37202, param0, param8);
        var13.field_Y = param10;
        var13.field_eb = param3;
        return var13;
    }

    final static void a(boolean param0, byte param1, boolean param2) {
        if (!(!param0)) {
            oqa.field_o = oqa.field_o + 1;
            psa.e(param1 + 94);
        }
        if (param2) {
            emb.field_p = emb.field_p + 1;
            vkb.a(param1 + -10726);
        }
        if (param1 != 33) {
            ocb.f(12);
        }
    }

    final static void f(int param0) {
        ulb.a(100);
        if (param0 != -10150) {
            llb discarded$0 = ocb.a(-128, 101, 87, (no) null, 109, 83, -49, -78, 19, -41, 88, -111, 125);
        }
        uda.b(-2283);
        ah.e(-17);
    }

    public static void d(byte param0) {
        field_m = null;
        field_g = null;
        if (param0 < 125) {
            return;
        }
        field_h = null;
        field_i = null;
        field_j = null;
    }

    final static void a(boolean param0, int param1) {
        if (param1 <= 101) {
            field_g = null;
        }
        if (!(wga.field_a == null)) {
            dma.e(dma.field_d, dma.field_c, -dma.field_d + dma.field_a, -dma.field_c + dma.field_f);
            wga.field_a.b(param0, 22);
        }
    }

    ocb(uf param0, uf param1, uf param2) {
        super(param0);
        ((ocb) this).field_k = param2;
        ((ocb) this).field_f = param1;
    }

    final qrb a(String param0, int param1) {
        String var3 = ((ocb) this).field_f.field_j.toLowerCase();
        if (param1 != 16384) {
            return null;
        }
        String var4 = param0.toLowerCase();
        if (var4.length() == 0) {
            return cca.field_o;
        }
        if (!(seb.a(var3, var4, -101))) {
            return cca.field_o;
        }
        if (this.a(param0, false)) {
            return cca.field_o;
        }
        return lea.field_o;
    }

    private final boolean a(String param0, boolean param1) {
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var3 = ((ocb) this).field_k.field_j.toLowerCase();
        String var4 = param0.toLowerCase();
        if (param1) {
            return true;
        }
        if ((var3.length() ^ -1) < -1) {
            if (0 >= var4.length()) {
                return false;
            }
            var5 = var3.lastIndexOf("@");
            if (var5 >= 0) {
                if (!(var3.length() + -1 <= var5)) {
                    var6 = var3.substring(0, var5);
                    var7 = var3.substring(1 + var5);
                    if (!(0 > var4.indexOf(var6))) {
                        return true;
                    }
                    return -1 < (var4.indexOf(var7) ^ -1) ? false : true;
                }
            }
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_j = "Hide game chat";
        field_h = new int[4096];
        for (var0 = 0; (var0 ^ -1) > -4097; var0++) {
            field_h[var0] = gha.a((byte) 60, var0);
        }
        field_g = "Chat is currently disabled.";
    }
}
