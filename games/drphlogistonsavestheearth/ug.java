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
        int decompiledRegionSelector0 = 0;
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
                    if (this.field_G[param1.field_u][param1.field_z] == param1) {
                      this.field_G[param1.field_u][param1.field_z] = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                return true;
              }
            } else {
              if (param0 <= -102) {
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_11_0 = 1;
                stackIn_12_0 = stackOut_11_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3);
            stackOut_15_1 = new StringBuilder().append("ug.H(").append(param0).append(',');
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
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    private final int b(cc param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
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
              if (param1 == -16385) {
                break L1;
              } else {
                this.field_N = -115;
                break L1;
              }
            }
            var3_int = this.field_y[param0.field_u];
            if (-8193 >= (var3_int ^ -1)) {
              stackOut_5_0 = 16384 - ((-param0.field_v + 128) * (-var3_int + 16384) + 32 >> -1253764250);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = param0.field_v * var3_int + 32 >> 1559270726;
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
            stackOut_7_1 = new StringBuilder().append("ug.K(");
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
          throw ie.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final synchronized ic a() {
        return (ic) ((Object) this.field_H);
    }

    final boolean a(int param0, int[] param1, int param2, cc param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        ri var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_10_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_76_0 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_70_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_73_0 = 0;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
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
                  if (-1 <= (param3.field_z ^ -1)) {
                    break L3;
                  } else {
                    if (param3 == this.field_G[param3.field_u][param3.field_z]) {
                      this.field_G[param3.field_u][param3.field_z] = null;
                      break L3;
                    } else {
                      return true;
                    }
                  }
                }
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L4: {
              var6_int = param3.field_x;
              if (var6_int <= 0) {
                break L4;
              } else {
                L5: {
                  var6_int = var6_int - (int)(0.5 + 16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)this.field_D[param3.field_u]));
                  if ((var6_int ^ -1) > -1) {
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
                        stackOut_30_0 = 65280 & var7.field_a[param3.field_n - -2] << -2142853176 ^ -1;
                        stackOut_30_1 = param3.field_E ^ -1;
                        stackIn_35_0 = stackOut_30_0;
                        stackIn_35_1 = stackOut_30_1;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        if (var11 != 0) {
                          break L13;
                        } else {
                          if (stackIn_31_0 <= stackIn_31_1) {
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
                    stackOut_34_0 = var7.field_a.length - 2;
                    stackOut_34_1 = param3.field_n;
                    stackIn_35_0 = stackOut_34_0;
                    stackIn_35_1 = stackOut_34_1;
                    break L13;
                  }
                  if (stackIn_35_0 != stackIn_35_1) {
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
                  if ((1 & this.field_C[param3.field_u]) != 0) {
                    break L15;
                  } else {
                    L16: {
                      if (-1 < (param3.field_z ^ -1)) {
                        break L16;
                      } else {
                        if (param3 != this.field_G[param3.field_u][param3.field_z]) {
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
                          if ((-2 + var7.field_m.length ^ -1) >= (param3.field_r ^ -1)) {
                            break L21;
                          } else {
                            stackOut_49_0 = (255 & var7.field_m[param3.field_r - -2]) << 284446664 ^ -1;
                            stackOut_49_1 = param3.field_k ^ -1;
                            stackIn_54_0 = stackOut_49_0;
                            stackIn_54_1 = stackOut_49_1;
                            stackIn_50_0 = stackOut_49_0;
                            stackIn_50_1 = stackOut_49_1;
                            if (var11 != 0) {
                              break L20;
                            } else {
                              if (stackIn_50_0 <= stackIn_50_1) {
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
                        stackOut_53_0 = param3.field_r;
                        stackOut_53_1 = var7.field_m.length + -2;
                        stackIn_54_0 = stackOut_53_0;
                        stackIn_54_1 = stackOut_53_1;
                        break L20;
                      }
                      if (stackIn_54_0 != stackIn_54_1) {
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
                  this.field_H.field_r.a(param3.field_D);
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
                    if (param3 == this.field_G[param3.field_u][param3.field_z]) {
                      this.field_G[param3.field_u][param3.field_z] = null;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                } else {
                  break L25;
                }
              }
              stackOut_70_0 = 1;
              stackIn_71_0 = stackOut_70_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              param3.field_D.a(param3.field_l, this.a(param3, 15), this.b(param3, -16385));
              if (param2 == -128) {
                stackOut_75_0 = 0;
                stackIn_76_0 = stackOut_75_0;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackOut_73_0 = 0;
                stackIn_74_0 = stackOut_73_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var6 = decompiledCaughtException;
            stackOut_77_0 = (RuntimeException) (var6);
            stackOut_77_1 = new StringBuilder().append("ug.PA(").append(param0).append(',');
            stackIn_79_0 = stackOut_77_0;
            stackIn_79_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param1 == null) {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L26;
            } else {
              stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackOut_78_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackOut_78_2 = "{...}";
              stackIn_80_0 = stackOut_78_0;
              stackIn_80_1 = stackOut_78_1;
              stackIn_80_2 = stackOut_78_2;
              break L26;
            }
          }
          L27: {
            stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
            stackOut_80_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_80_2).append(',').append(param2).append(',');
            stackIn_82_0 = stackOut_80_0;
            stackIn_82_1 = stackOut_80_1;
            stackIn_81_0 = stackOut_80_0;
            stackIn_81_1 = stackOut_80_1;
            if (param3 == null) {
              stackOut_82_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackOut_82_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackOut_82_2 = "null";
              stackIn_83_0 = stackOut_82_0;
              stackIn_83_1 = stackOut_82_1;
              stackIn_83_2 = stackOut_82_2;
              break L27;
            } else {
              stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
              stackOut_81_1 = (StringBuilder) ((Object) stackIn_81_1);
              stackOut_81_2 = "{...}";
              stackIn_83_0 = stackOut_81_0;
              stackIn_83_1 = stackOut_81_1;
              stackIn_83_2 = stackOut_81_2;
              break L27;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_83_0), stackIn_83_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_71_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_74_0 != 0;
            } else {
              return stackIn_76_0 != 0;
            }
          }
        }
    }

    private final void c(int param0, int param1) {
        cc var3 = null;
        int var4 = 0;
        L0: {
          var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param1 == -16596) {
            break L0;
          } else {
            this.d(-16);
            break L0;
          }
        }
        L1: {
          if ((this.field_C[param0] & 2 ^ -1) != -1) {
            var3 = (cc) ((Object) this.field_H.field_q.h(param1 + 5445));
            L2: while (true) {
              if (var3 == null) {
                break L1;
              } else {
                if (var4 != 0) {
                  break L1;
                } else {
                  L3: {
                    if ((var3.field_u ^ -1) != (param0 ^ -1)) {
                      break L3;
                    } else {
                      if (this.field_s[param0][var3.field_F] != null) {
                        break L3;
                      } else {
                        if (0 > var3.field_k) {
                          var3.field_k = 0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var3 = (cc) ((Object) this.field_H.field_q.e(0));
                  if (var4 == 0) {
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              }
            }
          } else {
            break L1;
          }
        }
    }

    private final synchronized void a(boolean param0, int param1) {
        this.field_R.a();
        if (param1 > -113) {
            return;
        }
        this.field_K = null;
        this.a(false, param0);
    }

    final static boolean a(int param0, char param1) {
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            field_T = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (param1 < 65) {
                break L3;
              } else {
                if (90 >= param1) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (97 > param1) {
                break L4;
              } else {
                if (param1 > 122) {
                  break L4;
                } else {
                  break L2;
                }
              }
            }
            stackOut_9_0 = 0;
            stackIn_10_0 = stackOut_9_0;
            break L1;
          }
          stackOut_8_0 = 1;
          stackIn_10_0 = stackOut_8_0;
          break L1;
        }
        return stackIn_10_0 != 0;
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
              var3_int = param1.field_h - -(param1.field_x * param1.field_s >> -1205029204);
              var3_int = var3_int + ((-8192 + this.field_A[param1.field_u]) * this.field_z[param1.field_u] >> 1526397996);
              var4 = param1.field_q;
              if (0 >= var4.field_k) {
                break L1;
              } else {
                L2: {
                  if (-1 > (var4.field_l ^ -1)) {
                    break L2;
                  } else {
                    if (this.field_q[param1.field_u] > 0) {
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
                var5 = var5 + (this.field_q[param1.field_u] >> -1503747161);
                var7 = Math.sin(0.01227184630308513 * (double)(511 & param1.field_j));
                var3_int = var3_int + (int)((double)var5 * var7);
                break L1;
              }
            }
            var5 = (int)((double)(256 * param1.field_C.field_j) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)id.field_d + 0.5);
            if (param0 == 950080514) {
              L4: {
                if ((var5 ^ -1) > -2) {
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
              stackOut_9_0 = -20;
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
            stackOut_15_1 = new StringBuilder().append("ug.E(").append(param0).append(',');
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
          throw ie.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_14_0;
        }
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
                      var6 = (int)((long)this.field_E[param0.field_u] * (long)var7 >> 1467533830);
                      var5 = var5 << 8;
                      if ((var6 ^ -1) > (var5 ^ -1)) {
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
              var6 = (int)((long)this.field_E[param0.field_u] * (long)var5 >> -1159370938);
              break L1;
            }
            param0.field_D.g(var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (runtimeException);
            stackOut_8_1 = new StringBuilder().append("ug.J(");
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
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, nh[] param2, int param3) {
        vc discarded$0 = null;
        try {
            if (param3 != 37) {
                discarded$0 = ug.a((String) null, -50);
            }
            cb.field_a = new gk(param2);
            df.field_h = param0;
            di.field_d = param1;
            nl.d(-1321745375);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "ug.KA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final synchronized int d() {
        return 0;
    }

    final synchronized boolean e(int param0) {
        if (param0 != 16) {
            this.field_y = (int[]) null;
        }
        return this.field_R.g();
    }

    private final void b(int param0, int param1) {
        cc var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        L0: {
          L1: {
            var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            if ((4 & this.field_C[param0]) != 0) {
              var3 = (cc) ((Object) this.field_H.field_q.h(param1 ^ -12545));
              L2: while (true) {
                if (var3 == null) {
                  break L1;
                } else {
                  stackOut_4_0 = var3.field_u;
                  stackOut_4_1 = param0;
                  stackIn_10_0 = stackOut_4_0;
                  stackIn_10_1 = stackOut_4_1;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  if (var4 != 0) {
                    break L0;
                  } else {
                    L3: {
                      if (stackIn_5_0 == stackIn_5_1) {
                        var3.field_i = 0;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var3 = (cc) ((Object) this.field_H.field_q.e(0));
                    if (var4 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            } else {
              break L1;
            }
          }
          stackOut_9_0 = param1;
          stackOut_9_1 = 6798;
          stackIn_10_0 = stackOut_9_0;
          stackIn_10_1 = stackOut_9_1;
          break L0;
        }
        L4: {
          if (stackIn_10_0 == stackIn_10_1) {
            break L4;
          } else {
            this.field_w = true;
            break L4;
          }
        }
    }

    private final void a(int param0, boolean param1) {
        cc var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        boolean stackOut_9_0 = false;
        int stackOut_9_1 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var3 = (cc) ((Object) this.field_H.field_q.h(-11151));
        L0: while (true) {
          L1: {
            L2: {
              if (var3 == null) {
                break L2;
              } else {
                stackOut_2_0 = param0 ^ -1;
                stackOut_2_1 = -1;
                stackIn_10_0 = stackOut_2_0;
                stackIn_10_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var4 != 0) {
                  break L1;
                } else {
                  L3: {
                    L4: {
                      if (stackIn_3_0 > stackIn_3_1) {
                        break L4;
                      } else {
                        if ((var3.field_u ^ -1) != (param0 ^ -1)) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if ((var3.field_k ^ -1) <= -1) {
                      break L3;
                    } else {
                      this.field_s[var3.field_u][var3.field_F] = null;
                      var3.field_k = 0;
                      break L3;
                    }
                  }
                  var3 = (cc) ((Object) this.field_H.field_q.e(0));
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_9_0 = param1;
            stackOut_9_1 = 1;
            stackIn_10_0 = stackOut_9_0 ? 1 : 0;
            stackIn_10_1 = stackOut_9_1;
            break L1;
          }
          L5: {
            if (stackIn_10_0 == stackIn_10_1) {
              break L5;
            } else {
              this.c(-123, 19);
              break L5;
            }
          }
          return;
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        if (param1) {
            this.field_S = 17;
        }
    }

    private final void a(int param0, int param1) {
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (0 <= param1) {
          this.field_u[param1] = param0;
          this.field_y[param1] = 8192;
          this.field_o[param1] = 16383;
          this.field_A[param1] = 8192;
          this.field_q[param1] = 0;
          this.field_D[param1] = 8192;
          this.c(param1, -16596);
          this.b(param1, 6798);
          this.field_C[param1] = 0;
          this.field_n[param1] = 32767;
          this.field_z[param1] = 256;
          this.field_E[param1] = 0;
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
              if (var4 == 0) {
                continue L0;
              } else {
                return;
              }
            }
          }
        }
    }

    private final synchronized void a(boolean param0, boolean param1, ok param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              this.a(param0, -115);
              this.field_R.a(param2.field_h);
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param1) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((ug) (this)).field_w = stackIn_4_1 != 0;
              this.field_J = 0L;
              var5_int = this.field_R.c();
              if (param3 == -1) {
                break L2;
              } else {
                this.b(42, 33);
                break L2;
              }
            }
            var6 = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if ((var6 ^ -1) <= (var5_int ^ -1)) {
                    break L5;
                  } else {
                    this.field_R.f(var6);
                    this.field_R.e(var6);
                    this.field_R.c(var6);
                    var6++;
                    if (var7 != 0) {
                      break L4;
                    } else {
                      if (var7 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                this.field_N = this.field_R.d();
                this.field_v = this.field_R.field_h[this.field_N];
                this.field_P = this.field_R.d(this.field_v);
                break L4;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (runtimeException);
            stackOut_13_1 = new StringBuilder().append("ug.SA(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ')');
        }
    }

    final static vc a(String param0, int param1) {
        RuntimeException var2 = null;
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
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("ug.F(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    private final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        L0: {
          var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var2 = this.field_N;
          var3 = this.field_v;
          var4 = this.field_P;
          if (null == this.field_K) {
            break L0;
          } else {
            if (this.field_L != var3) {
              break L0;
            } else {
              this.a(this.field_l, this.field_w, this.field_K, -1);
              this.g(32675);
              return;
            }
          }
        }
        L1: while (true) {
          stackOut_4_0 = var3;
          stackOut_4_1 = this.field_v;
          stackIn_5_0 = stackOut_4_0;
          stackIn_5_1 = stackOut_4_1;
          L2: while (true) {
            L3: {
              L4: {
                if (stackIn_5_0 != stackIn_5_1) {
                  break L4;
                } else {
                  L5: while (true) {
                    stackOut_6_0 = this.field_R.field_h[var2];
                    stackOut_6_1 = var3;
                    stackIn_28_0 = stackOut_6_0;
                    stackIn_28_1 = stackOut_6_1;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    if (var7 != 0) {
                      break L3;
                    } else {
                      L6: {
                        if (stackIn_7_0 != stackIn_7_1) {
                          break L6;
                        } else {
                          this.field_R.f(var2);
                          var6 = this.field_R.b(var2);
                          stackOut_8_0 = 1;
                          stackOut_8_1 = var6;
                          stackIn_5_0 = stackOut_8_0;
                          stackIn_5_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (var7 != 0) {
                            continue L2;
                          } else {
                            if (stackIn_9_0 == stackIn_9_1) {
                              L7: {
                                this.field_R.b();
                                this.field_R.c(var2);
                                if (this.field_R.e()) {
                                  break L7;
                                } else {
                                  if (var7 == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              if (null != this.field_K) {
                                this.a(this.field_K, this.field_w, (byte) 120);
                                this.g(32675);
                                return;
                              } else {
                                L8: {
                                  if (!this.field_w) {
                                    break L8;
                                  } else {
                                    if (var3 != 0) {
                                      this.field_R.a(var4);
                                      if (var7 == 0) {
                                        break L6;
                                      } else {
                                        break L8;
                                      }
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                this.a(false, true);
                                this.field_R.a();
                                return;
                              }
                            } else {
                              L9: {
                                if (0 != (128 & var6)) {
                                  this.d(var6, 32696);
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              this.field_R.e(var2);
                              this.field_R.c(var2);
                              if (var7 == 0) {
                                continue L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      var2 = this.field_R.d();
                      var3 = this.field_R.field_h[var2];
                      var4 = this.field_R.d(var3);
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              stackOut_27_0 = param0;
              stackOut_27_1 = 32675;
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              break L3;
            }
            L10: {
              if (stackIn_28_0 == stackIn_28_1) {
                break L10;
              } else {
                this.field_C = (int[]) null;
                break L10;
              }
            }
            L11: {
              this.field_P = var4;
              this.field_N = var2;
              this.field_v = var3;
              if (this.field_K == null) {
                break L11;
              } else {
                if (this.field_L < var3) {
                  this.field_N = -1;
                  this.field_v = this.field_L;
                  this.field_P = this.field_R.d(this.field_v);
                  break L11;
                } else {
                  break L11;
                }
              }
            }
            return;
          }
        }
    }

    private final void d(int param0, int param1) {
        int discarded$1 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var3 = param0 & 240;
          if (param1 == 32696) {
            break L0;
          } else {
            discarded$1 = this.d();
            break L0;
          }
        }
        if (var3 == 128) {
          var4 = 15 & param0;
          var5 = (param0 & 32538) >> 1051707944;
          var6 = (param0 & 8379937) >> 2050059888;
          this.a((byte) 91, var5, var4, var6);
          return;
        } else {
          L1: {
            if (-145 == (var3 ^ -1)) {
              L2: {
                var4 = param0 & 15;
                var5 = (32547 & param0) >> -384649400;
                var6 = (8346333 & param0) >> -1793331696;
                if (0 < var6) {
                  break L2;
                } else {
                  this.a((byte) 91, var5, var4, 64);
                  if (var8 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.b((byte) 15, var6, var5, var4);
              return;
            } else {
              if ((var3 ^ -1) != -161) {
                if (176 == var3) {
                  L3: {
                    var4 = param0 & 15;
                    var5 = (param0 & 32675) >> 128622184;
                    var6 = (8325095 & param0) >> -903746800;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      this.field_t[var4] = rk.a(this.field_t[var4], -2080769) + (var6 << -914588946);
                      break L3;
                    }
                  }
                  L4: {
                    if (-33 != (var5 ^ -1)) {
                      break L4;
                    } else {
                      this.field_t[var4] = (var6 << 397931911) + rk.a(-16257, this.field_t[var4]);
                      break L4;
                    }
                  }
                  L5: {
                    if (-2 != (var5 ^ -1)) {
                      break L5;
                    } else {
                      this.field_q[var4] = (var6 << 2071769703) + rk.a(this.field_q[var4], -16257);
                      break L5;
                    }
                  }
                  L6: {
                    if ((var5 ^ -1) != -34) {
                      break L6;
                    } else {
                      this.field_q[var4] = rk.a(-128, this.field_q[var4]) + var6;
                      break L6;
                    }
                  }
                  L7: {
                    if (var5 != 5) {
                      break L7;
                    } else {
                      this.field_D[var4] = rk.a(this.field_D[var4], -16257) + (var6 << -85585113);
                      break L7;
                    }
                  }
                  L8: {
                    if (var5 != 37) {
                      break L8;
                    } else {
                      this.field_D[var4] = rk.a(this.field_D[var4], -128) - -var6;
                      break L8;
                    }
                  }
                  L9: {
                    if (7 == var5) {
                      this.field_u[var4] = (var6 << -921185753) + rk.a(this.field_u[var4], -16257);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (-40 == (var5 ^ -1)) {
                      this.field_u[var4] = rk.a(this.field_u[var4], -128) + var6;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (-11 != (var5 ^ -1)) {
                      break L11;
                    } else {
                      this.field_y[var4] = rk.a(-16257, this.field_y[var4]) + (var6 << -462288537);
                      break L11;
                    }
                  }
                  L12: {
                    if (var5 == 42) {
                      this.field_y[var4] = var6 + rk.a(this.field_y[var4], -128);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if ((var5 ^ -1) != -12) {
                      break L13;
                    } else {
                      this.field_o[var4] = rk.a(-16257, this.field_o[var4]) + (var6 << 1883403879);
                      break L13;
                    }
                  }
                  L14: {
                    if ((var5 ^ -1) == -44) {
                      this.field_o[var4] = var6 + rk.a(-128, this.field_o[var4]);
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (64 != var5) {
                      break L15;
                    } else {
                      L16: {
                        if (var6 >= 64) {
                          break L16;
                        } else {
                          this.field_C[var4] = rk.a(this.field_C[var4], -2);
                          if (var8 == 0) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      this.field_C[var4] = li.a(this.field_C[var4], 1);
                      break L15;
                    }
                  }
                  L17: {
                    if (-66 != (var5 ^ -1)) {
                      break L17;
                    } else {
                      L18: {
                        if (-65 >= (var6 ^ -1)) {
                          break L18;
                        } else {
                          this.c(var4, -16596);
                          this.field_C[var4] = rk.a(this.field_C[var4], -3);
                          if (var8 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      this.field_C[var4] = li.a(this.field_C[var4], 2);
                      break L17;
                    }
                  }
                  L19: {
                    if (99 != var5) {
                      break L19;
                    } else {
                      this.field_n[var4] = rk.a(127, this.field_n[var4]) - -(var6 << -1461837593);
                      break L19;
                    }
                  }
                  L20: {
                    if (98 == var5) {
                      this.field_n[var4] = rk.a(16256, this.field_n[var4]) + var6;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (-102 != (var5 ^ -1)) {
                      break L21;
                    } else {
                      this.field_n[var4] = rk.a(this.field_n[var4], 127) + 16384 + (var6 << 1273233063);
                      break L21;
                    }
                  }
                  L22: {
                    if (-101 == (var5 ^ -1)) {
                      this.field_n[var4] = rk.a(16256, this.field_n[var4]) + (16384 + var6);
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  L23: {
                    if ((var5 ^ -1) == -121) {
                      this.b(var4, (byte) 6);
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if (-122 != (var5 ^ -1)) {
                      break L24;
                    } else {
                      this.a(param1 ^ 19896, var4);
                      break L24;
                    }
                  }
                  L25: {
                    if (123 == var5) {
                      this.a(var4, true);
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (-7 == (var5 ^ -1)) {
                      var7 = this.field_n[var4];
                      if (16384 == var7) {
                        this.field_z[var4] = rk.a(this.field_z[var4], -16257) - -(var6 << 1292980039);
                        break L26;
                      } else {
                        break L26;
                      }
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if (-39 != (var5 ^ -1)) {
                      break L27;
                    } else {
                      var7 = this.field_n[var4];
                      if ((var7 ^ -1) == -16385) {
                        this.field_z[var4] = rk.a(-128, this.field_z[var4]) + var6;
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                  }
                  L28: {
                    if (var5 == 16) {
                      this.field_E[var4] = (var6 << -1884177785) + rk.a(this.field_E[var4], -16257);
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  L29: {
                    if ((var5 ^ -1) == -49) {
                      this.field_E[var4] = var6 + rk.a(-128, this.field_E[var4]);
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  L30: {
                    if (-82 != (var5 ^ -1)) {
                      break L30;
                    } else {
                      L31: {
                        if (64 > var6) {
                          break L31;
                        } else {
                          this.field_C[var4] = li.a(this.field_C[var4], 4);
                          if (var8 == 0) {
                            break L30;
                          } else {
                            break L31;
                          }
                        }
                      }
                      this.b(var4, 6798);
                      this.field_C[var4] = rk.a(this.field_C[var4], -5);
                      break L30;
                    }
                  }
                  L32: {
                    if ((var5 ^ -1) == -18) {
                      this.b((-16257 & this.field_U[var4]) - -(var6 << -1216306041), -1, var4);
                      break L32;
                    } else {
                      break L32;
                    }
                  }
                  if (49 != var5) {
                    break L1;
                  } else {
                    this.b((-128 & this.field_U[var4]) - -var6, param1 + -32697, var4);
                    return;
                  }
                } else {
                  if (var3 == 192) {
                    var4 = param0 & 15;
                    var5 = (param0 & 32596) >> 227408264;
                    this.c(this.field_t[var4] + var5, 0, var4);
                    return;
                  } else {
                    if ((var3 ^ -1) != -209) {
                      if (-225 == (var3 ^ -1)) {
                        var4 = param0 & 15;
                        var5 = (param0 >> -693096120 & 127) + ((8323499 & param0) >> 1771148233);
                        this.e(var4, var5, -128);
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
          return;
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (!this.field_R.g()) {
                  break L2;
                } else {
                  var4_int = this.field_R.field_i * this.field_M / id.field_d;
                  L3: while (true) {
                    L4: {
                      var5 = this.field_J - -((long)param2 * (long)var4_int);
                      if (-1L >= (-var5 + this.field_P ^ -1L)) {
                        this.field_J = var5;
                        if (var8 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      var7 = (int)((-1L + ((long)var4_int + (this.field_P - this.field_J))) / (long)var4_int);
                      this.field_J = this.field_J + (long)var7 * (long)var4_int;
                      this.field_H.b(param0, param1, var7);
                      param2 = param2 - var7;
                      param1 = param1 + var7;
                      this.g(32675);
                      if (this.field_R.g()) {
                        break L5;
                      } else {
                        if (var8 == 0) {
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var8 == 0) {
                      continue L3;
                    } else {
                      this.field_H.b(param0, param1, param2);
                      break L1;
                    }
                  }
                }
              }
              this.field_H.b(param0, param1, param2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var4);
            stackOut_13_1 = new StringBuilder().append("ug.A(");
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
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized ic c() {
        return null;
    }

    private final void b(int param0, byte param1) {
        cc var3 = null;
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var3 = (cc) ((Object) this.field_H.field_q.h(-11151));
        if (param1 >= 3) {
          L0: while (true) {
            L1: {
              if (var3 == null) {
                break L1;
              } else {
                if (var4 != 0) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if (param0 < 0) {
                        break L3;
                      } else {
                        if ((var3.field_u ^ -1) == (param0 ^ -1)) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L4: {
                      if (var3.field_D != null) {
                        L5: {
                          var3.field_D.k(id.field_d / 100);
                          if (!var3.field_D.g()) {
                            break L5;
                          } else {
                            this.field_H.field_r.a(var3.field_D);
                            break L5;
                          }
                        }
                        var3.d(-79);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L6: {
                      if (-1 < (var3.field_k ^ -1)) {
                        this.field_s[var3.field_u][var3.field_F] = null;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var3.a(-16175);
                    break L2;
                  }
                  var3 = (cc) ((Object) this.field_H.field_q.e(0));
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final synchronized void b(byte param0) {
        int discarded$2 = 0;
        ig var2 = null;
        int var3 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = (ig) ((Object) this.field_O.b(-1));
        L0: while (true) {
          L1: {
            L2: {
              if (var2 == null) {
                break L2;
              } else {
                var2.d(param0 ^ 107);
                var2 = (ig) ((Object) this.field_O.a((byte) -114));
                if (var3 != 0) {
                  break L1;
                } else {
                  if (var3 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            if (param0 == 47) {
              break L1;
            } else {
              discarded$2 = this.b(-122, (cc) null);
              break L1;
            }
          }
          return;
        }
    }

    private final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            if (param1) {
              break L1;
            } else {
              this.a(-1, true);
              if (var4 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.b(-1, (byte) 21);
          break L0;
        }
        this.a(12800, -1);
        var3 = 0;
        L2: while (true) {
          L3: {
            L4: {
              if (-17 >= (var3 ^ -1)) {
                break L4;
              } else {
                this.field_r[var3] = this.field_F[var3];
                var3++;
                if (var4 != 0) {
                  break L3;
                } else {
                  if (var4 == 0) {
                    continue L2;
                  } else {
                    break L4;
                  }
                }
              }
            }
            if (!param0) {
              break L3;
            } else {
              field_T = (String) null;
              break L3;
            }
          }
          var5 = 0;
          var3 = var5;
          L5: while (true) {
            L6: {
              if ((var5 ^ -1) <= -17) {
                break L6;
              } else {
                this.field_t[var5] = rk.a(this.field_F[var5], -128);
                var5++;
                if (var4 != 0) {
                  break L6;
                } else {
                  if (var4 == 0) {
                    continue L5;
                  } else {
                    break L6;
                  }
                }
              }
            }
            return;
          }
        }
    }

    final static int f(int param0) {
        sa[] discarded$0 = null;
        if (param0 <= 85) {
            discarded$0 = ug.c((byte) 77);
        }
        return rd.field_z;
    }

    final synchronized void a(byte param0) {
        this.a(true, -122);
        if (param0 >= -86) {
            this.field_G = (cc[][]) null;
        }
    }

    private final void a(int param0, int param1, int param2) {
        this.field_F[param0] = param2;
        this.field_t[param0] = rk.a(-128, param2);
        this.c(param2, 0, param0);
        if (param1 != 26818) {
            this.field_J = 40L;
        }
    }

    private final void e(int param0, int param1, int param2) {
        this.field_A[param0] = param1;
        if (param2 > -125) {
            this.b(-86, -27, 1);
        }
    }

    private final int a(cc param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ri var9 = null;
        ri var10 = null;
        int stackIn_5_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 15) {
                break L1;
              } else {
                this.field_L = -99;
                break L1;
              }
            }
            if ((this.field_Q[param0.field_u] ^ -1) == -1) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                var9 = param0.field_q;
                var10 = var9;
                var4 = this.field_u[param0.field_u] * this.field_o[param0.field_u] + 4096 >> 218968781;
                var4 = var4 * var4 - -16384 >> 1538862607;
                var4 = param0.field_t * var4 - -16384 >> -1190063857;
                var4 = 128 + var4 * this.field_S >> -525649208;
                var4 = var4 * this.field_Q[param0.field_u] + 128 >> -699653272;
                if (-1 > (var10.field_i ^ -1)) {
                  var4 = (int)(Math.pow(0.5, (double)var10.field_i * (0.00001953125 * (double)param0.field_m)) * (double)var4 + 0.5);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var10.field_a == null) {
                  break L3;
                } else {
                  L4: {
                    var5 = param0.field_E;
                    var6 = var10.field_a[param0.field_n + 1];
                    if (param0.field_n >= -2 + var10.field_a.length) {
                      break L4;
                    } else {
                      var7 = (255 & var9.field_a[param0.field_n]) << 1437743848;
                      var8 = (255 & var10.field_a[param0.field_n - -2]) << 355343176;
                      var6 = var6 + (-var7 + var5) * (-var6 + var10.field_a[param0.field_n - -3]) / (-var7 + var8);
                      break L4;
                    }
                  }
                  var4 = var6 * var4 + 32 >> -1410405882;
                  break L3;
                }
              }
              L5: {
                if ((param0.field_k ^ -1) >= -1) {
                  break L5;
                } else {
                  if (var10.field_m != null) {
                    L6: {
                      var5 = param0.field_k;
                      var6 = var10.field_m[1 + param0.field_r];
                      if (param0.field_r < var10.field_m.length - 2) {
                        var7 = (var9.field_m[param0.field_r] & 255) << -1288533720;
                        var8 = (255 & var10.field_m[param0.field_r + 2]) << 1478198056;
                        var6 = var6 + (-var7 + var5) * (var10.field_m[param0.field_r - -3] + -var6) / (-var7 + var8);
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
              stackOut_20_0 = var4;
              stackIn_21_0 = stackOut_20_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var3);
            stackOut_22_1 = new StringBuilder().append("ug.L(");
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
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_21_0;
        }
    }

    final synchronized void d(int param0, int param1, int param2) {
        this.a(param0, 26818, param1);
        int var4 = 19 / ((70 - param2) / 34);
    }

    private final void b(int param0, int param1, int param2) {
        this.field_U[param2] = param0;
        if (param1 != -1) {
            this.field_S = 32;
        }
        this.field_B[param2] = (int)(2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param0) + 0.5);
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
            if (this.field_R.g()) {
              var2 = this.field_R.field_i * this.field_M / id.field_d;
              L2: while (true) {
                L3: {
                  var3 = (long)var2 * (long)param0 + this.field_J;
                  if ((-var3 + this.field_P ^ -1L) > -1L) {
                    break L3;
                  } else {
                    this.field_J = var3;
                    if (var6 != 0) {
                      break L0;
                    } else {
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  var5 = (int)((-1L + ((long)var2 + (this.field_P - this.field_J))) / (long)var2);
                  this.field_J = this.field_J + (long)var2 * (long)var5;
                  this.field_H.d(var5);
                  param0 = param0 - var5;
                  this.g(32675);
                  if (this.field_R.g()) {
                    break L4;
                  } else {
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                if (var6 == 0) {
                  continue L2;
                } else {
                  this.field_H.d(param0);
                  break L0;
                }
              }
            } else {
              break L1;
            }
          }
          this.field_H.d(param0);
          break L0;
        }
    }

    final synchronized void a(ok param0, boolean param1, byte param2) {
        if (param2 <= 77) {
            return;
        }
        try {
            this.a(true, param1, param0, -1);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "ug.T(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        cc var6 = null;
        int var7 = 0;
        cc var8 = null;
        L0: {
          var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param0 == 91) {
            break L0;
          } else {
            this.b((byte) 92, 20, -113, -69);
            break L0;
          }
        }
        var8 = this.field_s[param2][param1];
        if (var8 != null) {
          L1: {
            L2: {
              this.field_s[param2][param1] = null;
              if (-1 == (2 & this.field_C[param2] ^ -1)) {
                break L2;
              } else {
                var6 = (cc) ((Object) this.field_H.field_q.h(-11151));
                L3: while (true) {
                  L4: {
                    if (var6 == null) {
                      break L4;
                    } else {
                      if (var7 != 0) {
                        break L1;
                      } else {
                        L5: {
                          if (var8.field_u != var6.field_u) {
                            break L5;
                          } else {
                            if (var6.field_k >= 0) {
                              break L5;
                            } else {
                              if (var6 == var8) {
                                break L5;
                              } else {
                                var8.field_k = 0;
                                if (var7 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                        var6 = (cc) ((Object) this.field_H.field_q.e(0));
                        if (var7 == 0) {
                          continue L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var8.field_k = 0;
            break L1;
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
        Object stackIn_18_0 = null;
        cc stackIn_18_1 = null;
        Object stackIn_19_0 = null;
        cc stackIn_19_1 = null;
        Object stackIn_20_0 = null;
        cc stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        Object stackOut_17_0 = null;
        cc stackOut_17_1 = null;
        Object stackOut_19_0 = null;
        cc stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        Object stackOut_18_0 = null;
        cc stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        L0: {
          var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          this.a((byte) 91, param2, param3, 64);
          if ((this.field_C[param3] & 2) == 0) {
            break L0;
          } else {
            var5 = (cc) ((Object) this.field_H.field_q.b(param0 ^ 2861));
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
                      this.field_s[param3][var5.field_F] = null;
                      this.field_s[param3][param2] = var5;
                      var6_int = var5.field_h + (var5.field_s * var5.field_x >> 888816332);
                      var5.field_h = var5.field_h + (param2 + -var5.field_F << -384632440);
                      var5.field_F = param2;
                      var5.field_x = 4096;
                      var5.field_s = -var5.field_h + var6_int;
                      return;
                    }
                  }
                }
                var5 = (cc) ((Object) this.field_H.field_q.c(-113));
                if (var9 == 0) {
                  continue L1;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        var10 = (ig) ((Object) this.field_O.a(true, (long)this.field_r[param3]));
        var11 = var10;
        if (var11 == null) {
          return;
        } else {
          var6 = var10.field_j[param2];
          if (var6 != null) {
            var7 = new cc();
            var7.field_u = param3;
            var7.field_C = var6;
            var7.field_o = var11;
            if (param0 == 15) {
              L3: {
                L4: {
                  var7.field_q = var10.field_q[param2];
                  var7.field_z = var10.field_n[param2];
                  var7.field_F = param2;
                  var7.field_t = 1024 + var11.field_l * (param1 * param1 * var10.field_m[param2]) >> 1956790987;
                  var7.field_v = 255 & var10.field_s[param2];
                  var7.field_h = -(var10.field_p[param2] & 32767) + (param2 << 1257163944);
                  var7.field_r = 0;
                  var7.field_k = -1;
                  var7.field_n = 0;
                  var7.field_E = 0;
                  var7.field_m = 0;
                  if (this.field_E[param3] != 0) {
                    break L4;
                  } else {
                    var7.field_D = ag.b(var6, this.b(950080514, var7), this.a(var7, 15), this.b(var7, -16385));
                    if (var9 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  var7.field_D = ag.b(var6, this.b(950080514, var7), 0, this.b(var7, -16385));
                  stackOut_17_0 = this;
                  stackOut_17_1 = (cc) (var7);
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  if (-1 >= (var10.field_p[param2] ^ -1)) {
                    stackOut_19_0 = this;
                    stackOut_19_1 = (cc) ((Object) stackIn_19_1);
                    stackOut_19_2 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    stackIn_20_2 = stackOut_19_2;
                    break L5;
                  } else {
                    stackOut_18_0 = this;
                    stackOut_18_1 = (cc) ((Object) stackIn_18_1);
                    stackOut_18_2 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    stackIn_20_2 = stackOut_18_2;
                    break L5;
                  }
                }
                this.a(stackIn_20_1, stackIn_20_2 != 0, (byte) 101);
                break L3;
              }
              L6: {
                if (var10.field_p[param2] < 0) {
                  var7.field_D.f(-1);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (-1 < (var7.field_z ^ -1)) {
                  break L7;
                } else {
                  L8: {
                    var8 = this.field_G[param3][var7.field_z];
                    if (var8 == null) {
                      break L8;
                    } else {
                      if (0 > var8.field_k) {
                        this.field_s[param3][var8.field_F] = null;
                        var8.field_k = 0;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  this.field_G[param3][var7.field_z] = var7;
                  break L7;
                }
              }
              this.field_H.field_q.a(var7, 255);
              this.field_s[param3][param2] = var7;
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    private final void c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            if (param0 != this.field_r[param2]) {
              this.field_r[param2] = param0;
              var4 = 0;
              L2: while (true) {
                if (128 <= var4) {
                  break L1;
                } else {
                  this.field_G[param2][var4] = null;
                  var4++;
                  if (var5 != 0) {
                    break L0;
                  } else {
                    if (var5 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            } else {
              break L1;
            }
          }
          if (param1 == 0) {
            break L0;
          } else {
            field_I = (v) null;
            break L0;
          }
        }
    }

    private final synchronized void a(int param0, byte param1, int param2) {
        boolean discarded$2 = false;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param1 == 70) {
            break L0;
          } else {
            discarded$2 = ug.a(-61, '');
            break L0;
          }
        }
        L1: {
          L2: {
            if ((param0 ^ -1) > -1) {
              break L2;
            } else {
              this.field_Q[param0] = param2;
              if (var5 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          var4 = 0;
          L3: while (true) {
            if (16 <= var4) {
              break L1;
            } else {
              this.field_Q[var4] = param2;
              var4++;
              if (var5 != 0) {
                break L1;
              } else {
                if (var5 == 0) {
                  continue L3;
                } else {
                  break L1;
                }
              }
            }
          }
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
        int stackIn_20_0 = 0;
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
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
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
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              param3.a();
              var6_int = 1;
              var7 = null;
              if (param2 < param0) {
                var7 = new int[]{param0};
                break L1;
              } else {
                break L1;
              }
            }
            var8 = (ga) ((Object) param3.field_i.b(-1));
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (var8 == null) {
                      break L5;
                    } else {
                      var9 = (int)var8.field_g;
                      var10 = (ig) ((Object) this.field_O.a(true, (long)var9));
                      if (var11 != 0) {
                        break L4;
                      } else {
                        L6: {
                          L7: {
                            if (var10 != null) {
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
                              this.field_O.a(var10, (long)var9, -1);
                              break L7;
                            }
                          }
                          if (!var10.a((int[]) (var7), 103, param4, var8.field_h)) {
                            var6_int = 0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var8 = (ga) ((Object) param3.field_i.a((byte) -114));
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
              stackOut_19_0 = var6_int;
              stackIn_20_0 = stackOut_19_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var6);
            stackOut_21_1 = new StringBuilder().append("ug.NA(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          L10: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L10;
            }
          }
          L11: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param4 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L11;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L11;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
        return stackIn_20_0 != 0;
    }

    final synchronized void a(int param0, byte param1) {
        if (param1 != -13) {
            this.a(22, -65, -100, -116);
        }
        this.field_S = param0;
    }

    final static sa[] c(byte param0) {
        if (param0 != -23) {
            field_m = (Random) null;
        }
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
        this.field_n = new int[16];
        this.field_z = new int[16];
        this.field_C = new int[16];
        this.field_F = new int[16];
        this.field_u = new int[16];
        this.field_q = new int[16];
        this.field_U = new int[16];
        this.field_y = new int[16];
        this.field_E = new int[16];
        this.field_S = 256;
        this.field_B = new int[16];
        this.field_t = new int[16];
        this.field_r = new int[16];
        this.field_s = new cc[16][128];
        this.field_D = new int[16];
        this.field_A = new int[16];
        this.field_Q = new int[16];
        this.field_G = new cc[16][128];
        this.field_o = new int[16];
        this.field_M = 1000000;
        this.field_R = new rl();
        this.field_H = new am((ug) (this));
        this.field_O = new tg(128);
        this.a(-1, (byte) 70, 256);
        this.a(false, true);
    }

    static {
        field_m = new Random(2684L);
        field_x = false;
        field_p = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_T = "Checking";
    }
}
