/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf {
    private int[] field_n;
    static int field_k;
    private int[] field_j;
    private int[] field_a;
    static qe[] field_f;
    private int[] field_l;
    static ge field_h;
    private int field_g;
    static int field_b;
    static cn field_d;
    static String field_o;
    private int[] field_c;
    private int[] field_i;
    static tf field_m;
    static cn[] field_e;

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = DungeonAssault.field_K;
        ((bf) this).field_l = new int[200];
        if (param1 != 31) {
            return;
        }
        ((bf) this).field_a = new int[200];
        ((bf) this).field_g = 0;
        ((bf) this).field_j = new int[200];
        ((bf) this).field_c = new int[200];
        int var3 = param0 & 16711935;
        int var4 = param0 & 65280;
        ((bf) this).field_i = new int[64];
        for (var5 = 0; 64 > var5; var5++) {
            var6 = (var5 << 582045538) * var3 & -16711936 | 16711680 & (var5 << 947054850) * var4;
            ((bf) this).field_i[var5] = var6 >> 425199688;
        }
        var4 = param0 & 65280;
        var3 = param0 & 16711935;
        ((bf) this).field_n = new int[32];
        for (var5 = 0; (var5 ^ -1) > -17; var5++) {
            var6 = var5 * var4 & 1044480 | 267390960 & var3 * var5;
            ((bf) this).field_n[var5] = var6 >> -1137211804;
            ((bf) this).field_n[31 - var5] = var6 >> -1137211804;
        }
    }

    final static void a(String param0, tg param1, int param2, se param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = DungeonAssault.field_K;
          if (param4 == 15553) {
            break L0;
          } else {
            bf.a((byte) -113);
            break L0;
          }
        }
        var5 = 0;
        var6 = -1;
        var7 = 1;
        L1: while (true) {
          if (param0.length() <= var7) {
            return;
          } else {
            L2: {
              var8 = param0.charAt(var7);
              if (var8 != 60) {
                break L2;
              } else {
                var6 = param1.field_k[0] + ((var5 >> 1733273544) + param3.b(param0.substring(0, var7)));
                break L2;
              }
            }
            L3: {
              if (0 != (var6 ^ -1)) {
                param1.field_k[var7] = var6;
                break L3;
              } else {
                L4: {
                  if (var8 == 32) {
                    var5 = var5 + param2;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                param1.field_k[var7] = param1.field_k[0] + ((var5 >> -1100026296) - -param3.b(param0.substring(0, 1 + var7))) - param3.a((char) var8);
                break L3;
              }
            }
            if (62 == var8) {
              var6 = -1;
              var7++;
              continue L1;
            } else {
              var7++;
              continue L1;
            }
          }
        }
    }

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = DungeonAssault.field_K;
          gf.a(kd.field_g);
          gf.e(41, 48, 599, 416);
          if (param0) {
            var2 = oi.b(0, 3);
            var3 = oi.b(0, 3);
            dm.field_d[var2].c(41, 48);
            qi.field_f[var3].c(-qi.field_f[0].field_y + 599, 48);
            df.field_c.c(41 - -dm.field_d[var2].field_y, 48);
            break L0;
          } else {
            var2 = 41;
            L1: while (true) {
              if (-600 >= (var2 ^ -1)) {
                break L0;
              } else {
                df.field_c.c(var2, 48);
                var2 = var2 + df.field_c.field_E;
                continue L1;
              }
            }
          }
        }
        L2: {
          gf.b(kd.field_g);
          c.a(0, 640, 0, (byte) 80);
          c.a(0, 640, 40, (byte) 46);
          vf.a(432, true, 33, -75, 48);
          vf.a(432, true, 599, 113, 48);
          vf.a(32, true, 164, -113, 8);
          if (param1 <= -127) {
            break L2;
          } else {
            field_m = null;
            break L2;
          }
        }
        vf.a(32, true, 468, 108, 8);
        un.a(41, (byte) 77, 558, 416, true);
        ad.field_e.h(41, 48);
        ad.field_e.j(-ad.field_e.field_d + 599, 48);
        ad.field_e.f(164 + -ad.field_e.field_d, 40 + -ad.field_e.field_b);
        ad.field_e.i(172, -ad.field_e.field_b + 40);
        ad.field_e.f(-ad.field_e.field_d + 468, -ad.field_e.field_b + 40);
        ad.field_e.i(476, -ad.field_e.field_b + 40);
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = DungeonAssault.field_K;
        gf.f(param1, param0, param3 >> 1173500129, 0);
        gf.h(param1, param0, param3 >> 2028471553, ((bf) this).field_i[63]);
        var9 = 0;
        if (param2) {
          L0: while (true) {
            if (200 <= var9) {
              gf.g(param1, param0, param3 >> -1137256799, 0, 50);
              gf.a(param1 << -1761583996, param0 << -1461012444, param3 - -2 << -514573916 >> -838700575, 192, ((bf) this).field_n);
              gf.a(param1 << 279059140, param0 << 969852164, 2 + param3 << -236645245, 192, ((bf) this).field_n);
              gf.a(param1 << -1231437852, param0 << 82903108, param3 - -2 << 185029571, 192, ((bf) this).field_n);
              gf.a(param1 << -1036841724, param0 << 990036260, 2 + param3 << 1381074051, 192, ((bf) this).field_n);
              return;
            } else {
              var7 = ((((bf) this).field_l[var9] >> -1665340956) * (((bf) this).field_l[var9] >> -10622556) - -((((bf) this).field_a[var9] >> 1115999204) * (((bf) this).field_a[var9] >> 1119882436))) / 3;
              if (-1 > (var7 ^ -1)) {
                L1: {
                  var8 = var7 >> 1498990724;
                  var5 = (int)((double)(((bf) this).field_l[var9] * param3) / Math.sqrt((double)(3 * var7)));
                  if ((var8 ^ -1) >= -64) {
                    break L1;
                  } else {
                    var8 = 63;
                    break L1;
                  }
                }
                var6 = (int)((double)(param3 * ((bf) this).field_a[var9]) / Math.sqrt((double)(var7 * 3)));
                var7 = var7 * param3;
                gf.b((var5 >> 1877386529) + (param1 << -742482140), (var6 >> 528464161) - -(param0 << -998888508), var7 >> 1088564074, var8, ((bf) this).field_i);
                var9++;
                continue L0;
              } else {
                var9++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_o = null;
        field_f = null;
        if (param0 != 85) {
            return;
        }
        field_m = null;
        field_d = null;
        field_e = null;
        field_h = null;
    }

    final static void b(int param0) {
        int var2 = 0;
        pm var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        wj var13 = null;
        int var14 = 0;
        int var15 = 0;
        wj var16 = null;
        int[][] var20 = null;
        L0: {
          var12 = DungeonAssault.field_K;
          var13 = ra.field_c;
          var16 = var13;
          var2 = var16.c(true);
          if (param0 == 19664) {
            break L0;
          } else {
            field_k = -97;
            break L0;
          }
        }
        var3 = (pm) (Object) li.field_a.e(param0 ^ -4796);
        L1: while (true) {
          L2: {
            if (var3 == null) {
              break L2;
            } else {
              if (var3.field_j == var2) {
                break L2;
              } else {
                var3 = (pm) (Object) li.field_a.a(4);
                continue L1;
              }
            }
          }
          if (var3 == null) {
            tl.a(param0 ^ -19664);
            return;
          } else {
            L3: {
              var4 = var16.c(true);
              if (var4 != 0) {
                ah.field_c[0] = tc.field_u;
                var5 = var3.field_i;
                var6_int = 1;
                L4: while (true) {
                  if (var4 <= var6_int) {
                    hg.a(param0 + 12087, var5, var4);
                    var6_int = 0;
                    L5: while (true) {
                      if (var4 <= var6_int) {
                        kj.a(var5, 0);
                        var6 = new String[2][var5];
                        var20 = new int[2][var5 * 4];
                        var8 = lc.field_d;
                        var9 = 0;
                        var10 = 0;
                        L6: while (true) {
                          if (var8 <= var9) {
                            var14 = 0;
                            var9 = var14;
                            var15 = 0;
                            var10 = var15;
                            L7: while (true) {
                              if (var14 >= var8) {
                                break L3;
                              } else {
                                var11 = ol.field_k[var14 + var5];
                                var6[1][var15] = ah.field_c[var11];
                                var20[1][var15 * 4] = i.field_t[var11];
                                var20[1][4 * var15 + 1] = mf.field_d[var11];
                                var20[1][4 * var15 + 2] = wa.field_m[var11];
                                var20[1][var15 * 4 + 3] = tc.field_w[var11];
                                if (eh.a(true, ah.field_c[var11])) {
                                  if (tc.field_w[var11] + wa.field_m[var11] + mf.field_d[var11] == 0) {
                                    var6[1][var15] = null;
                                    var15--;
                                    var14++;
                                    var15++;
                                    continue L7;
                                  } else {
                                    var14++;
                                    var15++;
                                    continue L7;
                                  }
                                } else {
                                  var14++;
                                  var15++;
                                  continue L7;
                                }
                              }
                            }
                          } else {
                            var11 = ol.field_k[var9];
                            var6[0][var10] = ah.field_c[var11];
                            var20[0][var10 * 4] = i.field_t[var11];
                            var20[0][1 + var10 * 4] = mf.field_d[var11];
                            var20[0][2 + var10 * 4] = wa.field_m[var11];
                            var20[0][4 * var10 - -3] = tc.field_w[var11];
                            if (eh.a(true, ah.field_c[var11])) {
                              if (wa.field_m[var11] + mf.field_d[var11] - -tc.field_w[var11] == 0) {
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
                        dj.a((ec) (Object) var16, (byte) 123);
                        if (var6_int != 0) {
                          oc.a(var6_int, (byte) -59, dh.field_g, cm.field_P, fm.field_g, ln.field_e);
                          var6_int++;
                          continue L5;
                        } else {
                          oc.a(var6_int, (byte) -66, dh.field_g, cm.field_P, fm.field_g, ln.field_e);
                          var6_int++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    ah.field_c[var6_int] = var13.d(-108);
                    var6_int++;
                    continue L4;
                  }
                }
              } else {
                break L3;
              }
            }
            var3.a(false);
            return;
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        double var3 = 0.0;
        int var5 = 0;
        var5 = DungeonAssault.field_K;
        if (param0 <= -84) {
          var2 = 0;
          L0: while (true) {
            if ((var2 ^ -1) <= -201) {
              L1: {
                var2 = 864 + oi.b(0, 160);
                var3 = 0.01 * (double)oi.b(0, 21400);
                ((bf) this).field_c[((bf) this).field_g] = (int)((double)var2 * Math.sin(var3));
                ((bf) this).field_j[((bf) this).field_g] = (int)((double)var2 * Math.cos(var3));
                ((bf) this).field_g = ((bf) this).field_g + 1;
                if ((((bf) this).field_g ^ -1) > -201) {
                  break L1;
                } else {
                  ((bf) this).field_g = 0;
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                if (((bf) this).field_l[var2] >= ((bf) this).field_c[var2]) {
                  break L2;
                } else {
                  ((bf) this).field_l[var2] = ((bf) this).field_l[var2] + 6;
                  break L2;
                }
              }
              L3: {
                if (((bf) this).field_c[var2] < ((bf) this).field_l[var2]) {
                  ((bf) this).field_l[var2] = ((bf) this).field_l[var2] - 3;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (((bf) this).field_j[var2] <= ((bf) this).field_a[var2]) {
                  break L4;
                } else {
                  ((bf) this).field_a[var2] = ((bf) this).field_a[var2] + 3;
                  break L4;
                }
              }
              if (((bf) this).field_a[var2] > ((bf) this).field_j[var2]) {
                ((bf) this).field_a[var2] = ((bf) this).field_a[var2] - 6;
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static int a(int param0, int param1, byte param2) {
        int var4 = DungeonAssault.field_K;
        if (param2 >= -9) {
            return -99;
        }
        int var3 = 1;
        while (param0 > 1) {
            if (!((1 & param0) == 0)) {
                var3 = var3 * param1;
            }
            param0 = param0 >> 1;
            param1 = param1 * param1;
        }
        if ((param0 ^ -1) == -2) {
            return var3 * param1;
        }
        return var3;
    }

    final static void a(int param0, int param1, int param2, int param3, String param4) {
        kn.a(param2, param4 + "_defeat", param1, param0, 125, 96, param4 + "_special", param4 + "_reveal");
        if (param3 != -18228) {
            bf.a((byte) -43);
        }
    }

    bf(int param0) {
        int var2 = 0;
        this.a(param0, 31);
        for (var2 = 0; var2 < 100; var2++) {
            ((bf) this).a(-105);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new qe[14];
    }
}
