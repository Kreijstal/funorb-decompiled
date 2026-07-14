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
        ((ah) this).field_M = param0;
        ((ah) this).field_O = 500;
        if (param1 <= 98) {
            int discarded$0 = ((ah) this).d((byte) -2);
        }
        ((ah) this).c((byte) 35);
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
        if (-1 <= (((ah) this).field_w ^ -1)) {
          if (((ah) this).g(22)) {
            return;
          } else {
            L0: {
              ((ah) this).field_s = Math.atan2((double)param0, (double)param1);
              if (param2 < -43) {
                break L0;
              } else {
                ((ah) this).field_Q = -106;
                break L0;
              }
            }
            L1: {
              var4 = ((ah) this).field_E;
              var5 = ((ah) this).field_A;
              var6 = 20;
              var6 = var6 + (((ah) this).field_y - 1) * 10;
              if (!((ah) this).field_f) {
                break L1;
              } else {
                var6 = (int)((double)var6 * 0.4);
                break L1;
              }
            }
            L2: {
              if (((ah) this).field_N != -3) {
                break L2;
              } else {
                if (-1 >= ((ah) this).field_v) {
                  break L2;
                } else {
                  var6 = (int)((double)var6 * 0.4);
                  break L2;
                }
              }
            }
            L3: {
              var7 = var6 * (((ah) this).field_i * param0 / 256 - ((ah) this).field_E) >> -2076030584;
              stackOut_10_0 = this;
              stackOut_10_1 = ((ah) this).field_E;
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
              ((ah) this).field_E = stackIn_13_1 + stackIn_13_2;
              if (!((ah) this).field_f) {
                break L4;
              } else {
                ((ah) this).field_E = (var4 + ((ah) this).field_E) / 2;
                break L4;
              }
            }
            L5: {
              var7 = var6 * (-((ah) this).field_A + ((ah) this).field_i * param1 / 256) >> 311421832;
              stackOut_15_0 = this;
              stackOut_15_1 = ((ah) this).field_A;
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
              ((ah) this).field_A = stackIn_18_1 + stackIn_18_2;
              if (((ah) this).field_f) {
                ((ah) this).field_A = (var5 + ((ah) this).field_A) / 2;
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
            ((ah) this).field_R = false;
        }
        return (int)(395.0 * ((double)(-((ah) this).field_H + ((ah) this).field_k) / 1000.0));
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        if (((ah) this).field_D) {
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
        ((ah) this).field_l = ((ah) this).field_l + 1;
    }

    private final void k(int param0) {
        if (param0 != 1261228232) {
            ((ah) this).field_Q = 4;
        }
        ((ah) this).field_n = false;
        ((ah) this).field_m = this.e((byte) -5);
    }

    private final void j(byte param0) {
        ((ah) this).field_t = ((ah) this).field_t + 1;
        if (param0 != 98) {
            ((ah) this).field_G = 29;
        }
        if (!(10 >= ((ah) this).field_t)) {
            ((ah) this).field_t = 10;
        }
        ((ah) this).c((byte) 35);
    }

    final void a(byte param0, tl param1) {
        if (param1.field_m == 0) {
            ((ah) this).a(-62, param1.field_n);
        } else {
            this.b(param1.field_n, 120);
        }
        if (param0 <= 83) {
            ((ah) this).m(17);
        }
    }

    private final void e(int param0) {
        if (param0 != 0) {
            boolean discarded$0 = ((ah) this).n(-51);
        }
        ((ah) this).field_y = ((ah) this).field_y + 1;
        if (10 < ((ah) this).field_y) {
            ((ah) this).field_y = 10;
        }
        ((ah) this).c((byte) 35);
    }

    final boolean i(int param0) {
        if (param0 != -2) {
            int discarded$0 = this.e((byte) 53);
        }
        return -((ah) this).field_H + ((ah) this).field_k == 975 ? true : false;
    }

    final boolean i(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 125) {
            break L0;
          } else {
            ((ah) this).field_c = 106;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((ah) this).field_E == 0) {
              break L2;
            } else {
              if (((ah) this).field_A == 0) {
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
            ((ah) this).field_G = -94;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((ah) this).field_Q != 0) {
              break L2;
            } else {
              L3: {
                if (4 == ((ah) this).field_M) {
                  break L3;
                } else {
                  if ((((ah) this).field_k + -((ah) this).field_H ^ -1) <= -51) {
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
            ((ah) this).field_I = -65;
            break L0;
          }
        }
        L1: {
          L2: {
            if (0 != ((ah) this).field_b) {
              break L2;
            } else {
              if (((ah) this).field_r < 0) {
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
            var2 = ((ah) this).field_N;
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
                    if ((((ah) this).field_p ^ -1) < -1) {
                      if (((ah) this).field_Q != 0) {
                        ((ah) this).field_p = ((ah) this).field_p - 1;
                        break L0;
                      } else {
                        break L0;
                      }
                    } else {
                      if (((ah) this).field_v < -1) {
                        break L0;
                      } else {
                        ((ah) this).field_v = 200;
                        break L0;
                      }
                    }
                  } else {
                    if (var2 != 2) {
                      if ((var2 ^ -1) != -4) {
                        break L0;
                      } else {
                        if (0 < ((ah) this).field_v) {
                          break L0;
                        } else {
                          ((ah) this).field_v = 500;
                          break L0;
                        }
                      }
                    } else {
                      if (-1 < ((ah) this).field_v) {
                        break L0;
                      } else {
                        ((ah) this).field_v = 200;
                        if (-1 == (((ah) this).field_Q ^ -1)) {
                          ((ah) this).field_v = 0;
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
        float[] var12 = null;
        float[] var13 = null;
        float[] var15 = null;
        float[] var16 = null;
        float[] var17 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (!td.field_m) {
          L0: {
            if (-1 > (((ah) this).field_x ^ -1)) {
              ((ah) this).field_x = ((ah) this).field_x - 1;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (this.f(62)) {
              ((ah) this).field_r = ((ah) this).field_r + 1;
              break L1;
            } else {
              break L1;
            }
          }
          if (((ah) this).field_w <= 0) {
            if (((ah) this).field_r <= -1) {
              L2: {
                if (0 < ((ah) this).field_j) {
                  ((ah) this).field_j = ((ah) this).field_j - 1;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (0 != ((ah) this).field_j) {
                  break L3;
                } else {
                  this.m((byte) 116);
                  break L3;
                }
              }
              L4: {
                ((ah) this).field_d = ((ah) this).field_d + 1;
                if (((ah) this).field_Q != 0) {
                  break L4;
                } else {
                  if (((ah) this).field_d * 20 / 1000 >= 30) {
                    th.b(24753, 247, 8);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (-1 > (((ah) this).field_b ^ -1)) {
                  ((ah) this).field_A = ((ah) this).field_A >> 1;
                  ((ah) this).field_b = ((ah) this).field_b + 1;
                  ((ah) this).field_E = ((ah) this).field_E >> 1;
                  if (2 == ((ah) this).field_b) {
                    ts.a(((ah) this).field_C, ((ah) this).field_q, -16240, 20, lr.field_a[((ah) this).field_Q], ((ah) this).field_z);
                    var5 = new float[]{0.0f, -3.0f};
                    var15 = kt.a((byte) -99, var5, (float)((ah) this).field_s);
                    var12 = var15;
                    var9 = var12;
                    var6 = var9;
                    var2 = var6;
                    ((ah) this).field_q.a((ms) (Object) new aj(100, ((ah) this).field_C, ((ah) this).field_z, this.a(0), ((ah) this).field_s, Math.random() / 100.0, (int)var15[0] << 606339464, (int)var15[1] << 1452318728, ((ah) this).field_Q, 0, this.e((byte) -5) >> -1504608952), (byte) 39);
                    var16 = kt.a((byte) -16, var2, (float)(((ah) this).field_s + 2.0943951023931953));
                    var13 = var16;
                    var10 = var13;
                    var7 = var10;
                    var2 = var7;
                    ((ah) this).field_q.a((ms) (Object) new aj(100, ((ah) this).field_C, ((ah) this).field_z, this.a(0), ((ah) this).field_s, Math.random() / 100.0, (int)var16[0] << -1717203704, (int)var16[1] << -19058808, ((ah) this).field_Q, 1, this.e((byte) -5) >> 1825777928), (byte) 39);
                    var17 = kt.a((byte) -43, var2, (float)(4.1887902047863905 + ((ah) this).field_s));
                    ((ah) this).field_q.a((ms) (Object) new aj(100, ((ah) this).field_C, ((ah) this).field_z, this.a(0), ((ah) this).field_s, Math.random() / 100.0, (int)var17[0] << 1966914184, (int)var17[1] << -1862952920, ((ah) this).field_Q, 2, this.e((byte) -5) >> 122771240), (byte) 39);
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                if (((ah) this).g(73)) {
                  break L6;
                } else {
                  ((ah) this).field_C = ((ah) this).field_C + ((ah) this).field_E;
                  ((ah) this).field_z = ((ah) this).field_z + ((ah) this).field_A;
                  break L6;
                }
              }
              if (param0 <= -55) {
                L7: {
                  if (!((ah) this).field_f) {
                    ((ah) this).field_A = (-((ah) this).field_h + 251) * ((ah) this).field_A / 256;
                    ((ah) this).field_E = ((ah) this).field_E * (251 - ((ah) this).field_h) / 256;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (2 == ((ah) this).field_Q) {
                    if (!wn.a(((ah) this).field_B, 2048, -128, ((ah) this).field_C, ((ah) this).field_K, ((ah) this).field_z)) {
                      if (((ah) this).i(-2)) {
                        if (0 != ((ah) this).field_Q) {
                          break L8;
                        } else {
                          ab.a(lr.field_a[((ah) this).field_Q], ((ah) this).field_q, (ah) this, 40, ((ah) this).field_z, ((ah) this).field_C, (byte) 121);
                          break L8;
                        }
                      } else {
                        if (!((ah) this).i(-2)) {
                          break L8;
                        } else {
                          if (0 != ((ah) this).field_Q) {
                            break L8;
                          } else {
                            ab.a(lr.field_a[((ah) this).field_Q], ((ah) this).field_q, (ah) this, 40, ((ah) this).field_z, ((ah) this).field_C, (byte) 121);
                            break L8;
                          }
                        }
                      }
                    } else {
                      if (((ah) this).i(-2)) {
                        if (0 != ((ah) this).field_Q) {
                          break L8;
                        } else {
                          ab.a(lr.field_a[((ah) this).field_Q], ((ah) this).field_q, (ah) this, 40, ((ah) this).field_z, ((ah) this).field_C, (byte) 121);
                          break L8;
                        }
                      } else {
                        if (!((ah) this).i(-2)) {
                          break L8;
                        } else {
                          if (0 != ((ah) this).field_Q) {
                            break L8;
                          } else {
                            ab.a(lr.field_a[((ah) this).field_Q], ((ah) this).field_q, (ah) this, 40, ((ah) this).field_z, ((ah) this).field_C, (byte) 121);
                            break L8;
                          }
                        }
                      }
                    }
                  } else {
                    if (!((ah) this).i(-2)) {
                      break L8;
                    } else {
                      if (0 != ((ah) this).field_Q) {
                        break L8;
                      } else {
                        ab.a(lr.field_a[((ah) this).field_Q], ((ah) this).field_q, (ah) this, 40, ((ah) this).field_z, ((ah) this).field_C, (byte) 121);
                        break L8;
                      }
                    }
                  }
                }
                L9: {
                  if (0 != (((ah) this).field_M ^ -1)) {
                    L10: {
                      ((ah) this).field_O = ((ah) this).field_O - 1;
                      if (0 != ((ah) this).field_O) {
                        break L10;
                      } else {
                        this.b(677397768);
                        break L10;
                      }
                    }
                    if (((ah) this).field_k % 2 != 0) {
                      ((ah) this).field_q.a((ms) (Object) new eq(50, ((ah) this).field_C + (fi.a(2048, he.field_o, (byte) -96) + -1024) >> 416903272, -1024 + (((ah) this).field_z - -fi.a(2048, he.field_o, (byte) -96)) >> 1906907240, this.a(0), ((ah) this).field_M - -1, true), (byte) 39);
                      break L9;
                    } else {
                      ((ah) this).field_q.a((ms) (Object) new eq(50, -1024 + ((ah) this).field_C + fi.a(2048, he.field_o, (byte) -96) >> -507827032, -1024 + (((ah) this).field_z + fi.a(2048, he.field_o, (byte) -96)) >> 559324488, this.a(0), 1 + ((ah) this).field_M, false), (byte) 39);
                      break L9;
                    }
                  } else {
                    break L9;
                  }
                }
                var4 = (nt) (Object) ((ah) this).field_q.b(118);
                L11: while (true) {
                  if (var4 == null) {
                    L12: {
                      if (!((ah) this).g(66)) {
                        break L12;
                      } else {
                        ((ah) this).field_m = ((ah) this).field_m + 2048;
                        ((ah) this).field_c = ((ah) this).field_c - 1;
                        if (((ah) this).field_c != 0) {
                          break L12;
                        } else {
                          this.k(1261228232);
                          break L12;
                        }
                      }
                    }
                    L13: {
                      ((ah) this).field_f = false;
                      if ((((ah) this).field_G ^ -1) < -1) {
                        ((ah) this).field_G = ((ah) this).field_G - 1;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      ((ah) this).field_D = false;
                      if (0 >= ((ah) this).field_v) {
                        break L14;
                      } else {
                        ((ah) this).field_v = ((ah) this).field_v - 1;
                        if (((ah) this).field_v != 0) {
                          break L14;
                        } else {
                          if (((ah) this).field_N != 1) {
                            break L14;
                          } else {
                            ((ah) this).field_p = 3;
                            break L14;
                          }
                        }
                      }
                    }
                    ((ah) this).field_k = ((ah) this).field_k + 1;
                    return;
                  } else {
                    L15: {
                      if (!var4.a(-2567)) {
                        break L15;
                      } else {
                        var4.b(false);
                        break L15;
                      }
                    }
                    var4 = (nt) (Object) ((ah) this).field_q.d((byte) 18);
                    continue L11;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            ((ah) this).field_w = ((ah) this).field_w - 1;
            return;
          }
        } else {
          return;
        }
    }

    final void l(byte param0) {
        if (!(((ah) this).field_b == 0)) {
            return;
        }
        ((ah) this).field_b = 1;
        int var2 = 117 % ((74 - param0) / 47);
    }

    private final int a(int param0) {
        int var2 = -1414832128;
        if (param0 != 0) {
            ((ah) this).field_r = 86;
        }
        if (((ah) this).field_M != 0) {
            // if_icmpne L46
            var2 = -1436548949;
        } else {
            var2 = -1442815829;
        }
        return var2;
    }

    final void a(boolean param0, int param1, int param2) {
        L0: {
          if (-3 == (((ah) this).field_Q ^ -1)) {
            L1: {
              if (((ah) this).field_K != -1) {
                break L1;
              } else {
                if (-1 == ((ah) this).field_B) {
                  ((ah) this).field_B = param1;
                  ((ah) this).field_K = param2;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            param2 = ((ah) this).field_K;
            param1 = ((ah) this).field_B;
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          if (!param0) {
            break L2;
          } else {
            boolean discarded$1 = ((ah) this).g((byte) 123);
            break L2;
          }
        }
        ((ah) this).b(-108, param1 + -((ah) this).field_z >> 2108594088, -((ah) this).field_C + param2 >> -198544472);
    }

    final boolean g(byte param0) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -59) {
          return true;
        } else {
          L0: {
            if ((((ah) this).field_k + -((ah) this).field_H ^ -1) != -981) {
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
            ((ah) this).field_P = 112;
        }
        return 36 <= ((ah) this).field_l ? true : false;
    }

    final boolean a(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 >= 110) {
            break L0;
          } else {
            ((ah) this).b(true);
            break L0;
          }
        }
        L1: {
          L2: {
            if (0 > ((ah) this).field_r) {
              break L2;
            } else {
              if (-1 != (((ah) this).field_b ^ -1)) {
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
            ((ah) this).b(false);
        }
        return (((ah) this).field_x ^ -1) == -1 ? true : false;
    }

    private final int e(byte param0) {
        if (param0 != -5) {
            return 24;
        }
        if (-2 != (((ah) this).field_M ^ -1)) {
            return 2560;
        }
        return 5120;
    }

    private final void m(byte param0) {
        ((ah) this).field_c = 12;
        ((ah) this).field_n = true;
        ((ah) this).field_q = new jn();
        ts.a(((ah) this).field_C, ((ah) this).field_q, -16240, 40, lr.field_a[((ah) this).field_Q], ((ah) this).field_z);
        int var2 = 111 % ((param0 - 57) / 38);
        gn.a(19 + fi.a(3, he.field_o, (byte) -96), true);
    }

    private final void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Sumoblitz.field_L ? 1 : 0;
          var2 = ((ah) this).field_Q;
          if ((var2 ^ -1) != -2) {
            if ((var2 ^ -1) == -3) {
              ((ah) this).field_o = 40;
              ((ah) this).field_x = -1;
              ((ah) this).field_a = -(rl.field_k << 2058852866) + (rl.field_k << 838364583);
              ((ah) this).field_i = 2800;
              ((ah) this).field_L = 1.0;
              break L0;
            } else {
              if (var2 != 3) {
                if ((var2 ^ -1) != -5) {
                  if (5 == var2) {
                    ((ah) this).field_L = 0.5;
                    ((ah) this).field_a = rl.field_k << 1688842055;
                    ((ah) this).field_i = 1600;
                    ((ah) this).field_x = -1;
                    ((ah) this).field_o = 160;
                    break L0;
                  } else {
                    if (0 != var2) {
                      break L0;
                    } else {
                      ((ah) this).field_x = -1;
                      ((ah) this).field_o = 128;
                      ((ah) this).field_i = 1024;
                      ((ah) this).field_m = 5120;
                      break L0;
                    }
                  }
                } else {
                  ((ah) this).field_i = 700;
                  ((ah) this).field_a = -(rl.field_k << -945383390) + (rl.field_k << 1160087367);
                  ((ah) this).field_e = 4;
                  ((ah) this).field_u = 4;
                  ((ah) this).field_x = -1;
                  ((ah) this).field_o = 80;
                  break L0;
                }
              } else {
                ((ah) this).field_o = 80;
                ((ah) this).field_x = 0;
                ((ah) this).field_a = rl.field_k << -2015175833;
                ((ah) this).field_i = 700;
                break L0;
              }
            }
          } else {
            ((ah) this).field_a = (rl.field_k << 480287399) + -(rl.field_k << 1377071714);
            ((ah) this).field_o = 60;
            ((ah) this).field_i = 600;
            ((ah) this).field_x = -1;
            break L0;
          }
        }
        L1: {
          var2 = ((ah) this).field_N;
          if (var2 == 0) {
            if (-1 != (((ah) this).field_Q ^ -1)) {
              ((ah) this).field_m = 5120;
              break L1;
            } else {
              break L1;
            }
          } else {
            if (1 == var2) {
              ((ah) this).field_p = 3;
              ((ah) this).field_m = 5120;
              break L1;
            } else {
              if (-3 != (var2 ^ -1)) {
                if (3 != var2) {
                  if (var2 == 4) {
                    L2: {
                      if (((ah) this).field_Q != 4) {
                        break L2;
                      } else {
                        ((ah) this).field_e = 4;
                        ((ah) this).field_u = 1;
                        break L2;
                      }
                    }
                    ((ah) this).field_m = 3072;
                    ((ah) this).field_o = ((ah) this).field_o >> 1;
                    break L1;
                  } else {
                    if (5 != var2) {
                      if (6 == var2) {
                        ((ah) this).field_m = 14336;
                        ((ah) this).field_u = ((ah) this).field_Q;
                        ((ah) this).field_o = ((ah) this).field_o << 1;
                        ((ah) this).field_e = 5;
                        ((ah) this).field_i = ((ah) this).field_i >> 1;
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      ((ah) this).field_o = ((ah) this).field_o << 1;
                      ((ah) this).field_m = 7168;
                      if (((ah) this).field_Q != 4) {
                        break L1;
                      } else {
                        ((ah) this).field_e = 0;
                        ((ah) this).field_u = 4;
                        break L1;
                      }
                    }
                  }
                } else {
                  ((ah) this).field_L = ((ah) this).field_L / 2.0;
                  ((ah) this).field_m = 5120;
                  break L1;
                }
              } else {
                ((ah) this).field_m = 5120;
                break L1;
              }
            }
          }
        }
        L3: {
          if (!rf.a(false)) {
            break L3;
          } else {
            if (((ah) this).field_Q != 0) {
              ((ah) this).field_L = ((ah) this).field_L * 2.0;
              ((ah) this).field_i = ((ah) this).field_i << 1;
              ((ah) this).field_o = ((ah) this).field_o << 1;
              break L3;
            } else {
              break L3;
            }
          }
        }
        if (param0 < 89) {
          return;
        } else {
          ((ah) this).field_m = ((ah) this).field_m >> 1;
          return;
        }
    }

    private final void b(byte param0) {
        ((ah) this).field_I = ((ah) this).field_I + 1;
        if (-11 > (((ah) this).field_I ^ -1)) {
            ((ah) this).field_I = 10;
        }
        if (param0 != 61) {
            ((ah) this).field_b = 40;
        }
        ((ah) this).c((byte) 35);
    }

    final void m(int param0) {
        if (param0 >= -50) {
            ((ah) this).b(true);
        }
        ((ah) this).field_l = 0;
    }

    final boolean j(int param0) {
        if (param0 != 20) {
            return false;
        }
        return -((ah) this).field_H + ((ah) this).field_k > 1000 ? true : false;
    }

    final boolean g(int param0) {
        if (param0 <= 17) {
            return true;
        }
        return ((ah) this).field_n;
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Sumoblitz.field_L ? 1 : 0;
          if (param0 < -4) {
            break L0;
          } else {
            ((ah) this).field_n = true;
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
        if ((((ah) this).field_m ^ -1) < -2561) {
            ((ah) this).field_m = 2560;
        }
        ((ah) this).field_M = -1;
        ((ah) this).c((byte) 35);
        if (param0 != 677397768) {
            boolean discarded$0 = ((ah) this).f((byte) 38);
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
            ((ah) this).field_N = 4;
            break L0;
          }
        }
        if (var7 == null) {
          return true;
        } else {
          if (((Object) (Object) var7).equals(this)) {
            return true;
          } else {
            var3 = ((ah) this).field_m + var7.field_m;
            if (!wn.a(var7.field_z, var3, -115, ((ah) this).field_C, var7.field_C, ((ah) this).field_z)) {
              return true;
            } else {
              L1: {
                var4 = -var7.field_C + ((ah) this).field_C;
                if (var4 != 0) {
                  break L1;
                } else {
                  var4 = -1 + (2 & ((ah) this).field_k << -2058813855);
                  break L1;
                }
              }
              L2: {
                var5 = ((ah) this).field_z + -var7.field_z;
                if (0 != var5) {
                  break L2;
                } else {
                  var5 = -1 + ((1 & ((ah) this).field_k) << -1157820447);
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
        int var3 = 0;
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
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        hr stackIn_21_0 = null;
        float stackIn_21_1 = 0.0f;
        float stackIn_21_2 = 0.0f;
        hr stackIn_22_0 = null;
        float stackIn_22_1 = 0.0f;
        float stackIn_22_2 = 0.0f;
        hr stackIn_23_0 = null;
        float stackIn_23_1 = 0.0f;
        float stackIn_23_2 = 0.0f;
        int stackIn_23_3 = 0;
        hr stackIn_29_0 = null;
        float stackIn_29_1 = 0.0f;
        float stackIn_29_2 = 0.0f;
        hr stackIn_30_0 = null;
        float stackIn_30_1 = 0.0f;
        float stackIn_30_2 = 0.0f;
        hr stackIn_31_0 = null;
        float stackIn_31_1 = 0.0f;
        float stackIn_31_2 = 0.0f;
        int stackIn_31_3 = 0;
        hr stackIn_34_0 = null;
        float stackIn_34_1 = 0.0f;
        float stackIn_34_2 = 0.0f;
        hr stackIn_35_0 = null;
        float stackIn_35_1 = 0.0f;
        float stackIn_35_2 = 0.0f;
        hr stackIn_36_0 = null;
        float stackIn_36_1 = 0.0f;
        float stackIn_36_2 = 0.0f;
        int stackIn_36_3 = 0;
        hr stackIn_39_0 = null;
        float stackIn_39_1 = 0.0f;
        float stackIn_39_2 = 0.0f;
        double stackIn_39_3 = 0.0;
        hr stackIn_40_0 = null;
        float stackIn_40_1 = 0.0f;
        float stackIn_40_2 = 0.0f;
        double stackIn_40_3 = 0.0;
        hr stackIn_41_0 = null;
        float stackIn_41_1 = 0.0f;
        float stackIn_41_2 = 0.0f;
        double stackIn_41_3 = 0.0;
        int stackIn_41_4 = 0;
        ha stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_43_2 = 0;
        int stackIn_43_3 = 0;
        int stackIn_43_4 = 0;
        ha stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        int stackIn_44_3 = 0;
        int stackIn_44_4 = 0;
        ha stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        int stackIn_45_3 = 0;
        int stackIn_45_4 = 0;
        int stackIn_45_5 = 0;
        hr stackIn_47_0 = null;
        float stackIn_47_1 = 0.0f;
        float stackIn_47_2 = 0.0f;
        hr stackIn_48_0 = null;
        float stackIn_48_1 = 0.0f;
        float stackIn_48_2 = 0.0f;
        hr stackIn_49_0 = null;
        float stackIn_49_1 = 0.0f;
        float stackIn_49_2 = 0.0f;
        int stackIn_49_3 = 0;
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
        hr stackIn_64_0 = null;
        float stackIn_64_1 = 0.0f;
        float stackIn_64_2 = 0.0f;
        double stackIn_64_3 = 0.0;
        hr stackIn_65_0 = null;
        float stackIn_65_1 = 0.0f;
        float stackIn_65_2 = 0.0f;
        double stackIn_65_3 = 0.0;
        hr stackIn_66_0 = null;
        float stackIn_66_1 = 0.0f;
        float stackIn_66_2 = 0.0f;
        double stackIn_66_3 = 0.0;
        int stackIn_66_4 = 0;
        hr stackIn_71_0 = null;
        float stackIn_71_1 = 0.0f;
        float stackIn_71_2 = 0.0f;
        double stackIn_71_3 = 0.0;
        hr stackIn_72_0 = null;
        float stackIn_72_1 = 0.0f;
        float stackIn_72_2 = 0.0f;
        double stackIn_72_3 = 0.0;
        hr stackIn_73_0 = null;
        float stackIn_73_1 = 0.0f;
        float stackIn_73_2 = 0.0f;
        double stackIn_73_3 = 0.0;
        int stackIn_73_4 = 0;
        hr stackIn_76_0 = null;
        float stackIn_76_1 = 0.0f;
        float stackIn_76_2 = 0.0f;
        double stackIn_76_3 = 0.0;
        hr stackIn_77_0 = null;
        float stackIn_77_1 = 0.0f;
        float stackIn_77_2 = 0.0f;
        double stackIn_77_3 = 0.0;
        hr stackIn_78_0 = null;
        float stackIn_78_1 = 0.0f;
        float stackIn_78_2 = 0.0f;
        double stackIn_78_3 = 0.0;
        int stackIn_78_4 = 0;
        hr stackIn_81_0 = null;
        float stackIn_81_1 = 0.0f;
        float stackIn_81_2 = 0.0f;
        double stackIn_81_3 = 0.0;
        hr stackIn_82_0 = null;
        float stackIn_82_1 = 0.0f;
        float stackIn_82_2 = 0.0f;
        double stackIn_82_3 = 0.0;
        hr stackIn_83_0 = null;
        float stackIn_83_1 = 0.0f;
        float stackIn_83_2 = 0.0f;
        double stackIn_83_3 = 0.0;
        int stackIn_83_4 = 0;
        hr stackIn_86_0 = null;
        float stackIn_86_1 = 0.0f;
        float stackIn_86_2 = 0.0f;
        double stackIn_86_3 = 0.0;
        hr stackIn_87_0 = null;
        float stackIn_87_1 = 0.0f;
        float stackIn_87_2 = 0.0f;
        double stackIn_87_3 = 0.0;
        hr stackIn_88_0 = null;
        float stackIn_88_1 = 0.0f;
        float stackIn_88_2 = 0.0f;
        double stackIn_88_3 = 0.0;
        int stackIn_88_4 = 0;
        hr stackIn_90_0 = null;
        float stackIn_90_1 = 0.0f;
        float stackIn_90_2 = 0.0f;
        hr stackIn_91_0 = null;
        float stackIn_91_1 = 0.0f;
        float stackIn_91_2 = 0.0f;
        hr stackIn_92_0 = null;
        float stackIn_92_1 = 0.0f;
        float stackIn_92_2 = 0.0f;
        int stackIn_92_3 = 0;
        hr stackIn_120_0 = null;
        float stackIn_120_1 = 0.0f;
        float stackIn_120_2 = 0.0f;
        double stackIn_120_3 = 0.0;
        hr stackIn_121_0 = null;
        float stackIn_121_1 = 0.0f;
        float stackIn_121_2 = 0.0f;
        double stackIn_121_3 = 0.0;
        hr stackIn_122_0 = null;
        float stackIn_122_1 = 0.0f;
        float stackIn_122_2 = 0.0f;
        double stackIn_122_3 = 0.0;
        int stackIn_122_4 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
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
        hr stackOut_46_0 = null;
        float stackOut_46_1 = 0.0f;
        float stackOut_46_2 = 0.0f;
        hr stackOut_48_0 = null;
        float stackOut_48_1 = 0.0f;
        float stackOut_48_2 = 0.0f;
        int stackOut_48_3 = 0;
        hr stackOut_47_0 = null;
        float stackOut_47_1 = 0.0f;
        float stackOut_47_2 = 0.0f;
        int stackOut_47_3 = 0;
        ha stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        int stackOut_42_3 = 0;
        int stackOut_42_4 = 0;
        ha stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        int stackOut_44_3 = 0;
        int stackOut_44_4 = 0;
        int stackOut_44_5 = 0;
        ha stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        int stackOut_43_3 = 0;
        int stackOut_43_4 = 0;
        int stackOut_43_5 = 0;
        hr stackOut_38_0 = null;
        float stackOut_38_1 = 0.0f;
        float stackOut_38_2 = 0.0f;
        double stackOut_38_3 = 0.0;
        hr stackOut_40_0 = null;
        float stackOut_40_1 = 0.0f;
        float stackOut_40_2 = 0.0f;
        double stackOut_40_3 = 0.0;
        int stackOut_40_4 = 0;
        hr stackOut_39_0 = null;
        float stackOut_39_1 = 0.0f;
        float stackOut_39_2 = 0.0f;
        double stackOut_39_3 = 0.0;
        int stackOut_39_4 = 0;
        hr stackOut_33_0 = null;
        float stackOut_33_1 = 0.0f;
        float stackOut_33_2 = 0.0f;
        hr stackOut_35_0 = null;
        float stackOut_35_1 = 0.0f;
        float stackOut_35_2 = 0.0f;
        int stackOut_35_3 = 0;
        hr stackOut_34_0 = null;
        float stackOut_34_1 = 0.0f;
        float stackOut_34_2 = 0.0f;
        int stackOut_34_3 = 0;
        hr stackOut_28_0 = null;
        float stackOut_28_1 = 0.0f;
        float stackOut_28_2 = 0.0f;
        hr stackOut_30_0 = null;
        float stackOut_30_1 = 0.0f;
        float stackOut_30_2 = 0.0f;
        int stackOut_30_3 = 0;
        hr stackOut_29_0 = null;
        float stackOut_29_1 = 0.0f;
        float stackOut_29_2 = 0.0f;
        int stackOut_29_3 = 0;
        hr stackOut_20_0 = null;
        float stackOut_20_1 = 0.0f;
        float stackOut_20_2 = 0.0f;
        hr stackOut_22_0 = null;
        float stackOut_22_1 = 0.0f;
        float stackOut_22_2 = 0.0f;
        int stackOut_22_3 = 0;
        hr stackOut_21_0 = null;
        float stackOut_21_1 = 0.0f;
        float stackOut_21_2 = 0.0f;
        int stackOut_21_3 = 0;
        hr stackOut_89_0 = null;
        float stackOut_89_1 = 0.0f;
        float stackOut_89_2 = 0.0f;
        hr stackOut_91_0 = null;
        float stackOut_91_1 = 0.0f;
        float stackOut_91_2 = 0.0f;
        int stackOut_91_3 = 0;
        hr stackOut_90_0 = null;
        float stackOut_90_1 = 0.0f;
        float stackOut_90_2 = 0.0f;
        int stackOut_90_3 = 0;
        hr stackOut_85_0 = null;
        float stackOut_85_1 = 0.0f;
        float stackOut_85_2 = 0.0f;
        double stackOut_85_3 = 0.0;
        hr stackOut_87_0 = null;
        float stackOut_87_1 = 0.0f;
        float stackOut_87_2 = 0.0f;
        double stackOut_87_3 = 0.0;
        int stackOut_87_4 = 0;
        hr stackOut_86_0 = null;
        float stackOut_86_1 = 0.0f;
        float stackOut_86_2 = 0.0f;
        double stackOut_86_3 = 0.0;
        int stackOut_86_4 = 0;
        hr stackOut_80_0 = null;
        float stackOut_80_1 = 0.0f;
        float stackOut_80_2 = 0.0f;
        double stackOut_80_3 = 0.0;
        hr stackOut_82_0 = null;
        float stackOut_82_1 = 0.0f;
        float stackOut_82_2 = 0.0f;
        double stackOut_82_3 = 0.0;
        int stackOut_82_4 = 0;
        hr stackOut_81_0 = null;
        float stackOut_81_1 = 0.0f;
        float stackOut_81_2 = 0.0f;
        double stackOut_81_3 = 0.0;
        int stackOut_81_4 = 0;
        hr stackOut_75_0 = null;
        float stackOut_75_1 = 0.0f;
        float stackOut_75_2 = 0.0f;
        double stackOut_75_3 = 0.0;
        hr stackOut_77_0 = null;
        float stackOut_77_1 = 0.0f;
        float stackOut_77_2 = 0.0f;
        double stackOut_77_3 = 0.0;
        int stackOut_77_4 = 0;
        hr stackOut_76_0 = null;
        float stackOut_76_1 = 0.0f;
        float stackOut_76_2 = 0.0f;
        double stackOut_76_3 = 0.0;
        int stackOut_76_4 = 0;
        hr stackOut_70_0 = null;
        float stackOut_70_1 = 0.0f;
        float stackOut_70_2 = 0.0f;
        double stackOut_70_3 = 0.0;
        hr stackOut_72_0 = null;
        float stackOut_72_1 = 0.0f;
        float stackOut_72_2 = 0.0f;
        double stackOut_72_3 = 0.0;
        int stackOut_72_4 = 0;
        hr stackOut_71_0 = null;
        float stackOut_71_1 = 0.0f;
        float stackOut_71_2 = 0.0f;
        double stackOut_71_3 = 0.0;
        int stackOut_71_4 = 0;
        hr stackOut_63_0 = null;
        float stackOut_63_1 = 0.0f;
        float stackOut_63_2 = 0.0f;
        double stackOut_63_3 = 0.0;
        hr stackOut_65_0 = null;
        float stackOut_65_1 = 0.0f;
        float stackOut_65_2 = 0.0f;
        double stackOut_65_3 = 0.0;
        int stackOut_65_4 = 0;
        hr stackOut_64_0 = null;
        float stackOut_64_1 = 0.0f;
        float stackOut_64_2 = 0.0f;
        double stackOut_64_3 = 0.0;
        int stackOut_64_4 = 0;
        hr stackOut_119_0 = null;
        float stackOut_119_1 = 0.0f;
        float stackOut_119_2 = 0.0f;
        double stackOut_119_3 = 0.0;
        hr stackOut_121_0 = null;
        float stackOut_121_1 = 0.0f;
        float stackOut_121_2 = 0.0f;
        double stackOut_121_3 = 0.0;
        int stackOut_121_4 = 0;
        hr stackOut_120_0 = null;
        float stackOut_120_1 = 0.0f;
        float stackOut_120_2 = 0.0f;
        double stackOut_120_3 = 0.0;
        int stackOut_120_4 = 0;
        L0: {
          var14 = Sumoblitz.field_L ? 1 : 0;
          if (-1 != (((ah) this).field_b ^ -1)) {
            stackOut_2_0 = ((ah) this).field_b * ((ah) this).field_b << 2103773192;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var3 = stackIn_3_0;
          if (param1 == 19399) {
            break L1;
          } else {
            ((ah) this).field_i = -91;
            break L1;
          }
        }
        L2: {
          if (-1 >= (((ah) this).field_r ^ -1)) {
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L2;
          } else {
            stackOut_6_0 = ((ah) this).field_r * (((ah) this).field_r * ((ah) this).field_m) / 2500;
            stackIn_8_0 = stackOut_6_0;
            break L2;
          }
        }
        var4 = stackIn_8_0;
        var5 = ((ah) this).field_m - (-var3 + var4) >> 120577384;
        var6 = Math.max(0, 255 + -(((ah) this).field_b * ((ah) this).field_b)) << 868142008;
        var7 = (nt) (Object) ((ah) this).field_q.b(-80);
        L3: while (true) {
          if (var7 == null) {
            L4: {
              if (0 > ((ah) this).field_r) {
                ts.field_e[((ah) this).field_Q].a((float)(((ah) this).field_C >> 1342574344), (float)(((ah) this).field_z >> -1312488472), (int)(3072.0 * ((double)(((ah) this).field_m >> 1548462696) / 14.0)), (int)(((ah) this).field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (((ah) this).field_b != -1) {
                break L5;
              } else {
                L6: {
                  if (((ah) this).field_Q != 0) {
                    if (((ah) this).field_Q == 1) {
                      L7: {
                        stackOut_50_0 = dc.field_ab[0];
                        stackOut_50_1 = (float)(((ah) this).field_C >> 927252584);
                        stackOut_50_2 = (float)(((ah) this).field_z >> 677397768);
                        stackIn_52_0 = stackOut_50_0;
                        stackIn_52_1 = stackOut_50_1;
                        stackIn_52_2 = stackOut_50_2;
                        stackIn_51_0 = stackOut_50_0;
                        stackIn_51_1 = stackOut_50_1;
                        stackIn_51_2 = stackOut_50_2;
                        if (!((ah) this).g(28)) {
                          stackOut_52_0 = (hr) (Object) stackIn_52_0;
                          stackOut_52_1 = stackIn_52_1;
                          stackOut_52_2 = stackIn_52_2;
                          stackOut_52_3 = var5;
                          stackIn_53_0 = stackOut_52_0;
                          stackIn_53_1 = stackOut_52_1;
                          stackIn_53_2 = stackOut_52_2;
                          stackIn_53_3 = stackOut_52_3;
                          break L7;
                        } else {
                          stackOut_51_0 = (hr) (Object) stackIn_51_0;
                          stackOut_51_1 = stackIn_51_1;
                          stackOut_51_2 = stackIn_51_2;
                          stackOut_51_3 = 20;
                          stackIn_53_0 = stackOut_51_0;
                          stackIn_53_1 = stackOut_51_1;
                          stackIn_53_2 = stackOut_51_2;
                          stackIn_53_3 = stackOut_51_3;
                          break L7;
                        }
                      }
                      ((hr) (Object) stackIn_53_0).a(stackIn_53_1, stackIn_53_2, (int)((double)stackIn_53_3 / 14.0 * 3072.0), (int)(32768.0 * ((ah) this).field_s / 3.141592653589793), 1, 0, 2);
                      break L6;
                    } else {
                      if (-3 == ((ah) this).field_Q) {
                        L8: {
                          stackOut_46_0 = hv.field_d[0];
                          stackOut_46_1 = (float)(((ah) this).field_C >> 1158452072);
                          stackOut_46_2 = (float)(((ah) this).field_z >> -908871608);
                          stackIn_48_0 = stackOut_46_0;
                          stackIn_48_1 = stackOut_46_1;
                          stackIn_48_2 = stackOut_46_2;
                          stackIn_47_0 = stackOut_46_0;
                          stackIn_47_1 = stackOut_46_1;
                          stackIn_47_2 = stackOut_46_2;
                          if (!((ah) this).g(37)) {
                            stackOut_48_0 = (hr) (Object) stackIn_48_0;
                            stackOut_48_1 = stackIn_48_1;
                            stackOut_48_2 = stackIn_48_2;
                            stackOut_48_3 = var5;
                            stackIn_49_0 = stackOut_48_0;
                            stackIn_49_1 = stackOut_48_1;
                            stackIn_49_2 = stackOut_48_2;
                            stackIn_49_3 = stackOut_48_3;
                            break L8;
                          } else {
                            stackOut_47_0 = (hr) (Object) stackIn_47_0;
                            stackOut_47_1 = stackIn_47_1;
                            stackOut_47_2 = stackIn_47_2;
                            stackOut_47_3 = 20;
                            stackIn_49_0 = stackOut_47_0;
                            stackIn_49_1 = stackOut_47_1;
                            stackIn_49_2 = stackOut_47_2;
                            stackIn_49_3 = stackOut_47_3;
                            break L8;
                          }
                        }
                        ((hr) (Object) stackIn_49_0).a(stackIn_49_1, stackIn_49_2, (int)((double)stackIn_49_3 / 14.0 * 3072.0), (int)(((ah) this).field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                        break L6;
                      } else {
                        if (-4 != ((ah) this).field_Q) {
                          if (((ah) this).field_Q != 4) {
                            if (5 != ((ah) this).field_Q) {
                              L9: {
                                stackOut_42_0 = (ha) param0;
                                stackOut_42_1 = ((ah) this).field_C >> -1328135608;
                                stackOut_42_2 = ((ah) this).field_z >> 163378280;
                                stackOut_42_3 = var5;
                                stackOut_42_4 = var6 + dp.a(-26346, ((ah) this).field_Q);
                                stackIn_44_0 = stackOut_42_0;
                                stackIn_44_1 = stackOut_42_1;
                                stackIn_44_2 = stackOut_42_2;
                                stackIn_44_3 = stackOut_42_3;
                                stackIn_44_4 = stackOut_42_4;
                                stackIn_43_0 = stackOut_42_0;
                                stackIn_43_1 = stackOut_42_1;
                                stackIn_43_2 = stackOut_42_2;
                                stackIn_43_3 = stackOut_42_3;
                                stackIn_43_4 = stackOut_42_4;
                                if (var6 != 255) {
                                  stackOut_44_0 = (ha) (Object) stackIn_44_0;
                                  stackOut_44_1 = stackIn_44_1;
                                  stackOut_44_2 = stackIn_44_2;
                                  stackOut_44_3 = stackIn_44_3;
                                  stackOut_44_4 = stackIn_44_4;
                                  stackOut_44_5 = 1;
                                  stackIn_45_0 = stackOut_44_0;
                                  stackIn_45_1 = stackOut_44_1;
                                  stackIn_45_2 = stackOut_44_2;
                                  stackIn_45_3 = stackOut_44_3;
                                  stackIn_45_4 = stackOut_44_4;
                                  stackIn_45_5 = stackOut_44_5;
                                  break L9;
                                } else {
                                  stackOut_43_0 = (ha) (Object) stackIn_43_0;
                                  stackOut_43_1 = stackIn_43_1;
                                  stackOut_43_2 = stackIn_43_2;
                                  stackOut_43_3 = stackIn_43_3;
                                  stackOut_43_4 = stackIn_43_4;
                                  stackOut_43_5 = 0;
                                  stackIn_45_0 = stackOut_43_0;
                                  stackIn_45_1 = stackOut_43_1;
                                  stackIn_45_2 = stackOut_43_2;
                                  stackIn_45_3 = stackOut_43_3;
                                  stackIn_45_4 = stackOut_43_4;
                                  stackIn_45_5 = stackOut_43_5;
                                  break L9;
                                }
                              }
                              ((ha) (Object) stackIn_45_0).s(stackIn_45_1, stackIn_45_2, stackIn_45_3, stackIn_45_4, stackIn_45_5);
                              break L6;
                            } else {
                              L10: {
                                stackOut_38_0 = mr.field_e[0];
                                stackOut_38_1 = (float)(((ah) this).field_C >> -1892212856);
                                stackOut_38_2 = (float)(((ah) this).field_z >> -1487166040);
                                stackOut_38_3 = 3072.0;
                                stackIn_40_0 = stackOut_38_0;
                                stackIn_40_1 = stackOut_38_1;
                                stackIn_40_2 = stackOut_38_2;
                                stackIn_40_3 = stackOut_38_3;
                                stackIn_39_0 = stackOut_38_0;
                                stackIn_39_1 = stackOut_38_1;
                                stackIn_39_2 = stackOut_38_2;
                                stackIn_39_3 = stackOut_38_3;
                                if (((ah) this).g(param1 + -19316)) {
                                  stackOut_40_0 = (hr) (Object) stackIn_40_0;
                                  stackOut_40_1 = stackIn_40_1;
                                  stackOut_40_2 = stackIn_40_2;
                                  stackOut_40_3 = stackIn_40_3;
                                  stackOut_40_4 = 20;
                                  stackIn_41_0 = stackOut_40_0;
                                  stackIn_41_1 = stackOut_40_1;
                                  stackIn_41_2 = stackOut_40_2;
                                  stackIn_41_3 = stackOut_40_3;
                                  stackIn_41_4 = stackOut_40_4;
                                  break L10;
                                } else {
                                  stackOut_39_0 = (hr) (Object) stackIn_39_0;
                                  stackOut_39_1 = stackIn_39_1;
                                  stackOut_39_2 = stackIn_39_2;
                                  stackOut_39_3 = stackIn_39_3;
                                  stackOut_39_4 = var5;
                                  stackIn_41_0 = stackOut_39_0;
                                  stackIn_41_1 = stackOut_39_1;
                                  stackIn_41_2 = stackOut_39_2;
                                  stackIn_41_3 = stackOut_39_3;
                                  stackIn_41_4 = stackOut_39_4;
                                  break L10;
                                }
                              }
                              ((hr) (Object) stackIn_41_0).a(stackIn_41_1, stackIn_41_2, (int)(stackIn_41_3 * ((double)stackIn_41_4 / 14.0)), (int)(32768.0 * ((ah) this).field_s / 3.141592653589793), 1, 0, 2);
                              break L6;
                            }
                          } else {
                            L11: {
                              stackOut_33_0 = ak.field_a[0];
                              stackOut_33_1 = (float)(((ah) this).field_C >> 189386920);
                              stackOut_33_2 = (float)(((ah) this).field_z >> 1604747752);
                              stackIn_35_0 = stackOut_33_0;
                              stackIn_35_1 = stackOut_33_1;
                              stackIn_35_2 = stackOut_33_2;
                              stackIn_34_0 = stackOut_33_0;
                              stackIn_34_1 = stackOut_33_1;
                              stackIn_34_2 = stackOut_33_2;
                              if (!((ah) this).g(27)) {
                                stackOut_35_0 = (hr) (Object) stackIn_35_0;
                                stackOut_35_1 = stackIn_35_1;
                                stackOut_35_2 = stackIn_35_2;
                                stackOut_35_3 = var5;
                                stackIn_36_0 = stackOut_35_0;
                                stackIn_36_1 = stackOut_35_1;
                                stackIn_36_2 = stackOut_35_2;
                                stackIn_36_3 = stackOut_35_3;
                                break L11;
                              } else {
                                stackOut_34_0 = (hr) (Object) stackIn_34_0;
                                stackOut_34_1 = stackIn_34_1;
                                stackOut_34_2 = stackIn_34_2;
                                stackOut_34_3 = 20;
                                stackIn_36_0 = stackOut_34_0;
                                stackIn_36_1 = stackOut_34_1;
                                stackIn_36_2 = stackOut_34_2;
                                stackIn_36_3 = stackOut_34_3;
                                break L11;
                              }
                            }
                            ((hr) (Object) stackIn_36_0).a(stackIn_36_1, stackIn_36_2, (int)((double)stackIn_36_3 / 14.0 * 3072.0), (int)(((ah) this).field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                            break L6;
                          }
                        } else {
                          L12: {
                            stackOut_28_0 = s.field_n[0];
                            stackOut_28_1 = (float)(((ah) this).field_C >> 1207855496);
                            stackOut_28_2 = (float)(((ah) this).field_z >> -299524152);
                            stackIn_30_0 = stackOut_28_0;
                            stackIn_30_1 = stackOut_28_1;
                            stackIn_30_2 = stackOut_28_2;
                            stackIn_29_0 = stackOut_28_0;
                            stackIn_29_1 = stackOut_28_1;
                            stackIn_29_2 = stackOut_28_2;
                            if (((ah) this).g(106)) {
                              stackOut_30_0 = (hr) (Object) stackIn_30_0;
                              stackOut_30_1 = stackIn_30_1;
                              stackOut_30_2 = stackIn_30_2;
                              stackOut_30_3 = 20;
                              stackIn_31_0 = stackOut_30_0;
                              stackIn_31_1 = stackOut_30_1;
                              stackIn_31_2 = stackOut_30_2;
                              stackIn_31_3 = stackOut_30_3;
                              break L12;
                            } else {
                              stackOut_29_0 = (hr) (Object) stackIn_29_0;
                              stackOut_29_1 = stackIn_29_1;
                              stackOut_29_2 = stackIn_29_2;
                              stackOut_29_3 = var5;
                              stackIn_31_0 = stackOut_29_0;
                              stackIn_31_1 = stackOut_29_1;
                              stackIn_31_2 = stackOut_29_2;
                              stackIn_31_3 = stackOut_29_3;
                              break L12;
                            }
                          }
                          ((hr) (Object) stackIn_31_0).a(stackIn_31_1, stackIn_31_2, (int)((double)stackIn_31_3 / 14.0 * 3072.0), (int)(((ah) this).field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                          break L6;
                        }
                      }
                    }
                  } else {
                    L13: {
                      if (!((ah) this).j(20)) {
                        break L13;
                      } else {
                        if (0 >= ((ah) this).field_l) {
                          break L13;
                        } else {
                          if (-1 == ul.field_f) {
                            ht.field_e[6 + -(((ah) this).field_l / 7) + 3].a((float)(((ah) this).field_C >> 261369544), (float)(((ah) this).field_z >> -1794895480), (int)(3072.0 * ((double)var5 / 14.0)), (int)(32768.0 * ((ah) this).field_s / 3.141592653589793), 1, 0, 2);
                            break L6;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    L14: {
                      stackOut_20_0 = ht.field_e[0];
                      stackOut_20_1 = (float)(((ah) this).field_C >> 1093394152);
                      stackOut_20_2 = (float)(((ah) this).field_z >> 375796840);
                      stackIn_22_0 = stackOut_20_0;
                      stackIn_22_1 = stackOut_20_1;
                      stackIn_22_2 = stackOut_20_2;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      stackIn_21_2 = stackOut_20_2;
                      if (!((ah) this).g(114)) {
                        stackOut_22_0 = (hr) (Object) stackIn_22_0;
                        stackOut_22_1 = stackIn_22_1;
                        stackOut_22_2 = stackIn_22_2;
                        stackOut_22_3 = var5;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        stackIn_23_2 = stackOut_22_2;
                        stackIn_23_3 = stackOut_22_3;
                        break L14;
                      } else {
                        stackOut_21_0 = (hr) (Object) stackIn_21_0;
                        stackOut_21_1 = stackIn_21_1;
                        stackOut_21_2 = stackIn_21_2;
                        stackOut_21_3 = 5120;
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_23_1 = stackOut_21_1;
                        stackIn_23_2 = stackOut_21_2;
                        stackIn_23_3 = stackOut_21_3;
                        break L14;
                      }
                    }
                    ((hr) (Object) stackIn_23_0).a(stackIn_23_1, stackIn_23_2, (int)((double)stackIn_23_3 / 14.0 * 3072.0), (int)(((ah) this).field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                    break L6;
                  }
                }
                if (!((ah) this).g(param1 + -19310)) {
                  break L5;
                } else {
                  if (ul.field_f != 0) {
                    break L5;
                  } else {
                    kw.field_a.a((float)(((ah) this).field_C >> 1524158824), (float)(((ah) this).field_z >> 447990856), (int)((double)var5 / 28.0 * 3072.0), (int)(((ah) this).field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                    break L5;
                  }
                }
              }
            }
            L15: {
              var8 = ((ah) this).field_E;
              var9 = ((ah) this).field_A;
              var10 = var5 >> -645284735;
              var11 = (int)Math.round(Math.sqrt((double)((float)((ah) this).field_A * (float)((ah) this).field_A + (float)((ah) this).field_E * (float)((ah) this).field_E)));
              if (-1025 > (var11 ^ -1)) {
                var8 = (((ah) this).field_E << -793618390) / var11;
                var9 = (((ah) this).field_A << 1551164650) / var11;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (((ah) this).h(-1)) {
                if (var10 == 0) {
                  break L16;
                } else {
                  var12 = var8 + ((ah) this).field_C >> 621001096;
                  var13 = ((ah) this).field_z - -var9 >> 996718088;
                  param0.a(-var10 + var12, var13, var12 - -var10, var13, var6 - -tt.a((byte) -128, ((ah) this).field_Q), 1);
                  break L16;
                }
              } else {
                if ((((ah) this).field_b ^ -1) < -1) {
                  break L16;
                } else {
                  if (((ah) this).field_Q != 0) {
                    if (1 == ((ah) this).field_Q) {
                      L17: {
                        stackOut_89_0 = dc.field_ab[1];
                        stackOut_89_1 = (float)(var8 + ((ah) this).field_C >> 1219203656);
                        stackOut_89_2 = (float)(var9 + ((ah) this).field_z >> -1754280056);
                        stackIn_91_0 = stackOut_89_0;
                        stackIn_91_1 = stackOut_89_1;
                        stackIn_91_2 = stackOut_89_2;
                        stackIn_90_0 = stackOut_89_0;
                        stackIn_90_1 = stackOut_89_1;
                        stackIn_90_2 = stackOut_89_2;
                        if (((ah) this).g(111)) {
                          stackOut_91_0 = (hr) (Object) stackIn_91_0;
                          stackOut_91_1 = stackIn_91_1;
                          stackOut_91_2 = stackIn_91_2;
                          stackOut_91_3 = 10;
                          stackIn_92_0 = stackOut_91_0;
                          stackIn_92_1 = stackOut_91_1;
                          stackIn_92_2 = stackOut_91_2;
                          stackIn_92_3 = stackOut_91_3;
                          break L17;
                        } else {
                          stackOut_90_0 = (hr) (Object) stackIn_90_0;
                          stackOut_90_1 = stackIn_90_1;
                          stackOut_90_2 = stackIn_90_2;
                          stackOut_90_3 = var10;
                          stackIn_92_0 = stackOut_90_0;
                          stackIn_92_1 = stackOut_90_1;
                          stackIn_92_2 = stackOut_90_2;
                          stackIn_92_3 = stackOut_90_3;
                          break L17;
                        }
                      }
                      ((hr) (Object) stackIn_92_0).a(stackIn_92_1, stackIn_92_2, (int)((double)stackIn_92_3 / 14.0 * 4096.0), (int)(((ah) this).field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                      break L16;
                    } else {
                      if (2 == ((ah) this).field_Q) {
                        L18: {
                          stackOut_85_0 = hv.field_d[1];
                          stackOut_85_1 = (float)(var8 + ((ah) this).field_C >> 180346696);
                          stackOut_85_2 = (float)(((ah) this).field_z - -var9 >> -1596059704);
                          stackOut_85_3 = 4096.0;
                          stackIn_87_0 = stackOut_85_0;
                          stackIn_87_1 = stackOut_85_1;
                          stackIn_87_2 = stackOut_85_2;
                          stackIn_87_3 = stackOut_85_3;
                          stackIn_86_0 = stackOut_85_0;
                          stackIn_86_1 = stackOut_85_1;
                          stackIn_86_2 = stackOut_85_2;
                          stackIn_86_3 = stackOut_85_3;
                          if (((ah) this).g(18)) {
                            stackOut_87_0 = (hr) (Object) stackIn_87_0;
                            stackOut_87_1 = stackIn_87_1;
                            stackOut_87_2 = stackIn_87_2;
                            stackOut_87_3 = stackIn_87_3;
                            stackOut_87_4 = 10;
                            stackIn_88_0 = stackOut_87_0;
                            stackIn_88_1 = stackOut_87_1;
                            stackIn_88_2 = stackOut_87_2;
                            stackIn_88_3 = stackOut_87_3;
                            stackIn_88_4 = stackOut_87_4;
                            break L18;
                          } else {
                            stackOut_86_0 = (hr) (Object) stackIn_86_0;
                            stackOut_86_1 = stackIn_86_1;
                            stackOut_86_2 = stackIn_86_2;
                            stackOut_86_3 = stackIn_86_3;
                            stackOut_86_4 = var10;
                            stackIn_88_0 = stackOut_86_0;
                            stackIn_88_1 = stackOut_86_1;
                            stackIn_88_2 = stackOut_86_2;
                            stackIn_88_3 = stackOut_86_3;
                            stackIn_88_4 = stackOut_86_4;
                            break L18;
                          }
                        }
                        ((hr) (Object) stackIn_88_0).a(stackIn_88_1, stackIn_88_2, (int)(stackIn_88_3 * ((double)stackIn_88_4 / 14.0)), (int)(32768.0 * ((ah) this).field_s / 3.141592653589793), 1, 0, 2);
                        break L16;
                      } else {
                        if (((ah) this).field_Q != 3) {
                          if (((ah) this).field_Q != 4) {
                            if (((ah) this).field_Q != 5) {
                              param0.s(((ah) this).field_C + var8 >> 1884851976, ((ah) this).field_z + var9 >> 1807168008, var10, var6 - -tt.a((byte) -128, ((ah) this).field_Q), 1);
                              param0.s(var8 + ((ah) this).field_C >> -1268336504, var9 + ((ah) this).field_z >> -258612152, var10 >> -929794430, 2236962 + var6, 1);
                              break L16;
                            } else {
                              L19: {
                                stackOut_80_0 = mr.field_e[1];
                                stackOut_80_1 = (float)(((ah) this).field_C - -var8 >> -1899059640);
                                stackOut_80_2 = (float)(var9 + ((ah) this).field_z >> -1879144056);
                                stackOut_80_3 = 4096.0;
                                stackIn_82_0 = stackOut_80_0;
                                stackIn_82_1 = stackOut_80_1;
                                stackIn_82_2 = stackOut_80_2;
                                stackIn_82_3 = stackOut_80_3;
                                stackIn_81_0 = stackOut_80_0;
                                stackIn_81_1 = stackOut_80_1;
                                stackIn_81_2 = stackOut_80_2;
                                stackIn_81_3 = stackOut_80_3;
                                if (((ah) this).g(106)) {
                                  stackOut_82_0 = (hr) (Object) stackIn_82_0;
                                  stackOut_82_1 = stackIn_82_1;
                                  stackOut_82_2 = stackIn_82_2;
                                  stackOut_82_3 = stackIn_82_3;
                                  stackOut_82_4 = 10;
                                  stackIn_83_0 = stackOut_82_0;
                                  stackIn_83_1 = stackOut_82_1;
                                  stackIn_83_2 = stackOut_82_2;
                                  stackIn_83_3 = stackOut_82_3;
                                  stackIn_83_4 = stackOut_82_4;
                                  break L19;
                                } else {
                                  stackOut_81_0 = (hr) (Object) stackIn_81_0;
                                  stackOut_81_1 = stackIn_81_1;
                                  stackOut_81_2 = stackIn_81_2;
                                  stackOut_81_3 = stackIn_81_3;
                                  stackOut_81_4 = var10;
                                  stackIn_83_0 = stackOut_81_0;
                                  stackIn_83_1 = stackOut_81_1;
                                  stackIn_83_2 = stackOut_81_2;
                                  stackIn_83_3 = stackOut_81_3;
                                  stackIn_83_4 = stackOut_81_4;
                                  break L19;
                                }
                              }
                              ((hr) (Object) stackIn_83_0).a(stackIn_83_1, stackIn_83_2, (int)(stackIn_83_3 * ((double)stackIn_83_4 / 14.0)), (int)(((ah) this).field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                              break L16;
                            }
                          } else {
                            L20: {
                              stackOut_75_0 = ak.field_a[1];
                              stackOut_75_1 = (float)(var8 + ((ah) this).field_C >> 1446064968);
                              stackOut_75_2 = (float)(((ah) this).field_z - -var9 >> -1834120312);
                              stackOut_75_3 = 4096.0;
                              stackIn_77_0 = stackOut_75_0;
                              stackIn_77_1 = stackOut_75_1;
                              stackIn_77_2 = stackOut_75_2;
                              stackIn_77_3 = stackOut_75_3;
                              stackIn_76_0 = stackOut_75_0;
                              stackIn_76_1 = stackOut_75_1;
                              stackIn_76_2 = stackOut_75_2;
                              stackIn_76_3 = stackOut_75_3;
                              if (!((ah) this).g(100)) {
                                stackOut_77_0 = (hr) (Object) stackIn_77_0;
                                stackOut_77_1 = stackIn_77_1;
                                stackOut_77_2 = stackIn_77_2;
                                stackOut_77_3 = stackIn_77_3;
                                stackOut_77_4 = var10;
                                stackIn_78_0 = stackOut_77_0;
                                stackIn_78_1 = stackOut_77_1;
                                stackIn_78_2 = stackOut_77_2;
                                stackIn_78_3 = stackOut_77_3;
                                stackIn_78_4 = stackOut_77_4;
                                break L20;
                              } else {
                                stackOut_76_0 = (hr) (Object) stackIn_76_0;
                                stackOut_76_1 = stackIn_76_1;
                                stackOut_76_2 = stackIn_76_2;
                                stackOut_76_3 = stackIn_76_3;
                                stackOut_76_4 = 10;
                                stackIn_78_0 = stackOut_76_0;
                                stackIn_78_1 = stackOut_76_1;
                                stackIn_78_2 = stackOut_76_2;
                                stackIn_78_3 = stackOut_76_3;
                                stackIn_78_4 = stackOut_76_4;
                                break L20;
                              }
                            }
                            ((hr) (Object) stackIn_78_0).a(stackIn_78_1, stackIn_78_2, (int)(stackIn_78_3 * ((double)stackIn_78_4 / 14.0)), (int)(((ah) this).field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                            break L16;
                          }
                        } else {
                          L21: {
                            stackOut_70_0 = s.field_n[1];
                            stackOut_70_1 = (float)(((ah) this).field_C - -var8 >> 1905617448);
                            stackOut_70_2 = (float)(var9 + ((ah) this).field_z >> 1430280776);
                            stackOut_70_3 = 4096.0;
                            stackIn_72_0 = stackOut_70_0;
                            stackIn_72_1 = stackOut_70_1;
                            stackIn_72_2 = stackOut_70_2;
                            stackIn_72_3 = stackOut_70_3;
                            stackIn_71_0 = stackOut_70_0;
                            stackIn_71_1 = stackOut_70_1;
                            stackIn_71_2 = stackOut_70_2;
                            stackIn_71_3 = stackOut_70_3;
                            if (!((ah) this).g(param1 ^ 19425)) {
                              stackOut_72_0 = (hr) (Object) stackIn_72_0;
                              stackOut_72_1 = stackIn_72_1;
                              stackOut_72_2 = stackIn_72_2;
                              stackOut_72_3 = stackIn_72_3;
                              stackOut_72_4 = var10;
                              stackIn_73_0 = stackOut_72_0;
                              stackIn_73_1 = stackOut_72_1;
                              stackIn_73_2 = stackOut_72_2;
                              stackIn_73_3 = stackOut_72_3;
                              stackIn_73_4 = stackOut_72_4;
                              break L21;
                            } else {
                              stackOut_71_0 = (hr) (Object) stackIn_71_0;
                              stackOut_71_1 = stackIn_71_1;
                              stackOut_71_2 = stackIn_71_2;
                              stackOut_71_3 = stackIn_71_3;
                              stackOut_71_4 = 10;
                              stackIn_73_0 = stackOut_71_0;
                              stackIn_73_1 = stackOut_71_1;
                              stackIn_73_2 = stackOut_71_2;
                              stackIn_73_3 = stackOut_71_3;
                              stackIn_73_4 = stackOut_71_4;
                              break L21;
                            }
                          }
                          ((hr) (Object) stackIn_73_0).a(stackIn_73_1, stackIn_73_2, (int)(stackIn_73_3 * ((double)stackIn_73_4 / 14.0)), (int)(((ah) this).field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                          break L16;
                        }
                      }
                    }
                  } else {
                    L22: {
                      stackOut_63_0 = ht.field_e[1];
                      stackOut_63_1 = (float)(var8 + ((ah) this).field_C >> 1355160584);
                      stackOut_63_2 = (float)(((ah) this).field_z + var9 >> 979460584);
                      stackOut_63_3 = 4096.0;
                      stackIn_65_0 = stackOut_63_0;
                      stackIn_65_1 = stackOut_63_1;
                      stackIn_65_2 = stackOut_63_2;
                      stackIn_65_3 = stackOut_63_3;
                      stackIn_64_0 = stackOut_63_0;
                      stackIn_64_1 = stackOut_63_1;
                      stackIn_64_2 = stackOut_63_2;
                      stackIn_64_3 = stackOut_63_3;
                      if (((ah) this).g(78)) {
                        stackOut_65_0 = (hr) (Object) stackIn_65_0;
                        stackOut_65_1 = stackIn_65_1;
                        stackOut_65_2 = stackIn_65_2;
                        stackOut_65_3 = stackIn_65_3;
                        stackOut_65_4 = 10;
                        stackIn_66_0 = stackOut_65_0;
                        stackIn_66_1 = stackOut_65_1;
                        stackIn_66_2 = stackOut_65_2;
                        stackIn_66_3 = stackOut_65_3;
                        stackIn_66_4 = stackOut_65_4;
                        break L22;
                      } else {
                        stackOut_64_0 = (hr) (Object) stackIn_64_0;
                        stackOut_64_1 = stackIn_64_1;
                        stackOut_64_2 = stackIn_64_2;
                        stackOut_64_3 = stackIn_64_3;
                        stackOut_64_4 = var10;
                        stackIn_66_0 = stackOut_64_0;
                        stackIn_66_1 = stackOut_64_1;
                        stackIn_66_2 = stackOut_64_2;
                        stackIn_66_3 = stackOut_64_3;
                        stackIn_66_4 = stackOut_64_4;
                        break L22;
                      }
                    }
                    ((hr) (Object) stackIn_66_0).a(stackIn_66_1, stackIn_66_2, (int)(stackIn_66_3 * ((double)stackIn_66_4 / 14.0)), (int)(((ah) this).field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                    break L16;
                  }
                }
              }
            }
            L23: {
              L24: {
                if ((((ah) this).field_N ^ -1) != -2) {
                  break L24;
                } else {
                  if (((ah) this).field_b != 0) {
                    break L24;
                  } else {
                    L25: {
                      L26: {
                        if (((ah) this).field_v != -1) {
                          break L26;
                        } else {
                          if (-1 < ((ah) this).field_p) {
                            hh.field_e[0].a((float)(((ah) this).field_C >> 1833344808), (float)(((ah) this).field_z >> 415120072), (int)(3072.0 * ((double)var5 / 14.0)), (int)((3.141592653589793 + ((ah) this).field_s) * 32768.0 / 3.141592653589793));
                            break L25;
                          } else {
                            break L26;
                          }
                        }
                      }
                      hh.field_e[1].a((float)(((ah) this).field_C >> -580674136), (float)(((ah) this).field_z >> -1077581336), (int)(3072.0 * ((double)var5 / 14.0)), (int)(32768.0 * (3.141592653589793 + ((ah) this).field_s) / 3.141592653589793));
                      break L25;
                    }
                    if (-1 == (((ah) this).field_Q ^ -1)) {
                      hh.field_e[0].a((float)(((ah) this).field_C >> -1336942680), (float)(((ah) this).field_z >> 1731950216), (int)((double)var5 / 14.0 * 3072.0), (int)(32768.0 * (3.141592653589793 + ((ah) this).field_s) / 3.141592653589793) - -32768);
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                }
              }
              L27: {
                if (-3 != (((ah) this).field_N ^ -1)) {
                  break L27;
                } else {
                  if (0 != ((ah) this).field_b) {
                    break L27;
                  } else {
                    if (0 == ((ah) this).field_v) {
                      up.field_e[0].a((float)(((ah) this).field_C >> 316886824), (float)(((ah) this).field_z >> 1644330440), (int)(3072.0 * ((double)var5 / 14.0)), (int)(((ah) this).field_s * 32768.0 / 3.141592653589793));
                      break L23;
                    } else {
                      up.field_e[1].a((float)(((ah) this).field_C >> -920798104), (float)(((ah) this).field_z >> 1135821672), (int)((double)var5 / 14.0 * 3072.0), (int)(((ah) this).field_s * 32768.0 / 3.141592653589793));
                      break L23;
                    }
                  }
                }
              }
              if (-4 != (((ah) this).field_N ^ -1)) {
                break L23;
              } else {
                if (0 == ((ah) this).field_b) {
                  if (((ah) this).field_v != 0) {
                    ct.field_A[1].a((float)(((ah) this).field_C >> -1957022488), (float)(((ah) this).field_z >> 920100040), (int)(3072.0 * ((double)var5 / 14.0)), (int)(32768.0 * ((ah) this).field_s / 3.141592653589793));
                    break L23;
                  } else {
                    ct.field_A[0].a((float)(((ah) this).field_C >> 1261228232), (float)(((ah) this).field_z >> 1257065736), (int)((double)var5 / 14.0 * 3072.0), (int)(32768.0 * ((ah) this).field_s / 3.141592653589793));
                    break L23;
                  }
                } else {
                  break L23;
                }
              }
            }
            L28: {
              if (((ah) this).g(101)) {
                break L28;
              } else {
                break L28;
              }
            }
            L29: {
              if (2 == ((ah) this).field_M) {
                L30: {
                  stackOut_119_0 = jn.field_d;
                  stackOut_119_1 = (float)(((ah) this).field_C >> 1372483016);
                  stackOut_119_2 = (float)(((ah) this).field_z >> 1628929448);
                  stackOut_119_3 = 4096.0;
                  stackIn_121_0 = stackOut_119_0;
                  stackIn_121_1 = stackOut_119_1;
                  stackIn_121_2 = stackOut_119_2;
                  stackIn_121_3 = stackOut_119_3;
                  stackIn_120_0 = stackOut_119_0;
                  stackIn_120_1 = stackOut_119_1;
                  stackIn_120_2 = stackOut_119_2;
                  stackIn_120_3 = stackOut_119_3;
                  if (((ah) this).g(71)) {
                    stackOut_121_0 = (hr) (Object) stackIn_121_0;
                    stackOut_121_1 = stackIn_121_1;
                    stackOut_121_2 = stackIn_121_2;
                    stackOut_121_3 = stackIn_121_3;
                    stackOut_121_4 = 20;
                    stackIn_122_0 = stackOut_121_0;
                    stackIn_122_1 = stackOut_121_1;
                    stackIn_122_2 = stackOut_121_2;
                    stackIn_122_3 = stackOut_121_3;
                    stackIn_122_4 = stackOut_121_4;
                    break L30;
                  } else {
                    stackOut_120_0 = (hr) (Object) stackIn_120_0;
                    stackOut_120_1 = stackIn_120_1;
                    stackOut_120_2 = stackIn_120_2;
                    stackOut_120_3 = stackIn_120_3;
                    stackOut_120_4 = var10;
                    stackIn_122_0 = stackOut_120_0;
                    stackIn_122_1 = stackOut_120_1;
                    stackIn_122_2 = stackOut_120_2;
                    stackIn_122_3 = stackOut_120_3;
                    stackIn_122_4 = stackOut_120_4;
                    break L30;
                  }
                }
                ((hr) (Object) stackIn_122_0).a(stackIn_122_1, stackIn_122_2, (int)(stackIn_122_3 * ((double)stackIn_122_4 / 7.0)), (int)(((ah) this).field_s * 32768.0 / 3.141592653589793), 1, 0, 2);
                break L29;
              } else {
                break L29;
              }
            }
            return;
          } else {
            var7.a(param0, -127);
            var7 = (nt) (Object) ((ah) this).field_q.d((byte) 18);
            continue L3;
          }
        }
    }

    final void k(byte param0) {
        if (!((ah) this).g(22)) {
          if (!((ah) this).j(20)) {
            return;
          } else {
            L0: {
              gn.a(28, true);
              ((ah) this).field_n = true;
              ((ah) this).field_H = ((ah) this).field_k;
              if (param0 < -5) {
                break L0;
              } else {
                ((ah) this).field_G = 4;
                break L0;
              }
            }
            ((ah) this).field_c = 12;
            ((ah) this).field_q = new jn();
            ts.a(((ah) this).field_C, ((ah) this).field_q, -16240, 50, lr.field_a[((ah) this).field_Q], ((ah) this).field_z);
            ((ah) this).m(-82);
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
          ((ah) this).field_i = 1024 - -(((ah) this).field_I * 50) - 50;
          ((ah) this).field_h = 0 - -(3 * (((ah) this).field_y + -1));
          if ((((ah) this).field_m ^ -1) < -2561) {
            ((ah) this).field_m = 2560;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          ((ah) this).field_N = 0;
          ((ah) this).field_L = 0.1 * (double)(-1 + ((ah) this).field_t) + 1.0;
          if (-1 == ((ah) this).field_M) {
            break L2;
          } else {
            if (0 != ((ah) this).field_M) {
              if (-2 == (((ah) this).field_M ^ -1)) {
                ((ah) this).field_m = ((ah) this).field_m << 1;
                ((ah) this).field_h = ((ah) this).field_h << 1;
                break L2;
              } else {
                if (2 != ((ah) this).field_M) {
                  if (3 == ((ah) this).field_M) {
                    ((ah) this).field_N = 2;
                    break L2;
                  } else {
                    if (-5 != (((ah) this).field_M ^ -1)) {
                      break L2;
                    } else {
                      ((ah) this).field_p = 1;
                      ((ah) this).field_N = 1;
                      break L2;
                    }
                  }
                } else {
                  ((ah) this).field_L = ((ah) this).field_L * 2.0;
                  break L2;
                }
              }
            } else {
              ((ah) this).field_i = ((ah) this).field_i << 1;
              break L2;
            }
          }
        }
    }

    ah(int param0, int param1, int param2, int param3) {
        ((ah) this).field_b = 0;
        ((ah) this).field_i = 80;
        ((ah) this).field_j = -1;
        ((ah) this).field_P = -1;
        ((ah) this).field_R = false;
        ((ah) this).field_t = 1;
        ((ah) this).field_u = -1;
        ((ah) this).field_B = -1;
        ((ah) this).field_G = 1500;
        ((ah) this).field_y = 1;
        ((ah) this).field_K = -1;
        ((ah) this).field_n = false;
        ((ah) this).field_I = 1;
        ((ah) this).field_r = -50;
        ((ah) this).field_e = -1;
        ((ah) this).field_d = 0;
        ((ah) this).field_w = 0;
        ((ah) this).field_z = param3;
        ((ah) this).field_L = 1.0;
        ((ah) this).field_M = -1;
        ((ah) this).field_C = param2;
        ((ah) this).field_N = param1;
        ((ah) this).field_Q = param0;
        this.l(125);
        ((ah) this).field_q = new jn();
    }

    static {
    }
}
