/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bv extends jea {
    static long[] field_xb;
    private jea field_tb;
    private jea[] field_vb;
    private jea[] field_ub;
    int field_wb;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((bv) this).field_t = param5;
        if (param4 != -25436) {
            bv.d((byte) 19);
        }
        ((bv) this).field_T = param3;
        ((bv) this).field_G = param2;
        ((bv) this).field_qb = param6;
        this.b(param1, 32, param0);
    }

    final static void d(byte param0) {
        tra.g((byte) -113);
        int var1 = -34 % ((10 - param0) / 47);
    }

    final void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          var2 = 0;
          if (param0 < -97) {
            break L0;
          } else {
            ((bv) this).field_wb = -14;
            break L0;
          }
        }
        L1: while (true) {
          if (var2 >= ((bv) this).field_ub.length) {
            return;
          } else {
            if (var2 != ((bv) this).field_wb) {
              if (((bv) this).field_ub[var2].field_y != 0) {
                ((bv) this).field_ub[((bv) this).field_wb].field_cb = false;
                ((bv) this).field_vb[((bv) this).field_wb].field_qb = ((bv) this).field_vb[((bv) this).field_wb].field_qb + 10000;
                ((bv) this).field_wb = var2;
                ((bv) this).field_ub[var2].field_cb = true;
                ((bv) this).field_vb[var2].field_qb = ((bv) this).field_vb[var2].field_qb - 10000;
                var2++;
                continue L1;
              } else {
                var2++;
                continue L1;
              }
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (param1 == 32) {
            break L0;
          } else {
            field_xb = null;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= ((bv) this).field_ub.length) {
            ((bv) this).field_tb.a(((bv) this).field_G, ((bv) this).field_t - param2, -23776, param2, 0);
            var8 = 0;
            var4 = var8;
            L2: while (true) {
              if (var8 >= ((bv) this).field_vb.length) {
                return;
              } else {
                ((bv) this).field_vb[var8].a(((bv) this).field_tb.field_G + -(param0 * 2), -(param0 * 2) + ((bv) this).field_tb.field_t, -23776, param0, param0);
                if (((bv) this).field_wb != var8) {
                  ((bv) this).field_vb[var8].field_qb = ((bv) this).field_vb[var8].field_qb + 10000;
                  var8++;
                  continue L2;
                } else {
                  var8++;
                  continue L2;
                }
              }
            }
          } else {
            var5 = var4 * ((bv) this).field_G / ((bv) this).field_ub.length;
            var6 = (var4 - -1) * ((bv) this).field_G / ((bv) this).field_ub.length;
            ((bv) this).field_ub[var4].field_qb = var5;
            ((bv) this).field_ub[var4].field_T = 0;
            ((bv) this).field_ub[var4].field_G = -var5 + var6;
            ((bv) this).field_ub[var4].field_t = param2;
            var4++;
            continue L1;
          }
        }
    }

    public static void f(int param0) {
        field_xb = null;
        if (param0 != 0) {
            bv.f(30);
        }
    }

    bv(long param0, jea param1, String[] param2, jea param3, jea[] param4, int param5) {
        super(param0, (jea) null);
        int var8 = 0;
        jea var9 = null;
        ((bv) this).field_ub = new jea[param2.length];
        ((bv) this).field_tb = new jea(0L, param3);
        ((bv) this).field_vb = param4;
        for (var8 = 0; var8 < param2.length; var8++) {
            var9 = new jea(0L, param1);
            var9.field_r = param2[var8];
            ((bv) this).field_ub[var8] = var9;
            ((bv) this).b(-124, var9);
        }
        ((bv) this).b(-128, ((bv) this).field_tb);
        int var11 = 0;
        var8 = var11;
        while (param4.length > var11) {
            ((bv) this).field_tb.b(-122, param4[var11]);
            var11++;
        }
        ((bv) this).field_wb = param5;
        ((bv) this).field_ub[param5].field_cb = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_xb = new long[32];
    }
}
