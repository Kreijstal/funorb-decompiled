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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -84) {
              stackIn_4_0 = sg.a((byte) 20, ie.a(param0, 100, 96));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (pd) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("ik.F(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
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
        int var3 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2_ref = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == 110) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ik.a(-105, (byte) 117);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2 = (vh) ((Object) al.field_e.c((byte) 47));
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var2 == null) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        fleas.a(param0, var2, param1 ^ 108);
                        var2 = (vh) ((Object) al.field_e.b((byte) -105));
                        if (var3 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var3 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    throw pf.a((Throwable) ((Object) var2_ref), "ik.B(" + param0 + ',' + param1 + ')');
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_11_0 = 0;
        String stackIn_17_0 = null;
        int stackIn_20_0 = 0;
        float stackIn_26_0 = 0.0f;
        float stackIn_27_0 = 0.0f;
        int stackIn_27_1 = 0;
        dd stackIn_32_0 = null;
        dd stackIn_35_0 = null;
        int var2;
        int var3;
        int var4;
        String var5_ref_String;
        float var5;
        int var6;
        dd var7;
        dd var8;
        int var9;
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
                  stackIn_6_0 = this.field_a - -this.field_d;

                  stackIn_6_1 = var2;

                  if (var9 != 0) {
                    break L2;
                  } else {
                    if (stackIn_6_0 < stackIn_6_1) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              stackIn_6_0 = var3 ^ -1;
              stackIn_6_1 = this.field_x ^ -1;
              break L2;
            }
            L4: {
              if (stackIn_6_0 != stackIn_6_1) {
                if (-1 != (var3 & 1 ^ -1)) {
                  stackIn_11_0 = this.field_u;
                  break L4;
                } else {
                  stackIn_11_0 = this.field_w;
                  break L4;
                }
              } else {
                stackIn_11_0 = this.field_O;
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
                        stackIn_17_0 = this.field_M;
                        break L6;
                      }
                    }
                  }
                  stackIn_17_0 = this.field_z[var3];
                  break L6;
                }
                L8: {
                  var5_ref_String = stackIn_17_0;
                  if (this.field_t[var3]) {
                    stackIn_20_0 = this.field_Q;
                    break L8;
                  } else {
                    stackIn_20_0 = this.field_H;
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
            stackIn_26_0 = (float)this.field_P;

            if (null != this.field_K) {
              stackIn_27_0 = stackIn_26_0;
              stackIn_27_1 = 2 * this.field_K.field_r;
              break L10;
            } else {
              stackIn_27_0 = stackIn_26_0;
              stackIn_27_1 = this.field_P;
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
                    stackIn_32_0 = this.field_y;
                    break L12;
                  } else {
                    stackIn_32_0 = this.field_E;
                    break L12;
                  }
                }
                L13: {
                  var7 = stackIn_32_0;
                  if (!this.field_L) {
                    stackIn_35_0 = this.field_E;
                    break L13;
                  } else {
                    stackIn_35_0 = this.field_y;
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
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        Object stackIn_84_0 = null;
        Object stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        int var2;
        int var3;
        int var4;
        double var5_double;
        int var5;
        int var6;
        double var7;
        double var9;
        int var11;
        var11 = fleas.field_A ? 1 : 0;
        this.field_J = false;
        this.field_A = false;
        this.field_L = false;
        var2 = -1 + this.field_d / this.field_D.field_N;
        var3 = this.field_D.field_N * (this.field_z.length + -var2);
        if (this.field_k) {
          L0: {
            L1: {
              stackIn_5_0 = this;

              if ((kc.field_f ^ -1) != -2) {
                break L1;
              } else {
                stackIn_5_0 = this;

                if (!this.a((byte) 103)) {
                  break L1;
                } else {
                  stackIn_6_0 = this;
                  stackIn_6_1 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = this;
            stackIn_6_1 = 0;
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
                stackIn_84_0 = this;

                if (this.field_x == var4) {
                  stackIn_85_0 = this;
                  stackIn_85_1 = 0;
                  break L18;
                } else {
                  stackIn_85_0 = this;
                  stackIn_85_1 = 1;
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
              stackIn_38_0 = this;

              if (this.field_x == var4) {
                stackIn_39_0 = this;
                stackIn_39_1 = 0;
                break L28;
              } else {
                stackIn_39_0 = this;
                stackIn_39_1 = 1;
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
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var1_ref = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 > 104) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ik.d(69);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5 = ge.field_e;
                        var1 = var5;
                        var2 = 0;
                        var3 = var5.length;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var2 >= var3) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        incrementValue$8 = var2;
                        var2++;
                        var5[incrementValue$8] = 0;
                        incrementValue$9 = var2;
                        var2++;
                        var5[incrementValue$9] = 0;
                        incrementValue$10 = var2;
                        var2++;
                        var5[incrementValue$10] = 0;
                        incrementValue$11 = var2;
                        var2++;
                        var5[incrementValue$11] = 0;
                        incrementValue$12 = var2;
                        var2++;
                        var5[incrementValue$12] = 0;
                        incrementValue$13 = var2;
                        var2++;
                        var5[incrementValue$13] = 0;
                        incrementValue$14 = var2;
                        var2++;
                        var5[incrementValue$14] = 0;
                        incrementValue$15 = var2;
                        var2++;
                        var5[incrementValue$15] = 0;
                        if (var4 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var4 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var1_ref = (RuntimeException) ((Object) caughtException);
                    throw pf.a((Throwable) ((Object) var1_ref), "ik.E(" + param0 + ')');
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(boolean param0) {
        field_C = null;
        if (param0) {
            ik.d(41);
        }
    }

    ik(int param0, int param1, int param2, int param3, fa param4, dd param5, dd param6, dd param7, dd param8) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
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
              stackIn_3_0 = this;

              if (param5 == null) {
                stackIn_4_0 = this;
                stackIn_4_1 = this.field_D.field_N;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = param5.field_x;
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
            stackIn_8_0 = (RuntimeException) (var10);

            stackIn_8_1 = new StringBuilder().append("ik.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param5 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param6 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param7 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param8 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_9_0), stackIn_21_2 + ')');
        }
    }

    static {
        field_G = Math.atan2(1.0, 0.0);
        field_R = true;
        field_C = "Not yet reached";
    }
}
