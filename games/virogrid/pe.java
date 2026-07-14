/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends l {
    jh field_g;
    l field_h;
    static int[] field_j;
    static int field_k;
    int field_i;

    final static void a(java.awt.Component param0, i param1, pd param2, boolean param3, byte param4, int param5) {
        if (param4 >= -4) {
            return;
        }
        wl.a(param2, param1, 1024, 106, param3, param0, param5, param5);
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        int var10 = Virogrid.field_F ? 1 : 0;
        int var5 = df.field_e * param0 + param2;
        int var6 = param4 * df.field_e + var5;
        int var7 = (param1 & 16711422) >> -853483999;
        int var8 = 0;
        int var9 = var5;
        while (var6 > var9) {
            df.field_d[var9] = 0 == var8 % 2 ? var7 : param1;
            var8++;
            var9 = var9 + df.field_e;
        }
        var9 = -57 / ((-54 - param3) / 53);
    }

    public static void a(byte param0) {
        field_j = null;
        int var1 = -99 / ((-23 - param0) / 53);
    }

    final static String a(String param0, String param1, eh param2, int param3, int param4) {
        if (!(param2.c(param4))) {
            return param0;
        }
        return param1 + " - " + param2.b((byte) 113, param3) + "%";
    }

    final static void a(int param0) {
        int var2 = 0;
        dh var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        hg var13 = null;
        int var14 = 0;
        int var15 = 0;
        hg var16 = null;
        var12 = Virogrid.field_F ? 1 : 0;
        var13 = sh.field_qb;
        var16 = var13;
        var2 = var16.g(11132);
        var3 = (dh) (Object) bl.field_D.a((byte) -67);
        L0: while (true) {
          L1: {
            if (var3 == null) {
              break L1;
            } else {
              if (var2 == var3.field_i) {
                break L1;
              } else {
                var3 = (dh) (Object) bl.field_D.a(16213);
                continue L0;
              }
            }
          }
          if (var3 != null) {
            L2: {
              var4 = var16.g(param0 + 11133);
              if (param0 != (var4 ^ -1)) {
                rc.field_h[0] = mi.field_d;
                var5 = var3.field_g;
                var6_int = 1;
                L3: while (true) {
                  if (var6_int >= var4) {
                    fj.a((byte) 125, var5, var4);
                    var6_int = 0;
                    L4: while (true) {
                      if (var4 <= var6_int) {
                        sb.a(var5, (byte) 46);
                        var3.field_j = new String[2][var5];
                        var6 = new String[2][var5];
                        var3.field_t = new int[2][4 * var5];
                        var7 = new int[2][4 * var5];
                        var8 = ka.field_m;
                        var9 = 0;
                        var10 = 0;
                        L5: while (true) {
                          if (var8 <= var9) {
                            var14 = 0;
                            var9 = var14;
                            var15 = 0;
                            var10 = var15;
                            L6: while (true) {
                              if (var8 <= var14) {
                                break L2;
                              } else {
                                var11 = lk.field_Tb[var14 + var5];
                                var6[1][var15] = rc.field_h[var11];
                                var7[1][4 * var15] = wh.field_c[var11];
                                var7[1][1 + 4 * var15] = vc.field_jb[var11];
                                var7[1][4 * var15 + 2] = tg.field_A[var11];
                                var7[1][var15 * 4 - -3] = kf.field_j[var11];
                                if (jc.a(rc.field_h[var11], true)) {
                                  if (-1 == (vc.field_jb[var11] - (-tg.field_A[var11] - kf.field_j[var11]) ^ -1)) {
                                    var6[1][var15] = null;
                                    var15--;
                                    var14++;
                                    var15++;
                                    continue L6;
                                  } else {
                                    var14++;
                                    var15++;
                                    continue L6;
                                  }
                                } else {
                                  var14++;
                                  var15++;
                                  continue L6;
                                }
                              }
                            }
                          } else {
                            var11 = lk.field_Tb[var9];
                            var6[0][var10] = rc.field_h[var11];
                            var7[0][var10 * 4] = wh.field_c[var11];
                            var7[0][4 * var10 + 1] = vc.field_jb[var11];
                            var7[0][2 + 4 * var10] = tg.field_A[var11];
                            var7[0][3 + 4 * var10] = kf.field_j[var11];
                            if (jc.a(rc.field_h[var11], true)) {
                              if (0 == vc.field_jb[var11] - (-tg.field_A[var11] + -kf.field_j[var11])) {
                                var6[0][var10] = null;
                                var10--;
                                var10++;
                                var9++;
                                continue L5;
                              } else {
                                var10++;
                                var9++;
                                continue L5;
                              }
                            } else {
                              var10++;
                              var9++;
                              continue L5;
                            }
                          }
                        }
                      } else {
                        lj.a(true, (jc) (Object) var16);
                        if (var6_int == 0) {
                          var3.field_m = ug.field_b;
                          var3.field_u = lm.field_j;
                          var3.field_h = ve.field_s;
                          var3.field_q = ng.field_X;
                          fd.a(ng.field_X, lm.field_j, param0 ^ -1, ve.field_s, var6_int, ug.field_b);
                          var6_int++;
                          continue L4;
                        } else {
                          fd.a(ng.field_X, lm.field_j, param0 ^ -1, ve.field_s, var6_int, ug.field_b);
                          var6_int++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    rc.field_h[var6_int] = var13.h(-121);
                    var6_int++;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            var3.field_s = true;
            var3.a(false);
            return;
          } else {
            tn.a(false);
            return;
          }
        }
    }

    final static void b(byte param0) {
        db.field_k = null;
        k.field_c = null;
        gb.field_F = null;
        lj.field_j = null;
        if (param0 != -28) {
            field_k = 63;
        }
        mb.field_bb = null;
        el.field_w = null;
    }

    pe(jh param0, l param1) {
        ((pe) this).field_g = param0;
        ((pe) this).field_i = param0.l();
        ((pe) this).field_h = param1;
        ((pe) this).field_g.f(((pe) this).field_i * ag.field_c + 128 >> -1370145592);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 0;
    }
}
