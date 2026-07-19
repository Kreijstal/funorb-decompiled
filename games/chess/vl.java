/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl extends nm {
    private int[] field_F;
    int[] field_E;
    private qd[][] field_u;
    private int field_w;
    private int[] field_P;
    private int[] field_C;
    private int[] field_q;
    private int[] field_O;
    private int[] field_S;
    private int[] field_n;
    private al field_v;
    private int[] field_x;
    private int[] field_z;
    private int[] field_o;
    private kl field_s;
    private int[] field_p;
    int[] field_r;
    static char[] field_I;
    private qd[][] field_U;
    int[] field_Q;
    private int field_y;
    static lh field_M;
    private int[] field_t;
    private int[] field_R;
    static ed field_A;
    private boolean field_K;
    private long field_J;
    private int field_G;
    private long field_N;
    private mi field_B;
    private int field_T;
    private boolean field_D;
    private int field_H;
    private pf field_W;

    final synchronized void e(int param0) {
        int discarded$0 = 0;
        this.b(param0 ^ -3347, true);
        if (param0 != -3435) {
            qd var3 = (qd) null;
            discarded$0 = this.a(24, (qd) null);
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Chess.field_G;
          if (!this.field_v.e()) {
            break L0;
          } else {
            var2 = this.field_v.field_h * this.field_w / md.field_l;
            L1: while (true) {
              var3 = (long)param0 * (long)var2 + this.field_N;
              if ((this.field_J - var3 ^ -1L) > -1L) {
                var5 = (int)((-1L + (long)var2 + (this.field_J + -this.field_N)) / (long)var2);
                this.field_N = this.field_N + (long)var5 * (long)var2;
                this.field_B.a(var5);
                param0 = param0 - var5;
                this.d(0);
                if (!this.field_v.e()) {
                  break L0;
                } else {
                  continue L1;
                }
              } else {
                this.field_N = var3;
                break L0;
              }
            }
          }
        }
        this.field_B.a(param0);
    }

    final boolean a(byte param0, qd param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
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
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param0 == -25) {
              if (param1.field_j != null) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                if (-1 >= (param1.field_J ^ -1)) {
                  L1: {
                    param1.c(-2193);
                    if (-1 <= (param1.field_A ^ -1)) {
                      break L1;
                    } else {
                      if (this.field_U[param1.field_n][param1.field_A] != param1) {
                        break L1;
                      } else {
                        this.field_U[param1.field_n][param1.field_A] = null;
                        break L1;
                      }
                    }
                  }
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return true;
                }
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("vl.G(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
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
          throw fk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = Chess.field_G;
        if (param0 != this.field_p[param2]) {
            this.field_p[param2] = param0;
            for (var4 = 0; -129 < (var4 ^ -1); var4++) {
                this.field_U[param2][var4] = null;
            }
        }
        if (!param1) {
            int[] var6 = (int[]) null;
            this.a((int[]) null, 120, 45);
        }
    }

    final synchronized boolean d(byte param0) {
        if (param0 >= -123) {
            this.field_J = 63L;
        }
        return this.field_v.e();
    }

    final boolean a(int param0, int param1, int[] param2, int param3, qd param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        dl var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_10_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        var11 = Chess.field_G;
        try {
          L0: {
            L1: {
              param4.field_B = md.field_l / 100;
              if (0 > param4.field_J) {
                break L1;
              } else {
                L2: {
                  if (null == param4.field_j) {
                    break L2;
                  } else {
                    if (param4.field_j.h()) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  param4.c((byte) 124);
                  param4.c(-2193);
                  if (0 >= param4.field_A) {
                    break L3;
                  } else {
                    if (param4 == this.field_U[param4.field_n][param4.field_A]) {
                      this.field_U[param4.field_n][param4.field_A] = null;
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
              var6_int = param4.field_D;
              if (0 < var6_int) {
                L5: {
                  var6_int = var6_int - (int)(16.0 * Math.pow(2.0, 0.0004921259842519685 * (double)this.field_S[param4.field_n]) + 0.5);
                  if (var6_int < 0) {
                    var6_int = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                param4.field_D = var6_int;
                break L4;
              } else {
                break L4;
              }
            }
            param4.field_j.g(this.a(39, param4));
            var7 = param4.field_K;
            if (param0 == 35) {
              L6: {
                var8 = 0;
                param4.field_F = param4.field_F + var7.field_e;
                param4.field_s = param4.field_s + 1;
                var9 = 0.000005086263020833333 * (double)((param4.field_k * param4.field_D >> -1776368532) + (param4.field_C + -60 << 449044392));
                if (-1 > (var7.field_b ^ -1)) {
                  L7: {
                    if (0 < var7.field_i) {
                      param4.field_p = param4.field_p + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_i * var9));
                      break L7;
                    } else {
                      param4.field_p = param4.field_p + 128;
                      break L7;
                    }
                  }
                  if (819200 > param4.field_p * var7.field_b) {
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
                if (var7.field_a == null) {
                  break L8;
                } else {
                  L9: {
                    if (var7.field_l <= 0) {
                      param4.field_y = param4.field_y + 128;
                      break L9;
                    } else {
                      param4.field_y = param4.field_y + (int)(0.5 + Math.pow(2.0, (double)var7.field_l * var9) * 128.0);
                      break L9;
                    }
                  }
                  L10: while (true) {
                    L11: {
                      if (-2 + var7.field_a.length <= param4.field_E) {
                        break L11;
                      } else {
                        if (param4.field_y <= (65280 & var7.field_a[2 + param4.field_E] << -1244566680)) {
                          break L11;
                        } else {
                          param4.field_E = param4.field_E + 2;
                          continue L10;
                        }
                      }
                    }
                    if (param4.field_E != -2 + var7.field_a.length) {
                      break L8;
                    } else {
                      if (-1 == (var7.field_a[1 + param4.field_E] ^ -1)) {
                        var8 = 1;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
              }
              L12: {
                if ((param4.field_J ^ -1) > -1) {
                  break L12;
                } else {
                  if (var7.field_k == null) {
                    break L12;
                  } else {
                    if (-1 == (this.field_Q[param4.field_n] & 1 ^ -1)) {
                      L13: {
                        if (0 > param4.field_A) {
                          break L13;
                        } else {
                          if (this.field_U[param4.field_n][param4.field_A] != param4) {
                            break L13;
                          } else {
                            break L12;
                          }
                        }
                      }
                      L14: {
                        if ((var7.field_d ^ -1) < -1) {
                          param4.field_J = param4.field_J + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_d) * 128.0);
                          break L14;
                        } else {
                          param4.field_J = param4.field_J + 128;
                          break L14;
                        }
                      }
                      L15: while (true) {
                        L16: {
                          if (param4.field_o >= -2 + var7.field_k.length) {
                            break L16;
                          } else {
                            if (param4.field_J <= (65280 & var7.field_k[2 + param4.field_o] << 1620843720)) {
                              break L16;
                            } else {
                              param4.field_o = param4.field_o + 2;
                              continue L15;
                            }
                          }
                        }
                        if (param4.field_o == var7.field_k.length + -2) {
                          var8 = 1;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                    } else {
                      break L12;
                    }
                  }
                }
              }
              if (var8 != 0) {
                L17: {
                  param4.field_j.d(param4.field_B);
                  if (param2 != null) {
                    param4.field_j.a(param2, param3, param1);
                    break L17;
                  } else {
                    param4.field_j.a(param1);
                    break L17;
                  }
                }
                L18: {
                  if (!param4.field_j.g()) {
                    break L18;
                  } else {
                    this.field_B.field_p.a(param4.field_j);
                    break L18;
                  }
                }
                L19: {
                  param4.c((byte) 117);
                  if (param4.field_J < 0) {
                    break L19;
                  } else {
                    param4.c(param0 + -2228);
                    if (0 >= param4.field_A) {
                      break L19;
                    } else {
                      if (param4 != this.field_U[param4.field_n][param4.field_A]) {
                        break L19;
                      } else {
                        this.field_U[param4.field_n][param4.field_A] = null;
                        break L19;
                      }
                    }
                  }
                }
                stackOut_65_0 = 1;
                stackIn_66_0 = stackOut_65_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                param4.field_j.a(param4.field_B, this.a(param4, (byte) -127), this.b(param0 + 1276, param4));
                stackOut_67_0 = 0;
                stackIn_68_0 = stackOut_67_0;
                decompiledRegionSelector0 = 3;
                break L0;
              }
            } else {
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var6 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) (var6);
            stackOut_69_1 = new StringBuilder().append("vl.KA(").append(param0).append(',').append(param1).append(',');
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param2 == null) {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L20;
            } else {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L20;
            }
          }
          L21: {
            stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
            stackOut_72_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',').append(param3).append(',');
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param4 == null) {
              stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L21;
            } else {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L21;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_75_0), stackIn_75_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_19_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_66_0 != 0;
            } else {
              return stackIn_68_0 != 0;
            }
          }
        }
    }

    private final void b(byte param0, int param1) {
        int var4 = 0;
        var4 = Chess.field_G;
        if (param1 < 0) {
          param1 = 0;
          L0: while (true) {
            if ((param1 ^ -1) <= -17) {
              return;
            } else {
              this.b((byte) 80, param1);
              param1++;
              continue L0;
            }
          }
        } else {
          L1: {
            this.field_O[param1] = 12800;
            this.field_o[param1] = 8192;
            this.field_C[param1] = 16383;
            this.field_t[param1] = 8192;
            this.field_P[param1] = 0;
            this.field_S[param1] = 8192;
            this.c(param1, 1);
            this.a(param1, false);
            if (param0 > 63) {
              break L1;
            } else {
              this.field_F = (int[]) null;
              break L1;
            }
          }
          this.field_Q[param1] = 0;
          this.field_x[param1] = 32767;
          this.field_F[param1] = 256;
          this.field_r[param1] = 0;
          this.b(param1, 8192, (byte) 97);
          return;
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        qd var5 = null;
        lm var6 = null;
        int var6_int = 0;
        qd var7 = null;
        qd var8 = null;
        int var9 = 0;
        kf var10 = null;
        kf var11 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        qd stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        qd stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        qd stackIn_18_2 = null;
        int stackIn_18_3 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        qd stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        qd stackOut_17_2 = null;
        int stackOut_17_3 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        qd stackOut_16_2 = null;
        int stackOut_16_3 = 0;
        L0: {
          var9 = Chess.field_G;
          this.c(64, param0, param1, -62);
          if ((this.field_Q[param1] & 2) != 0) {
            var5 = (qd) ((Object) this.field_B.field_x.b(param3 + 50101));
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (var5.field_n != param1) {
                    break L2;
                  } else {
                    if (-1 < (var5.field_J ^ -1)) {
                      this.field_u[param1][var5.field_C] = null;
                      this.field_u[param1][param0] = var5;
                      var6_int = var5.field_z + (var5.field_D * var5.field_k >> -1793919700);
                      var5.field_z = var5.field_z + (-var5.field_C + param0 << -2060286680);
                      var5.field_C = param0;
                      var5.field_k = -var5.field_z + var6_int;
                      var5.field_D = 4096;
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = (qd) ((Object) this.field_B.field_x.a(true));
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        var10 = (kf) ((Object) this.field_s.a(-108, (long)this.field_p[param1]));
        var11 = var10;
        if (var11 != null) {
          var6 = var10.field_s[param0];
          if (var6 == null) {
            return;
          } else {
            L3: {
              var7 = new qd();
              var7.field_q = var11;
              var7.field_H = var6;
              var7.field_n = param1;
              var7.field_K = var10.field_r[param0];
              var7.field_A = var10.field_l[param0];
              var7.field_C = param0;
              var7.field_t = 1024 + var11.field_n * (param2 * param2) * var10.field_k[param0] >> -1238274965;
              var7.field_v = var10.field_q[param0] & 255;
              var7.field_z = -(var10.field_p[param0] & 32767) + (param0 << -576818520);
              var7.field_o = 0;
              var7.field_J = -1;
              var7.field_E = 0;
              var7.field_p = 0;
              var7.field_y = 0;
              if (this.field_r[param1] == 0) {
                var7.field_j = na.a(var6, this.a(83, var7), this.a(var7, (byte) -128), this.b(1311, var7));
                break L3;
              } else {
                L4: {
                  var7.field_j = na.a(var6, this.a(90, var7), 0, this.b(1311, var7));
                  stackOut_15_0 = this;
                  stackOut_15_1 = -109;
                  stackOut_15_2 = (qd) (var7);
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  if (0 <= var10.field_p[param0]) {
                    stackOut_17_0 = this;
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = (qd) ((Object) stackIn_17_2);
                    stackOut_17_3 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    stackIn_18_3 = stackOut_17_3;
                    break L4;
                  } else {
                    stackOut_16_0 = this;
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = (qd) ((Object) stackIn_16_2);
                    stackOut_16_3 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    stackIn_18_3 = stackOut_16_3;
                    break L4;
                  }
                }
                this.a((byte) stackIn_18_1, stackIn_18_2, stackIn_18_3 != 0);
                break L3;
              }
            }
            L5: {
              if (0 > var10.field_p[param0]) {
                var7.field_j.f(-1);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if ((var7.field_A ^ -1) <= -1) {
                L7: {
                  var8 = this.field_U[param1][var7.field_A];
                  if (var8 == null) {
                    break L7;
                  } else {
                    if (var8.field_J >= 0) {
                      break L7;
                    } else {
                      this.field_u[param1][var8.field_C] = null;
                      var8.field_J = 0;
                      break L7;
                    }
                  }
                }
                this.field_U[param1][var7.field_A] = var7;
                break L6;
              } else {
                break L6;
              }
            }
            this.field_B.field_x.a((o) (var7), (byte) -46);
            if (param3 == -21164) {
              this.field_u[param1][param0] = var7;
              return;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(byte param0, qd param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = param1.field_H.field_m.length;
                if (!param2) {
                  break L2;
                } else {
                  if (!param1.field_H.field_o) {
                    break L2;
                  } else {
                    var6 = var4_int + (var4_int + -param1.field_H.field_k);
                    var4_int = var4_int << 8;
                    var5 = (int)((long)this.field_r[param1.field_n] * (long)var6 >> 1715642630);
                    if (var5 >= var4_int) {
                      var5 = -1 + (var4_int + var4_int - var5);
                      param1.field_j.a(true);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var5 = (int)((long)this.field_r[param1.field_n] * (long)var4_int >> 1736311942);
              break L1;
            }
            L3: {
              param1.field_j.e(var5);
              if (param0 <= -63) {
                break L3;
              } else {
                this.field_s = (kl) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4);
            stackOut_9_1 = new StringBuilder().append("vl.D(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
    }

    final synchronized int d() {
        return 0;
    }

    private final void a(int param0, int param1) {
        qd var3 = null;
        int var4 = 0;
        L0: {
          var4 = Chess.field_G;
          if (param1 < -70) {
            break L0;
          } else {
            this.field_w = -126;
            break L0;
          }
        }
        var3 = (qd) ((Object) this.field_B.field_x.g(-18110));
        L1: while (true) {
          if (var3 == null) {
            return;
          } else {
            L2: {
              L3: {
                if (param0 < 0) {
                  break L3;
                } else {
                  if (param0 != var3.field_n) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (var3.field_j == null) {
                  break L4;
                } else {
                  L5: {
                    var3.field_j.d(md.field_l / 100);
                    if (var3.field_j.g()) {
                      this.field_B.field_p.a(var3.field_j);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var3.c((byte) 105);
                  break L4;
                }
              }
              L6: {
                if (0 <= var3.field_J) {
                  break L6;
                } else {
                  this.field_u[var3.field_n][var3.field_C] = null;
                  break L6;
                }
              }
              var3.c(-2193);
              break L2;
            }
            var3 = (qd) ((Object) this.field_B.field_x.a((byte) -108));
            continue L1;
          }
        }
    }

    private final int a(qd param0, byte param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        dl var9 = null;
        dl var10 = null;
        int stackIn_2_0 = 0;
        int stackIn_17_0 = 0;
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
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_1_0 = 0;
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
            if (-1 != (this.field_z[param0.field_n] ^ -1)) {
              L1: {
                var9 = param0.field_K;
                var10 = var9;
                var4 = this.field_O[param0.field_n] * this.field_C[param0.field_n] - -4096 >> 153557613;
                var4 = 16384 + var4 * var4 >> -1696854705;
                var4 = 16384 + param0.field_t * var4 >> 1371648847;
                var4 = var4 * this.field_y + 128 >> -1554458744;
                var4 = this.field_z[param0.field_n] * var4 + 128 >> -437025880;
                if (-1 <= (var10.field_b ^ -1)) {
                  break L1;
                } else {
                  var4 = (int)(0.5 + Math.pow(0.5, (double)var10.field_b * (0.00001953125 * (double)param0.field_p)) * (double)var4);
                  break L1;
                }
              }
              L2: {
                if (var10.field_a != null) {
                  L3: {
                    var5 = param0.field_y;
                    var6 = var10.field_a[1 + param0.field_E];
                    if (param0.field_E >= var10.field_a.length + -2) {
                      break L3;
                    } else {
                      var7 = (255 & var9.field_a[param0.field_E]) << 582887720;
                      var8 = var10.field_a[2 + param0.field_E] << -758717048 & 65280;
                      var6 = var6 + (var10.field_a[3 + param0.field_E] - var6) * (var5 - var7) / (-var7 + var8);
                      break L3;
                    }
                  }
                  var4 = 32 + var4 * var6 >> -1291114778;
                  break L2;
                } else {
                  break L2;
                }
              }
              L4: {
                if (0 >= param0.field_J) {
                  break L4;
                } else {
                  if (var10.field_k == null) {
                    break L4;
                  } else {
                    L5: {
                      var5 = param0.field_J;
                      var6 = var10.field_k[param0.field_o - -1];
                      if (param0.field_o >= var10.field_k.length - 2) {
                        break L5;
                      } else {
                        var7 = var9.field_k[param0.field_o] << 1833098536 & 65280;
                        var8 = 65280 & var10.field_k[param0.field_o - -2] << 2068153064;
                        var6 = var6 + (var5 - var7) * (var10.field_k[param0.field_o + 3] - var6) / (-var7 + var8);
                        break L5;
                      }
                    }
                    var4 = 32 + var4 * var6 >> 585492006;
                    break L4;
                  }
                }
              }
              if (param1 <= -126) {
                stackOut_18_0 = var4;
                stackIn_19_0 = stackOut_18_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_16_0 = 80;
                stackIn_17_0 = stackOut_16_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var3);
            stackOut_20_1 = new StringBuilder().append("vl.Q(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
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
          throw fk.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0;
          } else {
            return stackIn_19_0;
          }
        }
    }

    private final int b(int param0, qd param1) {
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
              if (param0 == 1311) {
                break L1;
              } else {
                this.field_q = (int[]) null;
                break L1;
              }
            }
            var3_int = this.field_o[param1.field_n];
            if (8192 > var3_int) {
              stackOut_5_0 = var3_int * param1.field_v - -32 >> 733021190;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = -(32 + (16384 + -var3_int) * (128 - param1.field_v) >> 1844283782) + 16384;
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
            stackOut_7_1 = new StringBuilder().append("vl.LA(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          throw fk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    private final void a(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = Chess.field_G;
        if (param0) {
            this.a(-1, -109);
        } else {
            this.a((byte) 106, -1);
        }
        this.b((byte) 118, -1);
        if (param1 != -38) {
            return;
        }
        for (var3 = 0; var3 < 16; var3++) {
            this.field_p[var3] = this.field_n[var3];
        }
        int var5 = 0;
        var3 = var5;
        while (var5 < 16) {
            this.field_q[var5] = ce.a(this.field_n[var5], -128);
            var5++;
        }
    }

    final synchronized nm b() {
        return null;
    }

    private final void a(int param0, boolean param1) {
        qd var3 = null;
        int var4 = Chess.field_G;
        if (!(-1 == (this.field_Q[param0] & 4 ^ -1))) {
            var3 = (qd) ((Object) this.field_B.field_x.g(-18110));
            while (var3 != null) {
                if (param0 == var3.field_n) {
                    var3.field_x = 0;
                }
                var3 = (qd) ((Object) this.field_B.field_x.a((byte) -97));
            }
        }
        if (param1) {
            this.field_z = (int[]) null;
        }
    }

    final synchronized boolean a(um param0, int param1, int param2, pf param3, fe param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        td var8 = null;
        int var9 = 0;
        int var11 = 0;
        kf var12 = null;
        kf var13 = null;
        int stackIn_3_0 = 0;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_2_0 = 0;
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
        var11 = Chess.field_G;
        try {
          L0: {
            param3.b();
            if (param1 < -48) {
              L1: {
                var6_int = 1;
                var7 = null;
                if ((param2 ^ -1) >= -1) {
                  break L1;
                } else {
                  var7 = new int[]{param2};
                  break L1;
                }
              }
              var8 = (td) ((Object) param3.field_k.a(true));
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
                  stackOut_19_0 = var6_int;
                  stackIn_20_0 = stackOut_19_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L4: {
                    var9 = (int)var8.field_e;
                    var12 = (kf) ((Object) this.field_s.a(71, (long)var9));
                    if (var12 == null) {
                      var13 = ij.a(-109, var9, param0);
                      if (var13 != null) {
                        this.field_s.a(-128, (long)var9, var13);
                        if (var13.a((int[]) (var7), param4, (byte) -73, var8.field_q)) {
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
                      if (var12.a((int[]) (var7), param4, (byte) -73, var8.field_q)) {
                        break L4;
                      } else {
                        var6_int = 0;
                        var8 = (td) ((Object) param3.field_k.b((byte) 83));
                        continue L2;
                      }
                    }
                  }
                  var8 = (td) ((Object) param3.field_k.b((byte) 83));
                  continue L2;
                }
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var6);
            stackOut_21_1 = new StringBuilder().append("vl.CA(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L5;
            }
          }
          L6: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',');
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
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          L7: {
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
              break L7;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L7;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_20_0 != 0;
        }
    }

    final synchronized void a(boolean param0, pf param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a(true, 2, param1, param0);
              if (param2 > 16) {
                break L1;
              } else {
                this.field_w = 27;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("vl.FA(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    final synchronized void a(int param0, byte param1) {
        if (param1 != -100) {
            return;
        }
        this.field_y = param0;
    }

    private final synchronized void a(boolean param0, int param1, pf param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = Chess.field_G;
        try {
            this.b(param1 + 85, param0);
            this.field_v.a(param2.field_j);
            this.field_K = param3 ? true : false;
            this.field_N = 0L;
            var5_int = this.field_v.c();
            for (var6 = 0; var5_int > var6; var6++) {
                this.field_v.d(var6);
                this.field_v.c(var6);
                this.field_v.b(var6);
            }
            if (param1 != 2) {
                this.field_O = (int[]) null;
            }
            this.field_G = this.field_v.f();
            this.field_T = this.field_v.field_d[this.field_G];
            this.field_J = this.field_v.f(this.field_T);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "vl.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        this.field_n[param2] = param1;
        if (param0 <= 12) {
            return;
        }
        this.field_q[param2] = ce.a(param1, -128);
        this.a(param1, true, param2);
    }

    private final void c(int param0, int param1, int param2, int param3) {
        qd var6 = null;
        int var7 = 0;
        qd var8 = null;
        var7 = Chess.field_G;
        var8 = this.field_u[param2][param1];
        if (var8 != null) {
          L0: {
            if (param3 < -60) {
              break L0;
            } else {
              this.field_B = (mi) null;
              break L0;
            }
          }
          L1: {
            this.field_u[param2][param1] = null;
            if ((2 & this.field_Q[param2]) == 0) {
              var8.field_J = 0;
              break L1;
            } else {
              var6 = (qd) ((Object) this.field_B.field_x.g(-18110));
              L2: while (true) {
                if (var6 == null) {
                  break L1;
                } else {
                  L3: {
                    if (var6.field_n != var8.field_n) {
                      break L3;
                    } else {
                      if (0 <= var6.field_J) {
                        break L3;
                      } else {
                        if (var8 != var6) {
                          var8.field_J = 0;
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  var6 = (qd) ((Object) this.field_B.field_x.a((byte) -116));
                  continue L2;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final synchronized nm a() {
        return (nm) ((Object) this.field_B);
    }

    private final void a(byte param0, int param1) {
        qd var3 = null;
        int var4 = 0;
        L0: {
          var4 = Chess.field_G;
          var3 = (qd) ((Object) this.field_B.field_x.g(-18110));
          if (param0 > 86) {
            break L0;
          } else {
            this.field_E = (int[]) null;
            break L0;
          }
        }
        L1: while (true) {
          if (var3 == null) {
            return;
          } else {
            L2: {
              L3: {
                if (-1 < (param1 ^ -1)) {
                  break L3;
                } else {
                  if (var3.field_n == param1) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              if (-1 >= (var3.field_J ^ -1)) {
                break L2;
              } else {
                this.field_u[var3.field_n][var3.field_C] = null;
                var3.field_J = 0;
                break L2;
              }
            }
            var3 = (qd) ((Object) this.field_B.field_x.a((byte) -102));
            continue L1;
          }
        }
    }

    private final void c(int param0, int param1) {
        qd var3 = null;
        int var4 = 0;
        L0: {
          var4 = Chess.field_G;
          if ((this.field_Q[param0] & 2) != 0) {
            var3 = (qd) ((Object) this.field_B.field_x.g(param1 ^ -18109));
            L1: while (true) {
              if (var3 == null) {
                break L0;
              } else {
                L2: {
                  if (param0 != var3.field_n) {
                    break L2;
                  } else {
                    if (null == this.field_u[param0][var3.field_C]) {
                      if (0 > var3.field_J) {
                        var3.field_J = 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      var3 = (qd) ((Object) this.field_B.field_x.a((byte) -102));
                      continue L1;
                    }
                  }
                }
                var3 = (qd) ((Object) this.field_B.field_x.a((byte) -102));
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        L3: {
          if (param1 == 1) {
            break L3;
          } else {
            this.field_x = (int[]) null;
            break L3;
          }
        }
    }

    private final synchronized void b(int param0, boolean param1) {
        this.field_v.g();
        this.field_W = null;
        this.a(param1, (byte) -38);
        if (param0 < 20) {
            this.field_S = (int[]) null;
        }
    }

    public static void f(int param0) {
        if (param0 != -1) {
            field_A = (ed) null;
        }
        field_I = null;
        field_A = null;
        field_M = null;
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
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
        var8 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (this.field_v.e()) {
                var4_int = this.field_w * this.field_v.field_h / md.field_l;
                L2: while (true) {
                  L3: {
                    var5 = this.field_N - -((long)var4_int * (long)param2);
                    if (-1L >= (this.field_J - var5 ^ -1L)) {
                      this.field_N = var5;
                      break L3;
                    } else {
                      var7 = (int)((-1L + (long)var4_int + this.field_J - this.field_N) / (long)var4_int);
                      this.field_N = this.field_N + (long)var7 * (long)var4_int;
                      this.field_B.a(param0, param1, var7);
                      this.d(0);
                      param2 = param2 - var7;
                      param1 = param1 + var7;
                      if (!this.field_v.e()) {
                        break L3;
                      } else {
                        continue L2;
                      }
                    }
                  }
                  this.field_B.a(param0, param1, param2);
                  break L1;
                }
              } else {
                this.field_B.a(param0, param1, param2);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("vl.A(");
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
          throw fk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void b(int param0, int param1, int param2) {
        this.a(param1 ^ 16279, param0, param2);
        if (param1 != 16383) {
            this.field_t = (int[]) null;
        }
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Chess.field_G;
          var2 = this.field_G;
          var3 = this.field_T;
          var4 = this.field_J;
          if (null == this.field_W) {
            break L0;
          } else {
            if (this.field_H == var3) {
              this.a(this.field_D, param0 + 2, this.field_W, this.field_K);
              this.d(0);
              return;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param0 == 0) {
            break L1;
          } else {
            this.b(93, false);
            break L1;
          }
        }
        L2: while (true) {
          if (var3 != this.field_T) {
            L3: {
              this.field_J = var4;
              this.field_G = var2;
              this.field_T = var3;
              if (this.field_W == null) {
                break L3;
              } else {
                if (this.field_H >= var3) {
                  break L3;
                } else {
                  this.field_G = -1;
                  this.field_T = this.field_H;
                  this.field_J = this.field_v.f(this.field_T);
                  break L3;
                }
              }
            }
            return;
          } else {
            L4: while (true) {
              L5: {
                if (var3 != this.field_v.field_d[var2]) {
                  break L5;
                } else {
                  this.field_v.d(var2);
                  var6 = this.field_v.a(var2);
                  if (1 == var6) {
                    this.field_v.a();
                    this.field_v.b(var2);
                    if (this.field_v.b()) {
                      if (null != this.field_W) {
                        this.a(this.field_K, this.field_W, 91);
                        this.d(0);
                        return;
                      } else {
                        L6: {
                          if (!this.field_K) {
                            break L6;
                          } else {
                            if (var3 != 0) {
                              this.field_v.a(var4);
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        this.a(true, (byte) -38);
                        this.field_v.g();
                        return;
                      }
                    } else {
                      break L5;
                    }
                  } else {
                    L7: {
                      if ((var6 & 128) != 0) {
                        this.b(var6, -112);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    this.field_v.c(var2);
                    this.field_v.b(var2);
                    continue L4;
                  }
                }
              }
              var2 = this.field_v.f();
              var3 = this.field_v.field_d[var2];
              var4 = this.field_v.f(var3);
              continue L2;
            }
          }
        }
    }

    private final void c(int param0, int param1, int param2) {
        if (param0 != 0) {
            this.field_p = (int[]) null;
        }
    }

    private final synchronized void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Chess.field_G;
          if ((param1 ^ -1) <= -1) {
            this.field_z[param1] = param0;
            break L0;
          } else {
            var4 = 0;
            L1: while (true) {
              if (16 <= var4) {
                break L0;
              } else {
                this.field_z[var4] = param0;
                var4++;
                continue L1;
              }
            }
          }
        }
        var4 = 29 % ((param2 - 3) / 58);
    }

    private final void b(int param0, int param1, int param2, int param3) {
        if (param2 != -43) {
            this.field_F = (int[]) null;
        }
    }

    final synchronized void c(byte param0) {
        int var3 = Chess.field_G;
        if (param0 != -61) {
            this.a(124, -34, -70, -107);
        }
        kf var4 = (kf) ((Object) this.field_s.a(true));
        while (var4 != null) {
            var4.e(111);
            var4 = (kf) ((Object) this.field_s.b((byte) 104));
        }
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Chess.field_G;
        var3 = 240 & param0;
        if ((var3 ^ -1) == -129) {
          var4 = 15 & param0;
          var5 = 127 & param0 >> 1680096520;
          var6 = (8350862 & param0) >> -1984003184;
          this.c(var6, var5, var4, -79);
          return;
        } else {
          if (var3 == 144) {
            var4 = param0 & 15;
            var5 = (32547 & param0) >> 43904264;
            var6 = (param0 & 8374890) >> -387249200;
            if ((var6 ^ -1) < -1) {
              this.a(var5, var4, var6, -21164);
              return;
            } else {
              this.c(64, var5, var4, -97);
              return;
            }
          } else {
            if (var3 != 160) {
              if (-177 == (var3 ^ -1)) {
                L0: {
                  var4 = param0 & 15;
                  var5 = param0 >> 1131311752 & 127;
                  var6 = (8377749 & param0) >> 1008285488;
                  if (var5 == 0) {
                    this.field_q[var4] = ce.a(this.field_q[var4], -2080769) - -(var6 << -1841196882);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                L1: {
                  if ((var5 ^ -1) != -33) {
                    break L1;
                  } else {
                    this.field_q[var4] = ce.a(-16257, this.field_q[var4]) - -(var6 << -1402807353);
                    break L1;
                  }
                }
                L2: {
                  if (var5 != 1) {
                    break L2;
                  } else {
                    this.field_P[var4] = ce.a(this.field_P[var4], -16257) + (var6 << 1349946119);
                    break L2;
                  }
                }
                L3: {
                  if (-34 == (var5 ^ -1)) {
                    this.field_P[var4] = ce.a(-128, this.field_P[var4]) + var6;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (-6 == (var5 ^ -1)) {
                    this.field_S[var4] = ce.a(-16257, this.field_S[var4]) + (var6 << 1371005479);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (37 != var5) {
                    break L5;
                  } else {
                    this.field_S[var4] = var6 + ce.a(-128, this.field_S[var4]);
                    break L5;
                  }
                }
                L6: {
                  if (var5 != 7) {
                    break L6;
                  } else {
                    this.field_O[var4] = (var6 << 393148359) + ce.a(-16257, this.field_O[var4]);
                    break L6;
                  }
                }
                L7: {
                  if (39 != var5) {
                    break L7;
                  } else {
                    this.field_O[var4] = var6 + ce.a(-128, this.field_O[var4]);
                    break L7;
                  }
                }
                L8: {
                  if ((var5 ^ -1) == -11) {
                    this.field_o[var4] = (var6 << 1723495271) + ce.a(-16257, this.field_o[var4]);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if ((var5 ^ -1) != -43) {
                    break L9;
                  } else {
                    this.field_o[var4] = ce.a(-128, this.field_o[var4]) + var6;
                    break L9;
                  }
                }
                L10: {
                  if (11 != var5) {
                    break L10;
                  } else {
                    this.field_C[var4] = ce.a(-16257, this.field_C[var4]) - -(var6 << -1970007001);
                    break L10;
                  }
                }
                L11: {
                  if (-44 != (var5 ^ -1)) {
                    break L11;
                  } else {
                    this.field_C[var4] = var6 + ce.a(-128, this.field_C[var4]);
                    break L11;
                  }
                }
                L12: {
                  if ((var5 ^ -1) == -65) {
                    if (var6 < 64) {
                      this.field_Q[var4] = ce.a(this.field_Q[var4], -2);
                      break L12;
                    } else {
                      this.field_Q[var4] = s.a(this.field_Q[var4], 1);
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
                    if (-65 >= (var6 ^ -1)) {
                      this.field_Q[var4] = s.a(this.field_Q[var4], 2);
                      break L13;
                    } else {
                      this.c(var4, 1);
                      this.field_Q[var4] = ce.a(this.field_Q[var4], -3);
                      break L13;
                    }
                  }
                }
                L14: {
                  if ((var5 ^ -1) == -100) {
                    this.field_x[var4] = (var6 << -809254393) + ce.a(this.field_x[var4], 127);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (-99 != (var5 ^ -1)) {
                    break L15;
                  } else {
                    this.field_x[var4] = var6 + ce.a(this.field_x[var4], 16256);
                    break L15;
                  }
                }
                L16: {
                  if (-102 != (var5 ^ -1)) {
                    break L16;
                  } else {
                    this.field_x[var4] = (var6 << 24942951) + 16384 - -ce.a(this.field_x[var4], 127);
                    break L16;
                  }
                }
                L17: {
                  if (-101 == (var5 ^ -1)) {
                    this.field_x[var4] = ce.a(16256, this.field_x[var4]) + 16384 + var6;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (var5 != 120) {
                    break L18;
                  } else {
                    this.a(var4, -82);
                    break L18;
                  }
                }
                L19: {
                  if ((var5 ^ -1) != -122) {
                    break L19;
                  } else {
                    this.b((byte) 91, var4);
                    break L19;
                  }
                }
                L20: {
                  if ((var5 ^ -1) == -124) {
                    this.a((byte) 92, var4);
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (6 == var5) {
                    var7 = this.field_x[var4];
                    if ((var7 ^ -1) == -16385) {
                      this.field_F[var4] = (var6 << 947519719) + ce.a(this.field_F[var4], -16257);
                      break L21;
                    } else {
                      break L21;
                    }
                  } else {
                    break L21;
                  }
                }
                L22: {
                  if (var5 != 38) {
                    break L22;
                  } else {
                    var7 = this.field_x[var4];
                    if (var7 == 16384) {
                      this.field_F[var4] = ce.a(-128, this.field_F[var4]) + var6;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                }
                L23: {
                  if (-17 == (var5 ^ -1)) {
                    this.field_r[var4] = (var6 << 940380007) + ce.a(-16257, this.field_r[var4]);
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if ((var5 ^ -1) != -49) {
                    break L24;
                  } else {
                    this.field_r[var4] = ce.a(this.field_r[var4], -128) - -var6;
                    break L24;
                  }
                }
                L25: {
                  if (-82 != (var5 ^ -1)) {
                    break L25;
                  } else {
                    if (-65 < (var6 ^ -1)) {
                      this.a(var4, false);
                      this.field_Q[var4] = ce.a(this.field_Q[var4], -5);
                      break L25;
                    } else {
                      this.field_Q[var4] = s.a(this.field_Q[var4], 4);
                      break L25;
                    }
                  }
                }
                L26: {
                  if (17 != var5) {
                    break L26;
                  } else {
                    this.b(var4, (this.field_R[var4] & -16257) - -(var6 << 1305170087), (byte) 97);
                    break L26;
                  }
                }
                L27: {
                  if (-50 == (var5 ^ -1)) {
                    this.b(var4, var6 + (this.field_R[var4] & -128), (byte) 118);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                return;
              } else {
                L28: {
                  if (param1 <= -39) {
                    break L28;
                  } else {
                    this.field_u = (qd[][]) null;
                    break L28;
                  }
                }
                if ((var3 ^ -1) == -193) {
                  var4 = 15 & param0;
                  var5 = 127 & param0 >> 258930344;
                  this.a(this.field_q[var4] + var5, true, var4);
                  return;
                } else {
                  if (208 == var3) {
                    var4 = param0 & 15;
                    var5 = (32703 & param0) >> 1048115752;
                    this.c(0, var5, var4);
                    return;
                  } else {
                    if (224 != var3) {
                      var3 = 255 & param0;
                      if (-256 != (var3 ^ -1)) {
                        return;
                      } else {
                        this.a(true, (byte) -38);
                        return;
                      }
                    } else {
                      var4 = 15 & param0;
                      var5 = (param0 >> 1258685896 & 127) + ((8323141 & param0) >> 1767437065);
                      this.a(var5, (byte) 103, var4);
                      return;
                    }
                  }
                }
              }
            } else {
              var4 = param0 & 15;
              var5 = (param0 & 32713) >> -1989848792;
              var6 = (param0 & 8328847) >> 886418128;
              this.b(var5, var6, -43, var4);
              return;
            }
          }
        }
    }

    private final int a(int param0, qd param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        dl var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_2_0 = 0;
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
        int stackOut_1_0 = 0;
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
            var3_int = param1.field_z + (param1.field_D * param1.field_k >> -206402740);
            var3_int = var3_int + (this.field_F[param1.field_n] * (this.field_t[param1.field_n] + -8192) >> 1322240076);
            var4 = param1.field_K;
            if (param0 >= 33) {
              L1: {
                if (var4.field_e <= 0) {
                  break L1;
                } else {
                  L2: {
                    if (-1 > (var4.field_g ^ -1)) {
                      break L2;
                    } else {
                      if (this.field_P[param1.field_n] <= 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    var5 = var4.field_g << 194907522;
                    var6 = var4.field_f << -146289183;
                    if (param1.field_s < var6) {
                      var5 = var5 * param1.field_s / var6;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var5 = var5 + (this.field_P[param1.field_n] >> 280582951);
                  var7 = Math.sin((double)(511 & param1.field_F) * 0.01227184630308513);
                  var3_int = var3_int + (int)((double)var5 * var7);
                  break L1;
                }
              }
              L4: {
                var5 = (int)((double)(256 * param1.field_H.field_n) * Math.pow(2.0, (double)var3_int * 0.0003255208333333333) / (double)md.field_l + 0.5);
                if (1 > var5) {
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
              stackOut_1_0 = 98;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3);
            stackOut_15_1 = new StringBuilder().append("vl.H(").append(param0).append(',');
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
          throw fk.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_14_0;
        }
    }

    private final void a(int param0, byte param1, int param2) {
        if (param1 < 69) {
            this.b(127, false);
        }
        this.field_t[param2] = param0;
    }

    final static void a(p param0, ln param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ln stackIn_7_0 = null;
        ln stackIn_8_0 = null;
        ln stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        ln stackIn_10_0 = null;
        ln stackIn_11_0 = null;
        ln stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        ln stackIn_13_0 = null;
        ln stackIn_14_0 = null;
        ln stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        ln stackIn_16_0 = null;
        ln stackIn_17_0 = null;
        ln stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        ln stackIn_19_0 = null;
        ln stackIn_20_0 = null;
        ln stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        ln stackIn_22_0 = null;
        ln stackIn_23_0 = null;
        ln stackIn_24_0 = null;
        ln stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ln stackOut_6_0 = null;
        ln stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        ln stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        ln stackOut_9_0 = null;
        ln stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        ln stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        ln stackOut_12_0 = null;
        ln stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        ln stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        ln stackOut_15_0 = null;
        ln stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        ln stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        ln stackOut_18_0 = null;
        ln stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        ln stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        ln stackOut_21_0 = null;
        ln stackOut_22_0 = null;
        ln stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        ln stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var9 = Chess.field_G;
        try {
          L0: {
            if (param3 >= 86) {
              L1: {
                if (param2) {
                  param1.field_Xb = param0.i(-108);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                param1.field_hc = param0.i(-111);
                param1.field_ic = param0.i(-99);
                var4_int = param0.i(-93);
                stackOut_6_0 = (ln) (param1);
                stackIn_8_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (-1 == (var4_int & 128 ^ -1)) {
                  stackOut_8_0 = (ln) ((Object) stackIn_8_0);
                  stackOut_8_1 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  break L2;
                } else {
                  stackOut_7_0 = (ln) ((Object) stackIn_7_0);
                  stackOut_7_1 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  break L2;
                }
              }
              L3: {
                stackIn_9_0.field_Yb = stackIn_9_1 != 0;
                stackOut_9_0 = (ln) (param1);
                stackIn_11_0 = stackOut_9_0;
                stackIn_10_0 = stackOut_9_0;
                if ((8 & var4_int) == 0) {
                  stackOut_11_0 = (ln) ((Object) stackIn_11_0);
                  stackOut_11_1 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  break L3;
                } else {
                  stackOut_10_0 = (ln) ((Object) stackIn_10_0);
                  stackOut_10_1 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  break L3;
                }
              }
              L4: {
                stackIn_12_0.field_ac = stackIn_12_1 != 0;
                stackOut_12_0 = (ln) (param1);
                stackIn_14_0 = stackOut_12_0;
                stackIn_13_0 = stackOut_12_0;
                if (-1 == (32 & var4_int ^ -1)) {
                  stackOut_14_0 = (ln) ((Object) stackIn_14_0);
                  stackOut_14_1 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  break L4;
                } else {
                  stackOut_13_0 = (ln) ((Object) stackIn_13_0);
                  stackOut_13_1 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  break L4;
                }
              }
              L5: {
                stackIn_15_0.field_lc = stackIn_15_1 != 0;
                stackOut_15_0 = (ln) (param1);
                stackIn_17_0 = stackOut_15_0;
                stackIn_16_0 = stackOut_15_0;
                if (0 == (64 & var4_int)) {
                  stackOut_17_0 = (ln) ((Object) stackIn_17_0);
                  stackOut_17_1 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  break L5;
                } else {
                  stackOut_16_0 = (ln) ((Object) stackIn_16_0);
                  stackOut_16_1 = 1;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  break L5;
                }
              }
              L6: {
                stackIn_18_0.field_Vb = stackIn_18_1 != 0;
                stackOut_18_0 = (ln) (param1);
                stackIn_20_0 = stackOut_18_0;
                stackIn_19_0 = stackOut_18_0;
                if (-1 == (var4_int & 16 ^ -1)) {
                  stackOut_20_0 = (ln) ((Object) stackIn_20_0);
                  stackOut_20_1 = 1;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  break L6;
                } else {
                  stackOut_19_0 = (ln) ((Object) stackIn_19_0);
                  stackOut_19_1 = 2;
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  break L6;
                }
              }
              L7: {
                L8: {
                  stackIn_21_0.field_Mb = stackIn_21_1;
                  stackOut_21_0 = (ln) (param1);
                  stackIn_24_0 = stackOut_21_0;
                  stackIn_22_0 = stackOut_21_0;
                  if (!param1.field_Yb) {
                    break L8;
                  } else {
                    stackOut_22_0 = (ln) ((Object) stackIn_22_0);
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_23_0 = stackOut_22_0;
                    if (param1.field_Xb >= param1.field_hc) {
                      break L8;
                    } else {
                      stackOut_23_0 = (ln) ((Object) stackIn_23_0);
                      stackOut_23_1 = 1;
                      stackIn_25_0 = stackOut_23_0;
                      stackIn_25_1 = stackOut_23_1;
                      break L7;
                    }
                  }
                }
                stackOut_24_0 = (ln) ((Object) stackIn_24_0);
                stackOut_24_1 = 0;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                break L7;
              }
              L9: {
                stackIn_25_0.field_Pb = stackIn_25_1 != 0;
                if (-1 == (var4_int & 4 ^ -1)) {
                  stackOut_27_0 = 0;
                  stackIn_28_0 = stackOut_27_0;
                  break L9;
                } else {
                  stackOut_26_0 = 1;
                  stackIn_28_0 = stackOut_26_0;
                  break L9;
                }
              }
              L10: {
                var5 = stackIn_28_0;
                if (0 == (2 & var4_int)) {
                  stackOut_30_0 = 0;
                  stackIn_31_0 = stackOut_30_0;
                  break L10;
                } else {
                  stackOut_29_0 = 1;
                  stackIn_31_0 = stackOut_29_0;
                  break L10;
                }
              }
              L11: {
                var6 = stackIn_31_0;
                param0.a(param1.field_sc.length, (byte) 125, param1.field_sc, 0);
                param1.field_Ub = param0.f(674914976);
                param1.field_Jb = ud.a(2) - (long)param0.e((byte) -104);
                if (var5 == 0) {
                  param1.field_pc = -1;
                  break L11;
                } else {
                  param1.field_pc = param0.e((byte) -110);
                  break L11;
                }
              }
              L12: {
                param1.field_Fb = param0.d((byte) -50);
                var7 = param0.field_l;
                param1.field_Gb = param0.d(0);
                if (var6 == 0) {
                  param1.field_ec = null;
                  break L12;
                } else {
                  param0.field_l = var7;
                  param1.field_ec = new String[param1.field_Xb];
                  var8 = 0;
                  L13: while (true) {
                    if (param1.field_Xb <= var8) {
                      break L12;
                    } else {
                      param1.field_ec[var8] = param0.d(0);
                      var8++;
                      continue L13;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var4 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) (var4);
            stackOut_40_1 = new StringBuilder().append("vl.F(");
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param0 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L14;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L14;
            }
          }
          L15: {
            stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
            stackOut_43_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_43_2).append(',');
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param1 == null) {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L15;
            } else {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L15;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void b(int param0, int param1, byte param2) {
        this.field_R[param0] = param1;
        this.field_E[param0] = (int)(0.5 + 2097152.0 * Math.pow(2.0, 0.00054931640625 * (double)param1));
        if (param2 < 89) {
            this.field_w = 105;
        }
    }

    public vl() {
        this.field_F = new int[16];
        this.field_u = new qd[16][128];
        this.field_q = new int[16];
        this.field_O = new int[16];
        this.field_E = new int[16];
        this.field_x = new int[16];
        this.field_P = new int[16];
        this.field_n = new int[16];
        this.field_r = new int[16];
        this.field_w = 1000000;
        this.field_C = new int[16];
        this.field_z = new int[16];
        this.field_p = new int[16];
        this.field_o = new int[16];
        this.field_S = new int[16];
        this.field_U = new qd[16][128];
        this.field_y = 256;
        this.field_Q = new int[16];
        this.field_R = new int[16];
        this.field_t = new int[16];
        this.field_v = new al();
        this.field_B = new mi((vl) (this));
        this.field_s = new kl(128);
        this.a(256, -1, (byte) -101);
        this.a(true, (byte) -38);
    }

    static {
        field_I = new char[]{(char)91, (char)93, (char)35};
    }
}
