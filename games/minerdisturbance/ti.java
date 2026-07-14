/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti extends hc {
    static String field_P;
    static int[] field_O;
    static String field_J;
    static int[] field_I;
    static String field_K;
    static String field_L;
    static int field_M;
    static int[] field_N;

    final void a(int param0, int param1, int param2, int param3) {
        ((ti) this).field_H = !((ti) this).field_H ? true : false;
        super.a(param0, param1, param2, param3);
    }

    final static void a(byte param0) {
        nk var1_ref = null;
        nk var1 = (nk) (Object) ah.field_g.c(51510);
        if (var1 == null) {
            var1_ref = new nk();
        }
        var1_ref.a(eh.field_c, eh.field_a, eh.field_k, 0, eh.field_g, eh.field_e, eh.field_d, eh.field_f);
        int var2 = -89 % ((66 - param0) / 60);
        eb.field_f.a((byte) 121, (pi) (Object) var1_ref);
    }

    final static void a(byte param0, int param1, int param2) {
        aa.field_d = param1;
        rj.field_e = param2;
        if (param0 < 74) {
            ti.a((byte) 82);
        }
    }

    public static void c(byte param0) {
        field_L = null;
        if (param0 != -53) {
          field_I = null;
          field_P = null;
          field_O = null;
          field_J = null;
          field_N = null;
          field_K = null;
          field_I = null;
          return;
        } else {
          field_P = null;
          field_O = null;
          field_J = null;
          field_N = null;
          field_K = null;
          field_I = null;
          return;
        }
    }

    ti(String param0, rm param1, boolean param2) {
        this(param0, param1);
        ((ti) this).field_H = param2 ? true : false;
    }

    private ti(String param0, rm param1) {
        this(param0, bd.field_c.field_m, param1);
        ((ti) this).field_A = bd.field_c.field_e;
    }

    final static void a(jb param0, boolean param1, int param2) {
        ld var3 = null;
        if (!param1) {
          return;
        } else {
          var3 = sn.field_c;
          var3.d((byte) -61, param2);
          var3.c(2, 25564);
          var3.c(0, 25564);
          var3.c(param0.field_n, 25564);
          return;
        }
    }

    final static ea a(int param0) {
        int var4_int = 0;
        int var5 = MinerDisturbance.field_ab;
        int var1 = qk.field_b[0] * ng.field_e[0];
        byte[] var2 = db.field_b[0];
        int[] var3 = new int[var1];
        for (var4_int = param0; var1 > var4_int; var4_int++) {
            var3[var4_int] = af.field_p[c.a(255, (int) var2[var4_int])];
        }
        ea var4 = new ea(pf.field_c, wd.field_a, bg.field_d[0], oc.field_e[0], qk.field_b[0], ng.field_e[0], var3);
        ec.a((byte) -106);
        return var4;
    }

    private ti(String param0, ad param1, rm param2) {
        super(param0, param1, param2);
        ((ti) this).field_A = bd.field_c.field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "Jetpack: Hold <img=25> and <img=17> to fly.";
        field_O = new int[8192];
        field_K = "Names can only contain letters, numbers, spaces and underscores";
        field_L = "Ranking: Arctic Explorer";
        field_N = new int[11];
    }
}
