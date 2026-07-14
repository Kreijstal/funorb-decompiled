/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rka extends ida {
    private nq field_t;

    final boolean c(byte param0) {
        ad var2 = null;
        int var3 = 0;
        var2 = ((rka) this).field_p.a(-27449, ((rka) this).field_s);
        ((rka) this).field_n = ((rka) this).field_n + 1;
        if (((rka) this).field_n + 1 >= 0) {
          var3 = 119 % ((71 - param0) / 47);
          if (((rka) this).field_q >= ((rka) this).field_n) {
            var2 = ((rka) this).field_p.a(-27449, ((rka) this).field_s);
            var2.field_r = (-((rka) this).field_n + ((rka) this).field_q * 2) * (((rka) this).field_j << 1950001264) * ((rka) this).field_n / (((rka) this).field_q * ((rka) this).field_q);
            var2.field_o = ((rka) this).field_n * ((((rka) this).field_l << -111078384) * (((rka) this).field_q * 2 - ((rka) this).field_n)) / (((rka) this).field_q * ((rka) this).field_q);
            return false;
          } else {
            this.e((byte) -115);
            return true;
          }
        } else {
          return false;
        }
    }

    private final void e(byte param0) {
        ad var2 = ((rka) this).field_p.a(-27449, ((rka) this).field_s);
        ((rka) this).field_s.a(132, ((rka) this).field_t.a(-27449, ((rka) this).field_s), ((rka) this).field_r, ((rka) this).field_k, var2);
        var2.b(false);
        var2.field_r = 0;
        int var3 = 54 % ((param0 - 23) / 63);
        var2.field_k = 0;
        var2.field_o = 0;
    }

    rka(gj param0, nq param1, nq param2, int param3, int param4) {
        super(param0, param1, param3, param4);
        ((rka) this).field_t = param2;
        ((rka) this).a(((rka) this).field_k, ((rka) this).field_r, 27230);
        ((rka) this).field_q = 30 * ((rka) this).field_r;
    }

    static {
    }
}
