/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik extends wi {
    int field_S;
    boolean[] field_t;
    int field_r;
    private dd field_y;
    private int field_I;
    private boolean field_L;
    private dd field_q;
    static double field_G;
    int field_s;
    String[] field_z;
    private int field_B;
    int field_x;
    int field_Q;
    int field_u;
    private int field_v;
    int field_w;
    fa field_D;
    private int field_P;
    private boolean field_A;
    int field_H;
    private String field_M;
    boolean field_J;
    int field_O;
    int field_F;
    static boolean field_R;
    static String field_C;
    private dd field_K;
    private dd field_E;
    private int field_N;

    final static pd a(sf param0, byte param1) {
        RuntimeException var2 = null;
        pd stackIn_2_0 = null;
        pd stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        pd stackOut_3_0 = null;
        pd stackOut_1_0 = null;
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
            if (param1 == -84) {
              stackOut_3_0 = sg.a((byte) 20, ie.a(param0, 100, 96));
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (pd) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("ik.F(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(int param0, byte param1) {
        vh var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 110) {
                break L1;
              } else {
                ik.a(-105, (byte) 117);
                break L1;
              }
            }
            var2 = (vh) ((Object) al.field_e.c((byte) 47));
            L2: while (true) {
              L3: {
                if (var2 == null) {
                  break L3;
                } else {
                  fleas.a(param0, var2, param1 ^ 108);
                  var2 = (vh) ((Object) al.field_e.b((byte) -105));
                  if (var3 != 0) {
                    break L3;
                  } else {
                    if (var3 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2_ref), "ik.B(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, int param1) {
        L0: {
          if (param1 >= 94) {
            break L0;
          } else {
            field_R = false;
            break L0;
          }
        }
        if (param0 >= 0) {
          if (this.field_t.length <= param0) {
            return false;
          } else {
            return this.field_t[param0];
          }
        } else {
          return false;
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        float var5 = 0.0f;
        String var5_ref_String = null;
        int var6 = 0;
        dd var7 = null;
        dd var8 = null;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_11_0 = 0;
        String stackIn_17_0 = null;
        int stackIn_20_0 = 0;
        float stackIn_25_0 = 0.0f;
        float stackIn_26_0 = 0.0f;
        float stackIn_27_0 = 0.0f;
        int stackIn_27_1 = 0;
        dd stackIn_32_0 = null;
        dd stackIn_35_0 = null;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        String stackOut_15_0 = null;
        String stackOut_16_0 = null;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        float stackOut_24_0 = 0.0f;
        float stackOut_26_0 = 0.0f;
        int stackOut_26_1 = 0;
        float stackOut_25_0 = 0.0f;
        int stackOut_25_1 = 0;
        dd stackOut_31_0 = null;
        dd stackOut_30_0 = null;
        dd stackOut_34_0 = null;
        dd stackOut_33_0 = null;
        var9 = fleas.field_A ? 1 : 0;
        gb.a(ia.field_q);
        gb.a(this.field_l, this.field_a + this.field_D.field_N, this.field_l - (-this.field_n + this.field_P), this.field_a + this.field_d);
        var2 = this.field_D.field_N + this.field_a;
        var3 = 0;
        L0: while (true) {
          L1: {
            L2: {
              L3: {
                if (this.field_z.length > var3) {
                  break L3;
                } else {
                  stackOut_2_0 = this.field_a - -this.field_d;
                  stackOut_2_1 = var2;
                  stackIn_6_0 = stackOut_2_0;
                  stackIn_6_1 = stackOut_2_1;
                  stackIn_3_0 = stackOut_2_0;
                  stackIn_3_1 = stackOut_2_1;
                  if (var9 != 0) {
                    break L2;
                  } else {
                    if (stackIn_3_0 < stackIn_3_1) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              stackOut_5_0 = var3 ^ -1;
              stackOut_5_1 = this.field_x ^ -1;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              break L2;
            }
            L4: {
              if (stackIn_6_0 != stackIn_6_1) {
                if (-1 != (var3 & 1 ^ -1)) {
                  stackOut_10_0 = this.field_u;
                  stackIn_11_0 = stackOut_10_0;
                  break L4;
                } else {
                  stackOut_9_0 = this.field_w;
                  stackIn_11_0 = stackOut_9_0;
                  break L4;
                }
              } else {
                stackOut_7_0 = this.field_O;
                stackIn_11_0 = stackOut_7_0;
                break L4;
              }
            }
            L5: {
              var4 = stackIn_11_0;
              gb.g(this.field_l, -this.field_S + var2, -this.field_P + this.field_n, this.field_D.field_N, var4 & k.field_a, var4 >>> ii.field_b);
              if (this.field_z.length > var3) {
                L6: {
                  L7: {
                    if (this.field_t[var3]) {
                      break L7;
                    } else {
                      if (null == this.field_M) {
                        break L7;
                      } else {
                        stackOut_15_0 = this.field_M;
                        stackIn_17_0 = stackOut_15_0;
                        break L6;
                      }
                    }
                  }
                  stackOut_16_0 = this.field_z[var3];
                  stackIn_17_0 = stackOut_16_0;
                  break L6;
                }
                L8: {
                  var5_ref_String = stackIn_17_0;
                  if (this.field_t[var3]) {
                    stackOut_19_0 = this.field_Q;
                    stackIn_20_0 = stackOut_19_0;
                    break L8;
                  } else {
                    stackOut_18_0 = this.field_H;
                    stackIn_20_0 = stackOut_18_0;
                    break L8;
                  }
                }
                var6 = stackIn_20_0;
                this.field_D.a(var5_ref_String, this.field_l - -5, -this.field_D.field_K + (this.field_D.field_N + var2) + -this.field_S, k.field_a & var6, -1, var6 >>> ii.field_b);
                break L5;
              } else {
                break L5;
              }
            }
            var3++;
            var2 = var2 + this.field_D.field_N;
            if (var9 == 0) {
              continue L0;
            } else {
              break L1;
            }
          }
          L9: {
            gb.b(ia.field_q);
            var3 = -this.field_P + this.field_l + this.field_n;
            var4 = this.field_D.field_N + this.field_a;
            gb.g(var3, var4, this.field_P, this.field_d - this.field_D.field_N, this.field_s & k.field_a, this.field_s >>> ii.field_b);
            gb.g(var3, var4, this.field_P, this.field_P, k.field_a & this.field_s, this.field_s >>> ii.field_b);
            if (null == this.field_q) {
              break L9;
            } else {
              this.field_q.d(var3, var4, this.field_P, this.field_d + -this.field_D.field_N);
              break L9;
            }
          }
          L10: {
            gb.g(var3, this.field_a - (-this.field_d - -this.field_P), this.field_P, this.field_P, k.field_a & this.field_s, this.field_s >>> ii.field_b);
            var5 = (float)this.field_x / (float)(-1 + this.field_z.length);
            stackOut_24_0 = (float)this.field_P;
            stackIn_26_0 = stackOut_24_0;
            stackIn_25_0 = stackOut_24_0;
            if (null != this.field_K) {
              stackOut_26_0 = stackIn_26_0;
              stackOut_26_1 = 2 * this.field_K.field_r;
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              break L10;
            } else {
              stackOut_25_0 = stackIn_25_0;
              stackOut_25_1 = this.field_P;
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              break L10;
            }
          }
          L11: {
            var6 = (int)(stackIn_27_0 + (float)(-stackIn_27_1 - 2 * this.field_P + (this.field_d + -this.field_D.field_N)) * var5);
            if (this.field_E == null) {
              break L11;
            } else {
              if (this.field_y == null) {
                break L11;
              } else {
                L12: {
                  if (this.field_A) {
                    stackOut_31_0 = this.field_y;
                    stackIn_32_0 = stackOut_31_0;
                    break L12;
                  } else {
                    stackOut_30_0 = this.field_E;
                    stackIn_32_0 = stackOut_30_0;
                    break L12;
                  }
                }
                L13: {
                  var7 = stackIn_32_0;
                  if (!this.field_L) {
                    stackOut_34_0 = this.field_E;
                    stackIn_35_0 = stackOut_34_0;
                    break L13;
                  } else {
                    stackOut_33_0 = this.field_y;
                    stackIn_35_0 = stackOut_33_0;
                    break L13;
                  }
                }
                var8 = stackIn_35_0;
                var7.d(var3, var4);
                var8.b(var3, -var8.field_r + this.field_d + this.field_a);
                break L11;
              }
            }
          }
          L14: {
            L15: {
              if (null == this.field_K) {
                break L15;
              } else {
                this.field_K.d(-(this.field_K.field_x / 2) + var3 + this.field_P / 2, var6 + var4 + this.field_K.field_r / 2);
                if (var9 == 0) {
                  break L14;
                } else {
                  break L15;
                }
              }
            }
            gb.g(var3, var4 - -var6, this.field_P, this.field_P, this.field_r & k.field_a, this.field_r >>> ii.field_b);
            gb.e(var3, var4 + var6, this.field_P, this.field_P, k.field_a & this.field_F, this.field_F >>> ii.field_b);
            break L14;
          }
          gb.e(this.field_l, this.field_a, this.field_n, this.field_d, this.field_I & k.field_a, this.field_I >>> ii.field_b);
          gb.e(param0 + this.field_l, this.field_a + -1, this.field_n - -2, 2 + this.field_d, k.field_a & this.field_N, this.field_N >>> ii.field_b);
          return;
        }
    }

    final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        double var5_double = 0.0;
        int var6 = 0;
        double var7 = 0.0;
        double var9 = 0.0;
        int var11 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        Object stackIn_83_0 = null;
        Object stackIn_84_0 = null;
        Object stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_82_0 = null;
        Object stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        Object stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        Object stackOut_36_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        var11 = fleas.field_A ? 1 : 0;
        this.field_J = false;
        this.field_A = false;
        this.field_L = false;
        var2 = -1 + this.field_d / this.field_D.field_N;
        var3 = this.field_D.field_N * (this.field_z.length + -var2);
        if (this.field_k) {
          L0: {
            L1: {
              stackOut_2_0 = this;
              stackIn_5_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if ((kc.field_f ^ -1) != -2) {
                break L1;
              } else {
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (!this.a((byte) 103)) {
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L0;
                }
              }
            }
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L0;
          }
          L2: {
            ((ik) (this)).field_g = stackIn_6_1 != 0;
            if (param0 == 99) {
              break L2;
            } else {
              this.e(1);
              break L2;
            }
          }
          L3: {
            this.field_B = this.field_B - 1;
            this.field_v = this.field_v - 1;
            var4 = this.field_x;
            if (this.field_i) {
              if (0 > this.field_x) {
                break L3;
              } else {
                if (this.field_z.length <= this.field_x) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      if (ei.field_H[98]) {
                        break L5;
                      } else {
                        L6: {
                          if (!ei.field_H[99]) {
                            break L6;
                          } else {
                            if (-1 >= (this.field_v ^ -1)) {
                              break L4;
                            } else {
                              this.field_x = this.field_x + 1;
                              this.field_v = ij.field_L;
                              if (var11 == 0) {
                                break L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        this.field_v = -1;
                        if (var11 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (-1 < (this.field_v ^ -1)) {
                      this.field_x = this.field_x - 1;
                      this.field_v = ij.field_L;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L7: {
                    if (0 <= this.field_x) {
                      break L7;
                    } else {
                      this.field_x = 0;
                      break L7;
                    }
                  }
                  if (this.field_x >= this.field_z.length) {
                    this.field_x = -1 + this.field_z.length;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
            } else {
              break L3;
            }
          }
          if (this.field_g) {
            this.field_i = true;
            if (this.field_a + this.field_D.field_N < kc.field_b) {
              L8: {
                L9: {
                  if (ag.field_f < this.field_l - (-this.field_n - -this.field_P)) {
                    break L9;
                  } else {
                    L10: {
                      if (kc.field_b > this.field_D.field_N + (this.field_a + this.field_P)) {
                        break L10;
                      } else {
                        this.field_A = true;
                        if (this.field_B >= 0) {
                          break L8;
                        } else {
                          this.field_x = this.field_x - 1;
                          this.field_B = ij.field_L;
                          if (var11 == 0) {
                            break L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    L11: {
                      if (-this.field_P + (this.field_d + this.field_a) > kc.field_b) {
                        break L11;
                      } else {
                        L12: {
                          if (this.field_B >= 0) {
                            break L12;
                          } else {
                            this.field_x = this.field_x + 1;
                            this.field_B = ij.field_L;
                            break L12;
                          }
                        }
                        this.field_L = true;
                        if (var11 == 0) {
                          break L8;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L13: {
                      this.field_B = -1;
                      var5_double = (double)(-this.field_D.field_N + (-this.field_a + kc.field_b - (this.field_P + this.field_P / 2)));
                      if (var5_double >= 0.0) {
                        break L13;
                      } else {
                        var5_double = 0.0;
                        break L13;
                      }
                    }
                    L14: {
                      var7 = (double)(-this.field_P + (-(this.field_P * 2) + (-this.field_D.field_N + this.field_d)));
                      if (var5_double <= var7) {
                        break L14;
                      } else {
                        var5_double = var7;
                        break L14;
                      }
                    }
                    var9 = var5_double / var7;
                    this.field_x = (int)(var9 * (double)(-1 + this.field_z.length));
                    if (var11 == 0) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                if (jk.field_r == 0) {
                  break L8;
                } else {
                  var5 = this.field_S + (-this.field_a - (this.field_D.field_N - kc.field_b));
                  this.field_x = var5 / this.field_D.field_N;
                  break L8;
                }
              }
              L15: {
                if (var3 < this.field_S) {
                  this.field_S = var3;
                  if (var11 == 0) {
                    break L15;
                  } else {
                    if (kc.field_f != 1) {
                      break L15;
                    } else {
                      this.field_i = false;
                      break L15;
                    }
                  }
                } else {
                  break L15;
                }
              }
              L16: {
                if (0 > this.field_x) {
                  this.field_x = 0;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (this.field_z.length <= this.field_x) {
                  this.field_x = this.field_z.length + -1;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                stackOut_82_0 = this;
                stackIn_84_0 = stackOut_82_0;
                stackIn_83_0 = stackOut_82_0;
                if (this.field_x == var4) {
                  stackOut_84_0 = this;
                  stackOut_84_1 = 0;
                  stackIn_85_0 = stackOut_84_0;
                  stackIn_85_1 = stackOut_84_1;
                  break L18;
                } else {
                  stackOut_83_0 = this;
                  stackOut_83_1 = 1;
                  stackIn_85_0 = stackOut_83_0;
                  stackIn_85_1 = stackOut_83_1;
                  break L18;
                }
              }
              L19: {
                L20: {
                  ((ik) (this)).field_J = stackIn_85_1 != 0;
                  if (this.field_x >= var2 / 2) {
                    break L20;
                  } else {
                    var5 = 0;
                    if (var11 == 0) {
                      break L19;
                    } else {
                      break L20;
                    }
                  }
                }
                L21: {
                  if (this.field_z.length - this.field_x >= var2 / 2) {
                    break L21;
                  } else {
                    var5 = var3;
                    if (var11 == 0) {
                      break L19;
                    } else {
                      break L21;
                    }
                  }
                }
                var5 = var3 * (-(var2 / 2) + this.field_x) / (-var2 + this.field_z.length);
                break L19;
              }
              L22: {
                if (this.field_S == var5) {
                  break L22;
                } else {
                  L23: {
                    var6 = this.field_S - var5;
                    if (var6 / 4 == 0) {
                      break L23;
                    } else {
                      this.field_S = this.field_S - var6 / 4;
                      if (var11 == 0) {
                        break L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L24: {
                    if (-1 != (var6 / 2 ^ -1)) {
                      break L24;
                    } else {
                      this.field_S = this.field_S - var6;
                      if (var11 == 0) {
                        break L22;
                      } else {
                        break L24;
                      }
                    }
                  }
                  this.field_S = this.field_S - var6 / 2;
                  break L22;
                }
              }
              return;
            } else {
              return;
            }
          } else {
            L25: {
              if (kc.field_f != 1) {
                break L25;
              } else {
                this.field_i = false;
                break L25;
              }
            }
            L26: {
              if (0 > this.field_x) {
                this.field_x = 0;
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              if (this.field_z.length <= this.field_x) {
                this.field_x = this.field_z.length + -1;
                break L27;
              } else {
                break L27;
              }
            }
            L28: {
              stackOut_36_0 = this;
              stackIn_38_0 = stackOut_36_0;
              stackIn_37_0 = stackOut_36_0;
              if (this.field_x == var4) {
                stackOut_38_0 = this;
                stackOut_38_1 = 0;
                stackIn_39_0 = stackOut_38_0;
                stackIn_39_1 = stackOut_38_1;
                break L28;
              } else {
                stackOut_37_0 = this;
                stackOut_37_1 = 1;
                stackIn_39_0 = stackOut_37_0;
                stackIn_39_1 = stackOut_37_1;
                break L28;
              }
            }
            L29: {
              L30: {
                ((ik) (this)).field_J = stackIn_39_1 != 0;
                if (this.field_x >= var2 / 2) {
                  break L30;
                } else {
                  var5 = 0;
                  if (var11 == 0) {
                    break L29;
                  } else {
                    break L30;
                  }
                }
              }
              L31: {
                if (this.field_z.length - this.field_x >= var2 / 2) {
                  break L31;
                } else {
                  var5 = var3;
                  if (var11 == 0) {
                    break L29;
                  } else {
                    break L31;
                  }
                }
              }
              var5 = var3 * (-(var2 / 2) + this.field_x) / (-var2 + this.field_z.length);
              break L29;
            }
            L32: {
              if (this.field_S == var5) {
                break L32;
              } else {
                L33: {
                  var6 = this.field_S - var5;
                  if (var6 / 4 == 0) {
                    break L33;
                  } else {
                    this.field_S = this.field_S - var6 / 4;
                    if (var11 == 0) {
                      break L32;
                    } else {
                      break L33;
                    }
                  }
                }
                L34: {
                  if (-1 != (var6 / 2 ^ -1)) {
                    break L34;
                  } else {
                    this.field_S = this.field_S - var6;
                    if (var11 == 0) {
                      break L32;
                    } else {
                      break L34;
                    }
                  }
                }
                this.field_S = this.field_S - var6 / 2;
                break L32;
              }
            }
            return;
          }
        } else {
          this.field_B = 0;
          this.field_v = 0;
          this.field_g = false;
          this.field_c = false;
          return;
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static void d(int param0) {
        int incrementValue$40 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 104) {
                break L1;
              } else {
                ik.d(69);
                break L1;
              }
            }
            var5 = ge.field_e;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L2: while (true) {
              L3: {
                if (var2 >= var3) {
                  break L3;
                } else {
                  incrementValue$40 = var2;
                  var2++;
                  var5[incrementValue$40] = 0;
                  incrementValue$41 = var2;
                  var2++;
                  var5[incrementValue$41] = 0;
                  incrementValue$42 = var2;
                  var2++;
                  var5[incrementValue$42] = 0;
                  incrementValue$43 = var2;
                  var2++;
                  var5[incrementValue$43] = 0;
                  incrementValue$44 = var2;
                  var2++;
                  var5[incrementValue$44] = 0;
                  incrementValue$45 = var2;
                  var2++;
                  var5[incrementValue$45] = 0;
                  incrementValue$46 = var2;
                  var2++;
                  var5[incrementValue$46] = 0;
                  incrementValue$47 = var2;
                  var2++;
                  var5[incrementValue$47] = 0;
                  if (var4 != 0) {
                    break L3;
                  } else {
                    continue L2;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1_ref), "ik.E(" + param0 + ')');
        }
    }

    public static void b(boolean param0) {
        field_C = null;
        if (param0) {
            ik.d(41);
        }
    }

    ik(int param0, int param1, int param2, int param3, fa param4, dd param5, dd param6, dd param7, dd param8) {
        RuntimeException var10 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        this.field_I = 0;
        this.field_r = -16727809;
        this.field_s = -257908576;
        this.field_u = -252645136;
        this.field_Q = -16777215;
        this.field_A = false;
        this.field_B = 0;
        this.field_v = 0;
        this.field_M = null;
        this.field_H = -8355712;
        this.field_x = -1;
        this.field_L = false;
        this.field_t = new boolean[]{};
        this.field_F = -16777215;
        this.field_z = new String[]{};
        this.field_O = -2147434304;
        this.field_w = -1;
        this.field_J = false;
        this.field_N = 0;
        try {
          L0: {
            L1: {
              this.field_n = param2;
              this.field_D = param4;
              this.field_a = param1;
              this.field_d = param3;
              this.field_l = param0;
              this.field_K = param7;
              this.field_q = param8;
              this.field_y = param6;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (param5 == null) {
                stackOut_3_0 = this;
                stackOut_3_1 = this.field_D.field_N;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = param5.field_x;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            ((ik) (this)).field_P = stackIn_4_1;
            this.field_E = param5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var10 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var10);
            stackOut_6_1 = new StringBuilder().append("ik.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param5 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param6 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param7 == null) {
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
          L6: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param8 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    static {
        field_G = Math.atan2(1.0, 0.0);
        field_R = true;
        field_C = "Not yet reached";
    }
}
