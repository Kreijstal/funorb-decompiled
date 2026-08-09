/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib extends rq {
    private float field_e;
    static int[][] field_g;
    private sk field_f;

    final void a(byte param0) {
        ut var2;
        ut var3;
        L0: {
          if (this.field_b.t(-80) != 0) {
            break L0;
          } else {
            var2 = this.field_b.H(26453);
            this.field_b.g(1, -128);
            var3 = this.field_b.B(0);
            var3.a(0, var2);
            var3.a(0.125f, 0.125f, -126, 1.0f);
            var3.a((byte) 96, this.field_e, 0.0f, 0.0f);
            this.field_b.a(ip.field_y, 28880);
            this.field_b.g(0, -122);
            break L0;
          }
        }
        if (param0 >= -47) {
          this.field_e = -0.03486540541052818f;
          return;
        } else {
          return;
        }
    }

    ib(aw param0, sk param1) {
        super(param0);
        this.field_e = 0.0f;
        try {
            this.field_f = param1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ib.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(byte param0) {
        if (param0 >= -8) {
            this.field_e = -0.8005875945091248f;
            return this.field_f.c(51);
        }
        return this.field_f.c(51);
    }

    public static void e(int param0) {
        if (param0 != 1) {
            ib.d(48);
            field_g = (int[][]) null;
            return;
        }
        field_g = (int[][]) null;
    }

    final void c(boolean param0) {
        this.field_b.g(1, -115);
        if (param0) {
          return;
        } else {
          this.field_b.a((byte) -83, vi.field_v, vi.field_v);
          this.field_b.a(jq.field_a, 0, 0);
          this.field_b.a(jq.field_a, 0, true);
          this.field_b.c(1, 110);
          this.field_b.a((ed) null, 95);
          this.field_b.g(0, -111);
          this.field_b.a(jq.field_a, 0, true);
          return;
        }
    }

    final void a(int param0, int param1, ed param2) {
        try {
            if (param1 != 18834) {
                this.field_f = (sk) null;
            }
            this.field_b.a(param2, 126);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ib.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0, int param1) {
        this.field_b.g(1, -119);
        this.field_b.a((byte) -83, lf.field_e, cv.field_F);
        this.field_b.a((byte) 111, 0, true, false, jq.field_a);
        this.field_b.a(ta.field_a, 0, true);
        this.field_b.c(0, param1 ^ 20151);
        this.field_b.g(0, -124);
        if (param1 != 20186) {
          this.field_f = (sk) null;
          this.field_b.a(false, -16777216);
          this.field_b.a(mm.field_h, 0, true);
          this.a((byte) -107);
          return;
        } else {
          this.field_b.a(false, -16777216);
          this.field_b.a(mm.field_h, 0, true);
          this.a((byte) -107);
          return;
        }
    }

    final static void d(int param0) {
        if (gk.field_o != null) {
          wr.a(true, gk.field_o);
          if (param0 == 1) {
            gk.field_o.a(false, lt.field_m);
            gk.field_o = null;
            if (vv.field_b != null) {
              vv.field_b.e(2);
              qn.field_f.requestFocus();
              return;
            } else {
              qn.field_f.requestFocus();
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        int var5;
        int var4;
        L0: {
          var5 = Sumoblitz.field_L ? 1 : 0;
          this.field_b.g(1, -117);
          if (param0 == 34023) {
            break L0;
          } else {
            this.a(43, 107, 112);
            break L0;
          }
        }
        if ((128 & param2) == 0) {
          if ((1 & param1) != 1) {
            if (!this.field_f.field_g) {
              this.field_b.a(this.field_f.field_d[0], 108);
              this.field_b.g(0, -113);
              return;
            } else {
              this.field_b.a(this.field_f.field_f, 126);
              this.field_b.g(0, -113);
              return;
            }
          } else {
            if (!this.field_f.field_g) {
              var4 = this.field_b.field_kc % 4000 * 16 / 4000;
              this.field_b.a(this.field_f.field_d[var4], 93);
              this.field_b.g(0, -113);
              return;
            } else {
              this.field_e = (float)(this.field_b.field_kc % 4000) / 4000.0f;
              this.field_b.a(this.field_f.field_f, 122);
              this.field_b.g(0, -113);
              return;
            }
          }
        } else {
          this.field_b.a((ed) null, 97);
          this.field_b.g(0, -113);
          return;
        }
    }

    final void a(boolean param0, byte param1) {
        if (param1 > -71) {
          this.a((byte) 54);
          this.field_b.a((byte) -83, lf.field_e, vi.field_v);
          return;
        } else {
          this.field_b.a((byte) -83, lf.field_e, vi.field_v);
          return;
        }
    }

    static {
    }
}
