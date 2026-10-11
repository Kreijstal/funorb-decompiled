/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il extends l {
    private int field_f;
    private kg field_g;
    static dl field_e;
    static am[] field_h;

    final l a(int param0) {
        vh dupTemp$0 = null;
        vh dupTemp$1 = null;
        vh dupTemp$2 = null;
        int var2;
        int var3;
        int var4;
        int var5_int;
        pj var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var5_intLifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var7Lifetime2;
        var10 = CrazyCrystals.field_B;
        if (this.field_f != 0) {
          this.field_f = this.field_f - 1;
          return (l) (this);
        }
        var2 = 0;
        var3 = 0;
        var4 = 0;
        var5_int = 0;
        if (param0 != -2) {
          il.a(true);
        }
        while (var5_int < pd.field_g.length) {
          var6 = 10;
          var7 = pd.field_g[var5_int];
          if (var7 < 0) {
            var7 = -var7;
          }
          while (var7 >= 2000) {
            var7 = var7 / 10;
            var6 = var6 * 10;
          }
          if (var7 < 1000) {
            if (var7 >= 500) {
              var6 = var6 * 2;
            }
          } else {
            var6 = var6 * 5;
          }
          var7Lifetime2 = pd.field_g[var5_int];
          var8 = (131072 + (m.field_l[var5_int] * 16384 + 18)) / 37;
          if (var6 >= var7Lifetime2) {
            if (-var6 <= var7Lifetime2) {
              dupTemp$0 = q.field_a[ma.field_n[var5_int]];
              dupTemp$0.field_i = dupTemp$0.field_i + var7Lifetime2;
              var7Lifetime2 = 0;
            } else {
              var4++;
              dupTemp$1 = q.field_a[ma.field_n[var5_int]];
              dupTemp$1.field_i = dupTemp$1.field_i - var6;
              var3 = var3 + var8;
              var7Lifetime2 = var7Lifetime2 + var6;
              var9 = (-var7Lifetime2 - 1) / var6;
              if (var9 > var2) {
                var2 = var9;
              }
            }
          } else {
            var3 = var3 + var8;
            dupTemp$2 = q.field_a[ma.field_n[var5_int]];
            dupTemp$2.field_i = dupTemp$2.field_i + var6;
            var7Lifetime2 = var7Lifetime2 - var6;
            var4++;
            var9 = (-1 + var7Lifetime2) / var6;
            if (var2 < var9) {
              var2 = var9;
            }
          }
          pd.field_g[var5_int] = var7Lifetime2;
          this.a((byte) -95, var5_int);
          var5_int++;
        }
        if (0 < var4) {
          var5_intLifetime1 = 16 * gi.field_m;
          if (4 > var2) {
            var5_intLifetime1 = (int)(Math.pow(8.0, (double)(-var2 + 4) / 4.0) * (double)var5_intLifetime1);
          }
          var6Lifetime1 = var3 / var4;
          if (this.field_g == null) {
            this.field_g = kg.a(je.field_f, 150, var5_intLifetime1, var6Lifetime1);
            this.field_g.f(-1);
            tb.field_d.b(this.field_g);
          }
          this.field_g.c(var5_intLifetime1, var6Lifetime1);
          this.field_f = 2;
          return (l) (this);
        }
        tb.field_d.a(this.field_g);
        tb.field_d.a(dn.field_e, 100, 128 * gi.field_m, 8192);
        var5 = new pj(-1, 1);
        for (var6Lifetime2 = 0; var6Lifetime2 < pd.field_g.length; var6Lifetime2++) {
          var7Lifetime1 = q.field_a[ma.field_n[var6Lifetime2]].field_i;
          var8Lifetime1 = 0;
          while (var7Lifetime1 > 0) {
            var7Lifetime1 = var7Lifetime1 / 10;
            var8Lifetime1 += 9;
          }
          var9Lifetime1 = 9 + (m.field_l[var6Lifetime2] - 1);
          while (var8Lifetime1 >= 8) {
            kk.field_a[14][var9Lifetime1] = aj.field_s;
            var8Lifetime1 -= 15;
            var9Lifetime1--;
          }
          if (var8Lifetime1 >= 4) {
            kk.field_a[14][var9Lifetime1] = (f) ((Object) var5);
          }
        }
        return (l) ((Object) new o(60, new sm()));
    }

    private final void a(byte param0, int param1) {
        int var3 = 0;
        int var3Lifetime1;
        if (uo.field_o <= ke.field_b[jo.field_o] &&
          !(jo.field_o < 1)) {
          var3 = q.field_a[ma.field_n[param1]].field_i;
          if (1000 <= var3) {
            rc.a(1, fn.field_j, mb.field_g, 247, wd.field_j, 8, ob.field_l);
          }
          if (5000 <= var3) {
            rc.a(1, fn.field_j, mb.field_g, 246, wd.field_j, 9, ob.field_l);
          }
          if (var3 >= 20000) {
            rc.a(1, fn.field_j, mb.field_g, 245, wd.field_j, 10, ob.field_l);
          }
          if (50000 <= var3) {
            rc.a(1, fn.field_j, mb.field_g, 244, wd.field_j, 11, ob.field_l);
          }
          gh.j(-10935);
        }
        var3Lifetime1 = -7 % ((19 - param0) / 47);
    }

    final static boolean b(int param0) {
        if (param0 >= -108) {
          return false;
        }
        return hl.a(le.b((byte) -20), -94);
    }

    final void c(byte param0) {
        if (param0 < 123) {
          field_h = (am[]) null;
        }
        if (null != this.field_g) {
          tb.field_d.a(this.field_g);
        }
    }

    final l b(byte param0) {
        vh dupTemp$0 = null;
        int var3 = CrazyCrystals.field_B;
        if (null != this.field_g) {
          tb.field_d.a(this.field_g);
        }
        int var2 = 0;
        if (param0 != -90) {
          il.a(44, true, -68, -50, 65, false);
        }
        while (pd.field_g.length > var2) {
          dupTemp$0 = q.field_a[ma.field_n[var2]];
          dupTemp$0.field_i = dupTemp$0.field_i + pd.field_g[var2];
          this.a((byte) -94, var2);
          var2++;
        }
        return (l) ((Object) new sm());
    }

    public static void a(boolean param0) {
        field_h = null;
        if (param0) {
          return;
        }
        field_e = null;
    }

    il() {
        this.field_f = 0;
        this.field_g = null;
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, boolean param5) {
        if (param5) {
          field_h = (am[]) null;
        }
        dl[] var6 = h.field_d;
        if (param1) {
          var6 = af.field_c;
        }
        wi.a(param3, var6, param2, param0, (byte) -71, param4);
    }

    static {
        field_h = new am[4];
    }
}
