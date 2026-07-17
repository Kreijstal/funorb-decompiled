/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf extends ej {
    private int[] field_r;
    private int[] field_T;
    int[] field_z;
    int[] field_J;
    static String field_x;
    private int[] field_w;
    static String field_l;
    static String field_K;
    private hg[][] field_p;
    private int[] field_W;
    int[] field_U;
    private int[] field_B;
    static int field_A;
    private int[] field_S;
    private int[] field_o;
    private int field_q;
    static String field_n;
    private hg[][] field_O;
    private int field_M;
    private oi field_H;
    private int[] field_N;
    private int[] field_I;
    private int[] field_t;
    private int[] field_v;
    static String[] field_y;
    private int[] field_P;
    static String field_F;
    private int[] field_D;
    private qd field_C;
    private long field_E;
    private int field_u;
    private int field_G;
    private boolean field_R;
    private lh field_Q;
    private long field_s;
    private int field_L;
    private rl field_m;
    private boolean field_V;

    final synchronized boolean a(int param0, rl param1, me param2, da param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        ee var8_ref_ee = null;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        fc var12 = null;
        fc var13 = null;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
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
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              param1.a();
              var6_int = 1;
              var7 = null;
              if (param0 > 0) {
                var7 = (Object) (Object) new int[]{param0};
                break L1;
              } else {
                break L1;
              }
            }
            var8_ref_ee = (ee) (Object) param1.field_h.b(0);
            L2: while (true) {
              if (var8_ref_ee == null) {
                L3: {
                  var8 = 25 / ((param4 - -49) / 43);
                  if (var6_int != 0) {
                    param1.b();
                    break L3;
                  } else {
                    break L3;
                  }
                }
                stackOut_17_0 = var6_int;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                L4: {
                  var9 = (int)var8_ref_ee.field_g;
                  var12 = (fc) (Object) ((mf) this).field_C.a(true, (long)var9);
                  if (var12 == null) {
                    var13 = oa.a(-1803587230, var9, param3);
                    if (var13 != null) {
                      ((mf) this).field_C.a((byte) 122, (gg) (Object) var13, (long)var9);
                      if (var13.a(param2, (int[]) var7, var8_ref_ee.field_k, -124)) {
                        break L4;
                      } else {
                        var6_int = 0;
                        break L4;
                      }
                    } else {
                      var6_int = 0;
                      break L4;
                    }
                  } else {
                    if (var12.a(param2, (int[]) var7, var8_ref_ee.field_k, -124)) {
                      break L4;
                    } else {
                      var6_int = 0;
                      var8_ref_ee = (ee) (Object) param1.field_h.c((byte) 118);
                      continue L2;
                    }
                  }
                }
                var8_ref_ee = (ee) (Object) param1.field_h.c((byte) 118);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var6;
            stackOut_19_1 = new StringBuilder().append("mf.HA(").append(param0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          L6: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          L7: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L7;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param4 + 41);
        }
        return stackIn_18_0 != 0;
    }

    final boolean a(int param0, int[] param1, int param2, int param3, hg param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        g var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_10_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_60_0 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_59_0 = 0;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              param4.field_t = gj.field_s / param3;
              if (param4.field_k < 0) {
                break L1;
              } else {
                L2: {
                  if (null == param4.field_w) {
                    break L2;
                  } else {
                    if (param4.field_w.i()) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  param4.a((byte) 104);
                  param4.c(10);
                  if (0 >= param4.field_m) {
                    break L3;
                  } else {
                    if (param4 == ((mf) this).field_O[param4.field_z][param4.field_m]) {
                      ((mf) this).field_O[param4.field_z][param4.field_m] = null;
                      break L3;
                    } else {
                      return true;
                    }
                  }
                }
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              }
            }
            L4: {
              var6_int = param4.field_n;
              if (0 < var6_int) {
                L5: {
                  var6_int = var6_int - (int)(16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)((mf) this).field_S[param4.field_z]) + 0.5);
                  if (0 <= var6_int) {
                    break L5;
                  } else {
                    var6_int = 0;
                    break L5;
                  }
                }
                param4.field_n = var6_int;
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              param4.field_w.f(this.a(param4, 1));
              var7 = param4.field_D;
              param4.field_q = param4.field_q + var7.field_m;
              param4.field_r = param4.field_r + 1;
              var8 = 0;
              var9 = 0.000005086263020833333 * (double)((param4.field_o - 60 << 8) + (param4.field_n * param4.field_l >> 12));
              if (0 >= var7.field_c) {
                break L6;
              } else {
                L7: {
                  if (var7.field_g > 0) {
                    param4.field_v = param4.field_v + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_g) * 128.0);
                    break L7;
                  } else {
                    param4.field_v = param4.field_v + 128;
                    break L7;
                  }
                }
                if (var7.field_c * param4.field_v < 819200) {
                  break L6;
                } else {
                  var8 = 1;
                  break L6;
                }
              }
            }
            L8: {
              if (null == var7.field_j) {
                break L8;
              } else {
                L9: {
                  if (var7.field_b <= 0) {
                    param4.field_j = param4.field_j + 128;
                    break L9;
                  } else {
                    param4.field_j = param4.field_j + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_b) * 128.0);
                    break L9;
                  }
                }
                L10: while (true) {
                  L11: {
                    if (var7.field_j.length - 2 <= param4.field_s) {
                      break L11;
                    } else {
                      if (param4.field_j <= (var7.field_j[param4.field_s + 2] & 255) << 8) {
                        break L11;
                      } else {
                        param4.field_s = param4.field_s + 2;
                        continue L10;
                      }
                    }
                  }
                  if (param4.field_s != -2 + var7.field_j.length) {
                    break L8;
                  } else {
                    if (var7.field_j[1 + param4.field_s] != 0) {
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
              if (param4.field_k < 0) {
                break L12;
              } else {
                if (null == var7.field_i) {
                  break L12;
                } else {
                  if ((1 & ((mf) this).field_U[param4.field_z]) != 0) {
                    break L12;
                  } else {
                    L13: {
                      if (0 > param4.field_m) {
                        break L13;
                      } else {
                        if (param4 == ((mf) this).field_O[param4.field_z][param4.field_m]) {
                          break L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    L14: {
                      if (0 >= var7.field_h) {
                        param4.field_k = param4.field_k + 128;
                        break L14;
                      } else {
                        param4.field_k = param4.field_k + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_h * var9));
                        break L14;
                      }
                    }
                    L15: while (true) {
                      L16: {
                        if (-2 + var7.field_i.length <= param4.field_A) {
                          break L16;
                        } else {
                          if ((65280 & var7.field_i[2 + param4.field_A] << 8) >= param4.field_k) {
                            break L16;
                          } else {
                            param4.field_A = param4.field_A + 2;
                            continue L15;
                          }
                        }
                      }
                      if (var7.field_i.length + -2 != param4.field_A) {
                        break L12;
                      } else {
                        var8 = 1;
                        break L12;
                      }
                    }
                  }
                }
              }
            }
            if (var8 != 0) {
              L17: {
                param4.field_w.e(param4.field_t);
                if (param1 == null) {
                  param4.field_w.a(param2);
                  break L17;
                } else {
                  param4.field_w.a(param1, param0, param2);
                  break L17;
                }
              }
              L18: {
                if (!param4.field_w.h()) {
                  break L18;
                } else {
                  ((mf) this).field_Q.field_r.a((ej) (Object) param4.field_w);
                  break L18;
                }
              }
              L19: {
                param4.a((byte) 112);
                if (param4.field_k < 0) {
                  break L19;
                } else {
                  param4.c(10);
                  if (param4.field_m <= 0) {
                    break L19;
                  } else {
                    if (((mf) this).field_O[param4.field_z][param4.field_m] != param4) {
                      break L19;
                    } else {
                      ((mf) this).field_O[param4.field_z][param4.field_m] = null;
                      break L19;
                    }
                  }
                }
              }
              stackOut_57_0 = 1;
              stackIn_58_0 = stackOut_57_0;
              return stackIn_58_0 != 0;
            } else {
              int discarded$1 = -70;
              param4.field_w.a(param4.field_t, this.a(param4), this.a(127, param4));
              stackOut_59_0 = 0;
              stackIn_60_0 = stackOut_59_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var6 = decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) var6;
            stackOut_61_1 = new StringBuilder().append("mf.U(").append(param0).append(44);
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param1 == null) {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L20;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L20;
            }
          }
          L21: {
            stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
            stackOut_64_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_64_2).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param4 == null) {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L21;
            } else {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "{...}";
              stackIn_67_0 = stackOut_65_0;
              stackIn_67_1 = stackOut_65_1;
              stackIn_67_2 = stackOut_65_2;
              break L21;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_67_0, stackIn_67_2 + 41);
        }
        return stackIn_60_0 != 0;
    }

    private final void a(int param0, byte param1) {
        hg var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = SolKnight.field_L ? 1 : 0;
        var4 = 102 / ((param1 - 22) / 56);
        var3 = (hg) (Object) ((mf) this).field_Q.field_m.a((byte) 51);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              L2: {
                if (param0 < 0) {
                  break L2;
                } else {
                  if (param0 == var3.field_z) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                if (null == var3.field_w) {
                  break L3;
                } else {
                  L4: {
                    var3.field_w.e(gj.field_s / 100);
                    if (var3.field_w.h()) {
                      ((mf) this).field_Q.field_r.a((ej) (Object) var3.field_w);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var3.a((byte) 102);
                  break L3;
                }
              }
              L5: {
                if (var3.field_k < 0) {
                  ((mf) this).field_p[var3.field_z][var3.field_o] = null;
                  break L5;
                } else {
                  break L5;
                }
              }
              var3.c(10);
              break L1;
            }
            var3 = (hg) (Object) ((mf) this).field_Q.field_m.b(-18);
            continue L0;
          }
        }
    }

    final synchronized void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = SolKnight.field_L ? 1 : 0;
          if (param1 >= 0) {
            ((mf) this).field_D[param1] = param0;
            break L0;
          } else {
            var4 = 0;
            L1: while (true) {
              if (var4 >= 16) {
                break L0;
              } else {
                ((mf) this).field_D[var4] = param0;
                var4++;
                continue L1;
              }
            }
          }
        }
        L2: {
          if (param2 == -129) {
            break L2;
          } else {
            ((mf) this).field_Q = null;
            break L2;
          }
        }
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = 67 / ((10 - param0) / 61);
    }

    private final void c(int param0, int param1, int param2) {
        ((mf) this).field_N[param2] = param0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        hg var5 = null;
        sh var6 = null;
        int var6_int = 0;
        hg var7 = null;
        hg var8 = null;
        int var9 = 0;
        fc var10 = null;
        fc var11 = null;
        fc var12 = null;
        Object stackIn_15_0 = null;
        hg stackIn_15_1 = null;
        Object stackIn_16_0 = null;
        hg stackIn_16_1 = null;
        Object stackIn_17_0 = null;
        hg stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        Object stackOut_14_0 = null;
        hg stackOut_14_1 = null;
        Object stackOut_16_0 = null;
        hg stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        Object stackOut_15_0 = null;
        hg stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        L0: {
          var9 = SolKnight.field_L ? 1 : 0;
          this.b(param1, param0, 64, 127);
          if ((((mf) this).field_U[param0] & 2) == 0) {
            break L0;
          } else {
            var5 = (hg) (Object) ((mf) this).field_Q.field_m.c((byte) 96);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (param0 != var5.field_z) {
                    break L2;
                  } else {
                    if (0 > var5.field_k) {
                      ((mf) this).field_p[param0][var5.field_o] = null;
                      ((mf) this).field_p[param0][param1] = var5;
                      var6_int = (var5.field_l * var5.field_n >> 12) + var5.field_h;
                      var5.field_h = var5.field_h + (param1 - var5.field_o << 8);
                      var5.field_n = 4096;
                      var5.field_o = param1;
                      var5.field_l = -var5.field_h + var6_int;
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = (hg) (Object) ((mf) this).field_Q.field_m.b((byte) 94);
                continue L1;
              }
            }
          }
        }
        var10 = (fc) (Object) ((mf) this).field_C.a(true, (long)((mf) this).field_v[param0]);
        var11 = var10;
        var12 = var11;
        if (var11 != null) {
          var6 = var10.field_q[param1];
          if (var6 != null) {
            L3: {
              var7 = new hg();
              var7.field_z = param0;
              var7.field_p = var11;
              var7.field_u = var6;
              var7.field_D = var10.field_i[param1];
              var7.field_m = var10.field_h[param1];
              var7.field_o = param1;
              var7.field_i = param2 * param2 * (var10.field_j * var10.field_p[param1]) + 1024 >> 11;
              var7.field_x = 255 & var10.field_r[param1];
              var7.field_h = -(32767 & var10.field_s[param1]) + (param1 << 8);
              var7.field_v = 0;
              var7.field_s = 0;
              var7.field_A = 0;
              var7.field_k = -1;
              var7.field_j = 0;
              if (((mf) this).field_z[param0] != 0) {
                L4: {
                  var7.field_w = qi.a(var6, this.a(var7, 1), 0, this.a(127, var7));
                  stackOut_14_0 = this;
                  stackOut_14_1 = (hg) var7;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  if (var12.field_s[param1] >= 0) {
                    stackOut_16_0 = this;
                    stackOut_16_1 = (hg) (Object) stackIn_16_1;
                    stackOut_16_2 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    break L4;
                  } else {
                    stackOut_15_0 = this;
                    stackOut_15_1 = (hg) (Object) stackIn_15_1;
                    stackOut_15_2 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_17_2 = stackOut_15_2;
                    break L4;
                  }
                }
                ((mf) this).a(stackIn_17_1, stackIn_17_2 != 0, false);
                break L3;
              } else {
                int discarded$1 = -70;
                var7.field_w = qi.a(var6, this.a(var7, 1), this.a(var7), this.a(127, var7));
                break L3;
              }
            }
            L5: {
              if (0 > var12.field_s[param1]) {
                var7.field_w.d(-1);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (var7.field_m < 0) {
                break L6;
              } else {
                L7: {
                  var8 = ((mf) this).field_O[param0][var7.field_m];
                  if (var8 == null) {
                    break L7;
                  } else {
                    if (var8.field_k >= 0) {
                      break L7;
                    } else {
                      ((mf) this).field_p[param0][var8.field_o] = null;
                      var8.field_k = 0;
                      break L7;
                    }
                  }
                }
                ((mf) this).field_O[param0][var7.field_m] = var7;
                break L6;
              }
            }
            ((mf) this).field_Q.field_m.a((gg) (Object) var7, -7044);
            ((mf) this).field_p[param0][param1] = var7;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
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
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((mf) this).field_H.d()) {
                break L1;
              } else {
                var4_int = ((mf) this).field_H.field_c * ((mf) this).field_M / gj.field_s;
                L2: while (true) {
                  var5 = (long)var4_int * (long)param2 + ((mf) this).field_s;
                  if (-var5 + ((mf) this).field_E >= 0L) {
                    ((mf) this).field_s = var5;
                    break L1;
                  } else {
                    var7 = (int)((-1L + ((long)var4_int + (-((mf) this).field_s + ((mf) this).field_E))) / (long)var4_int);
                    ((mf) this).field_s = ((mf) this).field_s + (long)var7 * (long)var4_int;
                    ((mf) this).field_Q.a(param0, param1, var7);
                    this.c(false);
                    param1 = param1 + var7;
                    param2 = param2 - var7;
                    if (!((mf) this).field_H.d()) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            ((mf) this).field_Q.a(param0, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("mf.AA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void e(int param0) {
        al var1 = (al) (Object) cj.field_a.e((byte) 86);
        if (param0 != 4096) {
            mf.e(105);
        }
        if (var1 == null) {
            throw new IllegalStateException();
        }
        mi.a(var1.field_h, var1.field_k, var1.field_o);
        mi.f(var1.field_l, var1.field_j, var1.field_i, var1.field_m);
        var1.field_h = null;
        uc.field_a.a((gg) (Object) var1, -7044);
    }

    public static void g() {
        field_x = null;
        field_F = null;
        field_l = null;
        field_K = null;
        field_y = null;
        int var1 = -106;
        field_n = null;
    }

    final static void f(int param0) {
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var1 = (Object) (Object) i.field_J;
            synchronized (var1) {
              L1: {
                if (param0 == -11214) {
                  L2: {
                    pf.field_a = si.field_B;
                    lf.field_c = lf.field_c + 1;
                    if (0 <= fg.field_b) {
                      L3: while (true) {
                        if (qd.field_d == fg.field_b) {
                          break L2;
                        } else {
                          var2 = ci.field_qb[qd.field_d];
                          qd.field_d = 127 & qd.field_d + 1;
                          if (var2 < 0) {
                            fh.field_d[~var2] = false;
                            continue L3;
                          } else {
                            fh.field_d[var2] = true;
                            continue L3;
                          }
                        }
                      }
                    } else {
                      var2 = 0;
                      L4: while (true) {
                        if (var2 >= 112) {
                          fg.field_b = qd.field_d;
                          break L2;
                        } else {
                          fh.field_d[var2] = false;
                          var2++;
                          continue L4;
                        }
                      }
                    }
                  }
                  si.field_B = rh.field_e;
                  break L1;
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw fc.a((Throwable) (Object) var1_ref, "mf.MA(" + param0 + 41);
        }
    }

    private final int a(int param0, hg param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3_int = ((mf) this).field_w[param1.field_z];
            if (var3_int < 8192) {
              stackOut_3_0 = var3_int * param1.field_x - -32 >> 6;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 16384 - ((128 - param1.field_x) * (-var3_int + 16384) + 32 >> 6);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("mf.JA(").append(127).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    private final void b(byte param0, int param1, int param2) {
        ((mf) this).field_P[param2] = param1;
        ((mf) this).field_B[param2] = fi.a(param1, -128);
        this.e(param2, 28152, param1);
    }

    final void a(hg param0, boolean param1, boolean param2) {
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
              if (!param2) {
                break L1;
              } else {
                ((mf) this).field_t = null;
                break L1;
              }
            }
            L2: {
              L3: {
                var4_int = param0.field_u.field_i.length;
                if (!param1) {
                  break L3;
                } else {
                  if (param0.field_u.field_k) {
                    var6 = -param0.field_u.field_m + (var4_int - -var4_int);
                    var5 = (int)((long)var6 * (long)((mf) this).field_z[param0.field_z] >> 6);
                    var4_int = var4_int << 8;
                    if (var4_int <= var5) {
                      param0.field_w.b(true);
                      var5 = -1 + (var4_int - -var4_int + -var5);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              var5 = (int)((long)var4_int * (long)((mf) this).field_z[param0.field_z] >> 6);
              break L2;
            }
            param0.field_w.g(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("mf.LA(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final synchronized void b(int param0, byte param1) {
        ((mf) this).field_M = param0;
        int var3 = 40 % ((-48 - param1) / 40);
    }

    private final int a(hg param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        g var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
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
              var3_int = param0.field_h - -(param0.field_n * param0.field_l >> 12);
              var3_int = var3_int + ((-8192 + ((mf) this).field_N[param0.field_z]) * ((mf) this).field_t[param0.field_z] >> 12);
              var4 = param0.field_D;
              if (var4.field_m <= 0) {
                break L1;
              } else {
                L2: {
                  if (var4.field_d > 0) {
                    break L2;
                  } else {
                    if (0 < ((mf) this).field_W[param0.field_z]) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  var5 = var4.field_d << 2;
                  var6 = var4.field_f << 1;
                  if (var6 <= param0.field_r) {
                    break L3;
                  } else {
                    var5 = var5 * param0.field_r / var6;
                    break L3;
                  }
                }
                var5 = var5 + (((mf) this).field_W[param0.field_z] >> 7);
                var7 = Math.sin((double)(param0.field_q & 511) * 0.01227184630308513);
                var3_int = var3_int + (int)((double)var5 * var7);
                break L1;
              }
            }
            L4: {
              var5 = (int)((double)(param0.field_u.field_j * 256) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)gj.field_s + 0.5);
              if (1 > var5) {
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                break L4;
              } else {
                stackOut_8_0 = var5;
                stackIn_10_0 = stackOut_8_0;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("mf.G(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + 1 + 41);
        }
        return stackIn_10_0;
    }

    final synchronized void b(boolean param0) {
        int var3 = SolKnight.field_L ? 1 : 0;
        if (!param0) {
            return;
        }
        fc var4 = (fc) (Object) ((mf) this).field_C.b(0);
        while (var4 != null) {
            var4.a(6890);
            var4 = (fc) (Object) ((mf) this).field_C.c((byte) 122);
        }
    }

    private final void a(int param0, int param1, int param2) {
        ((mf) this).field_T[param2] = param1;
        ((mf) this).field_J[param2] = (int)(2097152.0 * Math.pow(2.0, (double)param1 * 0.00054931640625) + 0.5);
    }

    private final void e(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = SolKnight.field_L ? 1 : 0;
        if (((mf) this).field_v[param0] != param2) {
            ((mf) this).field_v[param0] = param2;
            for (var4 = 0; var4 < 128; var4++) {
                ((mf) this).field_O[param0][var4] = null;
            }
        }
    }

    private final void g(int param0, int param1) {
        int var3 = 0;
        hg var4 = null;
        int var5 = 0;
        L0: {
          var5 = SolKnight.field_L ? 1 : 0;
          var3 = 31 / ((param0 - -63) / 39);
          if ((((mf) this).field_U[param1] & 2) != 0) {
            var4 = (hg) (Object) ((mf) this).field_Q.field_m.a((byte) 51);
            L1: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                L2: {
                  if (param1 != var4.field_z) {
                    break L2;
                  } else {
                    if (null == ((mf) this).field_p[param1][var4.field_o]) {
                      if (0 <= var4.field_k) {
                        break L2;
                      } else {
                        var4.field_k = 0;
                        break L2;
                      }
                    } else {
                      var4 = (hg) (Object) ((mf) this).field_Q.field_m.b(-50);
                      continue L1;
                    }
                  }
                }
                var4 = (hg) (Object) ((mf) this).field_Q.field_m.b(-50);
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
    }

    private final void e(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = SolKnight.field_L ? 1 : 0;
        var3 = param0 & 240;
        if (var3 == 128) {
          var4 = 15 & param0;
          var5 = (32549 & param0) >> 8;
          var6 = (8355990 & param0) >> 16;
          this.b(var5, var4, var6, 120);
          return;
        } else {
          if (144 != var3) {
            if (160 == var3) {
              var4 = param0 & 15;
              var5 = (param0 & 32598) >> 8;
              var6 = (param0 & 8351591) >> 16;
              this.c(var4, var5, var6, -93);
              return;
            } else {
              if (var3 != 176) {
                if (var3 == 192) {
                  var4 = param0 & 15;
                  var5 = (32680 & param0) >> 8;
                  this.e(var4, 28152, var5 + ((mf) this).field_B[var4]);
                  return;
                } else {
                  if (var3 == 208) {
                    var4 = param0 & 15;
                    var5 = 127 & param0 >> 8;
                    this.a((byte) -117, var4, var5);
                    return;
                  } else {
                    if (var3 == 224) {
                      var4 = param0 & 15;
                      var5 = (param0 >> 9 & 16256) - -(127 & param0 >> 8);
                      this.c(var5, 17208, var4);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L0: {
                  var4 = param0 & 15;
                  var5 = 127 & param0 >> 8;
                  var6 = param0 >> 16 & 127;
                  if (var5 == 0) {
                    ((mf) this).field_B[var4] = fi.a(-2080769, ((mf) this).field_B[var4]) - -(var6 << 14);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                L1: {
                  if (var5 == 32) {
                    ((mf) this).field_B[var4] = (var6 << 7) + fi.a(((mf) this).field_B[var4], -16257);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (var5 != 1) {
                    break L2;
                  } else {
                    ((mf) this).field_W[var4] = (var6 << 7) + fi.a(-16257, ((mf) this).field_W[var4]);
                    break L2;
                  }
                }
                L3: {
                  if (33 == var5) {
                    ((mf) this).field_W[var4] = fi.a(((mf) this).field_W[var4], -128) + var6;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var5 == 5) {
                    ((mf) this).field_S[var4] = fi.a(-16257, ((mf) this).field_S[var4]) - -(var6 << 7);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (var5 == 37) {
                    ((mf) this).field_S[var4] = fi.a(((mf) this).field_S[var4], -128) - -var6;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (var5 != 7) {
                    break L6;
                  } else {
                    ((mf) this).field_I[var4] = (var6 << 7) + fi.a(((mf) this).field_I[var4], -16257);
                    break L6;
                  }
                }
                L7: {
                  if (var5 == 39) {
                    ((mf) this).field_I[var4] = fi.a(-128, ((mf) this).field_I[var4]) + var6;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (var5 != 10) {
                    break L8;
                  } else {
                    ((mf) this).field_w[var4] = fi.a(((mf) this).field_w[var4], -16257) + (var6 << 7);
                    break L8;
                  }
                }
                L9: {
                  if (var5 != 42) {
                    break L9;
                  } else {
                    ((mf) this).field_w[var4] = var6 + fi.a(((mf) this).field_w[var4], -128);
                    break L9;
                  }
                }
                L10: {
                  if (11 != var5) {
                    break L10;
                  } else {
                    ((mf) this).field_r[var4] = (var6 << 7) + fi.a(((mf) this).field_r[var4], -16257);
                    break L10;
                  }
                }
                L11: {
                  if (var5 == 43) {
                    ((mf) this).field_r[var4] = fi.a(((mf) this).field_r[var4], -128) + var6;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (64 == var5) {
                    if (var6 < 64) {
                      ((mf) this).field_U[var4] = fi.a(((mf) this).field_U[var4], -2);
                      break L12;
                    } else {
                      ((mf) this).field_U[var4] = qk.a(((mf) this).field_U[var4], 1);
                      break L12;
                    }
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (var5 != 65) {
                    break L13;
                  } else {
                    if (64 > var6) {
                      this.g(40, var4);
                      ((mf) this).field_U[var4] = fi.a(((mf) this).field_U[var4], -3);
                      break L13;
                    } else {
                      ((mf) this).field_U[var4] = qk.a(((mf) this).field_U[var4], 2);
                      break L13;
                    }
                  }
                }
                L14: {
                  if (99 == var5) {
                    ((mf) this).field_o[var4] = fi.a(((mf) this).field_o[var4], 127) - -(var6 << 7);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (var5 == 98) {
                    ((mf) this).field_o[var4] = fi.a(((mf) this).field_o[var4], 16256) - -var6;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (101 == var5) {
                    ((mf) this).field_o[var4] = (var6 << 7) + (16384 + fi.a(127, ((mf) this).field_o[var4]));
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (100 == var5) {
                    ((mf) this).field_o[var4] = fi.a(((mf) this).field_o[var4], 16256) + (16384 - -var6);
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (120 != var5) {
                    break L18;
                  } else {
                    this.a(var4, (byte) -122);
                    break L18;
                  }
                }
                L19: {
                  if (var5 == 121) {
                    this.c(var4, -119);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if (var5 == 123) {
                    this.f(-32471, var4);
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (var5 != 6) {
                    break L21;
                  } else {
                    var7 = ((mf) this).field_o[var4];
                    if (16384 == var7) {
                      ((mf) this).field_t[var4] = fi.a(-16257, ((mf) this).field_t[var4]) + (var6 << 7);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                }
                L22: {
                  if (var5 == 38) {
                    var7 = ((mf) this).field_o[var4];
                    if (var7 != 16384) {
                      break L22;
                    } else {
                      ((mf) this).field_t[var4] = var6 + fi.a(((mf) this).field_t[var4], -128);
                      break L22;
                    }
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (var5 != 16) {
                    break L23;
                  } else {
                    ((mf) this).field_z[var4] = fi.a(-16257, ((mf) this).field_z[var4]) + (var6 << 7);
                    break L23;
                  }
                }
                L24: {
                  if (48 == var5) {
                    ((mf) this).field_z[var4] = fi.a(((mf) this).field_z[var4], -128) + var6;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (81 == var5) {
                    if (var6 < 64) {
                      this.b(-4222, var4);
                      ((mf) this).field_U[var4] = fi.a(((mf) this).field_U[var4], -5);
                      break L25;
                    } else {
                      ((mf) this).field_U[var4] = qk.a(((mf) this).field_U[var4], 4);
                      break L25;
                    }
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (var5 == 17) {
                    this.a(13127, (((mf) this).field_T[var4] & -16257) - -(var6 << 7), var4);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (var5 == 49) {
                    this.a(13127, var6 + (((mf) this).field_T[var4] & -128), var4);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                return;
              }
            }
          } else {
            var4 = param0 & 15;
            var5 = (param0 & 32579) >> 8;
            var6 = 127 & param0 >> 16;
            if (var6 <= 0) {
              this.b(var5, var4, 64, -50);
              return;
            } else {
              this.a(var4, var5, var6, 26879);
              return;
            }
          }
        }
    }

    private final void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = SolKnight.field_L ? 1 : 0;
          var2 = ((mf) this).field_u;
          var3 = ((mf) this).field_G;
          var4 = ((mf) this).field_E;
          if (null == ((mf) this).field_m) {
            break L0;
          } else {
            if (((mf) this).field_L != var3) {
              break L0;
            } else {
              this.a(93, ((mf) this).field_V, ((mf) this).field_R, ((mf) this).field_m);
              this.c(param0);
              return;
            }
          }
        }
        L1: while (true) {
          if (var3 != ((mf) this).field_G) {
            ((mf) this).field_E = var4;
            ((mf) this).field_G = var3;
            ((mf) this).field_u = var2;
            if (!param0) {
              L2: {
                if (null == ((mf) this).field_m) {
                  break L2;
                } else {
                  if (((mf) this).field_L < var3) {
                    ((mf) this).field_u = -1;
                    ((mf) this).field_G = ((mf) this).field_L;
                    ((mf) this).field_E = ((mf) this).field_H.c(((mf) this).field_G);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              return;
            } else {
              return;
            }
          } else {
            L3: while (true) {
              L4: {
                if (var3 != ((mf) this).field_H.field_h[var2]) {
                  break L4;
                } else {
                  ((mf) this).field_H.d(var2);
                  var6 = ((mf) this).field_H.e(var2);
                  if (var6 == 1) {
                    ((mf) this).field_H.b();
                    ((mf) this).field_H.b(var2);
                    if (((mf) this).field_H.g()) {
                      if (null == ((mf) this).field_m) {
                        L5: {
                          if (!((mf) this).field_R) {
                            break L5;
                          } else {
                            if (0 != var3) {
                              ((mf) this).field_H.a(var4);
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        this.a(128, true);
                        ((mf) this).field_H.a();
                        return;
                      } else {
                        ((mf) this).a(((mf) this).field_R, ((mf) this).field_m, true);
                        this.c(false);
                        return;
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    L6: {
                      if ((128 & var6) != 0) {
                        this.e(var6, 85);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    ((mf) this).field_H.a(var2);
                    ((mf) this).field_H.b(var2);
                    continue L3;
                  }
                }
              }
              var2 = ((mf) this).field_H.f();
              var3 = ((mf) this).field_H.field_h[var2];
              var4 = ((mf) this).field_H.c(var3);
              continue L1;
            }
          }
        }
    }

    final synchronized void a(byte param0) {
        if (param0 != 97) {
            return;
        }
        this.b(param0 ^ 225, true);
    }

    private final void f(int param0, int param1) {
        hg var3 = null;
        int var4 = 0;
        var4 = SolKnight.field_L ? 1 : 0;
        if (param0 == -32471) {
          var3 = (hg) (Object) ((mf) this).field_Q.field_m.a((byte) 51);
          L0: while (true) {
            if (var3 == null) {
              return;
            } else {
              L1: {
                L2: {
                  if (param1 < 0) {
                    break L2;
                  } else {
                    if (~param1 == ~var3.field_z) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (var3.field_k >= 0) {
                  break L1;
                } else {
                  ((mf) this).field_p[var3.field_z][var3.field_o] = null;
                  var3.field_k = 0;
                  break L1;
                }
              }
              var3 = (hg) (Object) ((mf) this).field_Q.field_m.b(-29);
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final synchronized void d(int param0, int param1, int param2) {
        if (param0 != -4474) {
            this.b(-93, -66, 21, -44);
        }
        this.b((byte) -114, param1, param2);
    }

    private final void b(int param0, int param1) {
        hg var3 = null;
        int var4 = SolKnight.field_L ? 1 : 0;
        if ((((mf) this).field_U[param1] & 4) != 0) {
            var3 = (hg) (Object) ((mf) this).field_Q.field_m.a((byte) 51);
            while (var3 != null) {
                if (!(param1 != var3.field_z)) {
                    var3.field_C = 0;
                }
                var3 = (hg) (Object) ((mf) this).field_Q.field_m.b(-123);
            }
        }
    }

    final synchronized ej b() {
        return null;
    }

    final synchronized boolean d(int param0) {
        if (param0 != 144) {
            ((mf) this).field_p = null;
        }
        return ((mf) this).field_H.d();
    }

    final synchronized void d(int param0, int param1) {
        ((mf) this).field_q = param1;
        if (param0 != 1349013231) {
            mf.f(13);
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        hg var7 = null;
        int var8 = 0;
        hg var9 = null;
        var8 = SolKnight.field_L ? 1 : 0;
        var9 = ((mf) this).field_p[param1][param0];
        if (var9 == null) {
          return;
        } else {
          L0: {
            var6 = 32 / ((58 - param3) / 60);
            ((mf) this).field_p[param1][param0] = null;
            if (0 == (((mf) this).field_U[param1] & 2)) {
              var9.field_k = 0;
              break L0;
            } else {
              var7 = (hg) (Object) ((mf) this).field_Q.field_m.a((byte) 51);
              L1: while (true) {
                if (var7 == null) {
                  break L0;
                } else {
                  L2: {
                    if (var7.field_z != var9.field_z) {
                      break L2;
                    } else {
                      if (var7.field_k >= 0) {
                        break L2;
                      } else {
                        if (var7 == var9) {
                          break L2;
                        } else {
                          var9.field_k = 0;
                          break L0;
                        }
                      }
                    }
                  }
                  var7 = (hg) (Object) ((mf) this).field_Q.field_m.b(-55);
                  continue L1;
                }
              }
            }
          }
          return;
        }
    }

    private final synchronized void b(int param0, boolean param1) {
        ((mf) this).field_H.a();
        ((mf) this).field_m = null;
        this.a(param0, param1);
        if (param0 != 128) {
            this.a((byte) 32, -51, -95);
        }
    }

    private final void c(int param0, int param1) {
        int var4 = 0;
        var4 = SolKnight.field_L ? 1 : 0;
        if (param0 >= 0) {
          ((mf) this).field_I[param0] = 12800;
          ((mf) this).field_w[param0] = 8192;
          ((mf) this).field_r[param0] = 16383;
          ((mf) this).field_N[param0] = 8192;
          ((mf) this).field_W[param0] = 0;
          if (param1 < -114) {
            ((mf) this).field_S[param0] = 8192;
            this.g(-114, param0);
            this.b(-4222, param0);
            ((mf) this).field_U[param0] = 0;
            ((mf) this).field_o[param0] = 32767;
            ((mf) this).field_t[param0] = 256;
            ((mf) this).field_z[param0] = 0;
            this.a(13127, 8192, param0);
            return;
          } else {
            return;
          }
        } else {
          param0 = 0;
          L0: while (true) {
            if (param0 >= 16) {
              return;
            } else {
              this.c(param0, -123);
              param0++;
              continue L0;
            }
          }
        }
    }

    private final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = SolKnight.field_L ? 1 : 0;
        if (param1) {
            this.a(-1, (byte) -71);
        } else {
            this.f(param0 + -32599, -1);
        }
        this.c(-1, param0 + -245);
        for (var3 = 0; var3 < 16; var3++) {
            ((mf) this).field_v[var3] = ((mf) this).field_P[var3];
        }
        if (param0 != 128) {
            ((mf) this).d(38, -126, 2);
        }
        int var5 = 0;
        var3 = var5;
        while (var5 < 16) {
            ((mf) this).field_B[var5] = fi.a(-128, ((mf) this).field_P[var5]);
            var5++;
        }
    }

    private final void c(int param0, int param1, int param2, int param3) {
        int var5 = 121;
    }

    final boolean b(hg param0, int param1) {
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
            if (null == param0.field_w) {
              L1: {
                if (param0.field_k < 0) {
                  break L1;
                } else {
                  param0.c(10);
                  if (param0.field_m <= 0) {
                    break L1;
                  } else {
                    if (((mf) this).field_O[param0.field_z][param0.field_m] == param0) {
                      ((mf) this).field_O[param0.field_z][param0.field_m] = null;
                      break L1;
                    } else {
                      return true;
                    }
                  }
                }
              }
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            } else {
              if (param1 == -1642423728) {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                return stackIn_11_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("mf.PA(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 41);
        }
        return stackIn_13_0 != 0;
    }

    private final synchronized void a(int param0, boolean param1, boolean param2, rl param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = SolKnight.field_L ? 1 : 0;
        try {
            if (param0 <= 85) {
                field_A = 42;
            }
            this.b(128, param1);
            ((mf) this).field_H.a(param3.field_i);
            ((mf) this).field_s = 0L;
            ((mf) this).field_R = param2 ? true : false;
            var5_int = ((mf) this).field_H.e();
            for (var6 = 0; var6 < var5_int; var6++) {
                ((mf) this).field_H.d(var6);
                ((mf) this).field_H.a(var6);
                ((mf) this).field_H.b(var6);
            }
            ((mf) this).field_u = ((mf) this).field_H.f();
            ((mf) this).field_G = ((mf) this).field_H.field_h[((mf) this).field_u];
            ((mf) this).field_E = ((mf) this).field_H.c(((mf) this).field_G);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "mf.FA(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final synchronized void a(boolean param0, rl param1, boolean param2) {
        try {
            this.a(113, param2, param0, param1);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "mf.V(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final synchronized ej a() {
        return (ej) (Object) ((mf) this).field_Q;
    }

    private final int a(hg param0) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        g var9 = null;
        g var10 = null;
        int stackIn_2_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            if (((mf) this).field_D[param0.field_z] != 0) {
              L1: {
                var9 = param0.field_D;
                var10 = var9;
                var4 = ((mf) this).field_I[param0.field_z] * ((mf) this).field_r[param0.field_z] - -4096 >> 13;
                var4 = var4 * var4 + 16384 >> 15;
                var4 = param0.field_i * var4 - -16384 >> 15;
                var4 = 128 + ((mf) this).field_q * var4 >> 8;
                var4 = var4 * ((mf) this).field_D[param0.field_z] + 128 >> 8;
                if (var10.field_c <= 0) {
                  break L1;
                } else {
                  var4 = (int)((double)var4 * Math.pow(0.5, (double)param0.field_v * 0.00001953125 * (double)var10.field_c) + 0.5);
                  break L1;
                }
              }
              L2: {
                if (var10.field_j != null) {
                  L3: {
                    var5 = param0.field_j;
                    var6 = var10.field_j[1 + param0.field_s];
                    if (param0.field_s >= -2 + var10.field_j.length) {
                      break L3;
                    } else {
                      var7 = 65280 & var9.field_j[param0.field_s] << 8;
                      var8 = 65280 & var10.field_j[param0.field_s + 2] << 8;
                      var6 = var6 + (-var6 + var10.field_j[3 + param0.field_s]) * (var5 - var7) / (-var7 + var8);
                      break L3;
                    }
                  }
                  var4 = var4 * var6 + 32 >> 6;
                  break L2;
                } else {
                  break L2;
                }
              }
              L4: {
                if (0 >= param0.field_k) {
                  break L4;
                } else {
                  if (var10.field_i != null) {
                    L5: {
                      var5 = param0.field_k;
                      var6 = var10.field_i[param0.field_A + 1];
                      if (param0.field_A >= -2 + var10.field_i.length) {
                        break L5;
                      } else {
                        var7 = var9.field_i[param0.field_A] << 8 & 65280;
                        var8 = (var10.field_i[param0.field_A + 2] & 255) << 8;
                        var6 = var6 + (-var6 + var10.field_i[3 + param0.field_A]) * (var5 - var7) / (var8 - var7);
                        break L5;
                      }
                    }
                    var4 = var4 * var6 + 32 >> 6;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              stackOut_16_0 = var4;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3;
            stackOut_18_1 = new StringBuilder().append("mf.J(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + -70 + 41);
        }
        return stackIn_17_0;
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = SolKnight.field_L ? 1 : 0;
          if (((mf) this).field_H.d()) {
            var2 = ((mf) this).field_H.field_c * ((mf) this).field_M / gj.field_s;
            L1: while (true) {
              L2: {
                var3 = (long)param0 * (long)var2 + ((mf) this).field_s;
                if (((mf) this).field_E + -var3 >= 0L) {
                  ((mf) this).field_s = var3;
                  break L2;
                } else {
                  var5 = (int)((((mf) this).field_E + -((mf) this).field_s - (-(long)var2 + 1L)) / (long)var2);
                  ((mf) this).field_s = ((mf) this).field_s + (long)var5 * (long)var2;
                  ((mf) this).field_Q.a(var5);
                  param0 = param0 - var5;
                  this.c(false);
                  if (!((mf) this).field_H.d()) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              ((mf) this).field_Q.a(param0);
              break L0;
            }
          } else {
            ((mf) this).field_Q.a(param0);
            break L0;
          }
        }
    }

    final synchronized int d() {
        return 0;
    }

    public mf() {
        ((mf) this).field_T = new int[16];
        ((mf) this).field_z = new int[16];
        ((mf) this).field_r = new int[16];
        ((mf) this).field_W = new int[16];
        ((mf) this).field_U = new int[16];
        ((mf) this).field_S = new int[16];
        ((mf) this).field_O = new hg[16][128];
        ((mf) this).field_N = new int[16];
        ((mf) this).field_B = new int[16];
        ((mf) this).field_I = new int[16];
        ((mf) this).field_o = new int[16];
        ((mf) this).field_M = 1000000;
        ((mf) this).field_t = new int[16];
        ((mf) this).field_w = new int[16];
        ((mf) this).field_J = new int[16];
        ((mf) this).field_P = new int[16];
        ((mf) this).field_v = new int[16];
        ((mf) this).field_p = new hg[16][128];
        ((mf) this).field_D = new int[16];
        ((mf) this).field_q = 256;
        ((mf) this).field_H = new oi();
        ((mf) this).field_Q = new lh((mf) this);
        ((mf) this).field_C = new qd(128);
        ((mf) this).b(256, -1, -129);
        this.a(128, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Play free version";
        field_A = 0;
        field_x = "OK";
        field_K = "Score";
        field_n = "Create a free account to start using this feature";
        field_y = new String[]{"SCATTER ROCKETS", "GUIDED MISSILES", "TORPEDOES", "RAIL GUN", "PULSE LASER", "PLASMA BOLT", "FUSION BEAM"};
        field_F = "Go Back";
    }
}
