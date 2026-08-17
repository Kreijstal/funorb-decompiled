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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              this.field_M = param0;
              this.field_O = 500;
              if (param1 <= 98) {
                this.d((byte) -2);
                this.c((byte) 35);
                break L1;
              } else {
                this.c((byte) 35);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var3), "ah.GA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        try {
          L0: {
            if (-1 <= (this.field_w ^ -1)) {
              if (!this.g(22)) {
                L1: {
                  this.field_s = Math.atan2((double)param0, (double)param1);
                  if (param2 < -43) {
                    break L1;
                  } else {
                    this.field_Q = -106;
                    break L1;
                  }
                }
                L2: {
                  var4_int = this.field_E;
                  var5 = this.field_A;
                  var6 = 20;
                  var6 = var6 + (this.field_y - 1) * 10;
                  if (!this.field_f) {
                    break L2;
                  } else {
                    var6 = (int)((double)var6 * 0.4);
                    break L2;
                  }
                }
                L3: {
                  if ((this.field_N ^ -1) != -3) {
                    break L3;
                  } else {
                    if (-1 <= (this.field_v ^ -1)) {
                      break L3;
                    } else {
                      var6 = (int)((double)var6 * 0.4);
                      break L3;
                    }
                  }
                }
                L4: {
                  var7 = var6 * (this.field_i * param0 / 256 - this.field_E) >> -2076030584;
                  stackIn_14_0 = this;

                  stackIn_14_1 = this.field_E;

                  if (var7 != 0) {
                    stackIn_15_0 = this;
                    stackIn_15_1 = stackIn_14_1;
                    stackIn_15_2 = var7;
                    break L4;
                  } else {
                    stackIn_15_0 = this;
                    stackIn_15_1 = stackIn_14_1;
                    stackIn_15_2 = 1;
                    break L4;
                  }
                }
                L5: {
                  ((ah) (this)).field_E = stackIn_15_1 + stackIn_15_2;
                  if (!this.field_f) {
                    break L5;
                  } else {
                    this.field_E = (var4_int + this.field_E) / 2;
                    break L5;
                  }
                }
                L6: {
                  var7 = var6 * (-this.field_A + this.field_i * param1 / 256) >> 311421832;
                  stackIn_20_0 = this;

                  stackIn_20_1 = this.field_A;

                  if (var7 != 0) {
                    stackIn_21_0 = this;
                    stackIn_21_1 = stackIn_20_1;
                    stackIn_21_2 = var7;
                    break L6;
                  } else {
                    stackIn_21_0 = this;
                    stackIn_21_1 = stackIn_20_1;
                    stackIn_21_2 = 1;
                    break L6;
                  }
                }
                L7: {
                  ((ah) (this)).field_A = stackIn_21_1 + stackIn_21_2;
                  if (this.field_f) {
                    this.field_A = (var5 + this.field_A) / 2;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
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
          var4 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var4), "ah.MA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public static void c(int param0) {
        try {
            field_g = null;
            field_J = null;
            if (param0 != 0) {
                ah.c(-3);
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ah.KA(" + param0 + ')');
        }
    }

    final int d(byte param0) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -106) {
                break L1;
              } else {
                this.field_R = false;
                break L1;
              }
            }
            stackIn_3_0 = (int)(395.0 * ((double)(-this.field_H + this.field_k) / 1000.0));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "ah.EA(" + param0 + ')');
        }
        return stackIn_3_0;
    }

    final void b(int param0, int param1, int param2) {
        int var4_int = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            if (this.field_D) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 <= -59) {
                L1: {
                  L2: {
                    var4_int = (int)Math.round(Math.sqrt((double)(param1 * param1 + param2 * param2)));
                    if (var4_int <= 0) {
                      break L2;
                    } else {
                      L3: {
                        param2 = (param2 << -1583355832) / var4_int;
                        param1 = (param1 << 1501786792) / var4_int;
                        if (param2 != 0) {
                          break L3;
                        } else {
                          if (0 != param1) {
                            break L3;
                          } else {
                            break L1;
                          }
                        }
                      }
                      this.a(param2, param1, -94);
                      break L2;
                    }
                  }
                  break L1;
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var4), "ah.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void b(boolean param0) {
        if (param0) {
            return;
        }
        try {
            this.field_l = this.field_l + 1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ah.FA(" + param0 + ')');
        }
    }

    private final void k(int param0) {
        try {
            if (param0 != 1261228232) {
                this.field_Q = 4;
            }
            this.field_n = false;
            this.field_m = this.e((byte) -5);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ah.G(" + param0 + ')');
        }
    }

    private final void j(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              this.field_t = this.field_t + 1;
              if (param0 == 98) {
                break L1;
              } else {
                this.field_G = 29;
                break L1;
              }
            }
            L2: {
              if (10 < this.field_t) {
                this.field_t = 10;
                break L2;
              } else {
                break L2;
              }
            }
            this.c((byte) 35);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "ah.AA(" + param0 + ')');
        }
    }

    final void a(byte param0, tl param1) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1.field_m != 0) {
                this.b(param1.field_n, 120);
                break L1;
              } else {
                this.a(-62, param1.field_n);
                break L1;
              }
            }
            L2: {
              if (param0 > 83) {
                break L2;
              } else {
                this.m(17);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("ah.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    private final void e(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                this.n(-51);
                break L1;
              }
            }
            L2: {
              this.field_y = this.field_y + 1;
              if (10 < this.field_y) {
                this.field_y = 10;
                this.c((byte) 35);
                break L2;
              } else {
                this.c((byte) 35);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "ah.R(" + param0 + ')');
        }
    }

    final boolean i(int param0) {
        int discarded$1 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -2) {
                break L1;
              } else {
                discarded$1 = this.e((byte) 53);
                break L1;
              }
            }
            L2: {
              if (-this.field_H + this.field_k != 975) {
                stackIn_6_0 = 0;
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "ah.P(" + param0 + ')');
        }
        return stackIn_6_0 != 0;
    }

    final boolean i(byte param0) {
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 125) {
                break L1;
              } else {
                this.field_c = 106;
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_E == 0) {
                  break L3;
                } else {
                  if (this.field_A == 0) {
                    break L3;
                  } else {
                    stackIn_7_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_7_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "ah.LA(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final boolean a(boolean param0) {
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                this.field_G = -94;
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_Q != 0) {
                  break L3;
                } else {
                  L4: {
                    if (4 == this.field_M) {
                      break L4;
                    } else {
                      if ((this.field_k + -this.field_H ^ -1) <= -51) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackIn_9_0 = 1;
                  break L2;
                }
              }
              stackIn_9_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "ah.DA(" + param0 + ')');
        }
        return stackIn_9_0 != 0;
    }

    final boolean f(byte param0) {
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -63) {
                break L1;
              } else {
                this.field_I = -65;
                break L1;
              }
            }
            L2: {
              L3: {
                if (0 != this.field_b) {
                  break L3;
                } else {
                  if (this.field_r < 0) {
                    break L3;
                  } else {
                    stackIn_7_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_7_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "ah.L(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final void h(byte param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == -55) {
              L1: {
                L2: {
                  var2_int = this.field_N;
                  if (var2_int == 0) {
                    break L2;
                  } else {
                    if ((var2_int ^ -1) == -5) {
                      break L2;
                    } else {
                      if ((var2_int ^ -1) == -6) {
                        break L2;
                      } else {
                        if (var2_int == 1) {
                          if ((this.field_p ^ -1) < -1) {
                            if (this.field_Q != 0) {
                              this.field_p = this.field_p - 1;
                              break L1;
                            } else {
                              break L1;
                            }
                          } else {
                            if ((this.field_v ^ -1) < -1) {
                              break L2;
                            } else {
                              this.field_v = 200;
                              break L1;
                            }
                          }
                        } else {
                          if (var2_int != 2) {
                            if ((var2_int ^ -1) != -4) {
                              break L2;
                            } else {
                              if (0 < this.field_v) {
                                break L2;
                              } else {
                                this.field_v = 500;
                                break L1;
                              }
                            }
                          } else {
                            if (-1 > (this.field_v ^ -1)) {
                              break L2;
                            } else {
                              this.field_v = 200;
                              if (-1 == (this.field_Q ^ -1)) {
                                this.field_v = 0;
                                break L1;
                              } else {
                                break L1;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                break L1;
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
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "ah.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    void d(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        float[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        nt var4 = null;
        float[] var5 = null;
        float[] var6 = null;
        float[] var7 = null;
        float[] var9 = null;
        float[] var10 = null;
        float[] var13 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (!td.field_m) {
              L1: {
                if (-1 > (this.field_x ^ -1)) {
                  this.field_x = this.field_x - 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (this.f(62)) {
                  this.field_r = this.field_r + 1;
                  break L2;
                } else {
                  break L2;
                }
              }
              if (this.field_w <= 0) {
                if ((this.field_r ^ -1) <= -1) {
                  L3: {
                    if (0 > (this.field_j ^ -1)) {
                      this.field_j = this.field_j - 1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (0 != this.field_j) {
                      break L4;
                    } else {
                      this.m((byte) 116);
                      break L4;
                    }
                  }
                  L5: {
                    this.field_d = this.field_d + 1;
                    if (this.field_Q != 0) {
                      break L5;
                    } else {
                      if (this.field_d * 20 / 1000 >= 30) {
                        th.b(24753, 247, 8);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
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
                        break L6;
                      } else {
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (this.g(73)) {
                      break L7;
                    } else {
                      this.field_C = this.field_C + this.field_E;
                      this.field_z = this.field_z + this.field_A;
                      break L7;
                    }
                  }
                  if (param0 <= -55) {
                    L8: {
                      if (!this.field_f) {
                        this.field_A = (-this.field_h + 251) * this.field_A / 256;
                        this.field_E = this.field_E * (251 - this.field_h) / 256;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (2 == this.field_Q) {
                        if (!wn.a(this.field_B, 2048, -128, this.field_C, this.field_K, this.field_z)) {
                          break L9;
                        } else {
                          if (this.field_w <= 0) {
                            this.field_w = 0;
                            this.field_K = -1;
                            this.field_B = -1;
                            this.field_A = 0;
                            this.field_E = 0;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (!this.i(-2)) {
                        break L10;
                      } else {
                        if (0 != this.field_Q) {
                          break L10;
                        } else {
                          ab.a(lr.field_a[this.field_Q], this.field_q, (ah) (this), 40, this.field_z, this.field_C, (byte) 121);
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (0 != (this.field_M ^ -1)) {
                        L12: {
                          this.field_O = this.field_O - 1;
                          if (0 != this.field_O) {
                            break L12;
                          } else {
                            this.b(677397768);
                            break L12;
                          }
                        }
                        if (this.field_k % 2 != 0) {
                          this.field_q.a((ms) (new eq(50, this.field_C + (fi.a(2048, he.field_o, (byte) -96) + -1024) >> 416903272, -1024 + (this.field_z - -fi.a(2048, he.field_o, (byte) -96)) >> 1906907240, this.a(0), this.field_M - -1, true)), (byte) 39);
                          break L11;
                        } else {
                          this.field_q.a((ms) (new eq(50, -1024 + this.field_C + fi.a(2048, he.field_o, (byte) -96) >> -507827032, -1024 + (this.field_z + fi.a(2048, he.field_o, (byte) -96)) >> 559324488, this.a(0), 1 + this.field_M, false)), (byte) 39);
                          break L11;
                        }
                      } else {
                        break L11;
                      }
                    }
                    var4 = (nt) ((Object) this.field_q.b(118));
                    L13: while (true) {
                      if (var4 == null) {
                        L14: {
                          if (!this.g(66)) {
                            break L14;
                          } else {
                            this.field_m = this.field_m + 2048;
                            this.field_c = this.field_c - 1;
                            if (this.field_c != 0) {
                              break L14;
                            } else {
                              this.k(1261228232);
                              break L14;
                            }
                          }
                        }
                        L15: {
                          this.field_f = false;
                          if ((this.field_G ^ -1) < -1) {
                            this.field_G = this.field_G - 1;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        L16: {
                          this.field_D = false;
                          if (0 >= this.field_v) {
                            break L16;
                          } else {
                            this.field_v = this.field_v - 1;
                            if (this.field_v != 0) {
                              break L16;
                            } else {
                              if (this.field_N != 1) {
                                break L16;
                              } else {
                                this.field_p = 3;
                                break L16;
                              }
                            }
                          }
                        }
                        this.field_k = this.field_k + 1;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        L17: {
                          if (!var4.a(-2567)) {
                            break L17;
                          } else {
                            var4.b(false);
                            break L17;
                          }
                        }
                        var4 = (nt) ((Object) this.field_q.d((byte) 18));
                        continue L13;
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                this.field_w = this.field_w - 1;
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
          var2_ref = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2_ref), "ah.HA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final void l(byte param0) {
        if (!(this.field_b == 0)) {
            return;
        }
        try {
            this.field_b = 1;
            int var2_int = 117 % ((74 - param0) / 47);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ah.N(" + param0 + ')');
        }
    }

    private final int a(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = -1414832128;
              if (param0 == 0) {
                break L1;
              } else {
                this.field_r = 86;
                break L1;
              }
            }
            L2: {
              if (this.field_M == 0) {
                var2_int = -1442815829;
                break L2;
              } else {
                if ((this.field_M ^ -1) != -2) {
                  break L2;
                } else {
                  var2_int = -1436548949;
                  break L2;
                }
              }
            }
            stackIn_7_0 = var2_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "ah.J(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final void a(boolean param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (-3 == (this.field_Q ^ -1)) {
                L2: {
                  if (this.field_K != -1) {
                    break L2;
                  } else {
                    if (-1 == this.field_B) {
                      this.field_B = param1;
                      this.field_K = param2;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param2 = this.field_K;
                param1 = this.field_B;
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              if (!param0) {
                break L3;
              } else {
                this.g((byte) 123);
                break L3;
              }
            }
            this.b(-108, param1 + -this.field_z >> 2108594088, -this.field_C + param2 >> -198544472);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var4), "ah.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean g(byte param0) {
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (param0 == -59) {
              L1: {
                if ((this.field_k + -this.field_H ^ -1) != -981) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "ah.IA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final boolean n(int param0) {
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 54) {
                break L1;
              } else {
                this.field_P = 112;
                break L1;
              }
            }
            L2: {
              if (36 > this.field_l) {
                stackIn_6_0 = 0;
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "ah.E(" + param0 + ')');
        }
        return stackIn_6_0 != 0;
    }

    final boolean a(byte param0) {
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 110) {
                break L1;
              } else {
                this.b(true);
                break L1;
              }
            }
            L2: {
              L3: {
                if (0 > this.field_r) {
                  break L3;
                } else {
                  if (-1 != (this.field_b ^ -1)) {
                    break L3;
                  } else {
                    stackIn_7_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_7_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "ah.K(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final boolean h(int param0) {
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                this.b(false);
                break L1;
              }
            }
            L2: {
              if (this.field_x != 0) {
                stackIn_6_0 = 0;
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "ah.V(" + param0 + ')');
        }
        return stackIn_6_0 != 0;
    }

    private final int e(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -5) {
              if (-2 == (this.field_M ^ -1)) {
                stackIn_7_0 = 5120;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = 2560;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 24;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "ah.S(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    private final void m(byte param0) {
        try {
            this.field_c = 12;
            this.field_n = true;
            this.field_q = new jn();
            ts.a(this.field_C, this.field_q, -16240, 40, lr.field_a[this.field_Q], this.field_z);
            int var2_int = 111 % ((param0 - 57) / 38);
            gn.a(19 + fi.a(3, he.field_o, (byte) -96), true);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ah.JA(" + param0 + ')');
        }
    }

    private final void l(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = this.field_Q;
              if ((var2_int ^ -1) != -2) {
                if ((var2_int ^ -1) == -3) {
                  this.field_o = 40;
                  this.field_x = -1;
                  this.field_a = -(rl.field_k << 2058852866) + (rl.field_k << 838364583);
                  this.field_i = 2800;
                  this.field_L = 1.0;
                  break L1;
                } else {
                  if (var2_int != 3) {
                    if ((var2_int ^ -1) != -5) {
                      if (5 == var2_int) {
                        this.field_L = 0.5;
                        this.field_a = rl.field_k << 1688842055;
                        this.field_i = 1600;
                        this.field_x = -1;
                        this.field_o = 160;
                        break L1;
                      } else {
                        if (0 != var2_int) {
                          break L1;
                        } else {
                          this.field_x = -1;
                          this.field_o = 128;
                          this.field_i = 1024;
                          this.field_m = 5120;
                          break L1;
                        }
                      }
                    } else {
                      this.field_i = 700;
                      this.field_a = -(rl.field_k << -945383390) + (rl.field_k << 1160087367);
                      this.field_e = 4;
                      this.field_u = 4;
                      this.field_x = -1;
                      this.field_o = 80;
                      break L1;
                    }
                  } else {
                    this.field_o = 80;
                    this.field_x = 0;
                    this.field_a = rl.field_k << -2015175833;
                    this.field_i = 700;
                    break L1;
                  }
                }
              } else {
                this.field_a = (rl.field_k << 480287399) + -(rl.field_k << 1377071714);
                this.field_o = 60;
                this.field_i = 600;
                this.field_x = -1;
                break L1;
              }
            }
            L2: {
              var2_int = this.field_N;
              if (var2_int == 0) {
                if (-1 != (this.field_Q ^ -1)) {
                  this.field_m = 5120;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                if (1 == var2_int) {
                  this.field_p = 3;
                  this.field_m = 5120;
                  break L2;
                } else {
                  if (-3 != (var2_int ^ -1)) {
                    if (3 != var2_int) {
                      if (var2_int == 4) {
                        L3: {
                          if (this.field_Q != 4) {
                            break L3;
                          } else {
                            this.field_e = 4;
                            this.field_u = 1;
                            break L3;
                          }
                        }
                        this.field_m = 3072;
                        this.field_o = this.field_o >> 1;
                        break L2;
                      } else {
                        if (5 != var2_int) {
                          if (6 == var2_int) {
                            this.field_m = 14336;
                            this.field_u = this.field_Q;
                            this.field_o = this.field_o << 1;
                            this.field_e = 5;
                            this.field_i = this.field_i >> 1;
                            break L2;
                          } else {
                            break L2;
                          }
                        } else {
                          this.field_o = this.field_o << 1;
                          this.field_m = 7168;
                          if (this.field_Q != 4) {
                            break L2;
                          } else {
                            this.field_e = 0;
                            this.field_u = 4;
                            break L2;
                          }
                        }
                      }
                    } else {
                      this.field_L = this.field_L / 2.0;
                      this.field_m = 5120;
                      break L2;
                    }
                  } else {
                    this.field_m = 5120;
                    break L2;
                  }
                }
              }
            }
            L4: {
              if (!rf.a(false)) {
                break L4;
              } else {
                if (this.field_Q != 0) {
                  this.field_L = this.field_L * 2.0;
                  this.field_i = this.field_i << 1;
                  this.field_o = this.field_o << 1;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            if (param0 >= 89) {
              this.field_m = this.field_m >> 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "ah.U(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              this.field_I = this.field_I + 1;
              if (-11 <= (this.field_I ^ -1)) {
                break L1;
              } else {
                this.field_I = 10;
                break L1;
              }
            }
            L2: {
              if (param0 != 61) {
                this.field_b = 40;
                this.c((byte) 35);
                break L2;
              } else {
                this.c((byte) 35);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "ah.M(" + param0 + ')');
        }
    }

    final void m(int param0) {
        try {
            if (param0 >= -50) {
                this.b(true);
            }
            this.field_l = 0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ah.BA(" + param0 + ')');
        }
    }

    final boolean j(int param0) {
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (param0 == 20) {
              L1: {
                if (-this.field_H + this.field_k <= 1000) {
                  stackIn_7_0 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "ah.Q(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    final boolean g(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 > 17) {
              stackIn_4_0 = this.field_n;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "ah.CA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(int param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < -4) {
                break L1;
              } else {
                this.field_n = true;
                break L1;
              }
            }
            L2: {
              var3_int = param1;
              if (0 != var3_int) {
                if (1 != var3_int) {
                  if ((var3_int ^ -1) != -3) {
                    break L2;
                  } else {
                    this.j((byte) 98);
                    break L2;
                  }
                } else {
                  this.e(0);
                  break L2;
                }
              } else {
                this.b((byte) 61);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var3), "ah.T(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if ((this.field_m ^ -1) >= -2561) {
                break L1;
              } else {
                this.field_m = 2560;
                break L1;
              }
            }
            L2: {
              this.field_M = -1;
              this.c((byte) 35);
              if (param0 == 677397768) {
                break L2;
              } else {
                this.f((byte) 38);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "ah.C(" + param0 + ')');
        }
    }

    private final boolean f(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ah var7 = null;
        try {
          L0: {
            L1: {
              var7 = aa.field_a[0];
              if (param0 >= 53) {
                break L1;
              } else {
                this.field_N = 4;
                break L1;
              }
            }
            if (var7 == null) {
              stackIn_6_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (var7.equals(this)) {
                stackIn_11_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = this.field_m + var7.field_m;
                if (wn.a(var7.field_z, var3, -115, this.field_C, var7.field_C, this.field_z)) {
                  L2: {
                    var4 = -var7.field_C + this.field_C;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      var4 = -1 + (2 & this.field_k << -2058813855);
                      break L2;
                    }
                  }
                  L3: {
                    var5 = this.field_z + -var7.field_z;
                    if (0 != var5) {
                      break L3;
                    } else {
                      var5 = -1 + ((1 & this.field_k) << -1157820447);
                      break L3;
                    }
                  }
                  var6 = (int)Math.round(Math.sqrt((double)((float)var4 * (float)var4 + (float)var5 * (float)var5)));
                  if (var6 < var3) {
                    stackIn_23_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    stackIn_25_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  return true;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "ah.H(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_23_0 != 0;
            } else {
              return stackIn_25_0 != 0;
            }
          }
        }
    }

    final void a(ha param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        hr stackIn_28_0 = null;
        float stackIn_28_1 = 0.0f;
        float stackIn_28_2 = 0.0f;
        hr stackIn_29_0;
        float stackIn_29_1;
        float stackIn_29_2;
        int stackIn_29_3;
        hr stackIn_38_0 = null;
        float stackIn_38_1 = 0.0f;
        float stackIn_38_2 = 0.0f;
        hr stackIn_39_0;
        float stackIn_39_1;
        float stackIn_39_2;
        int stackIn_39_3;
        hr stackIn_44_0 = null;
        float stackIn_44_1 = 0.0f;
        float stackIn_44_2 = 0.0f;
        hr stackIn_45_0;
        float stackIn_45_1;
        float stackIn_45_2;
        int stackIn_45_3;
        hr stackIn_50_0;
        float stackIn_50_1;
        float stackIn_50_2;
        double stackIn_50_3;
        hr stackIn_51_0;
        float stackIn_51_1;
        float stackIn_51_2;
        double stackIn_51_3;
        int stackIn_51_4;
        ha stackIn_55_0;
        int stackIn_55_1;
        int stackIn_55_2;
        int stackIn_55_3;
        int stackIn_55_4;
        ha stackIn_56_0;
        int stackIn_56_1;
        int stackIn_56_2;
        int stackIn_56_3;
        int stackIn_56_4;
        int stackIn_56_5;
        hr stackIn_60_0 = null;
        float stackIn_60_1 = 0.0f;
        float stackIn_60_2 = 0.0f;
        hr stackIn_61_0;
        float stackIn_61_1;
        float stackIn_61_2;
        int stackIn_61_3;
        hr stackIn_65_0 = null;
        float stackIn_65_1 = 0.0f;
        float stackIn_65_2 = 0.0f;
        hr stackIn_66_0;
        float stackIn_66_1;
        float stackIn_66_2;
        int stackIn_66_3;
        hr stackIn_80_0;
        float stackIn_80_1;
        float stackIn_80_2;
        double stackIn_80_3;
        hr stackIn_81_0;
        float stackIn_81_1;
        float stackIn_81_2;
        double stackIn_81_3;
        int stackIn_81_4;
        hr stackIn_88_0;
        float stackIn_88_1;
        float stackIn_88_2;
        double stackIn_88_3;
        hr stackIn_89_0;
        float stackIn_89_1;
        float stackIn_89_2;
        double stackIn_89_3;
        int stackIn_89_4;
        hr stackIn_94_0;
        float stackIn_94_1;
        float stackIn_94_2;
        double stackIn_94_3;
        hr stackIn_95_0;
        float stackIn_95_1;
        float stackIn_95_2;
        double stackIn_95_3;
        int stackIn_95_4;
        hr stackIn_100_0;
        float stackIn_100_1;
        float stackIn_100_2;
        double stackIn_100_3;
        hr stackIn_101_0;
        float stackIn_101_1;
        float stackIn_101_2;
        double stackIn_101_3;
        int stackIn_101_4;
        hr stackIn_107_0;
        float stackIn_107_1;
        float stackIn_107_2;
        double stackIn_107_3;
        hr stackIn_108_0;
        float stackIn_108_1;
        float stackIn_108_2;
        double stackIn_108_3;
        int stackIn_108_4;
        hr stackIn_112_0 = null;
        float stackIn_112_1 = 0.0f;
        float stackIn_112_2 = 0.0f;
        hr stackIn_113_0;
        float stackIn_113_1;
        float stackIn_113_2;
        int stackIn_113_3;
        hr stackIn_150_0;
        float stackIn_150_1;
        float stackIn_150_2;
        double stackIn_150_3;
        hr stackIn_151_0;
        float stackIn_151_1;
        float stackIn_151_2;
        double stackIn_151_3;
        int stackIn_151_4;
        RuntimeException stackIn_156_0 = null;
        StringBuilder stackIn_156_1 = null;
        RuntimeException stackIn_157_0 = null;
        StringBuilder stackIn_157_1 = null;
        String stackIn_157_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
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
        var14 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-1 != (this.field_b ^ -1)) {
                stackIn_5_0 = this.field_b * this.field_b << 2103773192;
                break L1;
              } else {
                stackIn_5_0 = 0;
                break L1;
              }
            }
            L2: {
              var3_int = stackIn_5_0;
              if (param1 == 19399) {
                break L2;
              } else {
                this.field_i = -91;
                break L2;
              }
            }
            L3: {
              if (-1 >= (this.field_r ^ -1)) {
                stackIn_11_0 = 0;
                break L3;
              } else {
                stackIn_11_0 = this.field_r * (this.field_r * this.field_m) / 2500;
                break L3;
              }
            }
            var4 = stackIn_11_0;
            var5 = this.field_m - (-var3_int + var4) >> 120577384;
            var6 = Math.max(0, 255 + -(this.field_b * this.field_b)) << 868142008;
            var7 = (nt) ((Object) this.field_q.b(-80));
            L4: while (true) {
              if (var7 == null) {
                L5: {
                  if (0 > this.field_r) {
                    ts.field_e[this.field_Q].a((float)(this.field_C >> 1342574344), (float)(this.field_z >> -1312488472), (int)(3072.0 * ((double)(this.field_m >> 1548462696) / 14.0)), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (this.field_b != 0) {
                    break L6;
                  } else {
                    L7: {
                      if (this.field_Q != 0) {
                        if (this.field_Q == 1) {
                          L8: {
                            stackIn_65_0 = dc.field_ab[0];

                            stackIn_65_1 = (float)(this.field_C >> 927252584);

                            stackIn_65_2 = (float)(this.field_z >> 677397768);

                            if (!this.g(28)) {
                              stackIn_66_0 = (hr) ((Object) stackIn_65_0);
                              stackIn_66_1 = stackIn_65_1;
                              stackIn_66_2 = stackIn_65_2;
                              stackIn_66_3 = var5;
                              break L8;
                            } else {
                              stackIn_66_0 = (hr) ((Object) stackIn_65_0);
                              stackIn_66_1 = stackIn_65_1;
                              stackIn_66_2 = stackIn_65_2;
                              stackIn_66_3 = 20;
                              break L8;
                            }
                          }
                          ((hr) (Object) stackIn_66_0).a(stackIn_66_1, stackIn_66_2, (int)((double)stackIn_66_3 / 14.0 * 3072.0), (int)(32768.0 * this.field_s / 3.141592653589793), 1, 0, 2);
                          break L7;
                        } else {
                          if (-3 == (this.field_Q ^ -1)) {
                            L9: {
                              stackIn_60_0 = hv.field_d[0];

                              stackIn_60_1 = (float)(this.field_C >> 1158452072);

                              stackIn_60_2 = (float)(this.field_z >> -908871608);

                              if (!this.g(37)) {
                                stackIn_61_0 = (hr) ((Object) stackIn_60_0);
                                stackIn_61_1 = stackIn_60_1;
                                stackIn_61_2 = stackIn_60_2;
                                stackIn_61_3 = var5;
                                break L9;
                              } else {
                                stackIn_61_0 = (hr) ((Object) stackIn_60_0);
                                stackIn_61_1 = stackIn_60_1;
                                stackIn_61_2 = stackIn_60_2;
                                stackIn_61_3 = 20;
                                break L9;
                              }
                            }
                            ((hr) (Object) stackIn_61_0).a(stackIn_61_1, stackIn_61_2, (int)((double)stackIn_61_3 / 14.0 * 3072.0), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                            break L7;
                          } else {
                            if (-4 != (this.field_Q ^ -1)) {
                              if (this.field_Q != 4) {
                                if (5 != this.field_Q) {
                                  L10: {
                                    stackIn_55_0 = (ha) (param0);

                                    stackIn_55_1 = this.field_C >> -1328135608;

                                    stackIn_55_2 = this.field_z >> 163378280;

                                    stackIn_55_3 = var5;

                                    stackIn_55_4 = var6 + dp.a(-26346, this.field_Q);

                                    if (var6 != 255) {
                                      stackIn_56_0 = (ha) ((Object) stackIn_55_0);
                                      stackIn_56_1 = stackIn_55_1;
                                      stackIn_56_2 = stackIn_55_2;
                                      stackIn_56_3 = stackIn_55_3;
                                      stackIn_56_4 = stackIn_55_4;
                                      stackIn_56_5 = 1;
                                      break L10;
                                    } else {
                                      stackIn_56_0 = (ha) ((Object) stackIn_55_0);
                                      stackIn_56_1 = stackIn_55_1;
                                      stackIn_56_2 = stackIn_55_2;
                                      stackIn_56_3 = stackIn_55_3;
                                      stackIn_56_4 = stackIn_55_4;
                                      stackIn_56_5 = 0;
                                      break L10;
                                    }
                                  }
                                  ((ha) (Object) stackIn_56_0).s(stackIn_56_1, stackIn_56_2, stackIn_56_3, stackIn_56_4, stackIn_56_5);
                                  break L7;
                                } else {
                                  L11: {
                                    stackIn_50_0 = mr.field_e[0];

                                    stackIn_50_1 = (float)(this.field_C >> -1892212856);

                                    stackIn_50_2 = (float)(this.field_z >> -1487166040);

                                    stackIn_50_3 = 3072.0;

                                    if (this.g(param1 + -19316)) {
                                      stackIn_51_0 = (hr) ((Object) stackIn_50_0);
                                      stackIn_51_1 = stackIn_50_1;
                                      stackIn_51_2 = stackIn_50_2;
                                      stackIn_51_3 = stackIn_50_3;
                                      stackIn_51_4 = 20;
                                      break L11;
                                    } else {
                                      stackIn_51_0 = (hr) ((Object) stackIn_50_0);
                                      stackIn_51_1 = stackIn_50_1;
                                      stackIn_51_2 = stackIn_50_2;
                                      stackIn_51_3 = stackIn_50_3;
                                      stackIn_51_4 = var5;
                                      break L11;
                                    }
                                  }
                                  ((hr) (Object) stackIn_51_0).a(stackIn_51_1, stackIn_51_2, (int)(stackIn_51_3 * ((double)stackIn_51_4 / 14.0)), (int)(32768.0 * this.field_s / 3.141592653589793), 1, 0, 2);
                                  break L7;
                                }
                              } else {
                                L12: {
                                  stackIn_44_0 = ak.field_a[0];

                                  stackIn_44_1 = (float)(this.field_C >> 189386920);

                                  stackIn_44_2 = (float)(this.field_z >> 1604747752);

                                  if (!this.g(27)) {
                                    stackIn_45_0 = (hr) ((Object) stackIn_44_0);
                                    stackIn_45_1 = stackIn_44_1;
                                    stackIn_45_2 = stackIn_44_2;
                                    stackIn_45_3 = var5;
                                    break L12;
                                  } else {
                                    stackIn_45_0 = (hr) ((Object) stackIn_44_0);
                                    stackIn_45_1 = stackIn_44_1;
                                    stackIn_45_2 = stackIn_44_2;
                                    stackIn_45_3 = 20;
                                    break L12;
                                  }
                                }
                                ((hr) (Object) stackIn_45_0).a(stackIn_45_1, stackIn_45_2, (int)((double)stackIn_45_3 / 14.0 * 3072.0), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                                break L7;
                              }
                            } else {
                              L13: {
                                stackIn_38_0 = s.field_n[0];

                                stackIn_38_1 = (float)(this.field_C >> 1207855496);

                                stackIn_38_2 = (float)(this.field_z >> -299524152);

                                if (this.g(106)) {
                                  stackIn_39_0 = (hr) ((Object) stackIn_38_0);
                                  stackIn_39_1 = stackIn_38_1;
                                  stackIn_39_2 = stackIn_38_2;
                                  stackIn_39_3 = 20;
                                  break L13;
                                } else {
                                  stackIn_39_0 = (hr) ((Object) stackIn_38_0);
                                  stackIn_39_1 = stackIn_38_1;
                                  stackIn_39_2 = stackIn_38_2;
                                  stackIn_39_3 = var5;
                                  break L13;
                                }
                              }
                              ((hr) (Object) stackIn_39_0).a(stackIn_39_1, stackIn_39_2, (int)((double)stackIn_39_3 / 14.0 * 3072.0), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                              break L7;
                            }
                          }
                        }
                      } else {
                        L14: {
                          if (!this.j(20)) {
                            break L14;
                          } else {
                            if (0 >= this.field_l) {
                              break L14;
                            } else {
                              if (-1 == (ul.field_f ^ -1)) {
                                ht.field_e[6 + -(this.field_l / 7) + 3].a((float)(this.field_C >> 261369544), (float)(this.field_z >> -1794895480), (int)(3072.0 * ((double)var5 / 14.0)), (int)(32768.0 * this.field_s / 3.141592653589793), 1, 0, 2);
                                break L7;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                        L15: {
                          stackIn_28_0 = ht.field_e[0];

                          stackIn_28_1 = (float)(this.field_C >> 1093394152);

                          stackIn_28_2 = (float)(this.field_z >> 375796840);

                          if (!this.g(114)) {
                            stackIn_29_0 = (hr) ((Object) stackIn_28_0);
                            stackIn_29_1 = stackIn_28_1;
                            stackIn_29_2 = stackIn_28_2;
                            stackIn_29_3 = var5;
                            break L15;
                          } else {
                            stackIn_29_0 = (hr) ((Object) stackIn_28_0);
                            stackIn_29_1 = stackIn_28_1;
                            stackIn_29_2 = stackIn_28_2;
                            stackIn_29_3 = 5120;
                            break L15;
                          }
                        }
                        ((hr) (Object) stackIn_29_0).a(stackIn_29_1, stackIn_29_2, (int)((double)stackIn_29_3 / 14.0 * 3072.0), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                        break L7;
                      }
                    }
                    if (!this.g(param1 + -19310)) {
                      break L6;
                    } else {
                      if (ul.field_f != 0) {
                        break L6;
                      } else {
                        kw.field_a.a((float)(this.field_C >> 1524158824), (float)(this.field_z >> 447990856), (int)((double)var5 / 28.0 * 3072.0), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                        break L6;
                      }
                    }
                  }
                }
                L16: {
                  var8 = this.field_E;
                  var9 = this.field_A;
                  var10 = var5 >> -645284735;
                  var11 = (int)Math.round(Math.sqrt((double)((float)this.field_A * (float)this.field_A + (float)this.field_E * (float)this.field_E)));
                  if (-1025 > (var11 ^ -1)) {
                    var8 = (this.field_E << -793618390) / var11;
                    var9 = (this.field_A << 1551164650) / var11;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (this.h(-1)) {
                    if (var10 == 0) {
                      break L17;
                    } else {
                      var12 = var8 + this.field_C >> 621001096;
                      var13 = this.field_z - -var9 >> 996718088;
                      param0.a(-var10 + var12, var13, var12 - -var10, var13, var6 - -tt.a((byte) -128, this.field_Q), 1);
                      break L17;
                    }
                  } else {
                    if ((this.field_b ^ -1) < -1) {
                      break L17;
                    } else {
                      if (this.field_Q != 0) {
                        if (1 == this.field_Q) {
                          L18: {
                            stackIn_112_0 = dc.field_ab[1];

                            stackIn_112_1 = (float)(var8 + this.field_C >> 1219203656);

                            stackIn_112_2 = (float)(var9 + this.field_z >> -1754280056);

                            if (this.g(111)) {
                              stackIn_113_0 = (hr) ((Object) stackIn_112_0);
                              stackIn_113_1 = stackIn_112_1;
                              stackIn_113_2 = stackIn_112_2;
                              stackIn_113_3 = 10;
                              break L18;
                            } else {
                              stackIn_113_0 = (hr) ((Object) stackIn_112_0);
                              stackIn_113_1 = stackIn_112_1;
                              stackIn_113_2 = stackIn_112_2;
                              stackIn_113_3 = var10;
                              break L18;
                            }
                          }
                          ((hr) (Object) stackIn_113_0).a(stackIn_113_1, stackIn_113_2, (int)((double)stackIn_113_3 / 14.0 * 4096.0), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                          break L17;
                        } else {
                          if (2 == this.field_Q) {
                            L19: {
                              stackIn_107_0 = hv.field_d[1];

                              stackIn_107_1 = (float)(var8 + this.field_C >> 180346696);

                              stackIn_107_2 = (float)(this.field_z - -var9 >> -1596059704);

                              stackIn_107_3 = 4096.0;

                              if (this.g(18)) {
                                stackIn_108_0 = (hr) ((Object) stackIn_107_0);
                                stackIn_108_1 = stackIn_107_1;
                                stackIn_108_2 = stackIn_107_2;
                                stackIn_108_3 = stackIn_107_3;
                                stackIn_108_4 = 10;
                                break L19;
                              } else {
                                stackIn_108_0 = (hr) ((Object) stackIn_107_0);
                                stackIn_108_1 = stackIn_107_1;
                                stackIn_108_2 = stackIn_107_2;
                                stackIn_108_3 = stackIn_107_3;
                                stackIn_108_4 = var10;
                                break L19;
                              }
                            }
                            ((hr) (Object) stackIn_108_0).a(stackIn_108_1, stackIn_108_2, (int)(stackIn_108_3 * ((double)stackIn_108_4 / 14.0)), (int)(32768.0 * this.field_s / 3.141592653589793), 1, 0, 2);
                            break L17;
                          } else {
                            if (this.field_Q != 3) {
                              if (this.field_Q != 4) {
                                if (this.field_Q != 5) {
                                  param0.s(this.field_C + var8 >> 1884851976, this.field_z + var9 >> 1807168008, var10, var6 - -tt.a((byte) -128, this.field_Q), 1);
                                  param0.s(var8 + this.field_C >> -1268336504, var9 + this.field_z >> -258612152, var10 >> -929794430, 2236962 + var6, 1);
                                  break L17;
                                } else {
                                  L20: {
                                    stackIn_100_0 = mr.field_e[1];

                                    stackIn_100_1 = (float)(this.field_C - -var8 >> -1899059640);

                                    stackIn_100_2 = (float)(var9 + this.field_z >> -1879144056);

                                    stackIn_100_3 = 4096.0;

                                    if (this.g(106)) {
                                      stackIn_101_0 = (hr) ((Object) stackIn_100_0);
                                      stackIn_101_1 = stackIn_100_1;
                                      stackIn_101_2 = stackIn_100_2;
                                      stackIn_101_3 = stackIn_100_3;
                                      stackIn_101_4 = 10;
                                      break L20;
                                    } else {
                                      stackIn_101_0 = (hr) ((Object) stackIn_100_0);
                                      stackIn_101_1 = stackIn_100_1;
                                      stackIn_101_2 = stackIn_100_2;
                                      stackIn_101_3 = stackIn_100_3;
                                      stackIn_101_4 = var10;
                                      break L20;
                                    }
                                  }
                                  ((hr) (Object) stackIn_101_0).a(stackIn_101_1, stackIn_101_2, (int)(stackIn_101_3 * ((double)stackIn_101_4 / 14.0)), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                                  break L17;
                                }
                              } else {
                                L21: {
                                  stackIn_94_0 = ak.field_a[1];

                                  stackIn_94_1 = (float)(var8 + this.field_C >> 1446064968);

                                  stackIn_94_2 = (float)(this.field_z - -var9 >> -1834120312);

                                  stackIn_94_3 = 4096.0;

                                  if (!this.g(100)) {
                                    stackIn_95_0 = (hr) ((Object) stackIn_94_0);
                                    stackIn_95_1 = stackIn_94_1;
                                    stackIn_95_2 = stackIn_94_2;
                                    stackIn_95_3 = stackIn_94_3;
                                    stackIn_95_4 = var10;
                                    break L21;
                                  } else {
                                    stackIn_95_0 = (hr) ((Object) stackIn_94_0);
                                    stackIn_95_1 = stackIn_94_1;
                                    stackIn_95_2 = stackIn_94_2;
                                    stackIn_95_3 = stackIn_94_3;
                                    stackIn_95_4 = 10;
                                    break L21;
                                  }
                                }
                                ((hr) (Object) stackIn_95_0).a(stackIn_95_1, stackIn_95_2, (int)(stackIn_95_3 * ((double)stackIn_95_4 / 14.0)), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                                break L17;
                              }
                            } else {
                              L22: {
                                stackIn_88_0 = s.field_n[1];

                                stackIn_88_1 = (float)(this.field_C - -var8 >> 1905617448);

                                stackIn_88_2 = (float)(var9 + this.field_z >> 1430280776);

                                stackIn_88_3 = 4096.0;

                                if (!this.g(param1 ^ 19425)) {
                                  stackIn_89_0 = (hr) ((Object) stackIn_88_0);
                                  stackIn_89_1 = stackIn_88_1;
                                  stackIn_89_2 = stackIn_88_2;
                                  stackIn_89_3 = stackIn_88_3;
                                  stackIn_89_4 = var10;
                                  break L22;
                                } else {
                                  stackIn_89_0 = (hr) ((Object) stackIn_88_0);
                                  stackIn_89_1 = stackIn_88_1;
                                  stackIn_89_2 = stackIn_88_2;
                                  stackIn_89_3 = stackIn_88_3;
                                  stackIn_89_4 = 10;
                                  break L22;
                                }
                              }
                              ((hr) (Object) stackIn_89_0).a(stackIn_89_1, stackIn_89_2, (int)(stackIn_89_3 * ((double)stackIn_89_4 / 14.0)), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                              break L17;
                            }
                          }
                        }
                      } else {
                        L23: {
                          stackIn_80_0 = ht.field_e[1];

                          stackIn_80_1 = (float)(var8 + this.field_C >> 1355160584);

                          stackIn_80_2 = (float)(this.field_z + var9 >> 979460584);

                          stackIn_80_3 = 4096.0;

                          if (this.g(78)) {
                            stackIn_81_0 = (hr) ((Object) stackIn_80_0);
                            stackIn_81_1 = stackIn_80_1;
                            stackIn_81_2 = stackIn_80_2;
                            stackIn_81_3 = stackIn_80_3;
                            stackIn_81_4 = 10;
                            break L23;
                          } else {
                            stackIn_81_0 = (hr) ((Object) stackIn_80_0);
                            stackIn_81_1 = stackIn_80_1;
                            stackIn_81_2 = stackIn_80_2;
                            stackIn_81_3 = stackIn_80_3;
                            stackIn_81_4 = var10;
                            break L23;
                          }
                        }
                        ((hr) (Object) stackIn_81_0).a(stackIn_81_1, stackIn_81_2, (int)(stackIn_81_3 * ((double)stackIn_81_4 / 14.0)), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                        break L17;
                      }
                    }
                  }
                }
                L24: {
                  L25: {
                    if ((this.field_N ^ -1) != -2) {
                      break L25;
                    } else {
                      if (this.field_b != 0) {
                        break L25;
                      } else {
                        L26: {
                          L27: {
                            if (this.field_v != 0) {
                              break L27;
                            } else {
                              if (-1 > (this.field_p ^ -1)) {
                                hh.field_e[0].a((float)(this.field_C >> 1833344808), (float)(this.field_z >> 415120072), (int)(3072.0 * ((double)var5 / 14.0)), (int)((3.141592653589793 + this.field_s) * 32768.0 / 3.141592653589793));
                                break L26;
                              } else {
                                break L27;
                              }
                            }
                          }
                          hh.field_e[1].a((float)(this.field_C >> -580674136), (float)(this.field_z >> -1077581336), (int)(3072.0 * ((double)var5 / 14.0)), (int)(32768.0 * (3.141592653589793 + this.field_s) / 3.141592653589793));
                          break L26;
                        }
                        if (-1 == (this.field_Q ^ -1)) {
                          hh.field_e[0].a((float)(this.field_C >> -1336942680), (float)(this.field_z >> 1731950216), (int)((double)var5 / 14.0 * 3072.0), (int)(32768.0 * (3.141592653589793 + this.field_s) / 3.141592653589793) - -32768);
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                    }
                  }
                  L28: {
                    if (-3 != (this.field_N ^ -1)) {
                      break L28;
                    } else {
                      if (0 != this.field_b) {
                        break L28;
                      } else {
                        if (0 == this.field_v) {
                          up.field_e[0].a((float)(this.field_C >> 316886824), (float)(this.field_z >> 1644330440), (int)(3072.0 * ((double)var5 / 14.0)), (int)(this.field_s * 32768.0 / 3.141592653589793));
                          break L24;
                        } else {
                          up.field_e[1].a((float)(this.field_C >> -920798104), (float)(this.field_z >> 1135821672), (int)((double)var5 / 14.0 * 3072.0), (int)(this.field_s * 32768.0 / 3.141592653589793));
                          break L24;
                        }
                      }
                    }
                  }
                  if (-4 != (this.field_N ^ -1)) {
                    break L24;
                  } else {
                    if (0 == this.field_b) {
                      if (this.field_v != 0) {
                        ct.field_A[1].a((float)(this.field_C >> -1957022488), (float)(this.field_z >> 920100040), (int)(3072.0 * ((double)var5 / 14.0)), (int)(32768.0 * this.field_s / 3.141592653589793));
                        break L24;
                      } else {
                        ct.field_A[0].a((float)(this.field_C >> 1261228232), (float)(this.field_z >> 1257065736), (int)((double)var5 / 14.0 * 3072.0), (int)(32768.0 * this.field_s / 3.141592653589793));
                        break L24;
                      }
                    } else {
                      break L24;
                    }
                  }
                }
                L29: {
                  if (this.g(101)) {
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (2 == this.field_M) {
                    L31: {
                      stackIn_150_0 = jn.field_d;

                      stackIn_150_1 = (float)(this.field_C >> 1372483016);

                      stackIn_150_2 = (float)(this.field_z >> 1628929448);

                      stackIn_150_3 = 4096.0;

                      if (this.g(71)) {
                        stackIn_151_0 = (hr) ((Object) stackIn_150_0);
                        stackIn_151_1 = stackIn_150_1;
                        stackIn_151_2 = stackIn_150_2;
                        stackIn_151_3 = stackIn_150_3;
                        stackIn_151_4 = 20;
                        break L31;
                      } else {
                        stackIn_151_0 = (hr) ((Object) stackIn_150_0);
                        stackIn_151_1 = stackIn_150_1;
                        stackIn_151_2 = stackIn_150_2;
                        stackIn_151_3 = stackIn_150_3;
                        stackIn_151_4 = var10;
                        break L31;
                      }
                    }
                    ((hr) (Object) stackIn_151_0).a(stackIn_151_1, stackIn_151_2, (int)(stackIn_151_3 * ((double)stackIn_151_4 / 7.0)), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                    break L30;
                  } else {
                    break L30;
                  }
                }
                break L0;
              } else {
                var7.a(param0, -127);
                var7 = (nt) ((Object) this.field_q.d((byte) 18));
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L32: {
            var3 = decompiledCaughtException;
            stackIn_156_0 = (RuntimeException) (var3);

            stackIn_156_1 = new StringBuilder().append("ah.W(");

            if (param0 == null) {
              stackIn_157_0 = (RuntimeException) ((Object) stackIn_156_0);
              stackIn_157_1 = (StringBuilder) ((Object) stackIn_156_1);
              stackIn_157_2 = "null";
              break L32;
            } else {
              stackIn_157_0 = (RuntimeException) ((Object) stackIn_156_0);
              stackIn_157_1 = (StringBuilder) ((Object) stackIn_156_1);
              stackIn_157_2 = "{...}";
              break L32;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_157_0), stackIn_157_2 + ',' + param1 + ')');
        }
    }

    final void k(byte param0) {
        if (this.g(22)) {
            return;
        }
        if (!this.j(20)) {
            return;
        }
        try {
            gn.a(28, true);
            this.field_n = true;
            this.field_H = this.field_k;
            if (param0 >= -5) {
                this.field_G = 4;
            }
            this.field_c = 12;
            this.field_q = new jn();
            ts.a(this.field_C, this.field_q, -16240, 50, lr.field_a[this.field_Q], this.field_z);
            this.m(-82);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ah.O(" + param0 + ')');
        }
    }

    final void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 35) {
                break L1;
              } else {
                this.b(28, -76);
                break L1;
              }
            }
            L2: {
              this.field_i = 1024 - -(this.field_I * 50) - 50;
              this.field_h = 0 - -(3 * (this.field_y + -1));
              if ((this.field_m ^ -1) < -2561) {
                this.field_m = 2560;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                this.field_N = 0;
                this.field_L = 0.1 * (double)(-1 + this.field_t) + 1.0;
                if (-1 == this.field_M) {
                  break L4;
                } else {
                  if (0 != this.field_M) {
                    if (-2 == (this.field_M ^ -1)) {
                      this.field_m = this.field_m << 1;
                      this.field_h = this.field_h << 1;
                      break L3;
                    } else {
                      if (2 != this.field_M) {
                        if (3 == this.field_M) {
                          this.field_N = 2;
                          break L3;
                        } else {
                          if (-5 != (this.field_M ^ -1)) {
                            break L4;
                          } else {
                            this.field_p = 1;
                            this.field_N = 1;
                            break L3;
                          }
                        }
                      } else {
                        this.field_L = this.field_L * 2.0;
                        break L3;
                      }
                    }
                  } else {
                    this.field_i = this.field_i << 1;
                    break L3;
                  }
                }
              }
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "ah.A(" + param0 + ')');
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
        try {
            this.field_z = param3;
            this.field_L = 1.0;
            this.field_M = -1;
            this.field_C = param2;
            this.field_N = param1;
            this.field_Q = param0;
            this.l(125);
            this.field_q = new jn();
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ah.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
    }
}
