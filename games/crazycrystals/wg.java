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
        this.field_Q[param1] = param2;
    }

    final boolean a(pl param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (null == param0.field_v) {
              if (0 <= param0.field_l) {
                L1: {
                  param0.a(false);
                  if (param0.field_C <= 0) {
                    break L1;
                  } else {
                    if (this.field_w[param0.field_i][param0.field_C] != param0) {
                      break L1;
                    } else {
                      this.field_w[param0.field_i][param0.field_C] = null;
                      break L1;
                    }
                  }
                }
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                return true;
              }
            } else {
              if (param1 >= 98) {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_10_0 = 1;
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("wg.CA(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    public static void e(int param0) {
        if (param0 < 12) {
            wg.f(72);
        }
        field_N = null;
    }

    private final int a(pl param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        cp var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              var3_int = param0.field_o + (param0.field_q * param0.field_D >> 425798764);
              var3_int = var3_int + (this.field_I[param0.field_i] * (-8192 + this.field_Q[param0.field_i]) >> 904913612);
              var4 = param0.field_E;
              if (var4.field_l <= 0) {
                break L1;
              } else {
                L2: {
                  if (var4.field_i > 0) {
                    break L2;
                  } else {
                    if (-1 <= (this.field_j[param0.field_i] ^ -1)) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  var5 = var4.field_i << 979671074;
                  var6 = var4.field_e << 955113537;
                  if (var6 > param0.field_z) {
                    var5 = param0.field_z * var5 / var6;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var5 = var5 + (this.field_j[param0.field_i] >> -683602457);
                var7 = Math.sin((double)(param0.field_p & 511) * 0.01227184630308513);
                var3_int = var3_int + (int)((double)var5 * var7);
                break L1;
              }
            }
            L4: {
              var5 = (int)(0.5 + (double)(256 * param0.field_t.field_j) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)id.field_m);
              if (!param1) {
                break L4;
              } else {
                this.field_w = (pl[][]) null;
                break L4;
              }
            }
            L5: {
              if (var5 >= 1) {
                stackOut_12_0 = var5;
                stackIn_13_0 = stackOut_12_0;
                break L5;
              } else {
                stackOut_11_0 = 1;
                stackIn_13_0 = stackOut_11_0;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("wg.IA(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
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
                      this.a(var4, 22519, this.field_M[var4] - -var5);
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
                      this.field_M[var4] = pf.b(-2080769, this.field_M[var4]) - -(var6 << 385521230);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (-33 != (var5 ^ -1)) {
                      break L2;
                    } else {
                      this.field_M[var4] = pf.b(-16257, this.field_M[var4]) - -(var6 << 1335331079);
                      break L2;
                    }
                  }
                  L3: {
                    if (var5 != 1) {
                      break L3;
                    } else {
                      this.field_j[var4] = (var6 << 815078823) + pf.b(-16257, this.field_j[var4]);
                      break L3;
                    }
                  }
                  L4: {
                    if (33 != var5) {
                      break L4;
                    } else {
                      this.field_j[var4] = pf.b(this.field_j[var4], -128) + var6;
                      break L4;
                    }
                  }
                  L5: {
                    if (-6 != (var5 ^ -1)) {
                      break L5;
                    } else {
                      this.field_F[var4] = (var6 << 2054646279) + pf.b(-16257, this.field_F[var4]);
                      break L5;
                    }
                  }
                  L6: {
                    if ((var5 ^ -1) == -38) {
                      this.field_F[var4] = var6 + pf.b(-128, this.field_F[var4]);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if ((var5 ^ -1) == -8) {
                      this.field_r[var4] = (var6 << 532441799) + pf.b(this.field_r[var4], -16257);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if ((var5 ^ -1) == -40) {
                      this.field_r[var4] = var6 + pf.b(this.field_r[var4], -128);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if ((var5 ^ -1) == -11) {
                      this.field_q[var4] = pf.b(-16257, this.field_q[var4]) - -(var6 << -5369337);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if ((var5 ^ -1) == -43) {
                      this.field_q[var4] = var6 + pf.b(this.field_q[var4], -128);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if ((var5 ^ -1) == -12) {
                      this.field_O[var4] = pf.b(this.field_O[var4], -16257) + (var6 << 526093799);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (-44 == (var5 ^ -1)) {
                      this.field_O[var4] = pf.b(-128, this.field_O[var4]) - -var6;
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
                        this.field_E[var4] = hm.a(this.field_E[var4], 1);
                        break L13;
                      } else {
                        this.field_E[var4] = pf.b(this.field_E[var4], -2);
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (65 == var5) {
                      if (-65 >= (var6 ^ -1)) {
                        this.field_E[var4] = hm.a(this.field_E[var4], 2);
                        break L14;
                      } else {
                        this.d(98, var4);
                        this.field_E[var4] = pf.b(this.field_E[var4], -3);
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
                      this.field_p[var4] = (var6 << -292700537) + pf.b(this.field_p[var4], 127);
                      break L15;
                    }
                  }
                  L16: {
                    if (-99 == (var5 ^ -1)) {
                      this.field_p[var4] = pf.b(this.field_p[var4], 16256) + var6;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (-102 != (var5 ^ -1)) {
                      break L17;
                    } else {
                      this.field_p[var4] = (var6 << 241843911) + (pf.b(127, this.field_p[var4]) + 16384);
                      break L17;
                    }
                  }
                  L18: {
                    if (-101 == (var5 ^ -1)) {
                      this.field_p[var4] = 16384 + pf.b(16256, this.field_p[var4]) + var6;
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
                      var7 = this.field_p[var4];
                      if ((var7 ^ -1) == -16385) {
                        this.field_I[var4] = (var6 << -2140902489) + pf.b(this.field_I[var4], -16257);
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L23: {
                    if (var5 == 38) {
                      var7 = this.field_p[var4];
                      if (-16385 == (var7 ^ -1)) {
                        this.field_I[var4] = var6 + pf.b(this.field_I[var4], -128);
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
                      this.field_v[var4] = pf.b(this.field_v[var4], -16257) - -(var6 << -271508793);
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (48 == var5) {
                      this.field_v[var4] = var6 + pf.b(-128, this.field_v[var4]);
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (-82 == (var5 ^ -1)) {
                      if (var6 < 64) {
                        this.c(110, var4);
                        this.field_E[var4] = pf.b(this.field_E[var4], -5);
                        break L26;
                      } else {
                        this.field_E[var4] = hm.a(this.field_E[var4], 4);
                        break L26;
                      }
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if ((var5 ^ -1) == -18) {
                      this.a((var6 << -1132210809) + (this.field_n[var4] & -16257), true, var4);
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  if (var5 != 49) {
                    break L0;
                  } else {
                    this.a((-128 & this.field_n[var4]) + var6, true, var4);
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
          var2 = this.field_H;
          var3 = this.field_o;
          var4 = this.field_A;
          if (null == this.field_x) {
            break L0;
          } else {
            if (this.field_t == var3) {
              this.a(this.field_s, 8192, this.field_x, this.field_k);
              this.g(-731);
              return;
            } else {
              break L0;
            }
          }
        }
        if (param0 == -731) {
          L1: while (true) {
            if (this.field_o != var3) {
              L2: {
                this.field_A = var4;
                this.field_o = var3;
                this.field_H = var2;
                if (this.field_x == null) {
                  break L2;
                } else {
                  if (this.field_t < var3) {
                    this.field_o = this.field_t;
                    this.field_H = -1;
                    this.field_A = this.field_u.b(this.field_o);
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
                  if (var3 != this.field_u.field_h[var2]) {
                    break L4;
                  } else {
                    this.field_u.c(var2);
                    var6 = this.field_u.f(var2);
                    if (var6 != 1) {
                      L5: {
                        if ((var6 & 128) == 0) {
                          break L5;
                        } else {
                          this.a((byte) 63, var6);
                          break L5;
                        }
                      }
                      this.field_u.d(var2);
                      this.field_u.e(var2);
                      continue L3;
                    } else {
                      this.field_u.c();
                      this.field_u.e(var2);
                      if (!this.field_u.f()) {
                        break L4;
                      } else {
                        if (this.field_x == null) {
                          L6: {
                            if (!this.field_k) {
                              break L6;
                            } else {
                              if (var3 != 0) {
                                this.field_u.a(var4);
                                break L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                          this.a(true, 13396);
                          this.field_u.e();
                          return;
                        } else {
                          this.a(115, this.field_x, this.field_k);
                          this.g(param0 + 0);
                          return;
                        }
                      }
                    }
                  }
                }
                var2 = this.field_u.b();
                var3 = this.field_u.field_h[var2];
                var4 = this.field_u.b(var3);
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    private final int b(pl param0, boolean param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        cp var9 = null;
        cp var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            if (this.field_J[param0.field_i] == 0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!param1) {
                  break L1;
                } else {
                  this.field_v = (int[]) null;
                  break L1;
                }
              }
              L2: {
                var9 = param0.field_E;
                var10 = var9;
                var4 = 4096 + this.field_O[param0.field_i] * this.field_r[param0.field_i] >> -736196755;
                var4 = var4 * var4 - -16384 >> 998512463;
                var4 = var4 * param0.field_m + 16384 >> 775207983;
                var4 = 128 + var4 * this.field_l >> -561302040;
                var4 = 128 + var4 * this.field_J[param0.field_i] >> 1364031464;
                if ((var10.field_g ^ -1) < -1) {
                  var4 = (int)((double)var4 * Math.pow(0.5, (double)param0.field_w * 0.00001953125 * (double)var10.field_g) + 0.5);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (null != var10.field_a) {
                  L4: {
                    var5 = param0.field_x;
                    var6 = var10.field_a[param0.field_r + 1];
                    if (param0.field_r >= var10.field_a.length - 2) {
                      break L4;
                    } else {
                      var7 = (var9.field_a[param0.field_r] & 255) << 70108872;
                      var8 = var10.field_a[2 + param0.field_r] << -1991537112 & 65280;
                      var6 = var6 + (var5 + -var7) * (-var6 + var10.field_a[3 + param0.field_r]) / (var8 + -var7);
                      break L4;
                    }
                  }
                  var4 = 32 + var4 * var6 >> -1610705978;
                  break L3;
                } else {
                  break L3;
                }
              }
              L5: {
                if (-1 <= (param0.field_l ^ -1)) {
                  break L5;
                } else {
                  if (var10.field_b != null) {
                    L6: {
                      var5 = param0.field_l;
                      var6 = var10.field_b[param0.field_f + 1];
                      if (param0.field_f < var10.field_b.length + -2) {
                        var7 = 65280 & var9.field_b[param0.field_f] << -1436500920;
                        var8 = 65280 & var10.field_b[param0.field_f + 2] << 159297928;
                        var6 = var6 + (-var6 + var10.field_b[3 + param0.field_f]) * (-var7 + var5) / (var8 - var7);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var4 = var4 * var6 + 32 >> -2120573242;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              stackOut_21_0 = var4;
              stackIn_22_0 = stackOut_21_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var3);
            stackOut_23_1 = new StringBuilder().append("wg.M(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_22_0;
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        this.field_n[param2] = param0;
        if (!param1) {
            this.field_z = (pl[][]) null;
        }
        this.field_G[param2] = (int)(0.5 + Math.pow(2.0, 0.00054931640625 * (double)param0) * 2097152.0);
    }

    private final void c(int param0, int param1) {
        pl var3 = null;
        int var4 = CrazyCrystals.field_B;
        if (!(0 == (4 & this.field_E[param1]))) {
            var3 = (pl) ((Object) this.field_m.field_k.g(32073));
            while (var3 != null) {
                if (!(var3.field_i != param1)) {
                    var3.field_j = 0;
                }
                var3 = (pl) ((Object) this.field_m.field_k.a(false));
            }
        }
        if (param0 < 21) {
            this.field_H = 20;
        }
    }

    final synchronized od a() {
        return null;
    }

    private final synchronized void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = CrazyCrystals.field_B;
        if (param0 >= param1) {
            this.field_J[param0] = param2;
        } else {
            for (var4 = 0; -17 < (var4 ^ -1); var4++) {
                this.field_J[var4] = param2;
            }
        }
    }

    private final void a(byte param0, int param1, int param2) {
        if (param0 < 31) {
            this.a(32, false, -33, 108);
        }
        this.field_C[param2] = param1;
        this.field_M[param2] = pf.b(param1, -128);
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
            this.field_L[var3] = this.field_C[var3];
        }
        int var5 = 0;
        var3 = var5;
        while ((var5 ^ -1) > -17) {
            this.field_M[var5] = pf.b(-128, this.field_C[var5]);
            var5++;
        }
    }

    private final void c(int param0, int param1, int param2) {
        if (param1 != 2) {
            this.field_E = (int[]) null;
        }
    }

    final synchronized void a(int param0, rm param1, boolean param2) {
        try {
            this.a(true, 8192, param1, param2);
            int var4_int = -66 / ((param0 - 12) / 63);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "wg.KA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(byte param0, pl param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            var4_int = param1.field_t.field_k.length;
            if (param0 == 2) {
              L1: {
                L2: {
                  if (!param2) {
                    break L2;
                  } else {
                    if (!param1.field_t.field_i) {
                      break L2;
                    } else {
                      var6 = var4_int + (var4_int + -param1.field_t.field_g);
                      var4_int = var4_int << 8;
                      var5 = (int)((long)this.field_v[param1.field_i] * (long)var6 >> 482854790);
                      if (var4_int > var5) {
                        break L1;
                      } else {
                        var5 = -var5 + -1 + (var4_int + var4_int);
                        param1.field_v.b(true);
                        break L1;
                      }
                    }
                  }
                }
                var5 = (int)((long)this.field_v[param1.field_i] * (long)var4_int >> 1672779590);
                break L1;
              }
              param1.field_v.g(var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("wg.DA(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final synchronized int c() {
        return 0;
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              L2: {
                if (!this.field_u.d()) {
                  break L2;
                } else {
                  var4_int = this.field_K * this.field_u.field_c / id.field_m;
                  L3: while (true) {
                    var5 = (long)var4_int * (long)param2 + this.field_B;
                    if ((-var5 + this.field_A ^ -1L) <= -1L) {
                      this.field_B = var5;
                      break L2;
                    } else {
                      var7 = (int)((-1L + (long)var4_int + (-this.field_B + this.field_A)) / (long)var4_int);
                      this.field_B = this.field_B + (long)var4_int * (long)var7;
                      this.field_m.a(param0, param1, var7);
                      param2 = param2 - var7;
                      param1 = param1 + var7;
                      this.g(-731);
                      if (this.field_u.d()) {
                        continue L3;
                      } else {
                        this.field_m.a(param0, param1, param2);
                        break L1;
                      }
                    }
                  }
                }
              }
              this.field_m.a(param0, param1, param2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var4);
            stackOut_10_1 = new StringBuilder().append("wg.N(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final synchronized void b(boolean param0, int param1) {
        this.field_u.e();
        this.field_x = null;
        this.a(param0, 13396);
        if (param1 >= -82) {
            this.field_q = (int[]) null;
        }
    }

    final synchronized od d() {
        return (od) ((Object) this.field_m);
    }

    private final synchronized void a(boolean param0, int param1, rm param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = CrazyCrystals.field_B;
        try {
            this.b(param0, param1 + -8306);
            this.field_u.a(param2.field_g);
            this.field_B = 0L;
            this.field_k = param3 ? true : false;
            var5_int = this.field_u.a();
            if (param1 != 8192) {
                this.field_m = (ka) null;
            }
            for (var6 = 0; var5_int > var6; var6++) {
                this.field_u.c(var6);
                this.field_u.d(var6);
                this.field_u.e(var6);
            }
            this.field_H = this.field_u.b();
            this.field_o = this.field_u.field_h[this.field_H];
            this.field_A = this.field_u.b(this.field_o);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "wg.BA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = CrazyCrystals.field_B;
        if (param1 != 22519) {
            return;
        }
        if (this.field_L[param0] != param2) {
            this.field_L[param0] = param2;
            for (var4 = 0; 128 > var4; var4++) {
                this.field_w[param0][var4] = null;
            }
        }
    }

    private final void a(int param0, int param1) {
        pl var3 = null;
        int var4 = 0;
        L0: {
          var4 = CrazyCrystals.field_B;
          var3 = (pl) ((Object) this.field_m.field_k.g(32073));
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
                      this.field_m.field_l.b(var3.field_v);
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
                  this.field_z[var3.field_i][var3.field_y] = null;
                  break L6;
                }
              }
              var3.a(false);
              break L2;
            }
            var3 = (pl) ((Object) this.field_m.field_k.a(false));
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
          if ((2 & this.field_E[param3]) != 0) {
            var5 = (pl) ((Object) this.field_m.field_k.a((byte) -119));
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
                      this.field_z[param3][var5.field_y] = null;
                      this.field_z[param3][param2] = var5;
                      var6_int = var5.field_o - -(var5.field_q * var5.field_D >> -34756948);
                      var5.field_o = var5.field_o + (-var5.field_y + param2 << -409374552);
                      var5.field_q = 4096;
                      var5.field_D = -var5.field_o + var6_int;
                      var5.field_y = param2;
                      return;
                    }
                  }
                }
                var5 = (pl) ((Object) this.field_m.field_k.e(0));
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var10 = (dk) ((Object) this.field_D.a((long)this.field_L[param3], param1 ^ 0));
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
              if (this.field_v[param3] == param1) {
                var7.field_v = kg.b(var6, this.a(var7, false), this.b(var7, false), this.a(var7, param1 + 255));
                break L3;
              } else {
                L4: {
                  var7.field_v = kg.b(var6, this.a(var7, false), 0, this.a(var7, param1 + 255));
                  stackOut_15_0 = this;
                  stackOut_15_1 = 2;
                  stackOut_15_2 = (pl) (var7);
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  if (-1 >= (var10.field_n[param2] ^ -1)) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = (pl) ((Object) stackIn_17_2);
                    stackOut_17_3 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    stackIn_18_3 = stackOut_17_3;
                    break L4;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = (pl) ((Object) stackIn_16_2);
                    stackOut_16_3 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    stackIn_18_3 = stackOut_16_3;
                    break L4;
                  }
                }
                this.a((byte) stackIn_18_1, stackIn_18_2, stackIn_18_3 != 0);
                break L3;
              }
            }
            L5: {
              if (-1 < (var10.field_n[param2] ^ -1)) {
                var7.field_v.f(-1);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (-1 < (var7.field_C ^ -1)) {
                break L6;
              } else {
                L7: {
                  var8 = this.field_w[param3][var7.field_C];
                  if (var8 == null) {
                    break L7;
                  } else {
                    if (-1 >= (var8.field_l ^ -1)) {
                      break L7;
                    } else {
                      this.field_z[param3][var8.field_y] = null;
                      var8.field_l = 0;
                      break L7;
                    }
                  }
                }
                this.field_w[param3][var7.field_C] = var7;
                break L6;
              }
            }
            this.field_m.field_k.b(param1 + 0, var7);
            this.field_z[param3][param2] = var7;
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
        this.field_l = param1;
        if (param0 != -20562) {
            this.field_n = (int[]) null;
        }
    }

    final synchronized boolean a(db param0, bn param1, rm param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        dm var8 = null;
        int var9 = 0;
        dk var10 = null;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var11 = CrazyCrystals.field_B;
        try {
          L0: {
            param2.b();
            if (param3 == -128) {
              L1: {
                var6_int = 1;
                var7 = null;
                if (-1 <= (param4 ^ -1)) {
                  break L1;
                } else {
                  var7 = new int[]{param4};
                  break L1;
                }
              }
              var8 = (dm) ((Object) param2.field_f.a((byte) -93));
              L2: while (true) {
                if (var8 == null) {
                  L3: {
                    if (var6_int != 0) {
                      param2.a();
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  stackOut_20_0 = var6_int;
                  stackIn_21_0 = stackOut_20_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L4: {
                    var9 = (int)var8.field_e;
                    var10 = (dk) ((Object) this.field_D.a((long)var9, 0));
                    if (var10 != null) {
                      break L4;
                    } else {
                      var10 = md.a(var9, 103, param0);
                      if (var10 != null) {
                        this.field_D.a(-22072, (long)var9, var10);
                        break L4;
                      } else {
                        var6_int = 0;
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (var10 == null) {
                      break L5;
                    } else {
                      if (!var10.a(true, param1, (int[]) (var7), var8.field_g)) {
                        var6_int = 0;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var8 = (dm) ((Object) param2.field_f.a(88));
                  continue L2;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var6);
            stackOut_22_1 = new StringBuilder().append("wg.U(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          L7: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L7;
            }
          }
          L8: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L8;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_21_0 != 0;
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        pl var6 = null;
        int var7 = CrazyCrystals.field_B;
        if (param1) {
            return;
        }
        pl var8 = this.field_z[param0][param3];
        if (!(var8 != null)) {
            return;
        }
        this.field_z[param0][param3] = null;
        if (-1 == (this.field_E[param0] & 2 ^ -1)) {
            var8.field_l = 0;
        } else {
            var6 = (pl) ((Object) this.field_m.field_k.g(32073));
            while (var6 != null) {
                if (var8.field_i == var6.field_i) {
                    if ((var6.field_l ^ -1) > -1) {
                        if (!(var8 == var6)) {
                            var8.field_l = 0;
                            break;
                        }
                    }
                }
                var6 = (pl) ((Object) this.field_m.field_k.a(false));
            }
        }
    }

    private final void d(int param0, int param1) {
        pl var3_ref_pl = null;
        int var4 = CrazyCrystals.field_B;
        if (!(0 == (2 & this.field_E[param1]))) {
            var3_ref_pl = (pl) ((Object) this.field_m.field_k.g(32073));
            while (var3_ref_pl != null) {
                if (var3_ref_pl.field_i == param1) {
                    if (this.field_z[param1][var3_ref_pl.field_y] == null) {
                        if (!(0 <= var3_ref_pl.field_l)) {
                            var3_ref_pl.field_l = 0;
                        }
                    }
                }
                var3_ref_pl = (pl) ((Object) this.field_m.field_k.a(false));
            }
        }
        int var3 = 109 % ((23 - param0) / 57);
    }

    final boolean a(int param0, int param1, int[] param2, pl param3, byte param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        cp var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_9_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_64_0 = 0;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var12 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              param3.field_k = id.field_m / 100;
              if (-1 < (param3.field_l ^ -1)) {
                break L1;
              } else {
                L2: {
                  if (param3.field_v == null) {
                    break L2;
                  } else {
                    if (param3.field_v.h()) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  param3.d(12426);
                  param3.a(false);
                  if (-1 <= (param3.field_C ^ -1)) {
                    break L3;
                  } else {
                    if (this.field_w[param3.field_i][param3.field_C] != param3) {
                      break L3;
                    } else {
                      this.field_w[param3.field_i][param3.field_C] = null;
                      return true;
                    }
                  }
                }
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L4: {
              var6_int = param3.field_q;
              var7 = -17 % ((-43 - param4) / 48);
              if (-1 > (var6_int ^ -1)) {
                L5: {
                  var6_int = var6_int - (int)(0.5 + 16.0 * Math.pow(2.0, (double)this.field_F[param3.field_i] * 0.0004921259842519685));
                  if ((var6_int ^ -1) > -1) {
                    var6_int = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                param3.field_q = var6_int;
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              param3.field_v.h(this.a(param3, false));
              var8 = param3.field_E;
              var9 = 0;
              param3.field_z = param3.field_z + 1;
              param3.field_p = param3.field_p + var8.field_l;
              var10 = 0.000005086263020833333 * (double)((param3.field_D * param3.field_q >> -429610612) + (-60 + param3.field_y << -1129160120));
              if (0 < var8.field_g) {
                L7: {
                  if (var8.field_j > 0) {
                    param3.field_w = param3.field_w + (int)(0.5 + Math.pow(2.0, (double)var8.field_j * var10) * 128.0);
                    break L7;
                  } else {
                    param3.field_w = param3.field_w + 128;
                    break L7;
                  }
                }
                if (-819201 >= (var8.field_g * param3.field_w ^ -1)) {
                  var9 = 1;
                  break L6;
                } else {
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L8: {
              if (var8.field_a != null) {
                L9: {
                  if (-1 > (var8.field_f ^ -1)) {
                    param3.field_x = param3.field_x + (int)(0.5 + Math.pow(2.0, var10 * (double)var8.field_f) * 128.0);
                    break L9;
                  } else {
                    param3.field_x = param3.field_x + 128;
                    break L9;
                  }
                }
                L10: while (true) {
                  L11: {
                    if (-2 + var8.field_a.length <= param3.field_r) {
                      break L11;
                    } else {
                      if ((65280 & var8.field_a[param3.field_r - -2] << 2031765992) >= param3.field_x) {
                        break L11;
                      } else {
                        param3.field_r = param3.field_r + 2;
                        continue L10;
                      }
                    }
                  }
                  if (var8.field_a.length + -2 != param3.field_r) {
                    break L8;
                  } else {
                    if (0 == var8.field_a[1 + param3.field_r]) {
                      var9 = 1;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
              } else {
                break L8;
              }
            }
            L12: {
              if (-1 < (param3.field_l ^ -1)) {
                break L12;
              } else {
                if (var8.field_b == null) {
                  break L12;
                } else {
                  if ((1 & this.field_E[param3.field_i]) == 0) {
                    L13: {
                      if (0 > param3.field_C) {
                        break L13;
                      } else {
                        if (this.field_w[param3.field_i][param3.field_C] == param3) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    L14: {
                      if (0 < var8.field_c) {
                        param3.field_l = param3.field_l + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var8.field_c * var10));
                        break L14;
                      } else {
                        param3.field_l = param3.field_l + 128;
                        break L14;
                      }
                    }
                    L15: while (true) {
                      L16: {
                        if (param3.field_f >= -2 + var8.field_b.length) {
                          break L16;
                        } else {
                          if ((255 & var8.field_b[2 + param3.field_f]) << -1550967256 >= param3.field_l) {
                            break L16;
                          } else {
                            param3.field_f = param3.field_f + 2;
                            continue L15;
                          }
                        }
                      }
                      if (param3.field_f == -2 + var8.field_b.length) {
                        var9 = 1;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  } else {
                    break L12;
                  }
                }
              }
            }
            if (var9 == 0) {
              param3.field_v.a(param3.field_k, this.b(param3, false), this.a(param3, 255));
              stackOut_66_0 = 0;
              stackIn_67_0 = stackOut_66_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              L17: {
                param3.field_v.d(param3.field_k);
                if (param2 != null) {
                  param3.field_v.a(param2, param1, param0);
                  break L17;
                } else {
                  param3.field_v.a(param0);
                  break L17;
                }
              }
              L18: {
                if (param3.field_v.e()) {
                  this.field_m.field_l.b(param3.field_v);
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                param3.d(12426);
                if (-1 < (param3.field_l ^ -1)) {
                  break L19;
                } else {
                  param3.a(false);
                  if (param3.field_C <= 0) {
                    break L19;
                  } else {
                    if (param3 == this.field_w[param3.field_i][param3.field_C]) {
                      this.field_w[param3.field_i][param3.field_C] = null;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                }
              }
              stackOut_64_0 = 1;
              stackIn_65_0 = stackOut_64_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var6 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) (var6);
            stackOut_68_1 = new StringBuilder().append("wg.LA(").append(param0).append(',').append(param1).append(',');
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param2 == null) {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L20;
            } else {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L20;
            }
          }
          L21: {
            stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param3 == null) {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L21;
            } else {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L21;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_65_0 != 0;
          } else {
            return stackIn_67_0 != 0;
          }
        }
    }

    private final int a(pl param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param1 == 255) {
              var3_int = this.field_q[param0.field_i];
              if (8192 > var3_int) {
                stackOut_6_0 = 32 + var3_int * param0.field_u >> 1873748326;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = 16384 - ((128 + -param0.field_u) * (16384 - var3_int) - -32 >> 1240983366);
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 95;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("wg.T(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
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
          this.field_r[param0] = 12800;
          this.field_q[param0] = 8192;
          this.field_O[param0] = 16383;
          this.field_Q[param0] = 8192;
          this.field_j[param0] = 0;
          this.field_F[param0] = 8192;
          this.d(param1 + -343, param0);
          this.c(param1 + -230, param0);
          this.field_E[param0] = 0;
          this.field_p[param0] = 32767;
          this.field_I[param0] = param1;
          this.field_v[param0] = 0;
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
          if (this.field_u.d()) {
            var2 = this.field_K * this.field_u.field_c / id.field_m;
            L1: while (true) {
              L2: {
                var3 = (long)param0 * (long)var2 + this.field_B;
                if (this.field_A - var3 < 0L) {
                  var5 = (int)((-1L + (-this.field_B + this.field_A + (long)var2)) / (long)var2);
                  this.field_B = this.field_B + (long)var2 * (long)var5;
                  param0 = param0 - var5;
                  this.field_m.a(var5);
                  this.g(-731);
                  if (!this.field_u.d()) {
                    break L2;
                  } else {
                    continue L1;
                  }
                } else {
                  this.field_B = var3;
                  break L2;
                }
              }
              this.field_m.a(param0);
              break L0;
            }
          } else {
            this.field_m.a(param0);
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
        var3 = (pl) ((Object) this.field_m.field_k.g(32073));
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
                this.field_z[var3.field_i][var3.field_y] = null;
                var3.field_l = 0;
                break L1;
              }
            }
            var3 = (pl) ((Object) this.field_m.field_k.a(false));
            continue L0;
          }
        }
    }

    public wg() {
        this.field_G = new int[16];
        this.field_F = new int[16];
        this.field_O = new int[16];
        this.field_v = new int[16];
        this.field_K = 1000000;
        this.field_n = new int[16];
        this.field_C = new int[16];
        this.field_q = new int[16];
        this.field_r = new int[16];
        this.field_J = new int[16];
        this.field_I = new int[16];
        this.field_l = 256;
        this.field_w = new pl[16][128];
        this.field_E = new int[16];
        this.field_p = new int[16];
        this.field_M = new int[16];
        this.field_z = new pl[16][128];
        this.field_L = new int[16];
        this.field_Q = new int[16];
        this.field_j = new int[16];
        this.field_u = new ic();
        this.field_m = new ka((wg) (this));
        this.field_D = new fc(128);
        this.b(-1, 0, 256);
        this.a(true, 13396);
    }

    static {
        field_N = "This is a sticky ball.<br><br>Sticky balls stick to walls and other obstacles, and roll around the level. Do not stand in the way!<br><br>You can run up against a<br>sticky ball safely, as long<br>as it does not run into<br>you.<br><br>Sticky balls get disoriented if what they are stuck to moves. You can rescue a disoriented sticky ball by putting something in its path.";
    }
}
