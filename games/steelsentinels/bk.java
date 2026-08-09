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
            field_X = (String) null;
        }
        field_U = null;
        field_X = null;
        field_ab = null;
        field_W = null;
        field_H = null;
        field_P = null;
    }

    final void b(int param0, int param1, int param2) {
        this.field_V = param1;
        this.field_J = param0;
        this.field_Q = (param2 & param0) >> 319396897;
        this.field_S = 8355711 & param1 >> -18243583;
        this.f(-99);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (-1 != (param3 ^ -1)) {
            return;
        }
        int var5 = param2 + this.field_o;
        int var6 = this.field_z + param0;
        if (param1 > -99) {
            this.b(49, -19, 99);
        }
        this.a(var5, (byte) -8, var6, this.field_R[0]);
        if (!((this.field_I ^ -1) <= -65537)) {
            fe.a((this.field_I * this.field_x >> 1654253008) + var5, var6, 115, this.field_x + var5, this.field_E + var6);
            this.a(var5, (byte) -87, var6, this.field_R[1]);
            tk.f((byte) 97);
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, (byte) -108, param2, param3, param4);
        this.f(-85);
        if (param1 > -71) {
            wk var7 = (wk) null;
            this.a(13, (byte) 41, 96, (wk) null);
        }
    }

    final void a(int param0, int param1, lh param2, int param3) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (this.field_N) {
                this.field_G = this.field_G + 1;
                if (this.field_T * 2 >= this.field_G) {
                  break L1;
                } else {
                  this.field_G = this.field_G - 2 * this.field_T;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 > 56) {
                break L2;
              } else {
                this.field_J = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("bk.H(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
    }

    private final wk a(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = SteelSentinels.field_G;
        wk var14 = new wk(2 * this.field_T, this.field_E);
        q.a(var14, (byte) -116);
        if (param1 != 18634) {
            field_W = (int[]) null;
        }
        int var5 = this.field_E >> 1940777857;
        for (var6 = 0; this.field_E > var6; var6++) {
            var7 = (var6 >> -1836424575) * (this.field_T * 2 + -1) % (2 * this.field_T);
            var8 = param2 & 16711935;
            var9 = param2 & 65280;
            var10 = var6 + -var5;
            var11 = (int)(Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5 * 128.0) + 128;
            var12 = 256 > var11 ? (16711680 & var11 * var9 | -16711936 & var11 * var8) >>> 1727910216 : var8 | var9;
            pb.g(var7, var6, this.field_T, var12);
            pb.g(var7 - 2 * this.field_T, var6, this.field_T, var12);
            var9 = 65280 & param0;
            var8 = 16711935 & param0;
            var12 = (var11 ^ -1) <= -257 ? var8 | var9 : (16711680 & var11 * var9 | var8 * var11 & -16711936) >>> -74051672;
            pb.g(var7 - -this.field_T, var6, this.field_T, var12);
            pb.g(-this.field_T + var7, var6, this.field_T, var12);
        }
        tk.f((byte) 107);
        return var14;
    }

    private final void a(int param0, byte param1, int param2, wk param3) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var5_int = this.field_x + param0;
              fe.a(this.field_L.field_A + param0, param2, 86, -this.field_L.field_A + var5_int, this.field_E + param2);
              var6 = -this.field_G + param0;
              if (param1 < -6) {
                break L1;
              } else {
                field_P = (String) null;
                break L1;
              }
            }
            L2: while (true) {
              if (var5_int <= var6) {
                L3: {
                  tk.f((byte) 113);
                  if (this.field_L.field_A + param0 < pb.field_i) {
                    break L3;
                  } else {
                    q.a(this.field_Y, (byte) -75);
                    param3.a(-this.field_G, 0);
                    param3.a(2 * this.field_T - this.field_G, 0);
                    this.field_K.c(0, 0);
                    tk.f((byte) 107);
                    this.field_Y.a(param0, param2);
                    break L3;
                  }
                }
                L4: {
                  if (pb.field_b < var5_int - this.field_L.field_A) {
                    break L4;
                  } else {
                    q.a(this.field_Y, (byte) -63);
                    var7 = -this.field_L.field_A + (this.field_x + this.field_G);
                    L5: while (true) {
                      if (2 * this.field_T >= var7) {
                        param3.a(-var7, 0);
                        param3.a(this.field_T * 2 - var7, 0);
                        this.field_L.c(0, 0);
                        tk.f((byte) 109);
                        this.field_Y.a(var5_int + -this.field_L.field_A, param2);
                        break L4;
                      } else {
                        var7 = var7 - 2 * this.field_T;
                        continue L5;
                      }
                    }
                  }
                }
                break L0;
              } else {
                param3.a(var6, param2);
                var6 = var6 + param3.field_A;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("bk.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L6;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    final static ef a(int param0, String param1) {
        ef stackIn_3_0 = null;
        ef stackIn_6_0 = null;
        ef stackIn_9_0 = null;
        ef stackIn_15_0 = null;
        int stackIn_24_0 = 0;
        ef stackIn_28_0 = null;
        ef stackIn_42_0 = null;
        ef stackIn_47_0 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            var2_int = param1.length();
            if (var2_int != 0) {
              if (-65 <= (var2_int ^ -1)) {
                if (param0 >= 86) {
                  if (param1.charAt(0) == 34) {
                    if (34 != param1.charAt(-1 + var2_int)) {
                      stackIn_15_0 = ec.field_b;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      var3 = 0;
                      var4 = 1;
                      L1: while (true) {
                        if (var2_int + -1 > var4) {
                          L2: {
                            var5 = param1.charAt(var4);
                            if (92 == var5) {
                              L3: {
                                if (var3 != 0) {
                                  stackIn_24_0 = 0;
                                  break L3;
                                } else {
                                  stackIn_24_0 = 1;
                                  break L3;
                                }
                              }
                              var3 = stackIn_24_0;
                              break L2;
                            } else {
                              L4: {
                                if (var5 != 34) {
                                  break L4;
                                } else {
                                  if (var3 != 0) {
                                    break L4;
                                  } else {
                                    stackIn_28_0 = ec.field_b;
                                    decompiledRegionSelector0 = 4;
                                    break L0;
                                  }
                                }
                              }
                              var3 = 0;
                              break L2;
                            }
                          }
                          var4++;
                          continue L1;
                        } else {
                          return null;
                        }
                      }
                    }
                  } else {
                    var3 = 0;
                    var4 = 0;
                    L5: while (true) {
                      if (var2_int > var4) {
                        L6: {
                          var5 = param1.charAt(var4);
                          if (var5 == 46) {
                            L7: {
                              if (0 == var4) {
                                break L7;
                              } else {
                                if (var4 == var2_int - 1) {
                                  break L7;
                                } else {
                                  if (var3 != 0) {
                                    break L7;
                                  } else {
                                    var3 = 1;
                                    break L6;
                                  }
                                }
                              }
                            }
                            stackIn_42_0 = ec.field_b;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            if (nc.field_g.indexOf(var5) == -1) {
                              stackIn_47_0 = ec.field_b;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            } else {
                              var3 = 0;
                              break L6;
                            }
                          }
                        }
                        var4++;
                        continue L5;
                      } else {
                        return null;
                      }
                    }
                  }
                } else {
                  stackIn_9_0 = (ef) null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = ma.field_cb;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = ud.field_A;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_53_0 = (RuntimeException) (var2);

            stackIn_53_1 = new StringBuilder().append("bk.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "null";
              break L8;
            } else {
              stackIn_54_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackIn_54_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackIn_54_2 = "{...}";
              break L8;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_54_0), stackIn_54_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_28_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_42_0;
                  } else {
                    return stackIn_47_0;
                  }
                }
              }
            }
          }
        }
    }

    private final void f(int param0) {
        this.field_R = new wk[]{this.a(this.field_J, 18634, this.field_V), this.a(this.field_Q, 18634, this.field_S)};
        if (param0 > -66) {
            return;
        }
        this.field_L = this.a((byte) -127);
        this.field_K = this.field_L.a();
        this.field_Y = new wk(this.field_E >> 809456833, this.field_E);
    }

    final static void a(cm param0, byte param1, mi param2) {
        int var6 = 0;
        int var7 = 0;
        int[] var16 = null;
        int var9 = 0;
        int var10 = SteelSentinels.field_G;
        int var3_int = dh.field_D;
        qf.field_c = new gh(0L, (gh) null);
        int var4 = -124 / ((param1 - -78) / 32);
        if (param0 == null) {
            sj.a("QC1", -29, (Throwable) null);
            return;
        }
        param0.field_d = 0;
        param0.field_f = false;
        cd.field_e = new co(var3_int, param0, param0);
        jl.field_w = new oe(var3_int, param0, param0, new kb());
        mn var5 = ul.d(0);
        if (var5 == null) {
            sj.a("QC2", -49, (Throwable) null);
            return;
        }
        try {
            fc.a(var5, 101);
            pg.field_u = fm.a(65793, false, 2245737, 1127256, 65793, 4020342, 1513239, 0, 1513239, 5138823, 8947848, (mi) null, 65793);
            ea.field_f = fm.a(0, false, 0, 0, 0, 0, 0, 16764006, 0, 0, 0, param2, 0);
            fb.field_l = fm.a(0, false, 0, 0, 0, 0, 0, 16777215, 0, 0, 0, param2, 0);
            var6 = pb.field_c;
            var7 = pb.field_j;
            var16 = pb.field_g;
            ik.field_g = new wk(10, 14);
            ik.field_g.d();
            for (var9 = 2; var9 < 7; var9++) {
                pb.d(var9, var9 + 1, 14 - (var9 << -216964607), 16777215);
            }
            pb.a(var16, var6, var7);
            ti.field_m = sg.a(fb.field_l, var5, false, ea.field_f, pg.field_u);
            qf.field_c.field_M = new ul();
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "bk.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
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
        int var2 = this.field_E >> -1505235295;
        wk var3 = new wk(var2, this.field_E);
        q.a(var3, (byte) -62);
        int var4 = -8 % ((param0 - -87) / 36);
        for (var5 = 0; var5 < this.field_E; var5++) {
            for (var6 = 0; var6 < var2; var6++) {
                var7 = (double)var6 * (double)var6 / (double)((-var5 + this.field_E) * var5);
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
        this.field_S = param7;
        this.field_J = param6;
        this.field_V = param5;
        this.field_Q = param8;
        this.field_T = param4;
        this.a(param0, (byte) -73, param1, param2, param3);
    }

    static {
        field_X = "Play free version";
        field_M = new fm(0, 2, 2, 1);
        field_O = "EDD";
        field_H = "Your email address is used to identify this account";
        field_P = "Game";
    }
}
