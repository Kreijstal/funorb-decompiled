/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h extends wn {
    static aj field_G;
    static String field_E;
    private vn field_H;
    static String[] field_K;
    static qb[] field_I;
    static int field_J;

    final qm a(int param0) {
        oc var2 = null;
        vi var3 = null;
        int var4 = 0;
        L0: {
          var4 = ArcanistsMulti.field_G ? 1 : 0;
          if (param0 > 31) {
            break L0;
          } else {
            ((h) this).field_H = null;
            break L0;
          }
        }
        var2 = new oc(((h) this).field_H);
        var3 = (vi) (Object) var2.b(-109);
        L1: while (true) {
          if (var3 != null) {
            if (var3.field_G) {
              return var3.e(852710177);
            } else {
              var3 = (vi) (Object) var2.d(-18502);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    public static void h(int param0) {
        field_K = null;
        field_E = null;
        if (param0 != 1) {
            return;
        }
        field_G = null;
        field_I = null;
    }

    final void f(int param0) {
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        oc var2 = new oc(((h) this).field_H);
        vi var3 = (vi) (Object) var2.b(-82);
        while (var3 != null) {
            var3.field_G = false;
            var3 = (vi) (Object) var2.d(-18502);
        }
        if (param0 >= -105) {
            return;
        }
        ((h) this).field_B = null;
    }

    public h() {
        super(0, 0, gi.field_c, mf.field_c, (pf) null, (wc) null);
        ((h) this).field_H = new vn();
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        if (null != ((h) this).field_r) {
            ((h) this).field_r.a((qm) this, 5592405, param1, param3, true);
        }
        oc var5 = new oc(((h) this).field_H);
        if (param0 >= -52) {
            return;
        }
        qm var6 = (qm) (Object) var5.c(121);
        while (var6 != null) {
            var6.a((byte) -53, param1 - -((h) this).field_n, param2, ((h) this).field_j + param3);
            var6 = (qm) (Object) var5.c(true);
        }
    }

    final static void a(long param0, int param1, String param2) {
        so.field_p = param2;
        if (param1 != -30687) {
            return;
        }
        nj.field_c = 2;
        CharSequence var5 = (CharSequence) (Object) param2;
        ua.field_S = gk.a(var5, -13);
        gg.field_e = param0;
        uc.a(3);
    }

    final void a(int param0, int param1, int param2) {
        int var8 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 == ((h) this).field_v) {
            if (!(((h) this).field_k != param2)) {
                return;
            }
        }
        int var4 = (param1 - ((h) this).field_v) / 2;
        if (param0 >= -111) {
            ((h) this).field_H = null;
        }
        int var5 = (param2 - ((h) this).field_k) / 2;
        oc var6 = new oc(((h) this).field_H);
        vi var7 = (vi) (Object) var6.b(-103);
        while (var7 != null) {
            var7.field_j = var7.field_j + var5;
            var7.field_n = var7.field_n + var4;
            var7 = (vi) (Object) var6.d(-18502);
        }
        ((h) this).field_k = param2;
        ((h) this).field_v = param1;
    }

    final vi g(int param0) {
        oc var2 = null;
        vi var3 = null;
        int var4 = 0;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = new oc(((h) this).field_H);
        if (param0 == 7213) {
          var3 = (vi) (Object) var2.b(-37);
          L0: while (true) {
            if (var3 != null) {
              if (!var3.field_G) {
                var3 = (vi) (Object) var2.d(-18502);
                continue L0;
              } else {
                return var3;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final static hc g(byte param0) {
        int var1 = -73 % ((param0 - 82) / 43);
        String var2 = ed.k(-952);
        if (var2 != null) {
            if (!(-1 < (var2.indexOf('@') ^ -1))) {
                var2 = "";
            }
        }
        return new hc(ed.k(-952), hc.a(-1));
    }

    final static void j(int param0) {
        int var3 = 0;
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        qb var1 = new qb(540, 140);
        fk.a(var1, -23095);
        id.a();
        de.b();
        gi.field_a = param0;
        cg.f(252566882);
        qb var2 = var1.g();
        for (var3 = 0; -16 < (var3 ^ -1); var3++) {
            var2.a(-2, -2, 16777215);
            de.d(4, 4, 0, 0, 540, 140);
        }
        gi.field_k.a();
        var1.b(0, 0);
        oo.c(-15405);
    }

    final void b(qm param0, int param1) {
        if (!(param0 instanceof vi)) {
            throw new IllegalArgumentException();
        }
        vi var3 = (vi) (Object) param0;
        ((h) this).field_H.a((pg) (Object) var3, (byte) -58);
        var3.field_G = true;
        boolean discarded$6 = var3.a(0, (qm) this);
        if (param1 != 15637) {
            ((h) this).field_H = null;
        }
    }

    final void i(int param0) {
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        oc var2 = new oc(((h) this).field_H);
        vi var3 = (vi) (Object) var2.b(param0 ^ -68);
        while (var3 != null) {
            if (!(!var3.a((byte) 112))) {
                var3.a(true);
            }
            var3 = (vi) (Object) var2.d(param0 ^ -18498);
        }
        if (param0 != 4) {
            ((h) this).a((byte) -84, -8, -8, 19);
        }
        ((h) this).field_B = (qm) (Object) ((h) this).g(7213);
    }

    final void h(byte param0) {
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        oc var2 = new oc(((h) this).field_H);
        if (param0 != 83) {
            return;
        }
        vi var3 = (vi) (Object) var2.b(param0 + -131);
        while (var3 != null) {
            if (!(!var3.g((byte) 45))) {
                var3.a(true);
            }
            var3 = (vi) (Object) var2.d(-18502);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new aj(7, 0, 1, 1);
        field_E = "Disruptive behaviour";
    }
}
