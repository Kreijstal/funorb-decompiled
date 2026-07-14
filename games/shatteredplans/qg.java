/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg extends me {
    private int[] field_s;
    static int field_q;
    static String field_o;
    static int[] field_r;
    static int[] field_t;
    static int[] field_l;
    static String field_k;
    static int[][] field_p;
    static int[] field_m;
    private int[] field_n;

    final void a(ob param0, byte param1) {
        if (param1 != -109) {
            int discarded$0 = ((qg) this).b(true);
        }
    }

    final static void a(ob param0, boolean param1) {
        np.field_j = param0.f(-20976) << 535847109;
        int var2 = param0.j(-101);
        np.field_j = np.field_j + (var2 >> -350010109);
        gp.field_c = 1835008 & var2 << 679401330;
        if (param1) {
            field_q = 21;
        }
        gp.field_c = gp.field_c + (param0.f(-20976) << 408883874);
        var2 = param0.j(-120);
        gp.field_c = gp.field_c + (var2 >> -1457534842);
        ig.field_d = 2064384 & var2 << 802681167;
        ig.field_d = ig.field_d + (param0.j(-122) << 1121519175);
        var2 = param0.j(-127);
        na.field_L = (1 & var2) << 1664072368;
        ig.field_d = ig.field_d + (var2 >> -1544118015);
        na.field_L = na.field_L + param0.f(-20976);
    }

    final void a(byte param0, dc param1, kq param2) {
        int[] var4 = null;
        int var5 = 0;
        int[] var6 = null;
        int var7_int = 0;
        fs[] var7 = null;
        int var8_int = 0;
        int[] var8 = null;
        int[] var9 = null;
        int var10_int = 0;
        fs[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        double var13 = 0.0;
        int var15 = 0;
        double var16 = 0.0;
        int var18 = 0;
        int[] var19 = null;
        int[] var20 = null;
        int var21 = 0;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        qk[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        var18 = ShatteredPlansClient.field_F ? 1 : 0;
        var38 = new int[((qg) this).field_i.length];
        var33 = var38;
        var28 = var33;
        var22 = var28;
        var19 = var22;
        var40 = var19;
        var35 = var40;
        var30 = var35;
        var24 = var30;
        var4 = var24;
        var5 = 0;
        L0: while (true) {
          if (var5 >= var38.length) {
            L1: {
              if (param0 < -9) {
                break L1;
              } else {
                qg.c(-41);
                break L1;
              }
            }
            var5 = 0;
            var39 = ((qg) this).field_n;
            var34 = var39;
            var29 = var34;
            var23 = var29;
            var20 = var23;
            var6 = var20;
            var7_int = 0;
            L2: while (true) {
              if (var7_int >= var39.length) {
                L3: {
                  if ((var5 ^ -1) >= -1) {
                    break L3;
                  } else {
                    lh.a((byte) 50, var4, (int[]) ((qg) this).field_n.clone());
                    break L3;
                  }
                }
                var27 = new qk[]{new qk(0, 0, 182, rs.field_Cb.field_J, re.a(ShatteredPlansClient.field_J, 4371, new String[1]))};
                var7 = new fs[((qg) this).field_i.length];
                var42 = new int[((qg) this).field_i.length];
                var37 = var42;
                var32 = var37;
                var26 = var32;
                var8 = var26;
                var41 = new int[((qg) this).field_i.length];
                var36 = var41;
                var31 = var36;
                var25 = var31;
                var9 = var25;
                var10_int = 0;
                L4: while (true) {
                  if (var10_int >= ((qg) this).field_i.length) {
                    L5: {
                      if (null != ((qg) this).field_g) {
                        var10 = ((qg) this).field_g;
                        var11 = 0;
                        break L5;
                      } else {
                        var12 = 0;
                        var13 = 1.7976931348623157e+308;
                        var15 = 0;
                        L6: while (true) {
                          if (((qg) this).field_i.length <= var15) {
                            if (var12 == 0) {
                              var10 = new fs[]{};
                              var11 = 0;
                              break L5;
                            } else {
                              var10 = new fs[var12];
                              var21 = 0;
                              var15 = var21;
                              L7: while (true) {
                                if (var21 >= ((qg) this).field_i.length) {
                                  var11 = (int)Math.ceil(var13);
                                  break L5;
                                } else {
                                  if (((qg) this).field_s[var21] != 0) {
                                    var16 = (double)(-((qg) this).field_n[var21] + 10) / (double)((qg) this).field_s[var21];
                                    if (var16 == var13) {
                                      var12--;
                                      var10[var12] = ((qg) this).field_i[var21];
                                      var21++;
                                      continue L7;
                                    } else {
                                      var21++;
                                      continue L7;
                                    }
                                  } else {
                                    var21++;
                                    continue L7;
                                  }
                                }
                              }
                            }
                          } else {
                            if (((qg) this).field_s[var15] != 0) {
                              if (((qg) this).field_n[var15] != 0) {
                                var16 = (double)(-((qg) this).field_n[var15] + 10) / (double)((qg) this).field_s[var15];
                                if (var16 != var13) {
                                  if (var13 > var16) {
                                    var12 = 1;
                                    var13 = var16;
                                    var15++;
                                    continue L6;
                                  } else {
                                    var15++;
                                    continue L6;
                                  }
                                } else {
                                  var12++;
                                  var15++;
                                  continue L6;
                                }
                              } else {
                                var15++;
                                continue L6;
                              }
                            } else {
                              var15++;
                              continue L6;
                            }
                          }
                        }
                      }
                    }
                    param2.a(10, var7, var41, var42, var10, var27, (byte) -47, var11);
                    return;
                  } else {
                    var7[var10_int] = ((qg) this).field_i[var40[var10_int]];
                    var8[var10_int] = ((qg) this).field_n[var40[var10_int]];
                    var9[var10_int] = ((qg) this).field_s[var40[var10_int]];
                    var10_int++;
                    continue L4;
                  }
                }
              } else {
                var8_int = var39[var7_int];
                var5 = var5 + var8_int;
                var7_int++;
                continue L2;
              }
            }
          } else {
            var38[var5] = var5;
            var5++;
            continue L0;
          }
        }
    }

    final int b(boolean param0) {
        if (param0) {
            field_p = null;
        }
        return 4 * cc.field_n + rs.field_Cb.field_J;
    }

    final boolean a(dc param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if ((param0.field_w & 1) == 0) {
          if (6 <= kb.field_x) {
            if (param1 >= 23) {
              if (0 == (4 & param0.field_w)) {
                return false;
              } else {
                ((qg) this).field_g = new fs[1];
                ((qg) this).field_g[0] = param0.field_v[0];
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          ((qg) this).field_g = new fs[1];
          var3 = 1;
          L0: while (true) {
            if (param0.field_v.length <= var3) {
              return true;
            } else {
              if ((param0.field_w & 1 << var3) == 0) {
                ((qg) this).field_g[0] = param0.field_v[var3];
                var3++;
                continue L0;
              } else {
                var3++;
                continue L0;
              }
            }
          }
        }
    }

    qg(fs[] param0) {
        super(param0);
        ((qg) this).field_n = new int[((qg) this).field_i.length];
        ((qg) this).field_s = new int[((qg) this).field_i.length];
    }

    final fs[] b(int param0) {
        if (param0 != 0) {
            ((qg) this).field_n = null;
        }
        return new fs[]{};
    }

    public static void c(int param0) {
        field_k = null;
        if (param0 >= -93) {
            Object var2 = null;
            qg.a(-23, (mj) null, -88, (ub) null, -99, 99, (byte) 109);
        }
        field_r = null;
        field_o = null;
        field_t = null;
        field_p = null;
        field_m = null;
        field_l = null;
    }

    final void a(int param0, ob param1) {
        int var3 = 1 / ((-72 - param0) / 45);
    }

    final static void a(int param0, mj param1, int param2, ub param3, int param4, int param5, byte param6) {
        tp.a((int[]) null, param1.field_Ib, param1.field_Cb, param1.field_Db, 293, param3, (qr) (Object) param1, -1, -1);
        hp.field_m.a(true, param6 ^ -16763);
        hp.field_m.a((int[]) null, 0, (byte) -36);
        hp.field_m.b(17);
        fc var12 = hp.field_m;
        int var8 = param0;
        int var9 = param2;
        int var10 = param4;
        int var11 = param5;
        var12.field_j.b(var10, var11, 0, var8, var9);
        if (param6 != 110) {
            field_t = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new int[14];
        field_l = new int[14];
        field_o = "Remove name";
        field_p = new int[14][];
        field_q = 0;
        field_m = new int[14];
        field_r = new int[14];
        field_k = "This password is part of your Player Name, and would be easy to guess";
        qd.a(25, 0, 400, new int[8], (byte) -5, 200, 0);
        qd.a(25, 0, 320, new int[5], (byte) -5, 150, 1);
        qd.a(25, 0, 320, new int[7], (byte) -5, 150, 2);
        qd.a(25, 0, 370, new int[6], (byte) -5, 150, 3);
        qd.a(25, 0, 320, new int[5], (byte) -5, 150, 4);
        qd.a(25, 0, 400, new int[2], (byte) -5, 380, 5);
        qd.a(25, 320, 500, new int[2], (byte) -5, 70, 6);
        qd.a(25, 320, 500, new int[1], (byte) -5, 50, 7);
        qd.a(25, 0, 500, new int[2], (byte) -5, 400, 8);
        qd.a(25, 0, 500, new int[2], (byte) -5, 200, 9);
        qd.a(25, 0, 320, new int[1], (byte) -5, 400, 10);
        qd.a(25, 0, 0, new int[0], (byte) -5, 200, 11);
        qd.a(25, 0, 500, new int[4], (byte) -5, 200, 12);
        qd.a(25, 0, 400, new int[6], (byte) -5, 200, 13);
    }
}
