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
          this.field_v.a(-var2 + this.field_h >> -1484965119, 140, 25, param0 + -16777214, this.field_f + 20 - 25 >> 279984801);
          this.field_w.a((-var2 + this.field_h >> 2048248289) - -150, 100, 30, 1, (20 + (this.field_f - 30) >> 49025217) + 2);
          return;
        }
    }

    final void a(int param0, int param1, int param2, shb param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_w.field_x = this.field_v.a(param2 ^ 782443887).a((byte) 35) == lea.field_o ? true : false;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "pia.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    pia(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (wwa) null);
        this.field_v = new ita(new io(10000536), acb.field_p, 0, 0, 140, 25);
        this.field_v.a(99, new wta());
        this.field_w = new htb(tn.field_b, (sba) (this));
        this.field_u = new shb[]{(shb) ((Object) this.field_v), (shb) ((Object) this.field_w)};
        this.field_w.field_q = (wwa) ((Object) new vva());
        this.a(false);
    }

    final void b(int param0, int param1, int param2, int param3) {
        super.b(param0, param1, 80, param3);
        web.field_o.c(pea.field_c, 4 + (param0 - -this.field_g), 4 + param3 + (this.field_r - -web.field_o.field_k), 16777215, -1);
        if (param2 < 47) {
            htb var6 = (htb) null;
            this.a(46, -102, -40, (htb) null, -107);
        }
    }

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        if (param0 != 11) {
            this.field_v = (ita) null;
        }
        if (this.field_v.a(param0 ^ -782444209).a((byte) 35) != lea.field_o) {
            return;
        }
        try {
            seb.b(0, this.field_v.e(-5), this.field_v.c(true), this.field_v.f(3476));
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "pia.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    static {
        field_x = new mma();
    }
}
