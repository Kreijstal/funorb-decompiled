/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh extends gn {
    static String field_e;
    private int field_t;
    private vm field_m;
    private int field_n;
    private int field_i;
    private int field_f;
    private int field_u;
    private boolean field_r;
    private int field_x;
    private boolean field_j;
    static boolean field_q;
    static ot field_p;
    static int field_w;
    private int field_s;
    static String field_v;
    static String field_h;
    private int field_l;
    private int field_k;
    private boolean field_o;
    private boolean field_g;

    final void a(int param0, boolean param1) {
        ((wh) this).field_u = param0;
        ((wh) this).field_o = param1 ? true : false;
        ((wh) this).field_t = 0;
        ((wh) this).field_m.f(0);
    }

    final static void a(byte param0, vc[] param1) {
        int var2 = 0;
        long var3 = 0L;
        cq var5 = null;
        int var6 = 0;
        var6 = Kickabout.field_G;
        if (param0 > 66) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= param1.length) {
              gb.field_F = true;
              return;
            } else {
              var3 = param1[var2].field_a;
              var5 = (cq) (Object) ic.field_h.field_O.g(24009);
              L1: while (true) {
                if (var5 != null) {
                  if ((var5.field_i ^ -1L) == (var3 ^ -1L)) {
                    i.field_A[var5.field_l] = param1[var2];
                    var2++;
                    continue L0;
                  } else {
                    var5 = (cq) (Object) ic.field_h.field_O.c(33);
                    continue L1;
                  }
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final void b(int param0) {
        if (((wh) this).field_r) {
            he.a(((wh) this).field_m, true);
        } else {
            mj.a(true, ((wh) this).field_m);
        }
        if (param0 <= 67) {
            ((wh) this).f((byte) 6);
        }
    }

    private final void a(byte param0) {
        int var2 = ((wh) this).field_i * mn.field_a >> -341429720;
        if (param0 != 99) {
            this.e(81);
        }
        ((wh) this).field_m = vm.a(vg.field_Db[((wh) this).field_n].field_l, 100, var2, ((wh) this).field_f);
        if (!(!((wh) this).field_j)) {
            ((wh) this).field_m.i();
        }
        if (!((wh) this).field_r) {
            ag discarded$1 = ga.a(((wh) this).field_m, 114);
        } else {
            ag discarded$2 = w.a(((wh) this).field_m, param0 ^ 14);
        }
        ((wh) this).field_k = ((wh) this).field_k - 1;
        ((wh) this).field_o = false;
    }

    private final void g(byte param0) {
        int var2 = 0;
        if (param0 >= -73) {
            this.e(84);
        }
        if (!(((wh) this).field_t >= ((wh) this).field_u)) {
            var2 = ((wh) this).field_t * (((wh) this).field_x / ((wh) this).field_u);
            var2 = var2 * mn.field_a >> -485024728;
            ((wh) this).field_m.f(var2 >> 1684914600);
        }
        ((wh) this).field_t = ((wh) this).field_t + 1;
    }

    private final void e(int param0) {
        int var3 = 0;
        int var2 = ((to) (Object) ((wh) this).field_m.field_h).field_i.length;
        if (!(((wh) this).field_m.g() < -(((wh) this).field_s << -1445971351) + var2)) {
            if (((wh) this).field_l < ((wh) this).field_s) {
                var3 = -(((wh) this).field_l * (((wh) this).field_x / ((wh) this).field_s)) + ((wh) this).field_x;
                var3 = var3 * mn.field_a >> 1863914568;
                ((wh) this).field_m.f(var3 >> -929222904);
            }
            ((wh) this).field_l = ((wh) this).field_l + 1;
        }
        if (param0 != 1681431816) {
            ((wh) this).field_k = -78;
        }
    }

    final void a(int param0, byte param1) {
        if (param1 != -4) {
            field_e = null;
        }
        ((wh) this).field_l = 0;
        ((wh) this).field_s = param0;
        ((wh) this).field_g = true;
    }

    public static void a(int param0) {
        if (param0 != 0) {
            wh.a(11);
        }
        field_h = null;
        field_p = null;
        field_v = null;
        field_e = null;
    }

    final void f(byte param0) {
        if (((wh) this).field_m.f()) {
            if (0 == ((wh) this).field_k) {
                ((wh) this).c((byte) -109);
            } else {
                this.a((byte) 99);
            }
        }
        if (param0 >= -124) {
            return;
        }
        if (((wh) this).field_o) {
            this.g((byte) -101);
        }
        if (((wh) this).field_g) {
            if (!(((wh) this).field_k != 0)) {
                this.e(1681431816);
            }
        }
    }

    final void a(int param0, int param1) {
        ((wh) this).field_k = param0;
        if (param1 != 0) {
            this.e(9);
        }
    }

    final int a(boolean param0) {
        if (param0) {
            field_h = null;
        }
        return ((wh) this).field_n;
    }

    wh(int param0, int param1, int param2, boolean param3, boolean param4) {
        ((wh) this).field_n = param0;
        ((wh) this).field_i = param1;
        ((wh) this).field_j = param3 ? true : false;
        ((wh) this).field_x = ((wh) this).field_i << 1681431816;
        ((wh) this).field_r = param4 ? true : false;
        ((wh) this).field_k = 1;
        ((wh) this).field_f = param2;
        this.a((byte) 99);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = true;
        field_w = 0;
        field_v = "<%0> is not a member, and cannot play with the current options.";
        field_h = "by win %";
        field_e = "auto-assign";
    }
}
