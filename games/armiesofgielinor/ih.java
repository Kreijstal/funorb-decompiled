/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ih extends hn {
    private dw field_q;
    private int[] field_u;
    static int[] field_E;
    static nj field_H;
    private mi[][] field_I;
    int[] field_s;
    private int[] field_F;
    private bg field_T;
    private int[] field_P;
    private mi[][] field_M;
    private int[] field_C;
    private int field_v;
    private int field_U;
    private int[] field_A;
    static rg field_p;
    private int[] field_V;
    private static byte[] field_G;
    private int[] field_r;
    private int[] field_D;
    private int[] field_x;
    int[] field_o;
    int[] field_W;
    private int[] field_N;
    private int[] field_O;
    static String field_R;
    private int[] field_w;
    private int[] field_J;
    static int field_ab;
    static String field_X;
    private long field_z;
    private int field_K;
    private int field_t;
    private boolean field_Z;
    private long field_Y;
    private os field_Q;
    private boolean field_y;
    private um field_B;
    private int field_L;

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = this.field_K;
          var3 = this.field_t;
          var4 = this.field_Y;
          if (null == this.field_B) {
            break L0;
          } else {
            if (var3 != this.field_L) {
              break L0;
            } else {
              this.a(this.field_Z, (byte) -90, this.field_y, this.field_B);
              this.a((byte) 36);
              return;
            }
          }
        }
        L1: {
          if (param0 == 36) {
            break L1;
          } else {
            this.field_Y = -103L;
            break L1;
          }
        }
        L2: while (true) {
          stackOut_5_0 = var3 ^ -1;
          stackOut_5_1 = this.field_t ^ -1;
          stackIn_6_0 = stackOut_5_0;
          stackIn_6_1 = stackOut_5_1;
          L3: while (true) {
            L4: {
              L5: {
                L6: {
                  if (stackIn_6_0 != stackIn_6_1) {
                    break L6;
                  } else {
                    L7: while (true) {
                      stackOut_7_0 = var3;
                      stackOut_7_1 = this.field_q.field_i[var2];
                      stackIn_28_0 = stackOut_7_0;
                      stackIn_28_1 = stackOut_7_1;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      if (var7 != 0) {
                        break L5;
                      } else {
                        L8: {
                          if (stackIn_8_0 != stackIn_8_1) {
                            break L8;
                          } else {
                            this.field_q.d(var2);
                            var6 = this.field_q.c(var2);
                            stackOut_9_0 = var6;
                            stackOut_9_1 = 1;
                            stackIn_6_0 = stackOut_9_0;
                            stackIn_6_1 = stackOut_9_1;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            if (var7 != 0) {
                              continue L3;
                            } else {
                              if (stackIn_10_0 == stackIn_10_1) {
                                L9: {
                                  this.field_q.a();
                                  this.field_q.a(var2);
                                  if (this.field_q.b()) {
                                    break L9;
                                  } else {
                                    if (var7 == 0) {
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                if (null == this.field_B) {
                                  L10: {
                                    if (!this.field_Z) {
                                      break L10;
                                    } else {
                                      if (var3 == 0) {
                                        break L10;
                                      } else {
                                        this.field_q.a(var4);
                                        if (var7 == 0) {
                                          break L8;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                  }
                                  this.a(true, true);
                                  this.field_q.f();
                                  return;
                                } else {
                                  this.a(param0 + -34, this.field_Z, this.field_B);
                                  this.a((byte) 36);
                                  return;
                                }
                              } else {
                                L11: {
                                  if (0 == (var6 & 128)) {
                                    break L11;
                                  } else {
                                    this.a((byte) 127, var6);
                                    break L11;
                                  }
                                }
                                this.field_q.f(var2);
                                this.field_q.a(var2);
                                if (var7 == 0) {
                                  continue L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                        var2 = this.field_q.e();
                        var3 = this.field_q.field_i[var2];
                        var4 = this.field_q.b(var3);
                        if (var7 == 0) {
                          continue L2;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
                this.field_Y = var4;
                this.field_K = var2;
                this.field_t = var3;
                if (this.field_B == null) {
                  break L4;
                } else {
                  stackOut_27_0 = this.field_L ^ -1;
                  stackOut_27_1 = var3 ^ -1;
                  stackIn_28_0 = stackOut_27_0;
                  stackIn_28_1 = stackOut_27_1;
                  break L5;
                }
              }
              if (stackIn_28_0 > stackIn_28_1) {
                this.field_t = this.field_L;
                this.field_K = -1;
                this.field_Y = this.field_q.b(this.field_t);
                break L4;
              } else {
                break L4;
              }
            }
            return;
          }
        }
    }

    private final int a(byte param0, mi param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        fq var9 = null;
        fq var10 = null;
        int stackIn_3_0 = 0;
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
        int stackOut_2_0 = 0;
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
            if (this.field_w[param1.field_m] == 0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var9 = param1.field_v;
                var10 = var9;
                var4 = this.field_A[param1.field_m] * this.field_N[param1.field_m] + 4096 >> 502408429;
                if (param0 == -110) {
                  break L1;
                } else {
                  this.a(102, (byte) -86);
                  break L1;
                }
              }
              L2: {
                var4 = 16384 + var4 * var4 >> 213302575;
                var4 = param1.field_u * var4 + 16384 >> -526523825;
                var4 = 128 + var4 * this.field_v >> 182833000;
                var4 = var4 * this.field_w[param1.field_m] - -128 >> 1581713032;
                if (0 < var10.field_d) {
                  var4 = (int)(0.5 + Math.pow(0.5, 0.00001953125 * (double)param1.field_o * (double)var10.field_d) * (double)var4);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var10.field_l != null) {
                  L4: {
                    var5 = param1.field_s;
                    var6 = var10.field_l[param1.field_A - -1];
                    if (param1.field_A >= -2 + var10.field_l.length) {
                      break L4;
                    } else {
                      var7 = (var9.field_l[param1.field_A] & 255) << 1225094824;
                      var8 = var10.field_l[2 + param1.field_A] << -1873665272 & 65280;
                      var6 = var6 + (-var6 + var10.field_l[3 + param1.field_A]) * (var5 + -var7) / (var8 - var7);
                      break L4;
                    }
                  }
                  var4 = var6 * var4 + 32 >> -1453460090;
                  break L3;
                } else {
                  break L3;
                }
              }
              L5: {
                if (0 >= param1.field_x) {
                  break L5;
                } else {
                  if (var10.field_g == null) {
                    break L5;
                  } else {
                    L6: {
                      var5 = param1.field_x;
                      var6 = var10.field_g[param1.field_p + 1];
                      if (var10.field_g.length + -2 > param1.field_p) {
                        var7 = var9.field_g[param1.field_p] << -933056344 & 65280;
                        var8 = (var10.field_g[param1.field_p - -2] & 255) << -2112136536;
                        var6 = var6 + (-var6 + var10.field_g[param1.field_p - -3]) * (-var7 + var5) / (-var7 + var8);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var4 = var6 * var4 + 32 >> 1850343622;
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
            stackOut_22_1 = new StringBuilder().append("ih.CA(").append(param0).append(',');
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
          throw ig.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_21_0;
        }
    }

    synchronized void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param2 <= -13) {
          L0: {
            L1: {
              if (0 <= param1) {
                break L1;
              } else {
                var4 = 0;
                L2: while (true) {
                  L3: {
                    if (16 <= var4) {
                      break L3;
                    } else {
                      this.field_w[var4] = param0;
                      var4++;
                      if (var5 != 0) {
                        break L0;
                      } else {
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (var5 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            this.field_w[param1] = param0;
            break L0;
          }
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, mi param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
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
              if (param2 == 16) {
                break L1;
              } else {
                this.a(-101, 56, -32, -116);
                break L1;
              }
            }
            L2: {
              L3: {
                var4_int = param1.field_q.field_o.length;
                if (!param0) {
                  break L3;
                } else {
                  if (!param1.field_q.field_l) {
                    break L3;
                  } else {
                    L4: {
                      var6 = -param1.field_q.field_m + var4_int + var4_int;
                      var5 = (int)((long)this.field_W[param1.field_m] * (long)var6 >> 1749947142);
                      var4_int = var4_int << 8;
                      if ((var4_int ^ -1) >= (var5 ^ -1)) {
                        param1.field_K.a(true);
                        var5 = -var5 + var4_int + (var4_int + -1);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    if (!ArmiesOfGielinor.field_M) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              var5 = (int)((long)this.field_W[param1.field_m] * (long)var4_int >> 1922895558);
              break L2;
            }
            param1.field_K.g(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (runtimeException);
            stackOut_11_1 = new StringBuilder().append("ih.TA(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
    }

    final synchronized hn b() {
        return null;
    }

    synchronized void a(boolean param0, byte param1, boolean param2, um param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            this.a(param2, -128);
            if (param1 <= -78) {
              L1: {
                this.field_q.a(param3.field_k);
                this.field_z = 0L;
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (!param0) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L1;
                }
              }
              ((ih) (this)).field_Z = stackIn_6_1 != 0;
              var5_int = this.field_q.d();
              var6 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if ((var6 ^ -1) <= (var5_int ^ -1)) {
                      break L4;
                    } else {
                      this.field_q.d(var6);
                      this.field_q.f(var6);
                      this.field_q.a(var6);
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
                  this.field_K = this.field_q.e();
                  this.field_t = this.field_q.field_i[this.field_K];
                  this.field_Y = this.field_q.b(this.field_t);
                  break L3;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (runtimeException);
            stackOut_13_1 = new StringBuilder().append("ih.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final synchronized void f(int param0, int param1) {
        if (param0 >= -49) {
            return;
        }
        this.field_v = param1;
    }

    private final void a(int param0, int param1, boolean param2) {
        this.field_P[param1] = param0;
        this.field_D[param1] = rn.a(-128, param0);
        this.a(param1, (byte) 114, param0);
        if (!param2) {
            this.field_z = -32L;
        }
    }

    final synchronized boolean a(p param0, kl param1, int param2, um param3, byte param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        vc var8 = null;
        int var9 = 0;
        int var11 = 0;
        io var12 = null;
        io var13 = null;
        int stackIn_6_0 = 0;
        int stackIn_23_0 = 0;
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
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_5_0 = 0;
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
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              param3.b();
              var6_int = 1;
              var7 = null;
              if (param2 > 0) {
                var7 = new int[]{param2};
                break L1;
              } else {
                break L1;
              }
            }
            if (param4 == 86) {
              var8 = (vc) ((Object) param3.field_l.b(1));
              L2: while (true) {
                L3: {
                  L4: {
                    if (var8 == null) {
                      break L4;
                    } else {
                      var9 = (int)var8.field_i;
                      var12 = (io) ((Object) this.field_T.a(-27, (long)var9));
                      if (var11 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (var12 == null) {
                            L6: {
                              var13 = wl.a(param1, var9, true);
                              if (var13 != null) {
                                break L6;
                              } else {
                                var6_int = 0;
                                if (var11 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            this.field_T.a(var13, (long)var9, 24);
                            if (var13.a(param4 + 10922, var8.field_n, (int[]) (var7), param0)) {
                              break L5;
                            } else {
                              var6_int = 0;
                              break L5;
                            }
                          } else {
                            if (var12.a(param4 + 10922, var8.field_n, (int[]) (var7), param0)) {
                              break L5;
                            } else {
                              var6_int = 0;
                              var8 = (vc) ((Object) param3.field_l.b((byte) 115));
                              if (var11 == 0) {
                                continue L2;
                              } else {
                                if (var6_int == 0) {
                                  break L3;
                                } else {
                                  param3.a();
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                        var8 = (vc) ((Object) param3.field_l.b((byte) 115));
                        if (var11 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (var6_int == 0) {
                    break L3;
                  } else {
                    param3.a();
                    break L3;
                  }
                }
                stackOut_22_0 = var6_int;
                stackIn_23_0 = stackOut_22_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_5_0 = 1;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var6);
            stackOut_24_1 = new StringBuilder().append("ih.SA(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          L9: {
            stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L9;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_23_0 != 0;
        }
    }

    private final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          L1: {
            var5 = ArmiesOfGielinor.field_M ? 1 : 0;
            if (param2 != this.field_O[param0]) {
              this.field_O[param0] = param2;
              var4 = 0;
              L2: while (true) {
                if (128 <= var4) {
                  break L1;
                } else {
                  this.field_I[param0][var4] = null;
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
          if (param1 >= 111) {
            break L0;
          } else {
            field_E = (int[]) null;
            break L0;
          }
        }
    }

    synchronized void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (!this.field_q.g()) {
                    break L3;
                  } else {
                    var4_int = this.field_U * this.field_q.field_c / rc.field_d;
                    L4: while (true) {
                      L5: {
                        var5 = this.field_z - -((long)param2 * (long)var4_int);
                        if (0L > -var5 + this.field_Y) {
                          break L5;
                        } else {
                          this.field_z = var5;
                          if (var8 != 0) {
                            break L2;
                          } else {
                            if (var8 == 0) {
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      L6: {
                        var7 = (int)(((long)var4_int + (this.field_Y - (this.field_z + 1L))) / (long)var4_int);
                        this.field_z = this.field_z + (long)var4_int * (long)var7;
                        this.field_Q.b(param0, param1, var7);
                        this.a((byte) 36);
                        param1 = param1 + var7;
                        param2 = param2 - var7;
                        if (this.field_q.g()) {
                          break L6;
                        } else {
                          if (var8 == 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (var8 == 0) {
                        continue L4;
                      } else {
                        this.field_Q.b(param0, param1, param2);
                        break L1;
                      }
                    }
                  }
                }
                this.field_Q.b(param0, param1, param2);
                break L2;
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var4);
            stackOut_14_1 = new StringBuilder().append("ih.E(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L7;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean c(byte param0, mi param1) {
        RuntimeException var3 = null;
        int stackIn_9_0 = 0;
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
        int stackOut_8_0 = 0;
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
            L1: {
              if (param0 <= -76) {
                break L1;
              } else {
                this.field_C = (int[]) null;
                break L1;
              }
            }
            if (param1.field_K != null) {
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L2: {
                if (param1.field_x < 0) {
                  break L2;
                } else {
                  param1.d(56);
                  if (-1 <= (param1.field_F ^ -1)) {
                    break L2;
                  } else {
                    if (this.field_I[param1.field_m][param1.field_F] == param1) {
                      this.field_I[param1.field_m][param1.field_F] = null;
                      break L2;
                    } else {
                      return true;
                    }
                  }
                }
              }
              stackOut_8_0 = 1;
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("ih.DA(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    final synchronized void h(int param0) {
        int var3 = 0;
        int var4 = 0;
        io var5 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var5 = (io) ((Object) this.field_T.b(1));
        var3 = -125 % ((-68 - param0) / 49);
        L0: while (true) {
          L1: {
            if (var5 == null) {
              break L1;
            } else {
              var5.a(126);
              var5 = (io) ((Object) this.field_T.b((byte) 55));
              if (var4 != 0) {
                break L1;
              } else {
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
    }

    private final void b(boolean param0, int param1) {
        boolean discarded$2 = false;
        mi var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_3_0 = 0;
        boolean stackOut_10_0 = false;
        L0: {
          L1: {
            var4 = ArmiesOfGielinor.field_M ? 1 : 0;
            if (0 == (2 & this.field_o[param1])) {
              break L1;
            } else {
              var3 = (mi) ((Object) this.field_Q.field_p.e((byte) 89));
              L2: while (true) {
                if (var3 == null) {
                  break L1;
                } else {
                  stackOut_3_0 = var3.field_m;
                  stackIn_11_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var4 != 0) {
                    break L0;
                  } else {
                    L3: {
                      if (stackIn_4_0 != param1) {
                        break L3;
                      } else {
                        if (null == this.field_M[param1][var3.field_D]) {
                          if (0 <= var3.field_x) {
                            break L3;
                          } else {
                            var3.field_x = 0;
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                    var3 = (mi) ((Object) this.field_Q.field_p.a((byte) 123));
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
          stackOut_10_0 = param0;
          stackIn_11_0 = stackOut_10_0 ? 1 : 0;
          break L0;
        }
        L4: {
          if (stackIn_11_0 == 0) {
            break L4;
          } else {
            discarded$2 = this.a((p) null, (kl) null, -24, (um) null, (byte) 111);
            break L4;
          }
        }
    }

    public static void f(int param0) {
        field_G = null;
        if (param0 != -128) {
            field_X = (String) null;
        }
        field_H = null;
        field_X = null;
        field_p = null;
        field_E = null;
        field_R = null;
    }

    final int i(int param0) {
        if (param0 != 4096) {
            this.field_W = (int[]) null;
        }
        return this.field_v;
    }

    final static String e(int param0) {
        ic var1 = null;
        at[] var2 = null;
        int var3 = 0;
        at var4 = null;
        jd var5 = null;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        var1 = rd.field_j;
        if (var1 == null) {
          return "No game in progress.";
        } else {
          var2 = var1.field_xb.field_t;
          if (param0 > 10) {
            var3 = 0;
            L0: while (true) {
              L1: {
                if ((var3 ^ -1) <= (var2.length ^ -1)) {
                  break L1;
                } else {
                  var4 = var2[var3];
                  var5 = (jd) ((Object) var4.e((byte) 99));
                  L2: while (true) {
                    L3: {
                      L4: {
                        if (var5 == null) {
                          break L4;
                        } else {
                          var5.field_u = false;
                          var5 = (jd) ((Object) var4.a((byte) 123));
                          if (var6 != 0) {
                            break L3;
                          } else {
                            if (var6 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      var3++;
                      break L3;
                    }
                    if (var6 == 0) {
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              return "Did that work?";
            }
          } else {
            return (String) null;
          }
        }
    }

    final synchronized int c() {
        return 0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        String discarded$2 = null;
        mi var6 = null;
        int var7 = 0;
        mi var8 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        var8 = this.field_M[param3][param1];
        if (var8 != null) {
          L0: {
            this.field_M[param3][param1] = null;
            if (param2 == -44) {
              break L0;
            } else {
              discarded$2 = ih.e(-77);
              break L0;
            }
          }
          L1: {
            L2: {
              if (-1 != (this.field_o[param3] & 2 ^ -1)) {
                break L2;
              } else {
                var8.field_x = 0;
                if (var7 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            var6 = (mi) ((Object) this.field_Q.field_p.e((byte) 87));
            L3: while (true) {
              L4: {
                if (var6 == null) {
                  break L4;
                } else {
                  if (var7 != 0) {
                    break L1;
                  } else {
                    L5: {
                      if ((var6.field_m ^ -1) != (var8.field_m ^ -1)) {
                        break L5;
                      } else {
                        if ((var6.field_x ^ -1) <= -1) {
                          break L5;
                        } else {
                          if (var8 == var6) {
                            break L5;
                          } else {
                            var8.field_x = 0;
                            if (var7 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                    }
                    var6 = (mi) ((Object) this.field_Q.field_p.a((byte) 123));
                    if (var7 == 0) {
                      continue L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    final synchronized void j(int param0) {
        this.a(true, -128);
        if (param0 != 7) {
            this.field_I = (mi[][]) null;
        }
    }

    private final int a(int param0, mi param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        fq var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
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
            L1: {
              if (param0 == 1370206316) {
                break L1;
              } else {
                this.field_T = (bg) null;
                break L1;
              }
            }
            L2: {
              var3_int = param1.field_t + (param1.field_n * param1.field_J >> 1370206316);
              var3_int = var3_int + (this.field_x[param1.field_m] * (-8192 + this.field_r[param1.field_m]) >> 2006173580);
              var4 = param1.field_v;
              if (var4.field_b <= 0) {
                break L2;
              } else {
                L3: {
                  if (-1 > (var4.field_j ^ -1)) {
                    break L3;
                  } else {
                    if (this.field_u[param1.field_m] > 0) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  var5 = var4.field_j << -191257566;
                  var6 = var4.field_e << -908471167;
                  if ((var6 ^ -1) >= (param1.field_I ^ -1)) {
                    break L4;
                  } else {
                    var5 = param1.field_I * var5 / var6;
                    break L4;
                  }
                }
                var5 = var5 + (this.field_u[param1.field_m] >> 505567495);
                var7 = Math.sin(0.01227184630308513 * (double)(param1.field_y & 511));
                var3_int = var3_int + (int)(var7 * (double)var5);
                break L2;
              }
            }
            L5: {
              var5 = (int)(0.5 + (double)(param1.field_q.field_p * 256) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)rc.field_d);
              if (1 > var5) {
                stackOut_11_0 = 1;
                stackIn_12_0 = stackOut_11_0;
                break L5;
              } else {
                stackOut_10_0 = var5;
                stackIn_12_0 = stackOut_10_0;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("ih.BA(").append(param0).append(',');
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
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        return stackIn_12_0;
    }

    final synchronized hn a() {
        return (hn) ((Object) this.field_Q);
    }

    final boolean a(int param0, int param1, mi param2, byte param3, int[] param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        fq var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_9_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
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
        int stackOut_8_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_73_0 = 0;
        int stackOut_71_0 = 0;
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
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              param2.field_w = rc.field_d / 100;
              if (0 > param2.field_x) {
                break L1;
              } else {
                L2: {
                  if (param2.field_K == null) {
                    break L2;
                  } else {
                    if (param2.field_K.i()) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  param2.e(13301);
                  param2.d(-119);
                  if ((param2.field_F ^ -1) >= -1) {
                    break L3;
                  } else {
                    if (param2 != this.field_I[param2.field_m][param2.field_F]) {
                      break L3;
                    } else {
                      this.field_I[param2.field_m][param2.field_F] = null;
                      return true;
                    }
                  }
                }
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L4: {
              var6_int = param2.field_n;
              if (0 >= var6_int) {
                break L4;
              } else {
                L5: {
                  var6_int = var6_int - (int)(0.5 + 16.0 * Math.pow(2.0, (double)this.field_F[param2.field_m] * 0.0004921259842519685));
                  if (0 > var6_int) {
                    var6_int = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                param2.field_n = var6_int;
                break L4;
              }
            }
            L6: {
              param2.field_K.e(this.a(1370206316, param2));
              var7 = param2.field_v;
              param2.field_y = param2.field_y + var7.field_b;
              param2.field_I = param2.field_I + 1;
              var8 = 0;
              var9 = 0.000005086263020833333 * (double)((param2.field_J * param2.field_n >> 1025410028) + (-60 + param2.field_D << -1030717176));
              if (0 < var7.field_d) {
                L7: {
                  L8: {
                    if (-1 > (var7.field_i ^ -1)) {
                      break L8;
                    } else {
                      param2.field_o = param2.field_o + 128;
                      if (var11 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  param2.field_o = param2.field_o + (int)(Math.pow(2.0, (double)var7.field_i * var9) * 128.0 + 0.5);
                  break L7;
                }
                if ((var7.field_d * param2.field_o ^ -1) > -819201) {
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
              if (var7.field_l != null) {
                L10: {
                  L11: {
                    if (-1 <= (var7.field_m ^ -1)) {
                      break L11;
                    } else {
                      param2.field_s = param2.field_s + (int)(0.5 + Math.pow(2.0, var9 * (double)var7.field_m) * 128.0);
                      if (var11 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  param2.field_s = param2.field_s + 128;
                  break L10;
                }
                L12: while (true) {
                  L13: {
                    L14: {
                      if (param2.field_A >= var7.field_l.length - 2) {
                        break L14;
                      } else {
                        stackOut_30_0 = (255 & var7.field_l[param2.field_A - -2]) << -72772568;
                        stackOut_30_1 = param2.field_s;
                        stackIn_35_0 = stackOut_30_0;
                        stackIn_35_1 = stackOut_30_1;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        if (var11 != 0) {
                          break L13;
                        } else {
                          if (stackIn_31_0 >= stackIn_31_1) {
                            break L14;
                          } else {
                            param2.field_A = param2.field_A + 2;
                            if (var11 == 0) {
                              continue L12;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                    }
                    stackOut_34_0 = param2.field_A ^ -1;
                    stackOut_34_1 = var7.field_l.length + -2 ^ -1;
                    stackIn_35_0 = stackOut_34_0;
                    stackIn_35_1 = stackOut_34_1;
                    break L13;
                  }
                  if (stackIn_35_0 != stackIn_35_1) {
                    break L9;
                  } else {
                    if ((var7.field_l[1 + param2.field_A] ^ -1) != -1) {
                      break L9;
                    } else {
                      var8 = 1;
                      break L9;
                    }
                  }
                }
              } else {
                break L9;
              }
            }
            L15: {
              if (param3 > 34) {
                break L15;
              } else {
                this.b(-100, -5, -59);
                break L15;
              }
            }
            L16: {
              if ((param2.field_x ^ -1) > -1) {
                break L16;
              } else {
                if (var7.field_g == null) {
                  break L16;
                } else {
                  if (0 != (1 & this.field_o[param2.field_m])) {
                    break L16;
                  } else {
                    L17: {
                      if ((param2.field_F ^ -1) > -1) {
                        break L17;
                      } else {
                        if (param2 != this.field_I[param2.field_m][param2.field_F]) {
                          break L17;
                        } else {
                          break L16;
                        }
                      }
                    }
                    L18: {
                      L19: {
                        if (var7.field_c <= 0) {
                          break L19;
                        } else {
                          param2.field_x = param2.field_x + (int)(0.5 + 128.0 * Math.pow(2.0, (double)var7.field_c * var9));
                          if (var11 == 0) {
                            break L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                      param2.field_x = param2.field_x + 128;
                      break L18;
                    }
                    L20: while (true) {
                      L21: {
                        L22: {
                          if ((param2.field_p ^ -1) <= (var7.field_g.length - 2 ^ -1)) {
                            break L22;
                          } else {
                            stackOut_51_0 = (255 & var7.field_g[2 + param2.field_p]) << -1112088760 ^ -1;
                            stackOut_51_1 = param2.field_x ^ -1;
                            stackIn_56_0 = stackOut_51_0;
                            stackIn_56_1 = stackOut_51_1;
                            stackIn_52_0 = stackOut_51_0;
                            stackIn_52_1 = stackOut_51_1;
                            if (var11 != 0) {
                              break L21;
                            } else {
                              if (stackIn_52_0 <= stackIn_52_1) {
                                break L22;
                              } else {
                                param2.field_p = param2.field_p + 2;
                                if (var11 == 0) {
                                  continue L20;
                                } else {
                                  break L22;
                                }
                              }
                            }
                          }
                        }
                        stackOut_55_0 = -2 + var7.field_g.length;
                        stackOut_55_1 = param2.field_p;
                        stackIn_56_0 = stackOut_55_0;
                        stackIn_56_1 = stackOut_55_1;
                        break L21;
                      }
                      if (stackIn_56_0 == stackIn_56_1) {
                        var8 = 1;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                  }
                }
              }
            }
            if (var8 == 0) {
              param2.field_K.a(param2.field_w, this.a((byte) -110, param2), this.b((byte) 112, param2));
              stackOut_73_0 = 0;
              stackIn_74_0 = stackOut_73_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              L23: {
                L24: {
                  param2.field_K.h(param2.field_w);
                  if (param4 == null) {
                    break L24;
                  } else {
                    param2.field_K.b(param4, param1, param0);
                    if (var11 == 0) {
                      break L23;
                    } else {
                      break L24;
                    }
                  }
                }
                param2.field_K.a(param0);
                break L23;
              }
              L25: {
                if (!param2.field_K.e()) {
                  break L25;
                } else {
                  this.field_Q.field_s.a(param2.field_K);
                  break L25;
                }
              }
              L26: {
                param2.e(13301);
                if (param2.field_x >= 0) {
                  param2.d(93);
                  if (0 >= param2.field_F) {
                    break L26;
                  } else {
                    if (this.field_I[param2.field_m][param2.field_F] != param2) {
                      break L26;
                    } else {
                      this.field_I[param2.field_m][param2.field_F] = null;
                      break L26;
                    }
                  }
                } else {
                  break L26;
                }
              }
              stackOut_71_0 = 1;
              stackIn_72_0 = stackOut_71_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var6 = decompiledCaughtException;
            stackOut_75_0 = (RuntimeException) (var6);
            stackOut_75_1 = new StringBuilder().append("ih.D(").append(param0).append(',').append(param1).append(',');
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param2 == null) {
              stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L27;
            } else {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
              break L27;
            }
          }
          L28: {
            stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
            stackOut_78_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(',').append(param3).append(',');
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param4 == null) {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L28;
            } else {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L28;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_72_0 != 0;
          } else {
            return stackIn_74_0 != 0;
          }
        }
    }

    private final void b(int param0, int param1) {
        mi var3 = null;
        int var4 = 0;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param1 == 0) {
            break L0;
          } else {
            this.f(81, -106);
            break L0;
          }
        }
        var3 = (mi) ((Object) this.field_Q.field_p.e((byte) 105));
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
                    if (0 > param0) {
                      break L4;
                    } else {
                      if (var3.field_m == param0) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (-1 < (var3.field_x ^ -1)) {
                    this.field_M[var3.field_m][var3.field_D] = null;
                    var3.field_x = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var3 = (mi) ((Object) this.field_Q.field_p.a((byte) 123));
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

    private final void e(int param0, int param1) {
        mi var3 = null;
        int var4 = 0;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          var3 = (mi) ((Object) this.field_Q.field_p.e((byte) 121));
          if (param0 == -23024) {
            break L0;
          } else {
            this.field_W = (int[]) null;
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
                    if (-1 < (param1 ^ -1)) {
                      break L4;
                    } else {
                      if (param1 != var3.field_m) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (null == var3.field_K) {
                      break L5;
                    } else {
                      L6: {
                        var3.field_K.h(rc.field_d / 100);
                        if (!var3.field_K.e()) {
                          break L6;
                        } else {
                          this.field_Q.field_s.a(var3.field_K);
                          break L6;
                        }
                      }
                      var3.e(13301);
                      break L5;
                    }
                  }
                  L7: {
                    if ((var3.field_x ^ -1) <= -1) {
                      break L7;
                    } else {
                      this.field_M[var3.field_m][var3.field_D] = null;
                      break L7;
                    }
                  }
                  var3.d(-118);
                  break L3;
                }
                var3 = (mi) ((Object) this.field_Q.field_p.a((byte) 123));
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

    final synchronized void a(int param0, int param1, int param2) {
        if (param0 != -1) {
            this.a(true, false);
        }
        this.a(param1, param2, true);
    }

    private final void b(int param0, int param1, int param2) {
        if (param1 != 2) {
            this.f(-56, 47);
        }
    }

    private final void c(int param0, int param1, int param2) {
        this.field_r[param0] = param1;
        if (param2 < 117) {
            this.field_I = (mi[][]) null;
        }
    }

    private final void d(int param0, int param1) {
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (-1 >= (param1 ^ -1)) {
          L0: {
            this.field_N[param1] = 12800;
            this.field_V[param1] = 8192;
            this.field_A[param1] = 16383;
            this.field_r[param1] = 8192;
            this.field_u[param1] = 0;
            this.field_F[param1] = 8192;
            this.b(false, param1);
            if (param0 > 31) {
              break L0;
            } else {
              this.a(-1, (byte) -1, 112, 0);
              break L0;
            }
          }
          this.a(param1, (byte) 83);
          this.field_o[param1] = 0;
          this.field_J[param1] = 32767;
          this.field_x[param1] = 256;
          this.field_W[param1] = 0;
          this.d(10287, param1, 8192);
          return;
        } else {
          param1 = 0;
          L1: while (true) {
            if ((param1 ^ -1) <= -17) {
              return;
            } else {
              this.d(59, param1);
              param1++;
              if (var4 == 0) {
                continue L1;
              } else {
                return;
              }
            }
          }
        }
    }

    private final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        var3 = 240 & param1;
        if (param0 >= 102) {
          if (var3 != 128) {
            L0: {
              if (var3 != 144) {
                if (var3 != 160) {
                  if (-177 != (var3 ^ -1)) {
                    if ((var3 ^ -1) == -193) {
                      var4 = param1 & 15;
                      var5 = param1 >> 422195368 & 127;
                      this.a(var4, (byte) 112, var5 + this.field_D[var4]);
                      return;
                    } else {
                      if (var3 == 208) {
                        var4 = param1 & 15;
                        var5 = 127 & param1 >> -446554008;
                        this.b(var5, 2, var4);
                        return;
                      } else {
                        if (var3 == 224) {
                          var4 = 15 & param1;
                          var5 = (param1 >> -1973025368 & 127) + (param1 >> -32676663 & 16256);
                          this.c(var4, var5, 124);
                          return;
                        } else {
                          var3 = 255 & param1;
                          if (var3 != 255) {
                            return;
                          } else {
                            this.a(true, true);
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    L1: {
                      var4 = 15 & param1;
                      var5 = (param1 & 32599) >> -1979291608;
                      var6 = 127 & param1 >> -1730200496;
                      if (0 == var5) {
                        this.field_D[var4] = rn.a(-2080769, this.field_D[var4]) + (var6 << -1422155858);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    L2: {
                      if (var5 == 32) {
                        this.field_D[var4] = (var6 << -41524697) + rn.a(this.field_D[var4], -16257);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if ((var5 ^ -1) == -2) {
                        this.field_u[var4] = rn.a(this.field_u[var4], -16257) - -(var6 << 283211143);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if ((var5 ^ -1) == -34) {
                        this.field_u[var4] = rn.a(this.field_u[var4], -128) + var6;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (5 != var5) {
                        break L5;
                      } else {
                        this.field_F[var4] = rn.a(-16257, this.field_F[var4]) + (var6 << 1206599719);
                        break L5;
                      }
                    }
                    L6: {
                      if (37 != var5) {
                        break L6;
                      } else {
                        this.field_F[var4] = var6 + rn.a(this.field_F[var4], -128);
                        break L6;
                      }
                    }
                    L7: {
                      if (7 == var5) {
                        this.field_N[var4] = (var6 << 172069607) + rn.a(-16257, this.field_N[var4]);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if ((var5 ^ -1) != -40) {
                        break L8;
                      } else {
                        this.field_N[var4] = var6 + rn.a(-128, this.field_N[var4]);
                        break L8;
                      }
                    }
                    L9: {
                      if (10 == var5) {
                        this.field_V[var4] = rn.a(-16257, this.field_V[var4]) - -(var6 << -1894561625);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (var5 != 42) {
                        break L10;
                      } else {
                        this.field_V[var4] = var6 + rn.a(this.field_V[var4], -128);
                        break L10;
                      }
                    }
                    L11: {
                      if (-12 == (var5 ^ -1)) {
                        this.field_A[var4] = rn.a(this.field_A[var4], -16257) - -(var6 << -1487157177);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if ((var5 ^ -1) != -44) {
                        break L12;
                      } else {
                        this.field_A[var4] = rn.a(-128, this.field_A[var4]) - -var6;
                        break L12;
                      }
                    }
                    L13: {
                      if (-65 != (var5 ^ -1)) {
                        break L13;
                      } else {
                        L14: {
                          if ((var6 ^ -1) <= -65) {
                            break L14;
                          } else {
                            this.field_o[var4] = rn.a(this.field_o[var4], -2);
                            if (var8 == 0) {
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        this.field_o[var4] = oe.c(this.field_o[var4], 1);
                        break L13;
                      }
                    }
                    L15: {
                      if (var5 == 65) {
                        L16: {
                          if ((var6 ^ -1) > -65) {
                            break L16;
                          } else {
                            this.field_o[var4] = oe.c(this.field_o[var4], 2);
                            if (var8 == 0) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        this.b(false, var4);
                        this.field_o[var4] = rn.a(this.field_o[var4], -3);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    L17: {
                      if ((var5 ^ -1) != -100) {
                        break L17;
                      } else {
                        this.field_J[var4] = rn.a(127, this.field_J[var4]) - -(var6 << 1718482119);
                        break L17;
                      }
                    }
                    L18: {
                      if (-99 == (var5 ^ -1)) {
                        this.field_J[var4] = rn.a(16256, this.field_J[var4]) - -var6;
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    L19: {
                      if ((var5 ^ -1) == -102) {
                        this.field_J[var4] = 16384 - (-rn.a(127, this.field_J[var4]) - (var6 << -2018841465));
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    L20: {
                      if ((var5 ^ -1) == -101) {
                        this.field_J[var4] = var6 + (rn.a(this.field_J[var4], 16256) + 16384);
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    L21: {
                      if ((var5 ^ -1) != -121) {
                        break L21;
                      } else {
                        this.e(-23024, var4);
                        break L21;
                      }
                    }
                    L22: {
                      if ((var5 ^ -1) == -122) {
                        this.d(107, var4);
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    L23: {
                      if (123 == var5) {
                        this.b(var4, 0);
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      if (var5 == 6) {
                        var7 = this.field_J[var4];
                        if (16384 != var7) {
                          break L24;
                        } else {
                          this.field_x[var4] = rn.a(-16257, this.field_x[var4]) - -(var6 << 808055399);
                          break L24;
                        }
                      } else {
                        break L24;
                      }
                    }
                    L25: {
                      if (38 == var5) {
                        var7 = this.field_J[var4];
                        if ((var7 ^ -1) != -16385) {
                          break L25;
                        } else {
                          this.field_x[var4] = var6 + rn.a(-128, this.field_x[var4]);
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
                        this.field_W[var4] = rn.a(-16257, this.field_W[var4]) + (var6 << -596374681);
                        break L26;
                      }
                    }
                    L27: {
                      if ((var5 ^ -1) == -49) {
                        this.field_W[var4] = var6 + rn.a(this.field_W[var4], -128);
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
                          if (var6 < 64) {
                            break L29;
                          } else {
                            this.field_o[var4] = oe.c(this.field_o[var4], 4);
                            if (var8 == 0) {
                              break L28;
                            } else {
                              break L29;
                            }
                          }
                        }
                        this.a(var4, (byte) -66);
                        this.field_o[var4] = rn.a(this.field_o[var4], -5);
                        break L28;
                      }
                    }
                    L30: {
                      if (-18 != (var5 ^ -1)) {
                        break L30;
                      } else {
                        this.d(10287, var4, (-16257 & this.field_C[var4]) + (var6 << -1786454681));
                        break L30;
                      }
                    }
                    if (-50 != (var5 ^ -1)) {
                      break L0;
                    } else {
                      this.d(10287, var4, var6 + (this.field_C[var4] & -128));
                      return;
                    }
                  }
                } else {
                  var4 = 15 & param1;
                  var5 = param1 >> -37303256 & 127;
                  var6 = (param1 & 8346101) >> 1231257520;
                  this.a(var4, (byte) 79, var5, var6);
                  return;
                }
              } else {
                L31: {
                  var4 = 15 & param1;
                  var5 = param1 >> 702033928 & 127;
                  var6 = param1 >> 473058608 & 127;
                  if (0 < var6) {
                    break L31;
                  } else {
                    this.a(64, var5, -44, var4);
                    if (var8 == 0) {
                      break L0;
                    } else {
                      break L31;
                    }
                  }
                }
                this.b(64, var5, var6, var4);
                return;
              }
            }
            return;
          } else {
            var4 = param1 & 15;
            var5 = (32625 & param1) >> 267686408;
            var6 = (8335388 & param1) >> -133102640;
            this.a(var6, var5, -44, var4);
            return;
          }
        } else {
          return;
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = ArmiesOfGielinor.field_M ? 1 : 0;
            if (!this.field_q.g()) {
              break L1;
            } else {
              var2 = this.field_q.field_c * this.field_U / rc.field_d;
              L2: while (true) {
                L3: {
                  var3 = this.field_z + (long)param0 * (long)var2;
                  if (-1L < (-var3 + this.field_Y ^ -1L)) {
                    break L3;
                  } else {
                    this.field_z = var3;
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
                  var5 = (int)((-1L + ((long)var2 + -this.field_z) + this.field_Y) / (long)var2);
                  this.field_z = this.field_z + (long)var2 * (long)var5;
                  this.field_Q.a(var5);
                  param0 = param0 - var5;
                  this.a((byte) 36);
                  if (this.field_q.g()) {
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
                  this.field_Q.a(param0);
                  break L0;
                }
              }
            }
          }
          this.field_Q.a(param0);
          break L0;
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        mi var5 = null;
        io var5_ref = null;
        sn var6 = null;
        int var6_int = 0;
        mi var7 = null;
        mi var8 = null;
        int var9 = 0;
        io var10 = null;
        io var11 = null;
        mi stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        mi stackOut_3_0 = null;
        tc stackOut_8_0 = null;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        L0: {
          L1: {
            var9 = ArmiesOfGielinor.field_M ? 1 : 0;
            this.a(param0, param1, -44, param3);
            if ((2 & this.field_o[param3] ^ -1) == -1) {
              break L1;
            } else {
              var5 = (mi) ((Object) this.field_Q.field_p.d((byte) -83));
              L2: while (true) {
                if (var5 == null) {
                  break L1;
                } else {
                  stackOut_3_0 = (mi) (var5);
                  stackIn_9_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var9 != 0) {
                    break L0;
                  } else {
                    L3: {
                      if ((stackIn_4_0.field_m ^ -1) != (param3 ^ -1)) {
                        break L3;
                      } else {
                        if ((var5.field_x ^ -1) <= -1) {
                          break L3;
                        } else {
                          this.field_M[param3][var5.field_D] = null;
                          this.field_M[param3][param1] = var5;
                          var6_int = var5.field_t - -(var5.field_J * var5.field_n >> -1581962420);
                          var5.field_t = var5.field_t + (param1 - var5.field_D << 1196212008);
                          var5.field_J = -var5.field_t + var6_int;
                          var5.field_D = param1;
                          var5.field_n = 4096;
                          return;
                        }
                      }
                    }
                    var5 = (mi) ((Object) this.field_Q.field_p.b((byte) 60));
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
          stackOut_8_0 = this.field_T.a(-22, (long)this.field_O[param3]);
          stackIn_9_0 = stackOut_8_0;
          break L0;
        }
        var10 = (io) ((Object) stackIn_9_0);
        var11 = var10;
        var5_ref = var11;
        if (var11 != null) {
          var6 = var10.field_y[param1];
          if (var6 != null) {
            L4: {
              L5: {
                var7 = new mi();
                var7.field_q = var6;
                var7.field_H = var11;
                var7.field_m = param3;
                var7.field_v = var10.field_v[param1];
                var7.field_F = var10.field_k[param1];
                var7.field_D = param1;
                var7.field_u = 1024 + param2 * param2 * (var10.field_s * var10.field_l[param1]) >> -166795733;
                var7.field_E = 255 & var10.field_x[param1];
                var7.field_t = (param1 << -79119032) - (32767 & var10.field_r[param1]);
                var7.field_o = 0;
                var7.field_p = 0;
                var7.field_x = -1;
                var7.field_A = 0;
                var7.field_s = 0;
                if (this.field_W[param3] != 0) {
                  break L5;
                } else {
                  var7.field_K = aa.b(var6, this.a(1370206316, var7), this.a((byte) -110, var7), this.b((byte) -117, var7));
                  if (var9 == 0) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                var7.field_K = aa.b(var6, this.a(1370206316, var7), 0, this.b((byte) -119, var7));
                stackOut_16_0 = this;
                stackIn_18_0 = stackOut_16_0;
                stackIn_17_0 = stackOut_16_0;
                if (0 <= var10.field_r[param1]) {
                  stackOut_18_0 = this;
                  stackOut_18_1 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  break L6;
                } else {
                  stackOut_17_0 = this;
                  stackOut_17_1 = 1;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  break L6;
                }
              }
              this.a(stackIn_19_1 != 0, var7, param0 + -48);
              break L4;
            }
            L7: {
              if (0 > var10.field_r[param1]) {
                var7.field_K.f(-1);
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (-1 >= (var7.field_F ^ -1)) {
                L9: {
                  var8 = this.field_I[param3][var7.field_F];
                  if (var8 == null) {
                    break L9;
                  } else {
                    if ((var8.field_x ^ -1) <= -1) {
                      break L9;
                    } else {
                      this.field_M[param3][var8.field_D] = null;
                      var8.field_x = 0;
                      break L9;
                    }
                  }
                }
                this.field_I[param3][var7.field_F] = var7;
                break L8;
              } else {
                break L8;
              }
            }
            this.field_Q.field_p.a((byte) -119, (tc) (var7));
            this.field_M[param3][param1] = var7;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final synchronized void a(int param0, boolean param1, um param2) {
        try {
            this.a(param1, (byte) -113, true, param2);
            if (param0 != 2) {
                this.a(-44);
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ih.S(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final synchronized void a(boolean param0, int param1) {
        this.field_q.f();
        this.field_B = null;
        if (param1 != -128) {
            this.a(-112, true, (um) null);
        }
        this.a(true, param0);
    }

    final synchronized boolean g(int param0) {
        if (param0 != 11899) {
            this.field_C = (int[]) null;
        }
        return this.field_q.g();
    }

    private final void a(int param0, byte param1) {
        int var3 = 0;
        mi var4 = null;
        int var5 = 0;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          var3 = -88 / ((param1 - 1) / 57);
          if ((4 & this.field_o[param0]) == 0) {
            break L0;
          } else {
            var4 = (mi) ((Object) this.field_Q.field_p.e((byte) 107));
            L1: while (true) {
              L2: {
                if (var4 == null) {
                  break L2;
                } else {
                  if (var5 != 0) {
                    break L0;
                  } else {
                    L3: {
                      if ((var4.field_m ^ -1) == (param0 ^ -1)) {
                        var4.field_B = 0;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var4 = (mi) ((Object) this.field_Q.field_p.a((byte) 123));
                    if (var5 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              break L0;
            }
          }
        }
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        wk var8 = null;
        int var9 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              param2 = param2 << 254558216 | param2;
              var4_int = param2 ^ param2 >> -1327939647;
              if (param0 < -119) {
                break L1;
              } else {
                field_R = (String) null;
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              L3: {
                if ((var7 ^ -1) <= -5) {
                  break L3;
                } else {
                  var6 = -64 + (param3 + (bm.field_y[var7][1] - -(param2 & 3)));
                  var5 = (var4_int & 7) + (bm.field_y[var7][0] + param1) - 44;
                  var8 = tn.field_eb[0 + param2 % 6];
                  fe.a(var8, var5, var6);
                  var4_int = var4_int >> 1;
                  param2 = param2 >> 1;
                  var7++;
                  if (var9 != 0) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (var9 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var4), "ih.M(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void d(int param0, int param1, int param2) {
        this.field_C[param1] = param2;
        this.field_s[param1] = (int)(0.5 + Math.pow(2.0, 0.00054931640625 * (double)param2) * 2097152.0);
        if (param0 != 10287) {
            this.a(60, -113, 122, -42);
        }
    }

    private final int b(byte param0, mi param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
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
            var3_int = this.field_V[param1.field_m];
            var4 = 78 / ((param0 - 63) / 40);
            if ((var3_int ^ -1) <= -8193) {
              stackOut_3_0 = 16384 - ((-var3_int + 16384) * (128 - param1.field_E) - -32 >> -436802810);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 32 + var3_int * param1.field_E >> -1156598330;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("ih.P(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        if (param1 <= 33) {
            this.a(-79, 59, false);
        }
    }

    private final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0) {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                this.b(-1, 0);
                if (var4 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            this.e(-23024, -1);
            break L0;
          }
          this.d(89, -1);
          var3 = 0;
          L2: while (true) {
            L3: {
              L4: {
                if (-17 >= (var3 ^ -1)) {
                  break L4;
                } else {
                  this.field_O[var3] = this.field_P[var3];
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
              var3 = 0;
              break L3;
            }
            L5: while (true) {
              L6: {
                if ((var3 ^ -1) <= -17) {
                  break L6;
                } else {
                  this.field_D[var3] = rn.a(this.field_P[var3], -128);
                  var3++;
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
        } else {
          return;
        }
    }

    final synchronized void c(int param0, int param1) {
        if (param1 >= -13) {
            this.field_C = (int[]) null;
        }
        this.field_U = param0;
    }

    protected ih() {
        this.field_F = new int[16];
        this.field_u = new int[16];
        this.field_P = new int[16];
        this.field_M = new mi[16][128];
        this.field_C = new int[16];
        this.field_o = new int[16];
        this.field_x = new int[16];
        this.field_U = 1000000;
        this.field_A = new int[16];
        this.field_v = 256;
        this.field_W = new int[16];
        this.field_O = new int[16];
        this.field_N = new int[16];
        this.field_I = new mi[16][128];
        this.field_s = new int[16];
        this.field_r = new int[16];
        this.field_w = new int[16];
        this.field_D = new int[16];
        this.field_V = new int[16];
        this.field_J = new int[16];
        this.field_q = new dw();
        this.field_Q = new os((ih) (this));
        this.field_T = new bg(128);
        this.a(256, -1, (byte) -116);
        this.a(true, true);
    }

    ih(ih param0) {
        this.field_F = new int[16];
        this.field_u = new int[16];
        this.field_P = new int[16];
        this.field_M = new mi[16][128];
        this.field_C = new int[16];
        this.field_o = new int[16];
        this.field_x = new int[16];
        this.field_U = 1000000;
        this.field_A = new int[16];
        this.field_v = 256;
        this.field_W = new int[16];
        this.field_O = new int[16];
        this.field_N = new int[16];
        this.field_I = new mi[16][128];
        this.field_s = new int[16];
        this.field_r = new int[16];
        this.field_w = new int[16];
        this.field_D = new int[16];
        this.field_V = new int[16];
        this.field_J = new int[16];
        this.field_q = new dw();
        this.field_Q = new os((ih) (this));
        try {
            this.field_T = param0.field_T;
            this.a(256, -1, (byte) -70);
            this.a(true, true);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ih.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var0 = 0;
        field_E = new int[4096];
        field_p = null;
        field_G = new byte[4096];
        for (var0 = 0; (var0 ^ -1) > -4097; var0++) {
            field_E[var0] = 1;
            field_G[var0] = (byte)-128;
        }
        field_X = "Offensive account name";
        field_R = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
