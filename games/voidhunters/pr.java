/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pr {
    static oma field_c;
    private fh field_h;
    private int field_e;
    private fh[] field_g;
    private long field_b;
    private fh field_a;
    private int field_f;
    static int field_d;

    final void a(fh param0, byte param1, long param2) {
        fh var5 = null;
        try {
            if (!(null == param0.field_d)) {
                param0.d((byte) -35);
            }
            var5 = this.field_g[(int)(param2 & (long)(this.field_f - 1))];
            param0.field_d = var5.field_d;
            param0.field_e = var5;
            if (param1 > -12) {
                field_d = -43;
            }
            param0.field_d.field_e = param0;
            param0.field_e.field_d = param0;
            param0.field_i = param2;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "pr.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final fh e(int param0) {
        fh var4 = null;
        int var5 = VoidHunters.field_G;
        if (null == this.field_a) {
            return null;
        }
        int var2 = 40 % ((param0 - -45) / 39);
        fh var3 = this.field_g[(int)((long)(this.field_f + -1) & this.field_b)];
        while (var3 != this.field_a) {
            if (!((this.field_a.field_i ^ -1L) != (this.field_b ^ -1L))) {
                var4 = this.field_a;
                this.field_a = this.field_a.field_e;
                return var4;
            }
            this.field_a = this.field_a.field_e;
        }
        this.field_a = null;
        return null;
    }

    public static void b(int param0) {
        if (param0 != 1) {
            pr.a(-20);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final fh d(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3 = 0;
        fh var4 = null;
        fh var8 = null;
        fh var11 = null;
        var3 = VoidHunters.field_G;
        if (param0 > (this.field_e ^ -1)) {
          if (this.field_h != this.field_g[-1 + this.field_e]) {
            var11 = this.field_h;
            this.field_h = var11.field_e;
            return var11;
          } else {
            L0: while (true) {
              if (this.field_f > this.field_e) {
                fieldTemp$2 = this.field_e;
                this.field_e = this.field_e + 1;
                var8 = this.field_g[fieldTemp$2].field_e;
                if (this.field_g[-1 + this.field_e] == var8) {
                  continue L0;
                } else {
                  this.field_h = var8.field_e;
                  return var8;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          L1: while (true) {
            if (this.field_f > this.field_e) {
              fieldTemp$3 = this.field_e;
              this.field_e = this.field_e + 1;
              var4 = this.field_g[fieldTemp$3].field_e;
              if (this.field_g[-1 + this.field_e] == var4) {
                continue L1;
              } else {
                this.field_h = var4.field_e;
                return var4;
              }
            } else {
              return null;
            }
          }
        }
    }

    final fh a(int param0, long param1) {
        fh var5 = null;
        int var6 = VoidHunters.field_G;
        this.field_b = param1;
        fh var4 = this.field_g[(int)(param1 & (long)(this.field_f + param0))];
        this.field_a = var4.field_e;
        while (this.field_a != var4) {
            if (this.field_a.field_i == param1) {
                var5 = this.field_a;
                this.field_a = this.field_a.field_e;
                return var5;
            }
            this.field_a = this.field_a.field_e;
        }
        this.field_a = null;
        return null;
    }

    final static void a(int param0) {
        gib.a((byte) -104);
        if (param0 != 17496) {
            return;
        }
        cea.a(-29, 4);
    }

    final fh c(int param0) {
        fh discarded$0 = null;
        this.field_e = 0;
        if (param0 >= -18) {
            discarded$0 = this.d(89);
            return this.d(-1);
        }
        return this.d(-1);
    }

    pr(int param0) {
        fh dupTemp$2 = null;
        int var2 = 0;
        fh var3 = null;
        this.field_e = 0;
        this.field_f = param0;
        this.field_g = new fh[param0];
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            dupTemp$2 = new fh();
            var3 = dupTemp$2;
            this.field_g[var2] = dupTemp$2;
            var3.field_d = var3;
            var3.field_e = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
    }
}
