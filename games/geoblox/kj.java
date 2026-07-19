/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj extends ia {
    private pc[][] field_D;
    private int[] field_p;
    private jb field_C;
    private int[] field_z;
    int[] field_u;
    static boolean[] field_o;
    static dm field_E;
    private int field_T;
    private int[] field_r;
    private fi field_q;
    private pc[][] field_j;
    private int[] field_v;
    int[] field_n;
    private int[] field_S;
    int[] field_m;
    private int[] field_L;
    private int[] field_M;
    static int field_J;
    private int[] field_K;
    private int field_R;
    private int[] field_y;
    private int[] field_s;
    static int[] field_O;
    private int[] field_Q;
    static int[] field_G;
    private int[] field_F;
    private int[] field_w;
    private int field_k;
    private ad field_I;
    private boolean field_B;
    private int field_t;
    private long field_x;
    private long field_A;
    private boolean field_P;
    private rf field_l;
    private int field_U;

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        long var5 = 0L;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (!this.field_C.f()) {
                break L1;
              } else {
                var4_int = this.field_C.field_d * this.field_T / qk.field_j;
                L2: while (true) {
                  var5 = (long)param2 * (long)var4_int + this.field_x;
                  if (-1L < (this.field_A + -var5 ^ -1L)) {
                    var7 = (int)((-1L + this.field_A - (this.field_x - (long)var4_int)) / (long)var4_int);
                    this.field_x = this.field_x + (long)var7 * (long)var4_int;
                    this.field_I.a(param0, param1, var7);
                    param2 = param2 - var7;
                    param1 = param1 + var7;
                    this.a((byte) 65);
                    if (!this.field_C.f()) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  } else {
                    this.field_x = var5;
                    break L1;
                  }
                }
              }
            }
            this.field_I.a(param0, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("kj.C(");
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
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized int d() {
        return 0;
    }

    private final void d(int param0, int param1, int param2) {
        if (param1 != -2832) {
            this.d(44);
        }
    }

    private final int a(byte param0, pc param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        t var10 = null;
        t var11 = null;
        int stackIn_3_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            if (-1 == (this.field_L[param1.field_t] ^ -1)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var10 = param1.field_x;
                var11 = var10;
                var4 = this.field_p[param1.field_t] * this.field_r[param1.field_t] - -4096 >> -695306195;
                var4 = var4 * var4 + 16384 >> -130426065;
                var5 = -83 % ((param0 - 44) / 55);
                var4 = 16384 + var4 * param1.field_w >> 441298735;
                var4 = 128 + var4 * this.field_R >> -1986953208;
                var4 = var4 * this.field_L[param1.field_t] - -128 >> -614748792;
                if ((var11.field_c ^ -1) >= -1) {
                  break L1;
                } else {
                  var4 = (int)(0.5 + Math.pow(0.5, 0.00001953125 * (double)param1.field_l * (double)var11.field_c) * (double)var4);
                  break L1;
                }
              }
              L2: {
                if (null != var11.field_f) {
                  L3: {
                    var6 = param1.field_o;
                    var7 = var11.field_f[1 + param1.field_k];
                    if (param1.field_k < var11.field_f.length + -2) {
                      var8 = (var10.field_f[param1.field_k] & 255) << 177519176;
                      var9 = (255 & var11.field_f[param1.field_k + 2]) << -2130725304;
                      var7 = var7 + (var11.field_f[param1.field_k + 3] + -var7) * (-var8 + var6) / (var9 - var8);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var4 = var4 * var7 + 32 >> -1943382906;
                  break L2;
                } else {
                  break L2;
                }
              }
              L4: {
                if (param1.field_y <= 0) {
                  break L4;
                } else {
                  if (var11.field_e == null) {
                    break L4;
                  } else {
                    L5: {
                      var6 = param1.field_y;
                      var7 = var11.field_e[1 + param1.field_q];
                      if (-2 + var11.field_e.length > param1.field_q) {
                        var8 = var10.field_e[param1.field_q] << 1159547464 & 65280;
                        var9 = var11.field_e[param1.field_q - -2] << -1788850680 & 65280;
                        var7 = var7 + (var11.field_e[param1.field_q - -3] - var7) * (-var8 + var6) / (-var8 + var9);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var4 = var7 * var4 - -32 >> 303901990;
                    break L4;
                  }
                }
              }
              stackOut_18_0 = var4;
              stackIn_19_0 = stackOut_18_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var3);
            stackOut_20_1 = new StringBuilder().append("kj.KA(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_19_0;
        }
    }

    private final int a(int param0, pc param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        t var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              var3_int = (param1.field_n * param1.field_s >> -477379188) + param1.field_E;
              var3_int = var3_int + ((-8192 + this.field_y[param1.field_t]) * this.field_v[param1.field_t] >> -29494548);
              var4 = param1.field_x;
              if (0 >= var4.field_d) {
                break L1;
              } else {
                L2: {
                  if ((var4.field_b ^ -1) < -1) {
                    break L2;
                  } else {
                    if (this.field_s[param1.field_t] <= 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  var5 = var4.field_b << -992851838;
                  var6 = var4.field_j << 1077980513;
                  if (var6 > param1.field_j) {
                    var5 = var5 * param1.field_j / var6;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var5 = var5 + (this.field_s[param1.field_t] >> 853866887);
                var7 = Math.sin(0.01227184630308513 * (double)(param1.field_m & 511));
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L1;
              }
            }
            if (param0 > 10) {
              L4: {
                var5 = (int)((double)(256 * param1.field_i.field_h) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)qk.field_j + 0.5);
                if (var5 < 1) {
                  stackOut_13_0 = 1;
                  stackIn_14_0 = stackOut_13_0;
                  break L4;
                } else {
                  stackOut_12_0 = var5;
                  stackIn_14_0 = stackOut_12_0;
                  break L4;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_9_0 = -116;
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3);
            stackOut_15_1 = new StringBuilder().append("kj.N(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_14_0;
        }
    }

    final static void c(boolean param0) {
        md.field_e = null;
        if (!param0) {
            return;
        }
        hl.field_K = null;
        mj.field_a = (byte[][]) null;
        rc.field_j = null;
        gh.field_m = null;
        cm.field_j = null;
    }

    private final void a(byte param0, int param1) {
        pc var3 = null;
        if (param0 != 39) {
            this.b((byte) -85, -70);
        }
        if (!((this.field_m[param1] & 2) == 0)) {
            var3 = (pc) ((Object) this.field_I.field_l.g(0));
            while (var3 != null) {
                if (param1 == var3.field_t) {
                    if (null == this.field_j[param1][var3.field_D]) {
                        if (var3.field_y < 0) {
                            var3.field_y = 0;
                        }
                    }
                }
                var3 = (pc) ((Object) this.field_I.field_l.d(1));
            }
        }
    }

    final boolean a(int param0, int param1, int[] param2, pc param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        t var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int stackIn_8_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_60_0 = 0;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        try {
          L0: {
            L1: {
              param3.field_g = qk.field_j / 100;
              if ((param3.field_y ^ -1) > -1) {
                break L1;
              } else {
                L2: {
                  if (null == param3.field_u) {
                    break L2;
                  } else {
                    if (param3.field_u.l()) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  param3.b(-1);
                  param3.a(param4);
                  if (0 >= param3.field_r) {
                    break L3;
                  } else {
                    if (param3 != this.field_D[param3.field_t][param3.field_r]) {
                      break L3;
                    } else {
                      this.field_D[param3.field_t][param3.field_r] = null;
                      return true;
                    }
                  }
                }
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L4: {
              var6_int = param3.field_s;
              if (0 < var6_int) {
                L5: {
                  var6_int = var6_int - (int)(0.5 + 16.0 * Math.pow(2.0, (double)this.field_M[param3.field_t] * 0.0004921259842519685));
                  if (0 > var6_int) {
                    var6_int = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                param3.field_s = var6_int;
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              param3.field_u.d(this.a(112, param3));
              var7 = param3.field_x;
              param3.field_m = param3.field_m + var7.field_d;
              param3.field_j = param3.field_j + 1;
              var8 = param4 ? 1 : 0;
              var9 = 0.000005086263020833333 * (double)((-60 + param3.field_D << 1562719368) - -(param3.field_n * param3.field_s >> 2038513900));
              if ((var7.field_c ^ -1) < -1) {
                L7: {
                  if (-1 > (var7.field_h ^ -1)) {
                    param3.field_l = param3.field_l + (int)(128.0 * Math.pow(2.0, (double)var7.field_h * var9) + 0.5);
                    break L7;
                  } else {
                    param3.field_l = param3.field_l + 128;
                    break L7;
                  }
                }
                if (-819201 < (var7.field_c * param3.field_l ^ -1)) {
                  break L6;
                } else {
                  var8 = 1;
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L8: {
              if (var7.field_f == null) {
                break L8;
              } else {
                L9: {
                  if ((var7.field_g ^ -1) < -1) {
                    param3.field_o = param3.field_o + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_g));
                    break L9;
                  } else {
                    param3.field_o = param3.field_o + 128;
                    break L9;
                  }
                }
                L10: while (true) {
                  L11: {
                    if (param3.field_k >= -2 + var7.field_f.length) {
                      break L11;
                    } else {
                      if ((65280 & var7.field_f[param3.field_k - -2] << -446732824) >= param3.field_o) {
                        break L11;
                      } else {
                        param3.field_k = param3.field_k + 2;
                        continue L10;
                      }
                    }
                  }
                  if (param3.field_k != -2 + var7.field_f.length) {
                    break L8;
                  } else {
                    if (var7.field_f[param3.field_k + 1] != 0) {
                      break L8;
                    } else {
                      var8 = 1;
                      break L8;
                    }
                  }
                }
              }
            }
            L12: {
              if ((param3.field_y ^ -1) > -1) {
                break L12;
              } else {
                if (var7.field_e == null) {
                  break L12;
                } else {
                  if (-1 == (this.field_m[param3.field_t] & 1 ^ -1)) {
                    L13: {
                      if (0 > param3.field_r) {
                        break L13;
                      } else {
                        if (param3 == this.field_D[param3.field_t][param3.field_r]) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    L14: {
                      if (0 < var7.field_a) {
                        param3.field_y = param3.field_y + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_a) * 128.0);
                        break L14;
                      } else {
                        param3.field_y = param3.field_y + 128;
                        break L14;
                      }
                    }
                    L15: while (true) {
                      L16: {
                        if (-2 + var7.field_e.length <= param3.field_q) {
                          break L16;
                        } else {
                          if (param3.field_y <= (var7.field_e[param3.field_q - -2] & 255) << -356282872) {
                            break L16;
                          } else {
                            param3.field_q = param3.field_q + 2;
                            continue L15;
                          }
                        }
                      }
                      if (-2 + var7.field_e.length != param3.field_q) {
                        break L12;
                      } else {
                        var8 = 1;
                        break L12;
                      }
                    }
                  } else {
                    break L12;
                  }
                }
              }
            }
            if (var8 == 0) {
              param3.field_u.a(param3.field_g, this.a((byte) -79, param3), this.a(param3, 761736646));
              stackOut_62_0 = 0;
              stackIn_63_0 = stackOut_62_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              L17: {
                param3.field_u.c(param3.field_g);
                if (param2 == null) {
                  param3.field_u.b(param0);
                  break L17;
                } else {
                  param3.field_u.a(param2, param1, param0);
                  break L17;
                }
              }
              L18: {
                if (param3.field_u.g()) {
                  this.field_I.field_m.a(param3.field_u);
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                param3.b(-1);
                if (0 <= param3.field_y) {
                  param3.a(false);
                  if (0 >= param3.field_r) {
                    break L19;
                  } else {
                    if (this.field_D[param3.field_t][param3.field_r] == param3) {
                      this.field_D[param3.field_t][param3.field_r] = null;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                } else {
                  break L19;
                }
              }
              stackOut_60_0 = 1;
              stackIn_61_0 = stackOut_60_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var6 = decompiledCaughtException;
            stackOut_64_0 = (RuntimeException) (var6);
            stackOut_64_1 = new StringBuilder().append("kj.K(").append(param0).append(',').append(param1).append(',');
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param2 == null) {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L20;
            } else {
              stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackOut_65_2 = "{...}";
              stackIn_67_0 = stackOut_65_0;
              stackIn_67_1 = stackOut_65_1;
              stackIn_67_2 = stackOut_65_2;
              break L20;
            }
          }
          L21: {
            stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
            stackOut_67_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',');
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param3 == null) {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L21;
            } else {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L21;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_70_0), stackIn_70_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_61_0 != 0;
          } else {
            return stackIn_63_0 != 0;
          }
        }
    }

    private final void a(int param0, byte param1) {
        pc var3 = null;
        if (!((this.field_m[param0] & 4) == 0)) {
            var3 = (pc) ((Object) this.field_I.field_l.g(0));
            while (var3 != null) {
                if (!(var3.field_t != param0)) {
                    var3.field_B = 0;
                }
                var3 = (pc) ((Object) this.field_I.field_l.d(1));
            }
        }
        if (param1 != 67) {
            this.field_l = (rf) null;
        }
    }

    final synchronized boolean a(ci param0, int param1, int param2, rf param3, rh param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        pj var8 = null;
        int var9 = 0;
        vl var10 = null;
        int var11 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var11 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              param3.b();
              var6_int = 1;
              var7 = null;
              if ((param1 ^ -1) >= param2) {
                break L1;
              } else {
                var7 = new int[]{param1};
                break L1;
              }
            }
            var8 = (pj) ((Object) param3.field_g.a((byte) 125));
            L2: while (true) {
              if (var8 == null) {
                L3: {
                  if (var6_int != 0) {
                    param3.a();
                    break L3;
                  } else {
                    break L3;
                  }
                }
                stackOut_16_0 = var6_int;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                L4: {
                  var9 = (int)var8.field_a;
                  var10 = (vl) ((Object) this.field_q.a((long)var9, (byte) -91));
                  if (var10 != null) {
                    break L4;
                  } else {
                    var10 = vl.a(var9, (byte) 121, param4);
                    if (var10 != null) {
                      this.field_q.a((byte) 102, var10, (long)var9);
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
                    if (var10.a((int[]) (var7), var8.field_h, param2 + 36, param0)) {
                      break L5;
                    } else {
                      var6_int = 0;
                      break L5;
                    }
                  }
                }
                var8 = (pj) ((Object) param3.field_g.b(param2 + -100));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var6);
            stackOut_18_1 = new StringBuilder().append("kj.T(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          L8: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param4 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        return stackIn_17_0 != 0;
    }

    private final void b(byte param0, int param1) {
        if (!((param1 ^ -1) <= -1)) {
            for (param1 = 0; -17 < (param1 ^ -1); param1++) {
                this.b((byte) -22, param1);
            }
            return;
        }
        this.field_p[param1] = 12800;
        this.field_z[param1] = 8192;
        this.field_r[param1] = 16383;
        this.field_y[param1] = 8192;
        this.field_s[param1] = 0;
        this.field_M[param1] = 8192;
        this.a((byte) 39, param1);
        this.a(param1, (byte) 67);
        this.field_m[param1] = 0;
        if (param0 >= -12) {
            this.field_k = 55;
        }
        this.field_w[param1] = 32767;
        this.field_v[param1] = 256;
        this.field_u[param1] = 0;
        this.f(-112, 8192, param1);
    }

    private final void a(int param0, int param1, int param2) {
        this.field_F[param1] = param2;
        this.field_K[param1] = cd.a(param2, -128);
        if (param0 != -8581) {
            this.field_z = (int[]) null;
        }
        this.b(param1, -129, param2);
    }

    private final int a(pc param0, int param1) {
        int discarded$2 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        pc var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var3_int = this.field_z[param0.field_t];
              if (param1 == 761736646) {
                break L1;
              } else {
                var4 = (pc) null;
                discarded$2 = this.a((pc) null, 124);
                break L1;
              }
            }
            if (var3_int < 8192) {
              stackOut_5_0 = var3_int * param0.field_h + 32 >> 761736646;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = 16384 - (32 + (128 + -param0.field_h) * (16384 - var3_int) >> -1408535450);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("kj.U(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final void a(pc param0, byte param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -70) {
                break L1;
              } else {
                field_o = (boolean[]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var4_int = param0.field_i.field_k.length;
                if (!param2) {
                  break L3;
                } else {
                  if (param0.field_i.field_i) {
                    var6 = -param0.field_i.field_g + var4_int - -var4_int;
                    var4_int = var4_int << 8;
                    var5 = (int)((long)var6 * (long)this.field_u[param0.field_t] >> 323136070);
                    if (var4_int <= var5) {
                      param0.field_u.b(true);
                      var5 = -var5 + (var4_int - -var4_int) + -1;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              var5 = (int)((long)var4_int * (long)this.field_u[param0.field_t] >> -2116060090);
              break L2;
            }
            param0.field_u.e(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("kj.HA(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized ia c() {
        return null;
    }

    private final void c(int param0, int param1) {
        pc var3 = null;
        var3 = (pc) ((Object) this.field_I.field_l.g(param1 ^ param1));
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              L2: {
                if ((param0 ^ -1) > -1) {
                  break L2;
                } else {
                  if (param0 != var3.field_t) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (-1 < (var3.field_y ^ -1)) {
                this.field_j[var3.field_t][var3.field_D] = null;
                var3.field_y = 0;
                break L1;
              } else {
                break L1;
              }
            }
            var3 = (pc) ((Object) this.field_I.field_l.d(1));
            continue L0;
          }
        }
    }

    private final void c(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (param1 == 38) {
          var3 = 240 & param0;
          if (-129 == (var3 ^ -1)) {
            var4 = param0 & 15;
            var5 = (32542 & param0) >> 66514504;
            var6 = (param0 & 8361066) >> 313387600;
            this.b(23327, var5, var6, var4);
            return;
          } else {
            if ((var3 ^ -1) != -145) {
              if (var3 == 160) {
                var4 = 15 & param0;
                var5 = param0 >> -735367864 & 127;
                var6 = (8370933 & param0) >> -1699537200;
                this.a(-40, var6, var5, var4);
                return;
              } else {
                if (var3 == 176) {
                  L0: {
                    var4 = 15 & param0;
                    var5 = (param0 & 32577) >> -625065720;
                    var6 = param0 >> 76053008 & 127;
                    if (0 == var5) {
                      this.field_K[var4] = (var6 << -224081554) + cd.a(this.field_K[var4], -2080769);
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  L1: {
                    if (-33 == (var5 ^ -1)) {
                      this.field_K[var4] = (var6 << -1083731353) + cd.a(this.field_K[var4], -16257);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (-2 == (var5 ^ -1)) {
                      this.field_s[var4] = (var6 << -906576345) + cd.a(this.field_s[var4], -16257);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (33 == var5) {
                      this.field_s[var4] = var6 + cd.a(-128, this.field_s[var4]);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (-6 == (var5 ^ -1)) {
                      this.field_M[var4] = cd.a(-16257, this.field_M[var4]) - -(var6 << -1537306265);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if ((var5 ^ -1) == -38) {
                      this.field_M[var4] = cd.a(-128, this.field_M[var4]) - -var6;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if ((var5 ^ -1) != -8) {
                      break L6;
                    } else {
                      this.field_p[var4] = cd.a(this.field_p[var4], -16257) + (var6 << -1305516857);
                      break L6;
                    }
                  }
                  L7: {
                    if ((var5 ^ -1) != -40) {
                      break L7;
                    } else {
                      this.field_p[var4] = cd.a(-128, this.field_p[var4]) + var6;
                      break L7;
                    }
                  }
                  L8: {
                    if (-11 != (var5 ^ -1)) {
                      break L8;
                    } else {
                      this.field_z[var4] = cd.a(-16257, this.field_z[var4]) - -(var6 << -1078103033);
                      break L8;
                    }
                  }
                  L9: {
                    if (var5 == 42) {
                      this.field_z[var4] = var6 + cd.a(-128, this.field_z[var4]);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if ((var5 ^ -1) != -12) {
                      break L10;
                    } else {
                      this.field_r[var4] = (var6 << -757285145) + cd.a(-16257, this.field_r[var4]);
                      break L10;
                    }
                  }
                  L11: {
                    if ((var5 ^ -1) == -44) {
                      this.field_r[var4] = cd.a(-128, this.field_r[var4]) - -var6;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (-65 != (var5 ^ -1)) {
                      break L12;
                    } else {
                      if ((var6 ^ -1) > -65) {
                        this.field_m[var4] = cd.a(this.field_m[var4], -2);
                        break L12;
                      } else {
                        this.field_m[var4] = lb.a(this.field_m[var4], 1);
                        break L12;
                      }
                    }
                  }
                  L13: {
                    if (-66 == (var5 ^ -1)) {
                      if (64 <= var6) {
                        this.field_m[var4] = lb.a(this.field_m[var4], 2);
                        break L13;
                      } else {
                        this.a((byte) 39, var4);
                        this.field_m[var4] = cd.a(this.field_m[var4], -3);
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if ((var5 ^ -1) == -100) {
                      this.field_w[var4] = cd.a(this.field_w[var4], 127) - -(var6 << 183494855);
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (var5 != 98) {
                      break L15;
                    } else {
                      this.field_w[var4] = var6 + cd.a(16256, this.field_w[var4]);
                      break L15;
                    }
                  }
                  L16: {
                    if (101 != var5) {
                      break L16;
                    } else {
                      this.field_w[var4] = (var6 << 50131079) + (cd.a(this.field_w[var4], 127) + 16384);
                      break L16;
                    }
                  }
                  L17: {
                    if (-101 != (var5 ^ -1)) {
                      break L17;
                    } else {
                      this.field_w[var4] = 16384 + (cd.a(16256, this.field_w[var4]) + var6);
                      break L17;
                    }
                  }
                  L18: {
                    if (120 == var5) {
                      this.b(100, var4);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if ((var5 ^ -1) != -122) {
                      break L19;
                    } else {
                      this.b((byte) -72, var4);
                      break L19;
                    }
                  }
                  L20: {
                    if (var5 == 123) {
                      this.c(var4, param1 ^ 15421);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (-7 != (var5 ^ -1)) {
                      break L21;
                    } else {
                      var7 = this.field_w[var4];
                      if (16384 != var7) {
                        break L21;
                      } else {
                        this.field_v[var4] = cd.a(this.field_v[var4], -16257) + (var6 << 256590087);
                        break L21;
                      }
                    }
                  }
                  L22: {
                    if ((var5 ^ -1) != -39) {
                      break L22;
                    } else {
                      var7 = this.field_w[var4];
                      if ((var7 ^ -1) != -16385) {
                        break L22;
                      } else {
                        this.field_v[var4] = cd.a(this.field_v[var4], -128) - -var6;
                        break L22;
                      }
                    }
                  }
                  L23: {
                    if (16 == var5) {
                      this.field_u[var4] = cd.a(-16257, this.field_u[var4]) - -(var6 << 517249927);
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if (48 != var5) {
                      break L24;
                    } else {
                      this.field_u[var4] = var6 + cd.a(this.field_u[var4], -128);
                      break L24;
                    }
                  }
                  L25: {
                    if (var5 == 81) {
                      if ((var6 ^ -1) <= -65) {
                        this.field_m[var4] = lb.a(this.field_m[var4], 4);
                        break L25;
                      } else {
                        this.a(var4, (byte) 67);
                        this.field_m[var4] = cd.a(this.field_m[var4], -5);
                        break L25;
                      }
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (-18 != (var5 ^ -1)) {
                      break L26;
                    } else {
                      this.f(-118, (var6 << 446536935) + (this.field_Q[var4] & -16257), var4);
                      break L26;
                    }
                  }
                  L27: {
                    if (-50 == (var5 ^ -1)) {
                      this.f(-102, (-128 & this.field_Q[var4]) + var6, var4);
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  return;
                } else {
                  if (192 == var3) {
                    var4 = param0 & 15;
                    var5 = (32632 & param0) >> 798658216;
                    this.b(var4, param1 + -167, var5 + this.field_K[var4]);
                    return;
                  } else {
                    if (-209 != (var3 ^ -1)) {
                      if ((var3 ^ -1) == -225) {
                        var4 = param0 & 15;
                        var5 = (param0 >> 1201189897 & 16256) - -((32673 & param0) >> -501468376);
                        this.c(-108, var5, var4);
                        return;
                      } else {
                        var3 = 255 & param0;
                        if (255 != var3) {
                          return;
                        } else {
                          this.a(true, param1 ^ 2097113);
                          return;
                        }
                      }
                    } else {
                      var4 = param0 & 15;
                      var5 = (32669 & param0) >> 1322657192;
                      this.d(var5, param1 ^ -2858, var4);
                      return;
                    }
                  }
                }
              }
            } else {
              L28: {
                var4 = param0 & 15;
                var5 = (32525 & param0) >> -1496842808;
                var6 = 127 & param0 >> -364929040;
                if ((var6 ^ -1) < -1) {
                  this.c(-1, var4, var6, var5);
                  break L28;
                } else {
                  this.b(23327, var5, 64, var4);
                  break L28;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    private final synchronized void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Geoblox.field_C;
        if (param1 >= 0) {
            this.field_L[param1] = param2;
        } else {
            for (var4 = 0; (var4 ^ -1) > -17; var4++) {
                this.field_L[var4] = param2;
            }
        }
        if (param0 != 74) {
            this.a((byte) 100, 93);
        }
    }

    final synchronized void b(int param0, byte param1) {
        this.field_R = param0;
        if (param1 != 22) {
            this.field_x = 84L;
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        long var5 = 0L;
        int var7 = 0;
        L0: {
          var3 = -25 % ((29 - param0) / 34);
          var2 = this.field_t;
          var4 = this.field_k;
          var5 = this.field_A;
          if (this.field_l == null) {
            break L0;
          } else {
            if (this.field_U != var4) {
              break L0;
            } else {
              this.a(121, this.field_l, this.field_B, this.field_P);
              this.a((byte) 73);
              return;
            }
          }
        }
        L1: while (true) {
          if (var4 != this.field_k) {
            L2: {
              this.field_k = var4;
              this.field_A = var5;
              this.field_t = var2;
              if (null == this.field_l) {
                break L2;
              } else {
                if (this.field_U < var4) {
                  this.field_k = this.field_U;
                  this.field_t = -1;
                  this.field_A = this.field_C.d(this.field_k);
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
                if (this.field_C.field_a[var2] != var4) {
                  break L4;
                } else {
                  this.field_C.a(var2);
                  var7 = this.field_C.e(var2);
                  if (1 == var7) {
                    this.field_C.d();
                    this.field_C.b(var2);
                    if (this.field_C.e()) {
                      if (this.field_l != null) {
                        this.a(this.field_B, this.field_l, -1706);
                        this.a((byte) -32);
                        return;
                      } else {
                        L5: {
                          if (!this.field_B) {
                            break L5;
                          } else {
                            if (-1 == (var4 ^ -1)) {
                              break L5;
                            } else {
                              this.field_C.a(var5);
                              break L4;
                            }
                          }
                        }
                        this.a(true, 2097151);
                        this.field_C.a();
                        return;
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    L6: {
                      if ((128 & var7) != 0) {
                        this.c(var7, (byte) 38);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    this.field_C.f(var2);
                    this.field_C.b(var2);
                    continue L3;
                  }
                }
              }
              var2 = this.field_C.c();
              var4 = this.field_C.field_a[var2];
              var5 = this.field_C.d(var4);
              continue L1;
            }
          }
        }
    }

    final synchronized void a(boolean param0, rf param1, int param2) {
        try {
            if (param2 != -1706) {
                this.field_t = -24;
            }
            this.a(param2 + 1832, param1, param0, true);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "kj.PA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        pc var6 = null;
        pc var7 = null;
        var7 = this.field_j[param3][param1];
        if (var7 == null) {
          return;
        } else {
          L0: {
            this.field_j[param3][param1] = null;
            if (param0 == 23327) {
              break L0;
            } else {
              this.field_U = -124;
              break L0;
            }
          }
          L1: {
            if ((this.field_m[param3] & 2) == 0) {
              var7.field_y = 0;
              break L1;
            } else {
              var6 = (pc) ((Object) this.field_I.field_l.g(param0 ^ 23327));
              L2: while (true) {
                if (var6 == null) {
                  break L1;
                } else {
                  L3: {
                    if (var7.field_t != var6.field_t) {
                      break L3;
                    } else {
                      if (0 <= var6.field_y) {
                        break L3;
                      } else {
                        if (var7 == var6) {
                          break L3;
                        } else {
                          var7.field_y = 0;
                          break L1;
                        }
                      }
                    }
                  }
                  var6 = (pc) ((Object) this.field_I.field_l.d(1));
                  continue L2;
                }
              }
            }
          }
          return;
        }
    }

    private final void b(int param0, int param1) {
        pc var3 = null;
        var3 = (pc) ((Object) this.field_I.field_l.g(param0 + -100));
        L0: while (true) {
          if (var3 == null) {
            L1: {
              if (param0 == 100) {
                break L1;
              } else {
                this.field_x = -48L;
                break L1;
              }
            }
            return;
          } else {
            L2: {
              L3: {
                if (param1 < 0) {
                  break L3;
                } else {
                  if (param1 == var3.field_t) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (null != var3.field_u) {
                  L5: {
                    var3.field_u.c(qk.field_j / 100);
                    if (var3.field_u.g()) {
                      this.field_I.field_m.a(var3.field_u);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var3.b(-1);
                  break L4;
                } else {
                  break L4;
                }
              }
              L6: {
                if (-1 < (var3.field_y ^ -1)) {
                  this.field_j[var3.field_t][var3.field_D] = null;
                  break L6;
                } else {
                  break L6;
                }
              }
              var3.a(false);
              break L2;
            }
            var3 = (pc) ((Object) this.field_I.field_l.d(1));
            continue L0;
          }
        }
    }

    final synchronized void c(byte param0) {
        int var3 = Geoblox.field_C;
        if (param0 <= 65) {
            this.c(-76, (byte) -34);
        }
        vl var4 = (vl) ((Object) this.field_q.a((byte) 125));
        while (var4 != null) {
            var4.a((byte) -121);
            var4 = (vl) ((Object) this.field_q.b(-52));
        }
    }

    private final void f(int param0, int param1, int param2) {
        this.field_Q[param2] = param1;
        if (param0 > -100) {
            this.a(-75, 124, -68);
        }
        this.field_n[param2] = (int)(0.5 + 2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param1));
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = 0;
        if (param2 != this.field_S[param0]) {
            this.field_S[param0] = param2;
            for (var4 = 0; -129 < (var4 ^ -1); var4++) {
                this.field_D[param0][var4] = null;
            }
        }
        if (param1 != -129) {
            this.field_v = (int[]) null;
        }
    }

    public static void b(boolean param0) {
        field_E = null;
        field_O = null;
        field_o = null;
        field_G = null;
        if (param0) {
            kj.c(-77);
        }
    }

    private final void a(boolean param0, int param1) {
        int var3 = 0;
        if (!param0) {
            this.c(-1, 15387);
        } else {
            this.b(100, -1);
        }
        if (param1 != 2097151) {
            this.b(108);
        }
        this.b((byte) -109, -1);
        for (var3 = 0; (var3 ^ -1) > -17; var3++) {
            this.field_S[var3] = this.field_F[var3];
        }
        int var4 = 0;
        var3 = var4;
        while ((var4 ^ -1) > -17) {
            this.field_K[var4] = cd.a(this.field_F[var4], -128);
            var4++;
        }
    }

    final synchronized ia b() {
        return (ia) ((Object) this.field_I);
    }

    final synchronized void b(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        L0: {
          if (this.field_C.f()) {
            var2 = this.field_T * this.field_C.field_d / qk.field_j;
            L1: while (true) {
              var3 = this.field_x - -((long)param0 * (long)var2);
              if (-1L < (-var3 + this.field_A ^ -1L)) {
                var5 = (int)((-1L + ((long)var2 + -this.field_x + this.field_A)) / (long)var2);
                this.field_x = this.field_x + (long)var2 * (long)var5;
                param0 = param0 - var5;
                this.field_I.b(var5);
                this.a((byte) -42);
                if (this.field_C.f()) {
                  continue L1;
                } else {
                  break L0;
                }
              } else {
                this.field_x = var3;
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        this.field_I.b(param0);
    }

    final boolean b(pc param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (param0.field_u == null) {
              L1: {
                if ((param0.field_y ^ -1) > -1) {
                  break L1;
                } else {
                  param0.a(false);
                  if (0 >= param0.field_r) {
                    break L1;
                  } else {
                    if (this.field_D[param0.field_t][param0.field_r] != param0) {
                      break L1;
                    } else {
                      this.field_D[param0.field_t][param0.field_r] = null;
                      return true;
                    }
                  }
                }
              }
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 == -1) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("kj.IA(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    private final synchronized void a(byte param0, boolean param1) {
        this.field_C.a();
        if (param0 < 78) {
            this.field_y = (int[]) null;
        }
        this.field_l = null;
        this.a(param1, 2097151);
    }

    private final void c(int param0, int param1, int param2, int param3) {
        pc var5 = null;
        gd var6 = null;
        int var6_int = 0;
        pc var7 = null;
        pc var8 = null;
        vl var9 = null;
        vl var10 = null;
        Object stackIn_14_0 = null;
        pc stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        Object stackIn_15_0 = null;
        pc stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        Object stackIn_16_0 = null;
        pc stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        Object stackOut_13_0 = null;
        pc stackOut_13_1 = null;
        int stackOut_13_2 = 0;
        Object stackOut_15_0 = null;
        pc stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        Object stackOut_14_0 = null;
        pc stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        L0: {
          this.b(23327, param3, 64, param1);
          if (0 != (2 & this.field_m[param1])) {
            var5 = (pc) ((Object) this.field_I.field_l.a(false));
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (param1 != var5.field_t) {
                    break L2;
                  } else {
                    if (-1 >= (var5.field_y ^ -1)) {
                      break L2;
                    } else {
                      this.field_j[param1][var5.field_D] = null;
                      this.field_j[param1][param3] = var5;
                      var6_int = (var5.field_n * var5.field_s >> 269293324) + var5.field_E;
                      var5.field_E = var5.field_E + (param3 + -var5.field_D << 431120968);
                      var5.field_D = param3;
                      var5.field_n = var6_int + -var5.field_E;
                      var5.field_s = 4096;
                      return;
                    }
                  }
                }
                var5 = (pc) ((Object) this.field_I.field_l.b(param0 ^ -1));
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var9 = (vl) ((Object) this.field_q.a((long)this.field_S[param1], (byte) -105));
        var10 = var9;
        if (var10 != null) {
          var6 = var9.field_k[param3];
          if (var6 != null) {
            L3: {
              var7 = new pc();
              var7.field_t = param1;
              var7.field_z = var10;
              var7.field_i = var6;
              var7.field_x = var9.field_f[param3];
              var7.field_r = var9.field_i[param3];
              var7.field_D = param3;
              var7.field_w = var9.field_o[param3] * var10.field_g * (param2 * param2) - -1024 >> 631565163;
              var7.field_h = 255 & var9.field_m[param3];
              var7.field_E = (param3 << -298352696) - (var9.field_j[param3] & 32767);
              var7.field_q = 0;
              var7.field_l = 0;
              var7.field_o = 0;
              var7.field_k = 0;
              var7.field_y = -1;
              if (param0 == (this.field_u[param1] ^ -1)) {
                var7.field_u = kl.a(var6, this.a(92, var7), this.a((byte) 117, var7), this.a(var7, 761736646));
                break L3;
              } else {
                L4: {
                  var7.field_u = kl.a(var6, this.a(83, var7), 0, this.a(var7, 761736646));
                  stackOut_13_0 = this;
                  stackOut_13_1 = (pc) (var7);
                  stackOut_13_2 = -70;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  if (0 <= var9.field_j[param3]) {
                    stackOut_15_0 = this;
                    stackOut_15_1 = (pc) ((Object) stackIn_15_1);
                    stackOut_15_2 = stackIn_15_2;
                    stackOut_15_3 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    stackIn_16_3 = stackOut_15_3;
                    break L4;
                  } else {
                    stackOut_14_0 = this;
                    stackOut_14_1 = (pc) ((Object) stackIn_14_1);
                    stackOut_14_2 = stackIn_14_2;
                    stackOut_14_3 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_16_2 = stackOut_14_2;
                    stackIn_16_3 = stackOut_14_3;
                    break L4;
                  }
                }
                this.a(stackIn_16_1, (byte) stackIn_16_2, stackIn_16_3 != 0);
                break L3;
              }
            }
            L5: {
              if ((var9.field_j[param3] ^ -1) <= -1) {
                break L5;
              } else {
                var7.field_u.g(-1);
                break L5;
              }
            }
            L6: {
              if (0 <= var7.field_r) {
                L7: {
                  var8 = this.field_D[param1][var7.field_r];
                  if (var8 == null) {
                    break L7;
                  } else {
                    if (var8.field_y < 0) {
                      this.field_j[param1][var8.field_D] = null;
                      var8.field_y = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                this.field_D[param1][var7.field_r] = var7;
                break L6;
              } else {
                break L6;
              }
            }
            this.field_I.field_l.a(-70, var7);
            this.field_j[param1][param3] = var7;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final void c(int param0, int param1, int param2) {
        if (param0 > -107) {
            return;
        }
        this.field_y[param2] = param1;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param0 != -40) {
            int[] var6 = (int[]) null;
            this.a((int[]) null, -107, 119);
        }
    }

    final synchronized void d(int param0) {
        this.a((byte) 106, true);
        if (param0 != -9268) {
            this.field_F = (int[]) null;
        }
    }

    final static void c(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (null == je.field_j) {
            break L0;
          } else {
            var1 = je.field_j;
            synchronized (var1) {
              L1: {
                je.field_j = null;
                break L1;
              }
            }
            break L0;
          }
        }
        L2: {
          if (param0 == -11099) {
            break L2;
          } else {
            field_J = 4;
            break L2;
          }
        }
    }

    private final synchronized void a(int param0, rf param1, boolean param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        try {
            this.a((byte) 98, param3);
            this.field_C.a(param1.field_f);
            this.field_x = 0L;
            this.field_B = param2 ? true : false;
            var5_int = this.field_C.g();
            if (param0 <= 92) {
                this.a(60, (byte) -45);
            }
            for (var6 = 0; var6 < var5_int; var6++) {
                this.field_C.a(var6);
                this.field_C.f(var6);
                this.field_C.b(var6);
            }
            this.field_t = this.field_C.c();
            this.field_k = this.field_C.field_a[this.field_t];
            this.field_A = this.field_C.d(this.field_k);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "kj.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void e(int param0, int param1, int param2) {
        if (param0 != -1636) {
            this.b((byte) -86, 98);
        }
        this.a(-8581, param1, param2);
    }

    public kj() {
        this.field_D = new pc[16][128];
        this.field_z = new int[16];
        this.field_u = new int[16];
        this.field_p = new int[16];
        this.field_S = new int[16];
        this.field_m = new int[16];
        this.field_v = new int[16];
        this.field_L = new int[16];
        this.field_s = new int[16];
        this.field_M = new int[16];
        this.field_j = new pc[16][128];
        this.field_r = new int[16];
        this.field_T = 1000000;
        this.field_K = new int[16];
        this.field_R = 256;
        this.field_n = new int[16];
        this.field_y = new int[16];
        this.field_Q = new int[16];
        this.field_F = new int[16];
        this.field_w = new int[16];
        this.field_C = new jb();
        this.field_I = new ad((kj) (this));
        this.field_q = new fi(128);
        this.a((byte) 74, -1, 256);
        this.a(true, 2097151);
    }

    static {
        field_J = 0;
        field_o = new boolean[112];
        field_O = new int[128];
        field_G = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
