/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf extends km {
    static long field_u;
    private int field_v;
    static tp field_t;
    static int[] field_r;
    static mh field_s;

    final int b(int param0, int param1) {
        if (param1 != 1) {
          return -54;
        }
        int var3 = this.field_m[param0].field_f;
        if (this.field_m.length == 2 ||
          8 != var3) {
          return this.field_p;
        }
        return this.field_q + this.field_p;
    }

    final void b(boolean param0) {
        int var5_int = 0;
        int var2;
        int var3;
        int var4;
        q var4_ref_q;
        q var5;
        q var6;
        int var6_int;
        int var7;
        String var8;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var7 = BrickABrac.field_J ? 1 : 0;
        if (this.field_m.length != 2) {
          var2 = 0;
          for (var3 = 0; var3 < 2; var3++) {
            var4_ref_q = this.field_m[var3];
            var8 = ag.field_D[var4_ref_q.field_f];
            var6_int = 30 + nn.field_g.c(var8);
            if (var6_int > var2) {
              var2 = var6_int;
            }
          }
          var3Lifetime1 = 10 + 2 * var2;
          var4 = (640 - var3Lifetime1) / 2;
          for (var5_int = 0; var5_int < 2; var5_int++) {
            var6 = this.field_m[var5_int];
            var6.field_c = var4;
            var6.field_a = this.b(var5_int, 1);
            var6.field_j = var2;
            var6.field_d = this.b((byte) -30, var5_int);
            var4 = var4 + (10 + var6.field_j);
          }
          var2Lifetime1 = 30 + nn.field_g.c(this.e((byte) 111));
          var4Lifetime1 = (-var2Lifetime1 + 640) / 2;
          var5 = this.field_m[2];
          var5.field_c = var4Lifetime1;
          var5.field_a = this.b(2, 1);
          var5.field_j = var2Lifetime1;
          var5.field_d = this.b((byte) -86, 2);
        } else {
          this.e(2);
        }
        if (!param0) {
          field_r = (int[]) null;
        }
    }

    final void a(boolean param0, int param1, int param2) {
        super.a(param0, param1, 121);
        if (param2 <= 96) {
          return;
        }
        ch.field_h = null;
    }

    final void a(boolean param0, boolean param1, int param2) {
        super.a(param0, param1, -94);
        if (og.h(-26090)) {
          return;
        }
        if (param2 >= -52) {
          return;
        }
        if (ch.field_h == null) {
          ch.field_h = gf.a(7, 0, 10, (byte) -114);
        }
    }

    final static void a(pb param0, int param1, int param2, jp param3, int param4, int param5) {
        try {
          fc.a(-59, param0.field_p);
          if (param5 < 39) {
            lf.a(true, 49, true);
          }
          lb.g(0, 0, param0.field_i, param0.field_q, kg.field_i[param4], 16777215);
          param3.b((-param3.field_x + param0.field_i) / 2 - 50 / param1, -(189 / param1) + (-param3.field_z + param0.field_q) + param2, 55, 83);
          sc.b(-94);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "lf.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void d(byte param0) {
        ch.field_h = null;
        if (param0 != 79) {
          field_s = (mh) null;
        }
    }

    final static void a(byte param0, boolean param1) {
        ag.a((byte) -16, false, param1);
        if (param0 >= -61) {
          field_r = (int[]) null;
        }
    }

    lf() {
        super(6, 38, 460, 402, 35, td.field_s);
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        String[] var8;
        String[] var9;
        int var6Lifetime1;
        this.field_v = 0;
        qo.field_N = 10 + ob.field_D.c("10. ");
        var8 = new String[]{so.field_e, vl.field_c, be.field_e, hj.field_Vb, jg.field_p};
        var9 = var8;
        var2 = nn.field_g.c(nm.a((CharSequence[]) ((Object) var9), true));
        var3 = 582;
        var4 = 182;
        var5 = (-var4 + (var3 - var2)) / 5;
        mf.field_d = new int[var8.length];
        if (var5 < 0) {
          var5 = 0;
        }
        for (var6 = 0; var6 < mf.field_d.length; var6++) {
          mf.field_d[var6] = var5 + nn.field_g.c(var8[var6]);
          if (0 < var6) {
            mf.field_d[var6] = mf.field_d[var6] + mf.field_d[var6 - 1];
          }
        }
        for (var6Lifetime1 = 0; mf.field_d.length > var6Lifetime1; var6Lifetime1++) {
          mf.field_d[var6Lifetime1] = mf.field_d[var6Lifetime1] + var4;
        }
    }

    final static void f(int param0) {
        if (param0 != -1) {
          jp var2 = (jp) null;
          lf.a((pb) null, -117, -10, (jp) null, -120, 52);
        }
        ag.f((byte) 122);
    }

    final static void a(boolean param0, int param1, boolean param2) {
        if (param1 >= -51) {
          lf.a((byte) -69, false);
        }
        if (param2) {
          lb.d(0, 0, lb.field_c, lb.field_d, 0, 192);
        } else {
          lb.d();
        }
        wc.a(param2, -1);
    }

    final boolean a(int param0, boolean param1, byte param2) {
        int var4;
        q var5;
        int var6;
        int var7;
        int var8;
        var8 = BrickABrac.field_J ? 1 : 0;
        var4 = 0;
        var5 = this.field_m[param0];
        var6 = var5.field_f;
        var7 = var6;
        if (var7 != 17) {
          if (18 != var7) {
            return super.a(param0, param1, (byte) 123);
          }
          if (this.field_h.a((byte) 113)) {
            this.field_v = 1;
            this.b(true, param0);
            var4 = 1;
          }
        } else {
          if (this.field_h.a((byte) 113)) {
            this.field_v = 0;
            this.b(true, param0);
            var4 = 1;
          }
        }
        if (param2 != 123) {
          this.a(49, -67, '￩');
        }
        return var4 != 0;
    }

    final void b(byte param0) {
        int var8 = 0;
        int var2;
        int var3;
        Object var4;
        String[] var5;
        int[] var6;
        int var7;
        int var9;
        int var2Lifetime1;
        int var3Lifetime1;
        Object var4Lifetime1;
        var9 = BrickABrac.field_J ? 1 : 0;
        super.b((byte) -101);
        im.a(550, 5, 243, 5, 140, (byte) -62, 45);
        al.a(this.field_a, 19);
        this.a(0);
        if (og.h(-26090)) {
          bo.a((byte) 97, na.field_N);
          return;
        }
        var2 = 149 + nn.field_g.field_B;
        var3 = 0;
        nn.field_g.c(ae.field_i, 66, var2, var3, -1);
        nn.field_g.a(so.field_e, mf.field_d[0], var2, var3, -1);
        nn.field_g.a(vl.field_c, mf.field_d[1], var2, var3, -1);
        if (param0 >= -14) {
          this.a(false, true, 9);
        }
        nn.field_g.a(be.field_e, mf.field_d[2], var2, var3, -1);
        nn.field_g.a(hj.field_Vb, mf.field_d[3], var2, var3, -1);
        nn.field_g.a(jg.field_p, mf.field_d[4], var2, var3, -1);
        var2Lifetime1 = 149 + (nn.field_g.field_B + nn.field_g.field_P) * 5 / 2;
        var4 = null;
        if (ch.field_h != null &&
          ch.field_h.field_v) {
          if (null == ch.field_h.field_r) {
            var4Lifetime1 = rn.field_d;
          } else {
            var4Lifetime1 = ef.field_f;
            var5 = ch.field_h.field_r[this.field_v];
            var6 = ch.field_h.field_u[this.field_v];
            var7 = 0;
            for (var8 = 0; var8 < 10; var8++) {
              if (var5[var8] != null) {
                var3Lifetime1 = 2;
                if (ci.a(var5[var8], -15)) {
                  var3Lifetime1 = 1;
                  var7 = 1;
                }
                if (0 == (1 & var8)) {
                  lb.d(50, -15 + var2Lifetime1, 540, 18, 16777215, 16);
                }
                var4Lifetime1 = null;
                i.a(var6[4 * var8 + 3], var2Lifetime1, var5[var8], var6[var8 * 4 + 1], var6[4 * var8], var3Lifetime1, -1, var6[var8 * 4 + 2], var8);
              }
              var2Lifetime1 += 18;
            }
            if (var7 == 0) {
              i.a(ch.field_h.field_j, var2Lifetime1, tb.field_cb, ch.field_h.field_l, ch.field_h.field_n, 1, -1, ch.field_h.field_k, -1);
            }
          }
        } else {
          var4Lifetime1 = kd.field_a;
        }
        if (var4Lifetime1 != null) {
          bo.a((byte) 119, (String) (var4Lifetime1));
        }
        return;
    }

    final void d(int param0) {
        this.a(se.field_j, 0);
        this.b(true, 0);
        if (param0 >= -60) {
          this.field_v = -47;
        }
    }

    final void a(int param0, int param1, char param2) {
        int var5;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (this.field_m.length != 2) {
          if (96 == param1) {
            if (this.field_h.field_j <= 0) {
              this.field_h.a(false, 1);
            } else {
              if (this.field_h.field_j != 2) {
                this.field_h.a(false, 0);
              }
            }
          }
          if (param1 == 97) {
            if (this.field_h.field_j != 1) {
              if (this.field_h.field_j != 2) {
                this.field_h.a(false, 1);
              }
            } else {
              this.field_h.a(false, 0);
            }
          }
          if (param1 == 99) {
            if (0 > this.field_h.field_j) {
              this.field_h.a(false, this.field_v);
            } else {
              if (1 < this.field_h.field_j) {
                this.field_h.a(false, this.field_v);
              } else {
                this.field_h.a(false, 2);
              }
            }
          }
          if (param1 == 98) {
            if (this.field_h.field_j != 2) {
              this.field_h.a(false, 2);
            } else {
              this.field_h.a(false, this.field_v);
            }
          }
          this.field_h.d((byte) -124);
        } else {
          this.field_h.a(0, -1);
        }
        if (param0 != -120) {
          lf.f(0);
        }
    }

    public static void g(int param0) {
        field_r = null;
        field_t = null;
        field_s = null;
        if (param0 >= -65) {
          field_u = 26L;
        }
    }

    static {
    }
}
