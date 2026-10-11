/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf {
    static int field_c;
    private int field_e;
    private int field_a;
    static boolean field_j;
    private boolean field_k;
    private int field_h;
    int field_f;
    private int field_d;
    static int[] field_i;
    int field_g;
    static String field_b;
    private int field_l;

    final boolean d(byte param0) {
        boolean stackIn_8_0 = false;
        if (param0 >= 0) {
          return false;
        }
        stackIn_8_0 = (this.field_d != 0) || (this.field_a == 84) || (this.field_a == 83);
        return stackIn_8_0;
    }

    final boolean e(byte param0) {
        if (param0 > -25) {
          return true;
        }
        return 97 == this.field_a ? true : false;
    }

    final static o b(int param0) {
        int var4_int = 0;
        int var5 = SolKnight.field_L ? 1 : 0;
        int var1 = sa.field_l[0] * uj.field_b[0];
        byte[] var2 = jc.field_c[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var4_int < var1; var4_int++) {
          var3[var4_int] = ig.field_H[fi.a(255, (int) var2[var4_int])];
        }
        o var4 = new o(kl.field_a, we.field_e, ph.field_h[param0], qf.field_d[0], sa.field_l[0], uj.field_b[0], var3);
        og.a((byte) -97);
        return var4;
    }

    public static void a(byte param0) {
        field_b = null;
        int var1 = -18 / ((param0 + 23) / 53);
        field_i = null;
    }

    final static Boolean d(int param0) {
        if (param0 > -109) {
          return (Boolean) null;
        }
        Boolean var1 = n.field_b;
        n.field_b = null;
        return var1;
    }

    final void a(int param0, boolean param1) {
        this.field_d = 0;
        this.field_e = 0;
        this.field_a = 0;
        if (this.field_l == 0 &&
          el.field_n == 96) {
          if (0 >= this.field_f) {
            this.field_f = this.field_g;
          }
          this.field_f = this.field_f - 1;
          this.field_k = false;
        }
        if (0 == this.field_l) {
          this.field_a = el.field_n;
        }
        if (this.field_l == 0 &&
          97 == el.field_n) {
          this.field_f = this.field_f + 1;
          this.field_k = false;
          if (this.field_g <= this.field_f) {
            this.field_f = 0;
          }
        }
        if (this.field_l == 0 && (el.field_n == 98 ||
          el.field_n == 99)) {
          if (this.field_f < 0) {
            this.field_f = param0;
          }
          this.field_k = false;
        }
        if (param1) {
          this.field_a = -114;
        }
    }

    final static void b(boolean param0) {
        if (10 == fj.field_i ||
          !rd.b(6144)) {
          jd.n(-110);
          fj.field_i = 11;
        }
        ib.field_o = true;
        if (param0) {
          field_c = 51;
        }
    }

    final void a(boolean param0) {
        this.field_e = 0;
        this.field_d = 0;
        this.field_a = 0;
        if (0 == this.field_l &&
          el.field_n == 98) {
          if (0 >= this.field_f) {
            this.field_f = this.field_g;
          }
          this.field_k = false;
          this.field_f = this.field_f - 1;
        }
        if (this.field_l == 0) {
          this.field_a = el.field_n;
        }
        if (0 == this.field_l &&
          el.field_n == 99) {
          this.field_f = this.field_f + 1;
          this.field_k = false;
          if (this.field_f >= this.field_g) {
            this.field_f = 0;
          }
        }
        if (!param0) {
          this.field_l = 75;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 > -114) {
          sf.b(54);
        }
        if (param1 >= this.field_g) {
          throw new IllegalArgumentException();
        }
        if (param2 >= this.field_g) {
          throw new IllegalArgumentException();
        }
        this.field_d = 0;
        this.field_a = 0;
        this.field_e = 0;
        if (hg.field_F != 0) {
          this.field_e = hg.field_F;
          this.field_d = hg.field_F;
          this.field_f = param2;
          this.field_k = true;
          this.field_h = qa.field_k;
          this.field_l = hg.field_F;
        }
        if (this.field_l != 0 &&
          wb.field_c != 0) {
          if (0 >= this.field_h) {
            this.field_h = dh.field_i;
            this.field_e = this.field_l;
          }
          this.field_h = this.field_h - 1;
        }
        if (0 == hg.field_F &&
          wb.field_c == 0) {
          this.field_l = 0;
        }
        if (this.field_l == 0 && (this.field_k ||
          ne.field_d)) {
          if (param1 < 0) {
            if (this.field_k) {
              this.field_f = -1;
            }
          } else {
            if (param1 == this.field_f) {
            }
            this.field_f = param1;
            this.field_k = true;
          }
        }
    }

    final boolean a(int param0) {
        if (param0 <= 46) {
          return false;
        }
        return 0 != this.field_l ? true : false;
    }

    final void a(byte param0, int param1) {
        if (param0 != 111) {
          this.c(-3);
        }
        if (this.field_l == 0) {
          this.field_f = param1;
          this.field_k = false;
        }
    }

    final void b(byte param0) {
        int var2 = 57 / ((param0 - 45) / 60);
        this.field_e = 0;
        this.field_a = 0;
        this.field_d = 0;
        if (this.field_l == 0) {
          this.field_a = el.field_n;
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        this.field_l = 0;
        this.field_k = param0 ? true : false;
        if (param3 < 119) {
          return;
        }
        if (!this.field_k) {
          this.field_f = param1;
        } else {
          this.field_f = param2;
        }
    }

    final boolean f(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 != 0) {
          this.field_e = 92;
        }
        stackIn_8_0 = (this.field_e != 0) || (this.field_a == 84) || (this.field_a == 83);
        return stackIn_8_0;
    }

    final boolean e(int param0) {
        if (param0 != 12542) {
          this.field_h = -69;
        }
        return 103 == this.field_a ? true : false;
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        vg.field_I[kg.field_c] = param2;
        if (param1) {
          sf.b(32);
        }
        pd.field_e[kg.field_c] = kg.field_c;
        qg.field_c[kg.field_c] = param0;
        if (param0 > be.field_I) {
          dc.field_o = param0;
        }
        if (bb.field_G > param0) {
          bi.field_e = param0;
        }
        eh.field_a[kg.field_c] = param5;
        ld.field_M[kg.field_c] = param4;
        ma.field_n[kg.field_c] = param3;
        int var6 = param3 + (param4 + param5);
        int var7 = 0 != var6 ? param5 * 1000 / var6 : 0;
        l.field_a[kg.field_c] = var7;
        kg.field_c = kg.field_c + 1;
        if (!(dc.field_o >= var7)) {
          dc.field_o = var7;
        }
        if (bi.field_e > var7) {
          bi.field_e = var7;
        }
    }

    final boolean c(int param0) {
        if (param0 != 0) {
          this.field_a = 110;
        }
        return 96 == this.field_a ? true : false;
    }

    final boolean c(byte param0) {
        if (param0 != 11) {
          return true;
        }
        return 102 == this.field_a ? true : false;
    }

    sf(int param0) {
        this.field_k = false;
        this.field_f = 0;
        this.field_g = param0;
    }

    static {
        field_c = 0;
        field_j = true;
    }
}
