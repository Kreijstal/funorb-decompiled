/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ah {
    int field_l;
    int field_z;
    int field_b;
    static byte[] field_g;
    int field_j;
    private int field_i;
    int field_P;
    private int field_h;
    int field_C;
    private int field_O;
    int field_m;
    int field_v;
    boolean field_R;
    boolean field_f;
    int field_E;
    double field_s;
    private int field_k;
    int field_o;
    private int field_H;
    private int field_B;
    private int field_c;
    int field_u;
    int field_Q;
    int field_t;
    int field_r;
    int field_N;
    int field_G;
    int field_y;
    private int field_M;
    int field_x;
    int field_a;
    double field_L;
    private jn field_q;
    int field_F;
    int field_I;
    private int field_K;
    private boolean field_n;
    int field_d;
    int field_p;
    static ki field_J;
    int field_A;
    int field_e;
    boolean field_D;
    private int field_w;

    private final void b(int param0, int param1) {
        int discarded$0 = 0;
        this.field_M = param0;
        this.field_O = 500;
        if (param1 <= 98) {
            discarded$0 = this.d((byte) -2);
        }
        this.c((byte) 35);
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        if (-1 <= (this.field_w ^ -1)) {
          if (this.g(22)) {
            return;
          } else {
            L0: {
              this.field_s = Math.atan2((double)param0, (double)param1);
              if (param2 < -43) {
                break L0;
              } else {
                this.field_Q = -106;
                break L0;
              }
            }
            L1: {
              var4 = this.field_E;
              var5 = this.field_A;
              var6 = 20;
              var6 = var6 + (this.field_y - 1) * 10;
              if (!this.field_f) {
                break L1;
              } else {
                var6 = (int)((double)var6 * 0.4);
                break L1;
              }
            }
            L2: {
              if ((this.field_N ^ -1) != -3) {
                break L2;
              } else {
                if (-1 <= (this.field_v ^ -1)) {
                  break L2;
                } else {
                  var6 = (int)((double)var6 * 0.4);
                  break L2;
                }
              }
            }
            L3: {
              var7 = var6 * (this.field_i * param0 / 256 - this.field_E) >> -2076030584;
              stackOut_10_0 = this;
              stackOut_10_1 = this.field_E;
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              if (var7 != 0) {
                stackOut_12_0 = this;
                stackOut_12_1 = stackIn_12_1;
                stackOut_12_2 = var7;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                stackIn_13_2 = stackOut_12_2;
                break L3;
              } else {
                stackOut_11_0 = this;
                stackOut_11_1 = stackIn_11_1;
                stackOut_11_2 = 1;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_13_2 = stackOut_11_2;
                break L3;
              }
            }
            L4: {
              ((ah) (this)).field_E = stackIn_13_1 + stackIn_13_2;
              if (!this.field_f) {
                break L4;
              } else {
                this.field_E = (var4 + this.field_E) / 2;
                break L4;
              }
            }
            L5: {
              var7 = var6 * (-this.field_A + this.field_i * param1 / 256) >> 311421832;
              stackOut_15_0 = this;
              stackOut_15_1 = this.field_A;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              if (var7 != 0) {
                stackOut_17_0 = this;
                stackOut_17_1 = stackIn_17_1;
                stackOut_17_2 = var7;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                break L5;
              } else {
                stackOut_16_0 = this;
                stackOut_16_1 = stackIn_16_1;
                stackOut_16_2 = 1;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                break L5;
              }
            }
            L6: {
              ((ah) (this)).field_A = stackIn_18_1 + stackIn_18_2;
              if (this.field_f) {
                this.field_A = (var5 + this.field_A) / 2;
                break L6;
              } else {
                break L6;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    public static void c(int param0) {
        field_g = null;
        field_J = null;
        if (param0 != 0) {
            ah.c(-3);
        }
    }

    final int d(byte param0) {
        if (param0 != -106) {
            this.field_R = false;
        }
        return (int)(395.0 * ((double)(-this.field_H + this.field_k) / 1000.0));
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        if (this.field_D) {
          return;
        } else {
          if (param0 > -59) {
            return;
          } else {
            L0: {
              var4 = (int)Math.round(Math.sqrt((double)(param1 * param1 + param2 * param2)));
              if (var4 <= 0) {
                break L0;
              } else {
                L1: {
                  param2 = (param2 << -1583355832) / var4;
                  param1 = (param1 << 1501786792) / var4;
                  if (param2 != 0) {
                    break L1;
                  } else {
                    if (0 != param1) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
                this.a(param2, param1, -94);
                break L0;
              }
            }
            return;
          }
        }
    }

    final void b(boolean param0) {
        if (param0) {
            return;
        }
        this.field_l = this.field_l + 1;
    }

    private final void k(int param0) {
        if (param0 != 1261228232) {
            this.field_Q = 4;
        }
        this.field_n = false;
        this.field_m = this.e((byte) -5);
    }

    private final void j(byte param0) {
        this.field_t = this.field_t + 1;
        if (param0 != 98) {
            this.field_G = 29;
        }
        if (!(10 >= this.field_t)) {
            this.field_t = 10;
        }
        this.c((byte) 35);
    }

    final void a(byte param0, tl param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              L2: {
                if (param1.field_m != 0) {
                  break L2;
                } else {
                  this.a(-62, param1.field_n);
                  if (!Sumoblitz.field_L) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.b(param1.field_n, 120);
              break L1;
            }
            L3: {
              if (param0 > 83) {
                break L3;
              } else {
                this.m(17);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("ah.D(").append(param0).append(',');
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
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    private final void e(int param0) {
        boolean discarded$0 = false;
        if (param0 != 0) {
            discarded$0 = this.n(-51);
        }
        this.field_y = this.field_y + 1;
        if (10 < this.field_y) {
            this.field_y = 10;
        }
        this.c((byte) 35);
    }

    final boolean i(int param0) {
        int discarded$0 = 0;
        if (param0 != -2) {
            discarded$0 = this.e((byte) 53);
        }
        return -this.field_H + this.field_k == 975 ? true : false;
    }

    final boolean i(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 125) {
            break L0;
          } else {
            this.field_c = 106;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_E == 0) {
              break L2;
            } else {
              if (this.field_A == 0) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final boolean a(boolean param0) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            this.field_G = -94;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_Q != 0) {
              break L2;
            } else {
              L3: {
                if (4 == this.field_M) {
                  break L3;
                } else {
                  if ((this.field_k + -this.field_H ^ -1) <= -51) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final boolean f(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -63) {
            break L0;
          } else {
            this.field_I = -65;
            break L0;
          }
        }
        L1: {
          L2: {
            if (0 != this.field_b) {
              break L2;
            } else {
              if (this.field_r < 0) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != -55) {
          return;
        } else {
          L0: {
            var2 = this.field_N;
            if (var2 == 0) {
              break L0;
            } else {
              if ((var2 ^ -1) == -5) {
                break L0;
              } else {
                if ((var2 ^ -1) == -6) {
                  break L0;
                } else {
                  L1: {
                    L2: {
                      L3: {
                        if (var2 == 1) {
                          break L3;
                        } else {
                          L4: {
                            if (var2 != 2) {
                              break L4;
                            } else {
                              if (var3 == 0) {
                                break L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if ((var2 ^ -1) != -4) {
                            break L0;
                          } else {
                            if (var3 == 0) {
                              break L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                      L5: {
                        if ((this.field_p ^ -1) < -1) {
                          if (this.field_Q != 0) {
                            this.field_p = this.field_p - 1;
                            if (var3 == 0) {
                              break L0;
                            } else {
                              break L5;
                            }
                          } else {
                            break L0;
                          }
                        } else {
                          break L5;
                        }
                      }
                      if ((this.field_v ^ -1) < -1) {
                        break L0;
                      } else {
                        this.field_v = 200;
                        if (var3 == 0) {
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    if (-1 > (this.field_v ^ -1)) {
                      break L0;
                    } else {
                      this.field_v = 200;
                      if (-1 == (this.field_Q ^ -1)) {
                        this.field_v = 0;
                        if (var3 == 0) {
                          break L0;
                        } else {
                          break L1;
                        }
                      } else {
                        break L0;
                      }
                    }
                  }
                  if (0 < this.field_v) {
                    break L0;
                  } else {
                    this.field_v = 500;
                    break L0;
                  }
                }
              }
            }
          }
          return;
        }
    }

    void d(int param0) {
        float[] var2 = null;
        int var3 = 0;
        nt var4 = null;
        float[] var5 = null;
        float[] var6 = null;
        float[] var7 = null;
        float[] var9 = null;
        float[] var10 = null;
        float[] var13 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (!td.field_m) {
          L0: {
            if (-1 > (this.field_x ^ -1)) {
              this.field_x = this.field_x - 1;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (this.f(62)) {
              this.field_r = this.field_r + 1;
              break L1;
            } else {
              break L1;
            }
          }
          if (this.field_w <= 0) {
            if ((this.field_r ^ -1) <= -1) {
              L2: {
                if (0 > (this.field_j ^ -1)) {
                  this.field_j = this.field_j - 1;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (0 != this.field_j) {
                  break L3;
                } else {
                  this.m((byte) 116);
                  break L3;
                }
              }
              L4: {
                this.field_d = this.field_d + 1;
                if (this.field_Q != 0) {
                  break L4;
                } else {
                  if (this.field_d * 20 / 1000 >= 30) {
                    th.b(24753, 247, 8);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (-1 > (this.field_b ^ -1)) {
                  this.field_A = this.field_A >> 1;
                  this.field_b = this.field_b + 1;
                  this.field_E = this.field_E >> 1;
                  if (2 == this.field_b) {
                    ts.a(this.field_C, this.field_q, -16240, 20, lr.field_a[this.field_Q], this.field_z);
                    var5 = new float[]{0.0f, -3.0f};
                    var9 = kt.a((byte) -99, var5, (float)this.field_s);
                    var6 = var9;
                    var2 = var6;
                    this.field_q.a((ms) (new aj(100, this.field_C, this.field_z, this.a(0), this.field_s, Math.random() / 100.0, (int)var9[0] << 606339464, (int)var9[1] << 1452318728, this.field_Q, 0, this.e((byte) -5) >> -1504608952)), (byte) 39);
                    var10 = kt.a((byte) -16, var2, (float)(this.field_s + 2.0943951023931953));
                    var7 = var10;
                    var2 = var7;
                    this.field_q.a((ms) (new aj(100, this.field_C, this.field_z, this.a(0), this.field_s, Math.random() / 100.0, (int)var10[0] << -1717203704, (int)var10[1] << -19058808, this.field_Q, 1, this.e((byte) -5) >> 1825777928)), (byte) 39);
                    var13 = kt.a((byte) -43, var2, (float)(4.1887902047863905 + this.field_s));
                    this.field_q.a((ms) (new aj(100, this.field_C, this.field_z, this.a(0), this.field_s, Math.random() / 100.0, (int)var13[0] << 1966914184, (int)var13[1] << -1862952920, this.field_Q, 2, this.e((byte) -5) >> 122771240)), (byte) 39);
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                if (this.g(73)) {
                  break L6;
                } else {
                  this.field_C = this.field_C + this.field_E;
                  this.field_z = this.field_z + this.field_A;
                  break L6;
                }
              }
              if (param0 <= -55) {
                L7: {
                  if (!this.field_f) {
                    this.field_A = (-this.field_h + 251) * this.field_A / 256;
                    this.field_E = this.field_E * (251 - this.field_h) / 256;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (2 == this.field_Q) {
                    if (!wn.a(this.field_B, 2048, -128, this.field_C, this.field_K, this.field_z)) {
                      if (this.i(-2)) {
                        if (0 != this.field_Q) {
                          break L8;
                        } else {
                          ab.a(lr.field_a[this.field_Q], this.field_q, (ah) (this), 40, this.field_z, this.field_C, (byte) 121);
                          break L8;
                        }
                      } else {
                        if (!this.i(-2)) {
                          break L8;
                        } else {
                          if (0 != this.field_Q) {
                            break L8;
                          } else {
                            ab.a(lr.field_a[this.field_Q], this.field_q, (ah) (this), 40, this.field_z, this.field_C, (byte) 121);
                            break L8;
                          }
                        }
                      }
                    } else {
                      if (this.i(-2)) {
                        if (0 != this.field_Q) {
                          break L8;
                        } else {
                          ab.a(lr.field_a[this.field_Q], this.field_q, (ah) (this), 40, this.field_z, this.field_C, (byte) 121);
                          break L8;
                        }
                      } else {
                        if (!this.i(-2)) {
                          break L8;
                        } else {
                          if (0 != this.field_Q) {
                            break L8;
                          } else {
                            ab.a(lr.field_a[this.field_Q], this.field_q, (ah) (this), 40, this.field_z, this.field_C, (byte) 121);
                            break L8;
                          }
                        }
                      }
                    }
                  } else {
                    if (!this.i(-2)) {
                      break L8;
                    } else {
                      if (0 != this.field_Q) {
                        break L8;
                      } else {
                        ab.a(lr.field_a[this.field_Q], this.field_q, (ah) (this), 40, this.field_z, this.field_C, (byte) 121);
                        break L8;
                      }
                    }
                  }
                }
                L9: {
                  if (0 != (this.field_M ^ -1)) {
                    L10: {
                      this.field_O = this.field_O - 1;
                      if (0 != this.field_O) {
                        break L10;
                      } else {
                        this.b(677397768);
                        break L10;
                      }
                    }
                    L11: {
                      if (this.field_k % 2 != 0) {
                        break L11;
                      } else {
                        this.field_q.a((ms) (new eq(50, -1024 + this.field_C + fi.a(2048, he.field_o, (byte) -96) >> -507827032, -1024 + (this.field_z + fi.a(2048, he.field_o, (byte) -96)) >> 559324488, this.a(0), 1 + this.field_M, false)), (byte) 39);
                        if (var3 == 0) {
                          break L9;
                        } else {
                          break L11;
                        }
                      }
                    }
                    this.field_q.a((ms) (new eq(50, this.field_C + (fi.a(2048, he.field_o, (byte) -96) + -1024) >> 416903272, -1024 + (this.field_z - -fi.a(2048, he.field_o, (byte) -96)) >> 1906907240, this.a(0), this.field_M - -1, true)), (byte) 39);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L12: {
                  var4 = (nt) ((Object) this.field_q.b(118));
                  if (var4 == null) {
                    if (!this.g(66)) {
                      break L12;
                    } else {
                      this.field_m = this.field_m + 2048;
                      this.field_c = this.field_c - 1;
                      if (this.field_c != 0) {
                        break L12;
                      } else {
                        this.k(1261228232);
                        break L12;
                      }
                    }
                  } else {
                    if (!this.g(66)) {
                      break L12;
                    } else {
                      this.field_m = this.field_m + 2048;
                      this.field_c = this.field_c - 1;
                      if (this.field_c != 0) {
                        break L12;
                      } else {
                        this.k(1261228232);
                        break L12;
                      }
                    }
                  }
                }
                L13: {
                  this.field_f = false;
                  if ((this.field_G ^ -1) < -1) {
                    this.field_G = this.field_G - 1;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  this.field_D = false;
                  if (0 >= this.field_v) {
                    break L14;
                  } else {
                    this.field_v = this.field_v - 1;
                    if (this.field_v != 0) {
                      break L14;
                    } else {
                      if (this.field_N != 1) {
                        break L14;
                      } else {
                        this.field_p = 3;
                        break L14;
                      }
                    }
                  }
                }
                this.field_k = this.field_k + 1;
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            this.field_w = this.field_w - 1;
            return;
          }
        } else {
          return;
        }
    }

    final void l(byte param0) {
        if (!(this.field_b == 0)) {
            return;
        }
        this.field_b = 1;
        int var2 = 117 % ((74 - param0) / 47);
    }

    private final int a(int param0) {
        int var2 = 0;
        L0: {
          var2 = -1414832128;
          if (param0 == 0) {
            break L0;
          } else {
            this.field_r = 86;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_M == 0) {
              break L2;
            } else {
              if ((this.field_M ^ -1) != -2) {
                break L1;
              } else {
                var2 = -1436548949;
                if (!Sumoblitz.field_L) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          var2 = -1442815829;
          break L1;
        }
        return var2;
    }

    final void a(boolean param0, int param1, int param2) {
        boolean discarded$2 = false;
        L0: {
          if (-3 == (this.field_Q ^ -1)) {
            L1: {
              L2: {
                if (this.field_K != -1) {
                  break L2;
                } else {
                  if (-1 == this.field_B) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              param2 = this.field_K;
              param1 = this.field_B;
              if (!Sumoblitz.field_L) {
                break L0;
              } else {
                break L1;
              }
            }
            this.field_B = param1;
            this.field_K = param2;
            break L0;
          } else {
            break L0;
          }
        }
        L3: {
          if (!param0) {
            break L3;
          } else {
            discarded$2 = this.g((byte) 123);
            break L3;
          }
        }
        this.b(-108, param1 + -this.field_z >> 2108594088, -this.field_C + param2 >> -198544472);
    }

    final boolean g(byte param0) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -59) {
          return true;
        } else {
          L0: {
            if ((this.field_k + -this.field_H ^ -1) != -981) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean n(int param0) {
        if (param0 <= 54) {
            this.field_P = 112;
        }
        return 36 <= this.field_l ? true : false;
    }

    final boolean a(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 >= 110) {
            break L0;
          } else {
            this.b(true);
            break L0;
          }
        }
        L1: {
          L2: {
            if (0 > this.field_r) {
              break L2;
            } else {
              if (-1 != (this.field_b ^ -1)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final boolean h(int param0) {
        if (param0 != -1) {
            this.b(false);
        }
        return (this.field_x ^ -1) == -1 ? true : false;
    }

    private final int e(byte param0) {
        if (param0 != -5) {
            return 24;
        }
        if (-2 != (this.field_M ^ -1)) {
            return 2560;
        }
        return 5120;
    }

    private final void m(byte param0) {
        this.field_c = 12;
        this.field_n = true;
        this.field_q = new jn();
        ts.a(this.field_C, this.field_q, -16240, 40, lr.field_a[this.field_Q], this.field_z);
        int var2 = 111 % ((param0 - 57) / 38);
        gn.a(19 + fi.a(3, he.field_o, (byte) -96), true);
    }

    private final void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            L2: {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      L7: {
                        var3 = Sumoblitz.field_L ? 1 : 0;
                        var2 = this.field_Q;
                        if ((var2 ^ -1) != -2) {
                          break L7;
                        } else {
                          if (var3 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if ((var2 ^ -1) == -3) {
                        break L5;
                      } else {
                        L8: {
                          if (var2 != 3) {
                            break L8;
                          } else {
                            if (var3 == 0) {
                              break L4;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          if ((var2 ^ -1) != -5) {
                            break L9;
                          } else {
                            if (var3 == 0) {
                              break L3;
                            } else {
                              break L9;
                            }
                          }
                        }
                        if (5 == var2) {
                          break L2;
                        } else {
                          if (0 != var2) {
                            break L0;
                          } else {
                            if (var3 == 0) {
                              break L1;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                    }
                    this.field_a = (rl.field_k << 480287399) + -(rl.field_k << 1377071714);
                    this.field_o = 60;
                    this.field_i = 600;
                    this.field_x = -1;
                    if (var3 == 0) {
                      break L0;
                    } else {
                      break L5;
                    }
                  }
                  this.field_o = 40;
                  this.field_x = -1;
                  this.field_a = -(rl.field_k << 2058852866) + (rl.field_k << 838364583);
                  this.field_i = 2800;
                  this.field_L = 1.0;
                  if (var3 == 0) {
                    break L0;
                  } else {
                    break L4;
                  }
                }
                this.field_o = 80;
                this.field_x = 0;
                this.field_a = rl.field_k << -2015175833;
                this.field_i = 700;
                if (var3 == 0) {
                  break L0;
                } else {
                  break L3;
                }
              }
              this.field_i = 700;
              this.field_a = -(rl.field_k << -945383390) + (rl.field_k << 1160087367);
              this.field_e = 4;
              this.field_u = 4;
              this.field_x = -1;
              this.field_o = 80;
              if (var3 == 0) {
                break L0;
              } else {
                break L2;
              }
            }
            this.field_L = 0.5;
            this.field_a = rl.field_k << 1688842055;
            this.field_i = 1600;
            this.field_x = -1;
            this.field_o = 160;
            if (var3 == 0) {
              break L0;
            } else {
              break L1;
            }
          }
          this.field_x = -1;
          this.field_o = 128;
          this.field_i = 1024;
          this.field_m = 5120;
          break L0;
        }
        L10: {
          L11: {
            L12: {
              L13: {
                L14: {
                  L15: {
                    L16: {
                      var2 = this.field_N;
                      if (var2 == 0) {
                        L17: {
                          if (-1 != (this.field_Q ^ -1)) {
                            break L17;
                          } else {
                            if (var3 == 0) {
                              break L10;
                            } else {
                              break L17;
                            }
                          }
                        }
                        this.field_m = 5120;
                        if (var3 == 0) {
                          break L10;
                        } else {
                          break L16;
                        }
                      } else {
                        if (1 == var2) {
                          break L16;
                        } else {
                          L18: {
                            if (-3 != (var2 ^ -1)) {
                              break L18;
                            } else {
                              if (var3 == 0) {
                                break L15;
                              } else {
                                break L18;
                              }
                            }
                          }
                          L19: {
                            if (3 != var2) {
                              break L19;
                            } else {
                              if (var3 == 0) {
                                break L14;
                              } else {
                                break L19;
                              }
                            }
                          }
                          if (var2 == 4) {
                            break L13;
                          } else {
                            L20: {
                              if (5 != var2) {
                                break L20;
                              } else {
                                if (var3 == 0) {
                                  break L12;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            if (6 == var2) {
                              break L11;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                    }
                    this.field_p = 3;
                    this.field_m = 5120;
                    if (var3 == 0) {
                      break L10;
                    } else {
                      break L15;
                    }
                  }
                  this.field_m = 5120;
                  if (var3 == 0) {
                    break L10;
                  } else {
                    break L14;
                  }
                }
                this.field_L = this.field_L / 2.0;
                this.field_m = 5120;
                if (var3 == 0) {
                  break L10;
                } else {
                  break L13;
                }
              }
              L21: {
                if (this.field_Q != 4) {
                  break L21;
                } else {
                  this.field_e = 4;
                  this.field_u = 1;
                  break L21;
                }
              }
              this.field_m = 3072;
              this.field_o = this.field_o >> 1;
              if (var3 == 0) {
                break L10;
              } else {
                break L12;
              }
            }
            this.field_o = this.field_o << 1;
            this.field_m = 7168;
            if (this.field_Q != 4) {
              break L10;
            } else {
              this.field_e = 0;
              this.field_u = 4;
              if (var3 == 0) {
                break L10;
              } else {
                break L11;
              }
            }
          }
          this.field_m = 14336;
          this.field_u = this.field_Q;
          this.field_o = this.field_o << 1;
          this.field_e = 5;
          this.field_i = this.field_i >> 1;
          break L10;
        }
        L22: {
          if (!rf.a(false)) {
            break L22;
          } else {
            if (this.field_Q != 0) {
              this.field_L = this.field_L * 2.0;
              this.field_i = this.field_i << 1;
              this.field_o = this.field_o << 1;
              break L22;
            } else {
              break L22;
            }
          }
        }
        if (param0 < 89) {
          return;
        } else {
          this.field_m = this.field_m >> 1;
          return;
        }
    }

    private final void b(byte param0) {
        this.field_I = this.field_I + 1;
        if (-11 > (this.field_I ^ -1)) {
            this.field_I = 10;
        }
        if (param0 != 61) {
            this.field_b = 40;
        }
        this.c((byte) 35);
    }

    final void m(int param0) {
        if (param0 >= -50) {
            this.b(true);
        }
        this.field_l = 0;
    }

    final boolean j(int param0) {
        if (param0 != 20) {
            return false;
        }
        return -this.field_H + this.field_k > 1000 ? true : false;
    }

    final boolean g(int param0) {
        if (param0 <= 17) {
            return true;
        }
        return this.field_n;
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Sumoblitz.field_L ? 1 : 0;
          if (param0 < -4) {
            break L0;
          } else {
            this.field_n = true;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              L4: {
                var3 = param1;
                if (0 != var3) {
                  break L4;
                } else {
                  if (var4 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (1 == var3) {
                break L2;
              } else {
                if ((var3 ^ -1) != -3) {
                  break L1;
                } else {
                  if (var4 != 0) {
                    break L3;
                  } else {
                    this.j((byte) 98);
                    break L1;
                  }
                }
              }
            }
            this.b((byte) 61);
            if (var4 == 0) {
              break L1;
            } else {
              break L2;
            }
          }
          this.e(0);
          if (var4 == 0) {
            break L1;
          } else {
            this.j((byte) 98);
            break L1;
          }
        }
    }

    private final void b(int param0) {
        boolean discarded$0 = false;
        if ((this.field_m ^ -1) < -2561) {
            this.field_m = 2560;
        }
        this.field_M = -1;
        this.c((byte) 35);
        if (param0 != 677397768) {
            discarded$0 = this.f((byte) 38);
        }
    }

    private final boolean f(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ah var7 = null;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var7 = aa.field_a[0];
          if (param0 >= 53) {
            break L0;
          } else {
            this.field_N = 4;
            break L0;
          }
        }
        if (var7 == null) {
          return true;
        } else {
          if (var7.equals(this)) {
            return true;
          } else {
            var3 = this.field_m + var7.field_m;
            if (!wn.a(var7.field_z, var3, -115, this.field_C, var7.field_C, this.field_z)) {
              return true;
            } else {
              L1: {
                var4 = -var7.field_C + this.field_C;
                if (var4 != 0) {
                  break L1;
                } else {
                  var4 = -1 + (2 & this.field_k << -2058813855);
                  break L1;
                }
              }
              L2: {
                var5 = this.field_z + -var7.field_z;
                if (0 != var5) {
                  break L2;
                } else {
                  var5 = -1 + ((1 & this.field_k) << -1157820447);
                  break L2;
                }
              }
              L3: {
                var6 = (int)Math.round(Math.sqrt((double)((float)var4 * (float)var4 + (float)var5 * (float)var5)));
                if (var6 < var3) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L3;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L3;
                }
              }
              return stackIn_16_0 != 0;
            }
          }
        }
    }

    final void a(ha param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        nt var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        hr stackIn_24_0 = null;
        float stackIn_24_1 = 0.0f;
        float stackIn_24_2 = 0.0f;
        hr stackIn_25_0 = null;
        float stackIn_25_1 = 0.0f;
        float stackIn_25_2 = 0.0f;
        hr stackIn_26_0 = null;
        float stackIn_26_1 = 0.0f;
        float stackIn_26_2 = 0.0f;
        int stackIn_26_3 = 0;
        hr stackIn_33_0 = null;
        float stackIn_33_1 = 0.0f;
        float stackIn_33_2 = 0.0f;
        hr stackIn_34_0 = null;
        float stackIn_34_1 = 0.0f;
        float stackIn_34_2 = 0.0f;
        hr stackIn_35_0 = null;
        float stackIn_35_1 = 0.0f;
        float stackIn_35_2 = 0.0f;
        int stackIn_35_3 = 0;
        hr stackIn_38_0 = null;
        float stackIn_38_1 = 0.0f;
        float stackIn_38_2 = 0.0f;
        hr stackIn_39_0 = null;
        float stackIn_39_1 = 0.0f;
        float stackIn_39_2 = 0.0f;
        hr stackIn_40_0 = null;
        float stackIn_40_1 = 0.0f;
        float stackIn_40_2 = 0.0f;
        int stackIn_40_3 = 0;
        hr stackIn_43_0 = null;
        float stackIn_43_1 = 0.0f;
        float stackIn_43_2 = 0.0f;
        double stackIn_43_3 = 0.0;
        hr stackIn_44_0 = null;
        float stackIn_44_1 = 0.0f;
        float stackIn_44_2 = 0.0f;
        double stackIn_44_3 = 0.0;
        hr stackIn_45_0 = null;
        float stackIn_45_1 = 0.0f;
        float stackIn_45_2 = 0.0f;
        double stackIn_45_3 = 0.0;
        int stackIn_45_4 = 0;
        ha stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        int stackIn_47_3 = 0;
        int stackIn_47_4 = 0;
        ha stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
        int stackIn_48_3 = 0;
        int stackIn_48_4 = 0;
        ha stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        int stackIn_49_3 = 0;
        int stackIn_49_4 = 0;
        int stackIn_49_5 = 0;
        hr stackIn_51_0 = null;
        float stackIn_51_1 = 0.0f;
        float stackIn_51_2 = 0.0f;
        hr stackIn_52_0 = null;
        float stackIn_52_1 = 0.0f;
        float stackIn_52_2 = 0.0f;
        hr stackIn_53_0 = null;
        float stackIn_53_1 = 0.0f;
        float stackIn_53_2 = 0.0f;
        int stackIn_53_3 = 0;
        hr stackIn_55_0 = null;
        float stackIn_55_1 = 0.0f;
        float stackIn_55_2 = 0.0f;
        hr stackIn_56_0 = null;
        float stackIn_56_1 = 0.0f;
        float stackIn_56_2 = 0.0f;
        hr stackIn_57_0 = null;
        float stackIn_57_1 = 0.0f;
        float stackIn_57_2 = 0.0f;
        int stackIn_57_3 = 0;
        hr stackIn_68_0 = null;
        float stackIn_68_1 = 0.0f;
        float stackIn_68_2 = 0.0f;
        double stackIn_68_3 = 0.0;
        hr stackIn_69_0 = null;
        float stackIn_69_1 = 0.0f;
        float stackIn_69_2 = 0.0f;
        double stackIn_69_3 = 0.0;
        hr stackIn_70_0 = null;
        float stackIn_70_1 = 0.0f;
        float stackIn_70_2 = 0.0f;
        double stackIn_70_3 = 0.0;
        int stackIn_70_4 = 0;
        hr stackIn_75_0 = null;
        float stackIn_75_1 = 0.0f;
        float stackIn_75_2 = 0.0f;
        double stackIn_75_3 = 0.0;
        hr stackIn_76_0 = null;
        float stackIn_76_1 = 0.0f;
        float stackIn_76_2 = 0.0f;
        double stackIn_76_3 = 0.0;
        hr stackIn_77_0 = null;
        float stackIn_77_1 = 0.0f;
        float stackIn_77_2 = 0.0f;
        double stackIn_77_3 = 0.0;
        int stackIn_77_4 = 0;
        hr stackIn_80_0 = null;
        float stackIn_80_1 = 0.0f;
        float stackIn_80_2 = 0.0f;
        double stackIn_80_3 = 0.0;
        hr stackIn_81_0 = null;
        float stackIn_81_1 = 0.0f;
        float stackIn_81_2 = 0.0f;
        double stackIn_81_3 = 0.0;
        hr stackIn_82_0 = null;
        float stackIn_82_1 = 0.0f;
        float stackIn_82_2 = 0.0f;
        double stackIn_82_3 = 0.0;
        int stackIn_82_4 = 0;
        hr stackIn_85_0 = null;
        float stackIn_85_1 = 0.0f;
        float stackIn_85_2 = 0.0f;
        double stackIn_85_3 = 0.0;
        hr stackIn_86_0 = null;
        float stackIn_86_1 = 0.0f;
        float stackIn_86_2 = 0.0f;
        double stackIn_86_3 = 0.0;
        hr stackIn_87_0 = null;
        float stackIn_87_1 = 0.0f;
        float stackIn_87_2 = 0.0f;
        double stackIn_87_3 = 0.0;
        int stackIn_87_4 = 0;
        hr stackIn_91_0 = null;
        float stackIn_91_1 = 0.0f;
        float stackIn_91_2 = 0.0f;
        double stackIn_91_3 = 0.0;
        hr stackIn_92_0 = null;
        float stackIn_92_1 = 0.0f;
        float stackIn_92_2 = 0.0f;
        double stackIn_92_3 = 0.0;
        hr stackIn_93_0 = null;
        float stackIn_93_1 = 0.0f;
        float stackIn_93_2 = 0.0f;
        double stackIn_93_3 = 0.0;
        int stackIn_93_4 = 0;
        hr stackIn_95_0 = null;
        float stackIn_95_1 = 0.0f;
        float stackIn_95_2 = 0.0f;
        hr stackIn_96_0 = null;
        float stackIn_96_1 = 0.0f;
        float stackIn_96_2 = 0.0f;
        hr stackIn_97_0 = null;
        float stackIn_97_1 = 0.0f;
        float stackIn_97_2 = 0.0f;
        int stackIn_97_3 = 0;
        hr stackIn_129_0 = null;
        float stackIn_129_1 = 0.0f;
        float stackIn_129_2 = 0.0f;
        double stackIn_129_3 = 0.0;
        hr stackIn_130_0 = null;
        float stackIn_130_1 = 0.0f;
        float stackIn_130_2 = 0.0f;
        double stackIn_130_3 = 0.0;
        hr stackIn_131_0 = null;
        float stackIn_131_1 = 0.0f;
        float stackIn_131_2 = 0.0f;
        double stackIn_131_3 = 0.0;
        int stackIn_131_4 = 0;
        RuntimeException stackIn_134_0 = null;
        StringBuilder stackIn_134_1 = null;
        RuntimeException stackIn_135_0 = null;
        StringBuilder stackIn_135_1 = null;
        RuntimeException stackIn_136_0 = null;
        StringBuilder stackIn_136_1 = null;
        String stackIn_136_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        hr stackOut_23_0 = null;
        float stackOut_23_1 = 0.0f;
        float stackOut_23_2 = 0.0f;
        hr stackOut_25_0 = null;
        float stackOut_25_1 = 0.0f;
        float stackOut_25_2 = 0.0f;
        int stackOut_25_3 = 0;
        hr stackOut_24_0 = null;
        float stackOut_24_1 = 0.0f;
        float stackOut_24_2 = 0.0f;
        int stackOut_24_3 = 0;
        hr stackOut_32_0 = null;
        float stackOut_32_1 = 0.0f;
        float stackOut_32_2 = 0.0f;
        hr stackOut_34_0 = null;
        float stackOut_34_1 = 0.0f;
        float stackOut_34_2 = 0.0f;
        int stackOut_34_3 = 0;
        hr stackOut_33_0 = null;
        float stackOut_33_1 = 0.0f;
        float stackOut_33_2 = 0.0f;
        int stackOut_33_3 = 0;
        hr stackOut_37_0 = null;
        float stackOut_37_1 = 0.0f;
        float stackOut_37_2 = 0.0f;
        hr stackOut_39_0 = null;
        float stackOut_39_1 = 0.0f;
        float stackOut_39_2 = 0.0f;
        int stackOut_39_3 = 0;
        hr stackOut_38_0 = null;
        float stackOut_38_1 = 0.0f;
        float stackOut_38_2 = 0.0f;
        int stackOut_38_3 = 0;
        hr stackOut_42_0 = null;
        float stackOut_42_1 = 0.0f;
        float stackOut_42_2 = 0.0f;
        double stackOut_42_3 = 0.0;
        hr stackOut_44_0 = null;
        float stackOut_44_1 = 0.0f;
        float stackOut_44_2 = 0.0f;
        double stackOut_44_3 = 0.0;
        int stackOut_44_4 = 0;
        hr stackOut_43_0 = null;
        float stackOut_43_1 = 0.0f;
        float stackOut_43_2 = 0.0f;
        double stackOut_43_3 = 0.0;
        int stackOut_43_4 = 0;
        ha stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        int stackOut_46_3 = 0;
        int stackOut_46_4 = 0;
        ha stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        int stackOut_48_3 = 0;
        int stackOut_48_4 = 0;
        int stackOut_48_5 = 0;
        ha stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        int stackOut_47_3 = 0;
        int stackOut_47_4 = 0;
        int stackOut_47_5 = 0;
        hr stackOut_50_0 = null;
        float stackOut_50_1 = 0.0f;
        float stackOut_50_2 = 0.0f;
        hr stackOut_52_0 = null;
        float stackOut_52_1 = 0.0f;
        float stackOut_52_2 = 0.0f;
        int stackOut_52_3 = 0;
        hr stackOut_51_0 = null;
        float stackOut_51_1 = 0.0f;
        float stackOut_51_2 = 0.0f;
        int stackOut_51_3 = 0;
        hr stackOut_54_0 = null;
        float stackOut_54_1 = 0.0f;
        float stackOut_54_2 = 0.0f;
        hr stackOut_56_0 = null;
        float stackOut_56_1 = 0.0f;
        float stackOut_56_2 = 0.0f;
        int stackOut_56_3 = 0;
        hr stackOut_55_0 = null;
        float stackOut_55_1 = 0.0f;
        float stackOut_55_2 = 0.0f;
        int stackOut_55_3 = 0;
        hr stackOut_67_0 = null;
        float stackOut_67_1 = 0.0f;
        float stackOut_67_2 = 0.0f;
        double stackOut_67_3 = 0.0;
        hr stackOut_69_0 = null;
        float stackOut_69_1 = 0.0f;
        float stackOut_69_2 = 0.0f;
        double stackOut_69_3 = 0.0;
        int stackOut_69_4 = 0;
        hr stackOut_68_0 = null;
        float stackOut_68_1 = 0.0f;
        float stackOut_68_2 = 0.0f;
        double stackOut_68_3 = 0.0;
        int stackOut_68_4 = 0;
        hr stackOut_74_0 = null;
        float stackOut_74_1 = 0.0f;
        float stackOut_74_2 = 0.0f;
        double stackOut_74_3 = 0.0;
        hr stackOut_76_0 = null;
        float stackOut_76_1 = 0.0f;
        float stackOut_76_2 = 0.0f;
        double stackOut_76_3 = 0.0;
        int stackOut_76_4 = 0;
        hr stackOut_75_0 = null;
        float stackOut_75_1 = 0.0f;
        float stackOut_75_2 = 0.0f;
        double stackOut_75_3 = 0.0;
        int stackOut_75_4 = 0;
        hr stackOut_79_0 = null;
        float stackOut_79_1 = 0.0f;
        float stackOut_79_2 = 0.0f;
        double stackOut_79_3 = 0.0;
        hr stackOut_81_0 = null;
        float stackOut_81_1 = 0.0f;
        float stackOut_81_2 = 0.0f;
        double stackOut_81_3 = 0.0;
        int stackOut_81_4 = 0;
        hr stackOut_80_0 = null;
        float stackOut_80_1 = 0.0f;
        float stackOut_80_2 = 0.0f;
        double stackOut_80_3 = 0.0;
        int stackOut_80_4 = 0;
        hr stackOut_84_0 = null;
        float stackOut_84_1 = 0.0f;
        float stackOut_84_2 = 0.0f;
        double stackOut_84_3 = 0.0;
        hr stackOut_86_0 = null;
        float stackOut_86_1 = 0.0f;
        float stackOut_86_2 = 0.0f;
        double stackOut_86_3 = 0.0;
        int stackOut_86_4 = 0;
        hr stackOut_85_0 = null;
        float stackOut_85_1 = 0.0f;
        float stackOut_85_2 = 0.0f;
        double stackOut_85_3 = 0.0;
        int stackOut_85_4 = 0;
        hr stackOut_90_0 = null;
        float stackOut_90_1 = 0.0f;
        float stackOut_90_2 = 0.0f;
        double stackOut_90_3 = 0.0;
        hr stackOut_92_0 = null;
        float stackOut_92_1 = 0.0f;
        float stackOut_92_2 = 0.0f;
        double stackOut_92_3 = 0.0;
        int stackOut_92_4 = 0;
        hr stackOut_91_0 = null;
        float stackOut_91_1 = 0.0f;
        float stackOut_91_2 = 0.0f;
        double stackOut_91_3 = 0.0;
        int stackOut_91_4 = 0;
        hr stackOut_94_0 = null;
        float stackOut_94_1 = 0.0f;
        float stackOut_94_2 = 0.0f;
        hr stackOut_96_0 = null;
        float stackOut_96_1 = 0.0f;
        float stackOut_96_2 = 0.0f;
        int stackOut_96_3 = 0;
        hr stackOut_95_0 = null;
        float stackOut_95_1 = 0.0f;
        float stackOut_95_2 = 0.0f;
        int stackOut_95_3 = 0;
        hr stackOut_128_0 = null;
        float stackOut_128_1 = 0.0f;
        float stackOut_128_2 = 0.0f;
        double stackOut_128_3 = 0.0;
        hr stackOut_130_0 = null;
        float stackOut_130_1 = 0.0f;
        float stackOut_130_2 = 0.0f;
        double stackOut_130_3 = 0.0;
        int stackOut_130_4 = 0;
        hr stackOut_129_0 = null;
        float stackOut_129_1 = 0.0f;
        float stackOut_129_2 = 0.0f;
        double stackOut_129_3 = 0.0;
        int stackOut_129_4 = 0;
        RuntimeException stackOut_133_0 = null;
        StringBuilder stackOut_133_1 = null;
        RuntimeException stackOut_135_0 = null;
        StringBuilder stackOut_135_1 = null;
        String stackOut_135_2 = null;
        RuntimeException stackOut_134_0 = null;
        StringBuilder stackOut_134_1 = null;
        String stackOut_134_2 = null;
        var14 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-1 != (this.field_b ^ -1)) {
                stackOut_3_0 = this.field_b * this.field_b << 2103773192;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 0;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var3_int = stackIn_4_0;
              if (param1 == 19399) {
                break L2;
              } else {
                this.field_i = -91;
                break L2;
              }
            }
            L3: {
              if (-1 >= (this.field_r ^ -1)) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L3;
              } else {
                stackOut_7_0 = this.field_r * (this.field_r * this.field_m) / 2500;
                stackIn_9_0 = stackOut_7_0;
                break L3;
              }
            }
            var4 = stackIn_9_0;
            var5 = this.field_m - (-var3_int + var4) >> 120577384;
            var6 = Math.max(0, 255 + -(this.field_b * this.field_b)) << 868142008;
            var7 = (nt) ((Object) this.field_q.b(-80));
            L4: while (true) {
              L5: {
                L6: {
                  L7: {
                    if (var7 == null) {
                      break L7;
                    } else {
                      var7.a(param0, -127);
                      var7 = (nt) ((Object) this.field_q.d((byte) 18));
                      if (var14 != 0) {
                        break L6;
                      } else {
                        if (var14 == 0) {
                          continue L4;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  if (0 > this.field_r) {
                    break L6;
                  } else {
                    break L5;
                  }
                }
                ts.field_e[this.field_Q].a((float)(this.field_C >> 1342574344), (float)(this.field_z >> -1312488472), (int)(3072.0 * ((double)(this.field_m >> 1548462696) / 14.0)), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                break L5;
              }
              L8: {
                if (this.field_b != 0) {
                  break L8;
                } else {
                  L9: {
                    L10: {
                      if (this.field_Q != 0) {
                        break L10;
                      } else {
                        L11: {
                          L12: {
                            if (!this.j(20)) {
                              break L12;
                            } else {
                              if (0 >= this.field_l) {
                                break L12;
                              } else {
                                if (-1 == (ul.field_f ^ -1)) {
                                  break L11;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                          L13: {
                            stackOut_23_0 = ht.field_e[0];
                            stackOut_23_1 = (float)(this.field_C >> 1093394152);
                            stackOut_23_2 = (float)(this.field_z >> 375796840);
                            stackIn_25_0 = stackOut_23_0;
                            stackIn_25_1 = stackOut_23_1;
                            stackIn_25_2 = stackOut_23_2;
                            stackIn_24_0 = stackOut_23_0;
                            stackIn_24_1 = stackOut_23_1;
                            stackIn_24_2 = stackOut_23_2;
                            if (!this.g(114)) {
                              stackOut_25_0 = (hr) ((Object) stackIn_25_0);
                              stackOut_25_1 = stackIn_25_1;
                              stackOut_25_2 = stackIn_25_2;
                              stackOut_25_3 = var5;
                              stackIn_26_0 = stackOut_25_0;
                              stackIn_26_1 = stackOut_25_1;
                              stackIn_26_2 = stackOut_25_2;
                              stackIn_26_3 = stackOut_25_3;
                              break L13;
                            } else {
                              stackOut_24_0 = (hr) ((Object) stackIn_24_0);
                              stackOut_24_1 = stackIn_24_1;
                              stackOut_24_2 = stackIn_24_2;
                              stackOut_24_3 = 5120;
                              stackIn_26_0 = stackOut_24_0;
                              stackIn_26_1 = stackOut_24_1;
                              stackIn_26_2 = stackOut_24_2;
                              stackIn_26_3 = stackOut_24_3;
                              break L13;
                            }
                          }
                          ((hr) (Object) stackIn_26_0).a(stackIn_26_1, stackIn_26_2, (int)((double)stackIn_26_3 / 14.0 * 3072.0), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                          if (var14 == 0) {
                            break L9;
                          } else {
                            break L11;
                          }
                        }
                        ht.field_e[6 + -(this.field_l / 7) + 3].a((float)(this.field_C >> 261369544), (float)(this.field_z >> -1794895480), (int)(3072.0 * ((double)var5 / 14.0)), (int)(32768.0 * this.field_s / 3.141592653589793), 1, 0, 2);
                        if (var14 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L14: {
                      if (this.field_Q == 1) {
                        break L14;
                      } else {
                        L15: {
                          if (-3 == (this.field_Q ^ -1)) {
                            break L15;
                          } else {
                            L16: {
                              if (-4 != (this.field_Q ^ -1)) {
                                break L16;
                              } else {
                                L17: {
                                  stackOut_32_0 = s.field_n[0];
                                  stackOut_32_1 = (float)(this.field_C >> 1207855496);
                                  stackOut_32_2 = (float)(this.field_z >> -299524152);
                                  stackIn_34_0 = stackOut_32_0;
                                  stackIn_34_1 = stackOut_32_1;
                                  stackIn_34_2 = stackOut_32_2;
                                  stackIn_33_0 = stackOut_32_0;
                                  stackIn_33_1 = stackOut_32_1;
                                  stackIn_33_2 = stackOut_32_2;
                                  if (this.g(106)) {
                                    stackOut_34_0 = (hr) ((Object) stackIn_34_0);
                                    stackOut_34_1 = stackIn_34_1;
                                    stackOut_34_2 = stackIn_34_2;
                                    stackOut_34_3 = 20;
                                    stackIn_35_0 = stackOut_34_0;
                                    stackIn_35_1 = stackOut_34_1;
                                    stackIn_35_2 = stackOut_34_2;
                                    stackIn_35_3 = stackOut_34_3;
                                    break L17;
                                  } else {
                                    stackOut_33_0 = (hr) ((Object) stackIn_33_0);
                                    stackOut_33_1 = stackIn_33_1;
                                    stackOut_33_2 = stackIn_33_2;
                                    stackOut_33_3 = var5;
                                    stackIn_35_0 = stackOut_33_0;
                                    stackIn_35_1 = stackOut_33_1;
                                    stackIn_35_2 = stackOut_33_2;
                                    stackIn_35_3 = stackOut_33_3;
                                    break L17;
                                  }
                                }
                                ((hr) (Object) stackIn_35_0).a(stackIn_35_1, stackIn_35_2, (int)((double)stackIn_35_3 / 14.0 * 3072.0), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                                if (var14 == 0) {
                                  break L9;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            L18: {
                              if (this.field_Q != 4) {
                                break L18;
                              } else {
                                L19: {
                                  stackOut_37_0 = ak.field_a[0];
                                  stackOut_37_1 = (float)(this.field_C >> 189386920);
                                  stackOut_37_2 = (float)(this.field_z >> 1604747752);
                                  stackIn_39_0 = stackOut_37_0;
                                  stackIn_39_1 = stackOut_37_1;
                                  stackIn_39_2 = stackOut_37_2;
                                  stackIn_38_0 = stackOut_37_0;
                                  stackIn_38_1 = stackOut_37_1;
                                  stackIn_38_2 = stackOut_37_2;
                                  if (!this.g(27)) {
                                    stackOut_39_0 = (hr) ((Object) stackIn_39_0);
                                    stackOut_39_1 = stackIn_39_1;
                                    stackOut_39_2 = stackIn_39_2;
                                    stackOut_39_3 = var5;
                                    stackIn_40_0 = stackOut_39_0;
                                    stackIn_40_1 = stackOut_39_1;
                                    stackIn_40_2 = stackOut_39_2;
                                    stackIn_40_3 = stackOut_39_3;
                                    break L19;
                                  } else {
                                    stackOut_38_0 = (hr) ((Object) stackIn_38_0);
                                    stackOut_38_1 = stackIn_38_1;
                                    stackOut_38_2 = stackIn_38_2;
                                    stackOut_38_3 = 20;
                                    stackIn_40_0 = stackOut_38_0;
                                    stackIn_40_1 = stackOut_38_1;
                                    stackIn_40_2 = stackOut_38_2;
                                    stackIn_40_3 = stackOut_38_3;
                                    break L19;
                                  }
                                }
                                ((hr) (Object) stackIn_40_0).a(stackIn_40_1, stackIn_40_2, (int)((double)stackIn_40_3 / 14.0 * 3072.0), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                                if (var14 == 0) {
                                  break L9;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            L20: {
                              if (5 != this.field_Q) {
                                break L20;
                              } else {
                                L21: {
                                  stackOut_42_0 = mr.field_e[0];
                                  stackOut_42_1 = (float)(this.field_C >> -1892212856);
                                  stackOut_42_2 = (float)(this.field_z >> -1487166040);
                                  stackOut_42_3 = 3072.0;
                                  stackIn_44_0 = stackOut_42_0;
                                  stackIn_44_1 = stackOut_42_1;
                                  stackIn_44_2 = stackOut_42_2;
                                  stackIn_44_3 = stackOut_42_3;
                                  stackIn_43_0 = stackOut_42_0;
                                  stackIn_43_1 = stackOut_42_1;
                                  stackIn_43_2 = stackOut_42_2;
                                  stackIn_43_3 = stackOut_42_3;
                                  if (this.g(param1 + -19316)) {
                                    stackOut_44_0 = (hr) ((Object) stackIn_44_0);
                                    stackOut_44_1 = stackIn_44_1;
                                    stackOut_44_2 = stackIn_44_2;
                                    stackOut_44_3 = stackIn_44_3;
                                    stackOut_44_4 = 20;
                                    stackIn_45_0 = stackOut_44_0;
                                    stackIn_45_1 = stackOut_44_1;
                                    stackIn_45_2 = stackOut_44_2;
                                    stackIn_45_3 = stackOut_44_3;
                                    stackIn_45_4 = stackOut_44_4;
                                    break L21;
                                  } else {
                                    stackOut_43_0 = (hr) ((Object) stackIn_43_0);
                                    stackOut_43_1 = stackIn_43_1;
                                    stackOut_43_2 = stackIn_43_2;
                                    stackOut_43_3 = stackIn_43_3;
                                    stackOut_43_4 = var5;
                                    stackIn_45_0 = stackOut_43_0;
                                    stackIn_45_1 = stackOut_43_1;
                                    stackIn_45_2 = stackOut_43_2;
                                    stackIn_45_3 = stackOut_43_3;
                                    stackIn_45_4 = stackOut_43_4;
                                    break L21;
                                  }
                                }
                                ((hr) (Object) stackIn_45_0).a(stackIn_45_1, stackIn_45_2, (int)(stackIn_45_3 * ((double)stackIn_45_4 / 14.0)), (int)(32768.0 * this.field_s / 3.141592653589793), 1, 0, 2);
                                if (var14 == 0) {
                                  break L9;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            L22: {
                              stackOut_46_0 = (ha) (param0);
                              stackOut_46_1 = this.field_C >> -1328135608;
                              stackOut_46_2 = this.field_z >> 163378280;
                              stackOut_46_3 = var5;
                              stackOut_46_4 = var6 + dp.a(-26346, this.field_Q);
                              stackIn_48_0 = stackOut_46_0;
                              stackIn_48_1 = stackOut_46_1;
                              stackIn_48_2 = stackOut_46_2;
                              stackIn_48_3 = stackOut_46_3;
                              stackIn_48_4 = stackOut_46_4;
                              stackIn_47_0 = stackOut_46_0;
                              stackIn_47_1 = stackOut_46_1;
                              stackIn_47_2 = stackOut_46_2;
                              stackIn_47_3 = stackOut_46_3;
                              stackIn_47_4 = stackOut_46_4;
                              if (var6 != 255) {
                                stackOut_48_0 = (ha) ((Object) stackIn_48_0);
                                stackOut_48_1 = stackIn_48_1;
                                stackOut_48_2 = stackIn_48_2;
                                stackOut_48_3 = stackIn_48_3;
                                stackOut_48_4 = stackIn_48_4;
                                stackOut_48_5 = 1;
                                stackIn_49_0 = stackOut_48_0;
                                stackIn_49_1 = stackOut_48_1;
                                stackIn_49_2 = stackOut_48_2;
                                stackIn_49_3 = stackOut_48_3;
                                stackIn_49_4 = stackOut_48_4;
                                stackIn_49_5 = stackOut_48_5;
                                break L22;
                              } else {
                                stackOut_47_0 = (ha) ((Object) stackIn_47_0);
                                stackOut_47_1 = stackIn_47_1;
                                stackOut_47_2 = stackIn_47_2;
                                stackOut_47_3 = stackIn_47_3;
                                stackOut_47_4 = stackIn_47_4;
                                stackOut_47_5 = 0;
                                stackIn_49_0 = stackOut_47_0;
                                stackIn_49_1 = stackOut_47_1;
                                stackIn_49_2 = stackOut_47_2;
                                stackIn_49_3 = stackOut_47_3;
                                stackIn_49_4 = stackOut_47_4;
                                stackIn_49_5 = stackOut_47_5;
                                break L22;
                              }
                            }
                            ((ha) (Object) stackIn_49_0).s(stackIn_49_1, stackIn_49_2, stackIn_49_3, stackIn_49_4, stackIn_49_5);
                            if (var14 == 0) {
                              break L9;
                            } else {
                              break L15;
                            }
                          }
                        }
                        L23: {
                          stackOut_50_0 = hv.field_d[0];
                          stackOut_50_1 = (float)(this.field_C >> 1158452072);
                          stackOut_50_2 = (float)(this.field_z >> -908871608);
                          stackIn_52_0 = stackOut_50_0;
                          stackIn_52_1 = stackOut_50_1;
                          stackIn_52_2 = stackOut_50_2;
                          stackIn_51_0 = stackOut_50_0;
                          stackIn_51_1 = stackOut_50_1;
                          stackIn_51_2 = stackOut_50_2;
                          if (!this.g(37)) {
                            stackOut_52_0 = (hr) ((Object) stackIn_52_0);
                            stackOut_52_1 = stackIn_52_1;
                            stackOut_52_2 = stackIn_52_2;
                            stackOut_52_3 = var5;
                            stackIn_53_0 = stackOut_52_0;
                            stackIn_53_1 = stackOut_52_1;
                            stackIn_53_2 = stackOut_52_2;
                            stackIn_53_3 = stackOut_52_3;
                            break L23;
                          } else {
                            stackOut_51_0 = (hr) ((Object) stackIn_51_0);
                            stackOut_51_1 = stackIn_51_1;
                            stackOut_51_2 = stackIn_51_2;
                            stackOut_51_3 = 20;
                            stackIn_53_0 = stackOut_51_0;
                            stackIn_53_1 = stackOut_51_1;
                            stackIn_53_2 = stackOut_51_2;
                            stackIn_53_3 = stackOut_51_3;
                            break L23;
                          }
                        }
                        ((hr) (Object) stackIn_53_0).a(stackIn_53_1, stackIn_53_2, (int)((double)stackIn_53_3 / 14.0 * 3072.0), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                        if (var14 == 0) {
                          break L9;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L24: {
                      stackOut_54_0 = dc.field_ab[0];
                      stackOut_54_1 = (float)(this.field_C >> 927252584);
                      stackOut_54_2 = (float)(this.field_z >> 677397768);
                      stackIn_56_0 = stackOut_54_0;
                      stackIn_56_1 = stackOut_54_1;
                      stackIn_56_2 = stackOut_54_2;
                      stackIn_55_0 = stackOut_54_0;
                      stackIn_55_1 = stackOut_54_1;
                      stackIn_55_2 = stackOut_54_2;
                      if (!this.g(28)) {
                        stackOut_56_0 = (hr) ((Object) stackIn_56_0);
                        stackOut_56_1 = stackIn_56_1;
                        stackOut_56_2 = stackIn_56_2;
                        stackOut_56_3 = var5;
                        stackIn_57_0 = stackOut_56_0;
                        stackIn_57_1 = stackOut_56_1;
                        stackIn_57_2 = stackOut_56_2;
                        stackIn_57_3 = stackOut_56_3;
                        break L24;
                      } else {
                        stackOut_55_0 = (hr) ((Object) stackIn_55_0);
                        stackOut_55_1 = stackIn_55_1;
                        stackOut_55_2 = stackIn_55_2;
                        stackOut_55_3 = 20;
                        stackIn_57_0 = stackOut_55_0;
                        stackIn_57_1 = stackOut_55_1;
                        stackIn_57_2 = stackOut_55_2;
                        stackIn_57_3 = stackOut_55_3;
                        break L24;
                      }
                    }
                    ((hr) (Object) stackIn_57_0).a(stackIn_57_1, stackIn_57_2, (int)((double)stackIn_57_3 / 14.0 * 3072.0), (int)(32768.0 * this.field_s / 3.141592653589793), 1, 0, 2);
                    break L9;
                  }
                  if (!this.g(param1 + -19310)) {
                    break L8;
                  } else {
                    if (ul.field_f != 0) {
                      break L8;
                    } else {
                      kw.field_a.a((float)(this.field_C >> 1524158824), (float)(this.field_z >> 447990856), (int)((double)var5 / 28.0 * 3072.0), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                      break L8;
                    }
                  }
                }
              }
              L25: {
                var8 = this.field_E;
                var9 = this.field_A;
                var10 = var5 >> -645284735;
                var11 = (int)Math.round(Math.sqrt((double)((float)this.field_A * (float)this.field_A + (float)this.field_E * (float)this.field_E)));
                if (-1025 > (var11 ^ -1)) {
                  var8 = (this.field_E << -793618390) / var11;
                  var9 = (this.field_A << 1551164650) / var11;
                  break L25;
                } else {
                  break L25;
                }
              }
              L26: {
                L27: {
                  if (this.h(-1)) {
                    break L27;
                  } else {
                    if ((this.field_b ^ -1) < -1) {
                      break L26;
                    } else {
                      L28: {
                        if (this.field_Q != 0) {
                          break L28;
                        } else {
                          L29: {
                            stackOut_67_0 = ht.field_e[1];
                            stackOut_67_1 = (float)(var8 + this.field_C >> 1355160584);
                            stackOut_67_2 = (float)(this.field_z + var9 >> 979460584);
                            stackOut_67_3 = 4096.0;
                            stackIn_69_0 = stackOut_67_0;
                            stackIn_69_1 = stackOut_67_1;
                            stackIn_69_2 = stackOut_67_2;
                            stackIn_69_3 = stackOut_67_3;
                            stackIn_68_0 = stackOut_67_0;
                            stackIn_68_1 = stackOut_67_1;
                            stackIn_68_2 = stackOut_67_2;
                            stackIn_68_3 = stackOut_67_3;
                            if (this.g(78)) {
                              stackOut_69_0 = (hr) ((Object) stackIn_69_0);
                              stackOut_69_1 = stackIn_69_1;
                              stackOut_69_2 = stackIn_69_2;
                              stackOut_69_3 = stackIn_69_3;
                              stackOut_69_4 = 10;
                              stackIn_70_0 = stackOut_69_0;
                              stackIn_70_1 = stackOut_69_1;
                              stackIn_70_2 = stackOut_69_2;
                              stackIn_70_3 = stackOut_69_3;
                              stackIn_70_4 = stackOut_69_4;
                              break L29;
                            } else {
                              stackOut_68_0 = (hr) ((Object) stackIn_68_0);
                              stackOut_68_1 = stackIn_68_1;
                              stackOut_68_2 = stackIn_68_2;
                              stackOut_68_3 = stackIn_68_3;
                              stackOut_68_4 = var10;
                              stackIn_70_0 = stackOut_68_0;
                              stackIn_70_1 = stackOut_68_1;
                              stackIn_70_2 = stackOut_68_2;
                              stackIn_70_3 = stackOut_68_3;
                              stackIn_70_4 = stackOut_68_4;
                              break L29;
                            }
                          }
                          ((hr) (Object) stackIn_70_0).a(stackIn_70_1, stackIn_70_2, (int)(stackIn_70_3 * ((double)stackIn_70_4 / 14.0)), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                          if (var14 == 0) {
                            break L26;
                          } else {
                            break L28;
                          }
                        }
                      }
                      L30: {
                        if (1 == this.field_Q) {
                          break L30;
                        } else {
                          L31: {
                            if (2 == this.field_Q) {
                              break L31;
                            } else {
                              L32: {
                                if (this.field_Q != 3) {
                                  break L32;
                                } else {
                                  L33: {
                                    stackOut_74_0 = s.field_n[1];
                                    stackOut_74_1 = (float)(this.field_C - -var8 >> 1905617448);
                                    stackOut_74_2 = (float)(var9 + this.field_z >> 1430280776);
                                    stackOut_74_3 = 4096.0;
                                    stackIn_76_0 = stackOut_74_0;
                                    stackIn_76_1 = stackOut_74_1;
                                    stackIn_76_2 = stackOut_74_2;
                                    stackIn_76_3 = stackOut_74_3;
                                    stackIn_75_0 = stackOut_74_0;
                                    stackIn_75_1 = stackOut_74_1;
                                    stackIn_75_2 = stackOut_74_2;
                                    stackIn_75_3 = stackOut_74_3;
                                    if (!this.g(param1 ^ 19425)) {
                                      stackOut_76_0 = (hr) ((Object) stackIn_76_0);
                                      stackOut_76_1 = stackIn_76_1;
                                      stackOut_76_2 = stackIn_76_2;
                                      stackOut_76_3 = stackIn_76_3;
                                      stackOut_76_4 = var10;
                                      stackIn_77_0 = stackOut_76_0;
                                      stackIn_77_1 = stackOut_76_1;
                                      stackIn_77_2 = stackOut_76_2;
                                      stackIn_77_3 = stackOut_76_3;
                                      stackIn_77_4 = stackOut_76_4;
                                      break L33;
                                    } else {
                                      stackOut_75_0 = (hr) ((Object) stackIn_75_0);
                                      stackOut_75_1 = stackIn_75_1;
                                      stackOut_75_2 = stackIn_75_2;
                                      stackOut_75_3 = stackIn_75_3;
                                      stackOut_75_4 = 10;
                                      stackIn_77_0 = stackOut_75_0;
                                      stackIn_77_1 = stackOut_75_1;
                                      stackIn_77_2 = stackOut_75_2;
                                      stackIn_77_3 = stackOut_75_3;
                                      stackIn_77_4 = stackOut_75_4;
                                      break L33;
                                    }
                                  }
                                  ((hr) (Object) stackIn_77_0).a(stackIn_77_1, stackIn_77_2, (int)(stackIn_77_3 * ((double)stackIn_77_4 / 14.0)), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                                  if (var14 == 0) {
                                    break L26;
                                  } else {
                                    break L32;
                                  }
                                }
                              }
                              L34: {
                                if (this.field_Q != 4) {
                                  break L34;
                                } else {
                                  L35: {
                                    stackOut_79_0 = ak.field_a[1];
                                    stackOut_79_1 = (float)(var8 + this.field_C >> 1446064968);
                                    stackOut_79_2 = (float)(this.field_z - -var9 >> -1834120312);
                                    stackOut_79_3 = 4096.0;
                                    stackIn_81_0 = stackOut_79_0;
                                    stackIn_81_1 = stackOut_79_1;
                                    stackIn_81_2 = stackOut_79_2;
                                    stackIn_81_3 = stackOut_79_3;
                                    stackIn_80_0 = stackOut_79_0;
                                    stackIn_80_1 = stackOut_79_1;
                                    stackIn_80_2 = stackOut_79_2;
                                    stackIn_80_3 = stackOut_79_3;
                                    if (!this.g(100)) {
                                      stackOut_81_0 = (hr) ((Object) stackIn_81_0);
                                      stackOut_81_1 = stackIn_81_1;
                                      stackOut_81_2 = stackIn_81_2;
                                      stackOut_81_3 = stackIn_81_3;
                                      stackOut_81_4 = var10;
                                      stackIn_82_0 = stackOut_81_0;
                                      stackIn_82_1 = stackOut_81_1;
                                      stackIn_82_2 = stackOut_81_2;
                                      stackIn_82_3 = stackOut_81_3;
                                      stackIn_82_4 = stackOut_81_4;
                                      break L35;
                                    } else {
                                      stackOut_80_0 = (hr) ((Object) stackIn_80_0);
                                      stackOut_80_1 = stackIn_80_1;
                                      stackOut_80_2 = stackIn_80_2;
                                      stackOut_80_3 = stackIn_80_3;
                                      stackOut_80_4 = 10;
                                      stackIn_82_0 = stackOut_80_0;
                                      stackIn_82_1 = stackOut_80_1;
                                      stackIn_82_2 = stackOut_80_2;
                                      stackIn_82_3 = stackOut_80_3;
                                      stackIn_82_4 = stackOut_80_4;
                                      break L35;
                                    }
                                  }
                                  ((hr) (Object) stackIn_82_0).a(stackIn_82_1, stackIn_82_2, (int)(stackIn_82_3 * ((double)stackIn_82_4 / 14.0)), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                                  if (var14 == 0) {
                                    break L26;
                                  } else {
                                    break L34;
                                  }
                                }
                              }
                              L36: {
                                if (this.field_Q != 5) {
                                  break L36;
                                } else {
                                  L37: {
                                    stackOut_84_0 = mr.field_e[1];
                                    stackOut_84_1 = (float)(this.field_C - -var8 >> -1899059640);
                                    stackOut_84_2 = (float)(var9 + this.field_z >> -1879144056);
                                    stackOut_84_3 = 4096.0;
                                    stackIn_86_0 = stackOut_84_0;
                                    stackIn_86_1 = stackOut_84_1;
                                    stackIn_86_2 = stackOut_84_2;
                                    stackIn_86_3 = stackOut_84_3;
                                    stackIn_85_0 = stackOut_84_0;
                                    stackIn_85_1 = stackOut_84_1;
                                    stackIn_85_2 = stackOut_84_2;
                                    stackIn_85_3 = stackOut_84_3;
                                    if (this.g(106)) {
                                      stackOut_86_0 = (hr) ((Object) stackIn_86_0);
                                      stackOut_86_1 = stackIn_86_1;
                                      stackOut_86_2 = stackIn_86_2;
                                      stackOut_86_3 = stackIn_86_3;
                                      stackOut_86_4 = 10;
                                      stackIn_87_0 = stackOut_86_0;
                                      stackIn_87_1 = stackOut_86_1;
                                      stackIn_87_2 = stackOut_86_2;
                                      stackIn_87_3 = stackOut_86_3;
                                      stackIn_87_4 = stackOut_86_4;
                                      break L37;
                                    } else {
                                      stackOut_85_0 = (hr) ((Object) stackIn_85_0);
                                      stackOut_85_1 = stackIn_85_1;
                                      stackOut_85_2 = stackIn_85_2;
                                      stackOut_85_3 = stackIn_85_3;
                                      stackOut_85_4 = var10;
                                      stackIn_87_0 = stackOut_85_0;
                                      stackIn_87_1 = stackOut_85_1;
                                      stackIn_87_2 = stackOut_85_2;
                                      stackIn_87_3 = stackOut_85_3;
                                      stackIn_87_4 = stackOut_85_4;
                                      break L37;
                                    }
                                  }
                                  ((hr) (Object) stackIn_87_0).a(stackIn_87_1, stackIn_87_2, (int)(stackIn_87_3 * ((double)stackIn_87_4 / 14.0)), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                                  if (var14 == 0) {
                                    break L26;
                                  } else {
                                    break L36;
                                  }
                                }
                              }
                              param0.s(this.field_C + var8 >> 1884851976, this.field_z + var9 >> 1807168008, var10, var6 - -tt.a((byte) -128, this.field_Q), 1);
                              param0.s(var8 + this.field_C >> -1268336504, var9 + this.field_z >> -258612152, var10 >> -929794430, 2236962 + var6, 1);
                              if (var14 == 0) {
                                break L26;
                              } else {
                                break L31;
                              }
                            }
                          }
                          L38: {
                            stackOut_90_0 = hv.field_d[1];
                            stackOut_90_1 = (float)(var8 + this.field_C >> 180346696);
                            stackOut_90_2 = (float)(this.field_z - -var9 >> -1596059704);
                            stackOut_90_3 = 4096.0;
                            stackIn_92_0 = stackOut_90_0;
                            stackIn_92_1 = stackOut_90_1;
                            stackIn_92_2 = stackOut_90_2;
                            stackIn_92_3 = stackOut_90_3;
                            stackIn_91_0 = stackOut_90_0;
                            stackIn_91_1 = stackOut_90_1;
                            stackIn_91_2 = stackOut_90_2;
                            stackIn_91_3 = stackOut_90_3;
                            if (this.g(18)) {
                              stackOut_92_0 = (hr) ((Object) stackIn_92_0);
                              stackOut_92_1 = stackIn_92_1;
                              stackOut_92_2 = stackIn_92_2;
                              stackOut_92_3 = stackIn_92_3;
                              stackOut_92_4 = 10;
                              stackIn_93_0 = stackOut_92_0;
                              stackIn_93_1 = stackOut_92_1;
                              stackIn_93_2 = stackOut_92_2;
                              stackIn_93_3 = stackOut_92_3;
                              stackIn_93_4 = stackOut_92_4;
                              break L38;
                            } else {
                              stackOut_91_0 = (hr) ((Object) stackIn_91_0);
                              stackOut_91_1 = stackIn_91_1;
                              stackOut_91_2 = stackIn_91_2;
                              stackOut_91_3 = stackIn_91_3;
                              stackOut_91_4 = var10;
                              stackIn_93_0 = stackOut_91_0;
                              stackIn_93_1 = stackOut_91_1;
                              stackIn_93_2 = stackOut_91_2;
                              stackIn_93_3 = stackOut_91_3;
                              stackIn_93_4 = stackOut_91_4;
                              break L38;
                            }
                          }
                          ((hr) (Object) stackIn_93_0).a(stackIn_93_1, stackIn_93_2, (int)(stackIn_93_3 * ((double)stackIn_93_4 / 14.0)), (int)(32768.0 * this.field_s / 3.141592653589793), 1, 0, 2);
                          if (var14 == 0) {
                            break L26;
                          } else {
                            break L30;
                          }
                        }
                      }
                      L39: {
                        stackOut_94_0 = dc.field_ab[1];
                        stackOut_94_1 = (float)(var8 + this.field_C >> 1219203656);
                        stackOut_94_2 = (float)(var9 + this.field_z >> -1754280056);
                        stackIn_96_0 = stackOut_94_0;
                        stackIn_96_1 = stackOut_94_1;
                        stackIn_96_2 = stackOut_94_2;
                        stackIn_95_0 = stackOut_94_0;
                        stackIn_95_1 = stackOut_94_1;
                        stackIn_95_2 = stackOut_94_2;
                        if (this.g(111)) {
                          stackOut_96_0 = (hr) ((Object) stackIn_96_0);
                          stackOut_96_1 = stackIn_96_1;
                          stackOut_96_2 = stackIn_96_2;
                          stackOut_96_3 = 10;
                          stackIn_97_0 = stackOut_96_0;
                          stackIn_97_1 = stackOut_96_1;
                          stackIn_97_2 = stackOut_96_2;
                          stackIn_97_3 = stackOut_96_3;
                          break L39;
                        } else {
                          stackOut_95_0 = (hr) ((Object) stackIn_95_0);
                          stackOut_95_1 = stackIn_95_1;
                          stackOut_95_2 = stackIn_95_2;
                          stackOut_95_3 = var10;
                          stackIn_97_0 = stackOut_95_0;
                          stackIn_97_1 = stackOut_95_1;
                          stackIn_97_2 = stackOut_95_2;
                          stackIn_97_3 = stackOut_95_3;
                          break L39;
                        }
                      }
                      ((hr) (Object) stackIn_97_0).a(stackIn_97_1, stackIn_97_2, (int)((double)stackIn_97_3 / 14.0 * 4096.0), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                      if (var14 == 0) {
                        break L26;
                      } else {
                        break L27;
                      }
                    }
                  }
                }
                if (var10 == 0) {
                  break L26;
                } else {
                  var12 = var8 + this.field_C >> 621001096;
                  var13 = this.field_z - -var9 >> 996718088;
                  param0.a(-var10 + var12, var13, var12 - -var10, var13, var6 - -tt.a((byte) -128, this.field_Q), 1);
                  break L26;
                }
              }
              L40: {
                L41: {
                  if ((this.field_N ^ -1) != -2) {
                    break L41;
                  } else {
                    if (this.field_b != 0) {
                      break L41;
                    } else {
                      L42: {
                        L43: {
                          L44: {
                            if (this.field_v != 0) {
                              break L44;
                            } else {
                              if (-1 > (this.field_p ^ -1)) {
                                break L43;
                              } else {
                                break L44;
                              }
                            }
                          }
                          hh.field_e[1].a((float)(this.field_C >> -580674136), (float)(this.field_z >> -1077581336), (int)(3072.0 * ((double)var5 / 14.0)), (int)(32768.0 * (3.141592653589793 + this.field_s) / 3.141592653589793));
                          if (var14 == 0) {
                            break L42;
                          } else {
                            break L43;
                          }
                        }
                        hh.field_e[0].a((float)(this.field_C >> 1833344808), (float)(this.field_z >> 415120072), (int)(3072.0 * ((double)var5 / 14.0)), (int)((3.141592653589793 + this.field_s) * 32768.0 / 3.141592653589793));
                        break L42;
                      }
                      if (-1 == (this.field_Q ^ -1)) {
                        hh.field_e[0].a((float)(this.field_C >> -1336942680), (float)(this.field_z >> 1731950216), (int)((double)var5 / 14.0 * 3072.0), (int)(32768.0 * (3.141592653589793 + this.field_s) / 3.141592653589793) - -32768);
                        if (var14 == 0) {
                          break L40;
                        } else {
                          break L41;
                        }
                      } else {
                        break L40;
                      }
                    }
                  }
                }
                L45: {
                  if (-3 != (this.field_N ^ -1)) {
                    break L45;
                  } else {
                    if (0 != this.field_b) {
                      break L45;
                    } else {
                      L46: {
                        if (0 == this.field_v) {
                          break L46;
                        } else {
                          up.field_e[1].a((float)(this.field_C >> -920798104), (float)(this.field_z >> 1135821672), (int)((double)var5 / 14.0 * 3072.0), (int)(this.field_s * 32768.0 / 3.141592653589793));
                          if (var14 == 0) {
                            break L40;
                          } else {
                            break L46;
                          }
                        }
                      }
                      up.field_e[0].a((float)(this.field_C >> 316886824), (float)(this.field_z >> 1644330440), (int)(3072.0 * ((double)var5 / 14.0)), (int)(this.field_s * 32768.0 / 3.141592653589793));
                      if (var14 == 0) {
                        break L40;
                      } else {
                        break L45;
                      }
                    }
                  }
                }
                if (-4 != (this.field_N ^ -1)) {
                  break L40;
                } else {
                  if (0 == this.field_b) {
                    L47: {
                      if (this.field_v != 0) {
                        break L47;
                      } else {
                        ct.field_A[0].a((float)(this.field_C >> 1261228232), (float)(this.field_z >> 1257065736), (int)((double)var5 / 14.0 * 3072.0), (int)(32768.0 * this.field_s / 3.141592653589793));
                        if (var14 == 0) {
                          break L40;
                        } else {
                          break L47;
                        }
                      }
                    }
                    ct.field_A[1].a((float)(this.field_C >> -1957022488), (float)(this.field_z >> 920100040), (int)(3072.0 * ((double)var5 / 14.0)), (int)(32768.0 * this.field_s / 3.141592653589793));
                    break L40;
                  } else {
                    break L40;
                  }
                }
              }
              L48: {
                if (this.g(101)) {
                  break L48;
                } else {
                  break L48;
                }
              }
              L49: {
                if (2 == this.field_M) {
                  L50: {
                    stackOut_128_0 = jn.field_d;
                    stackOut_128_1 = (float)(this.field_C >> 1372483016);
                    stackOut_128_2 = (float)(this.field_z >> 1628929448);
                    stackOut_128_3 = 4096.0;
                    stackIn_130_0 = stackOut_128_0;
                    stackIn_130_1 = stackOut_128_1;
                    stackIn_130_2 = stackOut_128_2;
                    stackIn_130_3 = stackOut_128_3;
                    stackIn_129_0 = stackOut_128_0;
                    stackIn_129_1 = stackOut_128_1;
                    stackIn_129_2 = stackOut_128_2;
                    stackIn_129_3 = stackOut_128_3;
                    if (this.g(71)) {
                      stackOut_130_0 = (hr) ((Object) stackIn_130_0);
                      stackOut_130_1 = stackIn_130_1;
                      stackOut_130_2 = stackIn_130_2;
                      stackOut_130_3 = stackIn_130_3;
                      stackOut_130_4 = 20;
                      stackIn_131_0 = stackOut_130_0;
                      stackIn_131_1 = stackOut_130_1;
                      stackIn_131_2 = stackOut_130_2;
                      stackIn_131_3 = stackOut_130_3;
                      stackIn_131_4 = stackOut_130_4;
                      break L50;
                    } else {
                      stackOut_129_0 = (hr) ((Object) stackIn_129_0);
                      stackOut_129_1 = stackIn_129_1;
                      stackOut_129_2 = stackIn_129_2;
                      stackOut_129_3 = stackIn_129_3;
                      stackOut_129_4 = var10;
                      stackIn_131_0 = stackOut_129_0;
                      stackIn_131_1 = stackOut_129_1;
                      stackIn_131_2 = stackOut_129_2;
                      stackIn_131_3 = stackOut_129_3;
                      stackIn_131_4 = stackOut_129_4;
                      break L50;
                    }
                  }
                  ((hr) (Object) stackIn_131_0).a(stackIn_131_1, stackIn_131_2, (int)(stackIn_131_3 * ((double)stackIn_131_4 / 7.0)), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                  break L49;
                } else {
                  break L49;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L51: {
            var3 = decompiledCaughtException;
            stackOut_133_0 = (RuntimeException) (var3);
            stackOut_133_1 = new StringBuilder().append("ah.W(");
            stackIn_135_0 = stackOut_133_0;
            stackIn_135_1 = stackOut_133_1;
            stackIn_134_0 = stackOut_133_0;
            stackIn_134_1 = stackOut_133_1;
            if (param0 == null) {
              stackOut_135_0 = (RuntimeException) ((Object) stackIn_135_0);
              stackOut_135_1 = (StringBuilder) ((Object) stackIn_135_1);
              stackOut_135_2 = "null";
              stackIn_136_0 = stackOut_135_0;
              stackIn_136_1 = stackOut_135_1;
              stackIn_136_2 = stackOut_135_2;
              break L51;
            } else {
              stackOut_134_0 = (RuntimeException) ((Object) stackIn_134_0);
              stackOut_134_1 = (StringBuilder) ((Object) stackIn_134_1);
              stackOut_134_2 = "{...}";
              stackIn_136_0 = stackOut_134_0;
              stackIn_136_1 = stackOut_134_1;
              stackIn_136_2 = stackOut_134_2;
              break L51;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_136_0), stackIn_136_2 + ',' + param1 + ')');
        }
    }

    final void k(byte param0) {
        if (!this.g(22)) {
          if (!this.j(20)) {
            return;
          } else {
            L0: {
              gn.a(28, true);
              this.field_n = true;
              this.field_H = this.field_k;
              if (param0 < -5) {
                break L0;
              } else {
                this.field_G = 4;
                break L0;
              }
            }
            this.field_c = 12;
            this.field_q = new jn();
            ts.a(this.field_C, this.field_q, -16240, 50, lr.field_a[this.field_Q], this.field_z);
            this.m(-82);
            return;
          }
        } else {
          return;
        }
    }

    final void c(byte param0) {
        int var3 = 0;
        L0: {
          var3 = Sumoblitz.field_L ? 1 : 0;
          if (param0 == 35) {
            break L0;
          } else {
            this.b(28, -76);
            break L0;
          }
        }
        L1: {
          this.field_i = 1024 - -(this.field_I * 50) - 50;
          this.field_h = 0 - -(3 * (this.field_y + -1));
          if ((this.field_m ^ -1) < -2561) {
            this.field_m = 2560;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          this.field_N = 0;
          this.field_L = 0.1 * (double)(-1 + this.field_t) + 1.0;
          if (-1 == this.field_M) {
            break L2;
          } else {
            L3: {
              if (0 != this.field_M) {
                break L3;
              } else {
                this.field_i = this.field_i << 1;
                if (var3 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (-2 == (this.field_M ^ -1)) {
                break L4;
              } else {
                L5: {
                  if (2 != this.field_M) {
                    break L5;
                  } else {
                    this.field_L = this.field_L * 2.0;
                    if (var3 == 0) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                }
                L6: {
                  if (3 == this.field_M) {
                    break L6;
                  } else {
                    if (-5 != (this.field_M ^ -1)) {
                      break L2;
                    } else {
                      this.field_p = 1;
                      this.field_N = 1;
                      if (var3 == 0) {
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                this.field_N = 2;
                if (var3 == 0) {
                  break L2;
                } else {
                  break L4;
                }
              }
            }
            this.field_m = this.field_m << 1;
            this.field_h = this.field_h << 1;
            break L2;
          }
        }
    }

    ah(int param0, int param1, int param2, int param3) {
        this.field_b = 0;
        this.field_i = 80;
        this.field_j = -1;
        this.field_P = -1;
        this.field_R = false;
        this.field_t = 1;
        this.field_u = -1;
        this.field_B = -1;
        this.field_G = 1500;
        this.field_y = 1;
        this.field_K = -1;
        this.field_n = false;
        this.field_I = 1;
        this.field_r = -50;
        this.field_e = -1;
        this.field_d = 0;
        this.field_w = 0;
        this.field_z = param3;
        this.field_L = 1.0;
        this.field_M = -1;
        this.field_C = param2;
        this.field_N = param1;
        this.field_Q = param0;
        this.l(125);
        this.field_q = new jn();
    }

    static {
    }
}
