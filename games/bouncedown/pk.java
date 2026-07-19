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
        int var4 = -30 % ((-7 - param0) / 62);
        this.field_M[param2] = param1;
        this.field_N[param2] = da.b(param1, -128);
        this.a((byte) -82, param2, param1);
    }

    final synchronized void a(be param0, boolean param1, int param2) {
        try {
            if (param2 < 49) {
                this.field_N = (int[]) null;
            }
            this.a(param0, true, param1, true);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "pk.IA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized int b() {
        return 0;
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var8 = Bounce.field_N;
        try {
          L0: {
            L1: {
              L2: {
                if (!this.field_w.d()) {
                  break L2;
                } else {
                  var4_int = this.field_w.field_b * this.field_n / e.field_r;
                  L3: while (true) {
                    L4: {
                      var5 = (long)param2 * (long)var4_int + this.field_P;
                      if (0L > -var5 + this.field_L) {
                        break L4;
                      } else {
                        this.field_P = var5;
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
                    var7 = (int)(((long)var4_int + (this.field_L - this.field_P + -1L)) / (long)var4_int);
                    this.field_P = this.field_P + (long)var7 * (long)var4_int;
                    this.field_o.a(param0, param1, var7);
                    param2 = param2 - var7;
                    param1 = param1 + var7;
                    this.b((byte) -126);
                    if (!this.field_w.d()) {
                      break L2;
                    } else {
                      if (var8 == 0) {
                        continue L3;
                      } else {
                        this.field_o.a(param0, param1, param2);
                        break L1;
                      }
                    }
                  }
                }
              }
              this.field_o.a(param0, param1, param2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("pk.P(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(String param0, String param1, int param2) {
        try {
            if (null != nk.field_a) {
                nk.field_a.a(true);
            }
            if (param2 >= -1) {
                field_D = (gk) null;
            }
            vk.field_c = new ci(param1, param0, false, true, true);
            ed.field_c.a(10768, vk.field_c);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "pk.FA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final synchronized void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            var5 = Bounce.field_N;
            if (param2 < param0) {
              break L1;
            } else {
              this.field_r[param2] = param1;
              if (var5 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var4 = 0;
          L2: while (true) {
            if (16 <= var4) {
              break L0;
            } else {
              this.field_r[var4] = param1;
              var4++;
              if (var5 != 0) {
                break L0;
              } else {
                if (var5 == 0) {
                  continue L2;
                } else {
                  break L0;
                }
              }
            }
          }
        }
    }

    private final int b(kl param0, byte param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ch var9 = null;
        ch var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
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
        int stackOut_5_0 = 0;
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
            if (0 == this.field_r[param0.field_E]) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var9 = param0.field_o;
              var10 = var9;
              var4 = this.field_J[param0.field_E] * this.field_q[param0.field_E] - -4096 >> 1003688141;
              var4 = var4 * var4 + 16384 >> 1502530639;
              if (param1 == 68) {
                L1: {
                  var4 = param0.field_n * var4 - -16384 >> -652439665;
                  var4 = 128 + this.field_I * var4 >> -998520088;
                  var4 = this.field_r[param0.field_E] * var4 + 128 >> -71231768;
                  if (-1 > (var10.field_k ^ -1)) {
                    var4 = (int)(0.5 + (double)var4 * Math.pow(0.5, 0.00001953125 * (double)param0.field_A * (double)var10.field_k));
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (null == var10.field_e) {
                    break L2;
                  } else {
                    L3: {
                      var5 = param0.field_q;
                      var6 = var10.field_e[1 + param0.field_s];
                      if (param0.field_s >= -2 + var10.field_e.length) {
                        break L3;
                      } else {
                        var7 = 65280 & var9.field_e[param0.field_s] << -198655576;
                        var8 = (255 & var10.field_e[2 + param0.field_s]) << -1194683800;
                        var6 = var6 + (var5 - var7) * (var10.field_e[3 + param0.field_s] - var6) / (var8 + -var7);
                        break L3;
                      }
                    }
                    var4 = var4 * var6 + 32 >> -1405606906;
                    break L2;
                  }
                }
                L4: {
                  if (-1 <= (param0.field_C ^ -1)) {
                    break L4;
                  } else {
                    if (null != var10.field_i) {
                      L5: {
                        var5 = param0.field_C;
                        var6 = var10.field_i[param0.field_y - -1];
                        if (param0.field_y < -2 + var10.field_i.length) {
                          var7 = (255 & var9.field_i[param0.field_y]) << -900150424;
                          var8 = (255 & var10.field_i[2 + param0.field_y]) << -901534328;
                          var6 = var6 + (-var6 + var10.field_i[param0.field_y - -3]) * (var5 + -var7) / (-var7 + var8);
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
                stackOut_21_0 = var4;
                stackIn_22_0 = stackOut_21_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_5_0 = -77;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var3);
            stackOut_23_1 = new StringBuilder().append("pk.D(");
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
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_22_0;
          }
        }
    }

    private final synchronized void a(be param0, boolean param1, boolean param2, boolean param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        be var8 = null;
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
        var7 = Bounce.field_N;
        try {
          L0: {
            L1: {
              this.a(param1, 104);
              this.field_w.a(param0.field_h);
              this.field_P = 0L;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param2) {
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
              ((pk) (this)).field_F = stackIn_4_1 != 0;
              var5_int = this.field_w.e();
              if (param3) {
                break L2;
              } else {
                var8 = (be) null;
                this.a((be) null, true, -97);
                break L2;
              }
            }
            var6 = 0;
            L3: while (true) {
              L4: {
                if (var6 >= var5_int) {
                  this.field_p = this.field_w.c();
                  this.field_A = this.field_w.field_d[this.field_p];
                  this.field_L = this.field_w.f(this.field_A);
                  break L4;
                } else {
                  this.field_w.e(var6);
                  this.field_w.a(var6);
                  this.field_w.c(var6);
                  var6++;
                  if (var7 != 0) {
                    break L4;
                  } else {
                    continue L3;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5);
            stackOut_13_1 = new StringBuilder().append("pk.H(");
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
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void b(int param0, int param1) {
        kl var3 = null;
        int var4 = 0;
        L0: {
          var4 = Bounce.field_N;
          var3 = (kl) ((Object) this.field_o.field_m.a((byte) -102));
          if (param0 == 0) {
            break L0;
          } else {
            this.field_t = (int[]) null;
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            if (var3 == null) {
              break L2;
            } else {
              if (var4 != 0) {
                break L2;
              } else {
                L3: {
                  L4: {
                    if (param1 < 0) {
                      break L4;
                    } else {
                      if (param1 == var3.field_E) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (0 > var3.field_C) {
                    this.field_C[var3.field_E][var3.field_r] = null;
                    var3.field_C = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var3 = (kl) ((Object) this.field_o.field_m.d((byte) -46));
                if (var4 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          return;
        }
    }

    final boolean a(kl param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (param0.field_i != null) {
              L1: {
                if (param1 == 8335400) {
                  break L1;
                } else {
                  this.field_E = (int[]) null;
                  break L1;
                }
              }
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              decompiledRegionSelector0 = 1;
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
                    if (param0 == this.field_O[param0.field_E][param0.field_z]) {
                      this.field_O[param0.field_E][param0.field_z] = null;
                      break L2;
                    } else {
                      return true;
                    }
                  }
                }
              }
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("pk.U(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    private final synchronized void a(boolean param0, int param1) {
        this.field_w.b();
        if (param1 < 18) {
            this.field_I = -90;
        }
        this.field_v = null;
        this.b(param0, -1);
    }

    private final void c(int param0, int param1) {
        wf discarded$2 = null;
        kl var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        L0: {
          L1: {
            var4 = Bounce.field_N;
            if ((2 & this.field_l[param0]) != 0) {
              var3 = (kl) ((Object) this.field_o.field_m.a((byte) -67));
              L2: while (true) {
                if (var3 == null) {
                  break L1;
                } else {
                  stackOut_4_0 = var3.field_E;
                  stackOut_4_1 = param0;
                  stackIn_13_0 = stackOut_4_0;
                  stackIn_13_1 = stackOut_4_1;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  if (var4 != 0) {
                    break L0;
                  } else {
                    L3: {
                      if (stackIn_5_0 != stackIn_5_1) {
                        break L3;
                      } else {
                        if (this.field_C[param0][var3.field_r] == null) {
                          if ((var3.field_C ^ -1) > -1) {
                            var3.field_C = 0;
                            break L3;
                          } else {
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                    var3 = (kl) ((Object) this.field_o.field_m.d((byte) 123));
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
          stackOut_12_0 = param1;
          stackOut_12_1 = 20974;
          stackIn_13_0 = stackOut_12_0;
          stackIn_13_1 = stackOut_12_1;
          break L0;
        }
        L4: {
          if (stackIn_13_0 == stackIn_13_1) {
            break L4;
          } else {
            discarded$2 = this.c();
            break L4;
          }
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
        int stackIn_10_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_72_0 = 0;
        int stackIn_74_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_71_0 = 0;
        int stackOut_73_0 = 0;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
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
                  if ((param3.field_z ^ -1) >= -1) {
                    break L3;
                  } else {
                    if (param3 == this.field_O[param3.field_E][param3.field_z]) {
                      this.field_O[param3.field_E][param3.field_z] = null;
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
              var7 = param3.field_x;
              if (-1 <= (var7 ^ -1)) {
                break L4;
              } else {
                L5: {
                  var7 = var7 - (int)(16.0 * Math.pow(2.0, (double)this.field_m[param3.field_E] * 0.0004921259842519685) + 0.5);
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
                if ((var8.field_k * param3.field_A ^ -1) <= -819201) {
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
                        stackOut_31_0 = param3.field_q ^ -1;
                        stackOut_31_1 = 65280 & var8.field_e[param3.field_s - -2] << 1377025672 ^ -1;
                        stackIn_36_0 = stackOut_31_0;
                        stackIn_36_1 = stackOut_31_1;
                        stackIn_32_0 = stackOut_31_0;
                        stackIn_32_1 = stackOut_31_1;
                        if (var12 != 0) {
                          break L13;
                        } else {
                          if (stackIn_32_0 >= stackIn_32_1) {
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
                    stackOut_35_0 = param3.field_s;
                    stackOut_35_1 = -2 + var8.field_e.length;
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    break L13;
                  }
                  if (stackIn_36_0 != stackIn_36_1) {
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
                  if ((this.field_l[param3.field_E] & 1) != 0) {
                    break L15;
                  } else {
                    L16: {
                      if ((param3.field_z ^ -1) > -1) {
                        break L16;
                      } else {
                        if (this.field_O[param3.field_E][param3.field_z] != param3) {
                          break L16;
                        } else {
                          break L15;
                        }
                      }
                    }
                    L17: {
                      L18: {
                        if (-1 > (var8.field_b ^ -1)) {
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
                          if (var8.field_i.length + -2 <= param3.field_y) {
                            break L21;
                          } else {
                            stackOut_51_0 = var8.field_i[2 + param3.field_y] << -360204376 & 65280;
                            stackOut_51_1 = param3.field_C;
                            stackIn_56_0 = stackOut_51_0;
                            stackIn_56_1 = stackOut_51_1;
                            stackIn_52_0 = stackOut_51_0;
                            stackIn_52_1 = stackOut_51_1;
                            if (var12 != 0) {
                              break L20;
                            } else {
                              if (stackIn_52_0 >= stackIn_52_1) {
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
                        stackOut_55_0 = var8.field_i.length - 2;
                        stackOut_55_1 = param3.field_y;
                        stackIn_56_0 = stackOut_55_0;
                        stackIn_56_1 = stackOut_55_1;
                        break L20;
                      }
                      if (stackIn_56_0 != stackIn_56_1) {
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
                  this.field_o.field_l.a(param3.field_i);
                  break L24;
                }
              }
              L25: {
                param3.d(0);
                if (-1 < (param3.field_C ^ -1)) {
                  break L25;
                } else {
                  param3.c(2);
                  if (0 >= param3.field_z) {
                    break L25;
                  } else {
                    if (this.field_O[param3.field_E][param3.field_z] == param3) {
                      this.field_O[param3.field_E][param3.field_z] = null;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                }
              }
              stackOut_71_0 = 1;
              stackIn_72_0 = stackOut_71_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              param3.field_i.a(param3.field_j, this.b(param3, (byte) 68), this.a(param3, (byte) 53));
              stackOut_73_0 = 0;
              stackIn_74_0 = stackOut_73_0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var6 = decompiledCaughtException;
            stackOut_75_0 = (RuntimeException) (var6);
            stackOut_75_1 = new StringBuilder().append("pk.LA(");
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param0 == null) {
              stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L26;
            } else {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
              break L26;
            }
          }
          L27: {
            stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
            stackOut_78_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param3 == null) {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L27;
            } else {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L27;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_72_0 != 0;
          } else {
            return stackIn_74_0 != 0;
          }
        }
    }

    final static void a(byte param0, String param1) {
        try {
            int var2_int = 57 / ((param0 - -73) / 52);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "pk.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = Bounce.field_N;
            if (this.field_w.d()) {
              var2 = this.field_n * this.field_w.field_b / e.field_r;
              L2: while (true) {
                L3: {
                  var3 = (long)var2 * (long)param0 + this.field_P;
                  if (-1L >= (-var3 + this.field_L ^ -1L)) {
                    this.field_P = var3;
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
                  var5 = (int)((-1L + ((long)var2 + (-this.field_P + this.field_L))) / (long)var2);
                  this.field_P = this.field_P + (long)var5 * (long)var2;
                  this.field_o.a(var5);
                  param0 = param0 - var5;
                  this.b((byte) -123);
                  if (this.field_w.d()) {
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
                  this.field_o.a(param0);
                  break L0;
                }
              }
            } else {
              break L1;
            }
          }
          this.field_o.a(param0);
          break L0;
        }
    }

    final synchronized wf c() {
        return null;
    }

    private final void b(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Bounce.field_N;
          if (!param0) {
            this.b(0, -1);
            if (var4 == 0) {
              break L0;
            } else {
              this.a(-1, 2099140935);
              break L0;
            }
          } else {
            this.a(-1, 2099140935);
            break L0;
          }
        }
        this.f(param1, -66);
        var3 = 0;
        L1: while (true) {
          L2: {
            if (var3 >= 16) {
              var3 = 0;
              break L2;
            } else {
              this.field_z[var3] = this.field_M[var3];
              var3++;
              if (var4 != 0) {
                break L2;
              } else {
                continue L1;
              }
            }
          }
          L3: while (true) {
            L4: {
              if ((var3 ^ -1) <= -17) {
                break L4;
              } else {
                this.field_N[var3] = da.b(this.field_M[var3], -128);
                var3++;
                if (var4 != 0) {
                  break L4;
                } else {
                  if (var4 == 0) {
                    continue L3;
                  } else {
                    break L4;
                  }
                }
              }
            }
            return;
          }
        }
    }

    private final void a(int param0, int param1) {
        kl var3 = null;
        int var4 = 0;
        L0: {
          var4 = Bounce.field_N;
          var3 = (kl) ((Object) this.field_o.field_m.a((byte) -49));
          if (param1 == 2099140935) {
            break L0;
          } else {
            this.f(75);
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            if (var3 == null) {
              break L2;
            } else {
              if (var4 != 0) {
                break L2;
              } else {
                L3: {
                  L4: {
                    if (param0 < 0) {
                      break L4;
                    } else {
                      if (param0 != var3.field_E) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (null != var3.field_i) {
                      L6: {
                        var3.field_i.i(e.field_r / 100);
                        if (var3.field_i.k()) {
                          this.field_o.field_l.a(var3.field_i);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var3.d(0);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L7: {
                    if (0 > var3.field_C) {
                      this.field_C[var3.field_E][var3.field_r] = null;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var3.c(2);
                  break L3;
                }
                var3 = (kl) ((Object) this.field_o.field_m.d((byte) 75));
                if (var4 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          return;
        }
    }

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        L0: {
          var7 = Bounce.field_N;
          var2 = this.field_p;
          var3 = this.field_A;
          if (param0 <= -41) {
            break L0;
          } else {
            this.field_H = (int[]) null;
            break L0;
          }
        }
        L1: {
          var4 = this.field_L;
          if (null == this.field_v) {
            break L1;
          } else {
            if (this.field_G != var3) {
              break L1;
            } else {
              this.a(this.field_v, this.field_x, this.field_F, true);
              this.b((byte) -108);
              return;
            }
          }
        }
        L2: while (true) {
          if (this.field_A == var3) {
            L3: while (true) {
              stackOut_13_0 = this.field_w.field_d[var2];
              stackOut_13_1 = var3;
              stackIn_18_0 = stackOut_13_0;
              stackIn_18_1 = stackOut_13_1;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              if (var7 == 0) {
                L4: {
                  if (stackIn_18_0 != stackIn_18_1) {
                    break L4;
                  } else {
                    this.field_w.e(var2);
                    var6 = this.field_w.d(var2);
                    if ((var6 ^ -1) != -2) {
                      L5: {
                        if ((var6 & 128) == 0) {
                          break L5;
                        } else {
                          this.e(32755, var6);
                          break L5;
                        }
                      }
                      this.field_w.a(var2);
                      this.field_w.c(var2);
                      continue L3;
                    } else {
                      this.field_w.f();
                      this.field_w.c(var2);
                      if (!this.field_w.a()) {
                        break L4;
                      } else {
                        if (this.field_v == null) {
                          L6: {
                            if (!this.field_F) {
                              break L6;
                            } else {
                              if (var3 != 0) {
                                this.field_w.a(var4);
                                if (var7 == 0) {
                                  break L4;
                                } else {
                                  break L6;
                                }
                              } else {
                                break L6;
                              }
                            }
                          }
                          this.b(true, -1);
                          this.field_w.b();
                          return;
                        } else {
                          this.a(this.field_v, this.field_F, 71);
                          this.b((byte) -126);
                          return;
                        }
                      }
                    }
                  }
                }
                var2 = this.field_w.c();
                var3 = this.field_w.field_d[var2];
                var4 = this.field_w.f(var3);
                if (var7 == 0) {
                  continue L2;
                } else {
                  L7: {
                    this.field_L = var4;
                    this.field_A = var3;
                    this.field_p = var2;
                    if (this.field_v == null) {
                      break L7;
                    } else {
                      stackOut_33_0 = var3 ^ -1;
                      stackOut_33_1 = this.field_G ^ -1;
                      stackIn_34_0 = stackOut_33_0;
                      stackIn_34_1 = stackOut_33_1;
                      if (stackIn_34_0 < stackIn_34_1) {
                        this.field_A = this.field_G;
                        this.field_p = -1;
                        this.field_L = this.field_w.f(this.field_A);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  return;
                }
              } else {
                L8: {
                  if (stackIn_14_0 < stackIn_14_1) {
                    this.field_A = this.field_G;
                    this.field_p = -1;
                    this.field_L = this.field_w.f(this.field_A);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                return;
              }
            }
          } else {
            L9: {
              this.field_L = var4;
              this.field_A = var3;
              this.field_p = var2;
              if (this.field_v == null) {
                break L9;
              } else {
                stackOut_8_0 = var3 ^ -1;
                stackOut_8_1 = this.field_G ^ -1;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                if (stackIn_9_0 < stackIn_9_1) {
                  this.field_A = this.field_G;
                  this.field_p = -1;
                  this.field_L = this.field_w.f(this.field_A);
                  break L9;
                } else {
                  break L9;
                }
              }
            }
            return;
          }
        }
    }

    final synchronized void e(int param0) {
        int var3 = 0;
        rj var4 = null;
        L0: {
          var3 = Bounce.field_N;
          if (param0 == 16) {
            break L0;
          } else {
            this.field_E = (int[]) null;
            break L0;
          }
        }
        var4 = (rj) ((Object) this.field_u.b(0));
        L1: while (true) {
          L2: {
            if (var4 == null) {
              break L2;
            } else {
              var4.e(125);
              var4 = (rj) ((Object) this.field_u.a(-1));
              if (var3 != 0) {
                break L2;
              } else {
                if (var3 == 0) {
                  continue L1;
                } else {
                  break L2;
                }
              }
            }
          }
          return;
        }
    }

    final synchronized wf d() {
        return (wf) ((Object) this.field_o);
    }

    private final void a(boolean param0, int param1, int param2, int param3) {
        kl var5 = null;
        ue var6 = null;
        int var6_int = 0;
        kl var7 = null;
        kl var8 = null;
        int var9 = 0;
        rj var10 = null;
        rj var11 = null;
        kl stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_21_0 = null;
        kl stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        Object stackIn_22_0 = null;
        kl stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        Object stackIn_23_0 = null;
        kl stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        kl stackOut_3_0 = null;
        ai stackOut_8_0 = null;
        Object stackOut_20_0 = null;
        kl stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        Object stackOut_22_0 = null;
        kl stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        Object stackOut_21_0 = null;
        kl stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        L0: {
          L1: {
            var9 = Bounce.field_N;
            this.b(param3, param2, 64, 0);
            if ((this.field_l[param3] & 2) == 0) {
              break L1;
            } else {
              var5 = (kl) ((Object) this.field_o.field_m.b((byte) 60));
              L2: while (true) {
                if (var5 == null) {
                  break L1;
                } else {
                  stackOut_3_0 = (kl) (var5);
                  stackIn_9_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var9 != 0) {
                    break L0;
                  } else {
                    L3: {
                      if (stackIn_4_0.field_E != param3) {
                        break L3;
                      } else {
                        if (-1 >= (var5.field_C ^ -1)) {
                          break L3;
                        } else {
                          this.field_C[param3][var5.field_r] = null;
                          this.field_C[param3][param2] = var5;
                          var6_int = var5.field_l + (var5.field_h * var5.field_x >> -1208436);
                          var5.field_l = var5.field_l + (-var5.field_r + param2 << 371026280);
                          var5.field_x = 4096;
                          var5.field_r = param2;
                          var5.field_h = var6_int + -var5.field_l;
                          return;
                        }
                      }
                    }
                    var5 = (kl) ((Object) this.field_o.field_m.a(-18158));
                    if (var9 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          stackOut_8_0 = this.field_u.a(48, (long)this.field_z[param3]);
          stackIn_9_0 = stackOut_8_0;
          break L0;
        }
        var10 = (rj) ((Object) stackIn_9_0);
        var11 = var10;
        if (var11 == null) {
          return;
        } else {
          var6 = var10.field_k[param2];
          if (var6 == null) {
            return;
          } else {
            L4: {
              var7 = new kl();
              var7.field_E = param3;
              var7.field_D = var11;
              var7.field_w = var6;
              var7.field_o = var10.field_l[param2];
              var7.field_z = var10.field_i[param2];
              var7.field_r = param2;
              var7.field_n = var11.field_m * (param1 * param1 * var10.field_o[param2]) + 1024 >> 2054891467;
              var7.field_k = 255 & var10.field_r[param2];
              var7.field_l = (param2 << 131797000) - (32767 & var10.field_n[param2]);
              var7.field_s = 0;
              var7.field_y = 0;
              var7.field_q = 0;
              var7.field_C = -1;
              var7.field_A = 0;
              if (param0) {
                break L4;
              } else {
                pk.d(-32);
                break L4;
              }
            }
            L5: {
              L6: {
                if (this.field_s[param3] != 0) {
                  break L6;
                } else {
                  var7.field_i = pi.a(var6, this.a(var7, true), this.b(var7, (byte) 68), this.a(var7, (byte) 53));
                  if (var9 == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                var7.field_i = pi.a(var6, this.a(var7, true), 0, this.a(var7, (byte) 53));
                stackOut_20_0 = this;
                stackOut_20_1 = (kl) (var7);
                stackOut_20_2 = -117;
                stackIn_22_0 = stackOut_20_0;
                stackIn_22_1 = stackOut_20_1;
                stackIn_22_2 = stackOut_20_2;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                stackIn_21_2 = stackOut_20_2;
                if (var10.field_n[param2] >= 0) {
                  stackOut_22_0 = this;
                  stackOut_22_1 = (kl) ((Object) stackIn_22_1);
                  stackOut_22_2 = stackIn_22_2;
                  stackOut_22_3 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  stackIn_23_2 = stackOut_22_2;
                  stackIn_23_3 = stackOut_22_3;
                  break L7;
                } else {
                  stackOut_21_0 = this;
                  stackOut_21_1 = (kl) ((Object) stackIn_21_1);
                  stackOut_21_2 = stackIn_21_2;
                  stackOut_21_3 = 1;
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_23_2 = stackOut_21_2;
                  stackIn_23_3 = stackOut_21_3;
                  break L7;
                }
              }
              this.a(stackIn_23_1, (byte) stackIn_23_2, stackIn_23_3 != 0);
              break L5;
            }
            L8: {
              if ((var10.field_n[param2] ^ -1) <= -1) {
                break L8;
              } else {
                var7.field_i.f(-1);
                break L8;
              }
            }
            L9: {
              if ((var7.field_z ^ -1) <= -1) {
                L10: {
                  var8 = this.field_O[param3][var7.field_z];
                  if (var8 == null) {
                    break L10;
                  } else {
                    if ((var8.field_C ^ -1) > -1) {
                      this.field_C[param3][var8.field_r] = null;
                      var8.field_C = 0;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                }
                this.field_O[param3][var7.field_z] = var7;
                break L9;
              } else {
                break L9;
              }
            }
            this.field_o.field_m.a(1, var7);
            this.field_C[param3][param2] = var7;
            return;
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
        L0: {
          var8 = Bounce.field_N;
          var3 = param1 & 240;
          if (param0 == 32755) {
            break L0;
          } else {
            this.field_A = -20;
            break L0;
          }
        }
        if (128 == var3) {
          var4 = 15 & param1;
          var5 = (32542 & param1) >> 1014988296;
          var6 = (param1 & 8374679) >> 610185072;
          this.b(var4, var5, var6, 0);
          return;
        } else {
          if (144 == var3) {
            var4 = 15 & param1;
            var5 = param1 >> 679392520 & 127;
            var6 = (8335400 & param1) >> 753720336;
            if (-1 > (var6 ^ -1)) {
              this.a(true, var6, var5, var4);
              if (var8 != 0) {
                this.b(var4, var5, 64, 0);
                return;
              } else {
                return;
              }
            } else {
              this.b(var4, var5, 64, 0);
              return;
            }
          } else {
            if ((var3 ^ -1) != -161) {
              if ((var3 ^ -1) == -177) {
                L1: {
                  var4 = 15 & param1;
                  var5 = 127 & param1 >> 504944168;
                  var6 = (param1 & 8377708) >> 1842372400;
                  if (0 == var5) {
                    this.field_N[var4] = (var6 << -1169215698) + da.b(-2080769, this.field_N[var4]);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (var5 == 32) {
                    this.field_N[var4] = da.b(-16257, this.field_N[var4]) + (var6 << -405302041);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (1 != var5) {
                    break L3;
                  } else {
                    this.field_E[var4] = (var6 << 2099140935) + da.b(this.field_E[var4], -16257);
                    break L3;
                  }
                }
                L4: {
                  if ((var5 ^ -1) == -34) {
                    this.field_E[var4] = da.b(-128, this.field_E[var4]) + var6;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (-6 == (var5 ^ -1)) {
                    this.field_m[var4] = (var6 << -58902585) + da.b(-16257, this.field_m[var4]);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if ((var5 ^ -1) == -38) {
                    this.field_m[var4] = var6 + da.b(this.field_m[var4], -128);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (7 == var5) {
                    this.field_J[var4] = (var6 << -26275353) + da.b(-16257, this.field_J[var4]);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (var5 == 39) {
                    this.field_J[var4] = var6 + da.b(this.field_J[var4], -128);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if ((var5 ^ -1) == -11) {
                    this.field_k[var4] = (var6 << 39334631) + da.b(this.field_k[var4], -16257);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (var5 == 42) {
                    this.field_k[var4] = var6 + da.b(this.field_k[var4], -128);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if ((var5 ^ -1) != -12) {
                    break L11;
                  } else {
                    this.field_q[var4] = (var6 << -1624875833) + da.b(-16257, this.field_q[var4]);
                    break L11;
                  }
                }
                L12: {
                  if ((var5 ^ -1) == -44) {
                    this.field_q[var4] = da.b(-128, this.field_q[var4]) + var6;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (var5 != 64) {
                    break L13;
                  } else {
                    L14: {
                      if ((var6 ^ -1) > -65) {
                        break L14;
                      } else {
                        this.field_l[var4] = ge.a(this.field_l[var4], 1);
                        if (var8 == 0) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    this.field_l[var4] = da.b(this.field_l[var4], -2);
                    break L13;
                  }
                }
                L15: {
                  if (65 == var5) {
                    L16: {
                      if (-65 < (var6 ^ -1)) {
                        break L16;
                      } else {
                        this.field_l[var4] = ge.a(this.field_l[var4], 2);
                        if (var8 == 0) {
                          break L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                    this.c(var4, 20974);
                    this.field_l[var4] = da.b(this.field_l[var4], -3);
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L17: {
                  if (-100 == (var5 ^ -1)) {
                    this.field_t[var4] = (var6 << 1190482407) + da.b(127, this.field_t[var4]);
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (-99 != (var5 ^ -1)) {
                    break L18;
                  } else {
                    this.field_t[var4] = da.b(16256, this.field_t[var4]) + var6;
                    break L18;
                  }
                }
                L19: {
                  if (101 == var5) {
                    this.field_t[var4] = (var6 << -1339647609) + (16384 - -da.b(127, this.field_t[var4]));
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if (-101 != (var5 ^ -1)) {
                    break L20;
                  } else {
                    this.field_t[var4] = da.b(16256, this.field_t[var4]) + 16384 - -var6;
                    break L20;
                  }
                }
                L21: {
                  if (var5 != 120) {
                    break L21;
                  } else {
                    this.a(var4, 2099140935);
                    break L21;
                  }
                }
                L22: {
                  if (-122 == (var5 ^ -1)) {
                    this.f(var4, -35);
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (var5 != 123) {
                    break L23;
                  } else {
                    this.b(param0 + -32755, var4);
                    break L23;
                  }
                }
                L24: {
                  if (-7 == (var5 ^ -1)) {
                    var7 = this.field_t[var4];
                    if (-16385 != (var7 ^ -1)) {
                      break L24;
                    } else {
                      this.field_H[var4] = da.b(-16257, this.field_H[var4]) - -(var6 << 1883750791);
                      break L24;
                    }
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (38 == var5) {
                    var7 = this.field_t[var4];
                    if (16384 == var7) {
                      this.field_H[var4] = da.b(this.field_H[var4], -128) - -var6;
                      break L25;
                    } else {
                      break L25;
                    }
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (16 == var5) {
                    this.field_s[var4] = (var6 << -827374777) + da.b(this.field_s[var4], -16257);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (var5 != 48) {
                    break L27;
                  } else {
                    this.field_s[var4] = da.b(this.field_s[var4], -128) - -var6;
                    break L27;
                  }
                }
                L28: {
                  if (-82 != (var5 ^ -1)) {
                    break L28;
                  } else {
                    L29: {
                      if (var6 < 64) {
                        break L29;
                      } else {
                        this.field_l[var4] = ge.a(this.field_l[var4], 4);
                        if (var8 == 0) {
                          break L28;
                        } else {
                          break L29;
                        }
                      }
                    }
                    this.d(80, var4);
                    this.field_l[var4] = da.b(this.field_l[var4], -5);
                    break L28;
                  }
                }
                L30: {
                  if (-18 != (var5 ^ -1)) {
                    break L30;
                  } else {
                    this.a(true, (this.field_B[var4] & -16257) - -(var6 << -1881873017), var4);
                    break L30;
                  }
                }
                if (var5 == 49) {
                  this.a(true, var6 + (-128 & this.field_B[var4]), var4);
                  return;
                } else {
                  return;
                }
              } else {
                if (192 == var3) {
                  var4 = param1 & 15;
                  var5 = param1 >> 42990024 & 127;
                  this.a((byte) -88, var4, var5 + this.field_N[var4]);
                  return;
                } else {
                  if ((var3 ^ -1) == -209) {
                    var4 = 15 & param1;
                    var5 = param1 >> 98867432 & 127;
                    this.b(23882, var5, var4);
                    return;
                  } else {
                    if (var3 == 224) {
                      var4 = param1 & 15;
                      var5 = ((8323429 & param1) >> 1914035497) - -(param1 >> -1773014008 & 127);
                      this.a(var4, (byte) 126, var5);
                      return;
                    } else {
                      var3 = param1 & 255;
                      if (-256 == (var3 ^ -1)) {
                        this.b(true, -1);
                        return;
                      } else {
                        return;
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

    public static void d(int param0) {
        if (param0 >= -44) {
            return;
        }
        field_D = null;
    }

    final synchronized void b(byte param0, int param1, int param2) {
        if (param0 <= 14) {
            return;
        }
        this.c((byte) -79, param1, param2);
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Bounce.field_N;
          if (param0 < -53) {
            break L0;
          } else {
            this.field_y = (int[]) null;
            break L0;
          }
        }
        L1: {
          if (this.field_z[param1] != param2) {
            this.field_z[param1] = param2;
            var4 = 0;
            L2: while (true) {
              if ((var4 ^ -1) <= -129) {
                break L1;
              } else {
                this.field_O[param1][var4] = null;
                var4++;
                if (var5 != 0) {
                  break L1;
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
    }

    private final int a(kl param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ch var4 = null;
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
              var3_int = (param0.field_x * param0.field_h >> 2082618508) + param0.field_l;
              var3_int = var3_int + (this.field_H[param0.field_E] * (this.field_y[param0.field_E] + -8192) >> -1651886196);
              var4 = param0.field_o;
              if (-1 <= (var4.field_c ^ -1)) {
                break L1;
              } else {
                L2: {
                  if ((var4.field_f ^ -1) < -1) {
                    break L2;
                  } else {
                    if (this.field_E[param0.field_E] > 0) {
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
                var5 = var5 + (this.field_E[param0.field_E] >> 1679881383);
                var7 = Math.sin((double)(param0.field_v & 511) * 0.01227184630308513);
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L1;
              }
            }
            if (param1) {
              L4: {
                var5 = (int)(0.5 + (double)(param0.field_w.field_k * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)e.field_r);
                if (var5 >= 1) {
                  stackOut_13_0 = var5;
                  stackIn_14_0 = stackOut_13_0;
                  break L4;
                } else {
                  stackOut_12_0 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  break L4;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_9_0 = -85;
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
            stackOut_15_1 = new StringBuilder().append("pk.O(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
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
          throw ii.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_14_0;
        }
    }

    private final void b(int param0, int param1, int param2) {
        if (param0 != 23882) {
            this.field_A = -99;
        }
    }

    final synchronized void f(int param0) {
        int discarded$0 = 0;
        this.a(true, 60);
        if (param0 != -22719) {
            kl var3 = (kl) null;
            discarded$0 = this.a((kl) null, false);
        }
    }

    private final void a(int param0, byte param1, int param2) {
        this.field_y[param0] = param2;
        if (param1 < 100) {
            field_D = (gk) null;
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        kl var6 = null;
        int var7 = 0;
        kl var8 = null;
        var7 = Bounce.field_N;
        var8 = this.field_C[param0][param1];
        if (var8 == null) {
          return;
        } else {
          L0: {
            L1: {
              this.field_C[param0][param1] = null;
              if (param3 == (2 & this.field_l[param0])) {
                break L1;
              } else {
                var6 = (kl) ((Object) this.field_o.field_m.a((byte) -73));
                L2: while (true) {
                  L3: {
                    if (var6 == null) {
                      break L3;
                    } else {
                      if (var7 != 0) {
                        break L0;
                      } else {
                        L4: {
                          if (var6.field_E != var8.field_E) {
                            break L4;
                          } else {
                            if (0 <= var6.field_C) {
                              break L4;
                            } else {
                              if (var6 == var8) {
                                break L4;
                              } else {
                                var8.field_C = 0;
                                if (var7 == 0) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                        var6 = (kl) ((Object) this.field_o.field_m.d((byte) 73));
                        if (var7 == 0) {
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (var7 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            var8.field_C = 0;
            break L0;
          }
          return;
        }
    }

    final void a(kl param0, byte param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
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
                        var5 = (int)((long)this.field_s[param0.field_E] * (long)var6 >> -1074584314);
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
                var5 = (int)((long)this.field_s[param0.field_E] * (long)var4_int >> -570725370);
                break L1;
              }
              param0.field_i.g(var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (runtimeException);
            stackOut_10_1 = new StringBuilder().append("pk.DA(");
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
          throw ii.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void d(int param0, int param1) {
        kl var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        L0: {
          L1: {
            var4 = Bounce.field_N;
            if (0 == (4 & this.field_l[param1])) {
              break L1;
            } else {
              var3 = (kl) ((Object) this.field_o.field_m.a((byte) -71));
              L2: while (true) {
                if (var3 == null) {
                  break L1;
                } else {
                  stackOut_3_0 = var3.field_E;
                  stackOut_3_1 = param1;
                  stackIn_9_0 = stackOut_3_0;
                  stackIn_9_1 = stackOut_3_1;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  if (var4 != 0) {
                    break L0;
                  } else {
                    L3: {
                      if (stackIn_4_0 == stackIn_4_1) {
                        var3.field_u = 0;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var3 = (kl) ((Object) this.field_o.field_m.d((byte) -40));
                    if (var4 == 0) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          stackOut_8_0 = param0;
          stackOut_8_1 = 25;
          stackIn_9_0 = stackOut_8_0;
          stackIn_9_1 = stackOut_8_1;
          break L0;
        }
        L4: {
          if (stackIn_9_0 > stackIn_9_1) {
            break L4;
          } else {
            this.field_m = (int[]) null;
            break L4;
          }
        }
    }

    private final int a(kl param0, byte param1) {
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
              if (param1 == 53) {
                break L1;
              } else {
                this.a(-12);
                break L1;
              }
            }
            var3_int = this.field_k[param0.field_E];
            if (var3_int < 8192) {
              stackOut_5_0 = var3_int * param0.field_k - -32 >> 573390406;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = -(32 + (16384 - var3_int) * (128 + -param0.field_k) >> 998248230) + 16384;
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
            stackOut_7_1 = new StringBuilder().append("pk.I(");
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
          throw ii.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        if (param1 != 128) {
            this.field_I = 110;
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        this.field_B[param2] = param1;
        if (!param0) {
          return;
        } else {
          this.field_K[param2] = (int)(2097152.0 * Math.pow(2.0, (double)param1 * 0.00054931640625) + 0.5);
          return;
        }
    }

    final synchronized boolean a(byte param0, i param1, gk param2, be param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        kj var8 = null;
        int var9 = 0;
        int var11 = 0;
        rj var12 = null;
        rj var13 = null;
        int stackIn_5_0 = 0;
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
        int stackOut_4_0 = 0;
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
                var7 = new int[]{param4};
                break L1;
              }
            }
            var8 = (kj) ((Object) param3.field_g.b(0));
            if (param0 <= -89) {
              L2: while (true) {
                L3: {
                  L4: {
                    L5: {
                      if (var8 == null) {
                        break L5;
                      } else {
                        var9 = (int)var8.field_d;
                        var12 = (rj) ((Object) this.field_u.a(124, (long)var9));
                        if (var11 != 0) {
                          break L4;
                        } else {
                          L6: {
                            L7: {
                              if (var12 == null) {
                                L8: {
                                  var13 = fj.a(param2, 0, var9);
                                  if (var13 != null) {
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
                                this.field_u.a((long)var9, 46, var13);
                                if (!var13.a((byte) 112, var8.field_h, (int[]) (var7), param1)) {
                                  break L7;
                                } else {
                                  break L6;
                                }
                              } else {
                                if (!var12.a((byte) 112, var8.field_h, (int[]) (var7), param1)) {
                                  break L7;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var6_int = 0;
                            break L6;
                          }
                          var8 = (kj) ((Object) param3.field_g.a(-1));
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
                stackOut_20_0 = var6_int;
                stackIn_21_0 = stackOut_20_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var6);
            stackOut_22_1 = new StringBuilder().append("pk.G(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          L10: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          L11: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L11;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_21_0 != 0;
        }
    }

    final synchronized void g(int param0, int param1) {
        int discarded$0 = 0;
        if (param1 != 100) {
            kl var4 = (kl) null;
            discarded$0 = this.a((kl) null, (byte) -18);
        }
        this.field_I = param0;
    }

    private final void f(int param0, int param1) {
        int var4 = 0;
        var4 = Bounce.field_N;
        if (-1 < (param0 ^ -1)) {
          param0 = 0;
          L0: while (true) {
            if ((param0 ^ -1) > -17) {
              this.f(param0, -15);
              param0++;
              if (var4 == 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L1: {
            this.field_J[param0] = 12800;
            this.field_k[param0] = 8192;
            this.field_q[param0] = 16383;
            if (param1 <= 0) {
              break L1;
            } else {
              this.field_A = -66;
              break L1;
            }
          }
          this.field_y[param0] = 8192;
          this.field_E[param0] = 0;
          this.field_m[param0] = 8192;
          this.c(param0, 20974);
          this.d(110, param0);
          this.field_l[param0] = 0;
          this.field_t[param0] = 32767;
          this.field_H[param0] = 256;
          this.field_s[param0] = 0;
          this.a(true, 8192, param0);
          return;
        }
    }

    public pk() {
        this.field_M = new int[16];
        this.field_t = new int[16];
        this.field_H = new int[16];
        this.field_O = new kl[16][128];
        this.field_k = new int[16];
        this.field_q = new int[16];
        this.field_n = 1000000;
        this.field_K = new int[16];
        this.field_z = new int[16];
        this.field_I = 256;
        this.field_J = new int[16];
        this.field_E = new int[16];
        this.field_r = new int[16];
        this.field_B = new int[16];
        this.field_m = new int[16];
        this.field_C = new kl[16][128];
        this.field_s = new int[16];
        this.field_y = new int[16];
        this.field_N = new int[16];
        this.field_l = new int[16];
        this.field_w = new oe();
        this.field_o = new ka((pk) (this));
        this.field_u = new uk(128);
        this.a(0, 256, -1);
        this.b(true, -1);
    }

    static {
    }
}
