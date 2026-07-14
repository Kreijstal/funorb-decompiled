/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj {
    private int[] field_d;
    private int[] field_g;
    static hl field_a;
    private int field_k;
    private int field_i;
    private int field_e;
    static String field_h;
    static long field_c;
    static String field_f;
    static hl field_j;
    private int field_b;

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final static void a(el param0, byte param1, boolean param2, String param3) {
        pf var7 = null;
        String var8 = null;
        String var10 = null;
        pf var11 = null;
        String var12 = null;
        pf var9 = null;
        gd.a((String) null, 255, (String) null, -1, ph.field_t, (int[]) null, 0L, (hl) (Object) param0, param0.j(-128));
        if (param0.field_Kb) {
            if (2 != param0.field_Zb) {
                // if_icmpgt L91
            }
            var7 = hd.field_s;
            var8 = sk.a(new String[1], md.field_y, 119);
            var7.field_j.a(var8, 1, 10);
        }
        hd.field_s.b((byte) 79);
        if (!param2) {
        } else {
            if (nd.field_Nb == hd.field_s.field_c) {
                var9 = hd.field_s;
                var10 = sk.a(new String[1], wa.field_h, 127);
                var9.field_j.a(var10, 1, 16);
            } else {
                var11 = hd.field_s;
                var12 = sk.a(new String[1], vi.field_b, 120);
                var11.field_j.a(var12, 1, 15);
            }
        }
        pf var13 = hd.field_s;
        if (param1 < 103) {
            return;
        }
        int var5 = ci.field_B;
        int var6 = li.field_o;
        var13.field_j.a(0, var6, -117, 0, var5);
    }

    final static void a(int param0, int[] param1, byte param2, int param3, int[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        L0: {
          var13 = TetraLink.field_J;
          if (param3 <= param0) {
            break L0;
          } else {
            L1: {
              var5 = (param3 + param0) / 2;
              var6 = param0;
              var7 = param4[var5];
              param4[var5] = param4[param3];
              param4[param3] = var7;
              var8 = param1[var5];
              param1[var5] = param1[param3];
              param1[param3] = var8;
              if (2147483647 != var7) {
                stackOut_3_0 = 1;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 0;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            var9 = stackIn_4_0;
            var10 = param0;
            L2: while (true) {
              if (var10 >= param3) {
                param4[param3] = param4[var6];
                param4[var6] = var7;
                param1[param3] = param1[var6];
                param1[var6] = var8;
                oj.a(param0, param1, (byte) -63, var6 + -1, param4);
                oj.a(1 + var6, param1, (byte) -63, param3, param4);
                break L0;
              } else {
                if (var7 + -(var10 & var9) < param4[var10]) {
                  var11 = param4[var10];
                  param4[var10] = param4[var6];
                  param4[var6] = var11;
                  var12 = param1[var10];
                  param1[var10] = param1[var6];
                  var6++;
                  param1[var6] = var12;
                  var10++;
                  continue L2;
                } else {
                  var10++;
                  continue L2;
                }
              }
            }
          }
        }
        L3: {
          if (param2 == -63) {
            break L3;
          } else {
            var14 = null;
            boolean discarded$1 = oj.a(126, (String) null);
            break L3;
          }
        }
    }

    final int c(int param0) {
        if (param0 == ((oj) this).field_e) {
            this.a(-27169);
            ((oj) this).field_e = 256;
        }
        ((oj) this).field_e = ((oj) this).field_e - 1;
        return ((oj) this).field_d[((oj) this).field_e - 1];
    }

    final static void b(byte param0) {
        int var2 = 0;
        v var3 = null;
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
        bc var13 = null;
        int var14 = 0;
        bc var15 = null;
        L0: {
          var12 = TetraLink.field_J;
          var13 = kb.field_q;
          var15 = var13;
          var2 = var15.d((byte) -99);
          if (param0 <= -95) {
            break L0;
          } else {
            oj.b((byte) -78);
            break L0;
          }
        }
        var3 = (v) (Object) tc.field_p.c(false);
        L1: while (true) {
          L2: {
            if (var3 == null) {
              break L2;
            } else {
              if (var3.field_n == var2) {
                break L2;
              } else {
                var3 = (v) (Object) tc.field_p.a((byte) -70);
                continue L1;
              }
            }
          }
          if (var3 != null) {
            L3: {
              var4 = var15.d((byte) -99);
              if (var4 == 0) {
                break L3;
              } else {
                nj.field_a[0] = ph.field_w;
                var5 = var3.field_q;
                var6_int = 1;
                L4: while (true) {
                  if (var4 <= var6_int) {
                    lm.a(var5, var4, (byte) 71);
                    var6_int = 0;
                    L5: while (true) {
                      if (var6_int >= var4) {
                        ae.b(94, var5);
                        var3.field_p = new String[2][var5];
                        var6 = new String[2][var5];
                        var3.field_y = new int[2][var5 * 4];
                        var7 = new int[2][var5 * 4];
                        var8 = nd.field_Mb;
                        var9 = 0;
                        var10 = 0;
                        L6: while (true) {
                          if (var8 <= var9) {
                            var9 = 0;
                            var14 = 0;
                            var10 = var14;
                            L7: while (true) {
                              if (var8 <= var9) {
                                break L3;
                              } else {
                                var11 = qd.field_W[var5 - -var9];
                                var6[1][var14] = nj.field_a[var11];
                                var7[1][4 * var14] = lb.field_P[var11];
                                var7[1][4 * var14 - -1] = ac.field_b[var11];
                                var7[1][var14 * 4 - -2] = ai.field_g[var11];
                                var7[1][var14 * 4 - -3] = gl.field_n[var11];
                                if (ej.a(nj.field_a[var11], 4)) {
                                  if (gl.field_n[var11] + ai.field_g[var11] + ac.field_b[var11] == 0) {
                                    var6[1][var14] = null;
                                    var14--;
                                    var14++;
                                    var9++;
                                    continue L7;
                                  } else {
                                    var14++;
                                    var9++;
                                    continue L7;
                                  }
                                } else {
                                  var14++;
                                  var9++;
                                  continue L7;
                                }
                              }
                            }
                          } else {
                            var11 = qd.field_W[var9];
                            var6[0][var10] = nj.field_a[var11];
                            var7[0][var10 * 4] = lb.field_P[var11];
                            var7[0][var10 * 4 - -1] = ac.field_b[var11];
                            var7[0][2 + var10 * 4] = ai.field_g[var11];
                            var7[0][3 + 4 * var10] = gl.field_n[var11];
                            if (ej.a(nj.field_a[var11], 4)) {
                              if (ai.field_g[var11] + (ac.field_b[var11] + gl.field_n[var11]) == 0) {
                                var6[0][var10] = null;
                                var10--;
                                var10++;
                                var9++;
                                continue L6;
                              } else {
                                var10++;
                                var9++;
                                continue L6;
                              }
                            } else {
                              var10++;
                              var9++;
                              continue L6;
                            }
                          }
                        }
                      } else {
                        lb.a((bh) (Object) var15, false);
                        if (var6_int == 0) {
                          var3.field_B = tl.field_X;
                          var3.field_s = fd.field_F;
                          var3.field_o = om.field_Nb;
                          var3.field_t = l.field_j;
                          ug.a(fd.field_F, tl.field_X, om.field_Nb, 20, var6_int, l.field_j);
                          var6_int++;
                          continue L5;
                        } else {
                          ug.a(fd.field_F, tl.field_X, om.field_Nb, 20, var6_int, l.field_j);
                          var6_int++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    nj.field_a[var6_int] = var13.g((byte) 81);
                    var6_int++;
                    continue L4;
                  }
                }
              }
            }
            var3.field_u = true;
            var3.b(false);
            return;
          } else {
            mk.a(false);
            return;
          }
        }
    }

    final static boolean a(int param0, String param1) {
        if (param0 != 1) {
            return false;
        }
        return ke.a(param1, false) != null ? true : false;
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = TetraLink.field_J;
          if (param0 == -27169) {
            break L0;
          } else {
            int discarded$1 = ((oj) this).c(54);
            break L0;
          }
        }
        ((oj) this).field_k = ((oj) this).field_k + 1;
        ((oj) this).field_i = ((oj) this).field_i + (((oj) this).field_k + 1);
        var2 = 0;
        L1: while (true) {
          if (var2 <= -257) {
            return;
          } else {
            L2: {
              var3 = ((oj) this).field_g[var2];
              if (-1 == (2 & var2)) {
                if ((1 & var2) != 0) {
                  ((oj) this).field_b = ((oj) this).field_b ^ ((oj) this).field_b >>> 29190470;
                  break L2;
                } else {
                  ((oj) this).field_b = ((oj) this).field_b ^ ((oj) this).field_b << -122307251;
                  break L2;
                }
              } else {
                if (0 == (1 & var2)) {
                  ((oj) this).field_b = ((oj) this).field_b ^ ((oj) this).field_b << 300803714;
                  break L2;
                } else {
                  ((oj) this).field_b = ((oj) this).field_b ^ ((oj) this).field_b >>> -2050407312;
                  break L2;
                }
              }
            }
            ((oj) this).field_b = ((oj) this).field_b + ((oj) this).field_g[255 & var2 - -128];
            var4 = ((oj) this).field_g[pl.a(1020, var3) >> -1842873086] - -((oj) this).field_b - -((oj) this).field_i;
            ((oj) this).field_g[var2] = ((oj) this).field_g[pl.a(1020, var3) >> -1842873086] - -((oj) this).field_b - -((oj) this).field_i;
            ((oj) this).field_i = ((oj) this).field_g[pl.a(var4 >> 1658904392 >> -1774207230, 255)] - -var3;
            ((oj) this).field_d[var2] = ((oj) this).field_g[pl.a(var4 >> 1658904392 >> -1774207230, 255)] - -var3;
            var2++;
            continue L1;
          }
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        L0: {
          var11 = TetraLink.field_J;
          if (param0 == 3) {
            break L0;
          } else {
            var12 = null;
            oj.a((el) null, (byte) -74, true, (String) null);
            break L0;
          }
        }
        var4 = -1640531527;
        var7 = -1640531527;
        var10 = -1640531527;
        var5 = -1640531527;
        var6 = -1640531527;
        var9 = -1640531527;
        var8 = -1640531527;
        var3 = -1640531527;
        var2 = 0;
        L1: while (true) {
          if (4 <= var2) {
            var2 = 0;
            L2: while (true) {
              if (var2 >= 256) {
                var2 = 0;
                L3: while (true) {
                  if (256 <= var2) {
                    this.a(-27169);
                    ((oj) this).field_e = 256;
                    return;
                  } else {
                    var7 = var7 + ((oj) this).field_g[4 + var2];
                    var8 = var8 + ((oj) this).field_g[var2 - -5];
                    var5 = var5 + ((oj) this).field_g[var2 - -2];
                    var6 = var6 + ((oj) this).field_g[var2 - -3];
                    var9 = var9 + ((oj) this).field_g[var2 - -6];
                    var3 = var3 + ((oj) this).field_g[var2];
                    var10 = var10 + ((oj) this).field_g[7 + var2];
                    var4 = var4 + ((oj) this).field_g[1 + var2];
                    var3 = var3 ^ var4 << -1018032245;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> -225890622;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << -1601846168;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> 1149475280;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << -876683414;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> -1932321020;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 1712431368;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> 1497120233;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    ((oj) this).field_g[var2] = var3;
                    ((oj) this).field_g[1 + var2] = var4;
                    ((oj) this).field_g[var2 - -2] = var5;
                    ((oj) this).field_g[var2 - -3] = var6;
                    ((oj) this).field_g[4 + var2] = var7;
                    ((oj) this).field_g[var2 - -5] = var8;
                    ((oj) this).field_g[6 + var2] = var9;
                    ((oj) this).field_g[var2 - -7] = var10;
                    var2 += 8;
                    continue L3;
                  }
                }
              } else {
                var4 = var4 + ((oj) this).field_d[var2 + 1];
                var5 = var5 + ((oj) this).field_d[2 + var2];
                var6 = var6 + ((oj) this).field_d[3 + var2];
                var10 = var10 + ((oj) this).field_d[7 + var2];
                var7 = var7 + ((oj) this).field_d[var2 - -4];
                var9 = var9 + ((oj) this).field_d[var2 + 6];
                var3 = var3 + ((oj) this).field_d[var2];
                var8 = var8 + ((oj) this).field_d[var2 + 5];
                var3 = var3 ^ var4 << 442481387;
                var4 = var4 + var5;
                var6 = var6 + var3;
                var4 = var4 ^ var5 >>> 874404002;
                var5 = var5 + var6;
                var7 = var7 + var4;
                var5 = var5 ^ var6 << -1398672728;
                var8 = var8 + var5;
                var6 = var6 + var7;
                var6 = var6 ^ var7 >>> -2142958608;
                var9 = var9 + var6;
                var7 = var7 + var8;
                var7 = var7 ^ var8 << 232692394;
                var8 = var8 + var9;
                var10 = var10 + var7;
                var8 = var8 ^ var9 >>> -1460382076;
                var9 = var9 + var10;
                var3 = var3 + var8;
                var9 = var9 ^ var10 << -2033164696;
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> -755454071;
                var5 = var5 + var10;
                var3 = var3 + var4;
                ((oj) this).field_g[var2] = var3;
                ((oj) this).field_g[1 + var2] = var4;
                ((oj) this).field_g[2 + var2] = var5;
                ((oj) this).field_g[var2 + 3] = var6;
                ((oj) this).field_g[4 + var2] = var7;
                ((oj) this).field_g[5 + var2] = var8;
                ((oj) this).field_g[var2 - -6] = var9;
                ((oj) this).field_g[7 + var2] = var10;
                var2 += 8;
                continue L2;
              }
            }
          } else {
            var3 = var3 ^ var4 << 199334923;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> -1018823966;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << -1503936888;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> 1752384112;
            var7 = var7 + var8;
            var9 = var9 + var6;
            var7 = var7 ^ var8 << -8474070;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> -871322780;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << 2052962120;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> 82765673;
            var3 = var3 + var4;
            var5 = var5 + var10;
            var2++;
            continue L1;
          }
        }
    }

    oj(int[] param0) {
        int var2 = 0;
        ((oj) this).field_d = new int[256];
        ((oj) this).field_g = new int[256];
        for (var2 = 0; param0.length > var2; var2++) {
            ((oj) this).field_d[var2] = param0[var2];
        }
        this.b(3);
    }

    public static void a(byte param0) {
        field_f = null;
        field_j = null;
        field_a = null;
        field_h = null;
        int var1 = -111 % ((68 - param0) / 57);
    }

    final static int a(int param0, int param1, int param2) {
        if (param2 != 10121) {
            int discarded$0 = oj.a(-107, -60, -22);
        }
        if ((param0 ^ -1) == -2) {
            if (!(!bn.a(param2 ^ 10120, param1))) {
                return 29;
            }
        }
        return ai.field_a[param0];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "This password contains your Player Name, and would be easy to guess";
        field_h = "On";
    }
}
