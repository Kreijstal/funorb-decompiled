/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends od {
    private int field_K;
    int[] field_G;
    int[] field_v;
    static boolean field_P;
    private int[] field_O;
    private int[] field_F;
    private int[] field_q;
    int[] field_E;
    private int[] field_n;
    private pl[][] field_z;
    private int[] field_p;
    private int[] field_C;
    private fc field_D;
    private int[] field_M;
    private ic field_u;
    private int[] field_J;
    private int[] field_I;
    private int[] field_r;
    static long field_y;
    private int[] field_Q;
    static String field_N;
    private int field_l;
    private pl[][] field_w;
    private int[] field_L;
    private int[] field_j;
    private int field_o;
    private long field_B;
    private int field_H;
    private ka field_m;
    private boolean field_k;
    private long field_A;
    private rm field_x;
    private boolean field_s;
    private int field_t;

    private final void d(int param0, int param1, int param2) {
        if (param0 != 127) {
            return;
        }
        ((wg) this).field_Q[param1] = param2;
    }

    final boolean a(pl param0, byte param1) {
        if (!(null != param0.field_v)) {
            if (0 > param0.field_l) {
                return true;
            }
            param0.a(false);
            if (param0.field_C > 0) {
                if (((wg) this).field_w[param0.field_i][param0.field_C] == param0) {
                    ((wg) this).field_w[param0.field_i][param0.field_C] = null;
                }
            }
            return true;
        }
        if (param1 < 98) {
            return true;
        }
        return false;
    }

    public static void e(int param0) {
        if (param0 < 12) {
            wg.f(72);
        }
        field_N = null;
    }

    private final int a(pl param0, boolean param1) {
        int var3 = 0;
        cp var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var3 = param0.field_o + (param0.field_q * param0.field_D >> 425798764);
          var3 = var3 + (((wg) this).field_I[param0.field_i] * (-8192 + ((wg) this).field_Q[param0.field_i]) >> 904913612);
          var4 = param0.field_E;
          if (var4.field_l <= 0) {
            break L0;
          } else {
            L1: {
              if (var4.field_i > 0) {
                break L1;
              } else {
                if (-1 <= (((wg) this).field_j[param0.field_i] ^ -1)) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var5 = var4.field_i << 979671074;
              var6 = var4.field_e << 955113537;
              if (var6 > param0.field_z) {
                var5 = param0.field_z * var5 / var6;
                break L2;
              } else {
                break L2;
              }
            }
            var5 = var5 + (((wg) this).field_j[param0.field_i] >> -683602457);
            var7 = Math.sin((double)(param0.field_p & 511) * 0.01227184630308513);
            var3 = var3 + (int)((double)var5 * var7);
            break L0;
          }
        }
        L3: {
          var5 = (int)(0.5 + (double)(256 * param0.field_t.field_j) * Math.pow(2.0, (double)var3 * 0.0003255208333333333) / (double)id.field_m);
          if (!param1) {
            break L3;
          } else {
            ((wg) this).field_w = null;
            break L3;
          }
        }
        L4: {
          if (var5 >= 1) {
            stackOut_12_0 = var5;
            stackIn_13_0 = stackOut_12_0;
            break L4;
          } else {
            stackOut_11_0 = 1;
            stackIn_13_0 = stackOut_11_0;
            break L4;
          }
        }
        return stackIn_13_0;
    }

    private final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = CrazyCrystals.field_B;
        var3 = param1 & 240;
        if ((var3 ^ -1) != -129) {
          L0: {
            if (-145 == (var3 ^ -1)) {
              var4 = param1 & 15;
              var5 = (32690 & param1) >> -1314277048;
              var6 = 127 & param1 >> 1130156816;
              if (0 >= var6) {
                this.a(var4, false, 64, var5);
                return;
              } else {
                this.a(var6, 0, var5, var4);
                break L0;
              }
            } else {
              if (160 == var3) {
                var4 = 15 & param1;
                var5 = param1 >> 564261512 & 127;
                var6 = param1 >> 673119600 & 127;
                this.a((byte) 121, var5, var6, var4);
                return;
              } else {
                if ((var3 ^ -1) != -177) {
                  if (param0 == 63) {
                    if (var3 != 192) {
                      if (var3 == 208) {
                        var4 = 15 & param1;
                        var5 = 127 & param1 >> -2028627384;
                        this.c(var4, 2, var5);
                        return;
                      } else {
                        if (224 == var3) {
                          var4 = param1 & 15;
                          var5 = ((32752 & param1) >> 1447087912) + ((8323282 & param1) >> -2129355287);
                          this.d(param0 + 64, var4, var5);
                          return;
                        } else {
                          var3 = 255 & param1;
                          if (var3 == 255) {
                            this.a(true, param0 + 13333);
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    } else {
                      var4 = 15 & param1;
                      var5 = (param1 & 32587) >> -530610232;
                      this.a(var4, 22519, ((wg) this).field_M[var4] - -var5);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  L1: {
                    var4 = param1 & 15;
                    var5 = param1 >> 1284572200 & 127;
                    var6 = (8341461 & param1) >> -896140848;
                    if (-1 == (var5 ^ -1)) {
                      ((wg) this).field_M[var4] = pf.b(-2080769, ((wg) this).field_M[var4]) - -(var6 << 385521230);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (-33 != (var5 ^ -1)) {
                      break L2;
                    } else {
                      ((wg) this).field_M[var4] = pf.b(-16257, ((wg) this).field_M[var4]) - -(var6 << 1335331079);
                      break L2;
                    }
                  }
                  L3: {
                    if (var5 != 1) {
                      break L3;
                    } else {
                      ((wg) this).field_j[var4] = (var6 << 815078823) + pf.b(-16257, ((wg) this).field_j[var4]);
                      break L3;
                    }
                  }
                  L4: {
                    if (33 != var5) {
                      break L4;
                    } else {
                      ((wg) this).field_j[var4] = pf.b(((wg) this).field_j[var4], -128) + var6;
                      break L4;
                    }
                  }
                  L5: {
                    if (-6 != (var5 ^ -1)) {
                      break L5;
                    } else {
                      ((wg) this).field_F[var4] = (var6 << 2054646279) + pf.b(-16257, ((wg) this).field_F[var4]);
                      break L5;
                    }
                  }
                  L6: {
                    if ((var5 ^ -1) == -38) {
                      ((wg) this).field_F[var4] = var6 + pf.b(-128, ((wg) this).field_F[var4]);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if ((var5 ^ -1) == -8) {
                      ((wg) this).field_r[var4] = (var6 << 532441799) + pf.b(((wg) this).field_r[var4], -16257);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if ((var5 ^ -1) == -40) {
                      ((wg) this).field_r[var4] = var6 + pf.b(((wg) this).field_r[var4], -128);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if ((var5 ^ -1) == -11) {
                      ((wg) this).field_q[var4] = pf.b(-16257, ((wg) this).field_q[var4]) - -(var6 << -5369337);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if ((var5 ^ -1) == -43) {
                      ((wg) this).field_q[var4] = var6 + pf.b(((wg) this).field_q[var4], -128);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if ((var5 ^ -1) == -12) {
                      ((wg) this).field_O[var4] = pf.b(((wg) this).field_O[var4], -16257) + (var6 << 526093799);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (-44 == (var5 ^ -1)) {
                      ((wg) this).field_O[var4] = pf.b(-128, ((wg) this).field_O[var4]) - -var6;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (var5 != 64) {
                      break L13;
                    } else {
                      if (var6 >= 64) {
                        ((wg) this).field_E[var4] = hm.a(((wg) this).field_E[var4], 1);
                        break L13;
                      } else {
                        ((wg) this).field_E[var4] = pf.b(((wg) this).field_E[var4], -2);
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (65 == var5) {
                      if (-65 >= (var6 ^ -1)) {
                        ((wg) this).field_E[var4] = hm.a(((wg) this).field_E[var4], 2);
                        break L14;
                      } else {
                        this.d(98, var4);
                        ((wg) this).field_E[var4] = pf.b(((wg) this).field_E[var4], -3);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (-100 != (var5 ^ -1)) {
                      break L15;
                    } else {
                      ((wg) this).field_p[var4] = (var6 << -292700537) + pf.b(((wg) this).field_p[var4], 127);
                      break L15;
                    }
                  }
                  L16: {
                    if (-99 == (var5 ^ -1)) {
                      ((wg) this).field_p[var4] = pf.b(((wg) this).field_p[var4], 16256) + var6;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (-102 != (var5 ^ -1)) {
                      break L17;
                    } else {
                      ((wg) this).field_p[var4] = (var6 << 241843911) + (pf.b(127, ((wg) this).field_p[var4]) + 16384);
                      break L17;
                    }
                  }
                  L18: {
                    if (-101 == (var5 ^ -1)) {
                      ((wg) this).field_p[var4] = 16384 + pf.b(16256, ((wg) this).field_p[var4]) + var6;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (120 == var5) {
                      this.a(-33, var4);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (var5 == 121) {
                      this.b(var4, param0 + 193);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (-124 == (var5 ^ -1)) {
                      this.f(var4, -87);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (-7 != (var5 ^ -1)) {
                      break L22;
                    } else {
                      var7 = ((wg) this).field_p[var4];
                      if ((var7 ^ -1) == -16385) {
                        ((wg) this).field_I[var4] = (var6 << -2140902489) + pf.b(((wg) this).field_I[var4], -16257);
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L23: {
                    if (var5 == 38) {
                      var7 = ((wg) this).field_p[var4];
                      if (-16385 == (var7 ^ -1)) {
                        ((wg) this).field_I[var4] = var6 + pf.b(((wg) this).field_I[var4], -128);
                        break L23;
                      } else {
                        break L23;
                      }
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if (16 == var5) {
                      ((wg) this).field_v[var4] = pf.b(((wg) this).field_v[var4], -16257) - -(var6 << -271508793);
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (48 == var5) {
                      ((wg) this).field_v[var4] = var6 + pf.b(-128, ((wg) this).field_v[var4]);
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (-82 == (var5 ^ -1)) {
                      if (var6 < 64) {
                        this.c(110, var4);
                        ((wg) this).field_E[var4] = pf.b(((wg) this).field_E[var4], -5);
                        break L26;
                      } else {
                        ((wg) this).field_E[var4] = hm.a(((wg) this).field_E[var4], 4);
                        break L26;
                      }
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if ((var5 ^ -1) == -18) {
                      this.a((var6 << -1132210809) + (((wg) this).field_n[var4] & -16257), true, var4);
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  if (var5 != 49) {
                    break L0;
                  } else {
                    this.a((-128 & ((wg) this).field_n[var4]) + var6, true, var4);
                    return;
                  }
                }
              }
            }
          }
          return;
        } else {
          var4 = param1 & 15;
          var5 = param1 >> -48488184 & 127;
          var6 = (8353046 & param1) >> 652260080;
          this.a(var4, false, var6, var5);
          return;
        }
    }

    final static void f(int param0) {
        if (param0 != -11142) {
            wg.e(18);
        }
        rc.a(-25537, 4);
    }

    private final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = CrazyCrystals.field_B;
          var2 = ((wg) this).field_H;
          var3 = ((wg) this).field_o;
          var4 = ((wg) this).field_A;
          if (null == ((wg) this).field_x) {
            break L0;
          } else {
            if (((wg) this).field_t == var3) {
              this.a(((wg) this).field_s, 8192, ((wg) this).field_x, ((wg) this).field_k);
              this.g(-731);
              return;
            } else {
              break L0;
            }
          }
        }
        if (param0 == -731) {
          L1: while (true) {
            if (((wg) this).field_o != var3) {
              L2: {
                ((wg) this).field_A = var4;
                ((wg) this).field_o = var3;
                ((wg) this).field_H = var2;
                if (((wg) this).field_x == null) {
                  break L2;
                } else {
                  if (((wg) this).field_t < var3) {
                    ((wg) this).field_o = ((wg) this).field_t;
                    ((wg) this).field_H = -1;
                    ((wg) this).field_A = ((wg) this).field_u.b(((wg) this).field_o);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              return;
            } else {
              L3: while (true) {
                L4: {
                  if (var3 != ((wg) this).field_u.field_h[var2]) {
                    break L4;
                  } else {
                    ((wg) this).field_u.c(var2);
                    var6 = ((wg) this).field_u.f(var2);
                    if (var6 != 1) {
                      L5: {
                        if ((var6 & 128) == 0) {
                          break L5;
                        } else {
                          this.a((byte) 63, var6);
                          break L5;
                        }
                      }
                      ((wg) this).field_u.d(var2);
                      ((wg) this).field_u.e(var2);
                      continue L3;
                    } else {
                      ((wg) this).field_u.c();
                      ((wg) this).field_u.e(var2);
                      if (!((wg) this).field_u.f()) {
                        break L4;
                      } else {
                        if (((wg) this).field_x == null) {
                          L6: {
                            if (!((wg) this).field_k) {
                              break L6;
                            } else {
                              if (var3 != 0) {
                                ((wg) this).field_u.a(var4);
                                break L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                          this.a(true, 13396);
                          ((wg) this).field_u.e();
                          return;
                        } else {
                          ((wg) this).a(115, ((wg) this).field_x, ((wg) this).field_k);
                          this.g(param0 + 0);
                          return;
                        }
                      }
                    }
                  }
                }
                var2 = ((wg) this).field_u.b();
                var3 = ((wg) this).field_u.field_h[var2];
                var4 = ((wg) this).field_u.b(var3);
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    private final int b(pl param0, boolean param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (!(((wg) this).field_J[param0.field_i] != 0)) {
            return 0;
        }
        if (param1) {
            ((wg) this).field_v = null;
        }
        cp var9 = param0.field_E;
        cp var10 = var9;
        int var4 = 4096 + ((wg) this).field_O[param0.field_i] * ((wg) this).field_r[param0.field_i] >> -736196755;
        var4 = var4 * var4 - -16384 >> 998512463;
        var4 = var4 * param0.field_m + 16384 >> 775207983;
        var4 = 128 + var4 * ((wg) this).field_l >> -561302040;
        var4 = 128 + var4 * ((wg) this).field_J[param0.field_i] >> 1364031464;
        if (!((var10.field_g ^ -1) >= -1)) {
            var4 = (int)((double)var4 * Math.pow(0.5, (double)param0.field_w * 0.00001953125 * (double)var10.field_g) + 0.5);
        }
        if (!(null == var10.field_a)) {
            var5 = param0.field_x;
            var6 = var10.field_a[param0.field_r + 1];
            if (param0.field_r < var10.field_a.length - 2) {
                var7 = (var9.field_a[param0.field_r] & 255) << 70108872;
                var8 = var10.field_a[2 + param0.field_r] << -1991537112 & 65280;
                var6 = var6 + (var5 + -var7) * (-var6 + var10.field_a[3 + param0.field_r]) / (var8 + -var7);
            }
            var4 = 32 + var4 * var6 >> -1610705978;
        }
        if (-1 > (param0.field_l ^ -1)) {
            if (!(var10.field_b == null)) {
                var5 = param0.field_l;
                var6 = var10.field_b[param0.field_f + 1];
                if (!(param0.field_f >= var10.field_b.length + -2)) {
                    var7 = 65280 & var9.field_b[param0.field_f] << -1436500920;
                    var8 = 65280 & var10.field_b[param0.field_f + 2] << 159297928;
                    var6 = var6 + (-var6 + var10.field_b[3 + param0.field_f]) * (-var7 + var5) / (var8 - var7);
                }
                var4 = var4 * var6 + 32 >> -2120573242;
            }
        }
        return var4;
    }

    private final void a(int param0, boolean param1, int param2) {
        ((wg) this).field_n[param2] = param0;
        if (!param1) {
            ((wg) this).field_z = null;
        }
        ((wg) this).field_G[param2] = (int)(0.5 + Math.pow(2.0, 0.00054931640625 * (double)param0) * 2097152.0);
    }

    private final void c(int param0, int param1) {
        pl var3 = null;
        int var4 = CrazyCrystals.field_B;
        if (!(0 == (4 & ((wg) this).field_E[param1]))) {
            var3 = (pl) (Object) ((wg) this).field_m.field_k.g(32073);
            while (var3 != null) {
                if (!(var3.field_i != param1)) {
                    var3.field_j = 0;
                }
                var3 = (pl) (Object) ((wg) this).field_m.field_k.a(false);
            }
        }
        if (param0 < 21) {
            ((wg) this).field_H = 20;
        }
    }

    final synchronized od a() {
        return null;
    }

    private final synchronized void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = CrazyCrystals.field_B;
        if (param0 >= param1) {
            ((wg) this).field_J[param0] = param2;
        } else {
            for (var4 = 0; -17 < (var4 ^ -1); var4++) {
                ((wg) this).field_J[var4] = param2;
            }
        }
    }

    private final void a(byte param0, int param1, int param2) {
        if (param0 < 31) {
            this.a(32, false, -33, 108);
        }
        ((wg) this).field_C[param2] = param1;
        ((wg) this).field_M[param2] = pf.b(param1, -128);
        this.a(param2, 22519, param1);
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = CrazyCrystals.field_B;
        if (param1 != 13396) {
            return;
        }
        if (param0) {
            this.a(-33, -1);
        } else {
            this.f(-1, -123);
        }
        this.b(-1, 256);
        for (var3 = 0; 16 > var3; var3++) {
            ((wg) this).field_L[var3] = ((wg) this).field_C[var3];
        }
        int var5 = 0;
        var3 = var5;
        while ((var5 ^ -1) > -17) {
            ((wg) this).field_M[var5] = pf.b(-128, ((wg) this).field_C[var5]);
            var5++;
        }
    }

    private final void c(int param0, int param1, int param2) {
        if (param1 != 2) {
            ((wg) this).field_E = null;
        }
    }

    final synchronized void a(int param0, rm param1, boolean param2) {
        this.a(true, 8192, param1, param2);
        int var4 = -66 / ((param0 - 12) / 63);
    }

    final void a(byte param0, pl param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var4 = param1.field_t.field_k.length;
        if (param0 == 2) {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                if (!param1.field_t.field_i) {
                  break L1;
                } else {
                  var6 = var4 + (var4 + -param1.field_t.field_g);
                  var4 = var4 << 8;
                  var5 = (int)((long)((wg) this).field_v[param1.field_i] * (long)var6 >> 482854790);
                  if (var4 > var5) {
                    break L0;
                  } else {
                    var5 = -var5 + -1 + (var4 + var4);
                    param1.field_v.b(true);
                    break L0;
                  }
                }
              }
            }
            var5 = (int)((long)((wg) this).field_v[param1.field_i] * (long)var4 >> 1672779590);
            break L0;
          }
          param1.field_v.g(var5);
          return;
        } else {
          return;
        }
    }

    final synchronized int c() {
        return 0;
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          L1: {
            var8 = CrazyCrystals.field_B;
            if (!((wg) this).field_u.d()) {
              break L1;
            } else {
              var4 = ((wg) this).field_K * ((wg) this).field_u.field_c / id.field_m;
              L2: while (true) {
                var5 = (long)var4 * (long)param2 + ((wg) this).field_B;
                if ((-var5 + ((wg) this).field_A ^ -1L) <= -1L) {
                  ((wg) this).field_B = var5;
                  break L1;
                } else {
                  var7 = (int)((-1L + (long)var4 + (-((wg) this).field_B + ((wg) this).field_A)) / (long)var4);
                  ((wg) this).field_B = ((wg) this).field_B + (long)var4 * (long)var7;
                  ((wg) this).field_m.a(param0, param1, var7);
                  param2 = param2 - var7;
                  param1 = param1 + var7;
                  this.g(-731);
                  if (((wg) this).field_u.d()) {
                    continue L2;
                  } else {
                    ((wg) this).field_m.a(param0, param1, param2);
                    break L0;
                  }
                }
              }
            }
          }
          ((wg) this).field_m.a(param0, param1, param2);
          break L0;
        }
    }

    private final synchronized void b(boolean param0, int param1) {
        ((wg) this).field_u.e();
        ((wg) this).field_x = null;
        this.a(param0, 13396);
        if (param1 >= -82) {
            ((wg) this).field_q = null;
        }
    }

    final synchronized od d() {
        return (od) (Object) ((wg) this).field_m;
    }

    private final synchronized void a(boolean param0, int param1, rm param2, boolean param3) {
        int var6 = 0;
        int var7 = CrazyCrystals.field_B;
        this.b(param0, param1 + -8306);
        ((wg) this).field_u.a(param2.field_g);
        ((wg) this).field_B = 0L;
        ((wg) this).field_k = param3 ? true : false;
        int var5 = ((wg) this).field_u.a();
        if (param1 != 8192) {
            ((wg) this).field_m = null;
        }
        for (var6 = 0; var5 > var6; var6++) {
            ((wg) this).field_u.c(var6);
            ((wg) this).field_u.d(var6);
            ((wg) this).field_u.e(var6);
        }
        ((wg) this).field_H = ((wg) this).field_u.b();
        ((wg) this).field_o = ((wg) this).field_u.field_h[((wg) this).field_H];
        ((wg) this).field_A = ((wg) this).field_u.b(((wg) this).field_o);
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = CrazyCrystals.field_B;
        if (param1 != 22519) {
            return;
        }
        if (((wg) this).field_L[param0] != param2) {
            ((wg) this).field_L[param0] = param2;
            for (var4 = 0; 128 > var4; var4++) {
                ((wg) this).field_w[param0][var4] = null;
            }
        }
    }

    private final void a(int param0, int param1) {
        pl var3 = null;
        int var4 = 0;
        L0: {
          var4 = CrazyCrystals.field_B;
          var3 = (pl) (Object) ((wg) this).field_m.field_k.g(32073);
          if (param0 == -33) {
            break L0;
          } else {
            this.c(12, -19);
            break L0;
          }
        }
        L1: while (true) {
          if (var3 == null) {
            return;
          } else {
            L2: {
              L3: {
                if (-1 < (param1 ^ -1)) {
                  break L3;
                } else {
                  if (var3.field_i == param1) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (var3.field_v == null) {
                  break L4;
                } else {
                  L5: {
                    var3.field_v.d(id.field_m / 100);
                    if (!var3.field_v.e()) {
                      break L5;
                    } else {
                      ((wg) this).field_m.field_l.b((od) (Object) var3.field_v);
                      break L5;
                    }
                  }
                  var3.d(12426);
                  break L4;
                }
              }
              L6: {
                if (var3.field_l >= 0) {
                  break L6;
                } else {
                  ((wg) this).field_z[var3.field_i][var3.field_y] = null;
                  break L6;
                }
              }
              var3.a(false);
              break L2;
            }
            var3 = (pl) (Object) ((wg) this).field_m.field_k.a(false);
            continue L1;
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        pl var5 = null;
        ko var6 = null;
        int var6_int = 0;
        pl var7 = null;
        pl var8 = null;
        int var9 = 0;
        dk var10 = null;
        dk var11 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        pl stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        pl stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        pl stackIn_18_2 = null;
        int stackIn_18_3 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        pl stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        pl stackOut_17_2 = null;
        int stackOut_17_3 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        pl stackOut_16_2 = null;
        int stackOut_16_3 = 0;
        L0: {
          var9 = CrazyCrystals.field_B;
          this.a(param3, false, 64, param2);
          if ((2 & ((wg) this).field_E[param3]) != 0) {
            var5 = (pl) (Object) ((wg) this).field_m.field_k.a((byte) -119);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (var5.field_i != param3) {
                    break L2;
                  } else {
                    if (0 <= var5.field_l) {
                      break L2;
                    } else {
                      ((wg) this).field_z[param3][var5.field_y] = null;
                      ((wg) this).field_z[param3][param2] = var5;
                      var6_int = var5.field_o - -(var5.field_q * var5.field_D >> -34756948);
                      var5.field_o = var5.field_o + (-var5.field_y + param2 << -409374552);
                      var5.field_q = 4096;
                      var5.field_D = -var5.field_o + var6_int;
                      var5.field_y = param2;
                      return;
                    }
                  }
                }
                var5 = (pl) (Object) ((wg) this).field_m.field_k.e(0);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var10 = (dk) (Object) ((wg) this).field_D.a((long)((wg) this).field_L[param3], param1 ^ 0);
        var11 = var10;
        if (var11 == null) {
          return;
        } else {
          var6 = var10.field_m[param2];
          if (var6 == null) {
            return;
          } else {
            L3: {
              var7 = new pl();
              var7.field_i = param3;
              var7.field_A = var11;
              var7.field_t = var6;
              var7.field_E = var10.field_j[param2];
              var7.field_C = var10.field_f[param2];
              var7.field_y = param2;
              var7.field_m = 1024 + var11.field_g * (param0 * param0) * var10.field_p[param2] >> 836414635;
              var7.field_u = var10.field_i[param2] & 255;
              var7.field_o = (param2 << -750989656) - (var10.field_n[param2] & 32767);
              var7.field_w = 0;
              var7.field_l = -1;
              var7.field_x = 0;
              var7.field_f = 0;
              var7.field_r = 0;
              if (((wg) this).field_v[param3] == param1) {
                var7.field_v = kg.b(var6, this.a(var7, false), this.b(var7, false), this.a(var7, param1 + 255));
                break L3;
              } else {
                L4: {
                  var7.field_v = kg.b(var6, this.a(var7, false), 0, this.a(var7, param1 + 255));
                  stackOut_15_0 = this;
                  stackOut_15_1 = 2;
                  stackOut_15_2 = (pl) var7;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  if (-1 >= (var10.field_n[param2] ^ -1)) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = (pl) (Object) stackIn_17_2;
                    stackOut_17_3 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    stackIn_18_3 = stackOut_17_3;
                    break L4;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = (pl) (Object) stackIn_16_2;
                    stackOut_16_3 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    stackIn_18_3 = stackOut_16_3;
                    break L4;
                  }
                }
                ((wg) this).a((byte) stackIn_18_1, stackIn_18_2, stackIn_18_3 != 0);
                break L3;
              }
            }
            L5: {
              if (-1 < var10.field_n[param2]) {
                var7.field_v.f(-1);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (-1 > var7.field_C) {
                break L6;
              } else {
                L7: {
                  var8 = ((wg) this).field_w[param3][var7.field_C];
                  if (var8 == null) {
                    break L7;
                  } else {
                    if (-1 >= (var8.field_l ^ -1)) {
                      break L7;
                    } else {
                      ((wg) this).field_z[param3][var8.field_y] = null;
                      var8.field_l = 0;
                      break L7;
                    }
                  }
                }
                ((wg) this).field_w[param3][var7.field_C] = var7;
                break L6;
              }
            }
            ((wg) this).field_m.field_k.b(param1 + 0, (jb) (Object) var7);
            ((wg) this).field_z[param3][param2] = var7;
            return;
          }
        }
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        int var5 = -102 / ((param0 - 8) / 46);
    }

    final synchronized void d(int param0) {
        if (param0 < 15) {
            this.f(-8, -80);
        }
        this.b(true, -103);
    }

    final synchronized void e(int param0, int param1) {
        ((wg) this).field_l = param1;
        if (param0 != -20562) {
            ((wg) this).field_n = null;
        }
    }

    final synchronized boolean a(db param0, bn param1, rm param2, int param3, int param4) {
        int var6 = 0;
        Object var7 = null;
        dm var8 = null;
        int var9 = 0;
        dk var10 = null;
        int var11 = 0;
        var11 = CrazyCrystals.field_B;
        param2.b();
        if (param3 == -128) {
          L0: {
            var6 = 1;
            var7 = null;
            if (-1 <= (param4 ^ -1)) {
              break L0;
            } else {
              var7 = (Object) (Object) new int[]{param4};
              break L0;
            }
          }
          var8 = (dm) (Object) param2.field_f.a((byte) -93);
          L1: while (true) {
            if (var8 == null) {
              L2: {
                if (var6 != 0) {
                  param2.a();
                  break L2;
                } else {
                  break L2;
                }
              }
              return var6 != 0;
            } else {
              L3: {
                L4: {
                  var9 = (int)var8.field_e;
                  var10 = (dk) (Object) ((wg) this).field_D.a((long)var9, 0);
                  if (var10 == null) {
                    L5: {
                      var10 = md.a(var9, 103, param0);
                      if (var10 != null) {
                        ((wg) this).field_D.a(-22072, (long)var9, (jb) (Object) var10);
                        break L5;
                      } else {
                        var6 = 0;
                        break L5;
                      }
                    }
                    if (var10 == null) {
                      break L3;
                    } else {
                      if (!var10.a(true, param1, (int[]) var7, var8.field_g)) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  } else {
                    if (var10 == null) {
                      break L3;
                    } else {
                      if (!var10.a(true, param1, (int[]) var7, var8.field_g)) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var6 = 0;
                break L3;
              }
              var8 = (dm) (Object) param2.field_f.a(88);
              continue L1;
            }
          }
        } else {
          return false;
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        pl var6 = null;
        int var7 = CrazyCrystals.field_B;
        if (param1) {
            return;
        }
        pl var8 = ((wg) this).field_z[param0][param3];
        if (!(var8 != null)) {
            return;
        }
        ((wg) this).field_z[param0][param3] = null;
        if (-1 == (((wg) this).field_E[param0] & 2 ^ -1)) {
            var8.field_l = 0;
        } else {
            var6 = (pl) (Object) ((wg) this).field_m.field_k.g(32073);
            while (var6 != null) {
                if (var8.field_i == var6.field_i) {
                    if ((var6.field_l ^ -1) > -1) {
                        if (!(var8 == var6)) {
                            var8.field_l = 0;
                            break;
                        }
                    }
                }
                var6 = (pl) (Object) ((wg) this).field_m.field_k.a(false);
            }
        }
    }

    private final void d(int param0, int param1) {
        pl var3_ref_pl = null;
        int var4 = CrazyCrystals.field_B;
        if (!(0 == (2 & ((wg) this).field_E[param1]))) {
            var3_ref_pl = (pl) (Object) ((wg) this).field_m.field_k.g(32073);
            while (var3_ref_pl != null) {
                if (var3_ref_pl.field_i == param1) {
                    if (((wg) this).field_z[param1][var3_ref_pl.field_y] == null) {
                        if (!(0 <= var3_ref_pl.field_l)) {
                            var3_ref_pl.field_l = 0;
                        }
                    }
                }
                var3_ref_pl = (pl) (Object) ((wg) this).field_m.field_k.a(false);
            }
        }
        int var3 = 109 % ((23 - param0) / 57);
    }

    final boolean a(int param0, int param1, int[] param2, pl param3, byte param4) {
        int var6 = 0;
        int var7 = 0;
        cp var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        L0: {
          var12 = CrazyCrystals.field_B;
          param3.field_k = id.field_m / 100;
          if (-1 < (param3.field_l ^ -1)) {
            break L0;
          } else {
            L1: {
              if (param3.field_v == null) {
                break L1;
              } else {
                if (param3.field_v.h()) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            L2: {
              param3.d(12426);
              param3.a(false);
              if (-1 <= (param3.field_C ^ -1)) {
                break L2;
              } else {
                if (((wg) this).field_w[param3.field_i][param3.field_C] != param3) {
                  break L2;
                } else {
                  ((wg) this).field_w[param3.field_i][param3.field_C] = null;
                  return true;
                }
              }
            }
            return true;
          }
        }
        L3: {
          var6 = param3.field_q;
          var7 = -17 % ((-43 - param4) / 48);
          if (-1 > (var6 ^ -1)) {
            L4: {
              var6 = var6 - (int)(0.5 + 16.0 * Math.pow(2.0, (double)((wg) this).field_F[param3.field_i] * 0.0004921259842519685));
              if ((var6 ^ -1) > -1) {
                var6 = 0;
                break L4;
              } else {
                break L4;
              }
            }
            param3.field_q = var6;
            break L3;
          } else {
            break L3;
          }
        }
        L5: {
          param3.field_v.h(this.a(param3, false));
          var8 = param3.field_E;
          var9 = 0;
          param3.field_z = param3.field_z + 1;
          param3.field_p = param3.field_p + var8.field_l;
          var10 = 0.000005086263020833333 * (double)((param3.field_D * param3.field_q >> -429610612) + (-60 + param3.field_y << -1129160120));
          if (0 < var8.field_g) {
            L6: {
              if (var8.field_j > 0) {
                param3.field_w = param3.field_w + (int)(0.5 + Math.pow(2.0, (double)var8.field_j * var10) * 128.0);
                break L6;
              } else {
                param3.field_w = param3.field_w + 128;
                break L6;
              }
            }
            if (-819201 >= var8.field_g * param3.field_w) {
              var9 = 1;
              break L5;
            } else {
              break L5;
            }
          } else {
            break L5;
          }
        }
        L7: {
          if (var8.field_a != null) {
            L8: {
              if (-1 < var8.field_f) {
                param3.field_x = param3.field_x + (int)(0.5 + Math.pow(2.0, var10 * (double)var8.field_f) * 128.0);
                break L8;
              } else {
                param3.field_x = param3.field_x + 128;
                break L8;
              }
            }
            L9: while (true) {
              L10: {
                if (-2 + var8.field_a.length <= param3.field_r) {
                  break L10;
                } else {
                  if ((65280 & var8.field_a[param3.field_r - -2] << 2031765992) >= param3.field_x) {
                    break L10;
                  } else {
                    param3.field_r = param3.field_r + 2;
                    continue L9;
                  }
                }
              }
              if (var8.field_a.length + -2 != param3.field_r) {
                break L7;
              } else {
                if (0 == var8.field_a[1 + param3.field_r]) {
                  var9 = 1;
                  break L7;
                } else {
                  break L7;
                }
              }
            }
          } else {
            break L7;
          }
        }
        L11: {
          if (-1 < (param3.field_l ^ -1)) {
            break L11;
          } else {
            if (var8.field_b == null) {
              break L11;
            } else {
              if ((1 & ((wg) this).field_E[param3.field_i]) == 0) {
                L12: {
                  if (0 > param3.field_C) {
                    break L12;
                  } else {
                    if (((wg) this).field_w[param3.field_i][param3.field_C] == param3) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                L13: {
                  if (0 < var8.field_c) {
                    param3.field_l = param3.field_l + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var8.field_c * var10));
                    break L13;
                  } else {
                    param3.field_l = param3.field_l + 128;
                    break L13;
                  }
                }
                L14: while (true) {
                  L15: {
                    if (param3.field_f >= -2 + var8.field_b.length) {
                      break L15;
                    } else {
                      if ((255 & var8.field_b[2 + param3.field_f]) << -1550967256 >= param3.field_l) {
                        break L15;
                      } else {
                        param3.field_f = param3.field_f + 2;
                        continue L14;
                      }
                    }
                  }
                  if (param3.field_f == -2 + var8.field_b.length) {
                    var9 = 1;
                    break L11;
                  } else {
                    break L11;
                  }
                }
              } else {
                break L11;
              }
            }
          }
        }
        if (var9 == 0) {
          param3.field_v.a(param3.field_k, this.b(param3, false), this.a(param3, 255));
          return false;
        } else {
          L16: {
            param3.field_v.d(param3.field_k);
            if (param2 != null) {
              param3.field_v.a(param2, param1, param0);
              break L16;
            } else {
              param3.field_v.a(param0);
              break L16;
            }
          }
          L17: {
            if (param3.field_v.e()) {
              ((wg) this).field_m.field_l.b((od) (Object) param3.field_v);
              break L17;
            } else {
              break L17;
            }
          }
          L18: {
            param3.d(12426);
            if (-1 < (param3.field_l ^ -1)) {
              break L18;
            } else {
              param3.a(false);
              if (param3.field_C <= 0) {
                break L18;
              } else {
                if (param3 == ((wg) this).field_w[param3.field_i][param3.field_C]) {
                  ((wg) this).field_w[param3.field_i][param3.field_C] = null;
                  break L18;
                } else {
                  break L18;
                }
              }
            }
          }
          return true;
        }
    }

    private final int a(pl param0, int param1) {
        if (param1 != 255) {
            return 95;
        }
        int var3 = ((wg) this).field_q[param0.field_i];
        if (8192 <= var3) {
            return 16384 - ((128 + -param0.field_u) * (16384 - var3) - -32 >> 1240983366);
        }
        return 32 + var3 * param0.field_u >> 1873748326;
    }

    final synchronized void a(int param0, int param1, byte param2) {
        this.a((byte) 44, param0, param1);
        int var4 = 50 % ((param2 - 53) / 53);
    }

    private final void b(int param0, int param1) {
        int var4 = 0;
        var4 = CrazyCrystals.field_B;
        if ((param0 ^ -1) > -1) {
          param0 = 0;
          L0: while (true) {
            if ((param0 ^ -1) <= -17) {
              return;
            } else {
              this.b(param0, 256);
              param0++;
              continue L0;
            }
          }
        } else {
          ((wg) this).field_r[param0] = 12800;
          ((wg) this).field_q[param0] = 8192;
          ((wg) this).field_O[param0] = 16383;
          ((wg) this).field_Q[param0] = 8192;
          ((wg) this).field_j[param0] = 0;
          ((wg) this).field_F[param0] = 8192;
          this.d(param1 + -343, param0);
          this.c(param1 + -230, param0);
          ((wg) this).field_E[param0] = 0;
          ((wg) this).field_p[param0] = 32767;
          ((wg) this).field_I[param0] = param1;
          ((wg) this).field_v[param0] = 0;
          this.a(8192, true, param0);
          return;
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = CrazyCrystals.field_B;
          if (((wg) this).field_u.d()) {
            var2 = ((wg) this).field_K * ((wg) this).field_u.field_c / id.field_m;
            L1: while (true) {
              L2: {
                var3 = (long)param0 * (long)var2 + ((wg) this).field_B;
                if (((wg) this).field_A - var3 < 0L) {
                  var5 = (int)((-1L + (-((wg) this).field_B + ((wg) this).field_A + (long)var2)) / (long)var2);
                  ((wg) this).field_B = ((wg) this).field_B + (long)var2 * (long)var5;
                  param0 = param0 - var5;
                  ((wg) this).field_m.a(var5);
                  this.g(-731);
                  if (!((wg) this).field_u.d()) {
                    break L2;
                  } else {
                    continue L1;
                  }
                } else {
                  ((wg) this).field_B = var3;
                  break L2;
                }
              }
              ((wg) this).field_m.a(param0);
              break L0;
            }
          } else {
            ((wg) this).field_m.a(param0);
            break L0;
          }
        }
    }

    private final void f(int param0, int param1) {
        pl var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = CrazyCrystals.field_B;
        var4 = -22 % ((param1 - 56) / 34);
        var3 = (pl) (Object) ((wg) this).field_m.field_k.g(32073);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              L2: {
                if (param0 < 0) {
                  break L2;
                } else {
                  if (var3.field_i == param0) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              if (var3.field_l >= 0) {
                break L1;
              } else {
                ((wg) this).field_z[var3.field_i][var3.field_y] = null;
                var3.field_l = 0;
                break L1;
              }
            }
            var3 = (pl) (Object) ((wg) this).field_m.field_k.a(false);
            continue L0;
          }
        }
    }

    public wg() {
        ((wg) this).field_G = new int[16];
        ((wg) this).field_F = new int[16];
        ((wg) this).field_O = new int[16];
        ((wg) this).field_v = new int[16];
        ((wg) this).field_K = 1000000;
        ((wg) this).field_n = new int[16];
        ((wg) this).field_C = new int[16];
        ((wg) this).field_q = new int[16];
        ((wg) this).field_r = new int[16];
        ((wg) this).field_J = new int[16];
        ((wg) this).field_I = new int[16];
        ((wg) this).field_l = 256;
        ((wg) this).field_w = new pl[16][128];
        ((wg) this).field_E = new int[16];
        ((wg) this).field_p = new int[16];
        ((wg) this).field_M = new int[16];
        ((wg) this).field_z = new pl[16][128];
        ((wg) this).field_L = new int[16];
        ((wg) this).field_Q = new int[16];
        ((wg) this).field_j = new int[16];
        ((wg) this).field_u = new ic();
        ((wg) this).field_m = new ka((wg) this);
        ((wg) this).field_D = new fc(128);
        this.b(-1, 0, 256);
        this.a(true, 13396);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "This is a sticky ball.<br><br>Sticky balls stick to walls and other obstacles, and roll around the level. Do not stand in the way!<br><br>You can run up against a<br>sticky ball safely, as long<br>as it does not run into<br>you.<br><br>Sticky balls get disoriented if what they are stuck to moves. You can rescue a disoriented sticky ball by putting something in its path.";
    }
}
