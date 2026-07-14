/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cma extends ana {
    private j field_w;
    static js field_x;
    static int[] field_y;
    static int[] field_v;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var11 = 0;
        int[] var15 = null;
        int var13 = BachelorFridge.field_y;
        int var8 = param0 + -param4;
        int var7 = param4 + param6;
        for (var11 = param6; var11 < var7; var11++) {
            hba.a(param1, param2, tj.field_b[var11], 7, param3);
        }
        int var12 = -103 % ((param5 - 16) / 45);
        for (var11 = param0; var8 < var11; var11--) {
            hba.a(param1, param2, tj.field_b[var11], 7, param3);
        }
        int var10 = param3 + -param4;
        int var9 = param4 + param2;
        for (var11 = var7; var8 >= var11; var11++) {
            var15 = tj.field_b[var11];
            hba.a(param1, param2, var15, 7, var9);
            hba.a(param1, var10, var15, 7, param3);
        }
    }

    public static void b(boolean param0) {
        field_y = null;
        field_v = null;
        field_x = null;
        if (param0) {
            cma.a(-88, 115, -61, 22, -9, -70, 105);
        }
    }

    private final void e(byte param0) {
        ad var5 = null;
        int var6 = BachelorFridge.field_y;
        aga var7 = ((cma) this).field_w.field_l.a(param0 + 9, ((cma) this).field_q.field_h);
        aga var2 = var7;
        if (var7.i(107)) {
            return;
        }
        pp var3 = (pp) (Object) ((cma) this).field_w.field_o.b((byte) 90);
        if (param0 != 35) {
            field_v = null;
        }
        oha discarded$0 = al.a(109, ((cma) this).field_w.field_k);
        int var4 = 0;
        while (var3 != null) {
            var5 = var3.field_h.a(-27449, ((cma) this).field_q);
            var5.b(-1, 6);
            if (var3 instanceof iv) {
                ((iv) (Object) var3).a((byte) 74, var7, ((cma) this).field_q.field_h, ((cma) this).field_w.field_q[var4]);
            } else {
                var3.a(var7, ((cma) this).field_q.field_h, 12);
            }
            ((cma) this).a(27799, (at) (Object) new ek(((cma) this).field_q, var5, var3.field_f));
            var4++;
            var3 = (pp) (Object) ((cma) this).field_w.field_o.c(0);
        }
    }

    cma(gj param0, j param1) {
        super(param0, (bca) (Object) param1);
        ((cma) this).field_w = param1;
    }

    private final void e(int param0) {
        op var3 = null;
        aga var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object var18 = null;
        hd var18_ref = null;
        int[][] var21 = null;
        var18 = null;
        var16 = BachelorFridge.field_y;
        var18_ref = (hd) (Object) al.a(-88, ((cma) this).field_w.field_k);
        if (param0 < -123) {
          var3 = ((cma) this).field_q.field_h;
          var4 = ((cma) this).field_w.field_l.a(102, ((cma) this).field_q.field_h);
          var21 = ((cma) this).field_w.a(0, -19, ((cma) this).field_q.field_h, var4);
          var6 = ((cma) this).field_w.field_r;
          var7 = ((cma) this).field_w.field_s;
          var8 = 17;
          var9 = 17;
          var10 = var8 - 1 >> -985701919;
          var11 = var9 + -1 >> 1111258433;
          var12 = 0;
          L0: while (true) {
            if (var12 >= var8) {
              return;
            } else {
              var13 = 0;
              L1: while (true) {
                if (var9 <= var13) {
                  var12++;
                  continue L0;
                } else {
                  if (var21[var12][var13] == 1) {
                    var14 = var6 - (-var12 + var10);
                    var15 = -var11 + var13 + var7;
                    if (var14 >= 0) {
                      if (var3.field_z > var14) {
                        if (0 <= var15) {
                          if (var3.field_B > var15) {
                            uea discarded$1 = new uea(((cma) this).field_q, var14, var15, gma.field_e[var18_ref.field_q].field_a);
                            var13++;
                            continue L1;
                          } else {
                            var13++;
                            continue L1;
                          }
                        } else {
                          var13++;
                          continue L1;
                        }
                      } else {
                        var13++;
                        continue L1;
                      }
                    } else {
                      var13++;
                      continue L1;
                    }
                  } else {
                    var13++;
                    continue L1;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final boolean c(byte param0) {
        int var2 = -105 / ((71 - param0) / 47);
        ((cma) this).field_l = ((cma) this).field_l - 1;
        if (!(((cma) this).field_l - 1 < 0)) {
            if (-26 == (((cma) this).field_l ^ -1)) {
                this.e(-128);
                this.e((byte) 35);
            }
            return false;
        }
        this.d(1);
        return true;
    }

    private final void d(int param0) {
        if (param0 != 1) {
            field_v = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new int[]{2, 3, 4};
        field_v = new int[]{11, 12, 13, 6, 5, 10, 9, 8, 0, 7, 4, 3, 2, 1};
    }
}
