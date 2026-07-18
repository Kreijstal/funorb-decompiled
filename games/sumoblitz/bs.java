/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bs extends hj {
    private int field_E;
    private int[] field_L;
    private int[] field_H;
    int[] field_R;
    private int[] field_F;
    private int[] field_T;
    private int[] field_y;
    private sh field_v;
    private int[] field_B;
    private int[] field_S;
    private uu[][] field_P;
    private int field_r;
    private int[] field_D;
    private te field_p;
    int[] field_x;
    private int[] field_N;
    private int[] field_w;
    private int[] field_G;
    private uu[][] field_t;
    private int[] field_z;
    private int[] field_K;
    static char[] field_o;
    int[] field_J;
    private boolean field_M;
    private long field_q;
    private rh field_s;
    private int field_C;
    private long field_O;
    private int field_Q;
    private int field_u;
    private boolean field_A;
    private tv field_I;

    final synchronized boolean c(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0 == -8192) {
                break L1;
              } else {
                ((bs) this).a(false, (tv) null, -40);
                break L1;
              }
            }
            stackOut_3_0 = ((bs) this).field_v.c();
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "bs.DA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final synchronized hj c() {
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
          throw qo.a((Throwable) (Object) var1, "bs.G()");
        }
        return (hj) (Object) stackIn_1_0;
    }

    private final int c(int param0, uu param1) {
        RuntimeException var3 = null;
        mq var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_5_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 255) {
                break L1;
              } else {
                ((bs) this).field_T = null;
                break L1;
              }
            }
            if (((bs) this).field_y[param1.field_y] != 0) {
              L2: {
                var3_ref = param1.field_w;
                var4 = 4096 + ((bs) this).field_T[param1.field_y] * ((bs) this).field_w[param1.field_y] >> 1508202765;
                var4 = 16384 + var4 * var4 >> 1622959503;
                var4 = 16384 + param1.field_F * var4 >> -1884114673;
                var4 = 128 + ((bs) this).field_r * var4 >> 269218088;
                var4 = var4 * ((bs) this).field_y[param1.field_y] - -128 >> 2050093704;
                if (0 >= var3_ref.field_i) {
                  break L2;
                } else {
                  var4 = (int)(0.5 + (double)var4 * Math.pow(0.5, 0.00001953125 * (double)param1.field_v * (double)var3_ref.field_i));
                  break L2;
                }
              }
              L3: {
                if (null == var3_ref.field_g) {
                  break L3;
                } else {
                  L4: {
                    var5 = param1.field_G;
                    var6 = var3_ref.field_g[param1.field_r + 1];
                    if (~param1.field_r <= ~(-2 + var3_ref.field_g.length)) {
                      break L4;
                    } else {
                      var7 = 65280 & var3_ref.field_g[param1.field_r] << -2137375128;
                      var8 = var3_ref.field_g[param1.field_r + 2] << -1169234744 & 65280;
                      var6 = var6 + (var5 + -var7) * (-var6 + var3_ref.field_g[3 + param1.field_r]) / (-var7 + var8);
                      break L4;
                    }
                  }
                  var4 = 32 + var6 * var4 >> -570420186;
                  break L3;
                }
              }
              L5: {
                if (param1.field_x <= 0) {
                  break L5;
                } else {
                  if (var3_ref.field_h == null) {
                    break L5;
                  } else {
                    L6: {
                      var5 = param1.field_x;
                      var6 = var3_ref.field_h[1 + param1.field_n];
                      if (~(-2 + var3_ref.field_h.length) < ~param1.field_n) {
                        var7 = (var3_ref.field_h[param1.field_n] & 255) << 272916840;
                        var8 = 65280 & var3_ref.field_h[param1.field_n + 2] << -750033848;
                        var6 = var6 + (var3_ref.field_h[3 + param1.field_n] + -var6) * (-var7 + var5) / (var8 - var7);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var4 = var6 * var4 - -32 >> -2031878778;
                    break L5;
                  }
                }
              }
              stackOut_21_0 = var4;
              stackIn_22_0 = stackOut_21_0;
              break L0;
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("bs.I(").append(param0).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
        return stackIn_22_0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        uu var5 = null;
        uu var6 = null;
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var5 = ((bs) this).field_t[param3][param1];
            if (var5 != null) {
              L1: {
                L2: {
                  L3: {
                    ((bs) this).field_t[param3][param1] = null;
                    if ((((bs) this).field_J[param3] & 2) == 0) {
                      break L3;
                    } else {
                      var6 = (uu) (Object) ((bs) this).field_s.field_t.b(param2 + -12866);
                      L4: while (true) {
                        L5: {
                          if (null == var6) {
                            break L5;
                          } else {
                            stackOut_6_0 = var5.field_y;
                            stackOut_6_1 = var6.field_y;
                            stackIn_24_0 = stackOut_6_0;
                            stackIn_24_1 = stackOut_6_1;
                            stackIn_7_0 = stackOut_6_0;
                            stackIn_7_1 = stackOut_6_1;
                            if (var7 != 0) {
                              break L1;
                            } else {
                              L6: {
                                if (stackIn_7_0 != stackIn_7_1) {
                                  break L6;
                                } else {
                                  if (var6.field_x >= 0) {
                                    break L6;
                                  } else {
                                    if (var5 != var6) {
                                      var5.field_x = 0;
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
                              var6 = (uu) (Object) ((bs) this).field_s.field_t.d((byte) 18);
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
                  var5.field_x = 0;
                  break L2;
                }
                stackOut_23_0 = param2;
                stackOut_23_1 = 12800;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                break L1;
              }
              L7: {
                if (stackIn_24_0 == stackIn_24_1) {
                  break L7;
                } else {
                  ((bs) this).field_r = 50;
                  break L7;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qo.a((Throwable) (Object) runtimeException, "bs.U(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int a(boolean param0, uu param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        mq var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
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
              var3_int = (param1.field_p * param1.field_k >> -511409044) + param1.field_m;
              var3_int = var3_int + (((bs) this).field_D[param1.field_y] * (-8192 + ((bs) this).field_L[param1.field_y]) >> 179164492);
              if (param0) {
                break L1;
              } else {
                ((bs) this).field_O = 8L;
                break L1;
              }
            }
            L2: {
              var4 = param1.field_w;
              if (var4.field_j <= 0) {
                break L2;
              } else {
                L3: {
                  if (var4.field_b > 0) {
                    break L3;
                  } else {
                    if (((bs) this).field_K[param1.field_y] > 0) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  var5 = var4.field_b << -165543262;
                  var6 = var4.field_e << -1276582079;
                  if (~var6 < ~param1.field_H) {
                    var5 = var5 * param1.field_H / var6;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var5 = var5 + (((bs) this).field_K[param1.field_y] >> -2115991481);
                var7 = Math.sin((double)(511 & param1.field_C) * 0.01227184630308513);
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L2;
              }
            }
            L5: {
              var5 = (int)(0.5 + (double)(param1.field_B.field_n * 256) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)du.field_k);
              if (var5 >= 1) {
                stackOut_20_0 = var5;
                stackIn_21_0 = stackOut_20_0;
                break L5;
              } else {
                stackOut_18_0 = 1;
                stackIn_21_0 = stackOut_18_0;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("bs.QA(").append(param0).append(',');
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
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L6;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
        return stackIn_21_0;
    }

    private final void a(int param0, boolean param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (0 > param0) {
              param0 = 0;
              L1: while (true) {
                L2: {
                  if (param0 >= 16) {
                    break L2;
                  } else {
                    this.a(param0, true);
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
            } else {
              L3: {
                ((bs) this).field_w[param0] = 12800;
                ((bs) this).field_G[param0] = 8192;
                ((bs) this).field_T[param0] = 16383;
                ((bs) this).field_L[param0] = 8192;
                ((bs) this).field_K[param0] = 0;
                ((bs) this).field_z[param0] = 8192;
                this.b(param0, (byte) 126);
                this.a(param0, 32605);
                if (param1) {
                  break L3;
                } else {
                  int discarded$2 = this.a(45, (uu) null);
                  break L3;
                }
              }
              ((bs) this).field_J[param0] = 0;
              ((bs) this).field_S[param0] = 32767;
              ((bs) this).field_D[param0] = 256;
              ((bs) this).field_R[param0] = 0;
              this.d(8192, param0, 41);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var3, "bs.D(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(boolean param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (!param0) {
                  break L2;
                } else {
                  this.c(-1, -1);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.c(-1, (byte) -30);
              break L1;
            }
            this.a(-1, param1);
            var3_int = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (var3_int >= 16) {
                    break L5;
                  } else {
                    ((bs) this).field_B[var3_int] = ((bs) this).field_H[var3_int];
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
                      ((bs) this).field_F[var3_int] = eb.a(((bs) this).field_H[var3_int], -128);
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
          throw qo.a((Throwable) (Object) var3, "bs.AA(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized boolean a(og param0, tv param1, int param2, ki param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        tj var8 = null;
        int var9 = 0;
        td var10 = null;
        int var11 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              param1.b();
              var6_int = 1;
              var7 = null;
              if (~param4 >= param2) {
                break L1;
              } else {
                var7 = (Object) (Object) new int[]{param4};
                break L1;
              }
            }
            var8 = (tj) (Object) param1.field_l.a(52);
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (null == var8) {
                      break L5;
                    } else {
                      var9 = (int)var8.field_h;
                      var10 = (td) (Object) ((bs) this).field_p.a(param2 ^ -119, (long)var9);
                      if (var11 != 0) {
                        break L4;
                      } else {
                        L6: {
                          L7: {
                            if (null == var10) {
                              L8: {
                                var10 = u.a(param3, var9, 0);
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
                              ((bs) this).field_p.a((ms) (Object) var10, param2, (long)var9);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          if (!var10.a(var8.field_m, (int[]) var7, param0, 1255750754)) {
                            var6_int = 0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var8 = (tj) (Object) param1.field_l.a(true);
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
                param1.a();
                break L3;
              }
              stackOut_24_0 = var6_int;
              stackIn_25_0 = stackOut_24_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var6;
            stackOut_26_1 = new StringBuilder().append("bs.EA(");
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L9;
            }
          }
          L10: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L10;
            }
          }
          L11: {
            stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',').append(param2).append(',');
            stackIn_37_0 = stackOut_34_0;
            stackIn_37_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param3 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L11;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_38_0 = stackOut_35_0;
              stackIn_38_1 = stackOut_35_1;
              stackIn_38_2 = stackOut_35_2;
              break L11;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ',' + param4 + ')');
        }
        return stackIn_25_0 != 0;
    }

    final synchronized hj a() {
        RuntimeException var1 = null;
        rh stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        rh stackOut_0_0 = null;
        try {
          L0: {
            stackOut_0_0 = ((bs) this).field_s;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var1, "bs.A()");
        }
        return (hj) (Object) stackIn_1_0;
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
          throw qo.a((Throwable) (Object) var1, "bs.C()");
        }
        return stackIn_1_0;
    }

    private final int a(int param0, uu param1) {
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
              if (param0 == 16384) {
                break L1;
              } else {
                ((bs) this).field_K = null;
                break L1;
              }
            }
            var3_int = ((bs) this).field_G[param1.field_y];
            if (8192 <= var3_int) {
              stackOut_6_0 = 16384 + -((128 + -param1.field_D) * (16384 + -var3_int) + 32 >> -17436666);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = var3_int * param1.field_D + 32 >> 2065529958;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("bs.HA(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_7_0;
    }

    final synchronized void a(boolean param0, tv param1, int param2) {
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
              if (param2 > 48) {
                break L1;
              } else {
                this.d(0, -127, 115);
                break L1;
              }
            }
            this.a(param0, true, true, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("bs.B(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ')');
        }
    }

    final boolean a(int[] param0, int param1, int param2, uu param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        mq var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_17_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_116_0 = 0;
        int stackIn_118_0 = 0;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        RuntimeException stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        String stackIn_123_2 = null;
        RuntimeException stackIn_124_0 = null;
        StringBuilder stackIn_124_1 = null;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        String stackIn_127_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        int stackOut_89_0 = 0;
        int stackOut_89_1 = 0;
        int stackOut_117_0 = 0;
        int stackOut_115_0 = 0;
        RuntimeException stackOut_119_0 = null;
        StringBuilder stackOut_119_1 = null;
        RuntimeException stackOut_122_0 = null;
        StringBuilder stackOut_122_1 = null;
        String stackOut_122_2 = null;
        RuntimeException stackOut_120_0 = null;
        StringBuilder stackOut_120_1 = null;
        String stackOut_120_2 = null;
        RuntimeException stackOut_123_0 = null;
        StringBuilder stackOut_123_1 = null;
        RuntimeException stackOut_126_0 = null;
        StringBuilder stackOut_126_1 = null;
        String stackOut_126_2 = null;
        RuntimeException stackOut_124_0 = null;
        StringBuilder stackOut_124_1 = null;
        String stackOut_124_2 = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              param3.field_u = du.field_k / 100;
              if (param3.field_x < 0) {
                break L1;
              } else {
                L2: {
                  if (param3.field_z == null) {
                    break L2;
                  } else {
                    if (!param3.field_z.h()) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  param3.a(0);
                  param3.b(false);
                  if (param3.field_q <= 0) {
                    break L3;
                  } else {
                    if (((bs) this).field_P[param3.field_y][param3.field_q] != param3) {
                      break L3;
                    } else {
                      ((bs) this).field_P[param3.field_y][param3.field_q] = null;
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
              var6_int = param3.field_k;
              if (var6_int > 0) {
                L5: {
                  var6_int = var6_int - (int)(16.0 * Math.pow(2.0, (double)((bs) this).field_z[param3.field_y] * 0.0004921259842519685) + 0.5);
                  if (var6_int >= 0) {
                    break L5;
                  } else {
                    var6_int = 0;
                    break L5;
                  }
                }
                param3.field_k = var6_int;
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              param3.field_z.e(this.a(true, param3));
              var7 = param3.field_w;
              param3.field_C = param3.field_C + var7.field_j;
              var8 = 0;
              param3.field_H = param3.field_H + 1;
              var9 = (double)((param3.field_k * param3.field_p >> 1320346796) + (-60 + param3.field_E << 678374184)) * 0.000005086263020833333;
              if (var7.field_i > 0) {
                L7: {
                  L8: {
                    if (var7.field_d > 0) {
                      break L8;
                    } else {
                      param3.field_v = param3.field_v + 128;
                      if (var11 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  param3.field_v = param3.field_v + (int)(128.0 * Math.pow(2.0, (double)var7.field_d * var9) + 0.5);
                  break L7;
                }
                if (819200 > var7.field_i * param3.field_v) {
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
              if (var7.field_g == null) {
                break L9;
              } else {
                L10: {
                  L11: {
                    if (0 >= var7.field_f) {
                      break L11;
                    } else {
                      param3.field_G = param3.field_G + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_f) * 128.0);
                      if (var11 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  param3.field_G = param3.field_G + 128;
                  break L10;
                }
                L12: while (true) {
                  L13: {
                    L14: {
                      if (~(var7.field_g.length + -2) >= ~param3.field_r) {
                        break L14;
                      } else {
                        stackOut_45_0 = param3.field_G;
                        stackOut_45_1 = (255 & var7.field_g[param3.field_r - -2]) << -845544664;
                        stackIn_53_0 = stackOut_45_0;
                        stackIn_53_1 = stackOut_45_1;
                        stackIn_46_0 = stackOut_45_0;
                        stackIn_46_1 = stackOut_45_1;
                        if (var11 != 0) {
                          break L13;
                        } else {
                          if (stackIn_46_0 <= stackIn_46_1) {
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
                    stackOut_52_0 = ~(var7.field_g.length - 2);
                    stackOut_52_1 = ~param3.field_r;
                    stackIn_53_0 = stackOut_52_0;
                    stackIn_53_1 = stackOut_52_1;
                    break L13;
                  }
                  if (stackIn_53_0 != stackIn_53_1) {
                    break L9;
                  } else {
                    if (0 == var7.field_g[param3.field_r + 1]) {
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
              if (param4 > param3.field_x) {
                break L15;
              } else {
                if (var7.field_h == null) {
                  break L15;
                } else {
                  if ((1 & ((bs) this).field_J[param3.field_y]) == 0) {
                    L16: {
                      if (param3.field_q < 0) {
                        break L16;
                      } else {
                        if (((bs) this).field_P[param3.field_y][param3.field_q] != param3) {
                          break L16;
                        } else {
                          break L15;
                        }
                      }
                    }
                    L17: {
                      L18: {
                        if (var7.field_c <= 0) {
                          break L18;
                        } else {
                          param3.field_x = param3.field_x + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_c));
                          if (var11 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      param3.field_x = param3.field_x + 128;
                      break L17;
                    }
                    L19: while (true) {
                      L20: {
                        L21: {
                          if (param3.field_n >= var7.field_h.length + -2) {
                            break L21;
                          } else {
                            stackOut_82_0 = param3.field_x;
                            stackOut_82_1 = (var7.field_h[2 + param3.field_n] & 255) << 1815279624;
                            stackIn_90_0 = stackOut_82_0;
                            stackIn_90_1 = stackOut_82_1;
                            stackIn_83_0 = stackOut_82_0;
                            stackIn_83_1 = stackOut_82_1;
                            if (var11 != 0) {
                              break L20;
                            } else {
                              if (stackIn_83_0 <= stackIn_83_1) {
                                break L21;
                              } else {
                                param3.field_n = param3.field_n + 2;
                                if (var11 == 0) {
                                  continue L19;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                        }
                        stackOut_89_0 = param3.field_n;
                        stackOut_89_1 = var7.field_h.length + -2;
                        stackIn_90_0 = stackOut_89_0;
                        stackIn_90_1 = stackOut_89_1;
                        break L20;
                      }
                      if (stackIn_90_0 == stackIn_90_1) {
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
              param3.field_z.a(param3.field_u, this.c(255, param3), this.a(param4 ^ 16384, param3));
              stackOut_117_0 = 0;
              stackIn_118_0 = stackOut_117_0;
              break L0;
            } else {
              L22: {
                L23: {
                  param3.field_z.d(param3.field_u);
                  if (null == param0) {
                    break L23;
                  } else {
                    param3.field_z.b(param0, param1, param2);
                    if (var11 == 0) {
                      break L22;
                    } else {
                      break L23;
                    }
                  }
                }
                param3.field_z.a(param2);
                break L22;
              }
              L24: {
                if (!param3.field_z.k()) {
                  break L24;
                } else {
                  ((bs) this).field_s.field_o.b((hj) (Object) param3.field_z);
                  break L24;
                }
              }
              L25: {
                param3.a(0);
                if (param3.field_x >= 0) {
                  param3.b(false);
                  if (param3.field_q <= 0) {
                    break L25;
                  } else {
                    if (((bs) this).field_P[param3.field_y][param3.field_q] == param3) {
                      ((bs) this).field_P[param3.field_y][param3.field_q] = null;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                } else {
                  break L25;
                }
              }
              stackOut_115_0 = 1;
              stackIn_116_0 = stackOut_115_0;
              return stackIn_116_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var6 = decompiledCaughtException;
            stackOut_119_0 = (RuntimeException) var6;
            stackOut_119_1 = new StringBuilder().append("bs.IA(");
            stackIn_122_0 = stackOut_119_0;
            stackIn_122_1 = stackOut_119_1;
            stackIn_120_0 = stackOut_119_0;
            stackIn_120_1 = stackOut_119_1;
            if (param0 == null) {
              stackOut_122_0 = (RuntimeException) (Object) stackIn_122_0;
              stackOut_122_1 = (StringBuilder) (Object) stackIn_122_1;
              stackOut_122_2 = "null";
              stackIn_123_0 = stackOut_122_0;
              stackIn_123_1 = stackOut_122_1;
              stackIn_123_2 = stackOut_122_2;
              break L26;
            } else {
              stackOut_120_0 = (RuntimeException) (Object) stackIn_120_0;
              stackOut_120_1 = (StringBuilder) (Object) stackIn_120_1;
              stackOut_120_2 = "{...}";
              stackIn_123_0 = stackOut_120_0;
              stackIn_123_1 = stackOut_120_1;
              stackIn_123_2 = stackOut_120_2;
              break L26;
            }
          }
          L27: {
            stackOut_123_0 = (RuntimeException) (Object) stackIn_123_0;
            stackOut_123_1 = ((StringBuilder) (Object) stackIn_123_1).append(stackIn_123_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_126_0 = stackOut_123_0;
            stackIn_126_1 = stackOut_123_1;
            stackIn_124_0 = stackOut_123_0;
            stackIn_124_1 = stackOut_123_1;
            if (param3 == null) {
              stackOut_126_0 = (RuntimeException) (Object) stackIn_126_0;
              stackOut_126_1 = (StringBuilder) (Object) stackIn_126_1;
              stackOut_126_2 = "null";
              stackIn_127_0 = stackOut_126_0;
              stackIn_127_1 = stackOut_126_1;
              stackIn_127_2 = stackOut_126_2;
              break L27;
            } else {
              stackOut_124_0 = (RuntimeException) (Object) stackIn_124_0;
              stackOut_124_1 = (StringBuilder) (Object) stackIn_124_1;
              stackOut_124_2 = "{...}";
              stackIn_127_0 = stackOut_124_0;
              stackIn_127_1 = stackOut_124_1;
              stackIn_127_2 = stackOut_124_2;
              break L27;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_127_0, stackIn_127_2 + ',' + param4 + ')');
        }
        return stackIn_118_0 != 0;
    }

    private final void b(int param0, byte param1) {
        RuntimeException runtimeException = null;
        uu var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        byte stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if ((2 & ((bs) this).field_J[param0]) == 0) {
                  break L2;
                } else {
                  var3 = (uu) (Object) ((bs) this).field_s.field_t.b(-78);
                  L3: while (true) {
                    if (null == var3) {
                      break L2;
                    } else {
                      stackOut_4_0 = var3.field_y;
                      stackOut_4_1 = param0;
                      stackIn_19_0 = stackOut_4_0;
                      stackIn_19_1 = stackOut_4_1;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      if (var4 != 0) {
                        break L1;
                      } else {
                        L4: {
                          if (stackIn_5_0 != stackIn_5_1) {
                            break L4;
                          } else {
                            if (((bs) this).field_t[param0][var3.field_E] == null) {
                              if (0 > var3.field_x) {
                                var3.field_x = 0;
                                break L4;
                              } else {
                                break L4;
                              }
                            } else {
                              break L4;
                            }
                          }
                        }
                        var3 = (uu) (Object) ((bs) this).field_s.field_t.d((byte) 18);
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
              stackOut_18_0 = param1;
              stackOut_18_1 = 120;
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              break L1;
            }
            L5: {
              if (stackIn_19_0 > stackIn_19_1) {
                break L5;
              } else {
                ((bs) this).field_J = null;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qo.a((Throwable) (Object) runtimeException, "bs.O(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, uu param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
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
        try {
          L0: {
            L1: {
              L2: {
                var4_int = param1.field_B.field_p.length;
                if (!param2) {
                  break L2;
                } else {
                  if (!param1.field_B.field_m) {
                    break L2;
                  } else {
                    L3: {
                      var6 = -param1.field_B.field_l + (var4_int + var4_int);
                      var5 = (int)((long)var6 * (long)((bs) this).field_R[param1.field_y] >> 2007001734);
                      var4_int = var4_int << 8;
                      if (var4_int <= var5) {
                        param1.field_z.c(true);
                        var5 = -var5 + (var4_int + var4_int) - 1;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    if (!Sumoblitz.field_L) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var5 = (int)((long)var4_int * (long)((bs) this).field_R[param1.field_y] >> 1910152134);
              break L1;
            }
            var6 = -121 / ((22 - param0) / 59);
            param1.field_z.g(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("bs.GA(").append(param0).append(',');
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
          throw qo.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ')');
        }
    }

    final synchronized void b(int param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                ((bs) this).field_y = null;
                break L1;
              }
            }
            ((bs) this).field_r = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var3, "bs.K(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(int param0, int param1, int param2) {
        try {
            ((bs) this).field_L[param0] = param2;
            if (param1 > -98) {
                ((bs) this).field_D = null;
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "bs.R(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void d(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = ((bs) this).field_Q;
              if (param0 == 18922) {
                break L1;
              } else {
                ((bs) this).field_v = null;
                break L1;
              }
            }
            L2: {
              var3 = ((bs) this).field_C;
              var4 = ((bs) this).field_q;
              if (null == ((bs) this).field_I) {
                break L2;
              } else {
                if (~var3 == ~((bs) this).field_u) {
                  this.a(((bs) this).field_M, true, ((bs) this).field_A, ((bs) this).field_I);
                  this.d(18922);
                  return;
                } else {
                  break L2;
                }
              }
            }
            L3: while (true) {
              stackOut_12_0 = ~var3;
              stackOut_12_1 = ~((bs) this).field_C;
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              L4: while (true) {
                L5: {
                  L6: {
                    L7: {
                      if (stackIn_13_0 != stackIn_13_1) {
                        break L7;
                      } else {
                        L8: while (true) {
                          stackOut_14_0 = ~var3;
                          stackOut_14_1 = ~((bs) this).field_v.field_c[var2_int];
                          stackIn_48_0 = stackOut_14_0;
                          stackIn_48_1 = stackOut_14_1;
                          stackIn_15_0 = stackOut_14_0;
                          stackIn_15_1 = stackOut_14_1;
                          if (var7 != 0) {
                            break L6;
                          } else {
                            L9: {
                              if (stackIn_15_0 != stackIn_15_1) {
                                break L9;
                              } else {
                                ((bs) this).field_v.b(var2_int);
                                var6 = ((bs) this).field_v.e(var2_int);
                                stackOut_16_0 = ~var6;
                                stackOut_16_1 = -2;
                                stackIn_13_0 = stackOut_16_0;
                                stackIn_13_1 = stackOut_16_1;
                                stackIn_17_0 = stackOut_16_0;
                                stackIn_17_1 = stackOut_16_1;
                                if (var7 != 0) {
                                  continue L4;
                                } else {
                                  if (stackIn_17_0 != stackIn_17_1) {
                                    L10: {
                                      if (0 == (var6 & 128)) {
                                        break L10;
                                      } else {
                                        this.a(var6, (byte) -82);
                                        break L10;
                                      }
                                    }
                                    ((bs) this).field_v.a(var2_int);
                                    ((bs) this).field_v.c(var2_int);
                                    if (var7 == 0) {
                                      continue L8;
                                    } else {
                                      break L9;
                                    }
                                  } else {
                                    L11: {
                                      ((bs) this).field_v.a();
                                      ((bs) this).field_v.c(var2_int);
                                      if (((bs) this).field_v.d()) {
                                        break L11;
                                      } else {
                                        if (var7 == 0) {
                                          break L9;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    if (((bs) this).field_I != null) {
                                      ((bs) this).a(((bs) this).field_M, ((bs) this).field_I, 107);
                                      this.d(18922);
                                      return;
                                    } else {
                                      L12: {
                                        if (!((bs) this).field_M) {
                                          break L12;
                                        } else {
                                          if (var3 != 0) {
                                            ((bs) this).field_v.b(var4);
                                            if (var7 == 0) {
                                              break L9;
                                            } else {
                                              break L12;
                                            }
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      this.a(true, true);
                                      ((bs) this).field_v.e();
                                      return;
                                    }
                                  }
                                }
                              }
                            }
                            var2_int = ((bs) this).field_v.b();
                            var3 = ((bs) this).field_v.field_c[var2_int];
                            var4 = ((bs) this).field_v.d(var3);
                            if (var7 == 0) {
                              continue L3;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                    ((bs) this).field_q = var4;
                    ((bs) this).field_C = var3;
                    ((bs) this).field_Q = var2_int;
                    if (((bs) this).field_I == null) {
                      break L5;
                    } else {
                      stackOut_46_0 = ~((bs) this).field_u;
                      stackOut_46_1 = ~var3;
                      stackIn_48_0 = stackOut_46_0;
                      stackIn_48_1 = stackOut_46_1;
                      break L6;
                    }
                  }
                  if (stackIn_48_0 <= stackIn_48_1) {
                    break L5;
                  } else {
                    ((bs) this).field_C = ((bs) this).field_u;
                    ((bs) this).field_Q = -1;
                    ((bs) this).field_q = ((bs) this).field_v.d(((bs) this).field_C);
                    break L5;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "bs.NA(" + param0 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        RuntimeException var5 = null;
        td var5_ref = null;
        uu var5_ref2 = null;
        qp var6 = null;
        int var6_int = 0;
        uu var7 = null;
        int var8 = 0;
        uu var9 = null;
        int var10 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        uu stackIn_22_2 = null;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        uu stackIn_24_2 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        uu stackIn_26_2 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        uu stackIn_27_2 = null;
        int stackIn_27_3 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        uu stackOut_21_2 = null;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        uu stackOut_26_2 = null;
        int stackOut_26_3 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        uu stackOut_22_2 = null;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        uu stackOut_24_2 = null;
        int stackOut_24_3 = 0;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              this.a(64, param3, 12800, param2);
              if ((((bs) this).field_J[param2] & 2) == 0) {
                break L1;
              } else {
                var5_ref2 = (uu) (Object) ((bs) this).field_s.field_t.a(9);
                L2: while (true) {
                  if (null == var5_ref2) {
                    break L1;
                  } else {
                    L3: {
                      if (~param2 != ~var5_ref2.field_y) {
                        break L3;
                      } else {
                        if (0 <= var5_ref2.field_x) {
                          break L3;
                        } else {
                          ((bs) this).field_t[param2][var5_ref2.field_E] = null;
                          ((bs) this).field_t[param2][param3] = var5_ref2;
                          var6_int = var5_ref2.field_m + (var5_ref2.field_p * var5_ref2.field_k >> 1057239788);
                          var5_ref2.field_m = var5_ref2.field_m + (-var5_ref2.field_E + param3 << -1227502136);
                          var5_ref2.field_p = -var5_ref2.field_m + var6_int;
                          var5_ref2.field_E = param3;
                          var5_ref2.field_k = 4096;
                          return;
                        }
                      }
                    }
                    var5_ref2 = (uu) (Object) ((bs) this).field_s.field_t.d(9);
                    if (var10 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var5_ref = (td) (Object) ((bs) this).field_p.a(115, (long)((bs) this).field_B[param2]);
            if (var5_ref == null) {
              return;
            } else {
              var6 = var5_ref.field_o[param3];
              if (var6 != null) {
                L4: {
                  L5: {
                    var7 = new uu();
                    var7.field_A = var5_ref;
                    var7.field_y = param2;
                    var7.field_B = var6;
                    var7.field_w = var5_ref.field_n[param3];
                    var7.field_q = var5_ref.field_r[param3];
                    var8 = -115 % ((-80 - param1) / 43);
                    var7.field_E = param3;
                    var7.field_F = 1024 + var5_ref.field_s * (param0 * (param0 * var5_ref.field_q[param3])) >> -1616706517;
                    var7.field_D = var5_ref.field_t[param3] & 255;
                    var7.field_m = -(32767 & var5_ref.field_k[param3]) + (param3 << 1140439080);
                    var7.field_G = 0;
                    var7.field_r = 0;
                    var7.field_x = -1;
                    var7.field_v = 0;
                    var7.field_n = 0;
                    if (0 != ((bs) this).field_R[param2]) {
                      break L5;
                    } else {
                      var7.field_z = mf.a(var6, this.a(true, var7), this.c(255, var7), this.a(16384, var7));
                      if (var10 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    var7.field_z = mf.a(var6, this.a(true, var7), 0, this.a(16384, var7));
                    stackOut_21_0 = this;
                    stackOut_21_1 = 110;
                    stackOut_21_2 = (uu) var7;
                    stackIn_26_0 = stackOut_21_0;
                    stackIn_26_1 = stackOut_21_1;
                    stackIn_26_2 = stackOut_21_2;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    stackIn_22_2 = stackOut_21_2;
                    if (var5_ref.field_k[param3] >= 0) {
                      stackOut_26_0 = this;
                      stackOut_26_1 = stackIn_26_1;
                      stackOut_26_2 = (uu) (Object) stackIn_26_2;
                      stackOut_26_3 = 0;
                      stackIn_27_0 = stackOut_26_0;
                      stackIn_27_1 = stackOut_26_1;
                      stackIn_27_2 = stackOut_26_2;
                      stackIn_27_3 = stackOut_26_3;
                      break L6;
                    } else {
                      stackOut_22_0 = this;
                      stackOut_22_1 = stackIn_22_1;
                      stackOut_22_2 = (uu) (Object) stackIn_22_2;
                      stackIn_24_0 = stackOut_22_0;
                      stackIn_24_1 = stackOut_22_1;
                      stackIn_24_2 = stackOut_22_2;
                      stackOut_24_0 = this;
                      stackOut_24_1 = stackIn_24_1;
                      stackOut_24_2 = (uu) (Object) stackIn_24_2;
                      stackOut_24_3 = 1;
                      stackIn_27_0 = stackOut_24_0;
                      stackIn_27_1 = stackOut_24_1;
                      stackIn_27_2 = stackOut_24_2;
                      stackIn_27_3 = stackOut_24_3;
                      break L6;
                    }
                  }
                  ((bs) this).a((byte) stackIn_27_1, stackIn_27_2, stackIn_27_3 != 0);
                  break L4;
                }
                L7: {
                  if (var5_ref.field_k[param3] >= 0) {
                    break L7;
                  } else {
                    var7.field_z.c(-1);
                    break L7;
                  }
                }
                L8: {
                  if (var7.field_q >= 0) {
                    L9: {
                      var9 = ((bs) this).field_P[param2][var7.field_q];
                      if (var9 == null) {
                        break L9;
                      } else {
                        if (var9.field_x >= 0) {
                          break L9;
                        } else {
                          ((bs) this).field_t[param2][var9.field_E] = null;
                          var9.field_x = 0;
                          break L9;
                        }
                      }
                    }
                    ((bs) this).field_P[param2][var7.field_q] = var7;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                ((bs) this).field_s.field_t.a((ms) (Object) var7, (byte) 39);
                ((bs) this).field_t[param2][param3] = var7;
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var5, "bs.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean b(int param0, uu param1) {
        RuntimeException var3 = null;
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
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
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
            L1: {
              if (param0 >= 30) {
                break L1;
              } else {
                ((bs) this).field_s = null;
                break L1;
              }
            }
            if (param1.field_z == null) {
              L2: {
                if (param1.field_x >= 0) {
                  param1.b(false);
                  if (0 >= param1.field_q) {
                    break L2;
                  } else {
                    if (param1 == ((bs) this).field_P[param1.field_y][param1.field_q]) {
                      ((bs) this).field_P[param1.field_y][param1.field_q] = null;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              }
              stackOut_16_0 = 1;
              stackIn_17_0 = stackOut_16_0;
              return stackIn_17_0 != 0;
            } else {
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("bs.V(").append(param0).append(',');
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
          throw qo.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
        return stackIn_19_0 != 0;
    }

    private final void a(int param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = param0 & 240;
            if (var3_int != 128) {
              if (var3_int != 144) {
                if (param1 < -52) {
                  if (var3_int != 160) {
                    if (176 != var3_int) {
                      if (var3_int == 192) {
                        var4 = param0 & 15;
                        var5 = (param0 & 32711) >> 505053448;
                        this.e(var4, ((bs) this).field_F[var4] + var5, 5174);
                        return;
                      } else {
                        if (208 == var3_int) {
                          var4 = 15 & param0;
                          var5 = (32605 & param0) >> 123435016;
                          this.a(var4, (byte) -101, var5);
                          return;
                        } else {
                          if (224 == var3_int) {
                            var4 = 15 & param0;
                            var5 = ((param0 & 8323255) >> -1023687511) + (param0 >> 1094630728 & 127);
                            this.b(var4, -105, var5);
                            return;
                          } else {
                            var3_int = 255 & param0;
                            if (var3_int == 255) {
                              this.a(true, true);
                              decompiledRegionSelector0 = 0;
                              break L0;
                            } else {
                              decompiledRegionSelector0 = 1;
                              break L0;
                            }
                          }
                        }
                      }
                    } else {
                      L1: {
                        var4 = 15 & param0;
                        var5 = (32654 & param0) >> 2057640584;
                        var6 = (8345855 & param0) >> -1027799472;
                        if (0 == var5) {
                          ((bs) this).field_F[var4] = (var6 << 1880100622) + eb.a(-2080769, ((bs) this).field_F[var4]);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      L2: {
                        if (var5 != 32) {
                          break L2;
                        } else {
                          ((bs) this).field_F[var4] = (var6 << 1839342279) + eb.a(((bs) this).field_F[var4], -16257);
                          break L2;
                        }
                      }
                      L3: {
                        if (var5 == 1) {
                          ((bs) this).field_K[var4] = (var6 << 1719036519) + eb.a(-16257, ((bs) this).field_K[var4]);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        if (33 == var5) {
                          ((bs) this).field_K[var4] = eb.a(-128, ((bs) this).field_K[var4]) + var6;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        if (var5 != 5) {
                          break L5;
                        } else {
                          ((bs) this).field_z[var4] = (var6 << 644505607) + eb.a(-16257, ((bs) this).field_z[var4]);
                          break L5;
                        }
                      }
                      L6: {
                        if (37 != var5) {
                          break L6;
                        } else {
                          ((bs) this).field_z[var4] = var6 + eb.a(-128, ((bs) this).field_z[var4]);
                          break L6;
                        }
                      }
                      L7: {
                        if (var5 == 7) {
                          ((bs) this).field_w[var4] = eb.a(-16257, ((bs) this).field_w[var4]) + (var6 << 1871576871);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      L8: {
                        if (39 == var5) {
                          ((bs) this).field_w[var4] = var6 + eb.a(((bs) this).field_w[var4], -128);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        if (10 != var5) {
                          break L9;
                        } else {
                          ((bs) this).field_G[var4] = eb.a(-16257, ((bs) this).field_G[var4]) + (var6 << 1714289031);
                          break L9;
                        }
                      }
                      L10: {
                        if (42 == var5) {
                          ((bs) this).field_G[var4] = var6 + eb.a(-128, ((bs) this).field_G[var4]);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if (var5 != 11) {
                          break L11;
                        } else {
                          ((bs) this).field_T[var4] = eb.a(-16257, ((bs) this).field_T[var4]) + (var6 << 313173895);
                          break L11;
                        }
                      }
                      L12: {
                        if (var5 == 43) {
                          ((bs) this).field_T[var4] = var6 + eb.a(-128, ((bs) this).field_T[var4]);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        if (var5 == 64) {
                          L14: {
                            if (var6 < 64) {
                              break L14;
                            } else {
                              ((bs) this).field_J[var4] = ic.a(((bs) this).field_J[var4], 1);
                              if (var8 == 0) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                          ((bs) this).field_J[var4] = eb.a(((bs) this).field_J[var4], -2);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L15: {
                        if (var5 != 65) {
                          break L15;
                        } else {
                          L16: {
                            if (var6 >= 64) {
                              break L16;
                            } else {
                              this.b(var4, (byte) 122);
                              ((bs) this).field_J[var4] = eb.a(((bs) this).field_J[var4], -3);
                              if (var8 == 0) {
                                break L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                          ((bs) this).field_J[var4] = ic.a(((bs) this).field_J[var4], 2);
                          break L15;
                        }
                      }
                      L17: {
                        if (var5 != 99) {
                          break L17;
                        } else {
                          ((bs) this).field_S[var4] = (var6 << 1207116103) + eb.a(127, ((bs) this).field_S[var4]);
                          break L17;
                        }
                      }
                      L18: {
                        if (var5 == 98) {
                          ((bs) this).field_S[var4] = eb.a(16256, ((bs) this).field_S[var4]) + var6;
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      L19: {
                        if (var5 == 101) {
                          ((bs) this).field_S[var4] = 16384 + (eb.a(127, ((bs) this).field_S[var4]) - -(var6 << 1573849703));
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                      L20: {
                        if (var5 == 100) {
                          ((bs) this).field_S[var4] = 16384 - (-eb.a(((bs) this).field_S[var4], 16256) + -var6);
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      L21: {
                        if (var5 == 120) {
                          this.c(-1, var4);
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      L22: {
                        if (var5 != 121) {
                          break L22;
                        } else {
                          this.a(var4, true);
                          break L22;
                        }
                      }
                      L23: {
                        if (var5 != 123) {
                          break L23;
                        } else {
                          this.c(var4, (byte) -109);
                          break L23;
                        }
                      }
                      L24: {
                        if (var5 == 6) {
                          var7 = ((bs) this).field_S[var4];
                          if (16384 == var7) {
                            ((bs) this).field_D[var4] = eb.a(-16257, ((bs) this).field_D[var4]) + (var6 << -312279321);
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
                          var7 = ((bs) this).field_S[var4];
                          if (var7 != 16384) {
                            break L25;
                          } else {
                            ((bs) this).field_D[var4] = var6 + eb.a(((bs) this).field_D[var4], -128);
                            break L25;
                          }
                        } else {
                          break L25;
                        }
                      }
                      L26: {
                        if (16 != var5) {
                          break L26;
                        } else {
                          ((bs) this).field_R[var4] = eb.a(((bs) this).field_R[var4], -16257) - -(var6 << 1027833191);
                          break L26;
                        }
                      }
                      L27: {
                        if (var5 != 48) {
                          break L27;
                        } else {
                          ((bs) this).field_R[var4] = var6 + eb.a(((bs) this).field_R[var4], -128);
                          break L27;
                        }
                      }
                      L28: {
                        if (81 != var5) {
                          break L28;
                        } else {
                          L29: {
                            if (var6 >= 64) {
                              break L29;
                            } else {
                              this.a(var4, 32605);
                              ((bs) this).field_J[var4] = eb.a(((bs) this).field_J[var4], -5);
                              if (var8 == 0) {
                                break L28;
                              } else {
                                break L29;
                              }
                            }
                          }
                          ((bs) this).field_J[var4] = ic.a(((bs) this).field_J[var4], 4);
                          break L28;
                        }
                      }
                      L30: {
                        if (var5 != 17) {
                          break L30;
                        } else {
                          this.d((var6 << 1547298695) + (-16257 & ((bs) this).field_N[var4]), var4, 97);
                          break L30;
                        }
                      }
                      L31: {
                        if (var5 == 49) {
                          this.d(var6 + (-128 & ((bs) this).field_N[var4]), var4, 42);
                          break L31;
                        } else {
                          break L31;
                        }
                      }
                      return;
                    }
                  } else {
                    var4 = param0 & 15;
                    var5 = 127 & param0 >> 420624520;
                    var6 = param0 >> -1981835152 & 127;
                    this.b(97, var5, var6, var4);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                L32: {
                  L33: {
                    var4 = 15 & param0;
                    var5 = (32657 & param0) >> -1924715480;
                    var6 = 127 & param0 >> 1556304016;
                    if (var6 <= 0) {
                      break L33;
                    } else {
                      this.a(var6, (byte) -13, var4, var5);
                      if (var8 == 0) {
                        break L32;
                      } else {
                        break L33;
                      }
                    }
                  }
                  this.a(64, var5, 12800, var4);
                  break L32;
                }
                return;
              }
            } else {
              var4 = 15 & param0;
              var5 = param0 >> 1651568840 & 127;
              var6 = param0 >> 610672944 & 127;
              this.a(var6, var5, 12800, var4);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var3, "bs.N(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void e(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (~((bs) this).field_B[param0] == ~param1) {
                  break L2;
                } else {
                  ((bs) this).field_B[param0] = param1;
                  var4_int = 0;
                  L3: while (true) {
                    if (var4_int >= 128) {
                      break L2;
                    } else {
                      ((bs) this).field_P[param0][var4_int] = null;
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
                }
              }
              if (param2 == 5174) {
                break L1;
              } else {
                ((bs) this).field_y = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qo.a((Throwable) (Object) runtimeException, "bs.KA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2) {
        try {
            if (param1 >= -26) {
                ((bs) this).field_r = -65;
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "bs.BA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void c(int param0, int param1, int param2) {
        ((bs) this).field_H[param1] = param2;
        ((bs) this).field_F[param1] = eb.a(-128, param2);
        if (param0 != -1823) {
            return;
        }
        try {
            this.e(param1, param2, param0 ^ -4905);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "bs.S(" + param0 + ',' + param1 + ',' + param2 + ')');
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
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((bs) this).field_v.c()) {
                break L1;
              } else {
                var4_int = ((bs) this).field_E * ((bs) this).field_v.field_d / du.field_k;
                L2: while (true) {
                  L3: {
                    var5 = (long)var4_int * (long)param2 + ((bs) this).field_O;
                    if (0L <= -var5 + ((bs) this).field_q) {
                      ((bs) this).field_O = var5;
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
                    var7 = (int)((((bs) this).field_q + (-((bs) this).field_O + (long)var4_int - 1L)) / (long)var4_int);
                    ((bs) this).field_O = ((bs) this).field_O + (long)var7 * (long)var4_int;
                    ((bs) this).field_s.b(param0, param1, var7);
                    param2 = param2 - var7;
                    this.d(18922);
                    param1 = param1 + var7;
                    if (((bs) this).field_v.c()) {
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
            ((bs) this).field_s.b(param0, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("bs.J(");
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
          throw qo.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1) {
        uu var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 32605) {
                break L1;
              } else {
                ((bs) this).field_z = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if ((((bs) this).field_J[param0] & 4) == 0) {
                  break L3;
                } else {
                  var3 = (uu) (Object) ((bs) this).field_s.field_t.b(param1 + -32539);
                  L4: while (true) {
                    if (var3 == null) {
                      break L3;
                    } else {
                      if (var4 != 0) {
                        break L2;
                      } else {
                        L5: {
                          if (~param0 != ~var3.field_y) {
                            break L5;
                          } else {
                            var3.field_t = 0;
                            break L5;
                          }
                        }
                        var3 = (uu) (Object) ((bs) this).field_s.field_t.d((byte) 18);
                        if (var4 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
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
          var3_ref = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var3_ref, "bs.T(" + param0 + ',' + param1 + ')');
        }
    }

    private final void c(int param0, int param1) {
        uu var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                ((bs) this).field_v = null;
                break L1;
              }
            }
            var3 = (uu) (Object) ((bs) this).field_s.field_t.b(param0 ^ -95);
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
                          if (param1 < 0) {
                            break L6;
                          } else {
                            if (~var3.field_y != ~param1) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          if (null == var3.field_z) {
                            break L7;
                          } else {
                            L8: {
                              var3.field_z.d(du.field_k / 100);
                              if (var3.field_z.k()) {
                                ((bs) this).field_s.field_o.b((hj) (Object) var3.field_z);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            var3.a(~param0);
                            break L7;
                          }
                        }
                        L9: {
                          if (var3.field_x >= 0) {
                            break L9;
                          } else {
                            ((bs) this).field_t[var3.field_y][var3.field_E] = null;
                            break L9;
                          }
                        }
                        var3.b(false);
                        break L5;
                      }
                      var3 = (uu) (Object) ((bs) this).field_s.field_t.d((byte) 18);
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
          throw qo.a((Throwable) (Object) var3_ref, "bs.FA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        try {
            if (param0 <= 7) {
                ((bs) this).field_F = null;
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "bs.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void a(boolean param0, int param1, int param2, int param3, tv param4, boolean param5) {
        RuntimeException runtimeException = null;
        int var7_int = 0;
        int var8 = 0;
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
            if (!((bs) this).field_v.c()) {
              ((bs) this).a(param5, param4, 77);
              return;
            } else {
              L1: {
                ((bs) this).field_M = param5;
                ((bs) this).field_A = param0;
                ((bs) this).field_I = param4;
                var7_int = ((bs) this).field_v.a(((bs) this).field_O) * param3;
                if (param2 == 7094) {
                  break L1;
                } else {
                  this.c(-41, (byte) 86);
                  break L1;
                }
              }
              var8 = param1 * ((bs) this).field_v.field_d;
              var7_int = var8 * ((-1 + var8 + var7_int) / var8);
              ((bs) this).field_u = ((param3 >> -1451976831) + var7_int) / param3;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("bs.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param5 + ')');
        }
    }

    final synchronized void e(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                this.b(-55, (byte) 105);
                break L1;
              }
            }
            this.a(true, (byte) 104);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "bs.M(" + param0 + ')');
        }
    }

    final synchronized void a(byte param0) {
        RuntimeException runtimeException = null;
        td var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2 = (td) (Object) ((bs) this).field_p.a(79);
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var2) {
                    break L3;
                  } else {
                    var2.d((byte) -36);
                    var2 = (td) (Object) ((bs) this).field_p.a(true);
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
                if (param0 == 28) {
                  break L2;
                } else {
                  ((bs) this).field_y = null;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qo.a((Throwable) (Object) runtimeException, "bs.P(" + param0 + ')');
        }
    }

    final synchronized void b(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                int discarded$2 = this.a(true, (uu) null);
                break L1;
              }
            }
            ((bs) this).field_E = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var3, "bs.MA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void d(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((bs) this).field_N[param1] = param0;
              if (param2 > 9) {
                break L1;
              } else {
                this.a(-89, (byte) -88, -127);
                break L1;
              }
            }
            ((bs) this).field_x[param1] = (int)(0.5 + Math.pow(2.0, (double)param0 * 0.00054931640625) * 2097152.0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var4, "bs.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void a(int param0, int param1, int param2) {
        try {
            this.c(param0 ^ -1968, param2, param1);
            if (param0 != 177) {
                ((bs) this).field_z = null;
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "bs.CA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final synchronized void a(boolean param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((bs) this).field_v.e();
              ((bs) this).field_I = null;
              if (param1 >= 0) {
                break L1;
              } else {
                ((bs) this).field_q = 79L;
                break L1;
              }
            }
            this.a(param0, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var3, "bs.JA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void c(int param0, byte param1) {
        RuntimeException runtimeException = null;
        uu var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        byte stackOut_17_0 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var3 = (uu) (Object) ((bs) this).field_s.field_t.b(-96);
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = param0;
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
                            if (~var3.field_y == ~param0) {
                              break L5;
                            } else {
                              break L4;
                            }
                          }
                        }
                        if (var3.field_x < 0) {
                          ((bs) this).field_t[var3.field_y][var3.field_E] = null;
                          var3.field_x = 0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var3 = (uu) (Object) ((bs) this).field_s.field_t.d((byte) 18);
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_17_0 = param1;
                stackIn_18_0 = stackOut_17_0;
                break L2;
              }
              L6: {
                if (stackIn_18_0 < -15) {
                  break L6;
                } else {
                  this.c(126, 58);
                  break L6;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qo.a((Throwable) (Object) runtimeException, "bs.PA(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized void a(byte param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param1 >= 0) {
                  break L2;
                } else {
                  var4_int = 0;
                  L3: while (true) {
                    L4: {
                      if (16 <= var4_int) {
                        break L4;
                      } else {
                        ((bs) this).field_y[var4_int] = param2;
                        var4_int++;
                        if (var5 != 0) {
                          break L1;
                        } else {
                          if (var5 == 0) {
                            continue L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              ((bs) this).field_y[param1] = param2;
              break L1;
            }
            L5: {
              if (param0 < -42) {
                break L5;
              } else {
                hj discarded$2 = ((bs) this).c();
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qo.a((Throwable) (Object) runtimeException, "bs.OA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final synchronized void a(boolean param0, boolean param1, boolean param2, tv param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              this.a(param2, (byte) 69);
              ((bs) this).field_v.a(param3.field_k);
              ((bs) this).field_O = 0L;
              ((bs) this).field_M = param0;
              var5_int = ((bs) this).field_v.f();
              var6 = 0;
              if (param1) {
                break L1;
              } else {
                ((bs) this).field_B = null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (var5_int <= var6) {
                    break L4;
                  } else {
                    ((bs) this).field_v.b(var6);
                    ((bs) this).field_v.a(var6);
                    ((bs) this).field_v.c(var6);
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
                ((bs) this).field_Q = ((bs) this).field_v.b();
                ((bs) this).field_C = ((bs) this).field_v.field_c[((bs) this).field_Q];
                ((bs) this).field_q = ((bs) this).field_v.d(((bs) this).field_C);
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) runtimeException;
            stackOut_11_1 = new StringBuilder().append("bs.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          throw qo.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    public static void f(int param0) {
        try {
            field_o = null;
            if (param0 >= -38) {
                bs.f(-53);
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "bs.LA(" + param0 + ')');
        }
    }

    final synchronized void a(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((bs) this).field_v.c()) {
                var2_int = ((bs) this).field_E * ((bs) this).field_v.field_d / du.field_k;
                L2: while (true) {
                  L3: {
                    var3 = ((bs) this).field_O + (long)param0 * (long)var2_int;
                    if (-var3 + ((bs) this).field_q >= 0L) {
                      ((bs) this).field_O = var3;
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    var5 = (int)((((bs) this).field_q - ((bs) this).field_O + ((long)var2_int + -1L)) / (long)var2_int);
                    ((bs) this).field_O = ((bs) this).field_O + (long)var5 * (long)var2_int;
                    param0 = param0 - var5;
                    ((bs) this).field_s.a(var5);
                    this.d(18922);
                    if (((bs) this).field_v.c()) {
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
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            ((bs) this).field_s.a(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "bs.E(" + param0 + ')');
        }
    }

    public bs() {
        ((bs) this).field_R = new int[16];
        ((bs) this).field_T = new int[16];
        ((bs) this).field_B = new int[16];
        ((bs) this).field_F = new int[16];
        ((bs) this).field_H = new int[16];
        ((bs) this).field_y = new int[16];
        ((bs) this).field_P = new uu[16][128];
        ((bs) this).field_r = 256;
        ((bs) this).field_w = new int[16];
        ((bs) this).field_E = 1000000;
        ((bs) this).field_L = new int[16];
        ((bs) this).field_N = new int[16];
        ((bs) this).field_t = new uu[16][128];
        ((bs) this).field_S = new int[16];
        ((bs) this).field_x = new int[16];
        ((bs) this).field_G = new int[16];
        ((bs) this).field_K = new int[16];
        ((bs) this).field_D = new int[16];
        ((bs) this).field_J = new int[16];
        ((bs) this).field_z = new int[16];
        ((bs) this).field_v = new sh();
        ((bs) this).field_s = new rh((bs) this);
        try {
            ((bs) this).field_p = new te(128);
            ((bs) this).a((byte) -127, -1, 256);
            this.a(true, true);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "bs.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
    }
}
