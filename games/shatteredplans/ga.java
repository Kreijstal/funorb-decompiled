/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ga extends tn {
    private int[] field_p;
    private int field_H;
    static String field_L;
    private int[] field_y;
    static byte[] field_w;
    private int[] field_q;
    int[] field_t;
    private qq[][] field_N;
    private int[] field_r;
    static String field_o;
    private qq[][] field_K;
    private int[] field_m;
    private ti field_Q;
    private int[] field_G;
    private int field_M;
    int[] field_F;
    private pi field_x;
    int[] field_u;
    private int[] field_I;
    private int[] field_P;
    private int[] field_E;
    private int[] field_s;
    private int[] field_J;
    private int[] field_A;
    private int[] field_T;
    private int field_C;
    private long field_O;
    private int field_D;
    private rc field_l;
    private long field_n;
    private boolean field_v;
    private boolean field_B;
    private int field_S;
    private gh field_z;

    final synchronized void e(int param0) {
        try {
            this.b(16384, true);
            if (param0 != 15) {
                ((ga) this).field_r = null;
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ga.KA(" + param0 + ')');
        }
    }

    private final void b(int param0, byte param1, int param2) {
        try {
            ((ga) this).field_T[param0] = param2;
            if (param1 != -34) {
                ((ga) this).field_K = null;
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ga.VA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized tn b() {
        RuntimeException var1 = null;
        rc stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        rc stackOut_0_0 = null;
        try {
          L0: {
            stackOut_0_0 = ((ga) this).field_l;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "ga.B()");
        }
        return (tn) (Object) stackIn_1_0;
    }

    private final void a(int param0, int param1, int param2) {
        try {
            int var4_int = -117 / ((param0 - -22) / 39);
            ((ga) this).field_E[param2] = param1;
            ((ga) this).field_u[param2] = (int)(0.5 + 2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param1));
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ga.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static bi a(bc param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        bi stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        bi stackOut_8_0 = null;
        Object stackOut_6_0 = null;
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
            if (!vd.a(param2, param0, param1, 2)) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (bi) (Object) stackIn_4_0;
            } else {
              if (param3 == -20487) {
                stackOut_8_0 = gq.d(0);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (bi) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("ga.J(");
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
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_9_0;
    }

    private final int b(qq param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        kc var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        double var8 = 0.0;
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
              var3_int = (param0.field_r * param0.field_G >> -218032372) + param0.field_J;
              var3_int = var3_int + (((ga) this).field_r[param0.field_y] * (-8192 + ((ga) this).field_T[param0.field_y]) >> 948714124);
              var5 = -50 % ((param1 - -60) / 41);
              var4 = param0.field_u;
              if (var4.field_o <= 0) {
                break L1;
              } else {
                L2: {
                  if (0 < var4.field_f) {
                    break L2;
                  } else {
                    if (((ga) this).field_p[param0.field_y] > 0) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  var6 = var4.field_f << -196276638;
                  var7 = var4.field_j << -2141564063;
                  if (~var7 >= ~param0.field_C) {
                    break L3;
                  } else {
                    var6 = param0.field_C * var6 / var7;
                    break L3;
                  }
                }
                var6 = var6 + (((ga) this).field_p[param0.field_y] >> -646051129);
                var8 = Math.sin((double)(param0.field_i & 511) * 0.01227184630308513);
                var3_int = var3_int + (int)((double)var6 * var8);
                break L1;
              }
            }
            L4: {
              var6 = (int)((double)(256 * param0.field_M.field_j) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)ap.field_j + 0.5);
              if (var6 < 1) {
                stackOut_15_0 = 1;
                stackIn_16_0 = stackOut_15_0;
                break L4;
              } else {
                stackOut_13_0 = var6;
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
            stackOut_17_1 = new StringBuilder().append("ga.BA(");
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
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
          throw r.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
        }
        return stackIn_16_0;
    }

    final synchronized void f(int param0) {
        br var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 256) {
                break L1;
              } else {
                ((ga) this).field_r = null;
                break L1;
              }
            }
            var2 = (br) (Object) ((ga) this).field_Q.c(83);
            L2: while (true) {
              L3: {
                L4: {
                  if (null == var2) {
                    break L4;
                  } else {
                    var2.e(26005);
                    var2 = (br) (Object) ((ga) this).field_Q.a(false);
                    if (var3 != 0) {
                      break L3;
                    } else {
                      if (var3 == 0) {
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
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2_ref, "ga.OA(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1) {
        qq var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 2) {
                break L1;
              } else {
                this.b(-91, (byte) 112, -1);
                break L1;
              }
            }
            var3 = (qq) (Object) ((ga) this).field_l.field_n.d(0);
            L2: while (true) {
              L3: {
                L4: {
                  if (var3 == null) {
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
                            if (var3.field_y != param0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (var3.field_E < 0) {
                          ((ga) this).field_N[var3.field_y][var3.field_H] = null;
                          var3.field_E = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var3 = (qq) (Object) ((ga) this).field_l.field_n.a((byte) -71);
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
          throw r.a((Throwable) (Object) var3_ref, "ga.GA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        qq var5 = null;
        RuntimeException var5_ref = null;
        qq var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var5 = ((ga) this).field_N[param2][param3];
            if (param0 == 29) {
              if (var5 == null) {
                return;
              } else {
                L1: {
                  L2: {
                    L3: {
                      ((ga) this).field_N[param2][param3] = null;
                      if ((2 & ((ga) this).field_F[param2]) != 0) {
                        break L3;
                      } else {
                        var5.field_E = 0;
                        if (var7 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var6 = (qq) (Object) ((ga) this).field_l.field_n.d(0);
                    L4: while (true) {
                      if (null == var6) {
                        break L2;
                      } else {
                        if (var7 != 0) {
                          break L1;
                        } else {
                          L5: {
                            if (var5.field_y != var6.field_y) {
                              break L5;
                            } else {
                              if (var6.field_E >= 0) {
                                break L5;
                              } else {
                                if (var6 != var5) {
                                  var5.field_E = 0;
                                  if (var7 == 0) {
                                    break L2;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          var6 = (qq) (Object) ((ga) this).field_l.field_n.a((byte) -71);
                          if (var7 == 0) {
                            continue L4;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  break L1;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var5_ref, "ga.CA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void c(int param0, boolean param1) {
        try {
            ((ga) this).field_M = param0;
            if (param1) {
                ((ga) this).field_t = null;
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ga.TA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2) {
        try {
            if (param1 != 98) {
                tn discarded$0 = ((ga) this).b();
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ga.S(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void c(int param0, byte param1, int param2) {
        try {
            ((ga) this).field_m[param2] = param0;
            ((ga) this).field_P[param2] = we.a(-128, param0);
            int var4_int = 120 % ((51 - param1) / 40);
            this.a(param2, param0, (byte) -16);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ga.QA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void a(byte param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 <= -67) {
                break L1;
              } else {
                this.b(44, (byte) 25, -26);
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (param1 < 0) {
                    break L4;
                  } else {
                    ((ga) this).field_A[param1] = param2;
                    if (var5 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var4_int = 0;
                L5: while (true) {
                  if (var4_int >= 16) {
                    break L3;
                  } else {
                    ((ga) this).field_A[var4_int] = param2;
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
          throw r.a((Throwable) (Object) var4, "ga.U(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized boolean a(bc param0, gh param1, int param2, int param3, io param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        be var8 = null;
        int var9 = 0;
        br var10 = null;
        int var11 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              param1.a();
              if (param2 > 12) {
                break L1;
              } else {
                ((ga) this).field_s = null;
                break L1;
              }
            }
            L2: {
              var6_int = 1;
              var7 = null;
              if (0 < param3) {
                var7 = (Object) (Object) new int[]{param3};
                break L2;
              } else {
                break L2;
              }
            }
            var8 = (be) (Object) param1.field_i.c(-126);
            L3: while (true) {
              L4: {
                L5: {
                  L6: {
                    if (null == var8) {
                      break L6;
                    } else {
                      var9 = (int)var8.field_b;
                      var10 = (br) (Object) ((ga) this).field_Q.a((long)var9, -25064);
                      if (var11 != 0) {
                        break L5;
                      } else {
                        L7: {
                          L8: {
                            if (var10 == null) {
                              L9: {
                                var10 = lo.a(param0, (byte) 125, var9);
                                if (null != var10) {
                                  break L9;
                                } else {
                                  var6_int = 0;
                                  if (var11 == 0) {
                                    break L7;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              ((ga) this).field_Q.a((oh) (Object) var10, 87, (long)var9);
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          if (var10.a(param4, var8.field_j, (int[]) var7, 1)) {
                            break L7;
                          } else {
                            var6_int = 0;
                            break L7;
                          }
                        }
                        var8 = (be) (Object) param1.field_i.a(false);
                        if (var11 == 0) {
                          continue L3;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  if (var6_int != 0) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
                param1.b();
                break L4;
              }
              stackOut_27_0 = var6_int;
              stackIn_28_0 = stackOut_27_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var6;
            stackOut_29_1 = new StringBuilder().append("ga.AA(");
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
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L10;
            }
          }
          L11: {
            stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');
            stackIn_36_0 = stackOut_33_0;
            stackIn_36_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param1 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L11;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_37_0 = stackOut_34_0;
              stackIn_37_1 = stackOut_34_1;
              stackIn_37_2 = stackOut_34_2;
              break L11;
            }
          }
          L12: {
            stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
            stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_40_0 = stackOut_37_0;
            stackIn_40_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param4 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L12;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_41_0 = stackOut_38_0;
              stackIn_41_1 = stackOut_38_1;
              stackIn_41_2 = stackOut_38_2;
              break L12;
            }
          }
          throw r.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ')');
        }
        return stackIn_28_0 != 0;
    }

    final synchronized void a(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((ga) this).field_x.f()) {
                var2_int = ((ga) this).field_x.field_e * ((ga) this).field_M / ap.field_j;
                L2: while (true) {
                  L3: {
                    var3 = (long)param0 * (long)var2_int + ((ga) this).field_O;
                    if (0L <= ((ga) this).field_n - var3) {
                      ((ga) this).field_O = var3;
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var5 = (int)((-1L + -((ga) this).field_O + (((ga) this).field_n + (long)var2_int)) / (long)var2_int);
                  ((ga) this).field_O = ((ga) this).field_O + (long)var5 * (long)var2_int;
                  ((ga) this).field_l.a(var5);
                  param0 = param0 - var5;
                  this.a((byte) 42);
                  if (!((ga) this).field_x.f()) {
                    break L1;
                  } else {
                    if (var6 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            ((ga) this).field_l.a(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "ga.D(" + param0 + ')');
        }
    }

    final static void a(boolean param0, byte param1, int param2, int param3, int param4, int param5, boolean param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        pf var8 = null;
        long var9 = 0L;
        Object var11 = null;
        fb var12 = null;
        int var13 = 0;
        int var14 = 0;
        qr var15 = null;
        qr var16 = null;
        qr var17 = null;
        qr var18 = null;
        int var18_int = 0;
        qr var19 = null;
        qr var20 = null;
        qr var21 = null;
        int var22_int = 0;
        qr var22 = null;
        qr var23 = null;
        qr var24 = null;
        qr var25 = null;
        qr var26 = null;
        qr var27 = null;
        qr var28 = null;
        qr var29 = null;
        qr var30 = null;
        int var31 = 0;
        String var32 = null;
        String var33 = null;
        int var33_int = 0;
        int var34_int = 0;
        String var34 = null;
        bi var35 = null;
        String var35_ref = null;
        int var36 = 0;
        int var37_int = 0;
        StringBuilder var37 = null;
        int var38_int = 0;
        String var38 = null;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        ub stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        ub stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        ub stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        fb stackIn_18_0 = null;
        qr stackIn_18_1 = null;
        qr stackIn_18_2 = null;
        long stackIn_18_3 = 0L;
        fb stackIn_19_0 = null;
        qr stackIn_19_1 = null;
        qr stackIn_19_2 = null;
        long stackIn_19_3 = 0L;
        fb stackIn_20_0 = null;
        qr stackIn_20_1 = null;
        qr stackIn_20_2 = null;
        long stackIn_20_3 = 0L;
        qr stackIn_20_4 = null;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        fb stackIn_41_0 = null;
        qr stackIn_41_1 = null;
        qr stackIn_41_2 = null;
        long stackIn_41_3 = 0L;
        fb stackIn_43_0 = null;
        qr stackIn_43_1 = null;
        qr stackIn_43_2 = null;
        long stackIn_43_3 = 0L;
        fb stackIn_44_0 = null;
        qr stackIn_44_1 = null;
        qr stackIn_44_2 = null;
        long stackIn_44_3 = 0L;
        qr stackIn_44_4 = null;
        int stackIn_49_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_137_0 = 0;
        bi[] stackIn_138_0 = null;
        bi[] stackIn_140_0 = null;
        bi[] stackIn_141_0 = null;
        int stackIn_141_1 = 0;
        bi[] stackIn_147_0 = null;
        bi[] stackIn_148_0 = null;
        bi[] stackIn_150_0 = null;
        bi[] stackIn_151_0 = null;
        int stackIn_151_1 = 0;
        bi[] stackIn_158_0 = null;
        boolean stackIn_211_0 = false;
        String stackIn_223_0 = null;
        boolean stackIn_231_0 = false;
        String stackIn_244_0 = null;
        String stackIn_258_0 = null;
        String stackIn_266_0 = null;
        Throwable caughtException = null;
        ub stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        ub stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        ub stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        fb stackOut_17_0 = null;
        qr stackOut_17_1 = null;
        qr stackOut_17_2 = null;
        long stackOut_17_3 = 0L;
        fb stackOut_18_0 = null;
        qr stackOut_18_1 = null;
        qr stackOut_18_2 = null;
        long stackOut_18_3 = 0L;
        qr stackOut_18_4 = null;
        fb stackOut_19_0 = null;
        qr stackOut_19_1 = null;
        qr stackOut_19_2 = null;
        long stackOut_19_3 = 0L;
        qr stackOut_19_4 = null;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        fb stackOut_40_0 = null;
        qr stackOut_40_1 = null;
        qr stackOut_40_2 = null;
        long stackOut_40_3 = 0L;
        fb stackOut_41_0 = null;
        qr stackOut_41_1 = null;
        qr stackOut_41_2 = null;
        long stackOut_41_3 = 0L;
        qr stackOut_41_4 = null;
        fb stackOut_43_0 = null;
        qr stackOut_43_1 = null;
        qr stackOut_43_2 = null;
        long stackOut_43_3 = 0L;
        qr stackOut_43_4 = null;
        int stackOut_46_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_136_0 = 0;
        bi[] stackOut_137_0 = null;
        bi[] stackOut_138_0 = null;
        int stackOut_138_1 = 0;
        bi[] stackOut_140_0 = null;
        int stackOut_140_1 = 0;
        bi[] stackOut_145_0 = null;
        bi[] stackOut_147_0 = null;
        bi[] stackOut_148_0 = null;
        int stackOut_148_1 = 0;
        bi[] stackOut_150_0 = null;
        int stackOut_150_1 = 0;
        bi[] stackOut_157_0 = null;
        boolean stackOut_210_0 = false;
        Object stackOut_219_0 = null;
        String stackOut_221_0 = null;
        Object stackOut_222_0 = null;
        boolean stackOut_230_0 = false;
        String stackOut_241_0 = null;
        String stackOut_243_0 = null;
        String stackOut_252_0 = null;
        String stackOut_255_0 = null;
        String stackOut_257_0 = null;
        String stackOut_263_0 = null;
        String stackOut_265_0 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var41 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    stackOut_1_0 = qs.field_y;
                    stackOut_1_1 = (cr.field_c * 4 + 8) * param5;
                    stackOut_1_2 = (2 + cr.field_c) * 2;
                    stackIn_4_0 = stackOut_1_0;
                    stackIn_4_1 = stackOut_1_1;
                    stackIn_4_2 = stackOut_1_2;
                    stackIn_2_0 = stackOut_1_0;
                    stackIn_2_1 = stackOut_1_1;
                    stackIn_2_2 = stackOut_1_2;
                    if (hp.field_l != qs.field_y) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = (ub) (Object) stackIn_2_0;
                    stackOut_2_1 = stackIn_2_1;
                    stackOut_2_2 = stackIn_2_2;
                    stackOut_2_3 = 1;
                    stackIn_5_0 = stackOut_2_0;
                    stackIn_5_1 = stackOut_2_1;
                    stackIn_5_2 = stackOut_2_2;
                    stackIn_5_3 = stackOut_2_3;
                    statePc = 5;
                    continue stateLoop;
                }
                case 4: {
                    stackOut_4_0 = (ub) (Object) stackIn_4_0;
                    stackOut_4_1 = stackIn_4_1;
                    stackOut_4_2 = stackIn_4_2;
                    stackOut_4_3 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    stackIn_5_2 = stackOut_4_2;
                    stackIn_5_3 = stackOut_4_3;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    var7_int = ((ub) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2, stackIn_5_3 != 0, -109, param0, 2) ? 1 : 0;
                    var8 = qs.field_y.field_xb.field_M;
                    if (param1 > 109) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ga.a((nk[]) null, -36, (bc) null, (int[]) null, (bi[][]) null, (String[]) null, 119, (bc) null, (byte[]) null, (String[][]) null, (bc) null, (byte[]) null, false, (String[][]) null, -57, (int[]) null, (bi[][]) null);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    var9 = pr.a(14274);
                    var11 = null;
                    var12 = (fb) (Object) var8.d(0);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (var12 == null) {
                        statePc = 297;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var13 = 0;
                    if (var41 != 0) {
                        statePc = 297;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (null == var12.field_M) {
                        statePc = 16;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackOut_16_0 = param2;
                    stackOut_16_1 = param3;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var14 = stackIn_17_0 | stackIn_17_1;
                    var12.field_Ub = new qr(0L, oj.field_zb);
                    var12.a(4, var12.field_Ub);
                    var12.field_Ub.field_y = 1;
                    var12.field_Pb = new qr(0L, ek.field_E);
                    var12.a(4, var12.field_Pb);
                    var12.field_Rb = new qr(0L, oj.field_zb);
                    var12.a(4, var12.field_Rb);
                    var12.field_Rb.field_kb = 0;
                    var12.field_Wb = new qr(0L, oj.field_zb);
                    var12.a(4, var12.field_Wb);
                    var12.field_Wb.field_kb = 0;
                    var12.field_Ib = new qr(0L, ek.field_E);
                    var12.a(4, var12.field_Ib);
                    var12.field_Ib.field_y = 2;
                    stackOut_17_0 = (fb) var12;
                    stackOut_17_1 = null;
                    stackOut_17_2 = null;
                    stackOut_17_3 = 0L;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    stackIn_18_3 = stackOut_17_3;
                    if (ns.field_pb) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackOut_18_0 = (fb) (Object) stackIn_18_0;
                    stackOut_18_1 = null;
                    stackOut_18_2 = null;
                    stackOut_18_3 = stackIn_18_3;
                    stackOut_18_4 = ek.field_E;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    stackIn_20_2 = stackOut_18_2;
                    stackIn_20_3 = stackOut_18_3;
                    stackIn_20_4 = stackOut_18_4;
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    stackOut_19_0 = (fb) (Object) stackIn_19_0;
                    stackOut_19_1 = null;
                    stackOut_19_2 = null;
                    stackOut_19_3 = stackIn_19_3;
                    stackOut_19_4 = oj.field_zb;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    stackIn_20_2 = stackOut_19_2;
                    stackIn_20_3 = stackOut_19_3;
                    stackIn_20_4 = stackOut_19_4;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_20_0.field_Mb = new qr(stackIn_20_3, stackIn_20_4);
                    var12.a(4, var12.field_Mb);
                    var12.field_xb = new qr[em.field_k];
                    var12.field_Bb = new qr(0L, (qr) null);
                    if ((1 << cp.field_q & var14) == 0) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var12.field_Mb.a(4, var12.field_Bb);
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    var12.field_oc = new qr(0L, (qr) null);
                    if ((1 << vr.field_g & var14) != 0) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var12.field_Mb.a(4, var12.field_oc);
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    var12.field_ac = new qr(0L, (qr) null);
                    if ((var14 & 1 << kf.field_i) == 0) {
                        statePc = 29;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var12.field_Mb.a(4, var12.field_ac);
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    var12.field_Kb = new qr(0L, (qr) null);
                    if (0 != (1 << v.field_e & var14)) {
                        statePc = 32;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var12.field_Mb.a(4, var12.field_Kb);
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    var15 = var12.field_Bb;
                    var16 = var12.field_Kb;
                    var12.field_ac.field_G = 1;
                    var17 = var12.field_oc;
                    var17.field_G = 1;
                    var16.field_G = 1;
                    var15.field_G = 1;
                    var18_int = 0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (~em.field_k >= ~var18_int) {
                        statePc = 40;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    var12.field_xb[var18_int] = new qr(0L, (qr) null);
                    stackOut_35_0 = 0;
                    stackOut_35_1 = var14 & 1 << var18_int + ml.field_j;
                    stackIn_17_0 = stackOut_35_0;
                    stackIn_17_1 = stackOut_35_1;
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    if (var41 != 0) {
                        statePc = 17;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (stackIn_36_0 != stackIn_36_1) {
                        statePc = 38;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var12.field_Mb.a(4, var12.field_xb[var18_int]);
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    var12.field_xb[var18_int].field_G = 1;
                    var18_int++;
                    if (var41 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    stackOut_40_0 = (fb) var12;
                    stackOut_40_1 = null;
                    stackOut_40_2 = null;
                    stackOut_40_3 = 0L;
                    stackIn_43_0 = stackOut_40_0;
                    stackIn_43_1 = stackOut_40_1;
                    stackIn_43_2 = stackOut_40_2;
                    stackIn_43_3 = stackOut_40_3;
                    stackIn_41_0 = stackOut_40_0;
                    stackIn_41_1 = stackOut_40_1;
                    stackIn_41_2 = stackOut_40_2;
                    stackIn_41_3 = stackOut_40_3;
                    if (ns.field_pb) {
                        statePc = 43;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    stackOut_41_0 = (fb) (Object) stackIn_41_0;
                    stackOut_41_1 = null;
                    stackOut_41_2 = null;
                    stackOut_41_3 = stackIn_41_3;
                    stackOut_41_4 = oj.field_zb;
                    stackIn_44_0 = stackOut_41_0;
                    stackIn_44_1 = stackOut_41_1;
                    stackIn_44_2 = stackOut_41_2;
                    stackIn_44_3 = stackOut_41_3;
                    stackIn_44_4 = stackOut_41_4;
                    statePc = 44;
                    continue stateLoop;
                }
                case 43: {
                    stackOut_43_0 = (fb) (Object) stackIn_43_0;
                    stackOut_43_1 = null;
                    stackOut_43_2 = null;
                    stackOut_43_3 = stackIn_43_3;
                    stackOut_43_4 = ek.field_E;
                    stackIn_44_0 = stackOut_43_0;
                    stackIn_44_1 = stackOut_43_1;
                    stackIn_44_2 = stackOut_43_2;
                    stackIn_44_3 = stackOut_43_3;
                    stackIn_44_4 = stackOut_43_4;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    stackIn_44_0.field_Ob = new qr(stackIn_44_3, stackIn_44_4);
                    var12.a(4, var12.field_Ob);
                    var12.field_Ob.field_y = 2;
                    var12.field_Tb = new qr(0L, ek.field_E);
                    var12.a(4, var12.field_Tb);
                    var12.field_Sb = new qr(0L, gn.field_w);
                    var12.a(4, var12.field_Sb);
                    var12.field_Hb = new qr(0L, gn.field_w);
                    var12.a(4, var12.field_Hb);
                    var12.field_ic = new qr(0L, ii.field_u);
                    var12.a(4, var12.field_ic);
                    var12.e((byte) -126);
                    var12.field_Db = new qr(0L, kq.field_h);
                    var13 = 1;
                    var12.a(4, var12.field_Db);
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    if (!var12.field_Ab) {
                        statePc = 48;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    stackOut_46_0 = param3;
                    stackIn_49_0 = stackOut_46_0;
                    statePc = 49;
                    continue stateLoop;
                }
                case 48: {
                    stackOut_48_0 = param2;
                    stackIn_49_0 = stackOut_48_0;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    var14 = stackIn_49_0;
                    var12.field_Ub.field_z = null;
                    var12.field_Ub.field_mb = 0;
                    var15 = var12.field_Ub;
                    var15.field_K = 0;
                    var12.field_Db.field_z = null;
                    var12.field_Db.field_mb = 0;
                    var16 = var12.field_Db;
                    var16.field_K = 0;
                    var12.field_Pb.field_z = null;
                    var17 = var12.field_Pb;
                    var12.field_Pb.field_mb = 0;
                    var12.field_Rb.field_z = null;
                    var17.field_K = 0;
                    var12.field_Rb.field_mb = 0;
                    var18 = var12.field_Rb;
                    var18.field_K = 0;
                    var12.field_Wb.field_z = null;
                    var12.field_Wb.field_mb = 0;
                    var19 = var12.field_Wb;
                    var19.field_K = 0;
                    var12.field_Ib.field_z = null;
                    var20 = var12.field_Ib;
                    var12.field_Ib.field_mb = 0;
                    var20.field_K = 0;
                    var12.field_Mb.field_z = null;
                    var21 = var12.field_Mb;
                    var12.field_Mb.field_mb = 0;
                    var21.field_K = 0;
                    var22_int = 0;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    if (~em.field_k >= ~var22_int) {
                        statePc = 55;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var12.field_xb[var22_int].field_pb = null;
                    var23 = var12.field_xb[var22_int];
                    var12.field_xb[var22_int].field_mb = 0;
                    var23.field_K = 0;
                    var22_int++;
                    if (var41 != 0) {
                        statePc = 56;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    if (var41 == 0) {
                        statePc = 50;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    var12.field_Bb.field_pb = null;
                    var12.field_Bb.field_mb = 0;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    var22 = var12.field_Bb;
                    var12.field_Kb.field_pb = null;
                    var22.field_K = 0;
                    var12.field_Kb.field_mb = 0;
                    var23 = var12.field_Kb;
                    var12.field_oc.field_pb = null;
                    var23.field_K = 0;
                    var24 = var12.field_oc;
                    var12.field_oc.field_mb = 0;
                    var12.field_ac.field_pb = null;
                    var24.field_K = 0;
                    var25 = var12.field_ac;
                    var12.field_ac.field_mb = 0;
                    var25.field_K = 0;
                    var12.field_Ob.field_z = null;
                    var26 = var12.field_Ob;
                    var12.field_Ob.field_mb = 0;
                    var12.field_Tb.field_z = null;
                    var26.field_K = 0;
                    var12.field_Tb.field_mb = 0;
                    var27 = var12.field_Tb;
                    var12.field_Sb.field_z = null;
                    var27.field_K = 0;
                    var12.field_Sb.field_mb = 0;
                    var28 = var12.field_Sb;
                    var12.field_Hb.field_z = null;
                    var28.field_K = 0;
                    var12.field_Hb.field_mb = 0;
                    var29 = var12.field_Hb;
                    var29.field_K = 0;
                    var12.field_ic.field_z = null;
                    var12.field_ic.field_mb = 0;
                    var30 = var12.field_ic;
                    var30.field_K = 0;
                    var12.field_K = qs.field_y.field_xb.field_K;
                    var31 = 0;
                    var32 = var12.field_Xb;
                    if (!var12.f((byte) -78)) {
                        statePc = 59;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 59: {
                    if (!var12.field_Ab) {
                        statePc = 87;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (var12.field_lc >= 0) {
                        statePc = 84;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    if (!var12.field_mc) {
                        statePc = 72;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (var12.field_cc) {
                        statePc = 81;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (var12.field_Jb) {
                        statePc = 81;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    if (2 != var12.field_Fb) {
                        statePc = 78;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var12.field_Db.field_z = ro.field_d;
                    if (var41 == 0) {
                        statePc = 104;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    var12.field_Ub.field_z = tc.field_F;
                    if (var41 == 0) {
                        statePc = 104;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var12.field_Db.field_z = qn.field_a;
                    if (var41 == 0) {
                        statePc = 104;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    var12.field_Ub.field_z = co.field_q;
                    if (var41 == 0) {
                        statePc = 104;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if (var12.field_cc) {
                        statePc = 93;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    if (!var12.field_Jb) {
                        statePc = 96;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    var12.field_Db.field_z = qn.field_a;
                    if (var41 == 0) {
                        statePc = 104;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    if (!var12.field_Qb) {
                        statePc = 102;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    var12.field_Ub.field_z = lq.field_r;
                    if (var41 == 0) {
                        statePc = 104;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    var12.field_Ub.field_z = ng.field_b;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    if (var12.field_Db.field_z == null) {
                        statePc = 108;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    var12.field_Db.a(68, cr.field_c, (byte) 72, var31, 0);
                    if (var41 == 0) {
                        statePc = 110;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    var12.field_Ub.a(68, cr.field_c, (byte) 48, var31, 0);
                    statePc = 110;
                    continue stateLoop;
                }
                case 110: {
                    var12.field_Pb.field_z = nq.a(var12.field_Pb.field_nb, var32, 78);
                    var12.field_Pb.a(78, cr.field_c, (byte) 85, var31, 70);
                    if (!var12.field_Pb.field_L) {
                        statePc = 116;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    if (var12.field_Pb.field_z.equals((Object) (Object) var32)) {
                        statePc = 116;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    dn.field_k = var32;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    var12.field_Rb.field_z = Integer.toString(var12.field_Lb);
                    if (var12.field_mc) {
                        statePc = 120;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    var12.field_Rb.field_y = 1;
                    var12.field_Rb.a(48, cr.field_c, (byte) 108, var31, 150);
                    if (var41 == 0) {
                        statePc = 121;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    var12.field_Wb.field_z = "/" + var12.field_Eb;
                    var12.field_Rb.field_y = 2;
                    var33_int = (348 + -var12.field_Wb.field_nb.c("/")) / 2;
                    var12.field_Rb.a(var33_int + -150, cr.field_c, (byte) 83, var31, 150);
                    var12.field_Wb.a(-var33_int + 198, cr.field_c, (byte) 84, var31, var33_int);
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    var12.field_Ib.field_z = Integer.toString(var12.field_Zb);
                    var12.field_Ib.a(48, cr.field_c, (byte) 47, var31, 200);
                    if (!ns.field_pb) {
                        statePc = 124;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    stackOut_122_0 = 250;
                    stackIn_125_0 = stackOut_122_0;
                    statePc = 125;
                    continue stateLoop;
                }
                case 124: {
                    stackOut_124_0 = 200;
                    stackIn_125_0 = stackOut_124_0;
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    var33_int = stackIn_125_0;
                    var12.field_Mb.a(-2 + (365 + -var33_int), cr.field_c, (byte) 46, var31, var33_int);
                    var34_int = qo.field_b;
                    if ((var14 & 1 << cp.field_q) == 0) {
                        statePc = 127;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    var35 = uk.field_b[var12.field_nc];
                    var12.field_Bb.field_pb = var35;
                    var12.field_Bb.a(var35.field_o, var12.field_Mb.field_mb, (byte) 111, 0, var34_int);
                    var34_int = var34_int + (var35.field_o - -qo.field_b);
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    if ((var14 & 1 << vr.field_g) == 0) {
                        statePc = 142;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    if (var12.field_cc) {
                        statePc = 134;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    if (!var12.field_Jb) {
                        statePc = 136;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    stackOut_134_0 = 1;
                    stackIn_137_0 = stackOut_134_0;
                    statePc = 137;
                    continue stateLoop;
                }
                case 136: {
                    stackOut_136_0 = 0;
                    stackIn_137_0 = stackOut_136_0;
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    var36 = stackIn_137_0;
                    stackOut_137_0 = ji.field_E;
                    stackIn_140_0 = stackOut_137_0;
                    stackIn_138_0 = stackOut_137_0;
                    if (var36 == 0) {
                        statePc = 140;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    stackOut_138_0 = (bi[]) (Object) stackIn_138_0;
                    stackOut_138_1 = 1;
                    stackIn_141_0 = stackOut_138_0;
                    stackIn_141_1 = stackOut_138_1;
                    statePc = 141;
                    continue stateLoop;
                }
                case 140: {
                    stackOut_140_0 = (bi[]) (Object) stackIn_140_0;
                    stackOut_140_1 = 0;
                    stackIn_141_0 = stackOut_140_0;
                    stackIn_141_1 = stackOut_140_1;
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    var35 = stackIn_141_0[stackIn_141_1];
                    var12.field_oc.field_pb = var35;
                    var12.field_oc.a(var35.field_o, var12.field_Mb.field_mb, (byte) 124, 0, var34_int);
                    var34_int = var34_int + (qo.field_b + var35.field_o);
                    statePc = 142;
                    continue stateLoop;
                }
                case 142: {
                    if (0 == (1 << kf.field_i & var14)) {
                        statePc = 144;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    var35 = j.field_s[-1 + var12.field_Fb];
                    var12.field_ac.field_pb = var35;
                    var12.field_ac.a(var35.field_o, var12.field_Mb.field_mb, (byte) 41, 0, var34_int);
                    var34_int = var34_int + (qo.field_b + var35.field_o);
                    statePc = 144;
                    continue stateLoop;
                }
                case 144: {
                    if ((1 << v.field_e & var14) == 0) {
                        statePc = 152;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    stackOut_145_0 = tf.field_l;
                    stackIn_147_0 = stackOut_145_0;
                    statePc = 147;
                    continue stateLoop;
                }
                case 147: {
                    stackOut_147_0 = (bi[]) (Object) stackIn_147_0;
                    stackIn_150_0 = stackOut_147_0;
                    stackIn_148_0 = stackOut_147_0;
                    if (var12.field_ec) {
                        statePc = 150;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    stackOut_148_0 = (bi[]) (Object) stackIn_148_0;
                    stackOut_148_1 = 0;
                    stackIn_151_0 = stackOut_148_0;
                    stackIn_151_1 = stackOut_148_1;
                    statePc = 151;
                    continue stateLoop;
                }
                case 150: {
                    stackOut_150_0 = (bi[]) (Object) stackIn_150_0;
                    stackOut_150_1 = 1;
                    stackIn_151_0 = stackOut_150_0;
                    stackIn_151_1 = stackOut_150_1;
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    var35 = stackIn_151_0[stackIn_151_1];
                    var12.field_Kb.field_pb = var35;
                    var12.field_Kb.a(var35.field_o, var12.field_Mb.field_mb, (byte) 127, 0, var34_int);
                    var34_int = var34_int + (qo.field_b + var35.field_o);
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    if (null != ln.field_O) {
                        statePc = 155;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 155: {
                    var36 = 0;
                    statePc = 156;
                    continue stateLoop;
                }
                case 156: {
                    if (~var36 <= ~em.field_k) {
                        statePc = 167;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    stackOut_157_0 = ln.field_O[var36];
                    stackIn_147_0 = stackOut_157_0;
                    stackIn_158_0 = stackOut_157_0;
                    if (var41 != 0) {
                        statePc = 147;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    if (stackIn_158_0 == null) {
                        statePc = 166;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    if (0 != (var14 & 1 << var36 + ml.field_j)) {
                        statePc = 165;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    if (var41 == 0) {
                        statePc = 166;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    var35 = ln.field_O[var36][var12.field_dc[var36] & 255];
                    var12.field_xb[var36].field_pb = var35;
                    var12.field_xb[var36].a(var35.field_o, var12.field_Mb.field_mb, (byte) 92, 0, var34_int);
                    var34_int = var34_int + (qo.field_b + var35.field_o);
                    statePc = 166;
                    continue stateLoop;
                }
                case 166: {
                    var36++;
                    if (var41 == 0) {
                        statePc = 156;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    var36 = (-var34_int + var12.field_Mb.field_K) / 2;
                    if (0 < var36) {
                        statePc = 170;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 170: {
                    var12.field_Bb.field_hb = var12.field_Bb.field_hb + var36;
                    var12.field_oc.field_hb = var12.field_oc.field_hb + var36;
                    var12.field_ac.field_hb = var12.field_ac.field_hb + var36;
                    var12.field_Kb.field_hb = var12.field_Kb.field_hb + var36;
                    var37_int = 0;
                    statePc = 171;
                    continue stateLoop;
                }
                case 171: {
                    if (~em.field_k >= ~var37_int) {
                        statePc = 176;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    var12.field_xb[var37_int].field_hb = var12.field_xb[var37_int].field_hb + var36;
                    var37_int++;
                    if (var41 != 0) {
                        statePc = 184;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    if (var41 == 0) {
                        statePc = 171;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    if (!var12.field_Ab) {
                        statePc = 183;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    var37_int = var12.field_lc;
                    if (var37_int >= 0) {
                        statePc = 179;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    var37_int = (int)(var9 + -var12.field_Gb);
                    statePc = 179;
                    continue stateLoop;
                }
                case 179: {
                    var38_int = var37_int / 1000;
                    var39 = var38_int / 60;
                    var38_int = var38_int % 60;
                    if (var39 < 60) {
                        statePc = 181;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    var40 = var39 / 60;
                    var39 = var39 % 60;
                    var12.field_Ob.field_z = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                    if (var41 == 0) {
                        statePc = 183;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    var12.field_Ob.field_z = var39 + ":" + var38_int / 10 + var38_int % 10;
                    statePc = 183;
                    continue stateLoop;
                }
                case 183: {
                    var12.field_Ob.a(var12.field_K - 365, cr.field_c, (byte) 57, var31, 365);
                    var31 = var31 + cr.field_c;
                    statePc = 184;
                    continue stateLoop;
                }
                case 184: {
                    if (var12.field_jc == null) {
                        statePc = 192;
                    } else {
                        statePc = 185;
                    }
                    continue stateLoop;
                }
                case 185: {
                    var31 += 2;
                    var37 = new StringBuilder(64);
                    StringBuilder discarded$4 = var37.append(hl.field_H);
                    StringBuilder discarded$5 = var37.append(var12.field_jc[0]);
                    var38_int = 1;
                    statePc = 186;
                    continue stateLoop;
                }
                case 186: {
                    if (var38_int >= var12.field_Lb) {
                        statePc = 191;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    StringBuilder discarded$6 = var37.append(", ");
                    StringBuilder discarded$7 = var37.append(var12.field_jc[var38_int]);
                    var38_int++;
                    if (var41 != 0) {
                        statePc = 192;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    if (var41 == 0) {
                        statePc = 186;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    var38 = var37.toString();
                    var12.field_Tb.field_z = var38;
                    var39 = var12.field_Tb.field_nb.a(var38, var12.field_K - 2 * var12.field_Tb.field_kb);
                    var12.field_Tb.a(var12.field_K, cr.field_c * var39, (byte) 73, var31, 0);
                    var31 = var31 + var39 * cr.field_c;
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    if (!var12.field_Jb) {
                        statePc = 194;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    var12.field_Sb.field_z = re.a(tq.field_a, 4371, new String[1]);
                    var12.field_Sb.a(var12.field_K - tg.field_a * 2, cr.field_c, (byte) 80, var31, tg.field_a);
                    var31 = var31 + cr.field_c;
                    statePc = 194;
                    continue stateLoop;
                }
                case 194: {
                    if (var12.field_Yb) {
                        statePc = 197;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 197: {
                    var12.field_Hb.field_z = re.a(wj.field_n, 4371, new String[1]);
                    var12.field_Hb.a(-(2 * tg.field_a) + var12.field_K, cr.field_c, (byte) 91, var31, tg.field_a);
                    var31 = var31 + cr.field_c;
                    statePc = 198;
                    continue stateLoop;
                }
                case 198: {
                    var33 = fi.a(var12.field_hc, -11, var32);
                    if (var33 == null) {
                        statePc = 200;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    var34_int = var12.field_ic.field_nb.a(var33, -tg.field_a + -tg.field_a + var12.field_K);
                    var12.field_ic.field_z = var33;
                    var12.field_ic.field_I = 256 * var12.field_Nb / ks.field_i;
                    var12.field_ic.a(var12.field_K + -(tg.field_a * 2), cr.field_c * var34_int, (byte) 112, var31, tg.field_a);
                    var31 = var31 + var34_int * cr.field_c;
                    statePc = 200;
                    continue stateLoop;
                }
                case 200: {
                    if (var7_int == 0) {
                        statePc = 203;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 203: {
                    var12.field_gb = -var12.field_mb + var31;
                    statePc = 204;
                    continue stateLoop;
                }
                case 204: {
                    if (var13 != 0) {
                        statePc = 207;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 207: {
                    qs.field_y.field_xb.a(2, (qr) var11, (qr) (Object) var12, (byte) 65);
                    statePc = 208;
                    continue stateLoop;
                }
                case 208: {
                    var34_int = 0;
                    statePc = 209;
                    continue stateLoop;
                }
                case 209: {
                    if (~em.field_k >= ~var34_int) {
                        statePc = 230;
                    } else {
                        statePc = 210;
                    }
                    continue stateLoop;
                }
                case 210: {
                    stackOut_210_0 = var12.field_xb[var34_int].field_L;
                    stackIn_231_0 = stackOut_210_0;
                    stackIn_211_0 = stackOut_210_0;
                    if (var41 != 0) {
                        statePc = 231;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    if (stackIn_211_0) {
                        statePc = 215;
                    } else {
                        statePc = 229;
                    }
                    continue stateLoop;
                }
                case 215: {
                    if (null == ei.field_f) {
                        statePc = 222;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    if (ei.field_f[var34_int] != null) {
                        statePc = 221;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    stackOut_219_0 = null;
                    stackIn_223_0 = (String) (Object) stackOut_219_0;
                    statePc = 223;
                    continue stateLoop;
                }
                case 221: {
                    stackOut_221_0 = ei.field_f[var34_int][var12.field_dc[var34_int] & 255];
                    stackIn_223_0 = stackOut_221_0;
                    statePc = 223;
                    continue stateLoop;
                }
                case 222: {
                    stackOut_222_0 = null;
                    stackIn_223_0 = (String) (Object) stackOut_222_0;
                    statePc = 223;
                    continue stateLoop;
                }
                case 223: {
                    var35_ref = stackIn_223_0;
                    if (var35_ref == null) {
                        statePc = 227;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 224: {
                    dn.field_k = gm.field_l[var34_int] + " - " + var35_ref;
                    if (var41 == 0) {
                        statePc = 229;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 227: {
                    dn.field_k = gm.field_l[var34_int];
                    statePc = 229;
                    continue stateLoop;
                }
                case 229: {
                    var34_int++;
                    if (var41 == 0) {
                        statePc = 209;
                    } else {
                        statePc = 230;
                    }
                    continue stateLoop;
                }
                case 230: {
                    stackOut_230_0 = var12.field_Bb.field_L;
                    stackIn_231_0 = stackOut_230_0;
                    statePc = 231;
                    continue stateLoop;
                }
                case 231: {
                    if (stackIn_231_0) {
                        statePc = 233;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 233: {
                    if (var12.field_nc == 1) {
                        statePc = 235;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    var34 = mk.field_e[var12.field_nc];
                    statePc = 236;
                    continue stateLoop;
                }
                case 235: {
                    var34 = va.field_i;
                    statePc = 236;
                    continue stateLoop;
                }
                case 236: {
                    dn.field_k = vl.field_r + " - " + var34;
                    statePc = 237;
                    continue stateLoop;
                }
                case 237: {
                    if (!var12.field_Kb.field_L) {
                        statePc = 245;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    if (!var12.field_ec) {
                        statePc = 243;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 241: {
                    stackOut_241_0 = le.field_c;
                    stackIn_244_0 = stackOut_241_0;
                    statePc = 244;
                    continue stateLoop;
                }
                case 243: {
                    stackOut_243_0 = ek.field_G;
                    stackIn_244_0 = stackOut_243_0;
                    statePc = 244;
                    continue stateLoop;
                }
                case 244: {
                    dn.field_k = stackIn_244_0;
                    statePc = 245;
                    continue stateLoop;
                }
                case 245: {
                    if (var12.field_oc.field_L) {
                        statePc = 248;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 248: {
                    if (var12.field_cc) {
                        statePc = 252;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    if (!var12.field_Jb) {
                        statePc = 254;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 252: {
                    stackOut_252_0 = ns.field_qb;
                    stackIn_258_0 = stackOut_252_0;
                    statePc = 258;
                    continue stateLoop;
                }
                case 254: {
                    if (var12.field_mc) {
                        statePc = 257;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    stackOut_255_0 = ls.field_d;
                    stackIn_258_0 = stackOut_255_0;
                    statePc = 258;
                    continue stateLoop;
                }
                case 257: {
                    stackOut_257_0 = nr.field_o;
                    stackIn_258_0 = stackOut_257_0;
                    statePc = 258;
                    continue stateLoop;
                }
                case 258: {
                    dn.field_k = stackIn_258_0;
                    statePc = 259;
                    continue stateLoop;
                }
                case 259: {
                    if (!var12.field_ac.field_L) {
                        statePc = 267;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    if (var12.field_Fb == 2) {
                        statePc = 265;
                    } else {
                        statePc = 263;
                    }
                    continue stateLoop;
                }
                case 263: {
                    stackOut_263_0 = wd.field_K;
                    stackIn_266_0 = stackOut_263_0;
                    statePc = 266;
                    continue stateLoop;
                }
                case 265: {
                    stackOut_265_0 = we.field_d;
                    stackIn_266_0 = stackOut_265_0;
                    statePc = 266;
                    continue stateLoop;
                }
                case 266: {
                    dn.field_k = stackIn_266_0;
                    statePc = 267;
                    continue stateLoop;
                }
                case 267: {
                    if (var12.field_rb == 0) {
                        statePc = 294;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 268: {
                    if (var12.f((byte) -78)) {
                        statePc = 294;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    if (var12.field_Db.field_rb != 0) {
                        statePc = 277;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 274: {
                    aj.a(param6, (byte) -100, var12, var32);
                    if (var41 == 0) {
                        statePc = 294;
                    } else {
                        statePc = 277;
                    }
                    continue stateLoop;
                }
                case 277: {
                    if (!var12.field_Ab) {
                        statePc = 289;
                    } else {
                        statePc = 280;
                    }
                    continue stateLoop;
                }
                case 280: {
                    if (!var12.field_mc) {
                        statePc = 292;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    if (var12.field_cc) {
                        statePc = 289;
                    } else {
                        statePc = 286;
                    }
                    continue stateLoop;
                }
                case 286: {
                    if (!var12.field_Jb) {
                        statePc = 292;
                    } else {
                        statePc = 289;
                    }
                    continue stateLoop;
                }
                case 289: {
                    sq.a(-57, param4, var12.g(-103));
                    if (var41 == 0) {
                        statePc = 294;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 292: {
                    os.a(var12.g(-121), param4, true);
                    statePc = 294;
                    continue stateLoop;
                }
                case 294: {
                    var12 = (fb) (Object) var8.a((byte) -71);
                    if (var41 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 297: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final synchronized void c(int param0, int param1) {
        try {
            ((ga) this).field_H = param1;
            if (param0 != 598) {
                this.a(-76, -5, true, 106);
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ga.T(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(nk[] param0, int param1, bc param2, int[] param3, bi[][] param4, String[] param5, int param6, bc param7, byte[] param8, String[][] param9, bc param10, byte[] param11, boolean param12, String[][] param13, int param14, int[] param15, bi[][] param16) {
        RuntimeException var17 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
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
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        try {
          L0: {
            L1: {
              ur.a(param4, param1, param8, param12, param10, param15, param16, param5, (String[]) null, -82, param11, param7, param2, param0, param13, 1, param9, param3, param6);
              if (param14 == 16384) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var17 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var17;
            stackOut_3_1 = new StringBuilder().append("ga.DA(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
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
          L6: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param5 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L6;
            }
          }
          L7: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param6).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param7 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param8 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L8;
            }
          }
          L9: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param9 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L9;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L9;
            }
          }
          L10: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');
            stackIn_38_0 = stackOut_35_0;
            stackIn_38_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param10 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L10;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_39_0 = stackOut_36_0;
              stackIn_39_1 = stackOut_36_1;
              stackIn_39_2 = stackOut_36_2;
              break L10;
            }
          }
          L11: {
            stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
            stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',');
            stackIn_42_0 = stackOut_39_0;
            stackIn_42_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param11 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L11;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_43_0 = stackOut_40_0;
              stackIn_43_1 = stackOut_40_1;
              stackIn_43_2 = stackOut_40_2;
              break L11;
            }
          }
          L12: {
            stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
            stackOut_43_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',').append(param12).append(',');
            stackIn_46_0 = stackOut_43_0;
            stackIn_46_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param13 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L12;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_47_0 = stackOut_44_0;
              stackIn_47_1 = stackOut_44_1;
              stackIn_47_2 = stackOut_44_2;
              break L12;
            }
          }
          L13: {
            stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
            stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',').append(param14).append(',');
            stackIn_50_0 = stackOut_47_0;
            stackIn_50_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param15 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L13;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_51_0 = stackOut_48_0;
              stackIn_51_1 = stackOut_48_1;
              stackIn_51_2 = stackOut_48_2;
              break L13;
            }
          }
          L14: {
            stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
            stackOut_51_1 = ((StringBuilder) (Object) stackIn_51_1).append(stackIn_51_2).append(',');
            stackIn_54_0 = stackOut_51_0;
            stackIn_54_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param16 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L14;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_55_0 = stackOut_52_0;
              stackIn_55_1 = stackOut_52_1;
              stackIn_55_2 = stackOut_52_2;
              break L14;
            }
          }
          throw r.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + ')');
        }
    }

    private final synchronized void b(int param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((ga) this).field_x.d();
              if (param0 == 16384) {
                break L1;
              } else {
                boolean discarded$2 = ((ga) this).h(18);
                break L1;
              }
            }
            ((ga) this).field_z = null;
            this.a(-1, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var3, "ga.IA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(int param0, byte param1) {
        RuntimeException runtimeException = null;
        qq var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3 = (qq) (Object) ((ga) this).field_l.field_n.d(0);
            if (param1 == 68) {
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
                              if (~param0 != ~var3.field_y) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L6: {
                            if (var3.field_K != null) {
                              L7: {
                                var3.field_K.g(ap.field_j / 100);
                                if (var3.field_K.e()) {
                                  ((ga) this).field_l.field_o.a((tn) (Object) var3.field_K);
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              var3.d(false);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          L8: {
                            if (var3.field_E >= 0) {
                              break L8;
                            } else {
                              ((ga) this).field_N[var3.field_y][var3.field_H] = null;
                              break L8;
                            }
                          }
                          var3.b((byte) -60);
                          break L4;
                        }
                        var3 = (qq) (Object) ((ga) this).field_l.field_n.a((byte) -71);
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
          throw r.a((Throwable) (Object) runtimeException, "ga.HA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(boolean param0, int param1) {
        RuntimeException var3 = null;
        qq var3_ref = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                ((ga) this).a(72, (qq) null, true);
                break L1;
              }
            }
            L2: {
              L3: {
                if ((2 & ((ga) this).field_F[param1]) != 0) {
                  var3_ref = (qq) (Object) ((ga) this).field_l.field_n.d(0);
                  L4: while (true) {
                    if (var3_ref == null) {
                      break L3;
                    } else {
                      if (var4 != 0) {
                        break L2;
                      } else {
                        L5: {
                          if (~var3_ref.field_y != ~param1) {
                            break L5;
                          } else {
                            if (null == ((ga) this).field_N[param1][var3_ref.field_H]) {
                              if (var3_ref.field_E >= 0) {
                                break L5;
                              } else {
                                var3_ref.field_E = 0;
                                break L5;
                              }
                            } else {
                              break L5;
                            }
                          }
                        }
                        var3_ref = (qq) (Object) ((ga) this).field_l.field_n.a((byte) -71);
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
          throw r.a((Throwable) (Object) var3, "ga.WA(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        try {
            ij.a(3974311, param4, true, param2, param0, param1);
            if (param3 > -57) {
                ga.a((nk[]) null, 95, (bc) null, (int[]) null, (bi[][]) null, (String[]) null, -102, (bc) null, (byte[]) null, (String[][]) null, (bc) null, (byte[]) null, false, (String[][]) null, 52, (int[]) null, (bi[][]) null);
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ga.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final synchronized void a(gh param0, byte param1, boolean param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a(param2, param0, 114, true);
              if (param1 == 101) {
                break L1;
              } else {
                ((ga) this).field_n = -99L;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ga.R(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((ga) this).field_x.f()) {
                var4_int = ((ga) this).field_x.field_e * ((ga) this).field_M / ap.field_j;
                L2: while (true) {
                  L3: {
                    var5 = ((ga) this).field_O - -((long)param2 * (long)var4_int);
                    if (0L <= ((ga) this).field_n - var5) {
                      ((ga) this).field_O = var5;
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
                    var7 = (int)((-((ga) this).field_O + (((ga) this).field_n - (-(long)var4_int - -1L))) / (long)var4_int);
                    ((ga) this).field_O = ((ga) this).field_O + (long)var7 * (long)var4_int;
                    ((ga) this).field_l.b(param0, param1, var7);
                    param1 = param1 + var7;
                    param2 = param2 - var7;
                    this.a((byte) -64);
                    if (((ga) this).field_x.f()) {
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
              } else {
                break L1;
              }
            }
            ((ga) this).field_l.b(param0, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("ga.G(");
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
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
          throw r.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 < 0) {
              param1 = 0;
              L1: while (true) {
                L2: {
                  if (param1 >= 16) {
                    break L2;
                  } else {
                    this.a((byte) -63, param1);
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
            } else {
              L3: {
                ((ga) this).field_y[param1] = 12800;
                ((ga) this).field_G[param1] = 8192;
                if (param0 == -63) {
                  break L3;
                } else {
                  tn discarded$2 = ((ga) this).d();
                  break L3;
                }
              }
              ((ga) this).field_s[param1] = 16383;
              ((ga) this).field_T[param1] = 8192;
              ((ga) this).field_p[param1] = 0;
              ((ga) this).field_J[param1] = 8192;
              this.a(true, param1);
              this.d(0, param1);
              ((ga) this).field_F[param1] = 0;
              ((ga) this).field_q[param1] = 32767;
              ((ga) this).field_r[param1] = 256;
              ((ga) this).field_t[param1] = 0;
              this.a(70, 8192, param1);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var3, "ga.P(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param1) {
                  break L2;
                } else {
                  this.a(-1, 2);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.b(-1, (byte) 68);
              break L1;
            }
            this.a((byte) -63, param0);
            var3_int = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (var3_int >= 16) {
                    break L5;
                  } else {
                    ((ga) this).field_I[var3_int] = ((ga) this).field_m[var3_int];
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
                    if (16 <= var3_int) {
                      break L8;
                    } else {
                      ((ga) this).field_P[var3_int] = we.a(((ga) this).field_m[var3_int], -128);
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
          throw r.a((Throwable) (Object) var3, "ga.LA(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(byte param0, qq param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (param1.field_K == null) {
              L1: {
                if (param1.field_E < 0) {
                  break L1;
                } else {
                  param1.b((byte) -114);
                  if (param1.field_z <= 0) {
                    break L1;
                  } else {
                    if (param1 != ((ga) this).field_K[param1.field_y][param1.field_z]) {
                      break L1;
                    } else {
                      ((ga) this).field_K[param1.field_y][param1.field_z] = null;
                      break L1;
                    }
                  }
                }
              }
              stackOut_12_0 = 1;
              stackIn_13_0 = stackOut_12_0;
              return stackIn_13_0 != 0;
            } else {
              var3_int = -106 % ((param0 - 64) / 53);
              stackOut_14_0 = 0;
              stackIn_15_0 = stackOut_14_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("ga.UA(").append(param0).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_15_0 != 0;
    }

    private final void a(int param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = 97 % ((-65 - param1) / 35);
            var4 = 240 & param0;
            if (128 == var4) {
              var5 = 15 & param0;
              var6 = (32672 & param0) >> -328733080;
              var7 = (8354916 & param0) >> 539580336;
              this.a((byte) 29, var7, var5, var6);
              return;
            } else {
              if (144 != var4) {
                if (var4 != 160) {
                  if (var4 == 176) {
                    L1: {
                      var5 = 15 & param0;
                      var6 = 127 & param0 >> 1346115592;
                      var7 = 127 & param0 >> 1562758128;
                      if (var6 != 0) {
                        break L1;
                      } else {
                        ((ga) this).field_P[var5] = (var7 << 1687823918) + we.a(-2080769, ((ga) this).field_P[var5]);
                        break L1;
                      }
                    }
                    L2: {
                      if (var6 != 32) {
                        break L2;
                      } else {
                        ((ga) this).field_P[var5] = (var7 << -1009531001) + we.a(-16257, ((ga) this).field_P[var5]);
                        break L2;
                      }
                    }
                    L3: {
                      if (var6 != 1) {
                        break L3;
                      } else {
                        ((ga) this).field_p[var5] = we.a(-16257, ((ga) this).field_p[var5]) + (var7 << 1703605415);
                        break L3;
                      }
                    }
                    L4: {
                      if (33 != var6) {
                        break L4;
                      } else {
                        ((ga) this).field_p[var5] = var7 + we.a(((ga) this).field_p[var5], -128);
                        break L4;
                      }
                    }
                    L5: {
                      if (var6 != 5) {
                        break L5;
                      } else {
                        ((ga) this).field_J[var5] = we.a(-16257, ((ga) this).field_J[var5]) - -(var7 << -1415207577);
                        break L5;
                      }
                    }
                    L6: {
                      if (37 != var6) {
                        break L6;
                      } else {
                        ((ga) this).field_J[var5] = var7 + we.a(((ga) this).field_J[var5], -128);
                        break L6;
                      }
                    }
                    L7: {
                      if (var6 == 7) {
                        ((ga) this).field_y[var5] = (var7 << 72489447) + we.a(-16257, ((ga) this).field_y[var5]);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (39 == var6) {
                        ((ga) this).field_y[var5] = we.a(-128, ((ga) this).field_y[var5]) - -var7;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (var6 == 10) {
                        ((ga) this).field_G[var5] = (var7 << 1673748071) + we.a(((ga) this).field_G[var5], -16257);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (42 == var6) {
                        ((ga) this).field_G[var5] = we.a(((ga) this).field_G[var5], -128) - -var7;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (var6 != 11) {
                        break L11;
                      } else {
                        ((ga) this).field_s[var5] = (var7 << 1280189543) + we.a(-16257, ((ga) this).field_s[var5]);
                        break L11;
                      }
                    }
                    L12: {
                      if (var6 != 43) {
                        break L12;
                      } else {
                        ((ga) this).field_s[var5] = var7 + we.a(((ga) this).field_s[var5], -128);
                        break L12;
                      }
                    }
                    L13: {
                      if (var6 == 64) {
                        L14: {
                          if (var7 < 64) {
                            break L14;
                          } else {
                            ((ga) this).field_F[var5] = ee.a(((ga) this).field_F[var5], 1);
                            if (var9 == 0) {
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        ((ga) this).field_F[var5] = we.a(((ga) this).field_F[var5], -2);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L15: {
                      if (var6 == 65) {
                        L16: {
                          if (var7 < 64) {
                            break L16;
                          } else {
                            ((ga) this).field_F[var5] = ee.a(((ga) this).field_F[var5], 2);
                            if (var9 == 0) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        this.a(true, var5);
                        ((ga) this).field_F[var5] = we.a(((ga) this).field_F[var5], -3);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    L17: {
                      if (var6 == 99) {
                        ((ga) this).field_q[var5] = (var7 << 320420743) + we.a(127, ((ga) this).field_q[var5]);
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    L18: {
                      if (98 == var6) {
                        ((ga) this).field_q[var5] = var7 + we.a(16256, ((ga) this).field_q[var5]);
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    L19: {
                      if (var6 == 101) {
                        ((ga) this).field_q[var5] = we.a(((ga) this).field_q[var5], 127) + (16384 + (var7 << 1291856647));
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    L20: {
                      if (var6 == 100) {
                        ((ga) this).field_q[var5] = 16384 + (we.a(((ga) this).field_q[var5], 16256) + var7);
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    L21: {
                      if (var6 != 120) {
                        break L21;
                      } else {
                        this.b(var5, (byte) 68);
                        break L21;
                      }
                    }
                    L22: {
                      if (var6 == 121) {
                        this.a((byte) -63, var5);
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    L23: {
                      if (var6 != 123) {
                        break L23;
                      } else {
                        this.a(var5, 2);
                        break L23;
                      }
                    }
                    L24: {
                      if (var6 != 6) {
                        break L24;
                      } else {
                        var8 = ((ga) this).field_q[var5];
                        if (var8 == 16384) {
                          ((ga) this).field_r[var5] = we.a(((ga) this).field_r[var5], -16257) + (var7 << 1832420935);
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                    }
                    L25: {
                      if (var6 != 38) {
                        break L25;
                      } else {
                        var8 = ((ga) this).field_q[var5];
                        if (var8 != 16384) {
                          break L25;
                        } else {
                          ((ga) this).field_r[var5] = var7 + we.a(((ga) this).field_r[var5], -128);
                          break L25;
                        }
                      }
                    }
                    L26: {
                      if (var6 != 16) {
                        break L26;
                      } else {
                        ((ga) this).field_t[var5] = (var7 << -144902265) + we.a(((ga) this).field_t[var5], -16257);
                        break L26;
                      }
                    }
                    L27: {
                      if (var6 != 48) {
                        break L27;
                      } else {
                        ((ga) this).field_t[var5] = we.a(((ga) this).field_t[var5], -128) - -var7;
                        break L27;
                      }
                    }
                    L28: {
                      if (81 != var6) {
                        break L28;
                      } else {
                        L29: {
                          if (var7 < 64) {
                            break L29;
                          } else {
                            ((ga) this).field_F[var5] = ee.a(((ga) this).field_F[var5], 4);
                            if (var9 == 0) {
                              break L28;
                            } else {
                              break L29;
                            }
                          }
                        }
                        this.d(0, var5);
                        ((ga) this).field_F[var5] = we.a(((ga) this).field_F[var5], -5);
                        break L28;
                      }
                    }
                    L30: {
                      if (var6 != 17) {
                        break L30;
                      } else {
                        this.a(-72, (var7 << 576861319) + (-16257 & ((ga) this).field_E[var5]), var5);
                        break L30;
                      }
                    }
                    L31: {
                      if (var6 == 49) {
                        this.a(46, (((ga) this).field_E[var5] & -128) - -var7, var5);
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                    return;
                  } else {
                    if (var4 == 192) {
                      var5 = param0 & 15;
                      var6 = (32569 & param0) >> -1084866744;
                      this.a(var5, ((ga) this).field_P[var5] - -var6, (byte) 119);
                      return;
                    } else {
                      if (var4 == 208) {
                        var5 = param0 & 15;
                        var6 = param0 >> -242097656 & 127;
                        this.a(var5, (byte) 98, var6);
                        return;
                      } else {
                        if (224 == var4) {
                          var5 = 15 & param0;
                          var6 = (127 & param0 >> 1711093192) + (param0 >> 1341813865 & 16256);
                          this.b(var5, (byte) -34, var6);
                          return;
                        } else {
                          var4 = param0 & 255;
                          if (var4 == 255) {
                            this.a(-1, true);
                            decompiledRegionSelector0 = 0;
                            break L0;
                          } else {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                } else {
                  var5 = param0 & 15;
                  var6 = param0 >> 493943080 & 127;
                  var7 = (param0 & 8368783) >> 762365424;
                  this.a(var5, var7, true, var6);
                  return;
                }
              } else {
                L32: {
                  L33: {
                    var5 = param0 & 15;
                    var6 = param0 >> 98725160 & 127;
                    var7 = 127 & param0 >> -318801456;
                    if (var7 <= 0) {
                      break L33;
                    } else {
                      this.a(var6, var5, var7, (byte) -49);
                      if (var9 == 0) {
                        break L32;
                      } else {
                        break L33;
                      }
                    }
                  }
                  this.a((byte) 29, 64, var5, var6);
                  break L32;
                }
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var3, "ga.FA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
          throw r.a((Throwable) (Object) var1, "ga.H()");
        }
        return stackIn_1_0;
    }

    final static void g(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 14745) {
                break L1;
              } else {
                field_L = null;
                break L1;
              }
            }
            jq.field_d = null;
            rs.field_Fb = -1;
            sc.field_q = false;
            ra.field_g = -1;
            rq.field_e = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "ga.NA(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, boolean param2, int param3) {
        try {
            if (!param2) {
                ((ga) this).field_u = null;
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ga.JA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final synchronized void a(boolean param0, gh param1, int param2, boolean param3) {
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
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            this.b(16384, param3);
            ((ga) this).field_x.a(param1.field_h);
            ((ga) this).field_v = param0;
            ((ga) this).field_O = 0L;
            var5_int = ((ga) this).field_x.c();
            var6 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var5_int <= var6) {
                    break L3;
                  } else {
                    ((ga) this).field_x.b(var6);
                    ((ga) this).field_x.d(var6);
                    ((ga) this).field_x.e(var6);
                    var6++;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ((ga) this).field_C = ((ga) this).field_x.g();
                ((ga) this).field_D = ((ga) this).field_x.field_b[((ga) this).field_C];
                ((ga) this).field_n = ((ga) this).field_x.c(((ga) this).field_D);
                break L2;
              }
              L4: {
                if (param2 >= 32) {
                  break L4;
                } else {
                  this.b(-59, true);
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("ga.W(").append(param0).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
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
          throw r.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized tn d() {
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
          throw r.a((Throwable) (Object) var1, "ga.A()");
        }
        return (tn) (Object) stackIn_1_0;
    }

    private final void d(int param0, int param1) {
        RuntimeException runtimeException = null;
        qq var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if ((4 & ((ga) this).field_F[param1]) == param0) {
                  break L2;
                } else {
                  var3 = (qq) (Object) ((ga) this).field_l.field_n.d(0);
                  L3: while (true) {
                    if (var3 == null) {
                      break L2;
                    } else {
                      if (var4 != 0) {
                        break L1;
                      } else {
                        L4: {
                          if (var3.field_y == param1) {
                            var3.field_j = 0;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var3 = (qq) (Object) ((ga) this).field_l.field_n.a((byte) -71);
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
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) (Object) runtimeException, "ga.O(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        qq var5_ref = null;
        br var5_ref2 = null;
        kk var6 = null;
        int var6_int = 0;
        qq var7 = null;
        int var8 = 0;
        qq var9 = null;
        int var10 = 0;
        qq stackIn_5_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        qq stackIn_28_2 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        qq stackIn_30_2 = null;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        qq stackIn_32_2 = null;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        qq stackIn_33_2 = null;
        int stackIn_33_3 = 0;
        RuntimeException decompiledCaughtException = null;
        qq stackOut_4_0 = null;
        oh stackOut_14_0 = null;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        qq stackOut_27_2 = null;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        qq stackOut_32_2 = null;
        int stackOut_32_3 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        qq stackOut_28_2 = null;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        qq stackOut_30_2 = null;
        int stackOut_30_3 = 0;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                this.a((byte) 29, 64, param1, param0);
                if (0 == (((ga) this).field_F[param1] & 2)) {
                  break L2;
                } else {
                  var5_ref = (qq) (Object) ((ga) this).field_l.field_n.f(3725);
                  L3: while (true) {
                    if (null == var5_ref) {
                      break L2;
                    } else {
                      stackOut_4_0 = (qq) var5_ref;
                      stackIn_15_0 = (Object) (Object) stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var10 != 0) {
                        break L1;
                      } else {
                        L4: {
                          if (stackIn_5_0.field_y != param1) {
                            break L4;
                          } else {
                            if (var5_ref.field_E >= 0) {
                              break L4;
                            } else {
                              ((ga) this).field_N[param1][var5_ref.field_H] = null;
                              ((ga) this).field_N[param1][param0] = var5_ref;
                              var6_int = (var5_ref.field_G * var5_ref.field_r >> -771862196) + var5_ref.field_J;
                              var5_ref.field_J = var5_ref.field_J + (-var5_ref.field_H + param0 << 2079003016);
                              var5_ref.field_G = 4096;
                              var5_ref.field_r = -var5_ref.field_J + var6_int;
                              var5_ref.field_H = param0;
                              return;
                            }
                          }
                        }
                        var5_ref = (qq) (Object) ((ga) this).field_l.field_n.b(-123);
                        if (var10 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_14_0 = ((ga) this).field_Q.a((long)((ga) this).field_I[param1], -25064);
              stackIn_15_0 = (Object) (Object) stackOut_14_0;
              break L1;
            }
            var5_ref2 = (br) (Object) stackIn_15_0;
            if (null == var5_ref2) {
              return;
            } else {
              var6 = var5_ref2.field_h[param0];
              if (var6 == null) {
                return;
              } else {
                L5: {
                  L6: {
                    var7 = new qq();
                    var7.field_y = param1;
                    var7.field_A = var5_ref2;
                    var7.field_M = var6;
                    var7.field_u = var5_ref2.field_j[param0];
                    var7.field_z = var5_ref2.field_r[param0];
                    var7.field_H = param0;
                    var7.field_k = var5_ref2.field_s[param0] * param2 * param2 * var5_ref2.field_q - -1024 >> 479233579;
                    var7.field_q = var5_ref2.field_t[param0] & 255;
                    var8 = 26 % ((3 - param3) / 39);
                    var7.field_J = (param0 << 1294558216) + -(var5_ref2.field_k[param0] & 32767);
                    var7.field_B = 0;
                    var7.field_E = -1;
                    var7.field_F = 0;
                    var7.field_h = 0;
                    var7.field_v = 0;
                    if (((ga) this).field_t[param1] != 0) {
                      break L6;
                    } else {
                      var7.field_K = al.a(var6, this.b(var7, (byte) -6), this.a(var7, -1481279096), this.a(var7, (byte) 124));
                      if (var10 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    var7.field_K = al.a(var6, this.b(var7, (byte) -123), 0, this.a(var7, (byte) 120));
                    stackOut_27_0 = this;
                    stackOut_27_1 = -2139009338;
                    stackOut_27_2 = (qq) var7;
                    stackIn_32_0 = stackOut_27_0;
                    stackIn_32_1 = stackOut_27_1;
                    stackIn_32_2 = stackOut_27_2;
                    stackIn_28_0 = stackOut_27_0;
                    stackIn_28_1 = stackOut_27_1;
                    stackIn_28_2 = stackOut_27_2;
                    if (var5_ref2.field_k[param0] >= 0) {
                      stackOut_32_0 = this;
                      stackOut_32_1 = stackIn_32_1;
                      stackOut_32_2 = (qq) (Object) stackIn_32_2;
                      stackOut_32_3 = 0;
                      stackIn_33_0 = stackOut_32_0;
                      stackIn_33_1 = stackOut_32_1;
                      stackIn_33_2 = stackOut_32_2;
                      stackIn_33_3 = stackOut_32_3;
                      break L7;
                    } else {
                      stackOut_28_0 = this;
                      stackOut_28_1 = stackIn_28_1;
                      stackOut_28_2 = (qq) (Object) stackIn_28_2;
                      stackIn_30_0 = stackOut_28_0;
                      stackIn_30_1 = stackOut_28_1;
                      stackIn_30_2 = stackOut_28_2;
                      stackOut_30_0 = this;
                      stackOut_30_1 = stackIn_30_1;
                      stackOut_30_2 = (qq) (Object) stackIn_30_2;
                      stackOut_30_3 = 1;
                      stackIn_33_0 = stackOut_30_0;
                      stackIn_33_1 = stackOut_30_1;
                      stackIn_33_2 = stackOut_30_2;
                      stackIn_33_3 = stackOut_30_3;
                      break L7;
                    }
                  }
                  ((ga) this).a(stackIn_33_1, stackIn_33_2, stackIn_33_3 != 0);
                  break L5;
                }
                L8: {
                  if (0 > var5_ref2.field_k[param0]) {
                    var7.field_K.f(-1);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (0 > var7.field_z) {
                    break L9;
                  } else {
                    L10: {
                      var9 = ((ga) this).field_K[param1][var7.field_z];
                      if (var9 == null) {
                        break L10;
                      } else {
                        if (0 > var9.field_E) {
                          ((ga) this).field_N[param1][var9.field_H] = null;
                          var9.field_E = 0;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                    ((ga) this).field_K[param1][var7.field_z] = var7;
                    break L9;
                  }
                }
                ((ga) this).field_l.field_n.a((byte) -113, (oh) (Object) var7);
                ((ga) this).field_N[param1][param0] = var7;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var5, "ga.EA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int[] param1, int param2, qq param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        kc var7 = null;
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
        int stackIn_119_0 = 0;
        int stackIn_124_0 = 0;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        String stackIn_129_2 = null;
        RuntimeException stackIn_130_0 = null;
        StringBuilder stackIn_130_1 = null;
        RuntimeException stackIn_132_0 = null;
        StringBuilder stackIn_132_1 = null;
        RuntimeException stackIn_133_0 = null;
        StringBuilder stackIn_133_1 = null;
        String stackIn_133_2 = null;
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
        int stackOut_123_0 = 0;
        int stackOut_118_0 = 0;
        RuntimeException stackOut_125_0 = null;
        StringBuilder stackOut_125_1 = null;
        RuntimeException stackOut_128_0 = null;
        StringBuilder stackOut_128_1 = null;
        String stackOut_128_2 = null;
        RuntimeException stackOut_126_0 = null;
        StringBuilder stackOut_126_1 = null;
        String stackOut_126_2 = null;
        RuntimeException stackOut_129_0 = null;
        StringBuilder stackOut_129_1 = null;
        RuntimeException stackOut_132_0 = null;
        StringBuilder stackOut_132_1 = null;
        String stackOut_132_2 = null;
        RuntimeException stackOut_130_0 = null;
        StringBuilder stackOut_130_1 = null;
        String stackOut_130_2 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              param3.field_p = ap.field_j / 100;
              if (0 > param3.field_E) {
                break L1;
              } else {
                L2: {
                  if (param3.field_K == null) {
                    break L2;
                  } else {
                    if (param3.field_K.g()) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  param3.d(false);
                  param3.b((byte) -68);
                  if (param3.field_z <= 0) {
                    break L3;
                  } else {
                    if (((ga) this).field_K[param3.field_y][param3.field_z] != param3) {
                      break L3;
                    } else {
                      ((ga) this).field_K[param3.field_y][param3.field_z] = null;
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
              var6_int = param3.field_G;
              if (var6_int > 0) {
                L5: {
                  var6_int = var6_int - (int)(Math.pow(2.0, (double)((ga) this).field_J[param3.field_y] * 0.0004921259842519685) * 16.0 + 0.5);
                  if (var6_int >= 0) {
                    break L5;
                  } else {
                    var6_int = 0;
                    break L5;
                  }
                }
                param3.field_G = var6_int;
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              param3.field_K.d(this.b(param3, (byte) -1));
              var7 = param3.field_u;
              param3.field_i = param3.field_i + var7.field_o;
              param3.field_C = param3.field_C + 1;
              var8 = 0;
              var9 = 0.000005086263020833333 * (double)((-60 + param3.field_H << -1725115960) + (param3.field_G * param3.field_r >> 1049960876));
              if (var7.field_h <= 0) {
                break L6;
              } else {
                L7: {
                  L8: {
                    if (var7.field_a <= 0) {
                      break L8;
                    } else {
                      param3.field_h = param3.field_h + (int)(Math.pow(2.0, var9 * (double)var7.field_a) * 128.0 + 0.5);
                      if (var11 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  param3.field_h = param3.field_h + 128;
                  break L7;
                }
                if (var7.field_h * param3.field_h >= 819200) {
                  var8 = 1;
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L9: {
              if (null == var7.field_n) {
                break L9;
              } else {
                L10: {
                  L11: {
                    if (var7.field_k > 0) {
                      break L11;
                    } else {
                      param3.field_F = param3.field_F + 128;
                      if (var11 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  param3.field_F = param3.field_F + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_k) * 128.0);
                  break L10;
                }
                L12: while (true) {
                  L13: {
                    L14: {
                      if (param3.field_B >= var7.field_n.length + -2) {
                        break L14;
                      } else {
                        stackOut_47_0 = ~(65280 & var7.field_n[2 + param3.field_B] << -882586360);
                        stackOut_47_1 = ~param3.field_F;
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
                            param3.field_B = param3.field_B + 2;
                            if (var11 == 0) {
                              continue L12;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                    }
                    stackOut_54_0 = -2 + var7.field_n.length;
                    stackOut_54_1 = param3.field_B;
                    stackIn_55_0 = stackOut_54_0;
                    stackIn_55_1 = stackOut_54_1;
                    break L13;
                  }
                  if (stackIn_55_0 != stackIn_55_1) {
                    break L9;
                  } else {
                    if (var7.field_n[1 + param3.field_B] == 0) {
                      var8 = 1;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
              }
            }
            L15: {
              if (param3.field_E < 0) {
                break L15;
              } else {
                if (var7.field_e == null) {
                  break L15;
                } else {
                  if ((1 & ((ga) this).field_F[param3.field_y]) == 0) {
                    L16: {
                      if (param3.field_z < 0) {
                        break L16;
                      } else {
                        if (((ga) this).field_K[param3.field_y][param3.field_z] == param3) {
                          break L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                    L17: {
                      L18: {
                        if (var7.field_c > 0) {
                          break L18;
                        } else {
                          param3.field_E = param3.field_E + 128;
                          if (var11 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      param3.field_E = param3.field_E + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_c * var9));
                      break L17;
                    }
                    L19: while (true) {
                      L20: {
                        L21: {
                          if (~param3.field_v <= ~(-2 + var7.field_e.length)) {
                            break L21;
                          } else {
                            stackOut_84_0 = ~param3.field_E;
                            stackOut_84_1 = ~((255 & var7.field_e[2 + param3.field_v]) << -506654296);
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
                                param3.field_v = param3.field_v + 2;
                                if (var11 == 0) {
                                  continue L19;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                        }
                        stackOut_91_0 = -2 + var7.field_e.length;
                        stackOut_91_1 = param3.field_v;
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
            if (var8 == 0) {
              L22: {
                if (param2 == 2) {
                  break L22;
                } else {
                  this.a(-71, -84, -11);
                  break L22;
                }
              }
              param3.field_K.a(param3.field_p, this.a(param3, -1481279096), this.a(param3, (byte) 122));
              stackOut_123_0 = 0;
              stackIn_124_0 = stackOut_123_0;
              break L0;
            } else {
              L23: {
                L24: {
                  param3.field_K.g(param3.field_p);
                  if (param1 == null) {
                    break L24;
                  } else {
                    param3.field_K.b(param1, param0, param4);
                    if (var11 == 0) {
                      break L23;
                    } else {
                      break L24;
                    }
                  }
                }
                param3.field_K.a(param4);
                break L23;
              }
              L25: {
                if (param3.field_K.e()) {
                  ((ga) this).field_l.field_o.a((tn) (Object) param3.field_K);
                  break L25;
                } else {
                  break L25;
                }
              }
              L26: {
                param3.d(false);
                if (param3.field_E < 0) {
                  break L26;
                } else {
                  param3.b((byte) -58);
                  if (param3.field_z <= 0) {
                    break L26;
                  } else {
                    if (((ga) this).field_K[param3.field_y][param3.field_z] == param3) {
                      ((ga) this).field_K[param3.field_y][param3.field_z] = null;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                }
              }
              stackOut_118_0 = 1;
              stackIn_119_0 = stackOut_118_0;
              return stackIn_119_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var6 = decompiledCaughtException;
            stackOut_125_0 = (RuntimeException) var6;
            stackOut_125_1 = new StringBuilder().append("ga.C(").append(param0).append(',');
            stackIn_128_0 = stackOut_125_0;
            stackIn_128_1 = stackOut_125_1;
            stackIn_126_0 = stackOut_125_0;
            stackIn_126_1 = stackOut_125_1;
            if (param1 == null) {
              stackOut_128_0 = (RuntimeException) (Object) stackIn_128_0;
              stackOut_128_1 = (StringBuilder) (Object) stackIn_128_1;
              stackOut_128_2 = "null";
              stackIn_129_0 = stackOut_128_0;
              stackIn_129_1 = stackOut_128_1;
              stackIn_129_2 = stackOut_128_2;
              break L27;
            } else {
              stackOut_126_0 = (RuntimeException) (Object) stackIn_126_0;
              stackOut_126_1 = (StringBuilder) (Object) stackIn_126_1;
              stackOut_126_2 = "{...}";
              stackIn_129_0 = stackOut_126_0;
              stackIn_129_1 = stackOut_126_1;
              stackIn_129_2 = stackOut_126_2;
              break L27;
            }
          }
          L28: {
            stackOut_129_0 = (RuntimeException) (Object) stackIn_129_0;
            stackOut_129_1 = ((StringBuilder) (Object) stackIn_129_1).append(stackIn_129_2).append(',').append(param2).append(',');
            stackIn_132_0 = stackOut_129_0;
            stackIn_132_1 = stackOut_129_1;
            stackIn_130_0 = stackOut_129_0;
            stackIn_130_1 = stackOut_129_1;
            if (param3 == null) {
              stackOut_132_0 = (RuntimeException) (Object) stackIn_132_0;
              stackOut_132_1 = (StringBuilder) (Object) stackIn_132_1;
              stackOut_132_2 = "null";
              stackIn_133_0 = stackOut_132_0;
              stackIn_133_1 = stackOut_132_1;
              stackIn_133_2 = stackOut_132_2;
              break L28;
            } else {
              stackOut_130_0 = (RuntimeException) (Object) stackIn_130_0;
              stackOut_130_1 = (StringBuilder) (Object) stackIn_130_1;
              stackOut_130_2 = "{...}";
              stackIn_133_0 = stackOut_130_0;
              stackIn_133_1 = stackOut_130_1;
              stackIn_133_2 = stackOut_130_2;
              break L28;
            }
          }
          throw r.a((Throwable) (Object) stackIn_133_0, stackIn_133_2 + ',' + param4 + ')');
        }
        return stackIn_124_0 != 0;
    }

    private final void a(int param0, int param1, byte param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = -35 / ((51 - param2) / 61);
                if (param1 != ((ga) this).field_I[param0]) {
                  ((ga) this).field_I[param0] = param1;
                  var5 = 0;
                  L3: while (true) {
                    if (128 <= var5) {
                      break L2;
                    } else {
                      ((ga) this).field_K[param0][var5] = null;
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
          throw r.a((Throwable) (Object) runtimeException, "ga.N(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void d(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -17876) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            field_o = null;
            field_w = null;
            field_L = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "ga.I(" + param0 + ')');
        }
    }

    private final int a(qq param0, byte param1) {
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
              if (param1 > 114) {
                break L1;
              } else {
                ((ga) this).field_u = null;
                break L1;
              }
            }
            var3_int = ((ga) this).field_G[param0.field_y];
            if (var3_int < 8192) {
              stackOut_6_0 = 32 + param0.field_q * var3_int >> 1516527270;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = -(32 + (128 + -param0.field_q) * (-var3_int + 16384) >> -280536794) + 16384;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ga.SA(");
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
          throw r.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    private final void a(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = ((ga) this).field_C;
              var3 = ((ga) this).field_D;
              var4 = ((ga) this).field_n;
              if (null == ((ga) this).field_z) {
                break L1;
              } else {
                if (~((ga) this).field_S == ~var3) {
                  this.a(((ga) this).field_v, ((ga) this).field_z, 33, ((ga) this).field_B);
                  this.a((byte) 109);
                  return;
                } else {
                  break L1;
                }
              }
            }
            var6 = -102 / ((-15 - param0) / 34);
            L2: while (true) {
              stackOut_10_0 = ~var3;
              stackOut_10_1 = ~((ga) this).field_D;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              L3: while (true) {
                L4: {
                  L5: {
                    L6: {
                      if (stackIn_11_0 != stackIn_11_1) {
                        break L6;
                      } else {
                        L7: while (true) {
                          stackOut_12_0 = ~((ga) this).field_x.field_b[var2_int];
                          stackOut_12_1 = ~var3;
                          stackIn_45_0 = stackOut_12_0;
                          stackIn_45_1 = stackOut_12_1;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          if (var8 != 0) {
                            break L5;
                          } else {
                            L8: {
                              if (stackIn_13_0 != stackIn_13_1) {
                                break L8;
                              } else {
                                ((ga) this).field_x.b(var2_int);
                                var7 = ((ga) this).field_x.a(var2_int);
                                stackOut_14_0 = -2;
                                stackOut_14_1 = ~var7;
                                stackIn_11_0 = stackOut_14_0;
                                stackIn_11_1 = stackOut_14_1;
                                stackIn_15_0 = stackOut_14_0;
                                stackIn_15_1 = stackOut_14_1;
                                if (var8 != 0) {
                                  continue L3;
                                } else {
                                  if (stackIn_15_0 != stackIn_15_1) {
                                    L9: {
                                      if ((var7 & 128) != 0) {
                                        this.a(var7, (byte) -121);
                                        break L9;
                                      } else {
                                        break L9;
                                      }
                                    }
                                    ((ga) this).field_x.d(var2_int);
                                    ((ga) this).field_x.e(var2_int);
                                    if (var8 == 0) {
                                      continue L7;
                                    } else {
                                      break L8;
                                    }
                                  } else {
                                    L10: {
                                      ((ga) this).field_x.e();
                                      ((ga) this).field_x.e(var2_int);
                                      if (((ga) this).field_x.a()) {
                                        break L10;
                                      } else {
                                        if (var8 == 0) {
                                          break L8;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    if (null == ((ga) this).field_z) {
                                      L11: {
                                        if (!((ga) this).field_v) {
                                          break L11;
                                        } else {
                                          if (var3 != 0) {
                                            ((ga) this).field_x.a(var4);
                                            if (var8 == 0) {
                                              break L8;
                                            } else {
                                              break L11;
                                            }
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                      this.a(-1, true);
                                      ((ga) this).field_x.d();
                                      return;
                                    } else {
                                      ((ga) this).a(((ga) this).field_z, (byte) 101, ((ga) this).field_v);
                                      this.a((byte) 29);
                                      return;
                                    }
                                  }
                                }
                              }
                            }
                            var2_int = ((ga) this).field_x.g();
                            var3 = ((ga) this).field_x.field_b[var2_int];
                            var4 = ((ga) this).field_x.c(var3);
                            if (var8 == 0) {
                              continue L2;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                    }
                    ((ga) this).field_C = var2_int;
                    ((ga) this).field_D = var3;
                    ((ga) this).field_n = var4;
                    if (((ga) this).field_z == null) {
                      break L4;
                    } else {
                      stackOut_43_0 = ~var3;
                      stackOut_43_1 = ~((ga) this).field_S;
                      stackIn_45_0 = stackOut_43_0;
                      stackIn_45_1 = stackOut_43_1;
                      break L5;
                    }
                  }
                  if (stackIn_45_0 < stackIn_45_1) {
                    ((ga) this).field_C = -1;
                    ((ga) this).field_D = ((ga) this).field_S;
                    ((ga) this).field_n = ((ga) this).field_x.c(((ga) this).field_D);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "ga.F(" + param0 + ')');
        }
    }

    final void a(int param0, qq param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -2139009338) {
                break L1;
              } else {
                ((ga) this).field_z = null;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  var4_int = param1.field_M.field_m.length;
                  if (!param2) {
                    break L4;
                  } else {
                    if (param1.field_M.field_i) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                var5 = (int)((long)((ga) this).field_t[param1.field_y] * (long)var4_int >> -2139009338);
                if (!ShatteredPlansClient.field_F) {
                  break L2;
                } else {
                  break L3;
                }
              }
              var6 = -param1.field_M.field_l + (var4_int + var4_int);
              var5 = (int)((long)((ga) this).field_t[param1.field_y] * (long)var6 >> -639684730);
              var4_int = var4_int << 8;
              if (~var5 <= ~var4_int) {
                param1.field_K.c(true);
                var5 = -var5 + var4_int - -var4_int + -1;
                break L2;
              } else {
                break L2;
              }
            }
            param1.field_K.h(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("ga.RA(").append(param0).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param2 + ')');
        }
    }

    private final int a(qq param0, int param1) {
        RuntimeException var3 = null;
        kc var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            if (((ga) this).field_A[param0.field_y] == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param1 == -1481279096) {
                L1: {
                  var3_ref = param0.field_u;
                  var4 = ((ga) this).field_y[param0.field_y] * ((ga) this).field_s[param0.field_y] + 4096 >> 2008746189;
                  var4 = var4 * var4 + 16384 >> -233436721;
                  var4 = param0.field_k * var4 + 16384 >> -432699537;
                  var4 = 128 + ((ga) this).field_H * var4 >> 865651272;
                  var4 = ((ga) this).field_A[param0.field_y] * var4 + 128 >> -1481279096;
                  if (var3_ref.field_h <= 0) {
                    break L1;
                  } else {
                    var4 = (int)(0.5 + (double)var4 * Math.pow(0.5, (double)param0.field_h * 0.00001953125 * (double)var3_ref.field_h));
                    break L1;
                  }
                }
                L2: {
                  if (null == var3_ref.field_n) {
                    break L2;
                  } else {
                    L3: {
                      var5 = param0.field_F;
                      var6 = var3_ref.field_n[1 + param0.field_B];
                      if (param0.field_B < var3_ref.field_n.length + -2) {
                        var7 = var3_ref.field_n[param0.field_B] << 820391432 & 65280;
                        var8 = (255 & var3_ref.field_n[2 + param0.field_B]) << -445601208;
                        var6 = var6 + (-var6 + var3_ref.field_n[param0.field_B - -3]) * (-var7 + var5) / (-var7 + var8);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var4 = var6 * var4 + 32 >> 789886086;
                    break L2;
                  }
                }
                L4: {
                  if (param0.field_E <= 0) {
                    break L4;
                  } else {
                    if (var3_ref.field_e != null) {
                      L5: {
                        var5 = param0.field_E;
                        var6 = var3_ref.field_e[1 + param0.field_v];
                        if (~(var3_ref.field_e.length + -2) >= ~param0.field_v) {
                          break L5;
                        } else {
                          var7 = (255 & var3_ref.field_e[param0.field_v]) << -1558118488;
                          var8 = var3_ref.field_e[2 + param0.field_v] << -1533511192 & 65280;
                          var6 = var6 + (var3_ref.field_e[param0.field_v + 3] + -var6) * (-var7 + var5) / (-var7 + var8);
                          break L5;
                        }
                      }
                      var4 = 32 + var4 * var6 >> 165727590;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                stackOut_25_0 = var4;
                stackIn_26_0 = stackOut_25_0;
                break L0;
              } else {
                stackOut_6_0 = 15;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var3;
            stackOut_27_1 = new StringBuilder().append("ga.PA(");
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L6;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param1 + ')');
        }
        return stackIn_26_0;
    }

    final synchronized void d(int param0, byte param1, int param2) {
        try {
            this.c(param0, (byte) 113, param2);
            if (param1 != -110) {
                tn discarded$0 = ((ga) this).b();
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ga.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized boolean h(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0 == 5309) {
                break L1;
              } else {
                field_L = null;
                break L1;
              }
            }
            stackOut_3_0 = ((ga) this).field_x.f();
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "ga.E(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    public ga() {
        ((ga) this).field_p = new int[16];
        ((ga) this).field_t = new int[16];
        ((ga) this).field_N = new qq[16][128];
        ((ga) this).field_r = new int[16];
        ((ga) this).field_H = 256;
        ((ga) this).field_M = 1000000;
        ((ga) this).field_q = new int[16];
        ((ga) this).field_P = new int[16];
        ((ga) this).field_y = new int[16];
        ((ga) this).field_G = new int[16];
        ((ga) this).field_K = new qq[16][128];
        ((ga) this).field_u = new int[16];
        ((ga) this).field_I = new int[16];
        ((ga) this).field_F = new int[16];
        ((ga) this).field_s = new int[16];
        ((ga) this).field_m = new int[16];
        ((ga) this).field_J = new int[16];
        ((ga) this).field_A = new int[16];
        ((ga) this).field_T = new int[16];
        ((ga) this).field_E = new int[16];
        ((ga) this).field_x = new pi();
        ((ga) this).field_l = new rc((ga) this);
        try {
            ((ga) this).field_Q = new ti(128);
            ((ga) this).a((byte) -90, -1, 256);
            this.a(-1, true);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ga.<init>()");
        }
    }

    ga(ga param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        ((ga) this).field_p = new int[16];
        ((ga) this).field_t = new int[16];
        ((ga) this).field_N = new qq[16][128];
        ((ga) this).field_r = new int[16];
        ((ga) this).field_H = 256;
        ((ga) this).field_M = 1000000;
        ((ga) this).field_q = new int[16];
        ((ga) this).field_P = new int[16];
        ((ga) this).field_y = new int[16];
        ((ga) this).field_G = new int[16];
        ((ga) this).field_K = new qq[16][128];
        ((ga) this).field_u = new int[16];
        ((ga) this).field_I = new int[16];
        ((ga) this).field_F = new int[16];
        ((ga) this).field_s = new int[16];
        ((ga) this).field_m = new int[16];
        ((ga) this).field_J = new int[16];
        ((ga) this).field_A = new int[16];
        ((ga) this).field_T = new int[16];
        ((ga) this).field_E = new int[16];
        ((ga) this).field_x = new pi();
        ((ga) this).field_l = new rc((ga) this);
        try {
          L0: {
            ((ga) this).field_Q = param0.field_Q;
            ((ga) this).a((byte) -75, -1, 256);
            this.a(-1, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ga.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Seriously offensive language";
        field_w = new byte[]{(byte) 4, (byte) 2, (byte) 0, (byte) 2, (byte) 0};
    }
}
