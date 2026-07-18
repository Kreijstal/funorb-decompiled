/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ic extends we {
    private int[] field_z;
    private int[] field_A;
    private int[] field_ab;
    private int[] field_Z;
    int[] field_u;
    private int field_W;
    private hj[][] field_x;
    static wk field_db;
    static me field_T;
    private uh field_bb;
    private int[] field_I;
    private hj[][] field_U;
    private int[] field_w;
    private int[] field_t;
    static String field_cb;
    private int field_Q;
    private ab field_M;
    static ul field_B;
    private int[] field_J;
    int[] field_F;
    private int[] field_N;
    private int[] field_O;
    private int[] field_K;
    private int[] field_Y;
    private int[] field_R;
    int[] field_L;
    static String field_E;
    static ul field_D;
    static int[] field_eb;
    private boolean field_S;
    private int field_V;
    private ej field_v;
    static int field_P;
    private long field_y;
    private int field_s;
    private long field_X;
    private tg field_H;
    private int field_G;
    private boolean field_C;

    private final void d(int param0, int param1) {
        RuntimeException var3 = null;
        hj var3_ref = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if ((4 & ((ic) this).field_F[param0]) == 0) {
                  break L2;
                } else {
                  var3_ref = (hj) (Object) ((ic) this).field_v.field_F.e(13058);
                  L3: while (true) {
                    if (null == var3_ref) {
                      break L2;
                    } else {
                      if (var4 != 0) {
                        break L1;
                      } else {
                        L4: {
                          if (param0 == var3_ref.field_t) {
                            var3_ref.field_v = 0;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var3_ref = (hj) (Object) ((ic) this).field_v.field_F.a((byte) -116);
                        if (var4 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3, "ic.LA(" + param0 + ',' + 0 + ')');
        }
    }

    final synchronized we d() {
        RuntimeException var1 = null;
        ej stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        ej stackOut_0_0 = null;
        try {
          L0: {
            stackOut_0_0 = ((ic) this).field_v;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "ic.FA()");
        }
        return (we) (Object) stackIn_1_0;
    }

    private final void c(int param0, int param1) {
        RuntimeException runtimeException = null;
        hj var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_17_0 = 0;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            var3 = (hj) (Object) ((ic) this).field_v.field_F.e(13058);
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = param1;
                    stackIn_18_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0 < 0) {
                            break L5;
                          } else {
                            if (~var3.field_t == ~param1) {
                              break L5;
                            } else {
                              break L4;
                            }
                          }
                        }
                        if (var3.field_J < 0) {
                          ((ic) this).field_U[var3.field_t][var3.field_z] = null;
                          var3.field_J = 0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var3 = (hj) (Object) ((ic) this).field_v.field_F.a((byte) -107);
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_17_0 = param0;
                stackIn_18_0 = stackOut_17_0;
                break L2;
              }
              L6: {
                if (stackIn_18_0 == 0) {
                  break L6;
                } else {
                  ((ic) this).c((byte) -81);
                  break L6;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) (Object) runtimeException, "ic.PA(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, long param1, String param2) {
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
            en.field_e = param2;
            ib.field_b = 2;
            bk.field_U = ui.a(1, (CharSequence) (Object) param2);
            ti.field_p = param1;
            ba.b(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("ic.JA(").append(-23543).append(',').append(param1).append(',');
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
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    private final void g(int param0, int param1) {
        hj var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param1 == 1418611526) {
                break L1;
              } else {
                ((ic) this).field_J = null;
                break L1;
              }
            }
            var3 = (hj) (Object) ((ic) this).field_v.field_F.e(param1 + -1418598468);
            L2: while (true) {
              L3: {
                L4: {
                  if (null == var3) {
                    break L4;
                  } else {
                    if (var4 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (0 > param0) {
                            break L6;
                          } else {
                            if (param0 != var3.field_t) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          if (var3.field_A != null) {
                            L8: {
                              var3.field_A.g(tb.field_g / 100);
                              if (var3.field_A.l()) {
                                ((ic) this).field_v.field_G.b((we) (Object) var3.field_A);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            var3.d(4096);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L9: {
                          if (var3.field_J >= 0) {
                            break L9;
                          } else {
                            ((ic) this).field_U[var3.field_t][var3.field_z] = null;
                            break L9;
                          }
                        }
                        var3.b(4);
                        break L5;
                      }
                      var3 = (hj) (Object) ((ic) this).field_v.field_F.a((byte) -94);
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3_ref, "ic.VA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        hj var5 = null;
        RuntimeException var5_ref = null;
        hj var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            var5 = ((ic) this).field_U[param0][param2];
            if (null != var5) {
              L1: {
                ((ic) this).field_U[param0][param2] = null;
                if (param1 <= -79) {
                  break L1;
                } else {
                  field_eb = null;
                  break L1;
                }
              }
              L2: {
                L3: {
                  if ((2 & ((ic) this).field_F[param0]) == 0) {
                    break L3;
                  } else {
                    var6 = (hj) (Object) ((ic) this).field_v.field_F.e(13058);
                    L4: while (true) {
                      L5: {
                        if (null == var6) {
                          break L5;
                        } else {
                          if (var7 != 0) {
                            break L2;
                          } else {
                            L6: {
                              if (var5.field_t != var6.field_t) {
                                break L6;
                              } else {
                                if (var6.field_J >= 0) {
                                  break L6;
                                } else {
                                  if (var6 != var5) {
                                    var5.field_J = 0;
                                    if (var7 == 0) {
                                      break L5;
                                    } else {
                                      break L6;
                                    }
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            var6 = (hj) (Object) ((ic) this).field_v.field_F.a((byte) -61);
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
                var5.field_J = 0;
                break L2;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var5_ref, "ic.UA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void b(int param0, byte param1, int param2) {
        try {
            int var4_int = 15 % ((-72 - param1) / 46);
            this.c(-2043373017, param0, param2);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ic.N(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void c(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -13) {
                break L1;
              } else {
                this.a(46, 71, (byte) 34);
                break L1;
              }
            }
            this.a(true, 27830696);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "ic.IA(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2) {
        try {
            ((ic) this).field_Z[param0] = param1;
            ((ic) this).field_u[param0] = (int)(Math.pow(2.0, (double)param1 * 0.00054931640625) * 2097152.0 + 0.5);
            if (param2 != -17) {
                this.a(-64, -124, -121);
            }
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ic.P(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final synchronized void a(boolean param0, boolean param1, tg param2, boolean param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
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
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              this.a(param3, 27830696);
              ((ic) this).field_M.a(param2.field_p);
              if (!param0) {
                break L1;
              } else {
                this.a(-78, false);
                break L1;
              }
            }
            ((ic) this).field_y = 0L;
            ((ic) this).field_S = param1;
            var5_int = ((ic) this).field_M.b();
            var6 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var5_int <= var6) {
                    break L4;
                  } else {
                    ((ic) this).field_M.d(var6);
                    ((ic) this).field_M.c(var6);
                    ((ic) this).field_M.e(var6);
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
                ((ic) this).field_V = ((ic) this).field_M.f();
                ((ic) this).field_s = ((ic) this).field_M.field_a[((ic) this).field_V];
                ((ic) this).field_X = ((ic) this).field_M.b(((ic) this).field_s);
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("ic.O(").append(param0).append(',').append(param1).append(',');
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
          throw ci.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, hj param3, int[] param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        bj var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_17_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_92_0 = 0;
        int stackIn_92_1 = 0;
        int stackIn_118_0 = 0;
        int stackIn_123_0 = 0;
        RuntimeException stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        String stackIn_128_2 = null;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        RuntimeException stackIn_131_0 = null;
        StringBuilder stackIn_131_1 = null;
        RuntimeException stackIn_132_0 = null;
        StringBuilder stackIn_132_1 = null;
        String stackIn_132_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_84_0 = 0;
        int stackOut_84_1 = 0;
        int stackOut_91_0 = 0;
        int stackOut_91_1 = 0;
        int stackOut_117_0 = 0;
        int stackOut_122_0 = 0;
        RuntimeException stackOut_124_0 = null;
        StringBuilder stackOut_124_1 = null;
        RuntimeException stackOut_127_0 = null;
        StringBuilder stackOut_127_1 = null;
        String stackOut_127_2 = null;
        RuntimeException stackOut_125_0 = null;
        StringBuilder stackOut_125_1 = null;
        String stackOut_125_2 = null;
        RuntimeException stackOut_128_0 = null;
        StringBuilder stackOut_128_1 = null;
        RuntimeException stackOut_131_0 = null;
        StringBuilder stackOut_131_1 = null;
        String stackOut_131_2 = null;
        RuntimeException stackOut_129_0 = null;
        StringBuilder stackOut_129_1 = null;
        String stackOut_129_2 = null;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              param3.field_K = tb.field_g / 100;
              if (param3.field_J < 0) {
                break L1;
              } else {
                L2: {
                  if (null == param3.field_A) {
                    break L2;
                  } else {
                    if (param3.field_A.g()) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  param3.d(param2 ^ 3043);
                  param3.b(param2 + -7135);
                  if (param3.field_p <= 0) {
                    break L3;
                  } else {
                    if (param3 != ((ic) this).field_x[param3.field_t][param3.field_p]) {
                      break L3;
                    } else {
                      ((ic) this).field_x[param3.field_t][param3.field_p] = null;
                      break L3;
                    }
                  }
                }
                stackOut_16_0 = 1;
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0 != 0;
              }
            }
            L4: {
              var6_int = param3.field_y;
              if (var6_int > 0) {
                L5: {
                  var6_int = var6_int - (int)(Math.pow(2.0, 0.0004921259842519685 * (double)((ic) this).field_t[param3.field_t]) * 16.0 + 0.5);
                  if (var6_int < 0) {
                    var6_int = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                param3.field_y = var6_int;
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              param3.field_A.f(this.a((byte) 68, param3));
              var7 = param3.field_E;
              var8 = 0;
              param3.field_C = param3.field_C + var7.field_q;
              param3.field_I = param3.field_I + 1;
              var9 = (double)((param3.field_z + -60 << 8) + (param3.field_x * param3.field_y >> 12)) * 0.000005086263020833333;
              if (var7.field_i > 0) {
                L7: {
                  L8: {
                    if (var7.field_e > 0) {
                      break L8;
                    } else {
                      param3.field_M = param3.field_M + 128;
                      if (var11 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  param3.field_M = param3.field_M + (int)(128.0 * Math.pow(2.0, (double)var7.field_e * var9) + 0.5);
                  break L7;
                }
                if (var7.field_i * param3.field_M < 819200) {
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
              if (null != var7.field_m) {
                L10: {
                  L11: {
                    if (var7.field_k <= 0) {
                      break L11;
                    } else {
                      param3.field_D = param3.field_D + (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field_k) + 0.5);
                      if (var11 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  param3.field_D = param3.field_D + 128;
                  break L10;
                }
                L12: while (true) {
                  L13: {
                    L14: {
                      if (param3.field_r >= var7.field_m.length - 2) {
                        break L14;
                      } else {
                        stackOut_47_0 = param3.field_D;
                        stackOut_47_1 = var7.field_m[2 + param3.field_r] << 8 & 65280;
                        stackIn_55_0 = stackOut_47_0;
                        stackIn_55_1 = stackOut_47_1;
                        stackIn_48_0 = stackOut_47_0;
                        stackIn_48_1 = stackOut_47_1;
                        if (var11 != 0) {
                          break L13;
                        } else {
                          if (stackIn_48_0 <= stackIn_48_1) {
                            break L14;
                          } else {
                            param3.field_r = param3.field_r + 2;
                            if (var11 == 0) {
                              continue L12;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                    }
                    stackOut_54_0 = param3.field_r;
                    stackOut_54_1 = -2 + var7.field_m.length;
                    stackIn_55_0 = stackOut_54_0;
                    stackIn_55_1 = stackOut_54_1;
                    break L13;
                  }
                  if (stackIn_55_0 != stackIn_55_1) {
                    break L9;
                  } else {
                    if (var7.field_m[param3.field_r + 1] == 0) {
                      var8 = 1;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
              } else {
                break L9;
              }
            }
            L15: {
              if (param3.field_J < 0) {
                break L15;
              } else {
                if (null == var7.field_p) {
                  break L15;
                } else {
                  if ((((ic) this).field_F[param3.field_t] & 1) == 0) {
                    L16: {
                      if (0 > param3.field_p) {
                        break L16;
                      } else {
                        if (param3 == ((ic) this).field_x[param3.field_t][param3.field_p]) {
                          break L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                    L17: {
                      L18: {
                        if (0 < var7.field_g) {
                          break L18;
                        } else {
                          param3.field_J = param3.field_J + 128;
                          if (var11 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      param3.field_J = param3.field_J + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_g));
                      break L17;
                    }
                    L19: while (true) {
                      L20: {
                        L21: {
                          if (-2 + var7.field_p.length <= param3.field_B) {
                            break L21;
                          } else {
                            stackOut_84_0 = ~param3.field_J;
                            stackOut_84_1 = ~((var7.field_p[2 + param3.field_B] & 255) << 8);
                            stackIn_92_0 = stackOut_84_0;
                            stackIn_92_1 = stackOut_84_1;
                            stackIn_85_0 = stackOut_84_0;
                            stackIn_85_1 = stackOut_84_1;
                            if (var11 != 0) {
                              break L20;
                            } else {
                              if (stackIn_85_0 >= stackIn_85_1) {
                                break L21;
                              } else {
                                param3.field_B = param3.field_B + 2;
                                if (var11 == 0) {
                                  continue L19;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                        }
                        stackOut_91_0 = ~param3.field_B;
                        stackOut_91_1 = ~(var7.field_p.length - 2);
                        stackIn_92_0 = stackOut_91_0;
                        stackIn_92_1 = stackOut_91_1;
                        break L20;
                      }
                      if (stackIn_92_0 == stackIn_92_1) {
                        var8 = 1;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                  } else {
                    break L15;
                  }
                }
              }
            }
            if (var8 != 0) {
              L22: {
                L23: {
                  param3.field_A.g(param3.field_K);
                  if (null == param4) {
                    break L23;
                  } else {
                    param3.field_A.a(param4, param1, param0);
                    if (var11 == 0) {
                      break L22;
                    } else {
                      break L23;
                    }
                  }
                }
                param3.field_A.d(param0);
                break L22;
              }
              L24: {
                if (!param3.field_A.l()) {
                  break L24;
                } else {
                  ((ic) this).field_v.field_G.b((we) (Object) param3.field_A);
                  break L24;
                }
              }
              L25: {
                param3.d(4096);
                if (param3.field_J < 0) {
                  break L25;
                } else {
                  param3.b(param2 ^ 7143);
                  if (param3.field_p <= 0) {
                    break L25;
                  } else {
                    if (((ic) this).field_x[param3.field_t][param3.field_p] == param3) {
                      ((ic) this).field_x[param3.field_t][param3.field_p] = null;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                }
              }
              stackOut_117_0 = 1;
              stackIn_118_0 = stackOut_117_0;
              return stackIn_118_0 != 0;
            } else {
              L26: {
                if (param2 == 7139) {
                  break L26;
                } else {
                  this.c(118, 56);
                  break L26;
                }
              }
              int discarded$1 = -3;
              param3.field_A.a(param3.field_K, this.a(true, param3), this.a(param3));
              stackOut_122_0 = 0;
              stackIn_123_0 = stackOut_122_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var6 = decompiledCaughtException;
            stackOut_124_0 = (RuntimeException) var6;
            stackOut_124_1 = new StringBuilder().append("ic.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          L28: {
            stackOut_128_0 = (RuntimeException) (Object) stackIn_128_0;
            stackOut_128_1 = ((StringBuilder) (Object) stackIn_128_1).append(stackIn_128_2).append(',');
            stackIn_131_0 = stackOut_128_0;
            stackIn_131_1 = stackOut_128_1;
            stackIn_129_0 = stackOut_128_0;
            stackIn_129_1 = stackOut_128_1;
            if (param4 == null) {
              stackOut_131_0 = (RuntimeException) (Object) stackIn_131_0;
              stackOut_131_1 = (StringBuilder) (Object) stackIn_131_1;
              stackOut_131_2 = "null";
              stackIn_132_0 = stackOut_131_0;
              stackIn_132_1 = stackOut_131_1;
              stackIn_132_2 = stackOut_131_2;
              break L28;
            } else {
              stackOut_129_0 = (RuntimeException) (Object) stackIn_129_0;
              stackOut_129_1 = (StringBuilder) (Object) stackIn_129_1;
              stackOut_129_2 = "{...}";
              stackIn_132_0 = stackOut_129_0;
              stackIn_132_1 = stackOut_129_1;
              stackIn_132_2 = stackOut_129_2;
              break L28;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_132_0, stackIn_132_2 + ')');
        }
        return stackIn_123_0 != 0;
    }

    private final void a(int param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (param1) {
                  break L2;
                } else {
                  this.c(0, -1);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.g(-1, param0 + 1418611527);
              break L1;
            }
            this.e(param0, -7789);
            var3_int = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (16 <= var3_int) {
                    break L5;
                  } else {
                    ((ic) this).field_J[var3_int] = ((ic) this).field_z[var3_int];
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
                var3_int = 0;
                break L4;
              }
              L6: while (true) {
                L7: {
                  L8: {
                    if (var3_int >= 16) {
                      break L8;
                    } else {
                      ((ic) this).field_A[var3_int] = ec.a(((ic) this).field_z[var3_int], -128);
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
          throw ci.a((Throwable) (Object) var3, "ic.RA(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized boolean d(byte param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0 == 90) {
                break L1;
              } else {
                this.a(30, -72, -114, -17);
                break L1;
              }
            }
            stackOut_3_0 = ((ic) this).field_M.d();
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "ic.KA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final int a(hj param0) {
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
            var3_int = ((ic) this).field_I[param0.field_t];
            if (var3_int < 8192) {
              stackOut_6_0 = var3_int * param0.field_O + 32 >> 6;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = 16384 + -(32 + (128 - param0.field_O) * (-var3_int + 16384) >> 6);
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ic.C(");
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
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + -3 + ')');
        }
        return stackIn_7_0;
    }

    private final void a(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = 80 % ((17 - param0) / 50);
                if (~((ic) this).field_J[param2] != ~param1) {
                  ((ic) this).field_J[param2] = param1;
                  var5 = 0;
                  L3: while (true) {
                    if (128 <= var5) {
                      break L2;
                    } else {
                      ((ic) this).field_x[param2][var5] = null;
                      var5++;
                      if (var6 != 0) {
                        break L1;
                      } else {
                        if (var6 == 0) {
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
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) (Object) runtimeException, "ic.NA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void d(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (((ic) this).field_M.d()) {
                  var2_int = ((ic) this).field_M.field_e * ((ic) this).field_Q / tb.field_g;
                  L3: while (true) {
                    L4: {
                      var3 = ((ic) this).field_y + (long)var2_int * (long)param0;
                      if (((ic) this).field_X + -var3 < 0L) {
                        break L4;
                      } else {
                        ((ic) this).field_y = var3;
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
                    var5 = (int)(((long)var2_int + (-((ic) this).field_y + (((ic) this).field_X - 1L))) / (long)var2_int);
                    ((ic) this).field_y = ((ic) this).field_y + (long)var5 * (long)var2_int;
                    ((ic) this).field_v.d(var5);
                    param0 = param0 - var5;
                    this.e(1463);
                    if (!((ic) this).field_M.d()) {
                      break L2;
                    } else {
                      if (var6 == 0) {
                        continue L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              ((ic) this).field_v.d(param0);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "ic.Q(" + param0 + ')');
        }
    }

    final synchronized void a(byte param0) {
        RuntimeException runtimeException = null;
        ca var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            var2 = (ca) (Object) ((ic) this).field_bb.b(0);
            if (param0 == 25) {
              L1: while (true) {
                L2: {
                  L3: {
                    if (var2 == null) {
                      break L3;
                    } else {
                      var2.a((byte) 127);
                      var2 = (ca) (Object) ((ic) this).field_bb.a((byte) 118);
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
          throw ci.a((Throwable) (Object) runtimeException, "ic.GA(" + param0 + ')');
        }
    }

    private final void b(int param0, int param1, byte param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var4, "ic.TA(" + param0 + ',' + param1 + ',' + 108 + ')');
        }
    }

    private final void b(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ((ic) this).field_O[param1] = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var4, "ic.D(" + -27215 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(byte param0, hj param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        bj var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              var3_int = param1.field_o - -(param1.field_x * param1.field_y >> 12);
              var3_int = var3_int + (((ic) this).field_w[param1.field_t] * (-8192 + ((ic) this).field_O[param1.field_t]) >> 12);
              var4 = param1.field_E;
              if (var4.field_q <= 0) {
                break L1;
              } else {
                L2: {
                  if (0 < var4.field_o) {
                    break L2;
                  } else {
                    if (0 < ((ic) this).field_N[param1.field_t]) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  var5 = var4.field_o << 2;
                  var6 = var4.field_n << 1;
                  if (~param1.field_I <= ~var6) {
                    break L3;
                  } else {
                    var5 = param1.field_I * var5 / var6;
                    break L3;
                  }
                }
                var5 = var5 + (((ic) this).field_N[param1.field_t] >> 7);
                var7 = Math.sin(0.01227184630308513 * (double)(param1.field_C & 511));
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L1;
              }
            }
            L4: {
              var6 = 99 / ((-24 - param0) / 47);
              var5 = (int)(0.5 + (double)(256 * param1.field_q.field_p) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)tb.field_g);
              if (var5 >= 1) {
                stackOut_15_0 = var5;
                stackIn_16_0 = stackOut_15_0;
                break L4;
              } else {
                stackOut_13_0 = 1;
                stackIn_16_0 = stackOut_13_0;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("ic.MA(").append(param0).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_16_0;
    }

    final synchronized void a(int param0, int param1) {
        try {
            ((ic) this).field_W = param0;
            if (param1 != 1000000) {
                this.b(123, 3, -93, -39);
            }
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ic.EA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void e(int param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            if (param0 >= 0) {
              ((ic) this).field_K[param0] = 12800;
              ((ic) this).field_I[param0] = 8192;
              ((ic) this).field_ab[param0] = 16383;
              ((ic) this).field_O[param0] = 8192;
              ((ic) this).field_N[param0] = 0;
              ((ic) this).field_t[param0] = 8192;
              this.f(-10931, param0);
              this.d(param0, 0);
              ((ic) this).field_F[param0] = 0;
              ((ic) this).field_R[param0] = 32767;
              ((ic) this).field_w[param0] = 256;
              ((ic) this).field_L[param0] = 0;
              this.a(param0, 8192, (byte) -17);
              break L0;
            } else {
              param0 = 0;
              L1: while (true) {
                L2: {
                  if (param0 >= 16) {
                    break L2;
                  } else {
                    this.e(param0, -7789);
                    param0++;
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
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3, "ic.DA(" + param0 + ',' + -7789 + ')');
        }
    }

    final synchronized we b() {
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
          throw ci.a((Throwable) (Object) var1, "ic.SA()");
        }
        return (we) (Object) stackIn_1_0;
    }

    final synchronized boolean a(int param0, tg param1, int param2, ub param3, cm param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        ce var8 = null;
        int var9 = 0;
        ca var10 = null;
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
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              param1.b();
              var6_int = 1;
              var7 = null;
              if (0 < param0) {
                var7 = (Object) (Object) new int[]{param0};
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2 == 21687) {
                break L2;
              } else {
                this.e(-35);
                break L2;
              }
            }
            var8 = (ce) (Object) param1.field_o.b(0);
            L3: while (true) {
              L4: {
                L5: {
                  if (null == var8) {
                    break L5;
                  } else {
                    var9 = (int)var8.field_j;
                    var10 = (ca) (Object) ((ic) this).field_bb.a((long)var9, param2 ^ 21706);
                    if (var11 != 0) {
                      break L4;
                    } else {
                      L6: {
                        L7: {
                          if (null == var10) {
                            L8: {
                              int discarded$1 = 40;
                              var10 = vl.a(param4, var9);
                              if (null != var10) {
                                break L8;
                              } else {
                                var6_int = 0;
                                if (var11 == 0) {
                                  break L6;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            ((ic) this).field_bb.a((long)var9, (ck) (Object) var10, -1816);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        if (var10.a(var8.field_s, param2 + -34109, param3, (int[]) var7)) {
                          break L6;
                        } else {
                          var6_int = 0;
                          break L6;
                        }
                      }
                      var8 = (ce) (Object) param1.field_o.a((byte) 94);
                      if (var11 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                if (var6_int == 0) {
                  break L4;
                } else {
                  param1.a();
                  break L4;
                }
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
            stackOut_28_1 = new StringBuilder().append("ic.WA(").append(param0).append(',');
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
          throw ci.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ')');
        }
        return stackIn_27_0 != 0;
    }

    final synchronized void a(boolean param0, boolean param1, tg param2) {
        RuntimeException var4 = null;
        Object stackIn_1_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = this;
              stackIn_3_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (param0) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_1_0 = this;
                stackOut_1_1 = 1;
                stackIn_4_0 = stackOut_1_0;
                stackIn_4_1 = stackOut_1_1;
                break L1;
              }
            }
            this.a(stackIn_4_1 != 0, param1, param2, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("ic.S(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
            Throwable throwable = null;
            RuntimeException runtimeException = null;
            String var3 = null;
            String var4 = null;
            String var5 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            try {
              L0: {
                ja.field_h = param1;
                try {
                  L1: {
                    L2: {
                      var3 = param2.getParameter("cookieprefix");
                      if (param0 <= -123) {
                        break L2;
                      } else {
                        field_db = null;
                        break L2;
                      }
                    }
                    L3: {
                      var4 = param2.getParameter("cookiehost");
                      var5 = var3 + "session=" + param1 + "; version=1; path=/; domain=" + var4;
                      if (param1.length() != 0) {
                        break L3;
                      } else {
                        var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                        break L3;
                      }
                    }
                    hn.a(param2, 27781, "document.cookie=\"" + var5 + "\"");
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    throwable = decompiledCaughtException;
                    break L4;
                  }
                }
                oh.a(param2, (byte) 119);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) runtimeException;
                stackOut_11_1 = new StringBuilder().append("ic.QA(").append(param0).append(',');
                stackIn_14_0 = stackOut_11_0;
                stackIn_14_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param1 == null) {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L5;
                } else {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "{...}";
                  stackIn_15_0 = stackOut_12_0;
                  stackIn_15_1 = stackOut_12_1;
                  stackIn_15_2 = stackOut_12_2;
                  break L5;
                }
              }
              L6: {
                stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
                stackIn_18_0 = stackOut_15_0;
                stackIn_18_1 = stackOut_15_1;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                if (param2 == null) {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L6;
                } else {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "{...}";
                  stackIn_19_0 = stackOut_16_0;
                  stackIn_19_1 = stackOut_16_1;
                  stackIn_19_2 = stackOut_16_2;
                  break L6;
                }
              }
              throw ci.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            var3_int = param1 & 240;
            if (var3_int != 128) {
              if (var3_int != 144) {
                if (var3_int == 160) {
                  var4 = param1 & 15;
                  var5 = param1 >> 8 & 127;
                  var6 = param1 >> 16 & 127;
                  this.a(115, var5, var6, var4);
                  return;
                } else {
                  if (var3_int != 176) {
                    if (var3_int != 192) {
                      if (208 != var3_int) {
                        if (224 != var3_int) {
                          var3_int = 255 & param1;
                          if (var3_int == 255) {
                            this.a(-1, true);
                            decompiledRegionSelector0 = 0;
                            break L0;
                          } else {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        } else {
                          var4 = param1 & 15;
                          var5 = (16256 & param1 >> 9) - -(127 & param1 >> 8);
                          this.b(-27215, var4, var5);
                          return;
                        }
                      } else {
                        var4 = param1 & 15;
                        var5 = (32759 & param1) >> 8;
                        this.b(var5, var4, (byte) 108);
                        return;
                      }
                    } else {
                      var4 = 15 & param1;
                      var5 = param1 >> 8 & 127;
                      this.a(-36, var5 + ((ic) this).field_A[var4], var4);
                      return;
                    }
                  } else {
                    L1: {
                      var4 = 15 & param1;
                      var5 = param1 >> 8 & 127;
                      var6 = param1 >> 16 & 127;
                      if (var5 != 0) {
                        break L1;
                      } else {
                        ((ic) this).field_A[var4] = ec.a(-2080769, ((ic) this).field_A[var4]) + (var6 << 14);
                        break L1;
                      }
                    }
                    L2: {
                      if (var5 == 32) {
                        ((ic) this).field_A[var4] = ec.a(((ic) this).field_A[var4], -16257) - -(var6 << 7);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (var5 != 1) {
                        break L3;
                      } else {
                        ((ic) this).field_N[var4] = ec.a(-16257, ((ic) this).field_N[var4]) + (var6 << 7);
                        break L3;
                      }
                    }
                    L4: {
                      if (33 != var5) {
                        break L4;
                      } else {
                        ((ic) this).field_N[var4] = ec.a(-128, ((ic) this).field_N[var4]) - -var6;
                        break L4;
                      }
                    }
                    L5: {
                      if (var5 == 5) {
                        ((ic) this).field_t[var4] = ec.a(((ic) this).field_t[var4], -16257) + (var6 << 7);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (37 != var5) {
                        break L6;
                      } else {
                        ((ic) this).field_t[var4] = var6 + ec.a(-128, ((ic) this).field_t[var4]);
                        break L6;
                      }
                    }
                    L7: {
                      if (var5 != 7) {
                        break L7;
                      } else {
                        ((ic) this).field_K[var4] = ec.a(-16257, ((ic) this).field_K[var4]) + (var6 << 7);
                        break L7;
                      }
                    }
                    L8: {
                      if (var5 == 39) {
                        ((ic) this).field_K[var4] = ec.a(-128, ((ic) this).field_K[var4]) + var6;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (var5 == 10) {
                        ((ic) this).field_I[var4] = ec.a(((ic) this).field_I[var4], -16257) + (var6 << 7);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (var5 != 42) {
                        break L10;
                      } else {
                        ((ic) this).field_I[var4] = var6 + ec.a(((ic) this).field_I[var4], -128);
                        break L10;
                      }
                    }
                    L11: {
                      if (var5 == 11) {
                        ((ic) this).field_ab[var4] = (var6 << 7) + ec.a(((ic) this).field_ab[var4], -16257);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (var5 != 43) {
                        break L12;
                      } else {
                        ((ic) this).field_ab[var4] = var6 + ec.a(((ic) this).field_ab[var4], -128);
                        break L12;
                      }
                    }
                    L13: {
                      if (var5 != 64) {
                        break L13;
                      } else {
                        L14: {
                          if (64 > var6) {
                            break L14;
                          } else {
                            ((ic) this).field_F[var4] = vn.a(((ic) this).field_F[var4], 1);
                            if (var8 == 0) {
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        ((ic) this).field_F[var4] = ec.a(((ic) this).field_F[var4], -2);
                        break L13;
                      }
                    }
                    L15: {
                      if (var5 != 65) {
                        break L15;
                      } else {
                        L16: {
                          if (64 > var6) {
                            break L16;
                          } else {
                            ((ic) this).field_F[var4] = vn.a(((ic) this).field_F[var4], 2);
                            if (var8 == 0) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        this.f(-10931, var4);
                        ((ic) this).field_F[var4] = ec.a(((ic) this).field_F[var4], -3);
                        break L15;
                      }
                    }
                    L17: {
                      if (var5 != 99) {
                        break L17;
                      } else {
                        ((ic) this).field_R[var4] = ec.a(127, ((ic) this).field_R[var4]) - -(var6 << 7);
                        break L17;
                      }
                    }
                    L18: {
                      if (var5 == 98) {
                        ((ic) this).field_R[var4] = var6 + ec.a(((ic) this).field_R[var4], 16256);
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    L19: {
                      if (var5 != 101) {
                        break L19;
                      } else {
                        ((ic) this).field_R[var4] = (var6 << 7) + (ec.a(127, ((ic) this).field_R[var4]) + 16384);
                        break L19;
                      }
                    }
                    L20: {
                      if (var5 == 100) {
                        ((ic) this).field_R[var4] = var6 + (ec.a(16256, ((ic) this).field_R[var4]) + 16384);
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    L21: {
                      if (120 == var5) {
                        this.g(var4, 1418611526);
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    L22: {
                      if (121 == var5) {
                        this.e(var4, -7789);
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    L23: {
                      if (123 == var5) {
                        this.c(0, var4);
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      if (6 == var5) {
                        var7 = ((ic) this).field_R[var4];
                        if (var7 == 16384) {
                          ((ic) this).field_w[var4] = (var6 << 7) + ec.a(((ic) this).field_w[var4], -16257);
                          break L24;
                        } else {
                          break L24;
                        }
                      } else {
                        break L24;
                      }
                    }
                    L25: {
                      if (var5 == 38) {
                        var7 = ((ic) this).field_R[var4];
                        if (var7 == 16384) {
                          ((ic) this).field_w[var4] = ec.a(((ic) this).field_w[var4], -128) + var6;
                          break L25;
                        } else {
                          break L25;
                        }
                      } else {
                        break L25;
                      }
                    }
                    L26: {
                      if (var5 == 16) {
                        ((ic) this).field_L[var4] = ec.a(-16257, ((ic) this).field_L[var4]) + (var6 << 7);
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                    L27: {
                      if (var5 == 48) {
                        ((ic) this).field_L[var4] = ec.a(-128, ((ic) this).field_L[var4]) + var6;
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                    L28: {
                      if (var5 != 81) {
                        break L28;
                      } else {
                        L29: {
                          if (64 <= var6) {
                            break L29;
                          } else {
                            this.d(var4, 0);
                            ((ic) this).field_F[var4] = ec.a(((ic) this).field_F[var4], -5);
                            if (var8 == 0) {
                              break L28;
                            } else {
                              break L29;
                            }
                          }
                        }
                        ((ic) this).field_F[var4] = vn.a(((ic) this).field_F[var4], 4);
                        break L28;
                      }
                    }
                    L30: {
                      if (var5 == 17) {
                        this.a(var4, (((ic) this).field_Z[var4] & -16257) + (var6 << 7), (byte) -17);
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                    L31: {
                      if (var5 != 49) {
                        break L31;
                      } else {
                        this.a(var4, (-128 & ((ic) this).field_Z[var4]) - -var6, (byte) -17);
                        break L31;
                      }
                    }
                    return;
                  }
                }
              } else {
                L32: {
                  L33: {
                    var4 = param1 & 15;
                    var5 = (param1 & 32570) >> 8;
                    var6 = (8381338 & param1) >> 16;
                    if (var6 > 0) {
                      break L33;
                    } else {
                      this.a(var4, (byte) -122, var5, 64);
                      if (var8 == 0) {
                        break L32;
                      } else {
                        break L33;
                      }
                    }
                  }
                  this.b(var5, 111, var4, var6);
                  break L32;
                }
                return;
              }
            } else {
              var4 = 15 & param1;
              var5 = 127 & param1 >> 8;
              var6 = (param1 & 8382781) >> 16;
              this.a(var4, (byte) -125, var5, var6);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3, "ic.AB(" + 21766 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, int param1, hj param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var5 = 58 % ((55 - param1) / 51);
                  var4_int = param2.field_q.field_r.length;
                  if (!param0) {
                    break L3;
                  } else {
                    if (param2.field_q.field_s) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var6 = (int)((long)var4_int * (long)((ic) this).field_L[param2.field_t] >> 6);
                if (SteelSentinels.field_G == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              var7 = var4_int - (-var4_int - -param2.field_q.field_q);
              var4_int = var4_int << 8;
              var6 = (int)((long)((ic) this).field_L[param2.field_t] * (long)var7 >> 6);
              if (var6 < var4_int) {
                break L1;
              } else {
                var6 = -var6 + -1 + (var4_int + var4_int);
                param2.field_A.a(true);
                break L1;
              }
            }
            param2.field_A.i(var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("ic.H(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L4;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    final static gh f(int param0) {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        gh stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        gh stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 == 3443) {
              stackOut_3_0 = ac.k(param0 ^ -8138);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (gh) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "ic.A(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final void f(int param0, int param1) {
        RuntimeException var3 = null;
        hj var3_ref = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                if (0 != (((ic) this).field_F[param1] & 2)) {
                  var3_ref = (hj) (Object) ((ic) this).field_v.field_F.e(13058);
                  L3: while (true) {
                    if (null == var3_ref) {
                      break L2;
                    } else {
                      if (var4 != 0) {
                        break L1;
                      } else {
                        L4: {
                          if (~var3_ref.field_t != ~param1) {
                            break L4;
                          } else {
                            if (((ic) this).field_U[param1][var3_ref.field_z] == null) {
                              if (var3_ref.field_J < 0) {
                                var3_ref.field_J = 0;
                                break L4;
                              } else {
                                break L4;
                              }
                            } else {
                              break L4;
                            }
                          }
                        }
                        var3_ref = (hj) (Object) ((ic) this).field_v.field_F.a((byte) -65);
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
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3, "ic.HA(" + -10931 + ',' + param1 + ')');
        }
    }

    final static ah a(int param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        ul var4 = null;
        Object var5 = null;
        Object var6 = null;
        ah var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        dd var17 = null;
        String var18 = null;
        int var19 = 0;
        kg stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        kg stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        kg stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        gh stackIn_35_0 = null;
        gh stackIn_37_0 = null;
        gh stackIn_38_0 = null;
        String stackIn_38_1 = null;
        gh stackIn_39_0 = null;
        gh stackIn_41_0 = null;
        gh stackIn_42_0 = null;
        String stackIn_42_1 = null;
        int stackIn_46_0 = 0;
        Object stackIn_104_0 = null;
        RuntimeException decompiledCaughtException = null;
        kg stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        kg stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        kg stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        gh stackOut_34_0 = null;
        gh stackOut_37_0 = null;
        String stackOut_37_1 = null;
        gh stackOut_35_0 = null;
        String stackOut_35_1 = null;
        gh stackOut_38_0 = null;
        gh stackOut_41_0 = null;
        String stackOut_41_1 = null;
        gh stackOut_39_0 = null;
        String stackOut_39_1 = null;
        int stackOut_45_0 = 0;
        int stackOut_43_0 = 0;
        Object stackOut_103_0 = null;
        var19 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              stackOut_1_0 = km.field_j.field_Xb;
              stackOut_1_1 = 2;
              stackOut_1_2 = db.field_b + 2;
              stackOut_1_3 = (6 + 3 * db.field_b) * param0;
              stackIn_4_0 = stackOut_1_0;
              stackIn_4_1 = stackOut_1_1;
              stackIn_4_2 = stackOut_1_2;
              stackIn_4_3 = stackOut_1_3;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              stackIn_2_3 = stackOut_1_3;
              if (km.field_j.field_Xb != la.field_c) {
                stackOut_4_0 = (kg) (Object) stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = stackIn_4_2;
                stackOut_4_3 = stackIn_4_3;
                stackOut_4_4 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                stackIn_5_3 = stackOut_4_3;
                stackIn_5_4 = stackOut_4_4;
                break L1;
              } else {
                stackOut_2_0 = (kg) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = stackIn_2_3;
                stackOut_2_4 = 1;
                stackIn_5_0 = stackOut_2_0;
                stackIn_5_1 = stackOut_2_1;
                stackIn_5_2 = stackOut_2_2;
                stackIn_5_3 = stackOut_2_3;
                stackIn_5_4 = stackOut_2_4;
                break L1;
              }
            }
            var3_int = ((kg) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_5_4 != 0, param2, (byte) -41) ? 1 : 0;
            var4 = km.field_j.field_Wb.field_M;
            L2: {
              var5 = null;
              if (qc.field_P != 2) {
                L3: {
                  L4: {
                    vc.field_h.field_S = lg.field_a;
                    ig.field_m.field_T = false;
                    if (qc.field_P != 1) {
                      break L4;
                    } else {
                      km.field_j.field_Xb.field_Tb.field_S = kd.field_q;
                      if (var19 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  km.field_j.field_Xb.field_Tb.field_S = eb.field_q;
                  break L3;
                }
                ue.a(0, km.field_j.field_Wb);
                break L2;
              } else {
                ig.field_m.field_T = true;
                vc.field_h.field_S = db.a(eb.field_r, -66, new String[1]);
                km.field_j.field_Xb.field_Tb.field_S = null;
                var6 = null;
                var7 = (ah) (Object) var4.e(13058);
                L5: while (true) {
                  L6: {
                    L7: {
                      if (null == var7) {
                        break L7;
                      } else {
                        var8 = 0;
                        if (var19 != 0) {
                          break L6;
                        } else {
                          L8: {
                            if (null == var7.field_M) {
                              var7.field_Ub = new gh(0L, bb.field_W);
                              var7.a(var7.field_Ub, 119);
                              var7.field_ec = new gh(0L, SteelSentinels.field_J);
                              var7.a(var7.field_ec, 125);
                              var7.field_cc = new gh(0L, bb.field_W);
                              var7.a(var7.field_cc, 125);
                              var7.field_ec.field_Kb = 2;
                              var7.h(109);
                              var8 = 1;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          L9: {
                            L10: {
                              var7.field_zb = km.field_j.field_Wb.field_zb;
                              var9 = 0;
                              if (null == var7.field_ac) {
                                break L10;
                              } else {
                                L11: {
                                  if (var7.field_ac == nn.field_f) {
                                    break L11;
                                  } else {
                                    var11 = 16777062;
                                    var10 = 13421568;
                                    if (var19 == 0) {
                                      break L9;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                var11 = 6750054;
                                var10 = 52224;
                                if (var19 == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            var10 = 13369344;
                            var11 = 16737894;
                            break L9;
                          }
                          L12: {
                            var12 = 0;
                            if (var7.field_Vb == null) {
                              break L12;
                            } else {
                              if (!var7.field_Vb.equals((Object) (Object) "")) {
                                var7.field_cc.field_Pb = ce.field_p;
                                var7.field_cc.field_rb = var11;
                                var12 = 1;
                                var7.field_cc.a(0, var9, db.field_b, 0, 3 + ce.field_p.field_z);
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                          }
                          L13: {
                            var7.field_ec.field_rb = var11;
                            var7.field_Ub.field_rb = var11;
                            var7.field_ec.field_Mb = var11;
                            var7.field_Ub.field_Mb = var11;
                            var7.field_ec.field_nb = var10;
                            var7.field_Ub.field_nb = var10;
                            var7.field_ec.field_xb = var11;
                            var7.field_Ub.field_xb = var11;
                            var13 = 0;
                            var14 = -82 + var7.field_zb;
                            if (var12 == 0) {
                              break L13;
                            } else {
                              var13 = ce.field_p.field_z + 3;
                              var14 = var14 - var13;
                              break L13;
                            }
                          }
                          L14: {
                            stackOut_34_0 = var7.field_Ub;
                            stackIn_37_0 = stackOut_34_0;
                            stackIn_35_0 = stackOut_34_0;
                            if (var14 > 0) {
                              stackOut_37_0 = (gh) (Object) stackIn_37_0;
                              stackOut_37_1 = mi.a(var7.field_Ub.field_L, var7.field_dc, var14);
                              stackIn_38_0 = stackOut_37_0;
                              stackIn_38_1 = stackOut_37_1;
                              break L14;
                            } else {
                              stackOut_35_0 = (gh) (Object) stackIn_35_0;
                              stackOut_35_1 = var7.field_dc;
                              stackIn_38_0 = stackOut_35_0;
                              stackIn_38_1 = stackOut_35_1;
                              break L14;
                            }
                          }
                          L15: {
                            stackIn_38_0.field_S = stackIn_38_1;
                            var7.field_Ub.a(0, var9, db.field_b, var13, var14);
                            stackOut_38_0 = var7.field_ec;
                            stackIn_41_0 = stackOut_38_0;
                            stackIn_39_0 = stackOut_38_0;
                            if (null == var7.field_ac) {
                              stackOut_41_0 = (gh) (Object) stackIn_41_0;
                              stackOut_41_1 = oc.field_c;
                              stackIn_42_0 = stackOut_41_0;
                              stackIn_42_1 = stackOut_41_1;
                              break L15;
                            } else {
                              stackOut_39_0 = (gh) (Object) stackIn_39_0;
                              stackOut_39_1 = var7.field_ac;
                              stackIn_42_0 = stackOut_39_0;
                              stackIn_42_1 = stackOut_39_1;
                              break L15;
                            }
                          }
                          L16: {
                            stackIn_42_0.field_S = stackIn_42_1;
                            var7.field_ec.a(0, var9, db.field_b, -80 + var7.field_zb, 80);
                            if (var7.field_Ub.field_S.equals((Object) (Object) var7.field_dc)) {
                              stackOut_45_0 = 0;
                              stackIn_46_0 = stackOut_45_0;
                              break L16;
                            } else {
                              stackOut_43_0 = 1;
                              stackIn_46_0 = stackOut_43_0;
                              break L16;
                            }
                          }
                          L17: {
                            var15 = stackIn_46_0;
                            var9 = var9 + db.field_b;
                            if (var3_int != 0) {
                              break L17;
                            } else {
                              var7.field_lb = -var7.field_Lb + var9;
                              break L17;
                            }
                          }
                          L18: {
                            if (var8 != 0) {
                              km.field_j.field_Wb.a(2, (byte) 96, (gh) var6, (gh) (Object) var7);
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                          L19: {
                            L20: {
                              var6 = (Object) (Object) var7;
                              if (var7.field_cc == null) {
                                break L20;
                              } else {
                                if (!var7.field_cc.field_kb) {
                                  break L20;
                                } else {
                                  ll.field_i = var7.field_Vb;
                                  if (var19 == 0) {
                                    break L19;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                            }
                            L21: {
                              if (var7.field_Eb == 0) {
                                break L21;
                              } else {
                                L22: {
                                  var16 = var7.field_dc;
                                  kk.a((gh) (Object) var7, -1, -1, (int[]) null, var16, (String) null, 1073741824, 0L, km.field_j.field_Xb);
                                  var5 = (Object) (Object) var7;
                                  if (null == var7.field_ac) {
                                    break L22;
                                  } else {
                                    if (ob.a((byte) -38, an.field_i.field_k)) {
                                      break L22;
                                    } else {
                                      if (!fj.field_e) {
                                        L23: {
                                          if (!uc.field_g) {
                                            var17 = an.field_i;
                                            var18 = db.a(rj.field_c, -67, new String[1]);
                                            var17.field_j.a(2, 8, var18);
                                            break L23;
                                          } else {
                                            break L23;
                                          }
                                        }
                                        var17 = an.field_i;
                                        var18 = db.a(dg.field_b, -96, new String[1]);
                                        var17.field_j.a(2, 18, var18);
                                        break L22;
                                      } else {
                                        break L22;
                                      }
                                    }
                                  }
                                }
                                if (var19 == 0) {
                                  break L19;
                                } else {
                                  break L21;
                                }
                              }
                            }
                            if (!var7.field_Ub.field_kb) {
                              break L19;
                            } else {
                              if (var15 != 0) {
                                ll.field_i = var7.field_dc;
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                          }
                          var7 = (ah) (Object) var4.a((byte) -123);
                          if (var19 == 0) {
                            continue L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    if (km.field_j.field_bc.field_Eb == 0) {
                      break L6;
                    } else {
                      kc.field_y = new el(km.field_j.field_bc.field_Rb, km.field_j.field_bc.field_cb, km.field_j.field_bc.field_zb, km.field_j.field_bc.field_Lb, ij.field_S, kf.field_y, bd.field_f, bd.field_f);
                      ol.field_bc = 0;
                      break L6;
                    }
                  }
                  L24: {
                    if (km.field_j.field_Sb.field_Eb != 0) {
                      kc.field_y = new el(km.field_j.field_Sb.field_Rb, km.field_j.field_Sb.field_cb, km.field_j.field_Sb.field_zb, km.field_j.field_Sb.field_Lb, vk.field_b, kf.field_y, bd.field_f, bd.field_f);
                      ol.field_bc = 1;
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  break L2;
                }
              }
            }
            stackOut_103_0 = var5;
            stackIn_104_0 = stackOut_103_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3, "ic.BA(" + param0 + ',' + 18 + ',' + param2 + ')');
        }
        return (ah) (Object) stackIn_104_0;
    }

    final boolean a(hj param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_13_0 = 0;
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
            if (param0.field_A != null) {
              L1: {
                if (!param1) {
                  break L1;
                } else {
                  ((ic) this).field_K = null;
                  break L1;
                }
              }
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              break L0;
            } else {
              L2: {
                if (param0.field_J < 0) {
                  break L2;
                } else {
                  param0.b(4);
                  if (param0.field_p <= 0) {
                    break L2;
                  } else {
                    if (param0 == ((ic) this).field_x[param0.field_t][param0.field_p]) {
                      ((ic) this).field_x[param0.field_t][param0.field_p] = null;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_13_0 = 1;
              stackIn_14_0 = stackOut_13_0;
              return stackIn_14_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("ic.M(");
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L3;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ')');
        }
        return stackIn_19_0 != 0;
    }

    private final int a(boolean param0, hj param1) {
        RuntimeException var3 = null;
        bj var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_2_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            if (((ic) this).field_Y[param1.field_t] != 0) {
              var3_ref = param1.field_E;
              var4 = ((ic) this).field_K[param1.field_t] * ((ic) this).field_ab[param1.field_t] + 4096 >> 13;
              var4 = 16384 + var4 * var4 >> 15;
              var4 = 16384 + var4 * param1.field_L >> 15;
              var4 = 128 + var4 * ((ic) this).field_W >> 8;
              L1: {
                var4 = 128 + ((ic) this).field_Y[param1.field_t] * var4 >> 8;
                if (var3_ref.field_i > 0) {
                  var4 = (int)(Math.pow(0.5, (double)var3_ref.field_i * (0.00001953125 * (double)param1.field_M)) * (double)var4 + 0.5);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var3_ref.field_m == null) {
                  break L2;
                } else {
                  L3: {
                    var5 = param1.field_D;
                    var6 = var3_ref.field_m[param1.field_r - -1];
                    if (var3_ref.field_m.length - 2 <= param1.field_r) {
                      break L3;
                    } else {
                      var7 = (var3_ref.field_m[param1.field_r] & 255) << 8;
                      var8 = (var3_ref.field_m[2 + param1.field_r] & 255) << 8;
                      var6 = var6 + (var5 - var7) * (var3_ref.field_m[3 + param1.field_r] - var6) / (-var7 + var8);
                      break L3;
                    }
                  }
                  var4 = 32 + var6 * var4 >> 6;
                  break L2;
                }
              }
              L4: {
                if (0 >= param1.field_J) {
                  break L4;
                } else {
                  if (null == var3_ref.field_p) {
                    break L4;
                  } else {
                    L5: {
                      var5 = param1.field_J;
                      var6 = var3_ref.field_p[param1.field_B + 1];
                      if (param1.field_B < -2 + var3_ref.field_p.length) {
                        var7 = (255 & var3_ref.field_p[param1.field_B]) << 8;
                        var8 = (255 & var3_ref.field_p[2 + param1.field_B]) << 8;
                        var6 = var6 + (-var6 + var3_ref.field_p[3 + param1.field_B]) * (var5 - var7) / (var8 - var7);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var4 = 32 + var4 * var6 >> 6;
                    break L4;
                  }
                }
              }
              stackOut_23_0 = var4;
              stackIn_24_0 = stackOut_23_0;
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
            stackOut_25_0 = (RuntimeException) var3;
            stackOut_25_1 = new StringBuilder().append("ic.OA(").append(true).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L6;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L6;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ')');
        }
        return stackIn_24_0;
    }

    final synchronized void a(byte param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 61) {
                break L1;
              } else {
                boolean discarded$2 = ((ic) this).a(-114, 85, 51, (hj) null, (int[]) null);
                break L1;
              }
            }
            ((ic) this).field_Q = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3, "ic.E(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized int a() {
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
          throw ci.a((Throwable) (Object) var1, "ic.DB()");
        }
        return stackIn_1_0;
    }

    private final void b(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        hj var5_ref = null;
        ca var5_ref2 = null;
        sk var6 = null;
        int var6_int = 0;
        hj var7 = null;
        hj var8 = null;
        int var9 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        Object stackIn_31_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        Object stackOut_30_0 = null;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        Object stackOut_31_0 = null;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        var9 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                this.a(param2, (byte) -87, param0, 64);
                if (0 == (2 & ((ic) this).field_F[param2])) {
                  break L2;
                } else {
                  var5_ref = (hj) (Object) ((ic) this).field_v.field_F.b(1063677678);
                  L3: while (true) {
                    if (null == var5_ref) {
                      break L2;
                    } else {
                      stackOut_4_0 = ~var5_ref.field_t;
                      stackOut_4_1 = ~param2;
                      stackIn_17_0 = stackOut_4_0;
                      stackIn_17_1 = stackOut_4_1;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      if (var9 != 0) {
                        break L1;
                      } else {
                        L4: {
                          if (stackIn_5_0 != stackIn_5_1) {
                            break L4;
                          } else {
                            if (var5_ref.field_J < 0) {
                              ((ic) this).field_U[param2][var5_ref.field_z] = null;
                              ((ic) this).field_U[param2][param0] = var5_ref;
                              var6_int = (var5_ref.field_y * var5_ref.field_x >> 12) + var5_ref.field_o;
                              var5_ref.field_o = var5_ref.field_o + (-var5_ref.field_z + param0 << 8);
                              var5_ref.field_y = 4096;
                              var5_ref.field_x = -var5_ref.field_o + var6_int;
                              var5_ref.field_z = param0;
                              return;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var5_ref = (hj) (Object) ((ic) this).field_v.field_F.a(-2137);
                        if (var9 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_16_0 = param1;
              stackOut_16_1 = 60;
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              break L1;
            }
            L5: {
              if (stackIn_17_0 > stackIn_17_1) {
                break L5;
              } else {
                ((ic) this).field_Q = -42;
                break L5;
              }
            }
            var5_ref2 = (ca) (Object) ((ic) this).field_bb.a((long)((ic) this).field_J[param2], 124);
            if (null != var5_ref2) {
              var6 = var5_ref2.field_x[param0];
              if (null == var6) {
                return;
              } else {
                L6: {
                  L7: {
                    var7 = new hj();
                    var7.field_t = param2;
                    var7.field_q = var6;
                    var7.field_N = var5_ref2;
                    var7.field_E = var5_ref2.field_u[param0];
                    var7.field_p = var5_ref2.field_v[param0];
                    var7.field_z = param0;
                    var7.field_L = param3 * (param3 * var5_ref2.field_t * var5_ref2.field_q[param0]) + 1024 >> 11;
                    var7.field_O = var5_ref2.field_o[param0] & 255;
                    var7.field_o = -(var5_ref2.field_p[param0] & 32767) + (param0 << 8);
                    var7.field_J = -1;
                    var7.field_M = 0;
                    var7.field_B = 0;
                    var7.field_r = 0;
                    var7.field_D = 0;
                    if (0 != ((ic) this).field_L[param2]) {
                      break L7;
                    } else {
                      int discarded$2 = -3;
                      var7.field_A = em.a(var6, this.a((byte) -78, var7), this.a(true, var7), this.a(var7));
                      if (var9 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    int discarded$3 = -3;
                    var7.field_A = em.a(var6, this.a((byte) 100, var7), 0, this.a(var7));
                    stackOut_30_0 = this;
                    stackIn_35_0 = stackOut_30_0;
                    stackIn_31_0 = stackOut_30_0;
                    if (var5_ref2.field_p[param0] >= 0) {
                      stackOut_35_0 = this;
                      stackOut_35_1 = 0;
                      stackIn_36_0 = stackOut_35_0;
                      stackIn_36_1 = stackOut_35_1;
                      break L8;
                    } else {
                      stackOut_31_0 = this;
                      stackIn_33_0 = stackOut_31_0;
                      stackOut_33_0 = this;
                      stackOut_33_1 = 1;
                      stackIn_36_0 = stackOut_33_0;
                      stackIn_36_1 = stackOut_33_1;
                      break L8;
                    }
                  }
                  ((ic) this).a(stackIn_36_1 != 0, -34, var7);
                  break L6;
                }
                L9: {
                  if (var5_ref2.field_p[param0] >= 0) {
                    break L9;
                  } else {
                    var7.field_A.h(-1);
                    break L9;
                  }
                }
                L10: {
                  if (0 > var7.field_p) {
                    break L10;
                  } else {
                    L11: {
                      var8 = ((ic) this).field_x[param2][var7.field_p];
                      if (var8 == null) {
                        break L11;
                      } else {
                        if (var8.field_J >= 0) {
                          break L11;
                        } else {
                          ((ic) this).field_U[param2][var8.field_z] = null;
                          var8.field_J = 0;
                          break L11;
                        }
                      }
                    }
                    ((ic) this).field_x[param2][var7.field_p] = var7;
                    break L10;
                  }
                }
                ((ic) this).field_v.field_F.a(3, (ck) (Object) var7);
                ((ic) this).field_U[param2][param0] = var7;
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var5, "ic.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final synchronized void a(boolean param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ((ic) this).field_M.g();
            ((ic) this).field_H = null;
            this.a(-1, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var3, "ic.L(" + param0 + ',' + 27830696 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        try {
            int var5_int = -77 / ((-55 - param0) / 46);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ic.R(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void a(int param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (param0 < 0) {
                    break L3;
                  } else {
                    ((ic) this).field_Y[param0] = param2;
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var4_int = 0;
                L4: while (true) {
                  if (var4_int >= 16) {
                    break L2;
                  } else {
                    ((ic) this).field_Y[var4_int] = param2;
                    var4_int++;
                    if (var5 != 0) {
                      break L1;
                    } else {
                      if (var5 == 0) {
                        continue L4;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              if (param1 >= 2) {
                break L1;
              } else {
                field_T = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var4, "ic.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
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
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (!((ic) this).field_M.d()) {
                break L1;
              } else {
                var4_int = ((ic) this).field_Q * ((ic) this).field_M.field_e / tb.field_g;
                L2: while (true) {
                  L3: {
                    var5 = (long)param2 * (long)var4_int + ((ic) this).field_y;
                    if (-var5 + ((ic) this).field_X >= 0L) {
                      ((ic) this).field_y = var5;
                      if (var8 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var7 = (int)((-1L + (-((ic) this).field_y + ((ic) this).field_X + (long)var4_int)) / (long)var4_int);
                  ((ic) this).field_y = ((ic) this).field_y + (long)var7 * (long)var4_int;
                  ((ic) this).field_v.a(param0, param1, var7);
                  this.e(1463);
                  param1 = param1 + var7;
                  param2 = param2 - var7;
                  if (!((ic) this).field_M.d()) {
                    break L1;
                  } else {
                    if (var8 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            ((ic) this).field_v.a(param0, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("ic.K(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_T = null;
            field_D = null;
            field_eb = null;
            field_B = null;
            field_E = null;
            field_db = null;
            field_cb = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "ic.J(" + false + ')');
        }
    }

    private final void c(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ((ic) this).field_z[param2] = param1;
            ((ic) this).field_A[param2] = ec.a(param1, -128);
            this.a(94, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var4, "ic.T(" + -2043373017 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void e(int param0) {
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
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var2_int = ((ic) this).field_V;
              var3 = ((ic) this).field_s;
              var4 = ((ic) this).field_X;
              if (null == ((ic) this).field_H) {
                break L1;
              } else {
                if (~((ic) this).field_G != ~var3) {
                  break L1;
                } else {
                  this.a(false, ((ic) this).field_S, ((ic) this).field_H, ((ic) this).field_C);
                  this.e(1463);
                  return;
                }
              }
            }
            L2: while (true) {
              stackOut_7_0 = var3;
              stackOut_7_1 = ((ic) this).field_s;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              L3: while (true) {
                L4: {
                  L5: {
                    if (stackIn_8_0 != stackIn_8_1) {
                      break L5;
                    } else {
                      L6: while (true) {
                        stackOut_9_0 = ~var3;
                        stackOut_9_1 = ~((ic) this).field_M.field_a[var2_int];
                        stackIn_39_0 = stackOut_9_0;
                        stackIn_39_1 = stackOut_9_1;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        if (var7 != 0) {
                          break L4;
                        } else {
                          L7: {
                            if (stackIn_10_0 != stackIn_10_1) {
                              break L7;
                            } else {
                              ((ic) this).field_M.d(var2_int);
                              var6 = ((ic) this).field_M.f(var2_int);
                              stackOut_11_0 = ~var6;
                              stackOut_11_1 = -2;
                              stackIn_8_0 = stackOut_11_0;
                              stackIn_8_1 = stackOut_11_1;
                              stackIn_12_0 = stackOut_11_0;
                              stackIn_12_1 = stackOut_11_1;
                              if (var7 != 0) {
                                continue L3;
                              } else {
                                if (stackIn_12_0 != stackIn_12_1) {
                                  L8: {
                                    if ((var6 & 128) == 0) {
                                      break L8;
                                    } else {
                                      this.b(21766, var6);
                                      break L8;
                                    }
                                  }
                                  ((ic) this).field_M.c(var2_int);
                                  ((ic) this).field_M.e(var2_int);
                                  if (var7 == 0) {
                                    continue L6;
                                  } else {
                                    break L7;
                                  }
                                } else {
                                  L9: {
                                    ((ic) this).field_M.e();
                                    ((ic) this).field_M.e(var2_int);
                                    if (((ic) this).field_M.c()) {
                                      break L9;
                                    } else {
                                      if (var7 == 0) {
                                        break L7;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  if (null == ((ic) this).field_H) {
                                    L10: {
                                      if (!((ic) this).field_S) {
                                        break L10;
                                      } else {
                                        if (var3 != 0) {
                                          ((ic) this).field_M.a(var4);
                                          if (var7 == 0) {
                                            break L7;
                                          } else {
                                            break L10;
                                          }
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    this.a(-1, true);
                                    ((ic) this).field_M.g();
                                    return;
                                  } else {
                                    ((ic) this).a(true, ((ic) this).field_S, ((ic) this).field_H);
                                    this.e(1463);
                                    return;
                                  }
                                }
                              }
                            }
                          }
                          var2_int = ((ic) this).field_M.f();
                          var3 = ((ic) this).field_M.field_a[var2_int];
                          var4 = ((ic) this).field_M.b(var3);
                          if (var7 == 0) {
                            continue L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  ((ic) this).field_V = var2_int;
                  stackOut_38_0 = param0;
                  stackOut_38_1 = 1463;
                  stackIn_39_0 = stackOut_38_0;
                  stackIn_39_1 = stackOut_38_1;
                  break L4;
                }
                L11: {
                  if (stackIn_39_0 == stackIn_39_1) {
                    break L11;
                  } else {
                    ((ic) this).field_bb = null;
                    break L11;
                  }
                }
                L12: {
                  ((ic) this).field_X = var4;
                  ((ic) this).field_s = var3;
                  if (((ic) this).field_H == null) {
                    break L12;
                  } else {
                    if (((ic) this).field_G < var3) {
                      ((ic) this).field_V = -1;
                      ((ic) this).field_s = ((ic) this).field_G;
                      ((ic) this).field_X = ((ic) this).field_M.b(((ic) this).field_s);
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
          throw ci.a((Throwable) (Object) var2, "ic.F(" + param0 + ')');
        }
    }

    public ic() {
        ((ic) this).field_Z = new int[16];
        ((ic) this).field_w = new int[16];
        ((ic) this).field_x = new hj[16][128];
        ((ic) this).field_z = new int[16];
        ((ic) this).field_u = new int[16];
        ((ic) this).field_A = new int[16];
        ((ic) this).field_t = new int[16];
        ((ic) this).field_K = new int[16];
        ((ic) this).field_O = new int[16];
        ((ic) this).field_Y = new int[16];
        ((ic) this).field_U = new hj[16][128];
        ((ic) this).field_Q = 1000000;
        ((ic) this).field_W = 256;
        ((ic) this).field_I = new int[16];
        ((ic) this).field_L = new int[16];
        ((ic) this).field_N = new int[16];
        ((ic) this).field_R = new int[16];
        ((ic) this).field_J = new int[16];
        ((ic) this).field_F = new int[16];
        ((ic) this).field_ab = new int[16];
        ((ic) this).field_M = new ab();
        ((ic) this).field_v = new ej((ic) this);
        try {
            ((ic) this).field_bb = new uh(128);
            ((ic) this).a(-1, (byte) 109, 256);
            this.a(-1, true);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ic.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_cb = "Please send me news and updates (I can unsubscribe at any time)";
        field_T = null;
        field_B = new ul();
        field_E = "CAMPAIGN TIME: ";
        field_D = new ul();
    }
}
