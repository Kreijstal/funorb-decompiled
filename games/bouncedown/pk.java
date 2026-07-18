/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends wf {
    private int[] field_M;
    private int[] field_k;
    private int[] field_q;
    private int[] field_t;
    private kl[][] field_C;
    private int[] field_r;
    private int[] field_H;
    private kl[][] field_O;
    private int field_n;
    private int[] field_N;
    private uk field_u;
    private oe field_w;
    static gk field_D;
    private int field_I;
    private int[] field_B;
    int[] field_K;
    private int[] field_z;
    private int[] field_J;
    private int[] field_E;
    private int[] field_m;
    int[] field_s;
    private int[] field_y;
    int[] field_l;
    private int field_A;
    private long field_P;
    private long field_L;
    private int field_p;
    private boolean field_F;
    private ka field_o;
    private be field_v;
    private int field_G;
    private boolean field_x;

    private final void c(byte param0, int param1, int param2) {
        try {
            int var4_int = -30 % ((-7 - param0) / 62);
            ((pk) this).field_M[param2] = param1;
            ((pk) this).field_N[param2] = da.b(param1, -128);
            this.a((byte) -82, param2, param1);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "pk.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void a(be param0, boolean param1, int param2) {
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
              if (param2 >= 49) {
                break L1;
              } else {
                ((pk) this).field_N = null;
                break L1;
              }
            }
            this.a(param0, true, param1, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("pk.IA(");
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
          throw ii.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized int b() {
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
          throw ii.a((Throwable) (Object) var1, "pk.K()");
        }
        return stackIn_1_0;
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
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
        var8 = Bounce.field_N;
        try {
          L0: {
            L1: {
              L2: {
                if (!((pk) this).field_w.d()) {
                  break L2;
                } else {
                  var4_int = ((pk) this).field_w.field_b * ((pk) this).field_n / e.field_r;
                  L3: while (true) {
                    L4: {
                      var5 = (long)param2 * (long)var4_int + ((pk) this).field_P;
                      if (0L > -var5 + ((pk) this).field_L) {
                        break L4;
                      } else {
                        ((pk) this).field_P = var5;
                        if (var8 != 0) {
                          break L1;
                        } else {
                          if (var8 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var7 = (int)(((long)var4_int + (((pk) this).field_L - ((pk) this).field_P + -1L)) / (long)var4_int);
                    ((pk) this).field_P = ((pk) this).field_P + (long)var7 * (long)var4_int;
                    ((pk) this).field_o.a(param0, param1, var7);
                    param2 = param2 - var7;
                    param1 = param1 + var7;
                    this.b((byte) -126);
                    if (!((pk) this).field_w.d()) {
                      break L2;
                    } else {
                      if (var8 == 0) {
                        continue L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              ((pk) this).field_o.a(param0, param1, param2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) runtimeException;
            stackOut_14_1 = new StringBuilder().append("pk.P(");
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
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
          throw ii.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(String param0, String param1, int param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
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
              if (null == nk.field_a) {
                break L1;
              } else {
                nk.field_a.a(true);
                break L1;
              }
            }
            L2: {
              if (param2 < -1) {
                break L2;
              } else {
                field_D = null;
                break L2;
              }
            }
            vk.field_c = new ci(param1, param0, false, true, true);
            ed.field_c.a(10768, (lk) (Object) vk.field_c);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("pk.FA(");
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
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
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
          throw ii.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ')');
        }
    }

    private final synchronized void a(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Bounce.field_N;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (param2 < param0) {
                    break L3;
                  } else {
                    ((pk) this).field_r[param2] = param1;
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var4_int = 0;
                L4: while (true) {
                  if (16 <= var4_int) {
                    break L2;
                  } else {
                    ((pk) this).field_r[var4_int] = param1;
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
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var4, "pk.MA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int b(kl param0, byte param1) {
        RuntimeException var3 = null;
        ch var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
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
        int stackOut_3_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_6_0 = 0;
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
            if (0 == ((pk) this).field_r[param0.field_E]) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var3_ref = param0.field_o;
              var4 = ((pk) this).field_J[param0.field_E] * ((pk) this).field_q[param0.field_E] - -4096 >> 1003688141;
              var4 = var4 * var4 + 16384 >> 1502530639;
              if (param1 == 68) {
                L1: {
                  var4 = param0.field_n * var4 - -16384 >> -652439665;
                  var4 = 128 + ((pk) this).field_I * var4 >> -998520088;
                  var4 = ((pk) this).field_r[param0.field_E] * var4 + 128 >> -71231768;
                  if (var3_ref.field_k > 0) {
                    var4 = (int)(0.5 + (double)var4 * Math.pow(0.5, 0.00001953125 * (double)param0.field_A * (double)var3_ref.field_k));
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (null == var3_ref.field_e) {
                    break L2;
                  } else {
                    L3: {
                      var5 = param0.field_q;
                      var6 = var3_ref.field_e[1 + param0.field_s];
                      if (~param0.field_s <= ~(-2 + var3_ref.field_e.length)) {
                        break L3;
                      } else {
                        var7 = 65280 & var3_ref.field_e[param0.field_s] << -198655576;
                        var8 = (255 & var3_ref.field_e[2 + param0.field_s]) << -1194683800;
                        var6 = var6 + (var5 - var7) * (var3_ref.field_e[3 + param0.field_s] - var6) / (var8 + -var7);
                        break L3;
                      }
                    }
                    var4 = var4 * var6 + 32 >> -1405606906;
                    break L2;
                  }
                }
                L4: {
                  if (param0.field_C <= 0) {
                    break L4;
                  } else {
                    if (null != var3_ref.field_i) {
                      L5: {
                        var5 = param0.field_C;
                        var6 = var3_ref.field_i[param0.field_y - -1];
                        if (~param0.field_y > ~(-2 + var3_ref.field_i.length)) {
                          var7 = (255 & var3_ref.field_i[param0.field_y]) << -900150424;
                          var8 = (255 & var3_ref.field_i[2 + param0.field_y]) << -901534328;
                          var6 = var6 + (-var6 + var3_ref.field_i[param0.field_y - -3]) * (var5 + -var7) / (-var7 + var8);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var4 = var6 * var4 - -32 >> -1870648122;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                stackOut_27_0 = var4;
                stackIn_28_0 = stackOut_27_0;
                break L0;
              } else {
                stackOut_6_0 = -77;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var3;
            stackOut_29_1 = new StringBuilder().append("pk.D(");
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
              break L6;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L6;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param1 + ')');
        }
        return stackIn_28_0;
    }

    private final synchronized void a(be param0, boolean param1, boolean param2, boolean param3) {
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
        var7 = Bounce.field_N;
        try {
          L0: {
            L1: {
              this.a(param1, 104);
              ((pk) this).field_w.a(param0.field_h);
              ((pk) this).field_P = 0L;
              ((pk) this).field_F = param2;
              var5_int = ((pk) this).field_w.e();
              if (param3) {
                break L1;
              } else {
                ((pk) this).a((be) null, true, -97);
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
                    ((pk) this).field_w.e(var6);
                    ((pk) this).field_w.a(var6);
                    ((pk) this).field_w.c(var6);
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
                ((pk) this).field_p = ((pk) this).field_w.c();
                ((pk) this).field_A = ((pk) this).field_w.field_d[((pk) this).field_p];
                ((pk) this).field_L = ((pk) this).field_w.f(((pk) this).field_A);
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
            stackOut_12_1 = new StringBuilder().append("pk.H(");
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
          throw ii.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void b(int param0, int param1) {
        RuntimeException runtimeException = null;
        kl var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Bounce.field_N;
        try {
          L0: {
            L1: {
              var3 = (kl) (Object) ((pk) this).field_o.field_m.a((byte) -102);
              if (param0 == 0) {
                break L1;
              } else {
                ((pk) this).field_t = null;
                break L1;
              }
            }
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
                          if (param1 < 0) {
                            break L6;
                          } else {
                            if (~param1 == ~var3.field_E) {
                              break L6;
                            } else {
                              break L5;
                            }
                          }
                        }
                        if (0 > var3.field_C) {
                          ((pk) this).field_C[var3.field_E][var3.field_r] = null;
                          var3.field_C = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      var3 = (kl) (Object) ((pk) this).field_o.field_m.d((byte) -46);
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
          runtimeException = decompiledCaughtException;
          throw ii.a((Throwable) (Object) runtimeException, "pk.V(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(kl param0, int param1) {
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
            if (param0.field_i != null) {
              L1: {
                if (param1 == 8335400) {
                  break L1;
                } else {
                  ((pk) this).field_E = null;
                  break L1;
                }
              }
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              break L0;
            } else {
              L2: {
                if (param0.field_C < 0) {
                  break L2;
                } else {
                  param0.c(param1 ^ 8335402);
                  if (param0.field_z <= 0) {
                    break L2;
                  } else {
                    if (param0 == ((pk) this).field_O[param0.field_E][param0.field_z]) {
                      ((pk) this).field_O[param0.field_E][param0.field_z] = null;
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
            stackOut_20_1 = new StringBuilder().append("pk.U(");
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
          throw ii.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ')');
        }
        return stackIn_19_0 != 0;
    }

    private final synchronized void a(boolean param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((pk) this).field_w.b();
              if (param1 >= 18) {
                break L1;
              } else {
                ((pk) this).field_I = -90;
                break L1;
              }
            }
            ((pk) this).field_v = null;
            this.b(param0, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var3, "pk.W(" + param0 + ',' + param1 + ')');
        }
    }

    private final void c(int param0, int param1) {
        RuntimeException var3 = null;
        kl var3_ref = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        var4 = Bounce.field_N;
        try {
          L0: {
            L1: {
              L2: {
                if ((2 & ((pk) this).field_l[param0]) != 0) {
                  var3_ref = (kl) (Object) ((pk) this).field_o.field_m.a((byte) -67);
                  L3: while (true) {
                    if (null == var3_ref) {
                      break L2;
                    } else {
                      stackOut_6_0 = var3_ref.field_E;
                      stackOut_6_1 = param0;
                      stackIn_21_0 = stackOut_6_0;
                      stackIn_21_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var4 != 0) {
                        break L1;
                      } else {
                        L4: {
                          if (stackIn_7_0 != stackIn_7_1) {
                            break L4;
                          } else {
                            if (((pk) this).field_C[param0][var3_ref.field_r] == null) {
                              if (var3_ref.field_C < 0) {
                                var3_ref.field_C = 0;
                                break L4;
                              } else {
                                break L4;
                              }
                            } else {
                              break L4;
                            }
                          }
                        }
                        var3_ref = (kl) (Object) ((pk) this).field_o.field_m.d((byte) 123);
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
              stackOut_20_0 = param1;
              stackOut_20_1 = 20974;
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              break L1;
            }
            L5: {
              if (stackIn_21_0 == stackIn_21_1) {
                break L5;
              } else {
                wf discarded$2 = ((pk) this).c();
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var3, "pk.L(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(int[] param0, int param1, int param2, kl param3, byte param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        ch var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_18_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        int stackIn_118_0 = 0;
        int stackIn_120_0 = 0;
        RuntimeException stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        RuntimeException stackIn_124_0 = null;
        StringBuilder stackIn_124_1 = null;
        RuntimeException stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        String stackIn_125_2 = null;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        String stackIn_129_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_92_0 = 0;
        int stackOut_92_1 = 0;
        int stackOut_117_0 = 0;
        int stackOut_119_0 = 0;
        RuntimeException stackOut_121_0 = null;
        StringBuilder stackOut_121_1 = null;
        RuntimeException stackOut_124_0 = null;
        StringBuilder stackOut_124_1 = null;
        String stackOut_124_2 = null;
        RuntimeException stackOut_122_0 = null;
        StringBuilder stackOut_122_1 = null;
        String stackOut_122_2 = null;
        RuntimeException stackOut_125_0 = null;
        StringBuilder stackOut_125_1 = null;
        RuntimeException stackOut_128_0 = null;
        StringBuilder stackOut_128_1 = null;
        String stackOut_128_2 = null;
        RuntimeException stackOut_126_0 = null;
        StringBuilder stackOut_126_1 = null;
        String stackOut_126_2 = null;
        var12 = Bounce.field_N;
        try {
          L0: {
            L1: {
              param3.field_j = e.field_r / 100;
              var6_int = 83 % ((param4 - 37) / 52);
              if (0 > param3.field_C) {
                break L1;
              } else {
                L2: {
                  if (param3.field_i == null) {
                    break L2;
                  } else {
                    if (param3.field_i.e()) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  param3.d(0);
                  param3.c(2);
                  if (param3.field_z <= 0) {
                    break L3;
                  } else {
                    if (param3 == ((pk) this).field_O[param3.field_E][param3.field_z]) {
                      ((pk) this).field_O[param3.field_E][param3.field_z] = null;
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
              var7 = param3.field_x;
              if (var7 <= 0) {
                break L4;
              } else {
                L5: {
                  var7 = var7 - (int)(16.0 * Math.pow(2.0, (double)((pk) this).field_m[param3.field_E] * 0.0004921259842519685) + 0.5);
                  if (var7 < 0) {
                    var7 = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                param3.field_x = var7;
                break L4;
              }
            }
            L6: {
              param3.field_i.e(this.a(param3, true));
              var8 = param3.field_o;
              param3.field_v = param3.field_v + var8.field_c;
              var9 = 0;
              param3.field_p = param3.field_p + 1;
              var10 = 0.000005086263020833333 * (double)((param3.field_r - 60 << 1334659784) + (param3.field_h * param3.field_x >> 544248236));
              if (var8.field_k > 0) {
                L7: {
                  L8: {
                    if (0 >= var8.field_g) {
                      break L8;
                    } else {
                      param3.field_A = param3.field_A + (int)(Math.pow(2.0, (double)var8.field_g * var10) * 128.0 + 0.5);
                      if (var12 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  param3.field_A = param3.field_A + 128;
                  break L7;
                }
                if (var8.field_k * param3.field_A >= 819200) {
                  var9 = 1;
                  break L6;
                } else {
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L9: {
              if (var8.field_e == null) {
                break L9;
              } else {
                L10: {
                  L11: {
                    if (0 < var8.field_l) {
                      break L11;
                    } else {
                      param3.field_q = param3.field_q + 128;
                      if (var12 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  param3.field_q = param3.field_q + (int)(128.0 * Math.pow(2.0, var10 * (double)var8.field_l) + 0.5);
                  break L10;
                }
                L12: while (true) {
                  L13: {
                    L14: {
                      if (param3.field_s >= var8.field_e.length + -2) {
                        break L14;
                      } else {
                        stackOut_48_0 = ~param3.field_q;
                        stackOut_48_1 = ~(65280 & var8.field_e[param3.field_s - -2] << 1377025672);
                        stackIn_56_0 = stackOut_48_0;
                        stackIn_56_1 = stackOut_48_1;
                        stackIn_49_0 = stackOut_48_0;
                        stackIn_49_1 = stackOut_48_1;
                        if (var12 != 0) {
                          break L13;
                        } else {
                          if (stackIn_49_0 >= stackIn_49_1) {
                            break L14;
                          } else {
                            param3.field_s = param3.field_s + 2;
                            if (var12 == 0) {
                              continue L12;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                    }
                    stackOut_55_0 = ~param3.field_s;
                    stackOut_55_1 = ~(-2 + var8.field_e.length);
                    stackIn_56_0 = stackOut_55_0;
                    stackIn_56_1 = stackOut_55_1;
                    break L13;
                  }
                  if (stackIn_56_0 != stackIn_56_1) {
                    break L9;
                  } else {
                    if (0 == var8.field_e[param3.field_s - -1]) {
                      var9 = 1;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
              }
            }
            L15: {
              if (param3.field_C < 0) {
                break L15;
              } else {
                if (var8.field_i == null) {
                  break L15;
                } else {
                  if ((((pk) this).field_l[param3.field_E] & 1) != 0) {
                    break L15;
                  } else {
                    L16: {
                      if (param3.field_z < 0) {
                        break L16;
                      } else {
                        if (((pk) this).field_O[param3.field_E][param3.field_z] != param3) {
                          break L16;
                        } else {
                          break L15;
                        }
                      }
                    }
                    L17: {
                      L18: {
                        if (var8.field_b > 0) {
                          break L18;
                        } else {
                          param3.field_C = param3.field_C + 128;
                          if (var12 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      param3.field_C = param3.field_C + (int)(Math.pow(2.0, (double)var8.field_b * var10) * 128.0 + 0.5);
                      break L17;
                    }
                    L19: while (true) {
                      L20: {
                        L21: {
                          if (~(var8.field_i.length + -2) >= ~param3.field_y) {
                            break L21;
                          } else {
                            stackOut_85_0 = var8.field_i[2 + param3.field_y] << -360204376 & 65280;
                            stackOut_85_1 = param3.field_C;
                            stackIn_93_0 = stackOut_85_0;
                            stackIn_93_1 = stackOut_85_1;
                            stackIn_86_0 = stackOut_85_0;
                            stackIn_86_1 = stackOut_85_1;
                            if (var12 != 0) {
                              break L20;
                            } else {
                              if (stackIn_86_0 >= stackIn_86_1) {
                                break L21;
                              } else {
                                param3.field_y = param3.field_y + 2;
                                if (var12 == 0) {
                                  continue L19;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                        }
                        stackOut_92_0 = var8.field_i.length - 2;
                        stackOut_92_1 = param3.field_y;
                        stackIn_93_0 = stackOut_92_0;
                        stackIn_93_1 = stackOut_92_1;
                        break L20;
                      }
                      if (stackIn_93_0 != stackIn_93_1) {
                        break L15;
                      } else {
                        var9 = 1;
                        break L15;
                      }
                    }
                  }
                }
              }
            }
            if (var9 != 0) {
              L22: {
                L23: {
                  param3.field_i.i(param3.field_j);
                  if (param0 == null) {
                    break L23;
                  } else {
                    param3.field_i.a(param0, param2, param1);
                    if (var12 == 0) {
                      break L22;
                    } else {
                      break L23;
                    }
                  }
                }
                param3.field_i.a(param1);
                break L22;
              }
              L24: {
                if (!param3.field_i.k()) {
                  break L24;
                } else {
                  ((pk) this).field_o.field_l.a((wf) (Object) param3.field_i);
                  break L24;
                }
              }
              L25: {
                param3.d(0);
                if (param3.field_C < 0) {
                  break L25;
                } else {
                  param3.c(2);
                  if (0 >= param3.field_z) {
                    break L25;
                  } else {
                    if (((pk) this).field_O[param3.field_E][param3.field_z] == param3) {
                      ((pk) this).field_O[param3.field_E][param3.field_z] = null;
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
              param3.field_i.a(param3.field_j, this.b(param3, (byte) 68), this.a(param3, (byte) 53));
              stackOut_119_0 = 0;
              stackIn_120_0 = stackOut_119_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var6 = decompiledCaughtException;
            stackOut_121_0 = (RuntimeException) var6;
            stackOut_121_1 = new StringBuilder().append("pk.LA(");
            stackIn_124_0 = stackOut_121_0;
            stackIn_124_1 = stackOut_121_1;
            stackIn_122_0 = stackOut_121_0;
            stackIn_122_1 = stackOut_121_1;
            if (param0 == null) {
              stackOut_124_0 = (RuntimeException) (Object) stackIn_124_0;
              stackOut_124_1 = (StringBuilder) (Object) stackIn_124_1;
              stackOut_124_2 = "null";
              stackIn_125_0 = stackOut_124_0;
              stackIn_125_1 = stackOut_124_1;
              stackIn_125_2 = stackOut_124_2;
              break L26;
            } else {
              stackOut_122_0 = (RuntimeException) (Object) stackIn_122_0;
              stackOut_122_1 = (StringBuilder) (Object) stackIn_122_1;
              stackOut_122_2 = "{...}";
              stackIn_125_0 = stackOut_122_0;
              stackIn_125_1 = stackOut_122_1;
              stackIn_125_2 = stackOut_122_2;
              break L26;
            }
          }
          L27: {
            stackOut_125_0 = (RuntimeException) (Object) stackIn_125_0;
            stackOut_125_1 = ((StringBuilder) (Object) stackIn_125_1).append(stackIn_125_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_128_0 = stackOut_125_0;
            stackIn_128_1 = stackOut_125_1;
            stackIn_126_0 = stackOut_125_0;
            stackIn_126_1 = stackOut_125_1;
            if (param3 == null) {
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
          throw ii.a((Throwable) (Object) stackIn_129_0, stackIn_129_2 + ',' + param4 + ')');
        }
        return stackIn_120_0 != 0;
    }

    final static void a(byte param0, String param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = 57 / ((param0 - -73) / 52);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("pk.JA(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final synchronized void a(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Bounce.field_N;
        try {
          L0: {
            L1: {
              if (((pk) this).field_w.d()) {
                var2_int = ((pk) this).field_n * ((pk) this).field_w.field_b / e.field_r;
                L2: while (true) {
                  L3: {
                    var3 = (long)var2_int * (long)param0 + ((pk) this).field_P;
                    if (-var3 + ((pk) this).field_L >= 0L) {
                      ((pk) this).field_P = var3;
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
                    var5 = (int)((-1L + ((long)var2_int + (-((pk) this).field_P + ((pk) this).field_L))) / (long)var2_int);
                    ((pk) this).field_P = ((pk) this).field_P + (long)var5 * (long)var2_int;
                    ((pk) this).field_o.a(var5);
                    param0 = param0 - var5;
                    this.b((byte) -123);
                    if (((pk) this).field_w.d()) {
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
            ((pk) this).field_o.a(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var2, "pk.N(" + param0 + ')');
        }
    }

    final synchronized wf c() {
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
          throw ii.a((Throwable) (Object) var1, "pk.B()");
        }
        return (wf) (Object) stackIn_1_0;
    }

    private final void b(boolean param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Bounce.field_N;
        try {
          L0: {
            L1: {
              L2: {
                if (param0) {
                  break L2;
                } else {
                  this.b(0, -1);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.a(-1, 2099140935);
              break L1;
            }
            this.f(param1, -66);
            var3_int = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if (var3_int >= 16) {
                    break L5;
                  } else {
                    ((pk) this).field_z[var3_int] = ((pk) this).field_M[var3_int];
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
                      ((pk) this).field_N[var3_int] = da.b(((pk) this).field_M[var3_int], -128);
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
          throw ii.a((Throwable) (Object) var3, "pk.Q(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1) {
        RuntimeException runtimeException = null;
        kl var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Bounce.field_N;
        try {
          L0: {
            L1: {
              var3 = (kl) (Object) ((pk) this).field_o.field_m.a((byte) -49);
              if (param1 == 2099140935) {
                break L1;
              } else {
                ((pk) this).f(75);
                break L1;
              }
            }
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
                          if (param0 < 0) {
                            break L6;
                          } else {
                            if (param0 != var3.field_E) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          if (null != var3.field_i) {
                            L8: {
                              var3.field_i.i(e.field_r / 100);
                              if (var3.field_i.k()) {
                                ((pk) this).field_o.field_l.a((wf) (Object) var3.field_i);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            var3.d(0);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L9: {
                          if (0 > var3.field_C) {
                            ((pk) this).field_C[var3.field_E][var3.field_r] = null;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var3.c(2);
                        break L5;
                      }
                      var3 = (kl) (Object) ((pk) this).field_o.field_m.d((byte) 75);
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
          runtimeException = decompiledCaughtException;
          throw ii.a((Throwable) (Object) runtimeException, "pk.R(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        var7 = Bounce.field_N;
        try {
          L0: {
            L1: {
              var2_int = ((pk) this).field_p;
              var3 = ((pk) this).field_A;
              if (param0 <= -41) {
                break L1;
              } else {
                ((pk) this).field_H = null;
                break L1;
              }
            }
            L2: {
              var4 = ((pk) this).field_L;
              if (null == ((pk) this).field_v) {
                break L2;
              } else {
                if (~((pk) this).field_G != ~var3) {
                  break L2;
                } else {
                  this.a(((pk) this).field_v, ((pk) this).field_x, ((pk) this).field_F, true);
                  this.b((byte) -108);
                  return;
                }
              }
            }
            L3: while (true) {
              stackOut_10_0 = ((pk) this).field_A;
              stackOut_10_1 = var3;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              L4: while (true) {
                L5: {
                  L6: {
                    L7: {
                      if (stackIn_11_0 != stackIn_11_1) {
                        break L7;
                      } else {
                        L8: while (true) {
                          stackOut_12_0 = ((pk) this).field_w.field_d[var2_int];
                          stackOut_12_1 = var3;
                          stackIn_41_0 = stackOut_12_0;
                          stackIn_41_1 = stackOut_12_1;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          if (var7 != 0) {
                            break L6;
                          } else {
                            L9: {
                              if (stackIn_13_0 != stackIn_13_1) {
                                break L9;
                              } else {
                                ((pk) this).field_w.e(var2_int);
                                var6 = ((pk) this).field_w.d(var2_int);
                                stackOut_14_0 = ~var6;
                                stackOut_14_1 = -2;
                                stackIn_11_0 = stackOut_14_0;
                                stackIn_11_1 = stackOut_14_1;
                                stackIn_15_0 = stackOut_14_0;
                                stackIn_15_1 = stackOut_14_1;
                                if (var7 != 0) {
                                  continue L4;
                                } else {
                                  if (stackIn_15_0 != stackIn_15_1) {
                                    L10: {
                                      if ((var6 & 128) == 0) {
                                        break L10;
                                      } else {
                                        this.e(32755, var6);
                                        break L10;
                                      }
                                    }
                                    ((pk) this).field_w.a(var2_int);
                                    ((pk) this).field_w.c(var2_int);
                                    if (var7 == 0) {
                                      continue L8;
                                    } else {
                                      break L9;
                                    }
                                  } else {
                                    ((pk) this).field_w.f();
                                    ((pk) this).field_w.c(var2_int);
                                    if (!((pk) this).field_w.a()) {
                                      break L9;
                                    } else {
                                      if (((pk) this).field_v == null) {
                                        L11: {
                                          if (!((pk) this).field_F) {
                                            break L11;
                                          } else {
                                            if (var3 != 0) {
                                              ((pk) this).field_w.a(var4);
                                              if (var7 == 0) {
                                                break L9;
                                              } else {
                                                break L11;
                                              }
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                        this.b(true, -1);
                                        ((pk) this).field_w.b();
                                        return;
                                      } else {
                                        ((pk) this).a(((pk) this).field_v, ((pk) this).field_F, 71);
                                        this.b((byte) -126);
                                        return;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var2_int = ((pk) this).field_w.c();
                            var3 = ((pk) this).field_w.field_d[var2_int];
                            var4 = ((pk) this).field_w.f(var3);
                            if (var7 == 0) {
                              continue L3;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    }
                    ((pk) this).field_L = var4;
                    ((pk) this).field_A = var3;
                    ((pk) this).field_p = var2_int;
                    if (((pk) this).field_v == null) {
                      break L5;
                    } else {
                      stackOut_39_0 = ~var3;
                      stackOut_39_1 = ~((pk) this).field_G;
                      stackIn_41_0 = stackOut_39_0;
                      stackIn_41_1 = stackOut_39_1;
                      break L6;
                    }
                  }
                  if (stackIn_41_0 < stackIn_41_1) {
                    ((pk) this).field_A = ((pk) this).field_G;
                    ((pk) this).field_p = -1;
                    ((pk) this).field_L = ((pk) this).field_w.f(((pk) this).field_A);
                    break L5;
                  } else {
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
          throw ii.a((Throwable) (Object) var2, "pk.CA(" + param0 + ')');
        }
    }

    final synchronized void e(int param0) {
        rj var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Bounce.field_N;
        try {
          L0: {
            L1: {
              if (param0 == 16) {
                break L1;
              } else {
                ((pk) this).field_E = null;
                break L1;
              }
            }
            var2 = (rj) (Object) ((pk) this).field_u.b(0);
            L2: while (true) {
              L3: {
                L4: {
                  if (var2 == null) {
                    break L4;
                  } else {
                    var2.e(125);
                    var2 = (rj) (Object) ((pk) this).field_u.a(-1);
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
          throw ii.a((Throwable) (Object) var2_ref, "pk.KA(" + param0 + ')');
        }
    }

    final synchronized wf d() {
        RuntimeException var1 = null;
        ka stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        ka stackOut_0_0 = null;
        try {
          L0: {
            stackOut_0_0 = ((pk) this).field_o;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var1, "pk.S()");
        }
        return (wf) (Object) stackIn_1_0;
    }

    private final void a(boolean param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        kl var5_ref = null;
        rj var5_ref2 = null;
        ue var6 = null;
        int var6_int = 0;
        kl var7 = null;
        kl var8 = null;
        int var9 = 0;
        kl stackIn_5_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_31_0 = null;
        kl stackIn_31_1 = null;
        int stackIn_31_2 = 0;
        Object stackIn_33_0 = null;
        kl stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        Object stackIn_35_0 = null;
        kl stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        Object stackIn_36_0 = null;
        kl stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        RuntimeException decompiledCaughtException = null;
        kl stackOut_4_0 = null;
        ai stackOut_14_0 = null;
        Object stackOut_30_0 = null;
        kl stackOut_30_1 = null;
        int stackOut_30_2 = 0;
        Object stackOut_35_0 = null;
        kl stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        Object stackOut_31_0 = null;
        kl stackOut_31_1 = null;
        int stackOut_31_2 = 0;
        Object stackOut_33_0 = null;
        kl stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        var9 = Bounce.field_N;
        try {
          L0: {
            L1: {
              L2: {
                this.b(param3, param2, 64, 0);
                if ((((pk) this).field_l[param3] & 2) == 0) {
                  break L2;
                } else {
                  var5_ref = (kl) (Object) ((pk) this).field_o.field_m.b((byte) 60);
                  L3: while (true) {
                    if (var5_ref == null) {
                      break L2;
                    } else {
                      stackOut_4_0 = (kl) var5_ref;
                      stackIn_15_0 = (Object) (Object) stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var9 != 0) {
                        break L1;
                      } else {
                        L4: {
                          if (stackIn_5_0.field_E != param3) {
                            break L4;
                          } else {
                            if (var5_ref.field_C >= 0) {
                              break L4;
                            } else {
                              ((pk) this).field_C[param3][var5_ref.field_r] = null;
                              ((pk) this).field_C[param3][param2] = var5_ref;
                              var6_int = var5_ref.field_l + (var5_ref.field_h * var5_ref.field_x >> -1208436);
                              var5_ref.field_l = var5_ref.field_l + (-var5_ref.field_r + param2 << 371026280);
                              var5_ref.field_x = 4096;
                              var5_ref.field_r = param2;
                              var5_ref.field_h = var6_int + -var5_ref.field_l;
                              return;
                            }
                          }
                        }
                        var5_ref = (kl) (Object) ((pk) this).field_o.field_m.a(-18158);
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
              stackOut_14_0 = ((pk) this).field_u.a(48, (long)((pk) this).field_z[param3]);
              stackIn_15_0 = (Object) (Object) stackOut_14_0;
              break L1;
            }
            var5_ref2 = (rj) (Object) stackIn_15_0;
            if (null == var5_ref2) {
              return;
            } else {
              var6 = var5_ref2.field_k[param2];
              if (var6 == null) {
                return;
              } else {
                L5: {
                  var7 = new kl();
                  var7.field_E = param3;
                  var7.field_D = var5_ref2;
                  var7.field_w = var6;
                  var7.field_o = var5_ref2.field_l[param2];
                  var7.field_z = var5_ref2.field_i[param2];
                  var7.field_r = param2;
                  var7.field_n = var5_ref2.field_m * (param1 * param1 * var5_ref2.field_o[param2]) + 1024 >> 2054891467;
                  var7.field_k = 255 & var5_ref2.field_r[param2];
                  var7.field_l = (param2 << 131797000) - (32767 & var5_ref2.field_n[param2]);
                  var7.field_s = 0;
                  var7.field_y = 0;
                  var7.field_q = 0;
                  var7.field_C = -1;
                  var7.field_A = 0;
                  if (param0) {
                    break L5;
                  } else {
                    pk.d(-32);
                    break L5;
                  }
                }
                L6: {
                  L7: {
                    if (((pk) this).field_s[param3] != 0) {
                      break L7;
                    } else {
                      var7.field_i = pi.a(var6, this.a(var7, true), this.b(var7, (byte) 68), this.a(var7, (byte) 53));
                      if (var9 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    var7.field_i = pi.a(var6, this.a(var7, true), 0, this.a(var7, (byte) 53));
                    stackOut_30_0 = this;
                    stackOut_30_1 = (kl) var7;
                    stackOut_30_2 = -117;
                    stackIn_35_0 = stackOut_30_0;
                    stackIn_35_1 = stackOut_30_1;
                    stackIn_35_2 = stackOut_30_2;
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    stackIn_31_2 = stackOut_30_2;
                    if (var5_ref2.field_n[param2] >= 0) {
                      stackOut_35_0 = this;
                      stackOut_35_1 = (kl) (Object) stackIn_35_1;
                      stackOut_35_2 = stackIn_35_2;
                      stackOut_35_3 = 0;
                      stackIn_36_0 = stackOut_35_0;
                      stackIn_36_1 = stackOut_35_1;
                      stackIn_36_2 = stackOut_35_2;
                      stackIn_36_3 = stackOut_35_3;
                      break L8;
                    } else {
                      stackOut_31_0 = this;
                      stackOut_31_1 = (kl) (Object) stackIn_31_1;
                      stackOut_31_2 = stackIn_31_2;
                      stackIn_33_0 = stackOut_31_0;
                      stackIn_33_1 = stackOut_31_1;
                      stackIn_33_2 = stackOut_31_2;
                      stackOut_33_0 = this;
                      stackOut_33_1 = (kl) (Object) stackIn_33_1;
                      stackOut_33_2 = stackIn_33_2;
                      stackOut_33_3 = 1;
                      stackIn_36_0 = stackOut_33_0;
                      stackIn_36_1 = stackOut_33_1;
                      stackIn_36_2 = stackOut_33_2;
                      stackIn_36_3 = stackOut_33_3;
                      break L8;
                    }
                  }
                  ((pk) this).a(stackIn_36_1, (byte) stackIn_36_2, stackIn_36_3 != 0);
                  break L6;
                }
                L9: {
                  if (var5_ref2.field_n[param2] >= 0) {
                    break L9;
                  } else {
                    var7.field_i.f(-1);
                    break L9;
                  }
                }
                L10: {
                  if (var7.field_z >= 0) {
                    L11: {
                      var8 = ((pk) this).field_O[param3][var7.field_z];
                      if (var8 == null) {
                        break L11;
                      } else {
                        if (var8.field_C < 0) {
                          ((pk) this).field_C[param3][var8.field_r] = null;
                          var8.field_C = 0;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                    ((pk) this).field_O[param3][var7.field_z] = var7;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                ((pk) this).field_o.field_m.a(1, (ai) (Object) var7);
                ((pk) this).field_C[param3][param2] = var7;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var5, "pk.PA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void e(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Bounce.field_N;
        try {
          L0: {
            L1: {
              var3_int = param1 & 240;
              if (param0 == 32755) {
                break L1;
              } else {
                ((pk) this).field_A = -20;
                break L1;
              }
            }
            if (128 == var3_int) {
              var4 = 15 & param1;
              var5 = (32542 & param1) >> 1014988296;
              var6 = (param1 & 8374679) >> 610185072;
              this.b(var4, var5, var6, 0);
              return;
            } else {
              if (144 == var3_int) {
                L2: {
                  L3: {
                    var4 = 15 & param1;
                    var5 = param1 >> 679392520 & 127;
                    var6 = (8335400 & param1) >> 753720336;
                    if (var6 <= 0) {
                      break L3;
                    } else {
                      this.a(true, var6, var5, var4);
                      if (var8 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  this.b(var4, var5, 64, 0);
                  break L2;
                }
                return;
              } else {
                if (var3_int != 160) {
                  if (var3_int == 176) {
                    L4: {
                      var4 = 15 & param1;
                      var5 = 127 & param1 >> 504944168;
                      var6 = (param1 & 8377708) >> 1842372400;
                      if (0 == var5) {
                        ((pk) this).field_N[var4] = (var6 << -1169215698) + da.b(-2080769, ((pk) this).field_N[var4]);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (var5 == 32) {
                        ((pk) this).field_N[var4] = da.b(-16257, ((pk) this).field_N[var4]) + (var6 << -405302041);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if (1 != var5) {
                        break L6;
                      } else {
                        ((pk) this).field_E[var4] = (var6 << 2099140935) + da.b(((pk) this).field_E[var4], -16257);
                        break L6;
                      }
                    }
                    L7: {
                      if (var5 == 33) {
                        ((pk) this).field_E[var4] = da.b(-128, ((pk) this).field_E[var4]) + var6;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (var5 == 5) {
                        ((pk) this).field_m[var4] = (var6 << -58902585) + da.b(-16257, ((pk) this).field_m[var4]);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (var5 == 37) {
                        ((pk) this).field_m[var4] = var6 + da.b(((pk) this).field_m[var4], -128);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (7 == var5) {
                        ((pk) this).field_J[var4] = (var6 << -26275353) + da.b(-16257, ((pk) this).field_J[var4]);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (var5 == 39) {
                        ((pk) this).field_J[var4] = var6 + da.b(((pk) this).field_J[var4], -128);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (var5 == 10) {
                        ((pk) this).field_k[var4] = (var6 << 39334631) + da.b(((pk) this).field_k[var4], -16257);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      if (var5 == 42) {
                        ((pk) this).field_k[var4] = var6 + da.b(((pk) this).field_k[var4], -128);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      if (var5 != 11) {
                        break L14;
                      } else {
                        ((pk) this).field_q[var4] = (var6 << -1624875833) + da.b(-16257, ((pk) this).field_q[var4]);
                        break L14;
                      }
                    }
                    L15: {
                      if (var5 == 43) {
                        ((pk) this).field_q[var4] = da.b(-128, ((pk) this).field_q[var4]) + var6;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    L16: {
                      if (var5 != 64) {
                        break L16;
                      } else {
                        L17: {
                          if (var6 < 64) {
                            break L17;
                          } else {
                            ((pk) this).field_l[var4] = ge.a(((pk) this).field_l[var4], 1);
                            if (var8 == 0) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        ((pk) this).field_l[var4] = da.b(((pk) this).field_l[var4], -2);
                        break L16;
                      }
                    }
                    L18: {
                      if (65 == var5) {
                        L19: {
                          if (var6 < 64) {
                            break L19;
                          } else {
                            ((pk) this).field_l[var4] = ge.a(((pk) this).field_l[var4], 2);
                            if (var8 == 0) {
                              break L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        this.c(var4, 20974);
                        ((pk) this).field_l[var4] = da.b(((pk) this).field_l[var4], -3);
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    L20: {
                      if (var5 == 99) {
                        ((pk) this).field_t[var4] = (var6 << 1190482407) + da.b(127, ((pk) this).field_t[var4]);
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    L21: {
                      if (var5 != 98) {
                        break L21;
                      } else {
                        ((pk) this).field_t[var4] = da.b(16256, ((pk) this).field_t[var4]) + var6;
                        break L21;
                      }
                    }
                    L22: {
                      if (101 == var5) {
                        ((pk) this).field_t[var4] = (var6 << -1339647609) + (16384 - -da.b(127, ((pk) this).field_t[var4]));
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    L23: {
                      if (var5 != 100) {
                        break L23;
                      } else {
                        ((pk) this).field_t[var4] = da.b(16256, ((pk) this).field_t[var4]) + 16384 - -var6;
                        break L23;
                      }
                    }
                    L24: {
                      if (var5 != 120) {
                        break L24;
                      } else {
                        this.a(var4, 2099140935);
                        break L24;
                      }
                    }
                    L25: {
                      if (var5 == 121) {
                        this.f(var4, -35);
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    L26: {
                      if (var5 != 123) {
                        break L26;
                      } else {
                        this.b(param0 + -32755, var4);
                        break L26;
                      }
                    }
                    L27: {
                      if (var5 == 6) {
                        var7 = ((pk) this).field_t[var4];
                        if (var7 != 16384) {
                          break L27;
                        } else {
                          ((pk) this).field_H[var4] = da.b(-16257, ((pk) this).field_H[var4]) - -(var6 << 1883750791);
                          break L27;
                        }
                      } else {
                        break L27;
                      }
                    }
                    L28: {
                      if (38 == var5) {
                        var7 = ((pk) this).field_t[var4];
                        if (16384 == var7) {
                          ((pk) this).field_H[var4] = da.b(((pk) this).field_H[var4], -128) - -var6;
                          break L28;
                        } else {
                          break L28;
                        }
                      } else {
                        break L28;
                      }
                    }
                    L29: {
                      if (16 == var5) {
                        ((pk) this).field_s[var4] = (var6 << -827374777) + da.b(((pk) this).field_s[var4], -16257);
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                    L30: {
                      if (var5 != 48) {
                        break L30;
                      } else {
                        ((pk) this).field_s[var4] = da.b(((pk) this).field_s[var4], -128) - -var6;
                        break L30;
                      }
                    }
                    L31: {
                      if (var5 != 81) {
                        break L31;
                      } else {
                        L32: {
                          if (var6 < 64) {
                            break L32;
                          } else {
                            ((pk) this).field_l[var4] = ge.a(((pk) this).field_l[var4], 4);
                            if (var8 == 0) {
                              break L31;
                            } else {
                              break L32;
                            }
                          }
                        }
                        this.d(80, var4);
                        ((pk) this).field_l[var4] = da.b(((pk) this).field_l[var4], -5);
                        break L31;
                      }
                    }
                    L33: {
                      if (var5 != 17) {
                        break L33;
                      } else {
                        this.a(true, (((pk) this).field_B[var4] & -16257) - -(var6 << -1881873017), var4);
                        break L33;
                      }
                    }
                    L34: {
                      if (var5 != 49) {
                        break L34;
                      } else {
                        this.a(true, var6 + (-128 & ((pk) this).field_B[var4]), var4);
                        break L34;
                      }
                    }
                    return;
                  } else {
                    if (192 == var3_int) {
                      var4 = param1 & 15;
                      var5 = param1 >> 42990024 & 127;
                      this.a((byte) -88, var4, var5 + ((pk) this).field_N[var4]);
                      return;
                    } else {
                      if (var3_int == 208) {
                        var4 = 15 & param1;
                        var5 = param1 >> 98867432 & 127;
                        this.b(23882, var5, var4);
                        return;
                      } else {
                        if (var3_int == 224) {
                          var4 = param1 & 15;
                          var5 = ((8323429 & param1) >> 1914035497) - -(param1 >> -1773014008 & 127);
                          this.a(var4, (byte) 126, var5);
                          return;
                        } else {
                          var3_int = param1 & 255;
                          if (var3_int != 255) {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            this.b(true, -1);
                            decompiledRegionSelector0 = 0;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                } else {
                  var4 = param1 & 15;
                  var5 = (32755 & param1) >> -1090719960;
                  var6 = 127 & param1 >> 1101935568;
                  this.a(var4, 128, var6, var5);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var3, "pk.M(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void d(int param0) {
        if (param0 >= -44) {
            return;
        }
        try {
            field_D = null;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "pk.T(" + param0 + ')');
        }
    }

    final synchronized void b(byte param0, int param1, int param2) {
        if (param0 <= 14) {
            return;
        }
        try {
            this.c((byte) -79, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "pk.OA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Bounce.field_N;
        try {
          L0: {
            L1: {
              if (param0 < -53) {
                break L1;
              } else {
                ((pk) this).field_y = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (~((pk) this).field_z[param1] != ~param2) {
                  ((pk) this).field_z[param1] = param2;
                  var4_int = 0;
                  L4: while (true) {
                    if (var4_int >= 128) {
                      break L3;
                    } else {
                      ((pk) this).field_O[param1][var4_int] = null;
                      var4_int++;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        if (var5 == 0) {
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
          var4 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var4, "pk.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(kl param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ch var4 = null;
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
              var3_int = (param0.field_x * param0.field_h >> 2082618508) + param0.field_l;
              var3_int = var3_int + (((pk) this).field_H[param0.field_E] * (((pk) this).field_y[param0.field_E] + -8192) >> -1651886196);
              var4 = param0.field_o;
              if (var4.field_c <= 0) {
                break L1;
              } else {
                L2: {
                  if (var4.field_f > 0) {
                    break L2;
                  } else {
                    if (((pk) this).field_E[param0.field_E] > 0) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  var5 = var4.field_f << 101297122;
                  var6 = var4.field_d << -853154655;
                  if (var6 > param0.field_p) {
                    var5 = var5 * param0.field_p / var6;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var5 = var5 + (((pk) this).field_E[param0.field_E] >> 1679881383);
                var7 = Math.sin((double)(param0.field_v & 511) * 0.01227184630308513);
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L1;
              }
            }
            if (param1) {
              L4: {
                var5 = (int)(0.5 + (double)(param0.field_w.field_k * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)e.field_r);
                if (var5 >= 1) {
                  stackOut_20_0 = var5;
                  stackIn_21_0 = stackOut_20_0;
                  break L4;
                } else {
                  stackOut_18_0 = 1;
                  stackIn_21_0 = stackOut_18_0;
                  break L4;
                }
              }
              break L0;
            } else {
              stackOut_15_0 = -85;
              stackIn_16_0 = stackOut_15_0;
              return stackIn_16_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var3;
            stackOut_22_1 = new StringBuilder().append("pk.O(");
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
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
          throw ii.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param1 + ')');
        }
        return stackIn_21_0;
    }

    private final void b(int param0, int param1, int param2) {
        try {
            if (param0 != 23882) {
                ((pk) this).field_A = -99;
            }
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "pk.BA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void f(int param0) {
        try {
            this.a(true, 60);
            if (param0 != -22719) {
                int discarded$0 = this.a((kl) null, false);
            }
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "pk.NA(" + param0 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2) {
        try {
            ((pk) this).field_y[param0] = param2;
            if (param1 < 100) {
                field_D = null;
            }
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "pk.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        kl var5 = null;
        kl var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Bounce.field_N;
        try {
          L0: {
            var5 = ((pk) this).field_C[param0][param1];
            if (null != var5) {
              L1: {
                L2: {
                  ((pk) this).field_C[param0][param1] = null;
                  if (param3 == (2 & ((pk) this).field_l[param0])) {
                    break L2;
                  } else {
                    var6 = (kl) (Object) ((pk) this).field_o.field_m.a((byte) -73);
                    L3: while (true) {
                      L4: {
                        if (null == var6) {
                          break L4;
                        } else {
                          if (var7 != 0) {
                            break L1;
                          } else {
                            L5: {
                              if (var6.field_E != var5.field_E) {
                                break L5;
                              } else {
                                if (0 <= var6.field_C) {
                                  break L5;
                                } else {
                                  if (var6 == var5) {
                                    break L5;
                                  } else {
                                    var5.field_C = 0;
                                    if (var7 == 0) {
                                      break L4;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                            }
                            var6 = (kl) (Object) ((pk) this).field_o.field_m.d((byte) 73);
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
                var5.field_C = 0;
                break L1;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ii.a((Throwable) (Object) runtimeException, "pk.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(kl param0, byte param1, boolean param2) {
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
            if (param1 <= -114) {
              L1: {
                L2: {
                  var4_int = param0.field_w.field_h.length;
                  if (!param2) {
                    break L2;
                  } else {
                    if (!param0.field_w.field_j) {
                      break L2;
                    } else {
                      L3: {
                        var6 = -param0.field_w.field_i + var4_int + var4_int;
                        var5 = (int)((long)((pk) this).field_s[param0.field_E] * (long)var6 >> -1074584314);
                        var4_int = var4_int << 8;
                        if (var4_int > var5) {
                          break L3;
                        } else {
                          param0.field_i.a(true);
                          var5 = -1 + var4_int + (var4_int - var5);
                          break L3;
                        }
                      }
                      if (Bounce.field_N == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var5 = (int)((long)((pk) this).field_s[param0.field_E] * (long)var4_int >> -570725370);
                break L1;
              }
              param0.field_i.g(var5);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) runtimeException;
            stackOut_12_1 = new StringBuilder().append("pk.DA(");
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
          throw ii.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void d(int param0, int param1) {
        kl var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        var4 = Bounce.field_N;
        try {
          L0: {
            L1: {
              L2: {
                if (0 == (4 & ((pk) this).field_l[param1])) {
                  break L2;
                } else {
                  var3 = (kl) (Object) ((pk) this).field_o.field_m.a((byte) -71);
                  L3: while (true) {
                    if (null == var3) {
                      break L2;
                    } else {
                      stackOut_4_0 = var3.field_E;
                      stackOut_4_1 = param1;
                      stackIn_12_0 = stackOut_4_0;
                      stackIn_12_1 = stackOut_4_1;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      if (var4 != 0) {
                        break L1;
                      } else {
                        L4: {
                          if (stackIn_5_0 == stackIn_5_1) {
                            var3.field_u = 0;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var3 = (kl) (Object) ((pk) this).field_o.field_m.d((byte) -40);
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
              stackOut_11_0 = param0;
              stackOut_11_1 = 25;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              break L1;
            }
            L5: {
              if (stackIn_12_0 > stackIn_12_1) {
                break L5;
              } else {
                ((pk) this).field_m = null;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var3_ref, "pk.E(" + param0 + ',' + param1 + ')');
        }
    }

    private final int a(kl param0, byte param1) {
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
              if (param1 == 53) {
                break L1;
              } else {
                ((pk) this).a(-12);
                break L1;
              }
            }
            var3_int = ((pk) this).field_k[param0.field_E];
            if (var3_int < 8192) {
              stackOut_6_0 = var3_int * param0.field_k - -32 >> 573390406;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = -(32 + (16384 - var3_int) * (128 + -param0.field_k) >> 998248230) + 16384;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("pk.I(");
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
          throw ii.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        try {
            if (param1 != 128) {
                ((pk) this).field_I = 110;
            }
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "pk.GA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        ((pk) this).field_B[param2] = param1;
        if (!param0) {
            return;
        }
        try {
            ((pk) this).field_K[param2] = (int)(2097152.0 * Math.pow(2.0, (double)param1 * 0.00054931640625) + 0.5);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "pk.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized boolean a(byte param0, i param1, gk param2, be param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        kj var8 = null;
        int var9 = 0;
        rj var10 = null;
        int var11 = 0;
        int stackIn_5_0 = 0;
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
        int stackOut_4_0 = 0;
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
        var11 = Bounce.field_N;
        try {
          L0: {
            L1: {
              param3.b();
              var6_int = 1;
              var7 = null;
              if (param4 <= 0) {
                break L1;
              } else {
                var7 = (Object) (Object) new int[]{param4};
                break L1;
              }
            }
            var8 = (kj) (Object) param3.field_g.b(0);
            if (param0 <= -89) {
              L2: while (true) {
                L3: {
                  L4: {
                    L5: {
                      if (null == var8) {
                        break L5;
                      } else {
                        var9 = (int)var8.field_d;
                        var10 = (rj) (Object) ((pk) this).field_u.a(124, (long)var9);
                        if (var11 != 0) {
                          break L4;
                        } else {
                          L6: {
                            L7: {
                              if (null == var10) {
                                L8: {
                                  var10 = fj.a(param2, 0, var9);
                                  if (var10 != null) {
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
                                ((pk) this).field_u.a((long)var9, 46, (ai) (Object) var10);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            if (!var10.a((byte) 112, var8.field_h, (int[]) var7, param1)) {
                              var6_int = 0;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          var8 = (kj) (Object) param3.field_g.a(-1);
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
                  param3.a();
                  break L3;
                }
                stackOut_26_0 = var6_int;
                stackIn_27_0 = stackOut_26_0;
                break L0;
              }
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var6;
            stackOut_28_1 = new StringBuilder().append("pk.G(").append(param0).append(',');
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
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');
            stackIn_35_0 = stackOut_32_0;
            stackIn_35_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
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
            if (param3 == null) {
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
          throw ii.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ',' + param4 + ')');
        }
        return stackIn_27_0 != 0;
    }

    final synchronized void g(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 100) {
                break L1;
              } else {
                int discarded$2 = this.a((kl) null, (byte) -18);
                break L1;
              }
            }
            ((pk) this).field_I = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var3, "pk.AA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void f(int param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Bounce.field_N;
        try {
          L0: {
            if (param0 >= 0) {
              L1: {
                ((pk) this).field_J[param0] = 12800;
                ((pk) this).field_k[param0] = 8192;
                ((pk) this).field_q[param0] = 16383;
                if (param1 <= 0) {
                  break L1;
                } else {
                  ((pk) this).field_A = -66;
                  break L1;
                }
              }
              ((pk) this).field_y[param0] = 8192;
              ((pk) this).field_E[param0] = 0;
              ((pk) this).field_m[param0] = 8192;
              this.c(param0, 20974);
              this.d(110, param0);
              ((pk) this).field_l[param0] = 0;
              ((pk) this).field_t[param0] = 32767;
              ((pk) this).field_H[param0] = 256;
              ((pk) this).field_s[param0] = 0;
              this.a(true, 8192, param0);
              break L0;
            } else {
              param0 = 0;
              L2: while (true) {
                L3: {
                  if (param0 >= 16) {
                    break L3;
                  } else {
                    this.f(param0, -15);
                    param0++;
                    if (var4 == 0) {
                      continue L2;
                    } else {
                      break L3;
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
          throw ii.a((Throwable) (Object) var3, "pk.EA(" + param0 + ',' + param1 + ')');
        }
    }

    public pk() {
        ((pk) this).field_M = new int[16];
        ((pk) this).field_t = new int[16];
        ((pk) this).field_H = new int[16];
        ((pk) this).field_O = new kl[16][128];
        ((pk) this).field_k = new int[16];
        ((pk) this).field_q = new int[16];
        ((pk) this).field_n = 1000000;
        ((pk) this).field_K = new int[16];
        ((pk) this).field_z = new int[16];
        ((pk) this).field_I = 256;
        ((pk) this).field_J = new int[16];
        ((pk) this).field_E = new int[16];
        ((pk) this).field_r = new int[16];
        ((pk) this).field_B = new int[16];
        ((pk) this).field_m = new int[16];
        ((pk) this).field_C = new kl[16][128];
        ((pk) this).field_s = new int[16];
        ((pk) this).field_y = new int[16];
        ((pk) this).field_N = new int[16];
        ((pk) this).field_l = new int[16];
        ((pk) this).field_w = new oe();
        ((pk) this).field_o = new ka((pk) this);
        try {
            ((pk) this).field_u = new uk(128);
            this.a(0, 256, -1);
            this.b(true, -1);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "pk.<init>()");
        }
    }

    static {
    }
}
