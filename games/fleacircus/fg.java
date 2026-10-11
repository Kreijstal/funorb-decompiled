/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends lh {
    int[] field_o;
    int field_k;
    static sf field_l;
    static ia field_x;
    int field_v;
    od[] field_s;
    int[] field_r;
    static vc field_t;
    static ce field_q;
    int[] field_p;
    static ce field_i;
    static dd field_j;
    static int[] field_u;
    byte[][][] field_w;
    od[] field_n;
    static String field_m;

    final static void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var4 = 0;
        int var5 = 0;
        int var8 = 0;
        var8 = fleas.field_A ? 1 : 0;
        try {
          pl.field_f = 0;
          var1_int = 61 % ((param0 + 43) / 47);
          qh.field_z = 0;
          qi.field_f = 0;
          kb.field_i = 0;
          pa.field_o = 0;
          gh.field_q = 0;
          jc.field_f = 0;
          md.field_L = 1;
          pl.field_g = 0;
          db.field_H = 0;
          ue.field_d = 4;
          we.field_c = 0;
          oe.field_a = 0;
          for (var2 = 0; var2 < 40; var2++) {
            for (var3 = 0; var3 < 21; var3++) {
              var4 = fl.field_c[var2][var3];
              if (var4 == 15) {
                fl.field_c[var2][var3 + 2] = (char)7;
              }
              if (1 == var4) {
                rk.field_s = 8 + 16 * var2;
                ck.field_o = 16 + var3 * 16;
              }
              if (8 == var4) {
                gk.a(var3, 125, 9, var2, 8);
                ok.field_s[-1 + oe.field_a] = 1;
              }
              if (13 == var4 ||
                var4 == 27) {
                gk.a(var3, 124, 27, var2, 13);
              }
              if (var4 == 12 ||
                var4 == 32) {
                gk.a(var3, 127, 32, var2, 12);
              }
              if (var4 == 14 ||
                var4 == 28) {
                gk.a(var3, 126, 28, var2, 14);
                rk.field_u[qi.field_f] = var2;
                kk.field_a[qi.field_f] = var3;
                me.field_i[qi.field_f] = 0;
                qi.field_f = qi.field_f + 1;
              }
              if (16 == var4 ||
                var4 == 29) {
                if (jc.field_f != 0) {
                  hf.field_b = var3;
                  tg.field_d = var2;
                  jc.field_f = 2;
                } else {
                  jc.field_f = 1;
                  pc.field_b = var2;
                  lb.field_m = var3;
                }
                gk.a(var3, 127, 29, var2, 16);
              }
              if (var4 == 17 ||
                var4 == 31) {
                gk.a(var3, 126, 31, var2, 17);
              }
              var5 = fl.field_c[var2][var3];
              for (var6 = 0; var6 < 4; var6++) {
                for (var7 = 0; var7 < 4; var7++) {
                  if (var5 != 0) {
                    if (var5 != 1) {
                      if (3 != var5) {
                        if (var5 != 4) {
                          if (var5 != 8) {
                            if (18 == var5) {
                              lh.field_e[var6 + var2 * 4][var7 + var3 * 4] = -1;
                            } else {
                              if (var5 == 11) {
                                if (3 == var7) {
                                  lh.field_e[var6 + 4 * var2][var7 + var3 * 4] = 1;
                                } else {
                                  lh.field_e[4 * var2 + var6][var3 * 4 + var7] = 0;
                                }
                              } else {
                                lh.field_e[var6 + var2 * 4][var3 * 4 + var7] = 2;
                              }
                            }
                          } else {
                            lh.field_e[var2 * 4 + var6][var7 + 4 * var3] = -1;
                          }
                        } else {
                          if (var7 == var6) {
                            lh.field_e[4 * var2 + var6][4 * var3 + var7] = 1;
                          } else {
                            lh.field_e[var6 + 4 * var2][4 * var3 + var7] = 0;
                          }
                        }
                      } else {
                        if (var6 == -var7 + 3) {
                          lh.field_e[var6 + var2 * 4][4 * var3 + var7] = 1;
                        } else {
                          lh.field_e[var6 + 4 * var2][4 * var3 + var7] = 0;
                        }
                      }
                    } else {
                      lh.field_e[var6 + 4 * var2][var3 * 4 + var7] = 1;
                    }
                  } else {
                    lh.field_e[4 * var2 + var6][var7 + 4 * var3] = 0;
                  }
                }
              }
            }
          }
          bm.e((byte) 31);
          ee.field_h = 6;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "fg.B(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_u = null;
        field_t = null;
        if (param0 != -5) {
          field_i = (ce) null;
        }
        field_m = null;
        field_l = null;
        field_i = null;
        field_q = null;
        field_j = null;
        field_x = null;
    }

    fg() {
    }

    static {
        field_u = new int[150];
        field_t = new vc();
        field_m = null;
    }
}
