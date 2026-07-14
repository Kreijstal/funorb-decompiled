/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends lh {
    private wk field_Y;
    private int field_S;
    private wk field_K;
    private int field_V;
    private wk[] field_R;
    boolean field_N;
    private int field_G;
    static fm field_M;
    private int field_T;
    private wk field_L;
    private int field_Q;
    int field_I;
    static String field_X;
    private int field_J;
    static int[] field_W;
    static String field_ab;
    static int field_Z;
    static String field_U;
    static String field_O;
    static String field_H;
    static String field_P;

    public static void g(int param0) {
        field_M = null;
        field_O = null;
        if (param0 != -47) {
            field_X = null;
        }
        field_U = null;
        field_X = null;
        field_ab = null;
        field_W = null;
        field_H = null;
        field_P = null;
    }

    final void b(int param0, int param1, int param2) {
        ((bk) this).field_V = param1;
        ((bk) this).field_J = param0;
        ((bk) this).field_Q = (param2 & param0) >> 319396897;
        ((bk) this).field_S = 8355711 & param1 >> -18243583;
        this.f(-99);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (-1 != (param3 ^ -1)) {
            return;
        }
        int var5 = param2 + ((bk) this).field_o;
        int var6 = ((bk) this).field_z + param0;
        if (param1 > -99) {
            ((bk) this).b(49, -19, 99);
        }
        this.a(var5, (byte) -8, var6, ((bk) this).field_R[0]);
        if (!((((bk) this).field_I ^ -1) <= -65537)) {
            fe.a((((bk) this).field_I * ((bk) this).field_x >> 1654253008) + var5, var6, 115, ((bk) this).field_x + var5, ((bk) this).field_E + var6);
            this.a(var5, (byte) -87, var6, ((bk) this).field_R[1]);
            tk.f((byte) 97);
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, (byte) -108, param2, param3, param4);
        this.f(-85);
        if (param1 > -71) {
            Object var7 = null;
            this.a(13, (byte) 41, 96, (wk) null);
        }
    }

    final void a(int param0, int param1, lh param2, int param3) {
        if (!(!((bk) this).field_N)) {
            ((bk) this).field_G = ((bk) this).field_G + 1;
            if (((bk) this).field_T * 2 < ((bk) this).field_G) {
                ((bk) this).field_G = ((bk) this).field_G - 2 * ((bk) this).field_T;
            }
        }
        if (param1 <= 56) {
            ((bk) this).field_J = 1;
        }
    }

    private final wk a(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        wk var14 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var13 = SteelSentinels.field_G;
          var14 = new wk(2 * ((bk) this).field_T, ((bk) this).field_E);
          q.a(var14, (byte) -116);
          if (param1 == 18634) {
            break L0;
          } else {
            field_W = null;
            break L0;
          }
        }
        var5 = ((bk) this).field_E >> 1940777857;
        var6 = 0;
        L1: while (true) {
          if (((bk) this).field_E <= var6) {
            tk.f((byte) 107);
            return var14;
          } else {
            L2: {
              var7 = (var6 >> -1836424575) * (((bk) this).field_T * 2 + -1) % (2 * ((bk) this).field_T);
              var8 = param2 & 16711935;
              var9 = param2 & 65280;
              var10 = var6 + -var5;
              var11 = (int)(Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5 * 128.0) + 128;
              if (256 <= var11) {
                stackOut_6_0 = var8 | var9;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = (16711680 & var11 * var9 | -16711936 & var11 * var8) >>> 1727910216;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var12 = stackIn_7_0;
              pb.g(var7, var6, ((bk) this).field_T, var12);
              pb.g(var7 - 2 * ((bk) this).field_T, var6, ((bk) this).field_T, var12);
              var9 = 65280 & param0;
              var8 = 16711935 & param0;
              if ((var11 ^ -1) > -257) {
                stackOut_9_0 = (16711680 & var11 * var9 | var8 * var11 & -16711936) >>> -74051672;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = var8 | var9;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var12 = stackIn_10_0;
            pb.g(var7 - -((bk) this).field_T, var6, ((bk) this).field_T, var12);
            pb.g(-((bk) this).field_T + var7, var6, ((bk) this).field_T, var12);
            var6++;
            continue L1;
          }
        }
    }

    private final void a(int param0, byte param1, int param2, wk param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = SteelSentinels.field_G;
          var5 = ((bk) this).field_x + param0;
          fe.a(((bk) this).field_L.field_A + param0, param2, 86, -((bk) this).field_L.field_A + var5, ((bk) this).field_E + param2);
          var6 = -((bk) this).field_G + param0;
          if (param1 < -6) {
            break L0;
          } else {
            field_P = null;
            break L0;
          }
        }
        L1: while (true) {
          if (var5 <= var6) {
            L2: {
              tk.f((byte) 113);
              if (((bk) this).field_L.field_A + param0 < pb.field_i) {
                break L2;
              } else {
                q.a(((bk) this).field_Y, (byte) -75);
                param3.a(-((bk) this).field_G, 0);
                param3.a(2 * ((bk) this).field_T - ((bk) this).field_G, 0);
                ((bk) this).field_K.c(0, 0);
                tk.f((byte) 107);
                ((bk) this).field_Y.a(param0, param2);
                break L2;
              }
            }
            L3: {
              if (pb.field_b < var5 - ((bk) this).field_L.field_A) {
                break L3;
              } else {
                q.a(((bk) this).field_Y, (byte) -63);
                var7 = -((bk) this).field_L.field_A + (((bk) this).field_x + ((bk) this).field_G);
                L4: while (true) {
                  if (2 * ((bk) this).field_T >= var7) {
                    param3.a(-var7, 0);
                    param3.a(((bk) this).field_T * 2 - var7, 0);
                    ((bk) this).field_L.c(0, 0);
                    tk.f((byte) 109);
                    ((bk) this).field_Y.a(var5 + -((bk) this).field_L.field_A, param2);
                    break L3;
                  } else {
                    var7 = var7 - 2 * ((bk) this).field_T;
                    continue L4;
                  }
                }
              }
            }
            return;
          } else {
            param3.a(var6, param2);
            var6 = var6 + param3.field_A;
            continue L1;
          }
        }
    }

    final static ef a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        var6 = SteelSentinels.field_G;
        var2 = param1.length();
        if (var2 != -1) {
          if (-65 >= var2) {
            if (param0 >= 86) {
              if (param1.charAt(0) == 34) {
                if (34 != param1.charAt(-1 + var2)) {
                  return ec.field_b;
                } else {
                  var3 = 0;
                  var4 = 1;
                  L0: while (true) {
                    if (var2 + -1 > var4) {
                      var5 = param1.charAt(var4);
                      if (92 == var5) {
                        L1: {
                          if (var3 != 0) {
                            stackOut_18_0 = 0;
                            stackIn_19_0 = stackOut_18_0;
                            break L1;
                          } else {
                            stackOut_17_0 = 1;
                            stackIn_19_0 = stackOut_17_0;
                            break L1;
                          }
                        }
                        var3 = stackIn_19_0;
                        var4++;
                        continue L0;
                      } else {
                        L2: {
                          if (var5 != 34) {
                            break L2;
                          } else {
                            if (var3 != 0) {
                              break L2;
                            } else {
                              return ec.field_b;
                            }
                          }
                        }
                        var3 = 0;
                        var4++;
                        continue L0;
                      }
                    } else {
                      return null;
                    }
                  }
                }
              } else {
                var3 = 0;
                var4 = 0;
                L3: while (true) {
                  if (var2 > var4) {
                    var5 = param1.charAt(var4);
                    if (var5 == 46) {
                      L4: {
                        if (0 == var4) {
                          break L4;
                        } else {
                          if (var4 == var2 - 1) {
                            break L4;
                          } else {
                            if (var3 != 0) {
                              break L4;
                            } else {
                              var3 = 1;
                              var4++;
                              continue L3;
                            }
                          }
                        }
                      }
                      return ec.field_b;
                    } else {
                      if (nc.field_g.indexOf(var5) == -1) {
                        return ec.field_b;
                      } else {
                        var3 = 0;
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            return ma.field_cb;
          }
        } else {
          return ud.field_A;
        }
    }

    private final void f(int param0) {
        ((bk) this).field_R = new wk[]{this.a(((bk) this).field_J, 18634, ((bk) this).field_V), this.a(((bk) this).field_Q, 18634, ((bk) this).field_S)};
        if (param0 > -66) {
            return;
        }
        ((bk) this).field_L = this.a((byte) -127);
        ((bk) this).field_K = ((bk) this).field_L.a();
        ((bk) this).field_Y = new wk(((bk) this).field_E >> 809456833, ((bk) this).field_E);
    }

    final static void a(cm param0, byte param1, mi param2) {
        int var3 = 0;
        int var4 = 0;
        mn var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var16 = null;
        var10 = SteelSentinels.field_G;
        var3 = dh.field_D;
        qf.field_c = new gh(0L, (gh) null);
        var4 = -124 / ((param1 - -78) / 32);
        if (param0 != null) {
          param0.field_d = 0;
          param0.field_f = false;
          cd.field_e = new co(var3, param0, param0);
          jl.field_w = new oe(var3, param0, param0, (om) (Object) new kb());
          var5 = ul.d(0);
          if (var5 != null) {
            fc.a(var5, 101);
            pg.field_u = fm.a(65793, false, 2245737, 1127256, 65793, 4020342, 1513239, 0, 1513239, 5138823, 8947848, (mi) null, 65793);
            ea.field_f = fm.a(0, false, 0, 0, 0, 0, 0, 16764006, 0, 0, 0, param2, 0);
            fb.field_l = fm.a(0, false, 0, 0, 0, 0, 0, 16777215, 0, 0, 0, param2, 0);
            var6 = pb.field_c;
            var7 = pb.field_j;
            var16 = pb.field_g;
            ik.field_g = new wk(10, 14);
            ik.field_g.d();
            var9 = 2;
            L0: while (true) {
              if (var9 >= 7) {
                pb.a(var16, var6, var7);
                ti.field_m = sg.a(fb.field_l, var5, false, ea.field_f, pg.field_u);
                qf.field_c.field_M = new ul();
                return;
              } else {
                pb.d(var9, var9 + 1, 14 - (var9 << -216964607), 16777215);
                var9++;
                continue L0;
              }
            }
          } else {
            sj.a("QC2", -49, (Throwable) null);
            return;
          }
        } else {
          sj.a("QC1", -29, (Throwable) null);
          return;
        }
    }

    bk(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (16711422 & param5) >> -1312154655, 8355711 & param6 >> -1778325311);
    }

    private final wk a(byte param0) {
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var9 = 0;
        int var10 = SteelSentinels.field_G;
        int var2 = ((bk) this).field_E >> -1505235295;
        wk var3 = new wk(var2, ((bk) this).field_E);
        q.a(var3, (byte) -62);
        int var4 = -8 % ((param0 - -87) / 36);
        for (var5 = 0; var5 < ((bk) this).field_E; var5++) {
            for (var6 = 0; var6 < var2; var6++) {
                var7 = (double)var6 * (double)var6 / (double)((-var5 + ((bk) this).field_E) * var5);
                var9 = 1;
                if (1.0 > var7) {
                    var7 = Math.sqrt(1.0 - var7);
                    var9 = var7 >= 1.0 ? 255 : (int)(255.0 * var7);
                }
                pb.b(var6, var5, var9 | var9 << -2036612440 | var9 << -1508305264);
            }
        }
        tk.f((byte) 108);
        return var3;
    }

    private bk(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((bk) this).field_S = param7;
        ((bk) this).field_J = param6;
        ((bk) this).field_V = param5;
        ((bk) this).field_Q = param8;
        ((bk) this).field_T = param4;
        ((bk) this).a(param0, (byte) -73, param1, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_X = "Play free version";
        field_M = new fm(0, 2, 2, 1);
        field_O = "EDD";
        field_H = "Your email address is used to identify this account";
        field_P = "Game";
    }
}
