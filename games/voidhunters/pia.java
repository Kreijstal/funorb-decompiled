/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pia extends oda implements oo {
    private ita field_v;
    private htb field_w;
    static mma field_x;

    public static void e(int param0) {
        int var1 = -60 / ((-23 - param0) / 52);
        field_x = null;
    }

    final void d(int param0) {
        int var2 = 0;
        var2 = 250;
        if (param0 != 16777215) {
          return;
        } else {
          ((pia) this).field_v.a(-var2 + ((pia) this).field_h >> -1484965119, 140, 25, param0 + -16777214, ((pia) this).field_f + 20 - 25 >> 279984801);
          ((pia) this).field_w.a((-var2 + ((pia) this).field_h >> 2048248289) - -150, 100, 30, 1, (20 + (((pia) this).field_f - 30) >> 49025217) + 2);
          return;
        }
    }

    final void a(int param0, int param1, int param2, shb param3) {
        super.a(param0, param1, param2, param3);
        ((pia) this).field_w.field_x = ((pia) this).field_v.a(param2 ^ 782443887).a((byte) 35) == lea.field_o ? true : false;
    }

    pia(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (wwa) null);
        ((pia) this).field_v = new ita((wwa) (Object) new io(10000536), acb.field_p, 0, 0, 140, 25);
        ((pia) this).field_v.a(99, new wta());
        ((pia) this).field_w = new htb(tn.field_b, (sba) this);
        ((pia) this).field_u = new shb[]{(shb) (Object) ((pia) this).field_v, (shb) (Object) ((pia) this).field_w};
        ((pia) this).field_w.field_q = (wwa) (Object) new vva();
        ((pia) this).a(false);
    }

    final void b(int param0, int param1, int param2, int param3) {
        super.b(param0, param1, 80, param3);
        web.field_o.c(pea.field_c, 4 + (param0 - -((pia) this).field_g), 4 + param3 + (((pia) this).field_r - -web.field_o.field_k), 16777215, -1);
        if (param2 < 47) {
            Object var6 = null;
            ((pia) this).a(46, -102, -40, (htb) null, -107);
        }
    }

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        if (param0 == 11) {
          if (((pia) this).field_v.a(param0 ^ -782444209).a((byte) 35) != lea.field_o) {
            return;
          } else {
            seb.b(0, ((pia) this).field_v.e(-5), ((pia) this).field_v.c(true), ((pia) this).field_v.f(3476));
            return;
          }
        } else {
          ((pia) this).field_v = null;
          if (((pia) this).field_v.a(param0 ^ -782444209).a((byte) 35) != lea.field_o) {
            return;
          } else {
            seb.b(0, ((pia) this).field_v.e(-5), ((pia) this).field_v.c(true), ((pia) this).field_v.f(3476));
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new mma();
    }
}
