/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wc extends qk {
    static vn field_Pb;
    private int field_Qb;
    static volatile int field_Ob;
    static int[] field_Nb;
    static int field_Rb;

    private final void x(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var7 = ZombieDawn.field_J;
        if (!(((wc) this).field_yb == null)) {
            ((wc) this).field_yb = null;
        }
        int var5 = -1;
        le var6 = dj.field_e.field_R.b((byte) 26);
        while (var6 instanceof fb) {
            if (var6 instanceof kd) {
                if (((kd) (Object) var6).x(94)) {
                    var2 = ((kd) (Object) var6).a(true) + -((wc) this).a(true);
                    var3 = ((kd) (Object) var6).f(237239984) - ((wc) this).f(237239984);
                    if (var3 > 0) {
                        if (var3 > Math.abs(var2)) {
                            var4 = var3 * var3 + var2 * var2;
                            if (var4 >= var5) {
                                // if_icmpne L150
                            }
                            ((wc) this).field_yb = (kd) (Object) var6;
                            var5 = var4;
                        }
                    }
                }
            }
            var6 = var6.field_b;
        }
        if (param0 != -44) {
            return;
        }
        if (!(67600 >= var5)) {
            ((wc) this).field_yb = null;
        }
        if (null != ((wc) this).field_yb) {
            ((wc) this).e(10, -6904);
            ((wc) this).field_Gb = 10;
            ((wc) this).field_U = kh.a(44, false);
            ((wc) this).field_U.h(ge.field_c >> 1841201313);
        } else {
            ((wc) this).field_Qb = 20;
        }
    }

    public static void o(byte param0) {
        if (param0 != -73) {
            wc.o((byte) -35);
        }
        field_Pb = null;
        field_Nb = null;
    }

    void a(byte param0, wk param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if ((((wc) this).field_F ^ -1) == -21) {
          return;
        } else {
          L0: {
            L1: {
              var3 = param1.a(((wc) this).a(true), (byte) -88);
              var4 = param1.a(((wc) this).f(237239984), 0);
              if (10 != ((wc) this).field_F) {
                break L1;
              } else {
                if (-2 == (((wc) this).field_G ^ -1)) {
                  stackOut_7_0 = -1 + var4;
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_6_0 = var4;
            stackIn_8_0 = stackOut_6_0;
            break L0;
          }
          L2: {
            var5 = stackIn_8_0;
            var6 = 0;
            if (param0 <= -76) {
              break L2;
            } else {
              ((wc) this).g(30);
              break L2;
            }
          }
          L3: {
            ld.field_l[((wc) this).field_t][var6].b(-24 + var3, var5 - 48);
            ag.field_h.b(-24 + var3, -44 + var4);
            if (((wc) this).field_Gb > 0) {
              ((wc) this).b(var3 - 3, (byte) -99, var4);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (b.field_h) {
              bi.d(12 + var3, var4 - -24, 260, 16711680);
              bi.e(var3, var4, var3 + 260, var4 - -260, 16711680);
              bi.e(var3, var4, var3 + -260, 260 + var4, 16711680);
              bj.field_q.c(Integer.toString(((wc) this).field_G), var3, var4, 16777215, 0);
              bj.field_q.c(Integer.toString(((wc) this).field_N), 20 + var3, var4, 16777215, 0);
              bj.field_q.c(Integer.toString(((wc) this).field_F), var3, var4 + -20, 16777215, 0);
              break L4;
            } else {
              break L4;
            }
          }
          return;
        }
    }

    final static void a(re[] param0, int param1) {
        int var3 = 0;
        re var4 = null;
        int var5 = 0;
        int var6 = ZombieDawn.field_J;
        int var2 = param0.length;
        for (var3 = 1; var3 < var2; var3++) {
            var4 = param0[var3];
            for (var5 = -1 + var3; var5 >= 0; var5--) {
                // ifeq L60
                param0[1 + var5] = param0[var5];
            }
            param0[var5 + 1] = var4;
        }
        if (param1 != 0) {
            wc.o((byte) 86);
        }
    }

    final void c(int param0, int param1, int param2) {
        if (param1 < 24) {
            return;
        }
    }

    final static void w(int param0) {
        int var2 = 0;
        mg var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        am var15 = null;
        int[][] var19 = null;
        var12 = ZombieDawn.field_J;
        var15 = fj.field_g;
        var2 = var15.d((byte) -124);
        var3 = (mg) (Object) bg.field_i.b((byte) 26);
        if (param0 > 117) {
          L0: while (true) {
            L1: {
              if (var3 == null) {
                break L1;
              } else {
                if (var2 != var3.field_h) {
                  var3 = (mg) (Object) bg.field_i.a(false);
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            if (var3 == null) {
              p.a(1);
              return;
            } else {
              L2: {
                var4 = var15.d((byte) -124);
                if (-1 == (var4 ^ -1)) {
                  break L2;
                } else {
                  bb.field_b[0] = ce.field_r;
                  var5 = var3.field_i;
                  var6_int = 1;
                  L3: while (true) {
                    if (var6_int >= var4) {
                      jb.a(var4, true, var5);
                      var6_int = 0;
                      L4: while (true) {
                        if (var4 <= var6_int) {
                          bf.a((byte) -35, var5);
                          var6 = new String[2][var5];
                          var19 = new int[2][var5 * 4];
                          var8 = qn.field_e;
                          var9 = 0;
                          var10 = 0;
                          L5: while (true) {
                            if (var9 >= var8) {
                              var13 = 0;
                              var9 = var13;
                              var14 = 0;
                              var10 = var14;
                              L6: while (true) {
                                if (var8 <= var13) {
                                  break L2;
                                } else {
                                  var11 = qd.field_c[var13 + var5];
                                  var6[1][var14] = bb.field_b[var11];
                                  var19[1][4 * var14] = dj.field_g[var11];
                                  var19[1][1 + 4 * var14] = qo.field_r[var11];
                                  var19[1][var14 * 4 - -2] = sg.field_kb[var11];
                                  var19[1][4 * var14 + 3] = jd.field_d[var11];
                                  if (l.a(89, bb.field_b[var11])) {
                                    if (sg.field_kb[var11] + (qo.field_r[var11] + jd.field_d[var11]) == 0) {
                                      var6[1][var14] = null;
                                      var14--;
                                      var14++;
                                      var13++;
                                      continue L6;
                                    } else {
                                      var14++;
                                      var13++;
                                      continue L6;
                                    }
                                  } else {
                                    var14++;
                                    var13++;
                                    continue L6;
                                  }
                                }
                              }
                            } else {
                              var11 = qd.field_c[var9];
                              var6[0][var10] = bb.field_b[var11];
                              var19[0][var10 * 4] = dj.field_g[var11];
                              var19[0][1 + 4 * var10] = qo.field_r[var11];
                              var19[0][2 + var10 * 4] = sg.field_kb[var11];
                              var19[0][var10 * 4 - -3] = jd.field_d[var11];
                              if (l.a(126, bb.field_b[var11])) {
                                if (jd.field_d[var11] + (qo.field_r[var11] + sg.field_kb[var11]) == 0) {
                                  var6[0][var10] = null;
                                  var10--;
                                  var9++;
                                  var10++;
                                  continue L5;
                                } else {
                                  var9++;
                                  var10++;
                                  continue L5;
                                }
                              } else {
                                var9++;
                                var10++;
                                continue L5;
                              }
                            }
                          }
                        } else {
                          aa.a((de) (Object) var15, -121);
                          if (var6_int != 0) {
                            mp.a(var6_int, e.field_H, ii.field_d, 1000, sn.field_e, rj.field_E);
                            var6_int++;
                            continue L4;
                          } else {
                            mp.a(var6_int, e.field_H, ii.field_d, 1000, sn.field_e, rj.field_E);
                            var6_int++;
                            continue L4;
                          }
                        }
                      }
                    } else {
                      bb.field_b[var6_int] = var15.a(true);
                      var6_int++;
                      continue L3;
                    }
                  }
                }
              }
              var3.b(-27598);
              return;
            }
          }
        } else {
          return;
        }
    }

    void g(int param0) {
        int var3 = 0;
        L0: {
          var3 = ZombieDawn.field_J;
          if (param0 >= 95) {
            break L0;
          } else {
            field_Ob = 118;
            break L0;
          }
        }
        L1: {
          if (((wc) this).field_Gb < -1) {
            ((wc) this).field_Gb = ((wc) this).field_Gb - 1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (-1 != ((wc) this).field_F) {
            if ((((wc) this).field_F ^ -1) == -11) {
              L3: {
                ((wc) this).field_N = ((wc) this).field_N + 3;
                if (2 == ((wc) this).field_G) {
                  ((wc) this).field_yb.z(0);
                  ((wc) this).e(0, -6904);
                  break L3;
                } else {
                  break L3;
                }
              }
              ((wc) this).d(((wc) this).field_F, -26109);
              break L2;
            } else {
              ((wc) this).d(((wc) this).field_F, -26109);
              break L2;
            }
          } else {
            if (((wc) this).field_Qb <= 0) {
              this.x(-44);
              ((wc) this).d(((wc) this).field_F, -26109);
              break L2;
            } else {
              ((wc) this).field_Qb = ((wc) this).field_Qb - 1;
              ((wc) this).d(((wc) this).field_F, -26109);
              break L2;
            }
          }
        }
    }

    final void a(nc param0, byte param1) {
        int var3 = -63 / ((-53 - param1) / 54);
    }

    final static void f(int param0, int param1) {
        int var3 = ZombieDawn.field_J;
        if (param0 != 67600) {
            return;
        }
        ep var4 = (ep) (Object) uk.field_a.b((byte) 26);
        while (var4 != null) {
            sn.a(param1, var4, 0);
            var4 = (ep) (Object) uk.field_a.a(false);
        }
        le var2 = jj.field_D.b((byte) 26);
        while (var2 != null) {
            p.a(0, param1);
            var2 = jj.field_D.a(false);
        }
    }

    wc(int param0, int param1, int param2) {
        super(param0, param1, param2);
        ((wc) this).field_Qb = 0;
        ((wc) this).field_S = 2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Pb = new vn(270, 70);
        field_Ob = 0;
        field_Nb = new int[8192];
    }
}
