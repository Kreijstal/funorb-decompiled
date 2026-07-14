/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    short[] field_O;
    int[] field_c;
    short field_k;
    short[] field_p;
    short[] field_f;
    short[] field_C;
    int[] field_h;
    static eh field_M;
    int field_e;
    int[] field_A;
    short[] field_P;
    byte field_w;
    short[] field_Q;
    short[] field_F;
    int[] field_z;
    private boolean field_t;
    short[] field_l;
    short field_L;
    int[] field_E;
    int[] field_r;
    short[] field_I;
    short[] field_b;
    short[] field_g;
    int field_n;
    static lg field_a;
    int[] field_o;
    int field_N;
    short[] field_s;
    short[] field_B;
    static String field_m;
    static int field_K;
    int[] field_G;
    int field_R;
    int field_D;
    short[] field_i;
    short[] field_x;
    int[] field_j;
    short[] field_u;
    short field_d;
    short[] field_J;
    byte[] field_v;
    short[] field_y;
    int field_H;
    static int field_q;

    final void a(boolean param0) {
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
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        var12 = Bounce.field_N;
        if (((jk) this).field_t) {
          return;
        } else {
          L0: {
            stackOut_3_0 = this;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (!param0) {
              stackOut_5_0 = this;
              stackOut_5_1 = 0;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              break L0;
            } else {
              stackOut_4_0 = this;
              stackOut_4_1 = 1;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              break L0;
            }
          }
          ((jk) this).field_t = stackIn_6_1 != 0;
          var2 = 32767;
          var3 = 32767;
          var4 = 32767;
          var5 = -32768;
          var6 = -32768;
          var7 = -32768;
          var8 = 0;
          L1: while (true) {
            if (var8 >= ((jk) this).field_k) {
              ((jk) this).field_H = var3;
              ((jk) this).field_e = var2;
              ((jk) this).field_n = var5;
              ((jk) this).field_D = var4;
              ((jk) this).field_R = var7;
              ((jk) this).field_N = var6;
              return;
            } else {
              L2: {
                var9 = ((jk) this).field_g[var8];
                var10 = ((jk) this).field_C[var8];
                if (var10 < var3) {
                  var3 = var10;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var11 = ((jk) this).field_J[var8];
                if (var10 > var6) {
                  var6 = var10;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (var9 > var5) {
                  var5 = var9;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var9 >= var2) {
                  break L5;
                } else {
                  var2 = var9;
                  break L5;
                }
              }
              L6: {
                if (var4 > var11) {
                  var4 = var11;
                  break L6;
                } else {
                  break L6;
                }
              }
              if (var11 > var7) {
                var7 = var11;
                var8++;
                continue L1;
              } else {
                var8++;
                continue L1;
              }
            }
          }
        }
    }

    private final void b(int param0) {
        ((jk) this).field_t = false;
        if (param0 >= -106) {
            ((jk) this).field_e = 73;
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = Bounce.field_N;
        if (param0 != -26) {
            int discarded$0 = jk.a((byte) 19);
        }
        for (var6 = 0; ((jk) this).field_k > var6; var6++) {
            ((jk) this).field_g[var6] = (short)(param3 * ((jk) this).field_g[var6] / param4);
            ((jk) this).field_C[var6] = (short)(param2 * ((jk) this).field_C[var6] / param4);
            ((jk) this).field_J[var6] = (short)(((jk) this).field_J[var6] * param1 / param4);
        }
        this.b(-120);
    }

    public static void a(int param0) {
        field_M = null;
        field_a = null;
        if (param0 != -19800) {
            int discarded$0 = jk.a((byte) -29);
        }
        field_m = null;
    }

    final static int a(byte param0) {
        if (sa.field_k < 2) {
          return 0;
        } else {
          L0: {
            if (0 == ud.field_a) {
              if (pa.field_i.c(-102)) {
                if (pa.field_i.b("commonui", false)) {
                  if (kg.field_b.c(108)) {
                    if (kg.field_b.b("commonui", false)) {
                      if (!ea.field_e.c(38)) {
                        return 70;
                      } else {
                        if (ea.field_e.a((byte) -40)) {
                          break L0;
                        } else {
                          return 80;
                        }
                      }
                    } else {
                      return 60;
                    }
                  } else {
                    return 50;
                  }
                } else {
                  return 40;
                }
              } else {
                return 20;
              }
            } else {
              L1: {
                if (jb.field_a == null) {
                  break L1;
                } else {
                  if (!jb.field_a.c(-125)) {
                    return 14;
                  } else {
                    if (jb.field_a.a("", (byte) -16)) {
                      if (!jb.field_a.b("", false)) {
                        return 29;
                      } else {
                        break L1;
                      }
                    } else {
                      return 29;
                    }
                  }
                }
              }
              if (pa.field_i.c(-101)) {
                if (pa.field_i.b("commonui", false)) {
                  if (!kg.field_b.c(98)) {
                    return 71;
                  } else {
                    if (!kg.field_b.b("commonui", false)) {
                      return 80;
                    } else {
                      if (!ea.field_e.c(-104)) {
                        return 82;
                      } else {
                        if (ea.field_e.a((byte) -114)) {
                          break L0;
                        } else {
                          return 86;
                        }
                      }
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
          if (param0 < -36) {
            return 100;
          } else {
            return 88;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var6 = Bounce.field_N;
        int var5 = 0;
        if (param1 <= 123) {
            return;
        }
        while (var5 < ((jk) this).field_k) {
            ((jk) this).field_g[var5] = (short)(((jk) this).field_g[var5] + param3);
            ((jk) this).field_C[var5] = (short)(((jk) this).field_C[var5] + param0);
            ((jk) this).field_J[var5] = (short)(((jk) this).field_J[var5] + param2);
            var5++;
        }
        this.b(-115);
    }

    final static tg[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        tg[] var10 = null;
        tg[] var11_ref_tg__ = null;
        int var11 = 0;
        int var12 = 0;
        tg var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = Bounce.field_N;
        var9 = param1 + (param5 - -param8);
        var10 = new tg[]{new tg(var9, var9), new tg(param6, var9), new tg(var9, var9), new tg(var9, param6), new tg(64, 64), new tg(var9, param6), new tg(var9, var9), new tg(param6, var9), new tg(var9, var9)};
        var11_ref_tg__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var12 >= var11_ref_tg__.length) {
            var10 = var11_ref_tg__;
            var11 = 0;
            L1: while (true) {
              if (var11 >= param5) {
                L2: {
                  if (param3 == -7139) {
                    break L2;
                  } else {
                    int discarded$1 = jk.a((byte) -26);
                    break L2;
                  }
                }
                var11 = 0;
                L3: while (true) {
                  if (var11 >= param5) {
                    var11 = 0;
                    L4: while (true) {
                      if (var11 >= param6) {
                        var11 = 0;
                        L5: while (true) {
                          if (param6 >> -498441599 <= var11) {
                            return var10;
                          } else {
                            var12 = 0;
                            L6: while (true) {
                              if (param8 <= var12) {
                                var11++;
                                continue L5;
                              } else {
                                var10[1].field_v[(-1 + var9 + -var12) * param6 + var11] = param4;
                                var10[3].field_v[var11 * var9 - 1 - -var9 - var12] = param4;
                                var10[7].field_v[var11 + param6 * var12] = param4;
                                var10[5].field_v[var9 * var11 - -var12] = param4;
                                var12++;
                                continue L6;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L7: while (true) {
                          if (var12 < param5) {
                            var10[7].field_v[param6 * (-1 + -var12 + var9) + var11] = param0;
                            var10[5].field_v[var9 * var11 + (-1 + (var9 - var12))] = param0;
                            var10[1].field_v[var11 + var12 * param6] = param2;
                            var10[3].field_v[var12 + var9 * var11] = param2;
                            var12++;
                            continue L7;
                          } else {
                            var11++;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L8: while (true) {
                      if (var12 < var9) {
                        var10[0].field_v[var9 * var11 + var12] = param2;
                        var10[0].field_v[var11 + var12 * var9] = param2;
                        if (-var11 + var9 > var12) {
                          var10[2].field_v[var11 * var9 + var12] = param2;
                          var10[6].field_v[var11 + var12 * var9] = param2;
                          var12++;
                          continue L8;
                        } else {
                          var12++;
                          continue L8;
                        }
                      } else {
                        var11++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L9: while (true) {
                  if (var9 > var12) {
                    var10[6].field_v[(-1 + (-var11 + var9)) * var9 - -var12] = param0;
                    var10[8].field_v[var9 * (-var11 + (var9 - 1)) + var12] = param0;
                    var10[2].field_v[var12 * var9 - var11 - (-var9 - -1)] = param0;
                    var10[8].field_v[-var11 + (-1 + (var9 + var9 * var12))] = param0;
                    var12++;
                    continue L9;
                  } else {
                    var11++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_tg__[var12];
            var14 = 0;
            L10: while (true) {
              if (var13.field_v.length <= var14) {
                var12++;
                continue L0;
              } else {
                var13.field_v[var14] = param7;
                var14++;
                continue L10;
              }
            }
          }
        }
    }

    jk() {
        ((jk) this).field_t = false;
        ((jk) this).field_w = (byte) 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new eh(7, 0, 1, 1);
        field_m = "High score service unavailable";
        field_K = 10;
        field_q = -1;
        field_a = new lg();
    }
}
