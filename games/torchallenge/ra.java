/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra {
    int field_a;
    private int[][] field_s;
    private int[] field_f;
    private int[][] field_r;
    static boolean[][] field_k;
    private int[][] field_u;
    private int[][] field_t;
    int field_l;
    private int[][][] field_o;
    static int[] field_j;
    static int field_g;
    int field_i;
    static String field_m;
    static String[] field_d;
    private int[][][] field_e;
    private int[][] field_c;
    static boolean field_q;
    static ka[][] field_b;
    private int[][] field_h;
    static int[][] field_p;
    private int[][] field_n;

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = TorChallenge.field_F ? 1 : 0;
        if (param7 == -10440) {
          var11 = 0;
          L0: while (true) {
            if (1 < var11) {
              return;
            } else {
              L1: {
                if (0 == var11) {
                  var10 = gl.field_l[param0][param2][0][1];
                  var9 = gl.field_l[param0][param2][0][0];
                  break L1;
                } else {
                  L2: {
                    if (0 != param2) {
                      break L2;
                    } else {
                      if (var11 != 1) {
                        break L2;
                      } else {
                        var10 = gl.field_l[param0][param2][1][1];
                        var9 = gl.field_l[param0][param2][0][1];
                        break L1;
                      }
                    }
                  }
                  var9 = gl.field_l[param0][param2][1][0];
                  var10 = gl.field_l[param0][param2][0][0];
                  break L1;
                }
              }
              L3: {
                qg.a(ae.field_y);
                qg.a(var9, param1, var10, param4);
                if (-1 <= (1 & ic.field_E[vb.field_a[param0][param2]][param5] ^ -1)) {
                  break L3;
                } else {
                  sf.field_d[param6][param2][var11].a(var9, param1);
                  break L3;
                }
              }
              L4: {
                if ((2 & ic.field_E[vb.field_a[param0][param2]][param5]) <= 0) {
                  break L4;
                } else {
                  sf.field_d[param6][param2][var11].a(var9, param1 + 16);
                  break L4;
                }
              }
              L5: {
                if ((ic.field_E[vb.field_a[param0][param2]][param5] & 4 ^ -1) >= -1) {
                  break L5;
                } else {
                  sf.field_d[param6][param2][var11].a(var9, 32 + param1);
                  break L5;
                }
              }
              L6: {
                if ((8 & ic.field_E[vb.field_a[param0][param2]][param5] ^ -1) < -1) {
                  sf.field_d[param6][param2][var11].a(var9, 48 + param1);
                  break L6;
                } else {
                  break L6;
                }
              }
              qg.b(ae.field_y);
              var11++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final static int a(int param0) {
        if ((li.field_K ^ -1) > -3) {
          return 0;
        } else {
          if (param0 == 1) {
            L0: {
              if (kf.field_b == 0) {
                if (!sl.field_a.b(param0 + -7958)) {
                  return 20;
                } else {
                  if (sl.field_a.b(param0 + 4, "commonui")) {
                    if (!gf.field_p.b(-7957)) {
                      return 50;
                    } else {
                      if (!gf.field_p.b(param0 ^ 4, "commonui")) {
                        return 60;
                      } else {
                        if (jl.field_b.b(-7957)) {
                          if (jl.field_b.b((byte) 79)) {
                            break L0;
                          } else {
                            return 80;
                          }
                        } else {
                          return 70;
                        }
                      }
                    }
                  } else {
                    return 40;
                  }
                }
              } else {
                L1: {
                  if (null != rj.field_f) {
                    if (!rj.field_f.b(-7957)) {
                      return 14;
                    } else {
                      if (!rj.field_f.a((byte) -39, "")) {
                        return 29;
                      } else {
                        if (rj.field_f.b(param0 + 4, "")) {
                          break L1;
                        } else {
                          return 29;
                        }
                      }
                    }
                  } else {
                    break L1;
                  }
                }
                if (sl.field_a.b(-7957)) {
                  if (sl.field_a.b(param0 ^ 4, "commonui")) {
                    if (!gf.field_p.b(param0 + -7958)) {
                      return 71;
                    } else {
                      if (gf.field_p.b(5, "commonui")) {
                        if (!jl.field_b.b(-7957)) {
                          return 82;
                        } else {
                          if (!jl.field_b.b((byte) 79)) {
                            return 86;
                          } else {
                            break L0;
                          }
                        }
                      } else {
                        return 80;
                      }
                    }
                  } else {
                    return 57;
                  }
                } else {
                  return 43;
                }
              }
            }
            return 100;
          } else {
            return -37;
          }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = TorChallenge.field_F ? 1 : 0;
          var6 = param1 / 32;
          if (param0 == 2) {
            break L0;
          } else {
            this.field_u = (int[][]) null;
            break L0;
          }
        }
        var7 = param4 / 16;
        var8 = var6;
        L1: while (true) {
          if (var8 * 32 >= param1 + param3) {
            var9 = var7;
            L2: while (true) {
              if (param4 + param2 <= 16 * var9) {
                if (-1 < (var7 >> 2070079810 ^ -1)) {
                  return true;
                } else {
                  if (this.field_a > var9 >> 1973651842) {
                    var11 = var6;
                    L3: while (true) {
                      if (var8 <= var11) {
                        return false;
                      } else {
                        L4: {
                          var10 = var11;
                          if (-1 < (var10 ^ -1)) {
                            var10 += 64;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          if (64 > var10) {
                            break L5;
                          } else {
                            var10 -= 64;
                            break L5;
                          }
                        }
                        var12 = var7;
                        L6: while (true) {
                          if (var12 >= var9) {
                            var11++;
                            continue L3;
                          } else {
                            L7: {
                              if (0 != (var12 & 3)) {
                                break L7;
                              } else {
                                if ((ic.field_E[var10][var12 >> -1039096350] & 1 ^ -1) < -1) {
                                  return true;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            L8: {
                              if ((3 & var12) != 1) {
                                break L8;
                              } else {
                                if ((2 & ic.field_E[var10][var12 >> 1212130690]) <= 0) {
                                  break L8;
                                } else {
                                  return true;
                                }
                              }
                            }
                            L9: {
                              if (2 != (3 & var12)) {
                                break L9;
                              } else {
                                if ((4 & ic.field_E[var10][var12 >> 568388706]) <= 0) {
                                  break L9;
                                } else {
                                  return true;
                                }
                              }
                            }
                            if (-4 == (3 & var12 ^ -1)) {
                              if (-1 > (8 & ic.field_E[var10][var12 >> 1130917890] ^ -1)) {
                                return true;
                              } else {
                                var12++;
                                continue L6;
                              }
                            } else {
                              var12++;
                              continue L6;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    return true;
                  }
                }
              } else {
                var9++;
                continue L2;
              }
            }
          } else {
            var8++;
            continue L1;
          }
        }
    }

    final void a(boolean param0, int param1, boolean param2, ka param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        Object var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        ka var26 = null;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackIn_82_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_85_2 = 0;
        RuntimeException stackIn_144_0 = null;
        StringBuilder stackIn_144_1 = null;
        RuntimeException stackIn_145_0 = null;
        StringBuilder stackIn_145_1 = null;
        RuntimeException stackIn_146_0 = null;
        StringBuilder stackIn_146_1 = null;
        String stackIn_146_2 = null;
        Throwable caughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_80_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        int stackOut_83_0 = 0;
        int stackOut_83_1 = 0;
        int stackOut_83_2 = 0;
        int stackOut_84_0 = 0;
        int stackOut_84_1 = 0;
        int stackOut_84_2 = 0;
        RuntimeException stackOut_143_0 = null;
        StringBuilder stackOut_143_1 = null;
        RuntimeException stackOut_144_0 = null;
        StringBuilder stackOut_144_1 = null;
        String stackOut_144_2 = null;
        RuntimeException stackOut_145_0 = null;
        StringBuilder stackOut_145_1 = null;
        String stackOut_145_2 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var23 = TorChallenge.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    var10_int = param6 / 64;
                    var11 = var10_int - -10;
                    var12 = 64 * var10_int - param6;
                    var13 = param5 % 32;
                    var16 = null;
                    var17 = null;
                    je.field_i = false;
                    qg.a(vd.field_e);
                    if ((var10_int ^ -1) > -1) {
                        statePc = 3;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var11 = var11 - var10_int;
                    var10_int = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (var11 > this.field_a) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var10_int = var10_int - (-this.field_a + var11);
                    var11 = this.field_a;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    this.field_n[1][0] = var10_int;
                    this.field_n[1][1] = var11;
                    if (param4 != 3) {
                        statePc = 14;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (!param2) {
                        statePc = 14;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (ub.field_i) {
                        statePc = 11;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 11: {
                    qg.a(0, 0, 640, 480 + -td.field_n);
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    qg.c(0, 0, 25, this.field_a * 64, 14022908, 10533565);
                    qg.c(615, 0, 25, 64 * this.field_a, 14022908, 10533565);
                    og.a(param5, param6, -15516);
                    if (!ub.field_i) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    qg.b(vd.field_e);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    var18 = -24;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (0 < var18) {
                        statePc = 130;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    if ((var18 ^ -1) > 15) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if ((var18 ^ -1) != 15) {
                        statePc = 20;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    qg.b(vd.field_e);
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    qg.b(vd.field_e);
                    qg.a(0, 0, 25, 480);
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    var19 = 8 + (16 + var18);
                    var12 = -param6 + 64 * var10_int;
                    if (3 != param4) {
                        statePc = 34;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var20 = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if ((var20 ^ -1) < -2) {
                        statePc = 57;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackOut_23_0 = var13;
                    stackOut_23_1 = param5;
                    stackOut_23_2 = var20;
                    stackOut_23_3 = var19;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_25_1 = stackOut_23_1;
                    stackIn_25_2 = stackOut_23_2;
                    stackIn_25_3 = stackOut_23_3;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    stackIn_24_2 = stackOut_23_2;
                    stackIn_24_3 = stackOut_23_3;
                    if (-1 == (var20 ^ -1)) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    stackOut_24_0 = stackIn_24_0;
                    stackOut_24_1 = stackIn_24_1;
                    stackOut_24_2 = stackIn_24_2;
                    stackOut_24_3 = stackIn_24_3;
                    stackOut_24_4 = -var18;
                    stackIn_26_0 = stackOut_24_0;
                    stackIn_26_1 = stackOut_24_1;
                    stackIn_26_2 = stackOut_24_2;
                    stackIn_26_3 = stackOut_24_3;
                    stackIn_26_4 = stackOut_24_4;
                    statePc = 26;
                    continue stateLoop;
                }
                case 25: {
                    stackOut_25_0 = stackIn_25_0;
                    stackOut_25_1 = stackIn_25_1;
                    stackOut_25_2 = stackIn_25_2;
                    stackOut_25_3 = stackIn_25_3;
                    stackOut_25_4 = var18;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    stackIn_26_2 = stackOut_25_2;
                    stackIn_26_3 = stackOut_25_3;
                    stackIn_26_4 = stackOut_25_4;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    p.a(stackIn_26_0, stackIn_26_1, stackIn_26_2, stackIn_26_3, stackIn_26_4, param6, -100, var10_int);
                    if (-1 != (var19 ^ -1)) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    this.field_n[0][var20] = vb.field_a[var19][var20];
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    var14 = -gl.field_l[var19][var20][1][0] + gl.field_l[var19][var20][1][1];
                    if (-1 > (var14 ^ -1)) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var20++;
                    statePc = 22;
                    continue stateLoop;
                }
                case 30: {
                    cf.a(32, this.field_f, this.field_h[vb.field_a[var19][var20]], var14, false);
                    this.field_t[var20][0] = gl.field_l[var19][var20][1][0];
                    this.field_t[var20][1] = gl.field_l[var19][var20][1][1];
                    this.field_s[var20][0] = gl.field_l[var19][var20][2][0];
                    this.field_s[var20][1] = gl.field_l[var19][var20][2][1];
                    this.field_o[var20][0][0] = gl.field_l[var19][var20][0][0];
                    this.field_o[var20][0][1] = gl.field_l[var19][var20][0][1];
                    var15 = 1 & vb.field_a[var19][var20];
                    sh.a(var15, -100, this.field_f, var20, this.field_s, this.field_t, var18);
                    if (param3 != null) {
                        statePc = 32;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 32: {
                    param3.d();
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    var20++;
                    statePc = 22;
                    continue stateLoop;
                }
                case 34: {
                    if (param4 == 6) {
                        statePc = 48;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var20 = var10_int;
                    if (var11 <= var20) {
                        statePc = 129;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var21 = 0;
                    if (-2 > (var21 ^ -1)) {
                        statePc = 128;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if (-1 != (var18 ^ -1)) {
                        statePc = 76;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if ((var21 ^ -1) == -2) {
                        statePc = 40;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (param1 == 18) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var26 = (ka) null;
                    this.a(false, 6, false, (ka) null, 26, -8, -26, -57, 72);
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    if ((param4 ^ -1) == -4) {
                        statePc = 44;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 44: {
                    nb.a((byte) 42, this.field_n);
                    if ((param4 ^ -1) != -7) {
                        statePc = 142;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (!ub.field_i) {
                        statePc = 142;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var18 = td.field_n >> 919859972;
                    if (0 >= td.field_n - (var18 << -2061651004)) {
                        statePc = 72;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    var18++;
                    statePc = 72;
                    continue stateLoop;
                }
                case 48: {
                    var20 = 0;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    if (var20 > 1) {
                        statePc = 57;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    this.field_o[var20][0][0] = gl.field_l[var19][var20][0][0];
                    this.field_o[var20][0][1] = gl.field_l[var19][var20][0][1];
                    if (var20 != 0) {
                        statePc = 52;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    this.field_o[var20][1][0] = gl.field_l[var19][var20][0][1];
                    this.field_o[var20][1][1] = gl.field_l[var19][var20][1][1];
                    statePc = 53;
                    continue stateLoop;
                }
                case 52: {
                    this.field_o[var20][1][0] = gl.field_l[var19][var20][1][0];
                    this.field_o[var20][1][1] = gl.field_l[var19][var20][0][0];
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    var15 = vb.field_a[var19][var20] & 1;
                    si.a(var18, this.field_e[vb.field_a[var19][var20]], var20, this.field_o, var15, 1);
                    if (param3 != null) {
                        statePc = 55;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 55: {
                    param3.d();
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    var20++;
                    statePc = 49;
                    continue stateLoop;
                }
                case 57: {
                    var20 = var10_int;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    if (var11 <= var20) {
                        statePc = 129;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var21 = 0;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    if (-2 > (var21 ^ -1)) {
                        statePc = 128;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (-1 != (var18 ^ -1)) {
                        statePc = 76;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    if ((var21 ^ -1) == -2) {
                        statePc = 64;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 64: {
                    if (param4 != 3) {
                        statePc = 127;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (param2) {
                        statePc = 75;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    var21++;
                    statePc = 60;
                    continue stateLoop;
                }
                case 68: {
                    if ((param4 ^ -1) != -7) {
                        statePc = 142;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (!ub.field_i) {
                        statePc = 142;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    var18 = td.field_n >> 919859972;
                    if (0 >= td.field_n - (var18 << -2061651004)) {
                        statePc = 72;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    var18++;
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    var19 = 480 + (-td.field_n + -16);
                    jf.field_qb.field_q = qg.field_g;
                    jf.field_qb.field_u = jf.field_qb.field_q;
                    jf.field_qb.field_v = qg.field_f;
                    jf.field_qb.field_x = jf.field_qb.field_v;
                    mb.field_c.field_q = qg.field_g;
                    jf.field_qb.field_y = qg.field_i;
                    mb.field_c.field_v = qg.field_f;
                    mb.field_c.field_u = mb.field_c.field_q;
                    mb.field_c.field_y = qg.field_i;
                    mb.field_c.field_x = mb.field_c.field_v;
                    qg.f(0, var19 + 16, 640, 480 - (16 + var19), 1);
                    var20 = 0;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    if (var18 <= var20) {
                        statePc = 142;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    ka.a(jf.field_qb, mb.field_c, 0, var19, 0, var19 - -16, 640, 16);
                    var19 += 16;
                    var20++;
                    statePc = 73;
                    continue stateLoop;
                }
                case 75: {
                    tk.b(var21, var12, var20, var19, param1 + 46);
                    hi.b(var21, 5446, var12, var19, var20);
                    statePc = 127;
                    continue stateLoop;
                }
                case 76: {
                    if (-16 > var18) {
                        statePc = 79;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if (var18 != -16) {
                        statePc = 86;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    qg.b(vd.field_e);
                    statePc = 86;
                    continue stateLoop;
                }
                case 79: {
                    qg.b(vd.field_e);
                    if (var21 == 0) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    stackOut_80_0 = 615;
                    stackIn_82_0 = stackOut_80_0;
                    statePc = 82;
                    continue stateLoop;
                }
                case 81: {
                    stackOut_81_0 = 0;
                    stackIn_82_0 = stackOut_81_0;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    stackOut_82_0 = stackIn_82_0;
                    stackOut_82_1 = 0;
                    stackIn_84_0 = stackOut_82_0;
                    stackIn_84_1 = stackOut_82_1;
                    stackIn_83_0 = stackOut_82_0;
                    stackIn_83_1 = stackOut_82_1;
                    if (0 == var21) {
                        statePc = 84;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    stackOut_83_0 = stackIn_83_0;
                    stackOut_83_1 = stackIn_83_1;
                    stackOut_83_2 = 640;
                    stackIn_85_0 = stackOut_83_0;
                    stackIn_85_1 = stackOut_83_1;
                    stackIn_85_2 = stackOut_83_2;
                    statePc = 85;
                    continue stateLoop;
                }
                case 84: {
                    stackOut_84_0 = stackIn_84_0;
                    stackOut_84_1 = stackIn_84_1;
                    stackOut_84_2 = 25;
                    stackIn_85_0 = stackOut_84_0;
                    stackIn_85_1 = stackOut_84_1;
                    stackIn_85_2 = stackOut_84_2;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    qg.a(stackIn_85_0, stackIn_85_1, stackIn_85_2, 480);
                    statePc = 86;
                    continue stateLoop;
                }
                case 86: {
                    var14 = gl.field_l[var19][var21][1][1] - gl.field_l[var19][var21][1][0];
                    if ((param4 ^ -1) != -4) {
                        statePc = 92;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if ((var14 ^ -1) < -1) {
                        statePc = 89;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 89: {
                    if ((64 & ic.field_E[vb.field_a[var19][var21]][var20]) <= 0) {
                        statePc = 91;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    var15 = vb.field_a[var19][var21] & 1;
                    TorChallenge.a(var18, var12, var20, false, var12 - -64, var19, var21, var15);
                    statePc = 92;
                    continue stateLoop;
                }
                case 91: {
                    var22 = this.field_u[vb.field_a[var19][var21] >> -568546911][var20];
                    b.a((byte) 114, var22, var21, var18, 64 + var12, var19, var12);
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    if (-4 != (param4 ^ -1)) {
                        statePc = 96;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    if (param2) {
                        statePc = 95;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 95: {
                    tk.b(var21, var12, var20, var19, param1 + 46);
                    hi.b(var21, param1 ^ 5460, var12, var19, var20);
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    if (6 != param4) {
                        statePc = 100;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if (param0) {
                        statePc = 99;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 99: {
                    qg.a(ae.field_y);
                    var17 = hi.a(param6, vb.field_a[var19][var21], param5, 0, 101, var20);
                    qg.b(ae.field_y);
                    var16 = hi.a(param6, vb.field_a[var19][var21], param5, 1, 115, var20);
                    qg.b(ae.field_y);
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    if (param4 != 6) {
                        statePc = 104;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    if (0 == (16 & ic.field_E[vb.field_a[var19][var21]][var20])) {
                        statePc = 103;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 103: {
                    qg.a(ae.field_y);
                    var22 = this.field_r[vb.field_a[var19][var21]][var20];
                    this.a(var19, var12, var21, var18, var12 - -64, var20, var22, -10440);
                    qg.b(ae.field_y);
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    if ((param4 ^ -1) != -3) {
                        statePc = 107;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    if (!param0) {
                        statePc = 107;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    qg.a(ae.field_y);
                    var16 = hi.a(param6, vb.field_a[var19][var21], param5, 2, 113, var20);
                    qg.b(ae.field_y);
                    statePc = 107;
                    continue stateLoop;
                }
                case 107: {
                    if (6 == param4) {
                        statePc = 110;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 110: {
                    if (gl.field_l[var19][var21][0][0] > param7) {
                        statePc = 116;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    if (var12 > param8) {
                        statePc = 116;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    if (param8 >= var12 - -64) {
                        statePc = 116;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    if (gl.field_l[var19][var21][0][1] > param7) {
                        statePc = 115;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 115: {
                    this.field_l = vb.field_a[var19][var21];
                    this.field_i = var20;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    if (vb.field_a[var19][var21] != this.field_l) {
                        statePc = 127;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    if (this.field_i != var20) {
                        statePc = 127;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    if (!ol.field_a) {
                        statePc = 127;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    qg.a(ae.field_y);
                    qg.b(vd.field_e);
                    qg.b(gl.field_l[var19][var21][0][0], var12, -gl.field_l[var19][var21][0][0] + gl.field_l[var19][var21][0][1], 64, 16777215);
                    qg.a(ae.field_y[0], ae.field_y[1], ae.field_y[2], ae.field_y[3]);
                    if (var16 == null) {
                        statePc = 122;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    if (md.field_j == null) {
                        statePc = 126;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    if (var17 == null) {
                        statePc = 127;
                    } else {
                        statePc = 123;
                    }
                    continue stateLoop;
                }
                case 123: {
                    if (null == md.field_j) {
                        statePc = 125;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 125: {
                    md.field_j = (qe) (var17);
                    statePc = 127;
                    continue stateLoop;
                }
                case 126: {
                    md.field_j = (qe) (var16);
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    var21++;
                    statePc = 60;
                    continue stateLoop;
                }
                case 128: {
                    var12 += 64;
                    var20++;
                    statePc = 58;
                    continue stateLoop;
                }
                case 129: {
                    var18++;
                    statePc = 15;
                    continue stateLoop;
                }
                case 130: {
                    if (param1 == 18) {
                        statePc = 132;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    var26 = (ka) null;
                    this.a(false, 6, false, (ka) null, 26, -8, -26, -57, 72);
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    if ((param4 ^ -1) == -4) {
                        statePc = 134;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 134: {
                    nb.a((byte) 42, this.field_n);
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    if ((param4 ^ -1) != -7) {
                        statePc = 142;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    if (!ub.field_i) {
                        statePc = 142;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    var18 = td.field_n >> 919859972;
                    if (0 >= td.field_n - (var18 << -2061651004)) {
                        statePc = 139;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var18++;
                    statePc = 139;
                    continue stateLoop;
                }
                case 139: {
                    var19 = 480 + (-td.field_n + -16);
                    jf.field_qb.field_q = qg.field_g;
                    jf.field_qb.field_u = jf.field_qb.field_q;
                    jf.field_qb.field_v = qg.field_f;
                    jf.field_qb.field_x = jf.field_qb.field_v;
                    mb.field_c.field_q = qg.field_g;
                    jf.field_qb.field_y = qg.field_i;
                    mb.field_c.field_v = qg.field_f;
                    mb.field_c.field_u = mb.field_c.field_q;
                    mb.field_c.field_y = qg.field_i;
                    mb.field_c.field_x = mb.field_c.field_v;
                    qg.f(0, var19 + 16, 640, 480 - (16 + var19), 1);
                    var20 = 0;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    if (var18 <= var20) {
                        statePc = 142;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    ka.a(jf.field_qb, mb.field_c, 0, var19, 0, var19 - -16, 640, 16);
                    var19 += 16;
                    var20++;
                    statePc = 140;
                    continue stateLoop;
                }
                case 142: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_k = (boolean[][]) null;
        field_b = (ka[][]) null;
        field_j = null;
        field_d = null;
        field_p = (int[][]) null;
        field_m = null;
        int var1 = 48 % ((param0 - 91) / 34);
    }

    final void b(byte param0) {
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
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_44_0 = 0;
        L0: {
          var14 = TorChallenge.field_F ? 1 : 0;
          var2 = 0;
          var9 = ea.field_e;
          if (!gh.field_x) {
            break L0;
          } else {
            var9 = -1 + (-6 + (var9 + 1) << 1356069889);
            break L0;
          }
        }
        L1: {
          var13 = 0;
          if (param0 >= 57) {
            break L1;
          } else {
            this.field_e = (int[][][]) null;
            break L1;
          }
        }
        L2: while (true) {
          if (64 <= var13) {
            return;
          } else {
            L3: {
              var3 = 32 * var13;
              var4 = (-var3 + var2) % 2048;
              if (-1 > (var4 ^ -1)) {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                break L3;
              } else {
                stackOut_6_0 = -1;
                stackIn_8_0 = stackOut_6_0;
                break L3;
              }
            }
            L4: {
              L5: {
                var6 = stackIn_8_0;
                var4 = var4 * var6;
                var8 = fj.field_m[var4];
                if (var4 < 511) {
                  break L5;
                } else {
                  if (-1537 < (var4 ^ -1)) {
                    stackOut_12_0 = 1;
                    stackIn_13_0 = stackOut_12_0;
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              stackOut_11_0 = -1;
              stackIn_13_0 = stackOut_11_0;
              break L4;
            }
            L6: {
              var6 = stackIn_13_0;
              this.field_e[var13][0][0] = var6 * (fj.a(1870096848, var8, ng.field_H[var9] << -1612844304) >> -1763956400) + ng.field_K[var9];
              var5 = (-512 + (-16 + (-var3 + var2))) % 2048;
              this.field_e[var13][0][1] = this.field_e[var13][0][0];
              if (-1 > (var5 ^ -1)) {
                stackOut_15_0 = 1;
                stackIn_16_0 = stackOut_15_0;
                break L6;
              } else {
                stackOut_14_0 = -1;
                stackIn_16_0 = stackOut_14_0;
                break L6;
              }
            }
            L7: {
              L8: {
                var7 = stackIn_16_0;
                var5 = var7 * var5;
                var8 = fj.field_m[var5];
                if (-512 < (var5 ^ -1)) {
                  break L8;
                } else {
                  if (1536 <= var5) {
                    break L8;
                  } else {
                    stackOut_18_0 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    break L7;
                  }
                }
              }
              stackOut_19_0 = -1;
              stackIn_20_0 = stackOut_19_0;
              break L7;
            }
            L9: {
              var7 = stackIn_20_0;
              var5 = (496 + (var2 + -var3)) % 2048;
              this.field_e[var13][1][0] = var7 * (fj.a(1870096848, var8, ng.field_H[var9] << -1276470224) >> 594694832) - -ng.field_K[var9];
              if (-1 > (var5 ^ -1)) {
                stackOut_22_0 = 1;
                stackIn_23_0 = stackOut_22_0;
                break L9;
              } else {
                stackOut_21_0 = -1;
                stackIn_23_0 = stackOut_21_0;
                break L9;
              }
            }
            L10: {
              L11: {
                var7 = stackIn_23_0;
                var5 = var7 * var5;
                if (var5 < 511) {
                  break L11;
                } else {
                  if (1536 <= var5) {
                    break L11;
                  } else {
                    stackOut_25_0 = 1;
                    stackIn_27_0 = stackOut_25_0;
                    break L10;
                  }
                }
              }
              stackOut_26_0 = -1;
              stackIn_27_0 = stackOut_26_0;
              break L10;
            }
            L12: {
              var7 = stackIn_27_0;
              var8 = fj.field_m[var5];
              this.field_e[var13][1][1] = (fj.a(1870096848, var8, ng.field_H[var9] << 1634890736) >> 1441995920) * var7 - -ng.field_K[var9];
              if (var13 == 0) {
                L13: {
                  var10 = (var2 + -var3 - 16) % 2048;
                  if (-1 <= (var10 ^ -1)) {
                    stackOut_31_0 = -1;
                    stackIn_32_0 = stackOut_31_0;
                    break L13;
                  } else {
                    stackOut_30_0 = 1;
                    stackIn_32_0 = stackOut_30_0;
                    break L13;
                  }
                }
                L14: {
                  L15: {
                    var12 = stackIn_32_0;
                    var10 = var12 * var10;
                    var8 = fj.field_m[var10];
                    if (var10 < 511) {
                      break L15;
                    } else {
                      if (-1537 >= (var10 ^ -1)) {
                        break L15;
                      } else {
                        stackOut_34_0 = 1;
                        stackIn_36_0 = stackOut_34_0;
                        break L14;
                      }
                    }
                  }
                  stackOut_35_0 = -1;
                  stackIn_36_0 = stackOut_35_0;
                  break L14;
                }
                var12 = stackIn_36_0;
                this.field_h[var13][0] = (fj.a(1870096848, var8, ub.field_k[var9] << -1750430608) >> 470185168) * var12 - -ub.field_a[var9];
                break L12;
              } else {
                this.field_h[var13][0] = this.field_h[-1 + var13][31];
                break L12;
              }
            }
            L16: {
              if (-64 == (var13 ^ -1)) {
                this.field_h[var13][31] = this.field_h[0][0];
                break L16;
              } else {
                L17: {
                  var11 = (16 + (-var3 + var2)) % 2048;
                  if (var11 > 0) {
                    stackOut_40_0 = 1;
                    stackIn_41_0 = stackOut_40_0;
                    break L17;
                  } else {
                    stackOut_39_0 = -1;
                    stackIn_41_0 = stackOut_39_0;
                    break L17;
                  }
                }
                L18: {
                  L19: {
                    var12 = stackIn_41_0;
                    var11 = var12 * var11;
                    var8 = fj.field_m[var11];
                    if (var11 < 511) {
                      break L19;
                    } else {
                      if (var11 >= 1536) {
                        break L19;
                      } else {
                        stackOut_43_0 = 1;
                        stackIn_45_0 = stackOut_43_0;
                        break L18;
                      }
                    }
                  }
                  stackOut_44_0 = -1;
                  stackIn_45_0 = stackOut_44_0;
                  break L18;
                }
                var12 = stackIn_45_0;
                this.field_h[var13][31] = (fj.a(1870096848, var8, ub.field_k[var9] << -741080976) >> 439065808) * var12 + ub.field_a[var9];
                break L16;
              }
            }
            h.a(0, this.field_h[var13][31], this.field_h[var13], this.field_h[var13][0], 32);
            var13++;
            continue L2;
          }
        }
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = TorChallenge.field_F ? 1 : 0;
        if (0 > param1) {
          return;
        } else {
          if ((param1 ^ -1) > -7) {
            var3 = 0;
            L0: while (true) {
              if ((var3 ^ -1) <= -4) {
                L1: {
                  if (param0 == 2) {
                    break L1;
                  } else {
                    this.field_o = (int[][][]) null;
                    break L1;
                  }
                }
                var3 = 0;
                L2: while (true) {
                  if (1 < var3) {
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= 2) {
                        la.field_f.a(102);
                        return;
                      } else {
                        var4 = 0;
                        L4: while (true) {
                          if (64 <= var4) {
                            var3++;
                            continue L3;
                          } else {
                            nj.field_e[var3][var4] = new ka(var4 - -1, ef.field_a[var3].field_v);
                            nj.field_e[var3][var4].d();
                            od.c(ef.field_a[var3], 0, 0, 1 + var4, 0);
                            var4++;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    var4 = 0;
                    L5: while (true) {
                      if (32 <= var4) {
                        var3++;
                        continue L2;
                      } else {
                        fh.field_a[var3][var4] = new ka(var4 - -1, af.field_a[var3].field_v);
                        fh.field_a[var3][var4].d();
                        od.c(af.field_a[param1 * 2 + var3], 0, 0, 1 + var4, 0);
                        var4++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                var4 = 0;
                L6: while (true) {
                  if (-2 > (var4 ^ -1)) {
                    var3++;
                    continue L0;
                  } else {
                    var5 = 0;
                    L7: while (true) {
                      if (32 <= var5) {
                        var4++;
                        continue L6;
                      } else {
                        cg.field_b[var3][var4][var5] = new ka(var5 - -1, ub.field_c[var3][var4].field_v);
                        cg.field_b[var3][var4][var5].d();
                        od.c(ub.field_c[var3][var4], 0, 0, var5 - -1, 0);
                        var5++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            }
          } else {
            return;
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
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int[] var23 = null;
        int[] var24 = null;
        L0: {
          var21 = TorChallenge.field_F ? 1 : 0;
          var2 = e.b((byte) 57, 16);
          if ((var2 ^ -1) <= -3) {
            break L0;
          } else {
            var2 = 2;
            break L0;
          }
        }
        L1: {
          if (3 < var2) {
            var2 = 3;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var3 = lj.field_h[0].field_q * lj.field_h[0].field_v;
          var4 = 32;
          var5 = 16;
          var6 = var4 * 32;
          var7 = 32 * var5;
          var8 = var7 * var6;
          if (param0 == 28026) {
            break L2;
          } else {
            field_b = (ka[][]) null;
            break L2;
          }
        }
        da.field_e = var2 * var8 / var3 >> -794065404;
        var24 = new int[1];
        var23 = var24;
        var9 = var23;
        wc.field_e = new int[da.field_e][][];
        var10 = 0;
        L3: while (true) {
          if (var10 >= 0) {
            var10 = 0;
            var11 = 0;
            L4: while (true) {
              if (-1 >= (var11 ^ -1)) {
                var9[0] = -var10 + 16;
                var12 = 0;
                var19 = 0;
                L5: while (true) {
                  if (var19 >= da.field_e) {
                    return;
                  } else {
                    var12 = 0;
                    var11 = e.b((byte) 57, 16);
                    var10 = 0;
                    var20 = 0;
                    L6: while (true) {
                      L7: {
                        if (-2 >= (var20 ^ -1)) {
                          break L7;
                        } else {
                          var10 = var10 + var24[var20];
                          if (var11 >= var10) {
                            var20++;
                            continue L6;
                          } else {
                            var12 = 1 + var20;
                            break L7;
                          }
                        }
                      }
                      if (-1 != (var12 ^ -1)) {
                        wc.field_e[var19] = new int[var12][3];
                        var13 = e.b((byte) 57, var4);
                        var14 = e.b((byte) 57, var5);
                        var15 = 32 * var13 + 16;
                        var16 = 16 + var14 * 32;
                        var22 = 0;
                        var20 = var22;
                        L8: while (true) {
                          if (var12 > var22) {
                            var17 = e.b((byte) 57, 33);
                            var18 = e.b((byte) 57, 33);
                            var17 = -16 + var17;
                            var17 = var15 - -var17;
                            var18 = -16 + var18;
                            var18 = var16 + var18;
                            wc.field_e[var19][var22][0] = var17;
                            wc.field_e[var19][var22][1] = var18;
                            wc.field_e[var19][var22][2] = e.b((byte) 57, 5);
                            var22++;
                            continue L8;
                          } else {
                            var19++;
                            continue L5;
                          }
                        }
                      } else {
                        var19++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                var10 = var10 + var24[var11];
                var11++;
                continue L4;
              }
            }
          } else {
            var9[var10] = 8 >> var10;
            var10++;
            continue L3;
          }
        }
    }

    final static int c(int param0) {
        int discarded$0 = 0;
        if (param0 != -2) {
            discarded$0 = ra.c(57);
            return 1;
        }
        return 1;
    }

    final void d(int param0) {
        if (param0 != -1) {
            this.d(-113);
        }
    }

    ra(int param0, int param1) {
        int var3_int = 0;
        double var3 = 0.0;
        int var4 = 0;
        this.field_f = new int[32];
        this.field_a = 32;
        this.field_o = new int[2][2][2];
        this.field_t = new int[2][2];
        this.field_s = new int[2][2];
        this.field_h = new int[64][32];
        this.field_n = new int[2][2];
        this.field_e = new int[64][2][2];
        this.field_a = param0;
        ol.field_g = (ra) (this);
        ic.field_E = new int[64][this.field_a];
        var3_int = 0;
        L0: while (true) {
          if ((var3_int ^ -1) <= -4) {
            rj.field_b[0] = af.field_a[param1 * 2];
            rj.field_b[1] = af.field_a[1 + 2 * param1];
            var3_int = 0;
            L1: while (true) {
              if (-3 >= (var3_int ^ -1)) {
                this.field_r = new int[64][this.field_a];
                var3_int = 0;
                L2: while (true) {
                  if (-65 >= (var3_int ^ -1)) {
                    this.field_u = new int[32][this.field_a];
                    var3_int = 0;
                    L3: while (true) {
                      if (var3_int >= 32) {
                        this.field_c = new int[32][this.field_a];
                        var3_int = 0;
                        L4: while (true) {
                          if (var3_int >= 32) {
                            var3 = 1.2217304763960306;
                            be.field_b = false;
                            df.field_O = false;
                            bi.field_g = new int[64][this.field_a][3][];
                            this.b(28026);
                            return;
                          } else {
                            var4 = 0;
                            L5: while (true) {
                              if (var4 >= this.field_a) {
                                var3_int++;
                                continue L4;
                              } else {
                                this.field_c[var3_int][var4] = e.b((byte) 57, 10);
                                var4++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var4 = 0;
                        L6: while (true) {
                          if (this.field_a <= var4) {
                            var3_int++;
                            continue L3;
                          } else {
                            this.field_u[var3_int][var4] = e.b((byte) 57, 3);
                            var4++;
                            continue L6;
                          }
                        }
                      }
                    }
                  } else {
                    var4 = 0;
                    L7: while (true) {
                      if (this.field_a <= var4) {
                        var3_int++;
                        continue L2;
                      } else {
                        this.field_r[var3_int][var4] = e.b((byte) 57, 2);
                        var4++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                ef.field_a[var3_int] = be.field_f[param1 * 4 + var3_int];
                var3_int++;
                continue L1;
              }
            }
          } else {
            var4 = 0;
            L8: while (true) {
              if (var4 > 1) {
                var3_int++;
                continue L0;
              } else {
                ub.field_c[var3_int][var4] = ic.field_D[var4 + (param1 * 12 - -(2 * var3_int))];
                la.field_f.a(-73);
                var4++;
                continue L8;
              }
            }
          }
        }
    }

    static {
        field_k = new boolean[][]{new boolean[]{false, false, false}, new boolean[]{true, true, true}, new boolean[]{true, true, true}, new boolean[]{true, true, true}, new boolean[]{true, false, true}, new boolean[]{false, true, false}, new boolean[]{true, true, true}, new boolean[]{true, true, true}};
        field_j = new int[]{28, 20};
        field_b = new ka[2][2];
        field_q = false;
        field_g = 0;
        field_m = "Loading graphics";
        field_p = new int[][]{new int[]{0}, new int[]{6}, new int[]{12}, new int[]{18}, new int[]{24}, new int[]{30, -2}};
    }
}
