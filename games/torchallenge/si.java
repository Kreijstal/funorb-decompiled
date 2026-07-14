/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends ic {
    static ka[][][] field_I;
    static int field_J;
    static int[] field_L;
    static String field_M;
    static int[] field_H;
    private sl field_G;
    static ka field_F;
    static int[] field_K;

    final void g(byte param0) {
        int var4 = TorChallenge.field_F ? 1 : 0;
        if (param0 != -37) {
            field_L = null;
        }
        nj var2 = new nj(((si) this).field_G);
        b var3 = (b) (Object) var2.c(0);
        while (var3 != null) {
            if (var3.h(124)) {
                var3.a(true);
            }
            var3 = (b) (Object) var2.a(false);
        }
    }

    final static void e(byte param0) {
        int var1 = 0;
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
        ka var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        L0: {
          var17 = TorChallenge.field_F ? 1 : 0;
          if (param0 == 125) {
            break L0;
          } else {
            field_K = null;
            break L0;
          }
        }
        var1 = ba.field_b[1].field_q + ba.field_b[0].field_q + ba.field_b[2].field_q;
        var2 = 3;
        var3 = lg.field_d[var2][8];
        var4 = ef.field_j[0];
        var5 = ef.field_j[1];
        var6 = var4 - var1 >> 1457670689;
        var7 = var4 - (var1 + (var6 << 1695363393) - var6);
        var8 = var5 + -var3 >> -1920367167;
        var9 = var8 + -(var8 << 1363238785) + var5 - var3;
        rj.a(2, var2, var3, ba.field_b, var1);
        ji.field_p = new ka[9];
        var12 = de.field_a;
        var15 = 0;
        L1: while (true) {
          if (var15 >= 9) {
            la.field_f.a(param0 + -188);
            ll.field_b = -1;
            return;
          } else {
            L2: {
              var16 = var15;
              if (var16 != 0) {
                if ((var16 ^ -1) == -3) {
                  break L2;
                } else {
                  if ((var16 ^ -1) == -7) {
                    break L2;
                  } else {
                    if ((var16 ^ -1) == -9) {
                      break L2;
                    } else {
                      L3: {
                        if (var16 == 1) {
                          break L3;
                        } else {
                          if (var16 != -8) {
                            L4: {
                              if (-4 == var16) {
                                break L4;
                              } else {
                                if (5 != var16) {
                                  if ((var16 ^ -1) == -5) {
                                    var13 = var12.field_q;
                                    var14 = var12.field_v;
                                    var1 = -var7 + (var13 + -var6) - ba.field_b[var15].field_q * 2;
                                    var3 = -(ba.field_b[var15].field_v * 2) + (-var8 + var14 + -var9);
                                    ji.field_p[var15] = new ka(var1, var3);
                                    ji.field_p[var15].d();
                                    var3 = ba.field_b[var15].field_v;
                                    var1 = ba.field_b[var15].field_q;
                                    var10 = -var6 + -var1;
                                    var11 = -var3 + -var8;
                                    var12.g(var10, var11);
                                    var15++;
                                    continue L1;
                                  } else {
                                    var15++;
                                    continue L1;
                                  }
                                } else {
                                  break L4;
                                }
                              }
                            }
                            L5: {
                              var14 = var12.field_v;
                              var1 = ba.field_b[var15].field_q;
                              var13 = var12.field_q;
                              var3 = -var9 + (var14 + -var8 + -(2 * ba.field_b[var15].field_v));
                              ji.field_p[var15] = new ka(var1, var3);
                              ji.field_p[var15].d();
                              var3 = ba.field_b[var15].field_v;
                              if (3 == var15) {
                                var10 = -var6;
                                break L5;
                              } else {
                                var10 = var7 + (-var13 + var1);
                                break L5;
                              }
                            }
                            var11 = -var3 + -var8;
                            var12.g(var10, var11);
                            var15++;
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L6: {
                        var14 = var12.field_v;
                        var13 = var12.field_q;
                        var3 = ba.field_b[var15].field_v;
                        var1 = -(ba.field_b[var15].field_q * 2) + (-var7 + -var6) + var13;
                        ji.field_p[var15] = new ka(var1, var3);
                        ji.field_p[var15].d();
                        var1 = ba.field_b[var15].field_q;
                        var10 = -var6 - var1;
                        if (1 == var15) {
                          var11 = -var8;
                          break L6;
                        } else {
                          var11 = var9 + (-var14 + var3);
                          break L6;
                        }
                      }
                      var12.g(var10, var11);
                      var15++;
                      continue L1;
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            L7: {
              L8: {
                var14 = var12.field_v;
                var13 = var12.field_q;
                var1 = ba.field_b[var15].field_q;
                var3 = ba.field_b[var15].field_v;
                ji.field_p[var15] = new ka(var1, var3);
                if (0 == var15) {
                  break L8;
                } else {
                  if ((var15 ^ -1) == -3) {
                    break L8;
                  } else {
                    var11 = var9 + -var14 - -var3;
                    break L7;
                  }
                }
              }
              var11 = -var8;
              break L7;
            }
            L9: {
              L10: {
                if (var15 == 0) {
                  break L10;
                } else {
                  if (-7 == (var15 ^ -1)) {
                    break L10;
                  } else {
                    var10 = var1 + -var13 + var7;
                    break L9;
                  }
                }
              }
              var10 = -var6;
              break L9;
            }
            ji.field_p[var15].d();
            var12.g(var10, var11);
            var15++;
            continue L1;
          }
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        int var7 = TorChallenge.field_F ? 1 : 0;
        if (null != ((si) this).field_q) {
            ((si) this).field_q.a((ee) this, param0, param1, (byte) 97, true);
        }
        nj var5 = new nj(((si) this).field_G);
        ee var6 = (ee) (Object) var5.a(-107);
        if (param2) {
            return;
        }
        while (var6 != null) {
            var6.a(((si) this).field_i + param0, ((si) this).field_m + param1, false, param3);
            var6 = (ee) (Object) var5.c((byte) -13);
        }
    }

    final static String h(int param0) {
        if (qc.field_i == gj.field_a) {
            return vb.field_m;
        }
        if (!(eh.field_p != qc.field_i)) {
            return ta.field_zb;
        }
        if (!ji.field_k.b(0)) {
            return ta.field_zb;
        }
        int var1 = -6 % ((78 - param0) / 36);
        return lg.field_b;
    }

    final static vh a(String param0, int param1) {
        if (param1 < 22) {
            Object var3 = null;
            si.a(true, (ka[]) null, -120, -97);
        }
        if (ji.field_k.b(0)) {
            if (!(param0.equals((Object) (Object) ji.field_k.a(0)))) {
                ji.field_k = og.a(param0, true);
            }
        }
        return ji.field_k;
    }

    final static void a(boolean param0, ka[] param1, int param2, int param3) {
        gb.field_f = new h(param1);
        if (!param0) {
            si.a(-13, (int[][]) null, 101, (int[][][]) null, -87, 90);
        }
        i.field_m = param3;
        mg.field_d = param2;
        rf.m(62);
    }

    final ee c(byte param0) {
        nj var2 = null;
        b var3 = null;
        int var4 = 0;
        L0: {
          var4 = TorChallenge.field_F ? 1 : 0;
          var2 = new nj(((si) this).field_G);
          if (param0 <= -24) {
            break L0;
          } else {
            field_L = null;
            break L0;
          }
        }
        var3 = (b) (Object) var2.c(0);
        L1: while (true) {
          if (var3 != null) {
            if (var3.field_K) {
              return var3.d((byte) 107);
            } else {
              var3 = (b) (Object) var2.a(false);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final static void a(int param0, int[][] param1, int param2, int[][][] param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TorChallenge.field_F ? 1 : 0;
        var7 = 64;
        var9 = 0;
        L0: while (true) {
          if (2 <= var9) {
            la.field_f.a(param5 + 104);
            if (param5 == 1) {
              return;
            } else {
              field_L = null;
              return;
            }
          } else {
            var10 = 0;
            L1: while (true) {
              if (var10 > 1) {
                var9++;
                continue L0;
              } else {
                sf.field_d[var9][param2][var10].d();
                qg.a(ae.field_y);
                var6 = param3[param2][var10][1] - param3[param2][var10][0];
                if ((var6 ^ -1) < -1) {
                  qg.a(0, 0, var6, var7);
                  var8 = param1[var10][param2];
                  od.a(nj.field_e[var9][var6 + -1], var8);
                  qg.b(ae.field_y);
                  la.field_f.a(-38);
                  var10++;
                  continue L1;
                } else {
                  var10++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void j(int param0) {
        int var4 = TorChallenge.field_F ? 1 : 0;
        nj var2 = new nj(((si) this).field_G);
        b var3 = (b) (Object) var2.c(0);
        while (var3 != null) {
            if (!(!var3.j(1))) {
                var3.a(true);
            }
            var3 = (b) (Object) var2.a(false);
        }
        if (param0 > -38) {
            ((si) this).field_G = null;
        }
        ((si) this).field_A = (ee) (Object) ((si) this).f((byte) 123);
    }

    final b f(byte param0) {
        nj var2 = null;
        b var3 = null;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = TorChallenge.field_F ? 1 : 0;
          var2 = new nj(((si) this).field_G);
          if (param0 == 123) {
            break L0;
          } else {
            var5 = null;
            ((si) this).a((byte) -70, (ee) null);
            break L0;
          }
        }
        var3 = (b) (Object) var2.c(0);
        L1: while (true) {
          if (var3 != null) {
            if (var3.field_K) {
              return var3;
            } else {
              var3 = (b) (Object) var2.a(false);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (!(!param3)) {
            var4 += 4;
        }
        if (!(!param2)) {
            var4 += 2;
        }
        if (!(!param0)) {
            var4++;
        }
        if (param1 != 8586514) {
            String discarded$0 = si.a(false, 58, false, false);
        }
        return ii.field_g[var4];
    }

    public static void d(byte param0) {
        field_K = null;
        int var1 = 74 % ((param0 - 15) / 51);
        field_H = null;
        field_I = null;
        field_F = null;
        field_M = null;
        field_L = null;
    }

    final void i(int param0) {
        int var4 = TorChallenge.field_F ? 1 : 0;
        nj var2 = new nj(((si) this).field_G);
        b var3 = (b) (Object) var2.c(0);
        while (var3 != null) {
            var3.field_K = false;
            var3 = (b) (Object) var2.a(false);
        }
        ((si) this).field_A = null;
        if (param0 != 8389905) {
            si.e((byte) 49);
        }
    }

    final void a(byte param0, ee param1) {
        if (param0 < 52) {
            return;
        }
        if (!(param1 instanceof b)) {
            throw new IllegalArgumentException();
        }
        b var3 = (b) (Object) param1;
        ((si) this).field_G.a((byte) 119, (da) (Object) var3);
        var3.field_K = true;
        boolean discarded$0 = var3.a((ee) this, 0);
    }

    public si() {
        super(0, 0, TorChallenge.field_G, md.field_h, (j) null, (gg) null);
        ((si) this).field_G = new sl();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new int[]{6882317, 8389905, 8586514, 6882317};
        field_L = new int[2];
        field_M = "Start Game";
        field_K = new int[8192];
    }
}
