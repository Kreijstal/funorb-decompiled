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
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            if (param1.field_D == null) {
              L1: {
                if (param1.field_k >= 0) {
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
                } else {
                  break L1;
                }
              }
              stackOut_13_0 = 1;
              stackIn_14_0 = stackOut_13_0;
              return stackIn_14_0 != 0;
            } else {
              if (param0 <= -102) {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_16_0 = 1;
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("ug.H(").append(param0).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L2;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
        return stackIn_19_0 != 0;
    }

    private final int b(cc param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -16385) {
                break L1;
              } else {
                ((ug) this).field_N = -115;
                break L1;
              }
            }
            var3_int = ((ug) this).field_y[param0.field_u];
            if (var3_int >= 8192) {
              stackOut_6_0 = 16384 - ((-param0.field_v + 128) * (-var3_int + 16384) + 32 >> -1253764250);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = param0.field_v * var3_int + 32 >> 1559270726;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ug.K(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final synchronized ic a() {
        RuntimeException var1 = null;
        am stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        am stackOut_0_0 = null;
        try {
          L0: {
            stackOut_0_0 = ((ug) this).field_H;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var1, "ug.G()");
        }
        return (ic) (Object) stackIn_1_0;
    }

    final boolean a(int param0, int[] param1, int param2, cc param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        ri var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_18_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        int stackIn_114_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_119_0 = 0;
        RuntimeException stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        RuntimeException stackIn_124_0 = null;
        StringBuilder stackIn_124_1 = null;
        String stackIn_124_2 = null;
        RuntimeException stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        String stackIn_128_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_81_0 = 0;
        int stackOut_81_1 = 0;
        int stackOut_88_0 = 0;
        int stackOut_88_1 = 0;
        int stackOut_113_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_116_0 = 0;
        RuntimeException stackOut_120_0 = null;
        StringBuilder stackOut_120_1 = null;
        RuntimeException stackOut_123_0 = null;
        StringBuilder stackOut_123_1 = null;
        String stackOut_123_2 = null;
        RuntimeException stackOut_121_0 = null;
        StringBuilder stackOut_121_1 = null;
        String stackOut_121_2 = null;
        RuntimeException stackOut_124_0 = null;
        StringBuilder stackOut_124_1 = null;
        RuntimeException stackOut_127_0 = null;
        StringBuilder stackOut_127_1 = null;
        String stackOut_127_2 = null;
        RuntimeException stackOut_125_0 = null;
        StringBuilder stackOut_125_1 = null;
        String stackOut_125_2 = null;
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
                      break L3;
                    }
                  }
                }
                stackOut_17_0 = 1;
                stackIn_18_0 = stackOut_17_0;
                return stackIn_18_0 != 0;
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
              var9 = 0.000005086263020833333 * (double)((param3.field_F + -60 << 1355350408) - -(param3.field_x * param3.field_s >> 1018383116));
              if (var7.field_i > 0) {
                L7: {
                  L8: {
                    if (0 < var7.field_j) {
                      break L8;
                    } else {
                      param3.field_m = param3.field_m + 128;
                      if (var11 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  param3.field_m = param3.field_m + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_j) * 128.0);
                  break L7;
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
            L9: {
              if (null == var7.field_a) {
                break L9;
              } else {
                L10: {
                  L11: {
                    if (var7.field_n <= 0) {
                      break L11;
                    } else {
                      param3.field_E = param3.field_E + (int)(Math.pow(2.0, var9 * (double)var7.field_n) * 128.0 + 0.5);
                      if (var11 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  param3.field_E = param3.field_E + 128;
                  break L10;
                }
                L12: while (true) {
                  L13: {
                    L14: {
                      if (param3.field_n >= -2 + var7.field_a.length) {
                        break L14;
                      } else {
                        stackOut_46_0 = ~(65280 & var7.field_a[param3.field_n - -2] << -2142853176);
                        stackOut_46_1 = ~param3.field_E;
                        stackIn_54_0 = stackOut_46_0;
                        stackIn_54_1 = stackOut_46_1;
                        stackIn_47_0 = stackOut_46_0;
                        stackIn_47_1 = stackOut_46_1;
                        if (var11 != 0) {
                          break L13;
                        } else {
                          if (stackIn_47_0 <= stackIn_47_1) {
                            break L14;
                          } else {
                            param3.field_n = param3.field_n + 2;
                            if (var11 == 0) {
                              continue L12;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                    }
                    stackOut_53_0 = var7.field_a.length - 2;
                    stackOut_53_1 = param3.field_n;
                    stackIn_54_0 = stackOut_53_0;
                    stackIn_54_1 = stackOut_53_1;
                    break L13;
                  }
                  if (stackIn_54_0 != stackIn_54_1) {
                    break L9;
                  } else {
                    if (var7.field_a[1 + param3.field_n] != 0) {
                      break L9;
                    } else {
                      var8 = 1;
                      break L9;
                    }
                  }
                }
              }
            }
            L15: {
              if (param3.field_k < 0) {
                break L15;
              } else {
                if (null == var7.field_m) {
                  break L15;
                } else {
                  if ((1 & ((ug) this).field_C[param3.field_u]) != 0) {
                    break L15;
                  } else {
                    L16: {
                      if (param3.field_z < 0) {
                        break L16;
                      } else {
                        if (param3 != ((ug) this).field_G[param3.field_u][param3.field_z]) {
                          break L16;
                        } else {
                          break L15;
                        }
                      }
                    }
                    L17: {
                      L18: {
                        if (0 < var7.field_g) {
                          break L18;
                        } else {
                          param3.field_k = param3.field_k + 128;
                          if (var11 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      param3.field_k = param3.field_k + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_g) * 128.0);
                      break L17;
                    }
                    L19: while (true) {
                      L20: {
                        L21: {
                          if (~(-2 + var7.field_m.length) >= ~param3.field_r) {
                            break L21;
                          } else {
                            stackOut_81_0 = ~((255 & var7.field_m[param3.field_r - -2]) << 284446664);
                            stackOut_81_1 = ~param3.field_k;
                            stackIn_89_0 = stackOut_81_0;
                            stackIn_89_1 = stackOut_81_1;
                            stackIn_82_0 = stackOut_81_0;
                            stackIn_82_1 = stackOut_81_1;
                            if (var11 != 0) {
                              break L20;
                            } else {
                              if (stackIn_82_0 <= stackIn_82_1) {
                                break L21;
                              } else {
                                param3.field_r = param3.field_r + 2;
                                if (var11 == 0) {
                                  continue L19;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                        }
                        stackOut_88_0 = param3.field_r;
                        stackOut_88_1 = var7.field_m.length + -2;
                        stackIn_89_0 = stackOut_88_0;
                        stackIn_89_1 = stackOut_88_1;
                        break L20;
                      }
                      if (stackIn_89_0 != stackIn_89_1) {
                        break L15;
                      } else {
                        var8 = 1;
                        break L15;
                      }
                    }
                  }
                }
              }
            }
            if (var8 != 0) {
              L22: {
                L23: {
                  param3.field_D.k(param3.field_l);
                  if (param1 != null) {
                    break L23;
                  } else {
                    param3.field_D.d(param4);
                    if (var11 == 0) {
                      break L22;
                    } else {
                      break L23;
                    }
                  }
                }
                param3.field_D.b(param1, param0, param4);
                break L22;
              }
              L24: {
                if (!param3.field_D.g()) {
                  break L24;
                } else {
                  ((ug) this).field_H.field_r.a((ic) (Object) param3.field_D);
                  break L24;
                }
              }
              L25: {
                param3.d(-101);
                if (0 <= param3.field_k) {
                  param3.a(-16175);
                  if (param3.field_z <= 0) {
                    break L25;
                  } else {
                    if (param3 == ((ug) this).field_G[param3.field_u][param3.field_z]) {
                      ((ug) this).field_G[param3.field_u][param3.field_z] = null;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                } else {
                  break L25;
                }
              }
              stackOut_113_0 = 1;
              stackIn_114_0 = stackOut_113_0;
              return stackIn_114_0 != 0;
            } else {
              param3.field_D.a(param3.field_l, this.a(param3, 15), this.b(param3, -16385));
              if (param2 == -128) {
                stackOut_118_0 = 0;
                stackIn_119_0 = stackOut_118_0;
                break L0;
              } else {
                stackOut_116_0 = 0;
                stackIn_117_0 = stackOut_116_0;
                return stackIn_117_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var6 = decompiledCaughtException;
            stackOut_120_0 = (RuntimeException) var6;
            stackOut_120_1 = new StringBuilder().append("ug.PA(").append(param0).append(',');
            stackIn_123_0 = stackOut_120_0;
            stackIn_123_1 = stackOut_120_1;
            stackIn_121_0 = stackOut_120_0;
            stackIn_121_1 = stackOut_120_1;
            if (param1 == null) {
              stackOut_123_0 = (RuntimeException) (Object) stackIn_123_0;
              stackOut_123_1 = (StringBuilder) (Object) stackIn_123_1;
              stackOut_123_2 = "null";
              stackIn_124_0 = stackOut_123_0;
              stackIn_124_1 = stackOut_123_1;
              stackIn_124_2 = stackOut_123_2;
              break L26;
            } else {
              stackOut_121_0 = (RuntimeException) (Object) stackIn_121_0;
              stackOut_121_1 = (StringBuilder) (Object) stackIn_121_1;
              stackOut_121_2 = "{...}";
              stackIn_124_0 = stackOut_121_0;
              stackIn_124_1 = stackOut_121_1;
              stackIn_124_2 = stackOut_121_2;
              break L26;
            }
          }
          L27: {
            stackOut_124_0 = (RuntimeException) (Object) stackIn_124_0;
            stackOut_124_1 = ((StringBuilder) (Object) stackIn_124_1).append(stackIn_124_2).append(',').append(param2).append(',');
            stackIn_127_0 = stackOut_124_0;
            stackIn_127_1 = stackOut_124_1;
            stackIn_125_0 = stackOut_124_0;
            stackIn_125_1 = stackOut_124_1;
            if (param3 == null) {
              stackOut_127_0 = (RuntimeException) (Object) stackIn_127_0;
              stackOut_127_1 = (StringBuilder) (Object) stackIn_127_1;
              stackOut_127_2 = "null";
              stackIn_128_0 = stackOut_127_0;
              stackIn_128_1 = stackOut_127_1;
              stackIn_128_2 = stackOut_127_2;
              break L27;
            } else {
              stackOut_125_0 = (RuntimeException) (Object) stackIn_125_0;
              stackOut_125_1 = (StringBuilder) (Object) stackIn_125_1;
              stackOut_125_2 = "{...}";
              stackIn_128_0 = stackOut_125_0;
              stackIn_128_1 = stackOut_125_1;
              stackIn_128_2 = stackOut_125_2;
              break L27;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_128_0, stackIn_128_2 + ',' + param4 + ')');
        }
        return stackIn_119_0 != 0;
    }

    private final void c(int param0, int param1) {
        RuntimeException var3 = null;
        cc var3_ref = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -16596) {
                break L1;
              } else {
                ((ug) this).d(-16);
                break L1;
              }
            }
            L2: {
              L3: {
                if ((((ug) this).field_C[param0] & 2) != 0) {
                  var3_ref = (cc) (Object) ((ug) this).field_H.field_q.h(param1 + 5445);
                  L4: while (true) {
                    if (var3_ref == null) {
                      break L3;
                    } else {
                      if (var4 != 0) {
                        break L2;
                      } else {
                        L5: {
                          if (~var3_ref.field_u != ~param0) {
                            break L5;
                          } else {
                            if (((ug) this).field_s[param0][var3_ref.field_F] != null) {
                              break L5;
                            } else {
                              if (0 > var3_ref.field_k) {
                                var3_ref.field_k = 0;
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var3_ref = (cc) (Object) ((ug) this).field_H.field_q.e(0);
                        if (var4 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var3, "ug.U(" + param0 + ',' + param1 + ')');
        }
    }

    private final synchronized void a(boolean param0, int param1) {
        ((ug) this).field_R.a();
        if (param1 > -113) {
            return;
        }
        try {
            ((ug) this).field_K = null;
            this.a(false, param0);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "ug.QA(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0, char param1) {
        RuntimeException var2 = null;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                field_T = null;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (param1 < 65) {
                    break L4;
                  } else {
                    if (90 >= param1) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (97 > param1) {
                    break L5;
                  } else {
                    if (param1 > 122) {
                      break L5;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L2;
              }
              stackOut_13_0 = 1;
              stackIn_16_0 = stackOut_13_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "ug.HA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_16_0 != 0;
    }

    private final int b(int param0, cc param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ri var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              var3_int = param1.field_h - -(param1.field_x * param1.field_s >> -1205029204);
              var3_int = var3_int + ((-8192 + ((ug) this).field_A[param1.field_u]) * ((ug) this).field_z[param1.field_u] >> 1526397996);
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
                  var5 = var4.field_l << 950080514;
                  var6 = var4.field_p << -2011433279;
                  if (var6 > param1.field_A) {
                    var5 = param1.field_A * var5 / var6;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var5 = var5 + (((ug) this).field_q[param1.field_u] >> -1503747161);
                var7 = Math.sin(0.01227184630308513 * (double)(511 & param1.field_j));
                var3_int = var3_int + (int)((double)var5 * var7);
                break L1;
              }
            }
            var5 = (int)((double)(256 * param1.field_C.field_j) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)id.field_d + 0.5);
            if (param0 == 950080514) {
              L4: {
                if (var5 < 1) {
                  stackOut_20_0 = 1;
                  stackIn_21_0 = stackOut_20_0;
                  break L4;
                } else {
                  stackOut_18_0 = var5;
                  stackIn_21_0 = stackOut_18_0;
                  break L4;
                }
              }
              break L0;
            } else {
              stackOut_15_0 = -20;
              stackIn_16_0 = stackOut_15_0;
              return stackIn_16_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("ug.E(").append(param0).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L5;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
        return stackIn_21_0;
    }

    final void a(cc param0, boolean param1, byte param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
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
                      var6 = (int)((long)((ug) this).field_E[param0.field_u] * (long)var7 >> 1467533830);
                      var5 = var5 << 8;
                      if (~var6 > ~var5) {
                        break L3;
                      } else {
                        var6 = -var6 + -1 + (var5 - -var5);
                        param0.field_D.a(true);
                        break L3;
                      }
                    }
                    if (!DrPhlogistonSavesTheEarth.field_D) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var6 = (int)((long)((ug) this).field_E[param0.field_u] * (long)var5 >> -1159370938);
              break L1;
            }
            param0.field_D.g(var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("ug.J(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, nh[] param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param3 == 37) {
                break L1;
              } else {
                vc discarded$2 = ug.a((String) null, -50);
                break L1;
              }
            }
            cb.field_a = new gk(param2);
            df.field_h = param0;
            di.field_d = param1;
            nl.d(-1321745375);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("ug.KA(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param3 + ')');
        }
    }

    final synchronized int d() {
        RuntimeException var1 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            stackOut_0_0 = 0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var1, "ug.S()");
        }
        return stackIn_1_0;
    }

    final synchronized boolean e(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0 == 16) {
                break L1;
              } else {
                ((ug) this).field_y = null;
                break L1;
              }
            }
            stackOut_3_0 = ((ug) this).field_R.g();
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "ug.V(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final void b(int param0, int param1) {
        RuntimeException var3 = null;
        cc var3_ref = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if ((4 & ((ug) this).field_C[param0]) != 0) {
                  var3_ref = (cc) (Object) ((ug) this).field_H.field_q.h(param1 ^ -12545);
                  L3: while (true) {
                    if (var3_ref == null) {
                      break L2;
                    } else {
                      stackOut_6_0 = var3_ref.field_u;
                      stackOut_6_1 = param0;
                      stackIn_14_0 = stackOut_6_0;
                      stackIn_14_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var4 != 0) {
                        break L1;
                      } else {
                        L4: {
                          if (stackIn_7_0 == stackIn_7_1) {
                            var3_ref.field_i = 0;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var3_ref = (cc) (Object) ((ug) this).field_H.field_q.e(0);
                        if (var4 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              stackOut_13_0 = param1;
              stackOut_13_1 = 6798;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              break L1;
            }
            L5: {
              if (stackIn_14_0 == stackIn_14_1) {
                break L5;
              } else {
                ((ug) this).field_w = true;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var3, "ug.EA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, boolean param1) {
        RuntimeException runtimeException = null;
        cc var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        boolean stackOut_16_0 = false;
        int stackOut_16_1 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var3 = (cc) (Object) ((ug) this).field_H.field_q.h(-11151);
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = ~param0;
                    stackOut_3_1 = -1;
                    stackIn_17_0 = stackOut_3_0;
                    stackIn_17_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0 > stackIn_4_1) {
                            break L5;
                          } else {
                            if (~var3.field_u != ~param0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        if (var3.field_k >= 0) {
                          break L4;
                        } else {
                          ((ug) this).field_s[var3.field_u][var3.field_F] = null;
                          var3.field_k = 0;
                          break L4;
                        }
                      }
                      var3 = (cc) (Object) ((ug) this).field_H.field_q.e(0);
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_16_0 = param1;
                stackOut_16_1 = 1;
                stackIn_17_0 = stackOut_16_0 ? 1 : 0;
                stackIn_17_1 = stackOut_16_1;
                break L2;
              }
              L6: {
                if (stackIn_17_0 == stackIn_17_1) {
                  break L6;
                } else {
                  this.c(-123, 19);
                  break L6;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ie.a((Throwable) (Object) runtimeException, "ug.AA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        try {
            if (param1) {
                ((ug) this).field_S = 17;
            }
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "ug.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1) {
        RuntimeException runtimeException = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (0 <= param1) {
              ((ug) this).field_u[param1] = param0;
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
              break L0;
            } else {
              param1 = 0;
              L1: while (true) {
                L2: {
                  if (16 <= param1) {
                    break L2;
                  } else {
                    this.a(12800, param1);
                    param1++;
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ie.a((Throwable) (Object) runtimeException, "ug.JA(" + param0 + ',' + param1 + ')');
        }
    }

    private final synchronized void a(boolean param0, boolean param1, ok param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              this.a(param0, -115);
              ((ug) this).field_R.a(param2.field_h);
              ((ug) this).field_w = param1;
              ((ug) this).field_J = 0L;
              var5_int = ((ug) this).field_R.c();
              if (param3 == -1) {
                break L1;
              } else {
                this.b(42, 33);
                break L1;
              }
            }
            var6 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~var6 <= ~var5_int) {
                    break L4;
                  } else {
                    ((ug) this).field_R.f(var6);
                    ((ug) this).field_R.e(var6);
                    ((ug) this).field_R.c(var6);
                    var6++;
                    if (var7 != 0) {
                      break L3;
                    } else {
                      if (var7 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                ((ug) this).field_N = ((ug) this).field_R.d();
                ((ug) this).field_v = ((ug) this).field_R.field_h[((ug) this).field_N];
                ((ug) this).field_P = ((ug) this).field_R.d(((ug) this).field_v);
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("ug.SA(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L5;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param3 + ')');
        }
    }

    final static vc a(String param0, int param1) {
        RuntimeException var2 = null;
        vc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        vc stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                ug.a(14, 3, (nh[]) null, -32);
                break L1;
              }
            }
            stackOut_3_0 = new vc(param0);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("ug.F(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    private final void g(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = ((ug) this).field_N;
              var3 = ((ug) this).field_v;
              var4 = ((ug) this).field_P;
              if (null == ((ug) this).field_K) {
                break L1;
              } else {
                if (((ug) this).field_L != var3) {
                  break L1;
                } else {
                  this.a(((ug) this).field_l, ((ug) this).field_w, ((ug) this).field_K, -1);
                  this.g(32675);
                  return;
                }
              }
            }
            L2: while (true) {
              stackOut_7_0 = var3;
              stackOut_7_1 = ((ug) this).field_v;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              L3: while (true) {
                L4: {
                  L5: {
                    if (stackIn_8_0 != stackIn_8_1) {
                      break L5;
                    } else {
                      L6: while (true) {
                        stackOut_9_0 = ((ug) this).field_R.field_h[var2_int];
                        stackOut_9_1 = var3;
                        stackIn_41_0 = stackOut_9_0;
                        stackIn_41_1 = stackOut_9_1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        if (var7 != 0) {
                          break L4;
                        } else {
                          L7: {
                            if (stackIn_10_0 != stackIn_10_1) {
                              break L7;
                            } else {
                              ((ug) this).field_R.f(var2_int);
                              var6 = ((ug) this).field_R.b(var2_int);
                              stackOut_11_0 = 1;
                              stackOut_11_1 = var6;
                              stackIn_8_0 = stackOut_11_0;
                              stackIn_8_1 = stackOut_11_1;
                              stackIn_12_0 = stackOut_11_0;
                              stackIn_12_1 = stackOut_11_1;
                              if (var7 != 0) {
                                continue L3;
                              } else {
                                if (stackIn_12_0 == stackIn_12_1) {
                                  L8: {
                                    ((ug) this).field_R.b();
                                    ((ug) this).field_R.c(var2_int);
                                    if (((ug) this).field_R.e()) {
                                      break L8;
                                    } else {
                                      if (var7 == 0) {
                                        break L7;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  if (null != ((ug) this).field_K) {
                                    ((ug) this).a(((ug) this).field_K, ((ug) this).field_w, (byte) 120);
                                    this.g(32675);
                                    return;
                                  } else {
                                    L9: {
                                      if (!((ug) this).field_w) {
                                        break L9;
                                      } else {
                                        if (var3 != 0) {
                                          ((ug) this).field_R.a(var4);
                                          if (var7 == 0) {
                                            break L7;
                                          } else {
                                            break L9;
                                          }
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    this.a(false, true);
                                    ((ug) this).field_R.a();
                                    return;
                                  }
                                } else {
                                  L10: {
                                    if (0 != (128 & var6)) {
                                      this.d(var6, 32696);
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                  ((ug) this).field_R.e(var2_int);
                                  ((ug) this).field_R.c(var2_int);
                                  if (var7 == 0) {
                                    continue L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          var2_int = ((ug) this).field_R.d();
                          var3 = ((ug) this).field_R.field_h[var2_int];
                          var4 = ((ug) this).field_R.d(var3);
                          if (var7 == 0) {
                            continue L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  stackOut_40_0 = param0;
                  stackOut_40_1 = 32675;
                  stackIn_41_0 = stackOut_40_0;
                  stackIn_41_1 = stackOut_40_1;
                  break L4;
                }
                L11: {
                  if (stackIn_41_0 == stackIn_41_1) {
                    break L11;
                  } else {
                    ((ug) this).field_C = null;
                    break L11;
                  }
                }
                L12: {
                  ((ug) this).field_P = var4;
                  ((ug) this).field_N = var2_int;
                  ((ug) this).field_v = var3;
                  if (((ug) this).field_K == null) {
                    break L12;
                  } else {
                    if (((ug) this).field_L < var3) {
                      ((ug) this).field_N = -1;
                      ((ug) this).field_v = ((ug) this).field_L;
                      ((ug) this).field_P = ((ug) this).field_R.d(((ug) this).field_v);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "ug.IA(" + param0 + ')');
        }
    }

    private final void d(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = param0 & 240;
              if (param1 == 32696) {
                break L1;
              } else {
                int discarded$1 = ((ug) this).d();
                break L1;
              }
            }
            if (var3_int == 128) {
              var4 = 15 & param0;
              var5 = (param0 & 32538) >> 1051707944;
              var6 = (param0 & 8379937) >> 2050059888;
              this.a((byte) 91, var5, var4, var6);
              return;
            } else {
              if (var3_int == 144) {
                L2: {
                  L3: {
                    var4 = param0 & 15;
                    var5 = (32547 & param0) >> -384649400;
                    var6 = (8346333 & param0) >> -1793331696;
                    if (0 < var6) {
                      break L3;
                    } else {
                      this.a((byte) 91, var5, var4, 64);
                      if (var8 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  this.b((byte) 15, var6, var5, var4);
                  break L2;
                }
                return;
              } else {
                if (var3_int != 160) {
                  if (176 == var3_int) {
                    L4: {
                      var4 = param0 & 15;
                      var5 = (param0 & 32675) >> 128622184;
                      var6 = (8325095 & param0) >> -903746800;
                      if (var5 != 0) {
                        break L4;
                      } else {
                        ((ug) this).field_t[var4] = rk.a(((ug) this).field_t[var4], -2080769) + (var6 << -914588946);
                        break L4;
                      }
                    }
                    L5: {
                      if (var5 != 32) {
                        break L5;
                      } else {
                        ((ug) this).field_t[var4] = (var6 << 397931911) + rk.a(-16257, ((ug) this).field_t[var4]);
                        break L5;
                      }
                    }
                    L6: {
                      if (var5 != 1) {
                        break L6;
                      } else {
                        ((ug) this).field_q[var4] = (var6 << 2071769703) + rk.a(((ug) this).field_q[var4], -16257);
                        break L6;
                      }
                    }
                    L7: {
                      if (var5 != 33) {
                        break L7;
                      } else {
                        ((ug) this).field_q[var4] = rk.a(-128, ((ug) this).field_q[var4]) + var6;
                        break L7;
                      }
                    }
                    L8: {
                      if (var5 != 5) {
                        break L8;
                      } else {
                        ((ug) this).field_D[var4] = rk.a(((ug) this).field_D[var4], -16257) + (var6 << -85585113);
                        break L8;
                      }
                    }
                    L9: {
                      if (var5 != 37) {
                        break L9;
                      } else {
                        ((ug) this).field_D[var4] = rk.a(((ug) this).field_D[var4], -128) - -var6;
                        break L9;
                      }
                    }
                    L10: {
                      if (7 == var5) {
                        ((ug) this).field_u[var4] = (var6 << -921185753) + rk.a(((ug) this).field_u[var4], -16257);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (var5 == 39) {
                        ((ug) this).field_u[var4] = rk.a(((ug) this).field_u[var4], -128) + var6;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (var5 != 10) {
                        break L12;
                      } else {
                        ((ug) this).field_y[var4] = rk.a(-16257, ((ug) this).field_y[var4]) + (var6 << -462288537);
                        break L12;
                      }
                    }
                    L13: {
                      if (var5 == 42) {
                        ((ug) this).field_y[var4] = var6 + rk.a(((ug) this).field_y[var4], -128);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      if (var5 != 11) {
                        break L14;
                      } else {
                        ((ug) this).field_o[var4] = rk.a(-16257, ((ug) this).field_o[var4]) + (var6 << 1883403879);
                        break L14;
                      }
                    }
                    L15: {
                      if (var5 == 43) {
                        ((ug) this).field_o[var4] = var6 + rk.a(-128, ((ug) this).field_o[var4]);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    L16: {
                      if (64 != var5) {
                        break L16;
                      } else {
                        L17: {
                          if (var6 >= 64) {
                            break L17;
                          } else {
                            ((ug) this).field_C[var4] = rk.a(((ug) this).field_C[var4], -2);
                            if (var8 == 0) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        ((ug) this).field_C[var4] = li.a(((ug) this).field_C[var4], 1);
                        break L16;
                      }
                    }
                    L18: {
                      if (var5 != 65) {
                        break L18;
                      } else {
                        L19: {
                          if (var6 >= 64) {
                            break L19;
                          } else {
                            this.c(var4, -16596);
                            ((ug) this).field_C[var4] = rk.a(((ug) this).field_C[var4], -3);
                            if (var8 == 0) {
                              break L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        ((ug) this).field_C[var4] = li.a(((ug) this).field_C[var4], 2);
                        break L18;
                      }
                    }
                    L20: {
                      if (99 != var5) {
                        break L20;
                      } else {
                        ((ug) this).field_n[var4] = rk.a(127, ((ug) this).field_n[var4]) - -(var6 << -1461837593);
                        break L20;
                      }
                    }
                    L21: {
                      if (98 == var5) {
                        ((ug) this).field_n[var4] = rk.a(16256, ((ug) this).field_n[var4]) + var6;
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    L22: {
                      if (var5 != 101) {
                        break L22;
                      } else {
                        ((ug) this).field_n[var4] = rk.a(((ug) this).field_n[var4], 127) + 16384 + (var6 << 1273233063);
                        break L22;
                      }
                    }
                    L23: {
                      if (var5 == 100) {
                        ((ug) this).field_n[var4] = rk.a(16256, ((ug) this).field_n[var4]) + (16384 + var6);
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      if (var5 == 120) {
                        this.b(var4, (byte) 6);
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    L25: {
                      if (var5 != 121) {
                        break L25;
                      } else {
                        this.a(param1 ^ 19896, var4);
                        break L25;
                      }
                    }
                    L26: {
                      if (123 == var5) {
                        this.a(var4, true);
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                    L27: {
                      if (var5 == 6) {
                        var7 = ((ug) this).field_n[var4];
                        if (16384 == var7) {
                          ((ug) this).field_z[var4] = rk.a(((ug) this).field_z[var4], -16257) - -(var6 << 1292980039);
                          break L27;
                        } else {
                          break L27;
                        }
                      } else {
                        break L27;
                      }
                    }
                    L28: {
                      if (var5 != 38) {
                        break L28;
                      } else {
                        var7 = ((ug) this).field_n[var4];
                        if (var7 == 16384) {
                          ((ug) this).field_z[var4] = rk.a(-128, ((ug) this).field_z[var4]) + var6;
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                    }
                    L29: {
                      if (var5 == 16) {
                        ((ug) this).field_E[var4] = (var6 << -1884177785) + rk.a(((ug) this).field_E[var4], -16257);
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                    L30: {
                      if (var5 == 48) {
                        ((ug) this).field_E[var4] = var6 + rk.a(-128, ((ug) this).field_E[var4]);
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                    L31: {
                      if (var5 != 81) {
                        break L31;
                      } else {
                        L32: {
                          if (64 > var6) {
                            break L32;
                          } else {
                            ((ug) this).field_C[var4] = li.a(((ug) this).field_C[var4], 4);
                            if (var8 == 0) {
                              break L31;
                            } else {
                              break L32;
                            }
                          }
                        }
                        this.b(var4, 6798);
                        ((ug) this).field_C[var4] = rk.a(((ug) this).field_C[var4], -5);
                        break L31;
                      }
                    }
                    L33: {
                      if (var5 == 17) {
                        this.b((-16257 & ((ug) this).field_U[var4]) - -(var6 << -1216306041), -1, var4);
                        break L33;
                      } else {
                        break L33;
                      }
                    }
                    L34: {
                      if (49 != var5) {
                        break L34;
                      } else {
                        this.b((-128 & ((ug) this).field_U[var4]) - -var6, param1 + -32697, var4);
                        break L34;
                      }
                    }
                    return;
                  } else {
                    if (var3_int == 192) {
                      var4 = param0 & 15;
                      var5 = (param0 & 32596) >> 227408264;
                      this.c(((ug) this).field_t[var4] + var5, 0, var4);
                      return;
                    } else {
                      if (var3_int != 208) {
                        if (var3_int == 224) {
                          var4 = param0 & 15;
                          var5 = (param0 >> -693096120 & 127) + ((8323499 & param0) >> 1771148233);
                          this.e(var4, var5, -128);
                          return;
                        } else {
                          var3_int = param0 & 255;
                          if (255 == var3_int) {
                            this.a(false, true);
                            decompiledRegionSelector0 = 0;
                            break L0;
                          } else {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      } else {
                        var4 = 15 & param0;
                        var5 = (param0 & 32689) >> 981493896;
                        this.a(var5, false, var4);
                        return;
                      }
                    }
                  }
                } else {
                  var4 = 15 & param0;
                  var5 = 127 & param0 >> 1520657640;
                  var6 = (8334836 & param0) >> 247998608;
                  this.a(var6, param1 ^ 32327, var5, var4);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var3, "ug.BA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((ug) this).field_R.g()) {
                break L1;
              } else {
                var4_int = ((ug) this).field_R.field_i * ((ug) this).field_M / id.field_d;
                L2: while (true) {
                  L3: {
                    var5 = ((ug) this).field_J - -((long)param2 * (long)var4_int);
                    if (-var5 + ((ug) this).field_P >= 0L) {
                      ((ug) this).field_J = var5;
                      if (var8 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    var7 = (int)((-1L + ((long)var4_int + (((ug) this).field_P - ((ug) this).field_J))) / (long)var4_int);
                    ((ug) this).field_J = ((ug) this).field_J + (long)var7 * (long)var4_int;
                    ((ug) this).field_H.b(param0, param1, var7);
                    param2 = param2 - var7;
                    param1 = param1 + var7;
                    this.g(32675);
                    if (((ug) this).field_R.g()) {
                      break L4;
                    } else {
                      if (var8 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (var8 == 0) {
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              }
            }
            ((ug) this).field_H.b(param0, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("ug.A(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L5;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized ic c() {
        RuntimeException var1 = null;
        Object stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        try {
          L0: {
            stackOut_0_0 = null;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var1, "ug.P()");
        }
        return (ic) (Object) stackIn_1_0;
    }

    private final void b(int param0, byte param1) {
        RuntimeException runtimeException = null;
        cc var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var3 = (cc) (Object) ((ug) this).field_H.field_q.h(-11151);
            if (param1 >= 3) {
              L1: while (true) {
                L2: {
                  L3: {
                    if (var3 == null) {
                      break L3;
                    } else {
                      if (var4 != 0) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            if (param0 < 0) {
                              break L5;
                            } else {
                              if (~var3.field_u == ~param0) {
                                break L5;
                              } else {
                                break L4;
                              }
                            }
                          }
                          L6: {
                            if (var3.field_D != null) {
                              L7: {
                                var3.field_D.k(id.field_d / 100);
                                if (!var3.field_D.g()) {
                                  break L7;
                                } else {
                                  ((ug) this).field_H.field_r.a((ic) (Object) var3.field_D);
                                  break L7;
                                }
                              }
                              var3.d(-79);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          L8: {
                            if (var3.field_k < 0) {
                              ((ug) this).field_s[var3.field_u][var3.field_F] = null;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var3.a(-16175);
                          break L4;
                        }
                        var3 = (cc) (Object) ((ug) this).field_H.field_q.e(0);
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ie.a((Throwable) (Object) runtimeException, "ug.RA(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized void b(byte param0) {
        RuntimeException runtimeException = null;
        ig var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var2 = (ig) (Object) ((ug) this).field_O.b(-1);
            L1: while (true) {
              L2: {
                L3: {
                  if (var2 == null) {
                    break L3;
                  } else {
                    var2.d(param0 ^ 107);
                    var2 = (ig) (Object) ((ug) this).field_O.a((byte) -114);
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == 47) {
                  break L2;
                } else {
                  int discarded$2 = this.b(-122, (cc) null);
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ie.a((Throwable) (Object) runtimeException, "ug.DA(" + param0 + ')');
        }
    }

    private final void a(boolean param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param1) {
                  break L2;
                } else {
                  this.a(-1, true);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.b(-1, (byte) 21);
              break L1;
            }
            this.a(12800, -1);
            var3_int = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (var3_int >= 16) {
                    break L5;
                  } else {
                    ((ug) this).field_r[var3_int] = ((ug) this).field_F[var3_int];
                    var3_int++;
                    if (var4 != 0) {
                      break L4;
                    } else {
                      if (var4 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                if (!param0) {
                  break L4;
                } else {
                  field_T = null;
                  break L4;
                }
              }
              var3_int = 0;
              L6: while (true) {
                L7: {
                  L8: {
                    if (var3_int >= 16) {
                      break L8;
                    } else {
                      ((ug) this).field_t[var3_int] = rk.a(((ug) this).field_F[var3_int], -128);
                      var3_int++;
                      if (var4 != 0) {
                        break L7;
                      } else {
                        if (var4 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  break L7;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var3, "ug.MA(" + param0 + ',' + param1 + ')');
        }
    }

    final static int f(int param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 > 85) {
                break L1;
              } else {
                sa[] discarded$2 = ug.c((byte) 77);
                break L1;
              }
            }
            stackOut_3_0 = rd.field_z;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var1, "ug.TA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final synchronized void a(byte param0) {
        try {
            this.a(true, -122);
            if (param0 >= -86) {
                ((ug) this).field_G = null;
            }
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "ug.M(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        try {
            ((ug) this).field_F[param0] = param2;
            ((ug) this).field_t[param0] = rk.a(-128, param2);
            this.c(param2, 0, param0);
            if (param1 != 26818) {
                ((ug) this).field_J = 40L;
            }
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "ug.GA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void e(int param0, int param1, int param2) {
        try {
            ((ug) this).field_A[param0] = param1;
            if (param2 > -125) {
                this.b(-86, -27, 1);
            }
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "ug.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(cc param0, int param1) {
        RuntimeException var3 = null;
        ri var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 15) {
                break L1;
              } else {
                ((ug) this).field_L = -99;
                break L1;
              }
            }
            if (((ug) this).field_Q[param0.field_u] == 0) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              L2: {
                var3_ref = param0.field_q;
                var4 = ((ug) this).field_u[param0.field_u] * ((ug) this).field_o[param0.field_u] + 4096 >> 218968781;
                var4 = var4 * var4 - -16384 >> 1538862607;
                var4 = param0.field_t * var4 - -16384 >> -1190063857;
                var4 = 128 + var4 * ((ug) this).field_S >> -525649208;
                var4 = var4 * ((ug) this).field_Q[param0.field_u] + 128 >> -699653272;
                if (var3_ref.field_i > 0) {
                  var4 = (int)(Math.pow(0.5, (double)var3_ref.field_i * (0.00001953125 * (double)param0.field_m)) * (double)var4 + 0.5);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var3_ref.field_a == null) {
                  break L3;
                } else {
                  L4: {
                    var5 = param0.field_E;
                    var6 = var3_ref.field_a[param0.field_n + 1];
                    if (param0.field_n >= -2 + var3_ref.field_a.length) {
                      break L4;
                    } else {
                      var7 = (255 & var3_ref.field_a[param0.field_n]) << 1437743848;
                      var8 = (255 & var3_ref.field_a[param0.field_n - -2]) << 355343176;
                      var6 = var6 + (-var7 + var5) * (-var6 + var3_ref.field_a[param0.field_n - -3]) / (-var7 + var8);
                      break L4;
                    }
                  }
                  var4 = var6 * var4 + 32 >> -1410405882;
                  break L3;
                }
              }
              L5: {
                if (param0.field_k <= 0) {
                  break L5;
                } else {
                  if (var3_ref.field_m != null) {
                    L6: {
                      var5 = param0.field_k;
                      var6 = var3_ref.field_m[1 + param0.field_r];
                      if (param0.field_r < var3_ref.field_m.length - 2) {
                        var7 = (var3_ref.field_m[param0.field_r] & 255) << -1288533720;
                        var8 = (255 & var3_ref.field_m[param0.field_r + 2]) << 1478198056;
                        var6 = var6 + (-var7 + var5) * (var3_ref.field_m[param0.field_r - -3] + -var6) / (-var7 + var8);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var4 = var6 * var4 - -32 >> 769459814;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              stackOut_27_0 = var4;
              stackIn_28_0 = stackOut_27_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var3;
            stackOut_29_1 = new StringBuilder().append("ug.L(");
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L7;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L7;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param1 + ')');
        }
        return stackIn_28_0;
    }

    final synchronized void d(int param0, int param1, int param2) {
        try {
            this.a(param0, 26818, param1);
            int var4_int = 19 / ((70 - param2) / 34);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "ug.N(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((ug) this).field_U[param2] = param0;
              if (param1 == -1) {
                break L1;
              } else {
                ((ug) this).field_S = 32;
                break L1;
              }
            }
            ((ug) this).field_B[param2] = (int)(2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param0) + 0.5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var4, "ug.LA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        try {
            if (param1 != 511) {
                this.a(89, -46, -107);
            }
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "ug.OA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void d(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (((ug) this).field_R.g()) {
                  var2_int = ((ug) this).field_R.field_i * ((ug) this).field_M / id.field_d;
                  L3: while (true) {
                    L4: {
                      var3 = (long)var2_int * (long)param0 + ((ug) this).field_J;
                      if (-var3 + ((ug) this).field_P < 0L) {
                        break L4;
                      } else {
                        ((ug) this).field_J = var3;
                        if (var6 != 0) {
                          break L1;
                        } else {
                          if (var6 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L5: {
                      var5 = (int)((-1L + ((long)var2_int + (((ug) this).field_P - ((ug) this).field_J))) / (long)var2_int);
                      ((ug) this).field_J = ((ug) this).field_J + (long)var2_int * (long)var5;
                      ((ug) this).field_H.d(var5);
                      param0 = param0 - var5;
                      this.g(32675);
                      if (((ug) this).field_R.g()) {
                        break L5;
                      } else {
                        if (var6 == 0) {
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var6 == 0) {
                      continue L3;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              }
              ((ug) this).field_H.d(param0);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "ug.CB(" + param0 + ')');
        }
    }

    final synchronized void a(ok param0, boolean param1, byte param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param2 > 77) {
              this.a(true, param1, param0, -1);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("ug.T(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        cc var5 = null;
        cc var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 91) {
                break L1;
              } else {
                this.b((byte) 92, 20, -113, -69);
                break L1;
              }
            }
            var5 = ((ug) this).field_s[param2][param1];
            if (var5 != null) {
              L2: {
                L3: {
                  ((ug) this).field_s[param2][param1] = null;
                  if ((2 & ((ug) this).field_C[param2]) == 0) {
                    break L3;
                  } else {
                    var6 = (cc) (Object) ((ug) this).field_H.field_q.h(-11151);
                    L4: while (true) {
                      L5: {
                        if (null == var6) {
                          break L5;
                        } else {
                          if (var7 != 0) {
                            break L2;
                          } else {
                            L6: {
                              if (var5.field_u != var6.field_u) {
                                break L6;
                              } else {
                                if (var6.field_k >= 0) {
                                  break L6;
                                } else {
                                  if (var6 == var5) {
                                    break L6;
                                  } else {
                                    var5.field_k = 0;
                                    if (var7 == 0) {
                                      break L5;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                            }
                            var6 = (cc) (Object) ((ug) this).field_H.field_q.e(0);
                            if (var7 == 0) {
                              continue L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      if (var7 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var5.field_k = 0;
                break L2;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ie.a((Throwable) (Object) runtimeException, "ug.R(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void b(byte param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        ig var5_ref = null;
        cc var5_ref2 = null;
        vk var6 = null;
        int var6_int = 0;
        cc var7 = null;
        cc var8 = null;
        int var9 = 0;
        Object stackIn_24_0 = null;
        cc stackIn_24_1 = null;
        Object stackIn_26_0 = null;
        cc stackIn_26_1 = null;
        Object stackIn_28_0 = null;
        cc stackIn_28_1 = null;
        Object stackIn_29_0 = null;
        cc stackIn_29_1 = null;
        int stackIn_29_2 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_23_0 = null;
        cc stackOut_23_1 = null;
        Object stackOut_28_0 = null;
        cc stackOut_28_1 = null;
        int stackOut_28_2 = 0;
        Object stackOut_24_0 = null;
        cc stackOut_24_1 = null;
        Object stackOut_26_0 = null;
        cc stackOut_26_1 = null;
        int stackOut_26_2 = 0;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              this.a((byte) 91, param2, param3, 64);
              if ((((ug) this).field_C[param3] & 2) == 0) {
                break L1;
              } else {
                var5_ref2 = (cc) (Object) ((ug) this).field_H.field_q.b(param0 ^ 2861);
                L2: while (true) {
                  if (var5_ref2 == null) {
                    break L1;
                  } else {
                    L3: {
                      if (param3 != var5_ref2.field_u) {
                        break L3;
                      } else {
                        if (0 <= var5_ref2.field_k) {
                          break L3;
                        } else {
                          ((ug) this).field_s[param3][var5_ref2.field_F] = null;
                          ((ug) this).field_s[param3][param2] = var5_ref2;
                          var6_int = var5_ref2.field_h + (var5_ref2.field_s * var5_ref2.field_x >> 888816332);
                          var5_ref2.field_h = var5_ref2.field_h + (param2 + -var5_ref2.field_F << -384632440);
                          var5_ref2.field_F = param2;
                          var5_ref2.field_x = 4096;
                          var5_ref2.field_s = -var5_ref2.field_h + var6_int;
                          return;
                        }
                      }
                    }
                    var5_ref2 = (cc) (Object) ((ug) this).field_H.field_q.c(-113);
                    if (var9 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var5_ref = (ig) (Object) ((ug) this).field_O.a(true, (long)((ug) this).field_r[param3]);
            if (null == var5_ref) {
              return;
            } else {
              var6 = var5_ref.field_j[param2];
              if (var6 != null) {
                var7 = new cc();
                var7.field_u = param3;
                var7.field_C = var6;
                var7.field_o = var5_ref;
                if (param0 == 15) {
                  L4: {
                    L5: {
                      var7.field_q = var5_ref.field_q[param2];
                      var7.field_z = var5_ref.field_n[param2];
                      var7.field_F = param2;
                      var7.field_t = 1024 + var5_ref.field_l * (param1 * param1 * var5_ref.field_m[param2]) >> 1956790987;
                      var7.field_v = 255 & var5_ref.field_s[param2];
                      var7.field_h = -(var5_ref.field_p[param2] & 32767) + (param2 << 1257163944);
                      var7.field_r = 0;
                      var7.field_k = -1;
                      var7.field_n = 0;
                      var7.field_E = 0;
                      var7.field_m = 0;
                      if (((ug) this).field_E[param3] != 0) {
                        break L5;
                      } else {
                        var7.field_D = ag.b(var6, this.b(950080514, var7), this.a(var7, 15), this.b(var7, -16385));
                        if (var9 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      var7.field_D = ag.b(var6, this.b(950080514, var7), 0, this.b(var7, -16385));
                      stackOut_23_0 = this;
                      stackOut_23_1 = (cc) var7;
                      stackIn_28_0 = stackOut_23_0;
                      stackIn_28_1 = stackOut_23_1;
                      stackIn_24_0 = stackOut_23_0;
                      stackIn_24_1 = stackOut_23_1;
                      if (var5_ref.field_p[param2] >= 0) {
                        stackOut_28_0 = this;
                        stackOut_28_1 = (cc) (Object) stackIn_28_1;
                        stackOut_28_2 = 0;
                        stackIn_29_0 = stackOut_28_0;
                        stackIn_29_1 = stackOut_28_1;
                        stackIn_29_2 = stackOut_28_2;
                        break L6;
                      } else {
                        stackOut_24_0 = this;
                        stackOut_24_1 = (cc) (Object) stackIn_24_1;
                        stackIn_26_0 = stackOut_24_0;
                        stackIn_26_1 = stackOut_24_1;
                        stackOut_26_0 = this;
                        stackOut_26_1 = (cc) (Object) stackIn_26_1;
                        stackOut_26_2 = 1;
                        stackIn_29_0 = stackOut_26_0;
                        stackIn_29_1 = stackOut_26_1;
                        stackIn_29_2 = stackOut_26_2;
                        break L6;
                      }
                    }
                    ((ug) this).a(stackIn_29_1, stackIn_29_2 != 0, (byte) 101);
                    break L4;
                  }
                  L7: {
                    if (var5_ref.field_p[param2] < 0) {
                      var7.field_D.f(-1);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (var7.field_z < 0) {
                      break L8;
                    } else {
                      L9: {
                        var8 = ((ug) this).field_G[param3][var7.field_z];
                        if (null == var8) {
                          break L9;
                        } else {
                          if (0 > var8.field_k) {
                            ((ug) this).field_s[param3][var8.field_F] = null;
                            var8.field_k = 0;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                      }
                      ((ug) this).field_G[param3][var7.field_z] = var7;
                      break L8;
                    }
                  }
                  ((ug) this).field_H.field_q.a((gi) (Object) var7, 255);
                  ((ug) this).field_s[param3][param2] = var7;
                  break L0;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var5, "ug.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void c(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param0 != ((ug) this).field_r[param2]) {
                  ((ug) this).field_r[param2] = param0;
                  var4_int = 0;
                  L3: while (true) {
                    if (128 <= var4_int) {
                      break L2;
                    } else {
                      ((ug) this).field_G[param2][var4_int] = null;
                      var4_int++;
                      if (var5 != 0) {
                        break L1;
                      } else {
                        if (var5 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              if (param1 == 0) {
                break L1;
              } else {
                field_I = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var4, "ug.W(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final synchronized void a(int param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 70) {
                break L1;
              } else {
                boolean discarded$2 = ug.a(-61, '');
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (param0 < 0) {
                    break L4;
                  } else {
                    ((ug) this).field_Q[param0] = param2;
                    if (var5 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var4_int = 0;
                L5: while (true) {
                  if (16 <= var4_int) {
                    break L3;
                  } else {
                    ((ug) this).field_Q[var4_int] = param2;
                    var4_int++;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (var5 == 0) {
                        continue L5;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var4, "ug.O(" + param0 + ',' + param1 + ',' + param2 + ')');
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
        int stackIn_27_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_26_0 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
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
              L3: {
                L4: {
                  L5: {
                    if (null == var8) {
                      break L5;
                    } else {
                      var9 = (int)var8.field_g;
                      var10 = (ig) (Object) ((ug) this).field_O.a(true, (long)var9);
                      if (var11 != 0) {
                        break L4;
                      } else {
                        L6: {
                          L7: {
                            if (null != var10) {
                              break L7;
                            } else {
                              L8: {
                                var10 = u.a(param1, 0, var9);
                                if (var10 == null) {
                                  var6_int = 0;
                                  if (var11 == 0) {
                                    break L6;
                                  } else {
                                    break L8;
                                  }
                                } else {
                                  break L8;
                                }
                              }
                              ((ug) this).field_O.a((gi) (Object) var10, (long)var9, -1);
                              break L7;
                            }
                          }
                          if (!var10.a((int[]) var7, 103, param4, var8.field_h)) {
                            var6_int = 0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var8 = (ga) (Object) param3.field_i.a((byte) -114);
                        if (var11 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (var6_int != 0) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
                param3.b();
                break L3;
              }
              stackOut_26_0 = var6_int;
              stackIn_27_0 = stackOut_26_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var6;
            stackOut_28_1 = new StringBuilder().append("ug.NA(").append(param0).append(',');
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L9;
            }
          }
          L10: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param2).append(',');
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param3 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L10;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_36_0 = stackOut_33_0;
              stackIn_36_1 = stackOut_33_1;
              stackIn_36_2 = stackOut_33_2;
              break L10;
            }
          }
          L11: {
            stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
            stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',');
            stackIn_39_0 = stackOut_36_0;
            stackIn_39_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param4 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L11;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_40_0 = stackOut_37_0;
              stackIn_40_1 = stackOut_37_1;
              stackIn_40_2 = stackOut_37_2;
              break L11;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ')');
        }
        return stackIn_27_0 != 0;
    }

    final synchronized void a(int param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -13) {
                break L1;
              } else {
                this.a(22, -65, -100, -116);
                break L1;
              }
            }
            ((ug) this).field_S = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var3, "ug.FA(" + param0 + ',' + param1 + ')');
        }
    }

    final static sa[] c(byte param0) {
        RuntimeException var1 = null;
        sa[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        sa[] stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == -23) {
                break L1;
              } else {
                field_m = null;
                break L1;
              }
            }
            stackOut_3_0 = new sa[]{oh.field_c, ei.field_n, cd.field_c, pi.field_N, vb.field_q, qj.field_b, db.field_d, b.field_i, wd.field_d, sc.field_d, cm.field_P, lb.field_z, bc.field_a, vj.field_d};
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var1, "ug.C(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    public static void h(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_T = null;
              field_p = null;
              if (param0 == -921185753) {
                break L1;
              } else {
                ug.h(38);
                break L1;
              }
            }
            field_I = null;
            field_m = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var1, "ug.CA(" + param0 + ')');
        }
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
        try {
            ((ug) this).field_O = new tg(128);
            this.a(-1, (byte) 70, 256);
            this.a(false, true);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "ug.<init>()");
        }
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
