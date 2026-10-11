/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class im extends bb {
    private int field_F;
    private int field_I;
    private int field_H;
    static gq field_J;
    private int field_G;
    private int field_M;
    private int field_K;
    static vg field_L;
    static int field_E;

    void b(int param0, int param1, byte param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var12Lifetime1;
        int var13Lifetime1;
        var16 = Torquing.field_u;
        ph.a(param1 + 6, 35 + param0, this.field_p - 12, this.field_o - 40, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        if (param2 >= -16) {
          im.l(98);
        }
        var7 = 0;
        var8 = param0;
        while (var4 > var7) {
          if (var8 >= ph.field_c &&
            ph.field_h > var8) {
            var9 = var5 + (-var5 + var6) * var7 / var4;
            var10 = 0;
            var11 = this.field_p;
            if (var7 <= 20) {
              while (var10 <= 20) {
                var12 = (-var7 + 20) * (-var7 + 20) + (20 - var10) * (20 - var10);
                if (var12 <= 462) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = (462 - var12) * var9 / 42;
                  var13 = var13 | (var13 << 8 | var13 << 16);
                  ph.field_e[var10 + (param1 + var8 * ph.field_j)] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              for (var13Lifetime1 = 0; var13Lifetime1 <= 20; var13Lifetime1++) {
                var14 = (-var7 + 20) * (-var7 + 20) + var13Lifetime1 * var13Lifetime1;
                if (var14 <= 462) {
                  if (420 <= var14) {
                    var15 = (462 - var14) * var9 / 42;
                    var15 = var15 | (var15 << 8 | var15 << 16);
                    ph.field_e[param1 + (var8 * ph.field_j + var11)] = var15;
                  } else {
                    var12Lifetime1 = 1 + var11;
                  }
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 16 | var9 << 8);
            ph.b(var10 + param1, var8, -var10 + var11, var9);
          }
          var7++;
          var8++;
        }
        var4Lifetime1 = 22;
        var5Lifetime1 = 194;
        var6Lifetime1 = 169;
        var7Lifetime1 = 0;
        var8Lifetime1 = 35 + param0;
        while (var4Lifetime1 > var7Lifetime1) {
          var9Lifetime1 = (-var5Lifetime1 + var6Lifetime1) * var7Lifetime1 / var4Lifetime1 + var5Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 16 | var9Lifetime1 << 8);
          ph.b(param1, var8Lifetime1, 6, var9Lifetime1);
          ph.b(param1 + this.field_p - 6, var8Lifetime1, 6, var9Lifetime1);
          var7Lifetime1++;
          var8Lifetime1++;
        }
        rp.field_h.d(param1 + this.field_p - 90, 10 + param0);
        hg.a(false, param1 + 5, this.field_p - 10, 35 + param0, hh.field_b);
        hg.a(false, param1, this.field_p, -22 + (param0 + this.field_o), vf.field_i);
        var5Lifetime2 = 169;
        var4Lifetime2 = this.field_o - 79;
        var6Lifetime2 = 127;
        var7Lifetime2 = 0;
        var8Lifetime2 = 57 + param0;
        while (var4Lifetime2 > var7Lifetime2) {
          var9Lifetime2 = var5Lifetime2 + var7Lifetime2 * (var6Lifetime2 - var5Lifetime2) / var4Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 16 | var9Lifetime2 << 8);
          ph.b(param1, var8Lifetime2, 6, var9Lifetime2);
          ph.b(param1 + this.field_p - 6, var8Lifetime2, 6, var9Lifetime2);
          var7Lifetime2++;
          var8Lifetime2++;
        }
    }

    final void b(int param0, byte param1, int param2, int param3) {
        if (0 >= param2) {
          this.a(param3, (byte) -25, param0);
          return;
        }
        this.field_H = param0;
        this.field_M = this.field_o;
        if (param1 != -15) {
          im.l(59);
        }
        this.field_I = this.field_p;
        this.field_G = param3;
        this.field_K = param2;
        this.field_F = 0;
    }

    boolean a(byte param0) {
        if (param0 < 114) {
          im.k(81);
        }
        this.j(0);
        return super.a((byte) 122);
    }

    final static boolean l(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 169) {
          return false;
        }
        stackIn_6_0 = (w.field_G != null) && (null != w.field_G.a(0));
        return stackIn_6_0;
    }

    void j(int param0) {
        if (this.field_K <= 0) {
          return;
        }
        this.a(this.field_G, (byte) -25, this.field_H);
        this.field_K = param0;
        this.g((byte) 126);
    }

    void g(byte param0) {
        if (param0 < 122) {
          this.field_I = -51;
        }
    }

    im(ln param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_F = 0;
        this.field_K = 0;
    }

    boolean h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (0 < this.field_K) {
          var2 = this.field_G;
          var3 = this.field_H;
          fieldTemp$0 = this.field_F + 1;
          this.field_F = this.field_F + 1;
          if (this.field_K <= fieldTemp$0) {
            this.field_K = 0;
            this.g((byte) 124);
          } else {
            var4 = this.field_F * (2 * this.field_K - this.field_F);
            var5 = this.field_K * this.field_K;
            var2 = (this.field_G - this.field_I) * var4 / var5 + this.field_I;
            var3 = this.field_M + (this.field_H - this.field_M) * var4 / var5;
          }
          this.a(var2, (byte) -25, var3);
        }
        if (param0 != -7) {
          this.field_H = -80;
        }
        return super.h(param0 ^ 0);
    }

    public static void k(int param0) {
        field_J = null;
        if (param0 >= -74) {
          return;
        }
        field_L = null;
    }

    static {
        field_J = new gq(3);
        field_L = new vg();
        field_E = -1;
    }
}
