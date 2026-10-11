/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rka extends ida {
    private nq field_t;

    final boolean c(byte param0) {
        ad var2 = this.field_p.a(-27449, this.field_s);
        int fieldTemp$0 = this.field_n + 1;
        this.field_n = this.field_n + 1;
        if (fieldTemp$0 < 0) {
          return false;
        }
        int var3 = 119 % ((71 - param0) / 47);
        if (this.field_q < this.field_n) {
          this.e((byte) -115);
          return true;
        }
        var2 = this.field_p.a(-27449, this.field_s);
        var2.field_r = (-this.field_n + this.field_q * 2) * (this.field_j << 16) * this.field_n / (this.field_q * this.field_q);
        var2.field_o = this.field_n * ((this.field_l << 16) * (this.field_q * 2 - this.field_n)) / (this.field_q * this.field_q);
        return false;
    }

    private final void e(byte param0) {
        ad var2 = this.field_p.a(-27449, this.field_s);
        this.field_s.a(132, this.field_t.a(-27449, this.field_s), this.field_r, this.field_k, var2);
        var2.b(false);
        var2.field_r = 0;
        int var3 = 54 % ((param0 - 23) / 63);
        var2.field_k = 0;
        var2.field_o = 0;
    }

    rka(gj param0, nq param1, nq param2, int param3, int param4) {
        super(param0, param1, param3, param4);
        try {
          this.field_t = param2;
          this.a(this.field_k, this.field_r, 27230);
          this.field_q = 30 * this.field_r;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "rka.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
