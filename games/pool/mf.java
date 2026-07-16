/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf extends tm {
    static dd field_n;
    static int field_l;
    static boolean field_o;
    static int field_m;

    final boolean c(int param0) {
        if (param0 != 2) {
            field_o = true;
            return true;
        }
        return true;
    }

    final int a(int param0, boolean param1) {
        if (!param1) {
            return 118;
        }
        return rc.field_e[param0];
    }

    final static int a(int param0, double param1) {
        if (param0 != 16) {
            return -57;
        }
        return ud.a(param1, 16, 1);
    }

    final void a(di param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Pool.field_O;
        ((mf) this).field_a = new eg[]{((mf) this).g(-930305852), eg.a(param0, "", "balls/CLASSIC/ball1"), eg.a(param0, "", "balls/CLASSIC/ball2"), eg.a(param0, "", "balls/CLASSIC/ball3"), eg.a(param0, "", "balls/CLASSIC/ball4"), eg.a(param0, "", "balls/CLASSIC/ball5"), eg.a(param0, "", "balls/CLASSIC/ball6"), eg.a(param0, "", "balls/CLASSIC/ball7"), eg.a(param0, "", "balls/CLASSIC/ball8"), eg.a(param0, "", "balls/CLASSIC/ball9"), eg.a(param0, "", "balls/CLASSIC/ball10"), eg.a(param0, "", "balls/CLASSIC/ball11"), eg.a(param0, "", "balls/CLASSIC/ball12"), eg.a(param0, "", "balls/CLASSIC/ball13"), eg.a(param0, "", "balls/CLASSIC/ball14"), eg.a(param0, "", "balls/CLASSIC/ball15")};
        if (param1 != 117) {
          return;
        } else {
          var3 = 1;
          L0: while (true) {
            if (((mf) this).field_a.length <= var3) {
              return;
            } else {
              ((mf) this).field_a[var3].a(8, 8, 8, 4);
              li.a(((mf) this).field_a[var3], 0);
              var3++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, di param1) {
        dd[] dupTemp$0 = aj.a(param0 ^ param0, "", param1, "top_bar_balls_modern");
        ((mf) this).field_e = dupTemp$0;
        d.field_a = dupTemp$0;
    }

    public static void i(int param0) {
        field_n = null;
        if (param0 != 1) {
            mf.j(26);
        }
    }

    final static void j(int param0) {
        if (param0 != 1) {
            Object var2 = null;
            mf.a((byte) -32, 29, (nm) null, (nm) null, -126, -60);
            sa.field_f = new fn(tq.field_m, dg.field_J, qg.field_f, uo.field_Lb, (vh) (Object) e.field_e, ei.field_A);
            return;
        }
        sa.field_f = new fn(tq.field_m, dg.field_J, qg.field_f, uo.field_Lb, (vh) (Object) e.field_e, ei.field_A);
    }

    mf() {
        ((mf) this).field_g = false;
    }

    final String a(byte param0, int param1) {
        if (param0 <= 9) {
            return null;
        }
        return 0 == param1 ? me.field_w : vf.field_Q;
    }

    final static void a(byte param0, int param1, nm param2, nm param3, int param4, int param5) {
        td.field_e = param2;
        qi.field_e = param1;
        fj.field_h = param5;
        if (param0 > -24) {
            return;
        }
        rm.field_b = param4;
        bk.field_m = param3;
    }

    static {
    }
}
