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
        this.field_M = param0;
        this.field_O = 500;
        if (param1 <= 98) {
            this.d((byte) -2);
        }
        this.c((byte) 35);
    }

    private final void a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        if (-1 <= (this.field_w ^ -1)) {
          if (!this.g(22)) {
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
              stackIn_14_0 = this;

              stackIn_14_1 = this.field_E;

              if (var7 != 0) {
                ((ah) (this)).field_E = stackIn_14_1 + var7;
                if (!this.field_f) {
                  break L3;
                } else {
                  this.field_E = (var4 + this.field_E) / 2;
                  break L3;
                }
              } else {
                ((ah) (this)).field_E = stackIn_14_1 + 1;
                if (!this.field_f) {
                  break L3;
                } else {
                  this.field_E = (var4 + this.field_E) / 2;
                  break L3;
                }
              }
            }
            L4: {
              var7 = var6 * (-this.field_A + this.field_i * param1 / 256) >> 311421832;
              stackIn_18_0 = this;

              stackIn_18_1 = this.field_A;

              if (var7 != 0) {
                stackIn_19_0 = this;
                stackIn_19_1 = stackIn_18_1;
                stackIn_19_2 = var7;
                break L4;
              } else {
                stackIn_19_0 = this;
                stackIn_19_1 = stackIn_18_1;
                stackIn_19_2 = 1;
                break L4;
              }
            }
            L5: {
              ((ah) (this)).field_A = stackIn_19_1 + stackIn_19_2;
              if (this.field_f) {
                this.field_A = (var5 + this.field_A) / 2;
                break L5;
              } else {
                break L5;
              }
            }
            return;
          } else {
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
        int var4;
        if (this.field_D) {
          return;
        } else {
          if (param0 <= -59) {
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
          } else {
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
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
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("ah.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    private final void e(int param0) {
        L0: {
          if (param0 == 0) {
            this.field_y = this.field_y + 1;
            if (10 >= this.field_y) {
              break L0;
            } else {
              this.field_y = 10;
              break L0;
            }
          } else {
            this.n(-51);
            this.field_y = this.field_y + 1;
            if (10 >= this.field_y) {
              break L0;
            } else {
              this.field_y = 10;
              break L0;
            }
          }
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
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final boolean a(boolean param0) {
        int stackIn_8_0 = 0;
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
              stackIn_8_0 = 1;
              break L1;
            }
          }
          stackIn_8_0 = 0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final boolean f(byte param0) {
        int stackIn_6_0 = 0;
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
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void h(byte param0) {
        int var2;
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (param0 == -55) {
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
                  if (var2 == 1) {
                    if ((this.field_p ^ -1) < -1) {
                      if (this.field_Q != 0) {
                        this.field_p = this.field_p - 1;
                        break L0;
                      } else {
                        break L0;
                      }
                    } else {
                      if ((this.field_v ^ -1) < -1) {
                        break L0;
                      } else {
                        this.field_v = 200;
                        break L0;
                      }
                    }
                  } else {
                    if (var2 != 2) {
                      if ((var2 ^ -1) != -4) {
                        break L0;
                      } else {
                        if (0 < this.field_v) {
                          break L0;
                        } else {
                          this.field_v = 500;
                          break L0;
                        }
                      }
                    } else {
                      if (-1 > (this.field_v ^ -1)) {
                        break L0;
                      } else {
                        this.field_v = 200;
                        if (-1 == (this.field_Q ^ -1)) {
                          this.field_v = 0;
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    void d(int param0) {
        float[] var2;
        int var3;
        nt var4;
        float[] var5;
        float[] var6;
        float[] var7;
        float[] var9;
        float[] var10;
        float[] var13;
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
                  if (0 != this.field_j) {
                    break L2;
                  } else {
                    this.m((byte) 116);
                    break L2;
                  }
                } else {
                  if (0 != this.field_j) {
                    break L2;
                  } else {
                    this.m((byte) 116);
                    break L2;
                  }
                }
              }
              L3: {
                this.field_d = this.field_d + 1;
                if (this.field_Q != 0) {
                  break L3;
                } else {
                  if (this.field_d * 20 / 1000 >= 30) {
                    th.b(24753, 247, 8);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
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
                    if (this.g(73)) {
                      break L4;
                    } else {
                      this.field_C = this.field_C + this.field_E;
                      this.field_z = this.field_z + this.field_A;
                      break L4;
                    }
                  } else {
                    if (this.g(73)) {
                      break L4;
                    } else {
                      this.field_C = this.field_C + this.field_E;
                      this.field_z = this.field_z + this.field_A;
                      break L4;
                    }
                  }
                } else {
                  if (this.g(73)) {
                    break L4;
                  } else {
                    this.field_C = this.field_C + this.field_E;
                    this.field_z = this.field_z + this.field_A;
                    break L4;
                  }
                }
              }
              if (param0 <= -55) {
                L5: {
                  if (!this.field_f) {
                    this.field_A = (-this.field_h + 251) * this.field_A / 256;
                    this.field_E = this.field_E * (251 - this.field_h) / 256;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (2 == this.field_Q) {
                    if (wn.a(this.field_B, 2048, -128, this.field_C, this.field_K, this.field_z)) {
                      if (this.field_w <= 0) {
                        this.field_w = 0;
                        this.field_K = -1;
                        this.field_B = -1;
                        this.field_A = 0;
                        this.field_E = 0;
                        if (!this.i(-2)) {
                          break L6;
                        } else {
                          if (0 != this.field_Q) {
                            break L6;
                          } else {
                            ab.a(lr.field_a[this.field_Q], this.field_q, (ah) (this), 40, this.field_z, this.field_C, (byte) 121);
                            break L6;
                          }
                        }
                      } else {
                        if (!this.i(-2)) {
                          break L6;
                        } else {
                          if (0 != this.field_Q) {
                            break L6;
                          } else {
                            ab.a(lr.field_a[this.field_Q], this.field_q, (ah) (this), 40, this.field_z, this.field_C, (byte) 121);
                            break L6;
                          }
                        }
                      }
                    } else {
                      if (!this.i(-2)) {
                        break L6;
                      } else {
                        if (0 != this.field_Q) {
                          break L6;
                        } else {
                          ab.a(lr.field_a[this.field_Q], this.field_q, (ah) (this), 40, this.field_z, this.field_C, (byte) 121);
                          break L6;
                        }
                      }
                    }
                  } else {
                    this.field_w = 0;
                    this.field_K = -1;
                    this.field_B = -1;
                    this.field_A = 0;
                    this.field_E = 0;
                    if (!this.i(-2)) {
                      break L6;
                    } else {
                      if (0 != this.field_Q) {
                        break L6;
                      } else {
                        ab.a(lr.field_a[this.field_Q], this.field_q, (ah) (this), 40, this.field_z, this.field_C, (byte) 121);
                        break L6;
                      }
                    }
                  }
                }
                L7: {
                  L8: {
                    if (0 != (this.field_M ^ -1)) {
                      L9: {
                        this.field_O = this.field_O - 1;
                        if (0 != this.field_O) {
                          break L9;
                        } else {
                          this.b(677397768);
                          break L9;
                        }
                      }
                      if (this.field_k % 2 != 0) {
                        this.field_q.a((ms) (new eq(50, this.field_C + (fi.a(2048, he.field_o, (byte) -96) + -1024) >> 416903272, -1024 + (this.field_z - -fi.a(2048, he.field_o, (byte) -96)) >> 1906907240, this.a(0), this.field_M - -1, true)), (byte) 39);
                        if (!this.g(66)) {
                          break L7;
                        } else {
                          this.field_m = this.field_m + 2048;
                          this.field_c = this.field_c - 1;
                          if (this.field_c != 0) {
                            break L7;
                          } else {
                            this.k(1261228232);
                            break L7;
                          }
                        }
                      } else {
                        this.field_q.a((ms) (new eq(50, -1024 + this.field_C + fi.a(2048, he.field_o, (byte) -96) >> -507827032, -1024 + (this.field_z + fi.a(2048, he.field_o, (byte) -96)) >> 559324488, this.a(0), 1 + this.field_M, false)), (byte) 39);
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                  var4 = (nt) ((Object) this.field_q.b(118));
                  L10: while (true) {
                    if (var4 == null) {
                      if (!this.g(66)) {
                        break L7;
                      } else {
                        this.field_m = this.field_m + 2048;
                        this.field_c = this.field_c - 1;
                        if (this.field_c != 0) {
                          break L7;
                        } else {
                          this.k(1261228232);
                          break L7;
                        }
                      }
                    } else {
                      L11: {
                        if (!var4.a(-2567)) {
                          break L11;
                        } else {
                          var4.b(false);
                          break L11;
                        }
                      }
                      var4 = (nt) ((Object) this.field_q.d((byte) 18));
                      continue L10;
                    }
                  }
                }
                L12: {
                  this.field_f = false;
                  if ((this.field_G ^ -1) < -1) {
                    this.field_G = this.field_G - 1;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  this.field_D = false;
                  if (0 >= this.field_v) {
                    break L13;
                  } else {
                    this.field_v = this.field_v - 1;
                    if (this.field_v != 0) {
                      break L13;
                    } else {
                      if (this.field_N != 1) {
                        break L13;
                      } else {
                        this.field_p = 3;
                        break L13;
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
        int var2 = -1414832128;
        if (param0 != 0) {
            this.field_r = 86;
        }
        if (this.field_M == 0 || (this.field_M ^ -1) == -2) {
            var2 = -1442815829;
        }
        return var2;
    }

    final void a(boolean param0, int param1, int param2) {
        L0: {
          if (-3 == (this.field_Q ^ -1)) {
            if (this.field_K != -1) {
              param2 = this.field_K;
              param1 = this.field_B;
              if (!param0) {
                break L0;
              } else {
                this.g((byte) 123);
                break L0;
              }
            } else {
              if (-1 == this.field_B) {
                this.field_B = param1;
                this.field_K = param2;
                if (!param0) {
                  break L0;
                } else {
                  this.g((byte) 123);
                  break L0;
                }
              } else {
                if (!param0) {
                  break L0;
                } else {
                  this.g((byte) 123);
                  break L0;
                }
              }
            }
          } else {
            if (!param0) {
              break L0;
            } else {
              this.g((byte) 123);
              break L0;
            }
          }
        }
        this.b(-108, param1 + -this.field_z >> 2108594088, -this.field_C + param2 >> -198544472);
    }

    final boolean g(byte param0) {
        int stackIn_5_0 = 0;
        if (param0 == -59) {
          L0: {
            if ((this.field_k + -this.field_H ^ -1) != -981) {
              stackIn_5_0 = 0;
              break L0;
            } else {
              stackIn_5_0 = 1;
              break L0;
            }
          }
          return stackIn_5_0 != 0;
        } else {
          return true;
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
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
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
        int var2;
        int var3;
        L0: {
          var3 = Sumoblitz.field_L ? 1 : 0;
          var2 = this.field_Q;
          if ((var2 ^ -1) != -2) {
            if ((var2 ^ -1) == -3) {
              this.field_o = 40;
              this.field_x = -1;
              this.field_a = -(rl.field_k << 2058852866) + (rl.field_k << 838364583);
              this.field_i = 2800;
              this.field_L = 1.0;
              break L0;
            } else {
              if (var2 != 3) {
                if ((var2 ^ -1) != -5) {
                  if (5 == var2) {
                    this.field_L = 0.5;
                    this.field_a = rl.field_k << 1688842055;
                    this.field_i = 1600;
                    this.field_x = -1;
                    this.field_o = 160;
                    break L0;
                  } else {
                    if (0 != var2) {
                      break L0;
                    } else {
                      this.field_x = -1;
                      this.field_o = 128;
                      this.field_i = 1024;
                      this.field_m = 5120;
                      break L0;
                    }
                  }
                } else {
                  this.field_i = 700;
                  this.field_a = -(rl.field_k << -945383390) + (rl.field_k << 1160087367);
                  this.field_e = 4;
                  this.field_u = 4;
                  this.field_x = -1;
                  this.field_o = 80;
                  break L0;
                }
              } else {
                this.field_o = 80;
                this.field_x = 0;
                this.field_a = rl.field_k << -2015175833;
                this.field_i = 700;
                break L0;
              }
            }
          } else {
            this.field_a = (rl.field_k << 480287399) + -(rl.field_k << 1377071714);
            this.field_o = 60;
            this.field_i = 600;
            this.field_x = -1;
            break L0;
          }
        }
        L1: {
          var2 = this.field_N;
          if (var2 == 0) {
            if (-1 != (this.field_Q ^ -1)) {
              this.field_m = 5120;
              break L1;
            } else {
              break L1;
            }
          } else {
            if (1 == var2) {
              this.field_p = 3;
              this.field_m = 5120;
              break L1;
            } else {
              if (-3 != (var2 ^ -1)) {
                if (3 != var2) {
                  if (var2 == 4) {
                    if (this.field_Q != 4) {
                      this.field_m = 3072;
                      this.field_o = this.field_o >> 1;
                      break L1;
                    } else {
                      this.field_e = 4;
                      this.field_u = 1;
                      this.field_m = 3072;
                      this.field_o = this.field_o >> 1;
                      break L1;
                    }
                  } else {
                    if (5 != var2) {
                      if (6 == var2) {
                        this.field_m = 14336;
                        this.field_u = this.field_Q;
                        this.field_o = this.field_o << 1;
                        this.field_e = 5;
                        this.field_i = this.field_i >> 1;
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      this.field_o = this.field_o << 1;
                      this.field_m = 7168;
                      if (this.field_Q != 4) {
                        break L1;
                      } else {
                        this.field_e = 0;
                        this.field_u = 4;
                        break L1;
                      }
                    }
                  }
                } else {
                  this.field_L = this.field_L / 2.0;
                  this.field_m = 5120;
                  break L1;
                }
              } else {
                this.field_m = 5120;
                break L1;
              }
            }
          }
        }
        L2: {
          if (!rf.a(false)) {
            break L2;
          } else {
            if (this.field_Q != 0) {
              this.field_L = this.field_L * 2.0;
              this.field_i = this.field_i << 1;
              this.field_o = this.field_o << 1;
              break L2;
            } else {
              break L2;
            }
          }
        }
        if (param0 >= 89) {
          this.field_m = this.field_m >> 1;
          return;
        } else {
          return;
        }
    }

    private final void b(byte param0) {
        L0: {
          this.field_I = this.field_I + 1;
          if (-11 <= (this.field_I ^ -1)) {
            if (param0 == 61) {
              break L0;
            } else {
              this.field_b = 40;
              break L0;
            }
          } else {
            this.field_I = 10;
            if (param0 == 61) {
              break L0;
            } else {
              this.field_b = 40;
              break L0;
            }
          }
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
        int var3;
        int var4;
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
          var3 = param1;
          if (0 != var3) {
            if (1 == var3) {
              this.e(0);
              break L1;
            } else {
              if ((var3 ^ -1) != -3) {
                break L1;
              } else {
                this.j((byte) 98);
                break L1;
              }
            }
          } else {
            this.b((byte) 61);
            break L1;
          }
        }
    }

    private final void b(int param0) {
        L0: {
          if ((this.field_m ^ -1) >= -2561) {
            this.field_M = -1;
            this.c((byte) 35);
            if (param0 == 677397768) {
              break L0;
            } else {
              this.f((byte) 38);
              break L0;
            }
          } else {
            this.field_m = 2560;
            this.field_M = -1;
            this.c((byte) 35);
            if (param0 == 677397768) {
              break L0;
            } else {
              this.f((byte) 38);
              break L0;
            }
          }
        }
    }

    private final boolean f(int param0) {
        int var3;
        int var4;
        int var5;
        int var6;
        ah var7;
        int stackIn_17_0 = 0;
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
            if (wn.a(var7.field_z, var3, -115, this.field_C, var7.field_C, this.field_z)) {
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
                  stackIn_17_0 = 0;
                  break L3;
                } else {
                  stackIn_17_0 = 1;
                  break L3;
                }
              }
              return stackIn_17_0 != 0;
            } else {
              return true;
            }
          }
        }
    }

    final void a(ha param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        hr stackIn_23_0 = null;
        float stackIn_23_1 = 0.0f;
        float stackIn_23_2 = 0.0f;
        hr stackIn_24_0;
        float stackIn_24_1;
        float stackIn_24_2;
        int stackIn_24_3;
        hr stackIn_31_0 = null;
        float stackIn_31_1 = 0.0f;
        float stackIn_31_2 = 0.0f;
        hr stackIn_32_0;
        float stackIn_32_1;
        float stackIn_32_2;
        int stackIn_32_3;
        hr stackIn_36_0 = null;
        float stackIn_36_1 = 0.0f;
        float stackIn_36_2 = 0.0f;
        hr stackIn_37_0;
        float stackIn_37_1;
        float stackIn_37_2;
        int stackIn_37_3;
        hr stackIn_41_0;
        float stackIn_41_1;
        float stackIn_41_2;
        double stackIn_41_3;
        hr stackIn_42_0;
        float stackIn_42_1;
        float stackIn_42_2;
        double stackIn_42_3;
        int stackIn_42_4;
        ha stackIn_45_0;
        int stackIn_45_1;
        int stackIn_45_2;
        int stackIn_45_3;
        int stackIn_45_4;
        ha stackIn_46_0;
        int stackIn_46_1;
        int stackIn_46_2;
        int stackIn_46_3;
        int stackIn_46_4;
        int stackIn_46_5;
        hr stackIn_49_0 = null;
        float stackIn_49_1 = 0.0f;
        float stackIn_49_2 = 0.0f;
        hr stackIn_50_0;
        float stackIn_50_1;
        float stackIn_50_2;
        int stackIn_50_3;
        hr stackIn_53_0 = null;
        float stackIn_53_1 = 0.0f;
        float stackIn_53_2 = 0.0f;
        hr stackIn_54_0;
        float stackIn_54_1;
        float stackIn_54_2;
        int stackIn_54_3;
        hr stackIn_66_0;
        float stackIn_66_1;
        float stackIn_66_2;
        double stackIn_66_3;
        hr stackIn_67_0;
        float stackIn_67_1;
        float stackIn_67_2;
        double stackIn_67_3;
        int stackIn_67_4;
        hr stackIn_73_0;
        float stackIn_73_1;
        float stackIn_73_2;
        double stackIn_73_3;
        hr stackIn_74_0;
        float stackIn_74_1;
        float stackIn_74_2;
        double stackIn_74_3;
        int stackIn_74_4;
        hr stackIn_78_0;
        float stackIn_78_1;
        float stackIn_78_2;
        double stackIn_78_3;
        hr stackIn_79_0;
        float stackIn_79_1;
        float stackIn_79_2;
        double stackIn_79_3;
        int stackIn_79_4;
        hr stackIn_83_0;
        float stackIn_83_1;
        float stackIn_83_2;
        double stackIn_83_3;
        hr stackIn_84_0;
        float stackIn_84_1;
        float stackIn_84_2;
        double stackIn_84_3;
        int stackIn_84_4;
        hr stackIn_88_0;
        float stackIn_88_1;
        float stackIn_88_2;
        double stackIn_88_3;
        hr stackIn_89_0;
        float stackIn_89_1;
        float stackIn_89_2;
        double stackIn_89_3;
        int stackIn_89_4;
        hr stackIn_92_0 = null;
        float stackIn_92_1 = 0.0f;
        float stackIn_92_2 = 0.0f;
        hr stackIn_93_0;
        float stackIn_93_1;
        float stackIn_93_2;
        int stackIn_93_3;
        hr stackIn_122_0;
        float stackIn_122_1;
        float stackIn_122_2;
        double stackIn_122_3;
        hr stackIn_123_0;
        float stackIn_123_1;
        float stackIn_123_2;
        double stackIn_123_3;
        int stackIn_123_4;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        String stackIn_128_2 = null;
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
                stackIn_4_0 = this.field_b * this.field_b << 2103773192;
                break L1;
              } else {
                stackIn_4_0 = 0;
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
                stackIn_9_0 = 0;
                break L3;
              } else {
                stackIn_9_0 = this.field_r * (this.field_r * this.field_m) / 2500;
                break L3;
              }
            }
            var4 = stackIn_9_0;
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
                            stackIn_53_0 = dc.field_ab[0];

                            stackIn_53_1 = (float)(this.field_C >> 927252584);

                            stackIn_53_2 = (float)(this.field_z >> 677397768);

                            if (!this.g(28)) {
                              stackIn_54_0 = (hr) ((Object) stackIn_53_0);
                              stackIn_54_1 = stackIn_53_1;
                              stackIn_54_2 = stackIn_53_2;
                              stackIn_54_3 = var5;
                              break L8;
                            } else {
                              stackIn_54_0 = (hr) ((Object) stackIn_53_0);
                              stackIn_54_1 = stackIn_53_1;
                              stackIn_54_2 = stackIn_53_2;
                              stackIn_54_3 = 20;
                              break L8;
                            }
                          }
                          ((hr) (Object) stackIn_54_0).a(stackIn_54_1, stackIn_54_2, (int)((double)stackIn_54_3 / 14.0 * 3072.0), (int)(32768.0 * this.field_s / 3.141592653589793), 1, 0, 2);
                          break L7;
                        } else {
                          if (-3 == (this.field_Q ^ -1)) {
                            L9: {
                              stackIn_49_0 = hv.field_d[0];

                              stackIn_49_1 = (float)(this.field_C >> 1158452072);

                              stackIn_49_2 = (float)(this.field_z >> -908871608);

                              if (!this.g(37)) {
                                stackIn_50_0 = (hr) ((Object) stackIn_49_0);
                                stackIn_50_1 = stackIn_49_1;
                                stackIn_50_2 = stackIn_49_2;
                                stackIn_50_3 = var5;
                                break L9;
                              } else {
                                stackIn_50_0 = (hr) ((Object) stackIn_49_0);
                                stackIn_50_1 = stackIn_49_1;
                                stackIn_50_2 = stackIn_49_2;
                                stackIn_50_3 = 20;
                                break L9;
                              }
                            }
                            ((hr) (Object) stackIn_50_0).a(stackIn_50_1, stackIn_50_2, (int)((double)stackIn_50_3 / 14.0 * 3072.0), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                            break L7;
                          } else {
                            if (-4 != (this.field_Q ^ -1)) {
                              if (this.field_Q != 4) {
                                if (5 != this.field_Q) {
                                  L10: {
                                    stackIn_45_0 = (ha) (param0);

                                    stackIn_45_1 = this.field_C >> -1328135608;

                                    stackIn_45_2 = this.field_z >> 163378280;

                                    stackIn_45_3 = var5;

                                    stackIn_45_4 = var6 + dp.a(-26346, this.field_Q);

                                    if (var6 != 255) {
                                      stackIn_46_0 = (ha) ((Object) stackIn_45_0);
                                      stackIn_46_1 = stackIn_45_1;
                                      stackIn_46_2 = stackIn_45_2;
                                      stackIn_46_3 = stackIn_45_3;
                                      stackIn_46_4 = stackIn_45_4;
                                      stackIn_46_5 = 1;
                                      break L10;
                                    } else {
                                      stackIn_46_0 = (ha) ((Object) stackIn_45_0);
                                      stackIn_46_1 = stackIn_45_1;
                                      stackIn_46_2 = stackIn_45_2;
                                      stackIn_46_3 = stackIn_45_3;
                                      stackIn_46_4 = stackIn_45_4;
                                      stackIn_46_5 = 0;
                                      break L10;
                                    }
                                  }
                                  ((ha) (Object) stackIn_46_0).s(stackIn_46_1, stackIn_46_2, stackIn_46_3, stackIn_46_4, stackIn_46_5);
                                  break L7;
                                } else {
                                  L11: {
                                    stackIn_41_0 = mr.field_e[0];

                                    stackIn_41_1 = (float)(this.field_C >> -1892212856);

                                    stackIn_41_2 = (float)(this.field_z >> -1487166040);

                                    stackIn_41_3 = 3072.0;

                                    if (this.g(param1 + -19316)) {
                                      stackIn_42_0 = (hr) ((Object) stackIn_41_0);
                                      stackIn_42_1 = stackIn_41_1;
                                      stackIn_42_2 = stackIn_41_2;
                                      stackIn_42_3 = stackIn_41_3;
                                      stackIn_42_4 = 20;
                                      break L11;
                                    } else {
                                      stackIn_42_0 = (hr) ((Object) stackIn_41_0);
                                      stackIn_42_1 = stackIn_41_1;
                                      stackIn_42_2 = stackIn_41_2;
                                      stackIn_42_3 = stackIn_41_3;
                                      stackIn_42_4 = var5;
                                      break L11;
                                    }
                                  }
                                  ((hr) (Object) stackIn_42_0).a(stackIn_42_1, stackIn_42_2, (int)(stackIn_42_3 * ((double)stackIn_42_4 / 14.0)), (int)(32768.0 * this.field_s / 3.141592653589793), 1, 0, 2);
                                  break L7;
                                }
                              } else {
                                L12: {
                                  stackIn_36_0 = ak.field_a[0];

                                  stackIn_36_1 = (float)(this.field_C >> 189386920);

                                  stackIn_36_2 = (float)(this.field_z >> 1604747752);

                                  if (!this.g(27)) {
                                    stackIn_37_0 = (hr) ((Object) stackIn_36_0);
                                    stackIn_37_1 = stackIn_36_1;
                                    stackIn_37_2 = stackIn_36_2;
                                    stackIn_37_3 = var5;
                                    break L12;
                                  } else {
                                    stackIn_37_0 = (hr) ((Object) stackIn_36_0);
                                    stackIn_37_1 = stackIn_36_1;
                                    stackIn_37_2 = stackIn_36_2;
                                    stackIn_37_3 = 20;
                                    break L12;
                                  }
                                }
                                ((hr) (Object) stackIn_37_0).a(stackIn_37_1, stackIn_37_2, (int)((double)stackIn_37_3 / 14.0 * 3072.0), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                                break L7;
                              }
                            } else {
                              L13: {
                                stackIn_31_0 = s.field_n[0];

                                stackIn_31_1 = (float)(this.field_C >> 1207855496);

                                stackIn_31_2 = (float)(this.field_z >> -299524152);

                                if (this.g(106)) {
                                  stackIn_32_0 = (hr) ((Object) stackIn_31_0);
                                  stackIn_32_1 = stackIn_31_1;
                                  stackIn_32_2 = stackIn_31_2;
                                  stackIn_32_3 = 20;
                                  break L13;
                                } else {
                                  stackIn_32_0 = (hr) ((Object) stackIn_31_0);
                                  stackIn_32_1 = stackIn_31_1;
                                  stackIn_32_2 = stackIn_31_2;
                                  stackIn_32_3 = var5;
                                  break L13;
                                }
                              }
                              ((hr) (Object) stackIn_32_0).a(stackIn_32_1, stackIn_32_2, (int)((double)stackIn_32_3 / 14.0 * 3072.0), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
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
                          stackIn_23_0 = ht.field_e[0];

                          stackIn_23_1 = (float)(this.field_C >> 1093394152);

                          stackIn_23_2 = (float)(this.field_z >> 375796840);

                          if (!this.g(114)) {
                            stackIn_24_0 = (hr) ((Object) stackIn_23_0);
                            stackIn_24_1 = stackIn_23_1;
                            stackIn_24_2 = stackIn_23_2;
                            stackIn_24_3 = var5;
                            break L15;
                          } else {
                            stackIn_24_0 = (hr) ((Object) stackIn_23_0);
                            stackIn_24_1 = stackIn_23_1;
                            stackIn_24_2 = stackIn_23_2;
                            stackIn_24_3 = 5120;
                            break L15;
                          }
                        }
                        ((hr) (Object) stackIn_24_0).a(stackIn_24_1, stackIn_24_2, (int)((double)stackIn_24_3 / 14.0 * 3072.0), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
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
                            stackIn_92_0 = dc.field_ab[1];

                            stackIn_92_1 = (float)(var8 + this.field_C >> 1219203656);

                            stackIn_92_2 = (float)(var9 + this.field_z >> -1754280056);

                            if (this.g(111)) {
                              stackIn_93_0 = (hr) ((Object) stackIn_92_0);
                              stackIn_93_1 = stackIn_92_1;
                              stackIn_93_2 = stackIn_92_2;
                              stackIn_93_3 = 10;
                              break L18;
                            } else {
                              stackIn_93_0 = (hr) ((Object) stackIn_92_0);
                              stackIn_93_1 = stackIn_92_1;
                              stackIn_93_2 = stackIn_92_2;
                              stackIn_93_3 = var10;
                              break L18;
                            }
                          }
                          ((hr) (Object) stackIn_93_0).a(stackIn_93_1, stackIn_93_2, (int)((double)stackIn_93_3 / 14.0 * 4096.0), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                          break L17;
                        } else {
                          if (2 == this.field_Q) {
                            L19: {
                              stackIn_88_0 = hv.field_d[1];

                              stackIn_88_1 = (float)(var8 + this.field_C >> 180346696);

                              stackIn_88_2 = (float)(this.field_z - -var9 >> -1596059704);

                              stackIn_88_3 = 4096.0;

                              if (this.g(18)) {
                                stackIn_89_0 = (hr) ((Object) stackIn_88_0);
                                stackIn_89_1 = stackIn_88_1;
                                stackIn_89_2 = stackIn_88_2;
                                stackIn_89_3 = stackIn_88_3;
                                stackIn_89_4 = 10;
                                break L19;
                              } else {
                                stackIn_89_0 = (hr) ((Object) stackIn_88_0);
                                stackIn_89_1 = stackIn_88_1;
                                stackIn_89_2 = stackIn_88_2;
                                stackIn_89_3 = stackIn_88_3;
                                stackIn_89_4 = var10;
                                break L19;
                              }
                            }
                            ((hr) (Object) stackIn_89_0).a(stackIn_89_1, stackIn_89_2, (int)(stackIn_89_3 * ((double)stackIn_89_4 / 14.0)), (int)(32768.0 * this.field_s / 3.141592653589793), 1, 0, 2);
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
                                    stackIn_83_0 = mr.field_e[1];

                                    stackIn_83_1 = (float)(this.field_C - -var8 >> -1899059640);

                                    stackIn_83_2 = (float)(var9 + this.field_z >> -1879144056);

                                    stackIn_83_3 = 4096.0;

                                    if (this.g(106)) {
                                      stackIn_84_0 = (hr) ((Object) stackIn_83_0);
                                      stackIn_84_1 = stackIn_83_1;
                                      stackIn_84_2 = stackIn_83_2;
                                      stackIn_84_3 = stackIn_83_3;
                                      stackIn_84_4 = 10;
                                      break L20;
                                    } else {
                                      stackIn_84_0 = (hr) ((Object) stackIn_83_0);
                                      stackIn_84_1 = stackIn_83_1;
                                      stackIn_84_2 = stackIn_83_2;
                                      stackIn_84_3 = stackIn_83_3;
                                      stackIn_84_4 = var10;
                                      break L20;
                                    }
                                  }
                                  ((hr) (Object) stackIn_84_0).a(stackIn_84_1, stackIn_84_2, (int)(stackIn_84_3 * ((double)stackIn_84_4 / 14.0)), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                                  break L17;
                                }
                              } else {
                                L21: {
                                  stackIn_78_0 = ak.field_a[1];

                                  stackIn_78_1 = (float)(var8 + this.field_C >> 1446064968);

                                  stackIn_78_2 = (float)(this.field_z - -var9 >> -1834120312);

                                  stackIn_78_3 = 4096.0;

                                  if (!this.g(100)) {
                                    stackIn_79_0 = (hr) ((Object) stackIn_78_0);
                                    stackIn_79_1 = stackIn_78_1;
                                    stackIn_79_2 = stackIn_78_2;
                                    stackIn_79_3 = stackIn_78_3;
                                    stackIn_79_4 = var10;
                                    break L21;
                                  } else {
                                    stackIn_79_0 = (hr) ((Object) stackIn_78_0);
                                    stackIn_79_1 = stackIn_78_1;
                                    stackIn_79_2 = stackIn_78_2;
                                    stackIn_79_3 = stackIn_78_3;
                                    stackIn_79_4 = 10;
                                    break L21;
                                  }
                                }
                                ((hr) (Object) stackIn_79_0).a(stackIn_79_1, stackIn_79_2, (int)(stackIn_79_3 * ((double)stackIn_79_4 / 14.0)), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                                break L17;
                              }
                            } else {
                              L22: {
                                stackIn_73_0 = s.field_n[1];

                                stackIn_73_1 = (float)(this.field_C - -var8 >> 1905617448);

                                stackIn_73_2 = (float)(var9 + this.field_z >> 1430280776);

                                stackIn_73_3 = 4096.0;

                                if (!this.g(param1 ^ 19425)) {
                                  stackIn_74_0 = (hr) ((Object) stackIn_73_0);
                                  stackIn_74_1 = stackIn_73_1;
                                  stackIn_74_2 = stackIn_73_2;
                                  stackIn_74_3 = stackIn_73_3;
                                  stackIn_74_4 = var10;
                                  break L22;
                                } else {
                                  stackIn_74_0 = (hr) ((Object) stackIn_73_0);
                                  stackIn_74_1 = stackIn_73_1;
                                  stackIn_74_2 = stackIn_73_2;
                                  stackIn_74_3 = stackIn_73_3;
                                  stackIn_74_4 = 10;
                                  break L22;
                                }
                              }
                              ((hr) (Object) stackIn_74_0).a(stackIn_74_1, stackIn_74_2, (int)(stackIn_74_3 * ((double)stackIn_74_4 / 14.0)), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                              break L17;
                            }
                          }
                        }
                      } else {
                        L23: {
                          stackIn_66_0 = ht.field_e[1];

                          stackIn_66_1 = (float)(var8 + this.field_C >> 1355160584);

                          stackIn_66_2 = (float)(this.field_z + var9 >> 979460584);

                          stackIn_66_3 = 4096.0;

                          if (this.g(78)) {
                            stackIn_67_0 = (hr) ((Object) stackIn_66_0);
                            stackIn_67_1 = stackIn_66_1;
                            stackIn_67_2 = stackIn_66_2;
                            stackIn_67_3 = stackIn_66_3;
                            stackIn_67_4 = 10;
                            break L23;
                          } else {
                            stackIn_67_0 = (hr) ((Object) stackIn_66_0);
                            stackIn_67_1 = stackIn_66_1;
                            stackIn_67_2 = stackIn_66_2;
                            stackIn_67_3 = stackIn_66_3;
                            stackIn_67_4 = var10;
                            break L23;
                          }
                        }
                        ((hr) (Object) stackIn_67_0).a(stackIn_67_1, stackIn_67_2, (int)(stackIn_67_3 * ((double)stackIn_67_4 / 14.0)), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
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
                      stackIn_122_0 = jn.field_d;

                      stackIn_122_1 = (float)(this.field_C >> 1372483016);

                      stackIn_122_2 = (float)(this.field_z >> 1628929448);

                      stackIn_122_3 = 4096.0;

                      if (this.g(71)) {
                        stackIn_123_0 = (hr) ((Object) stackIn_122_0);
                        stackIn_123_1 = stackIn_122_1;
                        stackIn_123_2 = stackIn_122_2;
                        stackIn_123_3 = stackIn_122_3;
                        stackIn_123_4 = 20;
                        break L31;
                      } else {
                        stackIn_123_0 = (hr) ((Object) stackIn_122_0);
                        stackIn_123_1 = stackIn_122_1;
                        stackIn_123_2 = stackIn_122_2;
                        stackIn_123_3 = stackIn_122_3;
                        stackIn_123_4 = var10;
                        break L31;
                      }
                    }
                    ((hr) (Object) stackIn_123_0).a(stackIn_123_1, stackIn_123_2, (int)(stackIn_123_3 * ((double)stackIn_123_4 / 7.0)), (int)(this.field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
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
            stackIn_127_0 = (RuntimeException) (var3);

            stackIn_127_1 = new StringBuilder().append("ah.W(");

            if (param0 == null) {
              stackIn_128_0 = (RuntimeException) ((Object) stackIn_127_0);
              stackIn_128_1 = (StringBuilder) ((Object) stackIn_127_1);
              stackIn_128_2 = "null";
              break L32;
            } else {
              stackIn_128_0 = (RuntimeException) ((Object) stackIn_127_0);
              stackIn_128_1 = (StringBuilder) ((Object) stackIn_127_1);
              stackIn_128_2 = "{...}";
              break L32;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_128_0), stackIn_128_2 + ',' + param1 + ')');
        }
    }

    final void k(byte param0) {
        if (!this.g(22)) {
          if (this.j(20)) {
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
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void c(byte param0) {
        int var3;
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
            if (0 != this.field_M) {
              if (-2 == (this.field_M ^ -1)) {
                this.field_m = this.field_m << 1;
                this.field_h = this.field_h << 1;
                break L2;
              } else {
                if (2 != this.field_M) {
                  if (3 == this.field_M) {
                    this.field_N = 2;
                    break L2;
                  } else {
                    if (-5 != (this.field_M ^ -1)) {
                      break L2;
                    } else {
                      this.field_p = 1;
                      this.field_N = 1;
                      break L2;
                    }
                  }
                } else {
                  this.field_L = this.field_L * 2.0;
                  break L2;
                }
              }
            } else {
              this.field_i = this.field_i << 1;
              break L2;
            }
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
