/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb extends eg implements dm {
    static int[] field_P;
    static int field_R;
    static int[] field_Q;
    private od field_W;
    private ae field_T;
    static int[] field_S;
    static int field_V;
    static String field_U;

    final void a(na param0, int param1, int param2, boolean param3) {
        super.a(param0, param1, param2, param3);
        ((lb) this).field_T.field_K = ((lb) this).field_W.a(-104).c(-68) == pf.field_a ? true : false;
    }

    lb(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (kg) null);
        ((lb) this).field_W = new od((kg) (Object) new mf(10000536), ef.field_n, 0, 0, 140, 25);
        ((lb) this).field_W.a(45, new qh());
        ((lb) this).field_T = new ae(al.field_e, (dn) this);
        ((lb) this).field_I = new na[]{(na) (Object) ((lb) this).field_W, (na) (Object) ((lb) this).field_T};
        ((lb) this).field_T.field_H = (kg) (Object) new uj();
        ((lb) this).b((byte) 37);
    }

    final void d(byte param0) {
        int var2 = 0;
        if (param0 > -109) {
          field_P = null;
          var2 = 250;
          ((lb) this).field_W.a(25, -25 + (((lb) this).field_u + 20) >> -1384589791, -125, -var2 + ((lb) this).field_F >> -849760735, 140);
          ((lb) this).field_T.a(30, (((lb) this).field_u - 10 >> 573509761) - -2, -124, 10 + ((-var2 + ((lb) this).field_F >> -970469375) - -140), 100);
          return;
        } else {
          var2 = 250;
          ((lb) this).field_W.a(25, -25 + (((lb) this).field_u + 20) >> -1384589791, -125, -var2 + ((lb) this).field_F >> -849760735, 140);
          ((lb) this).field_T.a(30, (((lb) this).field_u - 10 >> 573509761) - -2, -124, 10 + ((-var2 + ((lb) this).field_F >> -970469375) - -140), 100);
          return;
        }
    }

    final static void a(bh param0, boolean param1) {
        int var2 = 0;
        Object var3 = null;
        tl.field_X = param0.e(127) << 755866149;
        var2 = param0.d((byte) -99);
        l.field_j = (7 & var2) << -1785448910;
        tl.field_X = tl.field_X + (var2 >> -144765597);
        l.field_j = l.field_j + (param0.e(127) << 416081154);
        var2 = param0.d((byte) -99);
        fd.field_F = var2 << -862214065 & 2064384;
        l.field_j = l.field_j + (var2 >> 1196540134);
        fd.field_F = fd.field_F + (param0.d((byte) -99) << -1463169945);
        if (param1) {
          var3 = null;
          bf discarded$1 = lb.a((wf) null, 38);
          var2 = param0.d((byte) -99);
          om.field_Nb = (var2 & 1) << 1037637808;
          fd.field_F = fd.field_F + (var2 >> -1557831615);
          om.field_Nb = om.field_Nb + param0.e(127);
          return;
        } else {
          var2 = param0.d((byte) -99);
          om.field_Nb = (var2 & 1) << 1037637808;
          fd.field_F = fd.field_F + (var2 >> -1557831615);
          om.field_Nb = om.field_Nb + param0.e(127);
          return;
        }
    }

    public static void h(int param0) {
        field_S = null;
        if (param0 != 0) {
          field_V = 73;
          field_Q = null;
          field_U = null;
          field_P = null;
          return;
        } else {
          field_Q = null;
          field_U = null;
          field_P = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        dh.field_d.b(na.field_G, param1 + (((lb) this).field_t + 4), dh.field_d.field_N + ((lb) this).field_w + (param2 + 4), 16777215, -1);
    }

    public final void a(byte param0, ae param1, int param2, int param3, int param4) {
        if (param0 >= 0) {
            return;
        }
        if (!(((lb) this).field_W.a(-109).c(-77) == pf.field_a)) {
            return;
        }
        qe.a(((lb) this).field_W.a(false), 0, ((lb) this).field_W.f((byte) 90), ((lb) this).field_W.g((byte) 12));
    }

    final static bf a(wf param0, int param1) {
        if (param1 != 573509761) {
          field_U = null;
          return we.a(-11040, ee.a(param0, 100, 96));
        } else {
          return we.a(-11040, ee.a(param0, 100, 96));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = "Connection lost. <%0>";
        field_S = new int[8192];
        field_Q = new int[8192];
    }
}
