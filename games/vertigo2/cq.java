/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cq {
    private int field_d;
    private wg field_f;
    static int field_i;
    private int field_b;
    private int[][] field_a;
    private hi[] field_c;
    private int[] field_e;
    private int field_h;
    private int field_g;
    private int[][] field_j;
    byte field_k;

    final void a(int param0) {
        if (param0 >= -52) {
            hi[] discarded$0 = ((cq) this).b(-19);
        }
        ((cq) this).field_b = 50;
    }

    final void a(int[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        fc var6 = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (!((cq) this).field_f.a(-128)) {
          L0: {
            if ((((cq) this).field_b ^ -1) <= -21) {
              if ((((cq) this).field_b ^ -1) < -51) {
                break L0;
              } else {
                var5 = 0;
                var3 = var5;
                L1: while (true) {
                  if (var5 >= 100) {
                    break L0;
                  } else {
                    jn.a(param0, ((cq) this).field_j[var5][2] >> 1990863748, (fb) (Object) am.field_o, ((cq) this).field_j[var5][1] >> 630155492, 80 - (((cq) this).field_b * 4 - 128), sf.field_b.field_t << 320830242, ((cq) this).field_j[var5][0] >> -1680369052, 10, sf.field_b.field_y << 1054206658);
                    var5++;
                    continue L1;
                  }
                }
              }
            } else {
              var3 = 0;
              L2: while (true) {
                if ((var3 ^ -1) <= -101) {
                  break L0;
                } else {
                  jn.a(param0, ((cq) this).field_j[var3][2] >> -1916931036, (fb) (Object) am.field_o, ((cq) this).field_j[var3][1] >> -1709333340, 128, sf.field_b.field_t << -1302454142, ((cq) this).field_j[var3][0] >> -2038614172, 10, sf.field_b.field_y << -926966430);
                  var3++;
                  continue L2;
                }
              }
            }
          }
          L3: {
            mj.a(((cq) this).field_g, ((cq) this).field_h, 0, 0, ((cq) this).field_e, (byte) -74, ((cq) this).field_d);
            if (param1 == -926966430) {
              break L3;
            } else {
              ((cq) this).a(-104, -100, -78, -48, (int[][]) null, (byte) 69);
              break L3;
            }
          }
          var6 = (fc) (Object) ((cq) this).field_f.a(false, false, false, (bn) (Object) rq.field_r.b(110, 1560, 10, -10, -5));
          var6.a(param0, ((cq) this).field_e);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int[][] param4, byte param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var10 = Vertigo2.field_L ? 1 : 0;
        if (((cq) this).field_b >= 50) {
          ((cq) this).field_g = param2;
          ((cq) this).field_d = param3;
          ((cq) this).field_h = param1;
          var7 = 0;
          var8 = 32 % ((param0 - 55) / 46);
          L0: while (true) {
            if ((var7 ^ -1) <= -101) {
              ((cq) this).field_k = param5;
              var11 = 0;
              var7 = var11;
              L1: while (true) {
                if (var11 >= param5) {
                  ((cq) this).field_f.a(ap.field_b[26], (byte) 78);
                  ((cq) this).field_b = 0;
                  return;
                } else {
                  ((cq) this).field_c[var11].a(param4[var11][1], param4[var11][3], param4[var11][0], param4[var11][2], -107, ((cq) this).field_f);
                  var11++;
                  continue L1;
                }
              }
            } else {
              ((cq) this).field_j[var7][0] = param2 << 60004740;
              ((cq) this).field_j[var7][1] = param3 << 1877741828;
              ((cq) this).field_j[var7][2] = param1 << 1689037380;
              var9 = var7 * 2048 / 100;
              ((cq) this).field_a[var7][0] = oo.field_h[var9];
              ((cq) this).field_a[var7][1] = oo.field_j[var9];
              var7++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = Vertigo2.field_L ? 1 : 0;
        if (param0 != 68) {
            ((cq) this).a(55, 9, -77, -47, (int[][]) null, (byte) -61);
        }
        boolean discarded$5 = ((cq) this).field_f.c(-660903963);
        if ((((cq) this).field_b ^ -1) < -7) {
            for (var2 = 0; (var2 ^ -1) > -101; var2++) {
                ((cq) this).field_a[var2][0] = ((cq) this).field_a[var2][0] >> 1;
                ((cq) this).field_a[var2][1] = ((cq) this).field_a[var2][1] >> 1;
            }
        }
        for (var2 = 0; 100 > var2; var2++) {
            ((cq) this).field_j[var2][0] = ((cq) this).field_j[var2][0] + (((cq) this).field_a[var2][0] >> -1361609945);
            ((cq) this).field_j[var2][2] = ((cq) this).field_j[var2][2] + (((cq) this).field_a[var2][1] >> -1447810201);
        }
        for (var2 = 0; var2 < ((cq) this).field_k; var2++) {
            ((cq) this).field_c[var2].b((byte) 112);
        }
        ((cq) this).field_b = ((cq) this).field_b + 1;
    }

    final hi[] b(int param0) {
        if ((((cq) this).field_b ^ -1) <= param0) {
            return null;
        }
        return ((cq) this).field_c;
    }

    cq() {
        int var1 = 0;
        ((cq) this).field_e = new int[12];
        ((cq) this).field_a = new int[100][2];
        ((cq) this).field_j = new int[100][3];
        ((cq) this).field_b = 50;
        ((cq) this).field_f = new wg();
        ((cq) this).field_c = new hi[9];
        for (var1 = 0; var1 < ((cq) this).field_c.length; var1++) {
            ((cq) this).field_c[var1] = new hi();
        }
        ((cq) this).field_k = (byte) 0;
    }

    static {
    }
}
