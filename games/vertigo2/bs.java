/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bs extends cr {
    int field_Kb;
    int field_Ib;
    cr field_Lb;
    static String field_ac;
    boolean field_Ob;
    boolean field_Yb;
    String field_Wb;
    cr field_Sb;
    cr field_Nb;
    String field_bc;
    int field_Ub;
    static String field_Vb;
    long field_Jb;
    static be field_Xb;
    cr field_Qb;
    boolean field_Zb;
    cr field_Tb;
    int field_Hb;
    int field_Mb;
    int field_Rb;
    long field_Pb;

    final boolean k(int param0) {
        if (param0 != 15) {
            ((bs) this).field_Nb = null;
        }
        return !((bs) this).e(param0 + -109) ? true : false;
    }

    bs(String param0, String param1, long param2) {
        super(0L, (cr) null);
        ((bs) this).field_Wb = param1;
        ((bs) this).field_Pb = param2;
        ((bs) this).field_bc = param0;
        CharSequence var6 = (CharSequence) (Object) ((bs) this).field_bc;
        String discarded$0 = rc.a(var6, 320);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var15 = 0;
        int[] var21 = null;
        int var17 = Vertigo2.field_L ? 1 : 0;
        int var11 = pk.a((byte) -14, cj.field_D, param5, ua.field_e);
        int var12 = pk.a((byte) -14, cj.field_D, param3, ua.field_e);
        int var13 = pk.a((byte) -14, ib.field_a, param4, ap.field_e);
        int var14 = pk.a((byte) -14, ib.field_a, param1, ap.field_e);
        if (param6 != 0) {
            return;
        }
        int var7 = pk.a((byte) -14, cj.field_D, param5 - -param0, ua.field_e);
        int var8 = pk.a((byte) -14, cj.field_D, param3 - param0, ua.field_e);
        for (var15 = var11; var15 < var7; var15++) {
            ki.a(-121, var13, vl.field_e[var15], var14, param2);
        }
        for (var15 = var12; var8 < var15; var15--) {
            ki.a(param6 + -126, var13, vl.field_e[var15], var14, param2);
        }
        int var9 = pk.a((byte) -14, ib.field_a, param4 + param0, ap.field_e);
        int var10 = pk.a((byte) -14, ib.field_a, -param0 + param1, ap.field_e);
        for (var15 = var7; var15 <= var8; var15++) {
            var21 = vl.field_e[var15];
            ki.a(param6 + -105, var13, var21, var9, param2);
            ki.a(-84, var10, var21, var14, param2);
        }
    }

    final boolean a(bs param0, boolean param1) {
        if (param1) {
            ((bs) this).field_Tb = null;
        }
        if (!((!((bs) this).field_Ob ? 1 : 0) == (!param0.field_Ob ? 1 : 0))) {
            return ((bs) this).field_Ob;
        }
        if ((param0.field_Yb ? 1 : 0) == (!((bs) this).field_Yb ? 1 : 0)) {
            return ((bs) this).field_Yb;
        }
        return ((bs) this).field_Jb < param0.field_Jb ? true : false;
    }

    public static void b(byte param0) {
        field_Xb = null;
        if (param0 < 62) {
            bs.a((byte) 14);
        }
        field_Vb = null;
        field_ac = null;
    }

    final static void a(byte param0) {
        int var3 = 0;
        int var4 = Vertigo2.field_L ? 1 : 0;
        if (param0 != -12) {
            bs.b((byte) 18);
        }
        er var1 = new er(540, 140);
        lq.a(var1, (byte) -94);
        oo.c();
        bi.c();
        hm.field_F = 0;
        bq.h(-105);
        er var2 = var1.c();
        for (var3 = 0; var3 < 15; var3++) {
            var2.b(-2, -2, 16777215);
            bi.c(4, 4, 0, 0, 540, 140);
        }
        pl.field_h.d();
        var1.b(0, 0);
        ln.d(-28558);
    }

    final static void a(r param0, int param1) {
        qr.field_q = tn.a("display_name_changed", param0, -99, "basic");
        h.field_D = new dm(0L, pb.field_b, we.field_J, nf.field_o);
        ao.field_O = new dm(0L, pb.field_b, sl.field_s, eq.field_B);
        wi.field_g = new cr(0L, (cr) null);
        el.field_a = new cr(0L, ee.field_b);
        el.field_a.field_O = 1;
        int var2 = -113 % ((param1 - 32) / 50);
        jg.field_q = new cr(0L, db.field_t, kc.field_c);
        va.field_f = new cr(0L, sa.field_a, ho.field_i);
        hb.field_k = new cr(0L, ja.field_e);
        wi.field_g.b(el.field_a, 118);
        wi.field_g.b(jg.field_q, 127);
        wi.field_g.b(va.field_f, 127);
        wi.field_g.b((cr) (Object) h.field_D, 118);
        wi.field_g.b(hb.field_k, 118);
        h.field_D.field_Lb.field_Lb.a(ee.field_b, -34);
        h.field_D.field_Lb.field_Lb.field_ab = 1;
        cr var3 = h.field_D.field_Lb.field_Lb;
        var3.field_O = 1;
        ao.field_O.field_Lb.field_Lb.a(ee.field_b, -114);
        cr var4 = ao.field_O.field_Lb.field_Lb;
        ao.field_O.field_Lb.field_Lb.field_ab = 1;
        var4.field_O = 1;
    }

    final void a(int param0, String param1, String param2) {
        if (param0 != 1) {
            bs.a(6, (byte) -63, 124);
        }
        ((bs) this).field_Wb = param1;
        ((bs) this).field_bc = param2;
        CharSequence var5 = (CharSequence) (Object) ((bs) this).field_bc;
        String discarded$0 = rc.a(var5, 320);
    }

    final static void a(int param0, byte param1, int param2) {
        mi var3 = uh.field_Wb;
        var3.j(param0, param1 ^ -89);
        if (param1 != -47) {
            return;
        }
        var3.f(3, 105);
        var3.f(10, -114);
        var3.d(param2, param1 ^ 1752);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ac = "Reject";
        field_Vb = "Time watching:";
    }
}
