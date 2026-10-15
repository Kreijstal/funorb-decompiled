/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ld extends km {
    static int[] field_w;
    static String field_r;
    static boolean field_u;
    static int field_t;
    static boolean field_s;
    static int[][] field_v;

    abstract int f(int param0);

    final void b(boolean param0) {
        int var7 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        q var8;
        int var9;
        int var4Lifetime1;
        int var5Lifetime1;
        var9 = BrickABrac.field_J ? 1 : 0;
        if (sj.field_c == null) {
          return;
        }
        var2 = 1;
        var3 = nn.field_g.c(ag.field_D[this.field_m[0].field_f]);
        if (this.a((byte) 110, 1)) {
          var2++;
          for (var4 = 0; var4 < sj.field_c.length; var4++) {
            var5 = nn.field_g.c(sj.field_c[var4]);
            if (var5 > var3) {
              var3 = var5;
            }
          }
        }
        var3 += 20;
        if (!param0) {
          ld.g(102);
        }
        var4Lifetime1 = 5 * var2 - (5 - var2 * var3);
        var5Lifetime1 = (-var4Lifetime1 + 640) / 2;
        var6 = this.h(6175);
        for (var7 = 0; var7 < this.field_m.length; var7++) {
          var8 = this.field_m[var7];
          var8.field_c = var7 * var3 + var5Lifetime1 + 5 * var7;
          var8.field_a = var6;
          if (0 == var7) {
            var8.field_c = var8.field_c - 5;
          }
          var8.field_j = var3;
          var8.field_d = this.b((byte) 115, var7);
        }
        return;
    }

    final void b(byte param0) {
        jp[] stackIn_27_0 = null;
        int var2;
        int var3;
        int var4;
        int var5;
        tp var5_ref_tp;
        int var6;
        int var7;
        int var8;
        int var9;
        jp var10;
        int var11;
        jp var12;
        var11 = BrickABrac.field_J ? 1 : 0;
        if (null != ec.field_Q) {
          ec.field_Q.a(true, 0, 0, 0, 0);
        }
        lb.b(0, 0, 640, 480);
        gh.a(120, true);
        if (wk.field_p) {
          var12 = qh.field_e;
          var12.c((640 - var12.field_x) / 2, 20);
        }
        var2 = -qp.field_e[0].field_h + 480;
        var3 = this.f(-6);
        for (var4 = 0; var4 < 3; var4++) {
          var5_ref_tp = qp.field_e[var4];
          var5_ref_tp.a((640 - var5_ref_tp.field_f) / 2, -((-var3 + 480) / ((1 + var4) * 2)) + var2);
        }
        if (param0 > -14) {
          field_s = false;
        }
        var2 = var2 - (-var3 + 480) / 2;
        var4 = qp.field_e[0].field_f;
        var5 = 0;
        var6 = 0;
        L5: while (true) {
          if (pi.field_o.length > var6) {
            var7 = pi.field_o[var6];
            if (0 <= var7) {
              var8 = 320;
              var9 = var2;
              if (sk.field_I != 2) {
                switch (var5) {
                  case 0:
                    var9 += 14;
                    break;
                  case 1:
                    var9 += 38;
                    var8 = var8 - (-10 + var4 / 3);
                    break;
                  case 2:
                    var8 = var8 + (var4 / 3 - 10);
                    var9 += 50;
                    break;
                  default:
                    break;
                }
              } else {
                if (var5 != 0) {
                  var9 += 35;
                  var8 = var8 - (var4 / 4 - 5);
                } else {
                  var9 += 14;
                  var8 = var8 + (-6 + var4 / 4);
                }
              }
              if (var5 != 0) {
                stackIn_27_0 = e.field_q;
              } else {
                stackIn_27_0 = cl.field_r;
              }
              var10 = stackIn_27_0[da.field_C[var7]];
              var10.c(var8 - var10.field_x / 2, var9 - var10.field_z);
              ce.field_e.b(fh.field_h[var7], var8, var2 + 85, 0, -1);
              var5++;
              if (var5 == 3) {
                break L5;
              }
            }
            var6++;
            continue;
          }
          break;
        }
        this.a(0);
        pg.d(0);
        return;
    }

    ld(int param0, int[] param1) {
        super(param0, 180, 460, 150, 35, param1);
    }

    final void a(boolean param0, int param1, int param2) {
        if (param2 < 96) {
          this.f(66);
        }
        super.a(param0, param1, 100);
        this.b(true);
    }

    void a(int param0, int param1, char param2) {
        if (param0 != -120) {
          field_w = (int[]) null;
        }
        this.field_h.a(0, -1);
    }

    private final int h(int param0) {
        if (param0 != 6175) {
          return 116;
        }
        return (284 + this.f(param0 - 6181)) / 2;
    }

    final void a(boolean param0, boolean param1, int param2) {
        int var5 = 0;
        int var6 = BrickABrac.field_J ? 1 : 0;
        if (param2 > -52) {
          this.a(false, false, -123);
        }
        super.a(param0, param1, -121);
        int var4 = this.h(6175);
        for (var5 = 0; var5 < this.field_m.length; var5++) {
          this.field_m[var5].field_a = var4;
        }
    }

    public static void g(int param0) {
        if (param0 != -25617) {
          return;
        }
        field_r = null;
        field_w = null;
        field_v = (int[][]) null;
    }

    static {
        field_r = "Hotseat multiplayer game";
        field_s = true;
    }
}
