/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    private int field_c;
    private int field_h;
    private int field_s;
    static cd field_l;
    private int field_f;
    private float field_m;
    private int field_b;
    private int field_j;
    private int field_a;
    private int field_q;
    private boolean field_n;
    private int field_p;
    private rg field_r;
    static hi field_o;
    private int field_k;
    private int field_e;
    private int field_g;
    static boolean field_d;
    private int field_i;

    final void e(int param0) {
        this.field_r.a(this.field_i, this.field_b, param0 ^ -122);
        if (param0 != 0) {
          this.a(89, -36, 56);
        }
    }

    final static void a(m param0, int param1, byte param2) {
        hb var3 = null;
        if (param2 > -90) {
          return;
        }
        try {
          var3 = gf.field_c;
          var3.b(true, param1);
          var3.b(param0.field_g, -49152);
          var3.b(param0.field_j, -49152);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "oe.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        this.field_f = param2;
        this.field_j = param1;
        if (param0 >= -97) {
          this.field_i = -44;
        }
    }

    final void b(int param0) {
        int fieldTemp$0 = 0;
        if (null != ba.field_f) {
          return;
        }
        if (af.field_c <= 0) {
          this.field_n = false;
        }
        if (!this.field_n) {
          if (this.field_j <= ub.field_b) {
            if (this.field_j > 0) {
              ue.field_D = 0;
            }
          } else {
            ue.field_D = (-ub.field_b + this.field_j) / 2;
          }
          if (ub.field_b != this.field_p) {
            this.field_r.a(this.field_q, this.field_p, -116);
          } else {
            if (this.field_q != lb.field_z) {
              this.field_r.a(this.field_q, this.field_p, -116);
            }
          }
          return;
        }
        if (param0 >= -40) {
          return;
        }
        fieldTemp$0 = this.field_k - 1;
        this.field_k = this.field_k - 1;
        if (fieldTemp$0 > 0) {
          return;
        }
        this.field_k = this.field_c;
        if (this.field_h > gb.field_i) {
          this.field_n = false;
        } else {
          this.a(363);
        }
        return;
    }

    final boolean c(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -1) {
          return false;
        }
        stackIn_6_0 = (this.field_h <= gb.field_i) && (af.field_c > 0);
        return stackIn_6_0;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var1_intLifetime1;
        try {
          ne.field_c.a(true);
          for (var1_int = 0; var1_int < 32; var1_int++) {
            dl.field_a[var1_int] = 0L;
          }
          if (param0 <= 100) {
            oe.d(-61);
          }
          for (var1_intLifetime1 = 0; var1_intLifetime1 < 32; var1_intLifetime1++) {
            ve.field_w[var1_intLifetime1] = 0L;
          }
          bg.field_E = 0;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "oe.F(" + param0 + ')');
        }
    }

    public static void d(int param0) {
        if (param0 != -12248) {
          field_d = true;
        }
        field_o = null;
        field_l = null;
    }

    private final void a(int param0) {
        int var2;
        int var3;
        int var5;
        int var4;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = this.field_j;
        var3 = this.field_f;
        if (param0 != 363) {
          this.field_r = (rg) null;
        }
        if (!this.c(-1)) {
          this.field_n = false;
          return;
        }
        if (var3 > this.field_e) {
          var3 = this.field_e;
        } else {
          if (var3 < this.field_s) {
            var3 = this.field_s;
          }
        }
        if (this.field_g < var2) {
          var2 = this.field_g;
        } else {
          if (var2 < this.field_a) {
            var2 = this.field_a;
          }
        }
        if (this.field_m > 0.0f) {
          var4 = (int)(0.5f + (float)var3 * this.field_m);
          if (var4 > var2) {
            var3 = (int)((float)var2 / this.field_m);
          } else {
            if (var2 > var4) {
              var2 = var4;
            }
          }
        }
        if (ub.field_b != var2 ||
          var3 != lb.field_z) {
          this.field_r.a(var3, var2, -121);
        }
        if (this.field_j > 0) {
          ue.field_D = (-ub.field_b + this.field_j) / 2;
        }
    }

    private oe() throws Throwable {
        throw new Error();
    }

    static {
        field_l = new cd("email");
        field_o = new hi();
        field_d = false;
    }
}
