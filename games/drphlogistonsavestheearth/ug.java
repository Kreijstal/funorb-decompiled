/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ug extends ic {
    private int[] field_n;
    private rl field_R;
    private int[] field_z;
    private cc[][] field_s;
    private int[] field_q;
    int[] field_C;
    private int[] field_F;
    int[] field_E;
    private int[] field_y;
    private int[] field_u;
    private tg field_O;
    private int[] field_U;
    private int[] field_r;
    static Random field_m;
    static boolean field_x;
    private int field_S;
    static String field_T;
    static v field_I;
    private int[] field_Q;
    int[] field_B;
    private int[] field_t;
    private int[] field_D;
    private int[] field_A;
    static String field_p;
    private cc[][] field_G;
    private int[] field_o;
    private int field_M;
    private boolean field_w;
    private int field_v;
    private long field_P;
    private long field_J;
    private am field_H;
    private int field_N;
    private ok field_K;
    private int field_L;
    private boolean field_l;

    final boolean a(int param0, cc param1) {
        RuntimeException var3 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
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
            if (param1.field_D == null) {
              if (param1.field_k >= 0) {
                L1: {
                  param1.a(-16175);
                  if (param1.field_z <= 0) {
                    break L1;
                  } else {
                    if (((ug) this).field_G[param1.field_u][param1.field_z] == param1) {
                      ((ug) this).field_G[param1.field_u][param1.field_z] = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                return true;
              }
            } else {
              if (param0 <= -102) {
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                stackOut_11_0 = 1;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("ug.H(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_14_0 != 0;
    }

    private final int b(cc param0) {
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
            var3_int = ((ug) this).field_y[param0.field_u];
            if (var3_int >= 8192) {
              stackOut_3_0 = 16384 - ((-param0.field_v + 128) * (-var3_int + 16384) + 32 >> 6);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = param0.field_v * var3_int + 32 >> 6;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ug.K(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          throw ie.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + -16385 + ')');
        }
        return stackIn_4_0;
    }

    final synchronized ic a() {
        return (ic) (Object) ((ug) this).field_H;
    }

    final boolean a(int param0, int[] param1, int param2, cc param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        ri var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_10_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_63_0 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              param3.field_l = id.field_d / 100;
              if (param3.field_k < 0) {
                break L1;
              } else {
                L2: {
                  if (null == param3.field_D) {
                    break L2;
                  } else {
                    if (param3.field_D.m()) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  param3.d(param2 ^ 9);
                  param3.a(-16175);
                  if (param3.field_z <= 0) {
                    break L3;
                  } else {
                    if (param3 == ((ug) this).field_G[param3.field_u][param3.field_z]) {
                      ((ug) this).field_G[param3.field_u][param3.field_z] = null;
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
              var6_int = param3.field_x;
              if (var6_int <= 0) {
                break L4;
              } else {
                L5: {
                  var6_int = var6_int - (int)(0.5 + 16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)((ug) this).field_D[param3.field_u]));
                  if (var6_int < 0) {
                    var6_int = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                param3.field_x = var6_int;
                break L4;
              }
            }
            L6: {
              param3.field_D.h(this.b(950080514, param3));
              var7 = param3.field_q;
              var8 = 0;
              param3.field_j = param3.field_j + var7.field_k;
              param3.field_A = param3.field_A + 1;
              var9 = 0.000005086263020833333 * (double)((param3.field_F + -60 << 8) - -(param3.field_x * param3.field_s >> 12));
              if (var7.field_i > 0) {
                L7: {
                  if (0 < var7.field_j) {
                    param3.field_m = param3.field_m + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_j) * 128.0);
                    break L7;
                  } else {
                    param3.field_m = param3.field_m + 128;
                    break L7;
                  }
                }
                if (819200 > param3.field_m * var7.field_i) {
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
              if (null == var7.field_a) {
                break L8;
              } else {
                L9: {
                  if (var7.field_n <= 0) {
                    param3.field_E = param3.field_E + 128;
                    break L9;
                  } else {
                    param3.field_E = param3.field_E + (int)(Math.pow(2.0, var9 * (double)var7.field_n) * 128.0 + 0.5);
                    break L9;
                  }
                }
                L10: while (true) {
                  L11: {
                    if (param3.field_n >= -2 + var7.field_a.length) {
                      break L11;
                    } else {
                      if (~(65280 & var7.field_a[param3.field_n - -2] << 8) <= ~param3.field_E) {
                        break L11;
                      } else {
                        param3.field_n = param3.field_n + 2;
                        continue L10;
                      }
                    }
                  }
                  if (var7.field_a.length - 2 != param3.field_n) {
                    break L8;
                  } else {
                    if (var7.field_a[1 + param3.field_n] != 0) {
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
              if (param3.field_k < 0) {
                break L12;
              } else {
                if (null == var7.field_m) {
                  break L12;
                } else {
                  if ((1 & ((ug) this).field_C[param3.field_u]) != 0) {
                    break L12;
                  } else {
                    L13: {
                      if (param3.field_z < 0) {
                        break L13;
                      } else {
                        if (param3 != ((ug) this).field_G[param3.field_u][param3.field_z]) {
                          break L13;
                        } else {
                          break L12;
                        }
                      }
                    }
                    L14: {
                      if (0 < var7.field_g) {
                        param3.field_k = param3.field_k + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_g) * 128.0);
                        break L14;
                      } else {
                        param3.field_k = param3.field_k + 128;
                        break L14;
                      }
                    }
                    L15: while (true) {
                      L16: {
                        if (~(-2 + var7.field_m.length) >= ~param3.field_r) {
                          break L16;
                        } else {
                          if (~((255 & var7.field_m[param3.field_r - -2]) << 8) <= ~param3.field_k) {
                            break L16;
                          } else {
                            param3.field_r = param3.field_r + 2;
                            continue L15;
                          }
                        }
                      }
                      if (param3.field_r != var7.field_m.length + -2) {
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
                param3.field_D.k(param3.field_l);
                if (param1 != null) {
                  param3.field_D.b(param1, param0, param4);
                  break L17;
                } else {
                  param3.field_D.d(param4);
                  break L17;
                }
              }
              L18: {
                if (!param3.field_D.g()) {
                  break L18;
                } else {
                  ((ug) this).field_H.field_r.a((ic) (Object) param3.field_D);
                  break L18;
                }
              }
              L19: {
                param3.d(-101);
                if (0 <= param3.field_k) {
                  param3.a(-16175);
                  if (param3.field_z <= 0) {
                    break L19;
                  } else {
                    if (param3 == ((ug) this).field_G[param3.field_u][param3.field_z]) {
                      ((ug) this).field_G[param3.field_u][param3.field_z] = null;
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
              return stackIn_61_0 != 0;
            } else {
              int discarded$2 = 15;
              int discarded$3 = -16385;
              param3.field_D.a(param3.field_l, this.a(param3), this.b(param3));
              if (param2 == -128) {
                stackOut_65_0 = 0;
                stackIn_66_0 = stackOut_65_0;
                break L0;
              } else {
                stackOut_63_0 = 0;
                stackIn_64_0 = stackOut_63_0;
                return stackIn_64_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var6 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var6;
            stackOut_67_1 = new StringBuilder().append("ug.PA(").append(param0).append(',');
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param1 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L20;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L20;
            }
          }
          L21: {
            stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param2).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param3 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L21;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L21;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_73_0, stackIn_73_2 + ',' + param4 + ')');
        }
        return stackIn_66_0 != 0;
    }

    private final void c(int param0, int param1) {
        cc var3 = null;
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!((((ug) this).field_C[param0] & 2) == 0)) {
            var3 = (cc) (Object) ((ug) this).field_H.field_q.h(-11151);
            while (var3 != null) {
                if (~var3.field_u == ~param0) {
                    if (((ug) this).field_s[param0][var3.field_F] == null) {
                        if (!(0 <= var3.field_k)) {
                            var3.field_k = 0;
                        }
                    }
                }
                var3 = (cc) (Object) ((ug) this).field_H.field_q.e(0);
            }
        }
    }

    private final synchronized void a(boolean param0, int param1) {
        ((ug) this).field_R.a();
        if (param1 > -113) {
            return;
        }
        ((ug) this).field_K = null;
        this.a(false, param0);
    }

    final static boolean a(int param0, char param1) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          L1: {
            L2: {
              if (param1 < 65) {
                break L2;
              } else {
                if (90 >= param1) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (97 > param1) {
                break L3;
              } else {
                if (param1 > 122) {
                  break L3;
                } else {
                  break L1;
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L0;
        }
        return stackIn_8_0 != 0;
    }

    private final int b(int param0, cc param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ri var4 = null;
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
              var3_int = param1.field_h - -(param1.field_x * param1.field_s >> 12);
              var3_int = var3_int + ((-8192 + ((ug) this).field_A[param1.field_u]) * ((ug) this).field_z[param1.field_u] >> 12);
              var4 = param1.field_q;
              if (0 >= var4.field_k) {
                break L1;
              } else {
                L2: {
                  if (var4.field_l > 0) {
                    break L2;
                  } else {
                    if (((ug) this).field_q[param1.field_u] > 0) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  var5 = var4.field_l << 2;
                  var6 = var4.field_p << 1;
                  if (var6 > param1.field_A) {
                    var5 = param1.field_A * var5 / var6;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var5 = var5 + (((ug) this).field_q[param1.field_u] >> 7);
                var7 = Math.sin(0.01227184630308513 * (double)(511 & param1.field_j));
                var3_int = var3_int + (int)((double)var5 * var7);
                break L1;
              }
            }
            var5 = (int)((double)(256 * param1.field_C.field_j) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)id.field_d + 0.5);
            if (param0 == 950080514) {
              L4: {
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
              break L0;
            } else {
              stackOut_9_0 = -20;
              stackIn_10_0 = stackOut_9_0;
              return stackIn_10_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("ug.E(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_14_0;
    }

    final void a(cc param0, boolean param1, byte param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
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
              L2: {
                var4_int = -66 % ((param2 - 41) / 36);
                var5 = param0.field_C.field_i.length;
                if (!param1) {
                  break L2;
                } else {
                  if (!param0.field_C.field_m) {
                    break L2;
                  } else {
                    L3: {
                      var7 = var5 + var5 + -param0.field_C.field_k;
                      var6 = (int)((long)((ug) this).field_E[param0.field_u] * (long)var7 >> 6);
                      var5 = var5 << 8;
                      if (~var6 > ~var5) {
                        break L3;
                      } else {
                        var6 = -var6 + -1 + (var5 - -var5);
                        param0.field_D.a(true);
                        break L3;
                      }
                    }
                    break L1;
                  }
                }
              }
              var6 = (int)((long)((ug) this).field_E[param0.field_u] * (long)var5 >> 6);
              break L1;
            }
            param0.field_D.g(var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("ug.J(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, nh[] param2, int param3) {
        try {
            if (param3 != 37) {
                Object var5 = null;
                vc discarded$0 = ug.a((String) null, -50);
            }
            cb.field_a = new gk(param2);
            df.field_h = param0;
            di.field_d = param1;
            int discarded$1 = -1321745375;
            nl.d();
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "ug.KA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final synchronized int d() {
        return 0;
    }

    final synchronized boolean e(int param0) {
        if (param0 != 16) {
            ((ug) this).field_y = null;
        }
        return ((ug) this).field_R.g();
    }

    private final void b(int param0, int param1) {
        cc var3 = null;
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!((4 & ((ug) this).field_C[param0]) == 0)) {
            var3 = (cc) (Object) ((ug) this).field_H.field_q.h(-11151);
            while (var3 != null) {
                if (!(var3.field_u != param0)) {
                    var3.field_i = 0;
                }
                var3 = (cc) (Object) ((ug) this).field_H.field_q.e(0);
            }
        }
    }

    private final void a(int param0, boolean param1) {
        cc var3 = null;
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var3 = (cc) (Object) ((ug) this).field_H.field_q.h(-11151);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              L2: {
                if (param0 < 0) {
                  break L2;
                } else {
                  if (~var3.field_u != ~param0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3.field_k >= 0) {
                break L1;
              } else {
                ((ug) this).field_s[var3.field_u][var3.field_F] = null;
                var3.field_k = 0;
                break L1;
              }
            }
            var3 = (cc) (Object) ((ug) this).field_H.field_q.e(0);
            continue L0;
          }
        }
    }

    private final void a(int param0, boolean param1, int param2) {
    }

    private final void a(int param0, int param1) {
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (0 <= param1) {
          ((ug) this).field_u[param1] = 12800;
          ((ug) this).field_y[param1] = 8192;
          ((ug) this).field_o[param1] = 16383;
          ((ug) this).field_A[param1] = 8192;
          ((ug) this).field_q[param1] = 0;
          ((ug) this).field_D[param1] = 8192;
          this.c(param1, -16596);
          this.b(param1, 6798);
          ((ug) this).field_C[param1] = 0;
          ((ug) this).field_n[param1] = 32767;
          ((ug) this).field_z[param1] = 256;
          ((ug) this).field_E[param1] = 0;
          this.b(8192, -1, param1);
          return;
        } else {
          param1 = 0;
          L0: while (true) {
            if (16 <= param1) {
              return;
            } else {
              this.a(12800, param1);
              param1++;
              continue L0;
            }
          }
        }
    }

    private final synchronized void a(boolean param0, boolean param1, ok param2) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
            this.a(param0, -115);
            ((ug) this).field_R.a(param2.field_h);
            ((ug) this).field_w = param1 ? true : false;
            ((ug) this).field_J = 0L;
            var5_int = ((ug) this).field_R.c();
            for (var6 = 0; ~var6 > ~var5_int; var6++) {
                ((ug) this).field_R.f(var6);
                ((ug) this).field_R.e(var6);
                ((ug) this).field_R.c(var6);
            }
            ((ug) this).field_N = ((ug) this).field_R.d();
            ((ug) this).field_v = ((ug) this).field_R.field_h[((ug) this).field_N];
            ((ug) this).field_P = ((ug) this).field_R.d(((ug) this).field_v);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "ug.SA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + -1 + ')');
        }
    }

    final static vc a(String param0, int param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        vc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        vc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                var3 = null;
                ug.a(14, 3, (nh[]) null, -32);
                break L1;
              }
            }
            stackOut_2_0 = new vc(param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("ug.F(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    private final void g() {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var2 = ((ug) this).field_N;
          var3 = ((ug) this).field_v;
          var4 = ((ug) this).field_P;
          if (null == ((ug) this).field_K) {
            break L0;
          } else {
            if (((ug) this).field_L != var3) {
              break L0;
            } else {
              int discarded$3 = -1;
              this.a(((ug) this).field_l, ((ug) this).field_w, ((ug) this).field_K);
              int discarded$4 = 32675;
              this.g();
              return;
            }
          }
        }
        L1: while (true) {
          if (var3 != ((ug) this).field_v) {
            L2: {
              ((ug) this).field_P = var4;
              ((ug) this).field_N = var2;
              ((ug) this).field_v = var3;
              if (((ug) this).field_K == null) {
                break L2;
              } else {
                if (((ug) this).field_L < var3) {
                  ((ug) this).field_N = -1;
                  ((ug) this).field_v = ((ug) this).field_L;
                  ((ug) this).field_P = ((ug) this).field_R.d(((ug) this).field_v);
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
                if (((ug) this).field_R.field_h[var2] != var3) {
                  break L4;
                } else {
                  ((ug) this).field_R.f(var2);
                  var6 = ((ug) this).field_R.b(var2);
                  if (1 == var6) {
                    ((ug) this).field_R.b();
                    ((ug) this).field_R.c(var2);
                    if (((ug) this).field_R.e()) {
                      if (null != ((ug) this).field_K) {
                        ((ug) this).a(((ug) this).field_K, ((ug) this).field_w, (byte) 120);
                        int discarded$5 = 32675;
                        this.g();
                        return;
                      } else {
                        L5: {
                          if (!((ug) this).field_w) {
                            break L5;
                          } else {
                            if (var3 != 0) {
                              ((ug) this).field_R.a(var4);
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        this.a(false, true);
                        ((ug) this).field_R.a();
                        return;
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    L6: {
                      if (0 != (128 & var6)) {
                        this.d(var6, 32696);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    ((ug) this).field_R.e(var2);
                    ((ug) this).field_R.c(var2);
                    continue L3;
                  }
                }
              }
              var2 = ((ug) this).field_R.d();
              var3 = ((ug) this).field_R.field_h[var2];
              var4 = ((ug) this).field_R.d(var3);
              continue L1;
            }
          }
        }
    }

    private final void d(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var3 = param0 & 240;
        if (var3 == 128) {
          var4 = 15 & param0;
          var5 = (param0 & 32538) >> 8;
          var6 = (param0 & 8379937) >> 16;
          this.a((byte) 91, var5, var4, var6);
          return;
        } else {
          L0: {
            if (var3 == 144) {
              var4 = param0 & 15;
              var5 = (32547 & param0) >> 8;
              var6 = (8346333 & param0) >> 16;
              if (0 < var6) {
                this.b((byte) 15, var6, var5, var4);
                return;
              } else {
                this.a((byte) 91, var5, var4, 64);
                break L0;
              }
            } else {
              if (var3 != 160) {
                if (176 == var3) {
                  L1: {
                    var4 = param0 & 15;
                    var5 = (param0 & 32675) >> 8;
                    var6 = (8325095 & param0) >> 16;
                    if (var5 != 0) {
                      break L1;
                    } else {
                      ((ug) this).field_t[var4] = rk.a(((ug) this).field_t[var4], -2080769) + (var6 << 14);
                      break L1;
                    }
                  }
                  L2: {
                    if (var5 != 32) {
                      break L2;
                    } else {
                      ((ug) this).field_t[var4] = (var6 << 7) + rk.a(-16257, ((ug) this).field_t[var4]);
                      break L2;
                    }
                  }
                  L3: {
                    if (var5 != 1) {
                      break L3;
                    } else {
                      ((ug) this).field_q[var4] = (var6 << 7) + rk.a(((ug) this).field_q[var4], -16257);
                      break L3;
                    }
                  }
                  L4: {
                    if (var5 != 33) {
                      break L4;
                    } else {
                      ((ug) this).field_q[var4] = rk.a(-128, ((ug) this).field_q[var4]) + var6;
                      break L4;
                    }
                  }
                  L5: {
                    if (var5 != 5) {
                      break L5;
                    } else {
                      ((ug) this).field_D[var4] = rk.a(((ug) this).field_D[var4], -16257) + (var6 << 7);
                      break L5;
                    }
                  }
                  L6: {
                    if (var5 != 37) {
                      break L6;
                    } else {
                      ((ug) this).field_D[var4] = rk.a(((ug) this).field_D[var4], -128) - -var6;
                      break L6;
                    }
                  }
                  L7: {
                    if (7 == var5) {
                      ((ug) this).field_u[var4] = (var6 << 7) + rk.a(((ug) this).field_u[var4], -16257);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (var5 == 39) {
                      ((ug) this).field_u[var4] = rk.a(((ug) this).field_u[var4], -128) + var6;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (var5 != 10) {
                      break L9;
                    } else {
                      ((ug) this).field_y[var4] = rk.a(-16257, ((ug) this).field_y[var4]) + (var6 << 7);
                      break L9;
                    }
                  }
                  L10: {
                    if (var5 == 42) {
                      ((ug) this).field_y[var4] = var6 + rk.a(((ug) this).field_y[var4], -128);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (var5 != 11) {
                      break L11;
                    } else {
                      ((ug) this).field_o[var4] = rk.a(-16257, ((ug) this).field_o[var4]) + (var6 << 7);
                      break L11;
                    }
                  }
                  L12: {
                    if (var5 == 43) {
                      ((ug) this).field_o[var4] = var6 + rk.a(-128, ((ug) this).field_o[var4]);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (64 != var5) {
                      break L13;
                    } else {
                      if (var6 >= 64) {
                        ((ug) this).field_C[var4] = li.a(((ug) this).field_C[var4], 1);
                        break L13;
                      } else {
                        ((ug) this).field_C[var4] = rk.a(((ug) this).field_C[var4], -2);
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (var5 != 65) {
                      break L14;
                    } else {
                      if (var6 >= 64) {
                        ((ug) this).field_C[var4] = li.a(((ug) this).field_C[var4], 2);
                        break L14;
                      } else {
                        this.c(var4, -16596);
                        ((ug) this).field_C[var4] = rk.a(((ug) this).field_C[var4], -3);
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if (99 != var5) {
                      break L15;
                    } else {
                      ((ug) this).field_n[var4] = rk.a(127, ((ug) this).field_n[var4]) - -(var6 << 7);
                      break L15;
                    }
                  }
                  L16: {
                    if (98 == var5) {
                      ((ug) this).field_n[var4] = rk.a(16256, ((ug) this).field_n[var4]) + var6;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (var5 != 101) {
                      break L17;
                    } else {
                      ((ug) this).field_n[var4] = rk.a(((ug) this).field_n[var4], 127) + 16384 + (var6 << 7);
                      break L17;
                    }
                  }
                  L18: {
                    if (var5 == 100) {
                      ((ug) this).field_n[var4] = rk.a(16256, ((ug) this).field_n[var4]) + (16384 + var6);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (var5 == 120) {
                      this.b(var4, (byte) 6);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (var5 != 121) {
                      break L20;
                    } else {
                      this.a(12800, var4);
                      break L20;
                    }
                  }
                  L21: {
                    if (123 == var5) {
                      this.a(var4, true);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (var5 == 6) {
                      var7 = ((ug) this).field_n[var4];
                      if (16384 == var7) {
                        ((ug) this).field_z[var4] = rk.a(((ug) this).field_z[var4], -16257) - -(var6 << 7);
                        break L22;
                      } else {
                        break L22;
                      }
                    } else {
                      break L22;
                    }
                  }
                  L23: {
                    if (var5 != 38) {
                      break L23;
                    } else {
                      var7 = ((ug) this).field_n[var4];
                      if (var7 == 16384) {
                        ((ug) this).field_z[var4] = rk.a(-128, ((ug) this).field_z[var4]) + var6;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L24: {
                    if (var5 == 16) {
                      ((ug) this).field_E[var4] = (var6 << 7) + rk.a(((ug) this).field_E[var4], -16257);
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (var5 == 48) {
                      ((ug) this).field_E[var4] = var6 + rk.a(-128, ((ug) this).field_E[var4]);
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (var5 != 81) {
                      break L26;
                    } else {
                      if (64 > var6) {
                        this.b(var4, 6798);
                        ((ug) this).field_C[var4] = rk.a(((ug) this).field_C[var4], -5);
                        break L26;
                      } else {
                        ((ug) this).field_C[var4] = li.a(((ug) this).field_C[var4], 4);
                        break L26;
                      }
                    }
                  }
                  L27: {
                    if (var5 == 17) {
                      this.b((-16257 & ((ug) this).field_U[var4]) - -(var6 << 7), -1, var4);
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  if (49 != var5) {
                    break L0;
                  } else {
                    this.b((-128 & ((ug) this).field_U[var4]) - -var6, -1, var4);
                    return;
                  }
                } else {
                  if (var3 == 192) {
                    var4 = param0 & 15;
                    var5 = (param0 & 32596) >> 8;
                    this.c(((ug) this).field_t[var4] + var5, 0, var4);
                    return;
                  } else {
                    if (var3 != 208) {
                      if (var3 == 224) {
                        var4 = param0 & 15;
                        var5 = (param0 >> 8 & 127) + ((8323499 & param0) >> 9);
                        int discarded$1 = -128;
                        this.e(var4, var5);
                        return;
                      } else {
                        var3 = param0 & 255;
                        if (255 == var3) {
                          this.a(false, true);
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      var4 = 15 & param0;
                      var5 = (param0 & 32689) >> 8;
                      this.a(var5, false, var4);
                      return;
                    }
                  }
                }
              } else {
                var4 = 15 & param0;
                var5 = 127 & param0 >> 8;
                var6 = (8334836 & param0) >> 16;
                this.a(var6, 511, var5, var4);
                return;
              }
            }
          }
          return;
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
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
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (!((ug) this).field_R.g()) {
                  break L2;
                } else {
                  var4_int = ((ug) this).field_R.field_i * ((ug) this).field_M / id.field_d;
                  L3: while (true) {
                    var5 = ((ug) this).field_J - -((long)param2 * (long)var4_int);
                    if (-var5 + ((ug) this).field_P >= 0L) {
                      ((ug) this).field_J = var5;
                      break L2;
                    } else {
                      var7 = (int)((-1L + ((long)var4_int + (((ug) this).field_P - ((ug) this).field_J))) / (long)var4_int);
                      ((ug) this).field_J = ((ug) this).field_J + (long)var7 * (long)var4_int;
                      ((ug) this).field_H.b(param0, param1, var7);
                      param2 = param2 - var7;
                      param1 = param1 + var7;
                      int discarded$1 = 32675;
                      this.g();
                      if (((ug) this).field_R.g()) {
                        continue L3;
                      } else {
                        ((ug) this).field_H.b(param0, param1, param2);
                        break L1;
                      }
                    }
                  }
                }
              }
              ((ug) this).field_H.b(param0, param1, param2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("ug.A(");
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
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized ic c() {
        return null;
    }

    private final void b(int param0, byte param1) {
        cc var3 = null;
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var3 = (cc) (Object) ((ug) this).field_H.field_q.h(-11151);
        if (param1 >= 3) {
          L0: while (true) {
            if (var3 == null) {
              return;
            } else {
              L1: {
                L2: {
                  if (param0 < 0) {
                    break L2;
                  } else {
                    if (~var3.field_u == ~param0) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  if (var3.field_D != null) {
                    L4: {
                      var3.field_D.k(id.field_d / 100);
                      if (!var3.field_D.g()) {
                        break L4;
                      } else {
                        ((ug) this).field_H.field_r.a((ic) (Object) var3.field_D);
                        break L4;
                      }
                    }
                    var3.d(-79);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L5: {
                  if (var3.field_k < 0) {
                    ((ug) this).field_s[var3.field_u][var3.field_F] = null;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var3.a(-16175);
                break L1;
              }
              var3 = (cc) (Object) ((ug) this).field_H.field_q.e(0);
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final synchronized void b(byte param0) {
        int var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        ig var2 = (ig) (Object) ((ug) this).field_O.b(-1);
        while (var2 != null) {
            var2.d(param0 ^ 107);
            var2 = (ig) (Object) ((ug) this).field_O.a((byte) -114);
        }
        if (param0 != 47) {
            Object var4 = null;
            int discarded$0 = this.b(-122, (cc) null);
        }
    }

    private final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!param1) {
            this.a(-1, true);
        } else {
            this.b(-1, (byte) 21);
        }
        this.a(12800, -1);
        for (var3 = 0; var3 < 16; var3++) {
            ((ug) this).field_r[var3] = ((ug) this).field_F[var3];
        }
        field_T = null;
        int var5 = 0;
        var3 = var5;
        while (var5 < 16) {
            ((ug) this).field_t[var5] = rk.a(((ug) this).field_F[var5], -128);
            var5++;
        }
    }

    final static int f() {
        return rd.field_z;
    }

    final synchronized void a(byte param0) {
        this.a(true, -122);
        if (param0 >= -86) {
            ((ug) this).field_G = null;
        }
    }

    private final void a(int param0, int param1, int param2) {
        ((ug) this).field_F[param0] = param2;
        ((ug) this).field_t[param0] = rk.a(-128, param2);
        this.c(param2, 0, param0);
        if (param1 != 26818) {
            ((ug) this).field_J = 40L;
        }
    }

    private final void e(int param0, int param1) {
        ((ug) this).field_A[param0] = param1;
    }

    private final int a(cc param0) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ri var9 = null;
        ri var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
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
            if (((ug) this).field_Q[param0.field_u] == 0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                var9 = param0.field_q;
                var10 = var9;
                var4 = ((ug) this).field_u[param0.field_u] * ((ug) this).field_o[param0.field_u] + 4096 >> 13;
                var4 = var4 * var4 - -16384 >> 15;
                var4 = param0.field_t * var4 - -16384 >> 15;
                var4 = 128 + var4 * ((ug) this).field_S >> 8;
                var4 = var4 * ((ug) this).field_Q[param0.field_u] + 128 >> 8;
                if (var10.field_i > 0) {
                  var4 = (int)(Math.pow(0.5, (double)var10.field_i * (0.00001953125 * (double)param0.field_m)) * (double)var4 + 0.5);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var10.field_a == null) {
                  break L2;
                } else {
                  L3: {
                    var5 = param0.field_E;
                    var6 = var10.field_a[param0.field_n + 1];
                    if (param0.field_n >= -2 + var10.field_a.length) {
                      break L3;
                    } else {
                      var7 = (255 & var9.field_a[param0.field_n]) << 8;
                      var8 = (255 & var10.field_a[param0.field_n - -2]) << 8;
                      var6 = var6 + (-var7 + var5) * (-var6 + var10.field_a[param0.field_n - -3]) / (-var7 + var8);
                      break L3;
                    }
                  }
                  var4 = var6 * var4 + 32 >> 6;
                  break L2;
                }
              }
              L4: {
                if (param0.field_k <= 0) {
                  break L4;
                } else {
                  if (var10.field_m != null) {
                    L5: {
                      var5 = param0.field_k;
                      var6 = var10.field_m[1 + param0.field_r];
                      if (param0.field_r < var10.field_m.length - 2) {
                        var7 = (var9.field_m[param0.field_r] & 255) << 8;
                        var8 = (255 & var10.field_m[param0.field_r + 2]) << 8;
                        var6 = var6 + (-var7 + var5) * (var10.field_m[param0.field_r - -3] + -var6) / (-var7 + var8);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var4 = var6 * var4 - -32 >> 6;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              stackOut_18_0 = var4;
              stackIn_19_0 = stackOut_18_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("ug.L(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + 15 + ')');
        }
        return stackIn_19_0;
    }

    final synchronized void d(int param0, int param1, int param2) {
        this.a(param0, 26818, param1);
        int var4 = 19 / ((70 - param2) / 34);
    }

    private final void b(int param0, int param1, int param2) {
        ((ug) this).field_U[param2] = param0;
        ((ug) this).field_B[param2] = (int)(2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param0) + 0.5);
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param1 != 511) {
            this.a(89, -46, -107);
        }
    }

    final synchronized void d(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            if (((ug) this).field_R.g()) {
              var2 = ((ug) this).field_R.field_i * ((ug) this).field_M / id.field_d;
              L2: while (true) {
                var3 = (long)var2 * (long)param0 + ((ug) this).field_J;
                if (-var3 + ((ug) this).field_P < 0L) {
                  var5 = (int)((-1L + ((long)var2 + (((ug) this).field_P - ((ug) this).field_J))) / (long)var2);
                  ((ug) this).field_J = ((ug) this).field_J + (long)var2 * (long)var5;
                  ((ug) this).field_H.d(var5);
                  param0 = param0 - var5;
                  int discarded$41 = 32675;
                  this.g();
                  if (((ug) this).field_R.g()) {
                    continue L2;
                  } else {
                    ((ug) this).field_H.d(param0);
                    break L0;
                  }
                } else {
                  ((ug) this).field_J = var3;
                  break L1;
                }
              }
            } else {
              break L1;
            }
          }
          ((ug) this).field_H.d(param0);
          break L0;
        }
    }

    final synchronized void a(ok param0, boolean param1, byte param2) {
        if (param2 <= 77) {
            return;
        }
        try {
            int discarded$0 = -1;
            this.a(true, param1, param0);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "ug.T(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        cc var6 = null;
        int var7 = 0;
        cc var8 = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var8 = ((ug) this).field_s[param2][param1];
        if (var8 != null) {
          L0: {
            ((ug) this).field_s[param2][param1] = null;
            if ((2 & ((ug) this).field_C[param2]) == 0) {
              var8.field_k = 0;
              break L0;
            } else {
              var6 = (cc) (Object) ((ug) this).field_H.field_q.h(-11151);
              L1: while (true) {
                if (var6 == null) {
                  break L0;
                } else {
                  L2: {
                    if (var8.field_u != var6.field_u) {
                      break L2;
                    } else {
                      if (var6.field_k >= 0) {
                        break L2;
                      } else {
                        if (var6 == var8) {
                          break L2;
                        } else {
                          var8.field_k = 0;
                          break L0;
                        }
                      }
                    }
                  }
                  var6 = (cc) (Object) ((ug) this).field_H.field_q.e(0);
                  continue L1;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void b(byte param0, int param1, int param2, int param3) {
        cc var5 = null;
        vk var6 = null;
        int var6_int = 0;
        cc var7 = null;
        cc var8 = null;
        int var9 = 0;
        ig var10 = null;
        ig var11 = null;
        Object stackIn_15_0 = null;
        cc stackIn_15_1 = null;
        Object stackIn_16_0 = null;
        cc stackIn_16_1 = null;
        Object stackIn_17_0 = null;
        cc stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        Object stackOut_14_0 = null;
        cc stackOut_14_1 = null;
        Object stackOut_16_0 = null;
        cc stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        Object stackOut_15_0 = null;
        cc stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        L0: {
          var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          this.a((byte) 91, param2, param3, 64);
          if ((((ug) this).field_C[param3] & 2) == 0) {
            break L0;
          } else {
            var5 = (cc) (Object) ((ug) this).field_H.field_q.b(2850);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (param3 != var5.field_u) {
                    break L2;
                  } else {
                    if (0 <= var5.field_k) {
                      break L2;
                    } else {
                      ((ug) this).field_s[param3][var5.field_F] = null;
                      ((ug) this).field_s[param3][param2] = var5;
                      var6_int = var5.field_h + (var5.field_s * var5.field_x >> 12);
                      var5.field_h = var5.field_h + (param2 + -var5.field_F << 8);
                      var5.field_F = param2;
                      var5.field_x = 4096;
                      var5.field_s = -var5.field_h + var6_int;
                      return;
                    }
                  }
                }
                var5 = (cc) (Object) ((ug) this).field_H.field_q.c(-113);
                continue L1;
              }
            }
          }
        }
        var10 = (ig) (Object) ((ug) this).field_O.a(true, (long)((ug) this).field_r[param3]);
        var11 = var10;
        if (var11 == null) {
          return;
        } else {
          var6 = var10.field_j[param2];
          if (var6 != null) {
            L3: {
              var7 = new cc();
              var7.field_u = param3;
              var7.field_C = var6;
              var7.field_o = var11;
              var7.field_q = var10.field_q[param2];
              var7.field_z = var10.field_n[param2];
              var7.field_F = param2;
              var7.field_t = 1024 + var11.field_l * (param1 * param1 * var10.field_m[param2]) >> 11;
              var7.field_v = 255 & var10.field_s[param2];
              var7.field_h = -(var10.field_p[param2] & 32767) + (param2 << 8);
              var7.field_r = 0;
              var7.field_k = -1;
              var7.field_n = 0;
              var7.field_E = 0;
              var7.field_m = 0;
              if (((ug) this).field_E[param3] != 0) {
                L4: {
                  int discarded$3 = -16385;
                  var7.field_D = ag.b(var6, this.b(950080514, var7), 0, this.b(var7));
                  stackOut_14_0 = this;
                  stackOut_14_1 = (cc) var7;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  if (var11.field_p[param2] >= 0) {
                    stackOut_16_0 = this;
                    stackOut_16_1 = (cc) (Object) stackIn_16_1;
                    stackOut_16_2 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    break L4;
                  } else {
                    stackOut_15_0 = this;
                    stackOut_15_1 = (cc) (Object) stackIn_15_1;
                    stackOut_15_2 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_17_2 = stackOut_15_2;
                    break L4;
                  }
                }
                ((ug) this).a(stackIn_17_1, stackIn_17_2 != 0, (byte) 101);
                break L3;
              } else {
                int discarded$4 = 15;
                int discarded$5 = -16385;
                var7.field_D = ag.b(var6, this.b(950080514, var7), this.a(var7), this.b(var7));
                break L3;
              }
            }
            L5: {
              if (var11.field_p[param2] < 0) {
                var7.field_D.f(-1);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (var7.field_z < 0) {
                break L6;
              } else {
                L7: {
                  var8 = ((ug) this).field_G[param3][var7.field_z];
                  if (var8 == null) {
                    break L7;
                  } else {
                    if (0 > var8.field_k) {
                      ((ug) this).field_s[param3][var8.field_F] = null;
                      var8.field_k = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                ((ug) this).field_G[param3][var7.field_z] = var7;
                break L6;
              }
            }
            ((ug) this).field_H.field_q.a((gi) (Object) var7, 255);
            ((ug) this).field_s[param3][param2] = var7;
            return;
          } else {
            return;
          }
        }
    }

    private final void c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!(param0 == ((ug) this).field_r[param2])) {
            ((ug) this).field_r[param2] = param0;
            for (var4 = 0; 128 > var4; var4++) {
                ((ug) this).field_G[param2][var4] = null;
            }
        }
        field_I = null;
    }

    private final synchronized void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        for (var4 = 0; 16 > var4; var4++) {
            ((ug) this).field_Q[var4] = 256;
        }
    }

    final synchronized boolean a(int param0, vj param1, int param2, ok param3, cf param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        ga var8 = null;
        int var9 = 0;
        ig var10 = null;
        int var11 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              param3.a();
              var6_int = 1;
              var7 = null;
              if (param2 < param0) {
                var7 = (Object) (Object) new int[]{param0};
                break L1;
              } else {
                break L1;
              }
            }
            var8 = (ga) (Object) param3.field_i.b(-1);
            L2: while (true) {
              if (var8 == null) {
                L3: {
                  if (var6_int != 0) {
                    param3.b();
                    break L3;
                  } else {
                    break L3;
                  }
                }
                stackOut_18_0 = var6_int;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                L4: {
                  L5: {
                    var9 = (int)var8.field_g;
                    var10 = (ig) (Object) ((ug) this).field_O.a(true, (long)var9);
                    if (var10 != null) {
                      break L5;
                    } else {
                      var10 = u.a(param1, 0, var9);
                      if (var10 == null) {
                        var6_int = 0;
                        break L4;
                      } else {
                        ((ug) this).field_O.a((gi) (Object) var10, (long)var9, -1);
                        break L5;
                      }
                    }
                  }
                  if (!var10.a((int[]) var7, 103, param4, var8.field_h)) {
                    var6_int = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var8 = (ga) (Object) param3.field_i.a((byte) -114);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("ug.NA(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          L7: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param4 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final synchronized void a(int param0, byte param1) {
        if (param1 != -13) {
            this.a(22, -65, -100, -116);
        }
        ((ug) this).field_S = param0;
    }

    final static sa[] c(byte param0) {
        return new sa[]{oh.field_c, ei.field_n, cd.field_c, pi.field_N, vb.field_q, qj.field_b, db.field_d, b.field_i, wd.field_d, sc.field_d, cm.field_P, lb.field_z, bc.field_a, vj.field_d};
    }

    public static void h(int param0) {
        field_T = null;
        field_p = null;
        if (param0 != -921185753) {
            ug.h(38);
        }
        field_I = null;
        field_m = null;
    }

    public ug() {
        ((ug) this).field_n = new int[16];
        ((ug) this).field_z = new int[16];
        ((ug) this).field_C = new int[16];
        ((ug) this).field_F = new int[16];
        ((ug) this).field_u = new int[16];
        ((ug) this).field_q = new int[16];
        ((ug) this).field_U = new int[16];
        ((ug) this).field_y = new int[16];
        ((ug) this).field_E = new int[16];
        ((ug) this).field_S = 256;
        ((ug) this).field_B = new int[16];
        ((ug) this).field_t = new int[16];
        ((ug) this).field_r = new int[16];
        ((ug) this).field_s = new cc[16][128];
        ((ug) this).field_D = new int[16];
        ((ug) this).field_A = new int[16];
        ((ug) this).field_Q = new int[16];
        ((ug) this).field_G = new cc[16][128];
        ((ug) this).field_o = new int[16];
        ((ug) this).field_M = 1000000;
        ((ug) this).field_R = new rl();
        ((ug) this).field_H = new am((ug) this);
        ((ug) this).field_O = new tg(128);
        this.a(-1, (byte) 70, 256);
        this.a(false, true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new Random(2684L);
        field_x = false;
        field_p = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_T = "Checking";
    }
}
