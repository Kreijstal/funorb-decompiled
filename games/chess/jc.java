/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    o field_a;
    static String field_e;
    static km[] field_d;
    static String field_b;
    static String field_c;
    static boolean[][] field_g;
    static int field_f;
    private o field_h;

    final o g(int param0) {
        o var2 = ((jc) this).field_a.field_h;
        if (param0 != -18110) {
            Object var3 = null;
            o discarded$0 = ((jc) this).b((o) null, (byte) -57);
        }
        if (!(var2 != ((jc) this).field_a)) {
            ((jc) this).field_h = null;
            return null;
        }
        ((jc) this).field_h = var2.field_h;
        return var2;
    }

    final o a(boolean param0) {
        if (!param0) {
            jc.d(73);
        }
        o var2 = ((jc) this).field_h;
        if (((jc) this).field_a == var2) {
            ((jc) this).field_h = null;
            return null;
        }
        ((jc) this).field_h = var2.field_c;
        return var2;
    }

    final static void a(int param0) {
        String var3 = null;
        if (null != i.field_c) {
            var3 = i.field_c;
            String var1 = var3;
            nj.a((byte) -101, oc.a(vh.field_a, new String[1], (byte) -121));
            i.field_c = null;
        }
        if (param0 != -26285) {
            Object var2 = null;
            jc.a(-114, (String) null, (byte) -108);
        }
    }

    final o f(int param0) {
        o var2 = ((jc) this).field_a.field_h;
        if (param0 != 1184188328) {
            ((jc) this).field_h = null;
        }
        if (((jc) this).field_a == var2) {
            return null;
        }
        var2.c(-2193);
        return var2;
    }

    final static km[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        km[] var10 = null;
        km[] var11_ref_km__ = null;
        int var11 = 0;
        int var12 = 0;
        km var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = Chess.field_G;
        var9 = param6 - (-param1 - param4);
        var10 = new km[]{new km(var9, var9), new km(param0, var9), new km(var9, var9), new km(var9, param0), new km(64, 64), new km(var9, param0), new km(var9, var9), new km(param0, var9), new km(var9, var9)};
        var11_ref_km__ = var10;
        var12 = param8;
        L0: while (true) {
          if (var11_ref_km__.length <= var12) {
            var11 = 0;
            L1: while (true) {
              if (var11 >= param6) {
                var11 = 0;
                L2: while (true) {
                  if (var11 >= param6) {
                    var11 = 0;
                    L3: while (true) {
                      if (var11 >= param0) {
                        var11 = 0;
                        L4: while (true) {
                          if (var11 >= param0 >> 1567522209) {
                            return var10;
                          } else {
                            var12 = 0;
                            L5: while (true) {
                              if (param4 <= var12) {
                                var11++;
                                continue L4;
                              } else {
                                var10[1].field_x[(-1 + (-var12 + var9)) * param0 + var11] = param7;
                                var10[3].field_x[var11 * var9 - (1 + (-var9 - -var12))] = param7;
                                var10[7].field_x[var11 + var12 * param0] = param7;
                                var10[5].field_x[var12 + var9 * var11] = param7;
                                var12++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L6: while (true) {
                          if (var12 < param6) {
                            var10[7].field_x[var11 + (-var12 + (var9 - 1)) * param0] = param2;
                            var10[5].field_x[var11 * var9 + var9 - 1 + -var12] = param2;
                            var10[1].field_x[var11 + var12 * param0] = param5;
                            var10[3].field_x[var12 + var9 * var11] = param5;
                            var12++;
                            continue L6;
                          } else {
                            var11++;
                            continue L3;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L7: while (true) {
                      if (var9 > var12) {
                        var10[0].field_x[var12 + var9 * var11] = param5;
                        var10[0].field_x[var11 + var9 * var12] = param5;
                        if (-var11 + var9 > var12) {
                          var10[2].field_x[var12 + var11 * var9] = param5;
                          var10[6].field_x[var12 * var9 + var11] = param5;
                          var12++;
                          continue L7;
                        } else {
                          var12++;
                          continue L7;
                        }
                      } else {
                        var11++;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L8: while (true) {
                  if (var12 < var9) {
                    var10[6].field_x[var9 * (var9 - var11 + -1) + var12] = param2;
                    var10[8].field_x[var12 + var9 * (-1 + (var9 - var11))] = param2;
                    var10[2].field_x[var9 * var12 - (var11 + (1 + -var9))] = param2;
                    var10[8].field_x[-var11 + (-1 + var9 + var9 * var12)] = param2;
                    var12++;
                    continue L8;
                  } else {
                    var11++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_km__[var12];
            var14 = 0;
            L9: while (true) {
              if (var14 >= var13.field_x.length) {
                var12++;
                continue L0;
              } else {
                var13.field_x[var14] = param3;
                var14++;
                continue L9;
              }
            }
          }
        }
    }

    final boolean h(int param0) {
        int var2 = -86 / ((65 - param0) / 48);
        return ((jc) this).field_a.field_h == ((jc) this).field_a ? true : false;
    }

    final static void a(int param0, String param1, byte param2) {
        int var4 = 0;
        int var3 = -95 % ((param2 - 19) / 49);
        cf.field_Nb = false;
        bc.field_d = false;
        if (null != ua.field_d) {
            if (!ua.field_d.field_P) {
            } else {
                var4 = 1;
                if (param0 == 8) {
                    param0 = 2;
                    if (!dk.field_g) {
                        param1 = s.field_R;
                    } else {
                        param1 = td.field_r;
                    }
                    um.field_b.a(pi.field_a, 20);
                }
                if (!((param0 ^ -1) != -11)) {
                    var4 = 0;
                    oj.a(124);
                }
                if (var4 != 0) {
                    if (bc.field_d) {
                        param1 = oc.a(aj.field_b, new String[1], (byte) -92);
                    }
                    if (!(!ag.field_e)) {
                        param1 = rd.field_a;
                    }
                    ua.field_d.a(param0, param1, (byte) 33);
                }
                if (param0 != 256) {
                    if (!((param0 ^ -1) == -11)) {
                        if (!dk.field_g) {
                            um.field_b.g((byte) -14);
                        }
                    }
                }
            }
        }
    }

    public static void d(int param0) {
        if (param0 != -31) {
            return;
        }
        field_c = null;
        field_e = null;
        field_g = null;
        field_d = null;
        field_b = null;
    }

    final o b(o param0, byte param1) {
        o var3 = null;
        if (param0 == null) {
            var3 = ((jc) this).field_a.field_h;
        } else {
            var3 = param0;
        }
        if (!(var3 != ((jc) this).field_a)) {
            ((jc) this).field_h = null;
            return null;
        }
        int var4 = 23 / ((param1 - -78) / 35);
        ((jc) this).field_h = var3.field_h;
        return var3;
    }

    final static void a(int param0, byte param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Chess.field_G;
        if ((sl.field_a ^ -1) > -1) {
          return;
        } else {
          L0: {
            if (param1 == -117) {
              break L0;
            } else {
              field_c = null;
              break L0;
            }
          }
          L1: {
            var3 = -135 + param2;
            var4 = -35 + param0;
            var5 = 256;
            if ((sl.field_a ^ -1) > -76) {
              var5 = (sl.field_a << -229179608) / 75;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if ((sl.field_a ^ -1) < -201) {
              var5 = (-sl.field_a + 250 << 1016168008) / 50;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            tl.a((byte) -67, gf.field_f);
            nh.a();
            wb.b();
            di.k(9);
            if (var5 < 256) {
              wb.b(0, 0, wb.field_h, wb.field_c, 0, -var5 + 256);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            fd.a(28773);
            if (-151 >= (sl.field_a ^ -1)) {
              v.field_i.b(15 + var3, var4 + 10, var5);
              break L4;
            } else {
              gf.field_f.c(var3, var4);
              break L4;
            }
          }
          L5: {
            var6 = sl.field_a - 125;
            if (-1 <= (var6 ^ -1)) {
              break L5;
            } else {
              if (50 <= var6) {
                break L5;
              } else {
                if ((var6 ^ -1) <= -21) {
                  if ((var6 ^ -1) <= -31) {
                    var7 = (50 - var6) * 256 / 20;
                    tg.field_u.d(var3, var4, var7);
                    break L5;
                  } else {
                    tg.field_u.d(var3, var4, 256);
                    break L5;
                  }
                } else {
                  var7 = 256 * var6 / 20;
                  tg.field_u.d(var3, var4, var7);
                  break L5;
                }
              }
            }
          }
          L6: {
            var6 = -140 + sl.field_a;
            if ((var6 ^ -1) >= -1) {
              break L6;
            } else {
              L7: {
                var7 = 256;
                if (-21 >= (var6 ^ -1)) {
                  break L7;
                } else {
                  var7 = var6 * 256 / 20;
                  break L7;
                }
              }
              re.field_u.b(var3 - -15, var4 - -10, var5 * var7 >> 1184188328);
              break L6;
            }
          }
          return;
        }
    }

    final void a(o param0, int param1) {
        if (param1 < 68) {
            field_g = null;
        }
        if (param0.field_c != null) {
            param0.c(-2193);
        }
        param0.field_h = ((jc) this).field_a.field_h;
        param0.field_c = ((jc) this).field_a;
        param0.field_c.field_h = param0;
        param0.field_h.field_c = param0;
    }

    final o a(byte param0) {
        o var2 = ((jc) this).field_h;
        if (((jc) this).field_a == var2) {
            ((jc) this).field_h = null;
            return null;
        }
        if (param0 >= -90) {
            jc.d(9);
        }
        ((jc) this).field_h = var2.field_h;
        return var2;
    }

    final o c(int param0) {
        o var2 = ((jc) this).field_a.field_c;
        if (var2 == ((jc) this).field_a) {
            return null;
        }
        var2.c(-2193);
        if (param0 < 42) {
            return null;
        }
        return var2;
    }

    final void a(o param0, byte param1) {
        if (!(param0.field_c == null)) {
            param0.c(-2193);
        }
        param0.field_h = ((jc) this).field_a;
        int var3 = 69 % ((param1 - 28) / 56);
        param0.field_c = ((jc) this).field_a.field_c;
        param0.field_c.field_h = param0;
        param0.field_h.field_c = param0;
    }

    final o b(int param0) {
        o var2 = ((jc) this).field_a.field_c;
        if (((jc) this).field_a == var2) {
            ((jc) this).field_h = null;
            return null;
        }
        if (param0 != 28937) {
            return null;
        }
        ((jc) this).field_h = var2.field_c;
        return var2;
    }

    final static void a(byte param0, String[] param1) {
        if (null != kb.field_O) {
            kb.field_O.field_Y.a(param1, -1);
        }
        if (param0 < 88) {
            field_b = null;
        }
        if (hn.field_u != null) {
            hn.field_u.field_Q.a(param1, -1);
        }
    }

    final void e(int param0) {
        o var2 = null;
        int var3 = 0;
        var3 = Chess.field_G;
        L0: while (true) {
          var2 = ((jc) this).field_a.field_h;
          if (var2 != ((jc) this).field_a) {
            var2.c(param0 + 28830);
            continue L0;
          } else {
            if (param0 == -31023) {
              ((jc) this).field_h = null;
              return;
            } else {
              return;
            }
          }
        }
    }

    public jc() {
        ((jc) this).field_a = new o();
        ((jc) this).field_a.field_h = ((jc) this).field_a;
        ((jc) this).field_a.field_c = ((jc) this).field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Rating";
        field_c = "Set up new unrated game";
        field_b = "<%0> has not yet unlocked this option for use.";
    }
}
