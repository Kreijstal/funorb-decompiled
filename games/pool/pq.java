/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pq {
    private int field_A;
    private int field_u;
    static int field_H;
    int field_j;
    static int[] field_F;
    static int field_m;
    static pq[][] field_B;
    int field_g;
    static String field_D;
    static or field_i;
    private hm field_E;
    static jg field_L;
    int field_k;
    int field_I;
    static String[] field_C;
    int field_w;
    int field_t;
    static hj field_J;
    int field_e;
    hm field_x;
    boolean field_p;
    int field_K;
    private int field_y;
    int field_c;
    int[] field_G;
    int field_h;
    int field_l;
    private int field_d;
    int field_n;
    int field_v;
    int field_b;
    private int field_a;
    or field_q;
    static String field_r;
    boolean field_o;
    boolean field_s;
    static di field_z;
    static volatile int field_f;

    final void d(byte param0) {
        this.c((byte) 119);
        int var2 = -74 / ((param0 - 33) / 40);
        this.h(50);
        this.field_v = 0;
        if (this.field_q != null) {
            if (-1 == (this.field_q.field_n ^ -1)) {
                this.field_q.a(false, (pq) (this));
            }
        }
    }

    final void f(int param0) {
        int var2 = 0;
        L0: {
          L1: {
            this.field_l = this.field_I + this.field_b * -8;
            this.field_h = this.field_t - -(-this.field_n * -8);
            if (0 != this.field_l) {
              break L1;
            } else {
              if (this.field_h != 0) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          var2 = rf.a(aj.a(this.field_l, false, this.field_l) + aj.a(this.field_h, false, this.field_h), -123);
          if (var2 == 0) {
            break L0;
          } else {
            this.field_l = lh.a(var2, (byte) -100, (long)this.field_l);
            this.field_h = lh.a(var2, (byte) -75, (long)this.field_h);
            break L0;
          }
        }
        var2 = 83 / ((param0 - 41) / 46);
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        L0: {
          L1: {
            if (this.field_I != 0) {
              break L1;
            } else {
              if (-1 != (this.field_t ^ -1)) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          this.field_g = this.field_g + aj.a(-this.field_w + param0, false, this.field_I);
          this.field_k = this.field_k + aj.a(param0 - this.field_w, false, this.field_t);
          this.field_p = true;
          break L0;
        }
        var3 = 34 / ((58 - param1) / 45);
        this.field_w = param0;
    }

    final void i(int param0) {
        this.field_G[param0] = this.field_j >> -1306592595;
        this.field_G[1] = this.field_k >> -1401665363;
        this.field_G[0] = this.field_g >> 1973825677;
        this.field_x.a(this.field_G, param0 + -97);
        this.field_p = false;
    }

    final void a(int param0, ge param1) {
        RuntimeException var3 = null;
        ge stackIn_1_0 = null;
        ge stackIn_2_0 = null;
        ge stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        ge stackOut_0_0 = null;
        ge stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        ge stackOut_1_0 = null;
        int stackOut_1_1 = 0;
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
            L1: {
              stackOut_0_0 = (ge) (param1);
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (!this.field_s) {
                stackOut_2_0 = (ge) ((Object) stackIn_2_0);
                stackOut_2_1 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = (ge) ((Object) stackIn_1_0);
                stackOut_1_1 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            L2: {
              ((ge) (Object) stackIn_3_0).a(stackIn_3_1, false);
              if (!this.field_s) {
                break L2;
              } else {
                if (this.field_v == 0) {
                  this.field_x.a(param1, (byte) 123);
                  param1.a(true, this.field_g);
                  param1.a(true, this.field_k);
                  break L2;
                } else {
                  throw new IllegalStateException("Writing state before ball is stopped.");
                }
              }
            }
            L3: {
              if (param0 == 0) {
                break L3;
              } else {
                this.field_h = 54;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("pq.F(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    private final void h(int param0) {
        this.field_t = 0;
        this.field_u = 0;
        this.field_l = 0;
        this.field_h = 0;
        this.field_A = 0;
        this.field_I = 0;
        if (param0 != 50) {
            this.field_c = 20;
        }
        this.field_e = 0;
    }

    final void a(byte param0) {
        this.field_b = this.field_I / 8;
        int var2 = 14 % ((param0 - 31) / 40);
        this.field_K = 0;
        this.field_n = -this.field_t / 8;
    }

    final String b(int param0) {
        int var2 = 0;
        L0: {
          if (param0 == -12050) {
            break L0;
          } else {
            this.field_I = -58;
            break L0;
          }
        }
        var2 = this.field_v;
        if (-1 != (var2 ^ -1)) {
          if (-2 != (var2 ^ -1)) {
            if (-3 != (var2 ^ -1)) {
              return "invalid";
            } else {
              return "Rolling";
            }
          } else {
            return "Sliding";
          }
        } else {
          return "Stopped";
        }
    }

    public static void b(byte param0) {
        field_z = null;
        field_i = null;
        field_F = null;
        field_C = null;
        field_B = (pq[][]) null;
        field_L = null;
        field_D = null;
        if (param0 != -66) {
          return;
        } else {
          field_J = null;
          field_r = null;
          return;
        }
    }

    final void a(ge param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
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
            L1: {
              stackOut_0_0 = this;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if ((param0.g(-80) ^ -1) != -2) {
                stackOut_2_0 = this;
                stackOut_2_1 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = this;
                stackOut_1_1 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            ((pq) (this)).field_s = stackIn_3_1 != 0;
            if (param1 == -1285) {
              L2: {
                if (this.field_s) {
                  this.field_x.a(false, param0);
                  this.field_g = param0.b(true);
                  this.field_k = param0.b(true);
                  this.field_o = false;
                  this.field_e = 0;
                  this.field_j = -524288;
                  this.field_p = true;
                  this.d((byte) 78);
                  break L2;
                } else {
                  this.d((byte) 78);
                  break L2;
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
          L3: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("pq.C(");
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
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(pq param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              this.field_j = param0.field_j;
              this.field_e = param0.field_e;
              this.field_A = param0.field_A;
              this.field_t = param0.field_t;
              this.field_k = param0.field_k;
              this.field_w = param0.field_w;
              this.field_I = param0.field_I;
              this.field_g = param0.field_g;
              this.field_u = param0.field_u;
              this.field_E.b(0, param0.field_E);
              this.field_x.b(0, param0.field_x);
              this.field_K = param0.field_K;
              this.field_a = param0.field_a;
              this.field_n = param0.field_n;
              this.field_q = null;
              this.field_b = param0.field_b;
              this.field_h = param0.field_h;
              this.field_l = param0.field_l;
              if (param1 == -12) {
                break L1;
              } else {
                field_z = (di) null;
                break L1;
              }
            }
            this.field_d = param0.field_d;
            this.field_s = param0.field_s;
            this.field_c = param0.field_c;
            this.field_y = param0.field_y;
            this.field_v = param0.field_v;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("pq.H(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
    }

    final static void a(float param0, float param1, float param2, float param3, float param4, float param5, int param6) {
        L0: {
          L1: {
            if (null == ta.field_h) {
              break L1;
            } else {
              if (null == wm.field_Xb) {
                break L1;
              } else {
                if (null == mp.field_R) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
          }
          wm.field_Xb = new ai();
          ta.field_h = new gl(wm.field_Xb);
          qf.field_d.b(ta.field_h);
          mp.field_R = new ko();
          break L0;
        }
        L2: {
          ta.field_h.a(param1);
          ta.field_h.f(param4);
          ta.field_h.b(param5);
          ta.field_h.e(param0);
          if (param6 == -1) {
            break L2;
          } else {
            field_J = (hj) null;
            break L2;
          }
        }
        ta.field_h.d(param2);
        ta.field_h.c(param3);
    }

    final void b(boolean param0) {
        int var2 = 0;
        L0: {
          L1: {
            if (this.field_n != 0) {
              break L1;
            } else {
              if (0 != this.field_b) {
                break L1;
              } else {
                if (-1 == (this.field_K ^ -1)) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          var2 = rf.a(aj.a(this.field_n, false, this.field_n) - -aj.a(this.field_b, false, this.field_b) - -aj.a(this.field_K, false, this.field_K), -121);
          if (0 < var2) {
            this.field_E.a(111, -lh.a(var2, (byte) -92, (long)this.field_n), -lh.a(var2, (byte) -84, (long)this.field_b), lh.a(var2, (byte) -101, (long)this.field_K), (int)((double)(var2 * 1024) / 205887.41614566068));
            this.field_x.a(3, this.field_E);
            this.field_x.b(true);
            this.field_p = true;
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          this.a(65536, -116);
          this.field_k = this.field_k + this.field_t;
          this.field_j = this.field_j + this.field_e;
          this.field_g = this.field_g + this.field_I;
          if (param0) {
            break L2;
          } else {
            this.field_l = 81;
            break L2;
          }
        }
    }

    final long e(int param0) {
        if (param0 != -14770) {
          return -91L;
        } else {
          return od.a((long)this.field_I, (long)this.field_I, false) - -od.a((long)this.field_t, (long)this.field_t, false);
        }
    }

    final void a(boolean param0) {
        int var2_int = 0;
        long var2 = 0L;
        int var3 = 0;
        int var4_int = 0;
        long var4 = 0L;
        long var6 = 0L;
        long var8_long = 0L;
        int var8 = 0;
        int var9 = 0;
        long var10_long = 0L;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          L1: {
            this.a(65536, -114);
            if (0 != this.field_n) {
              break L1;
            } else {
              if (this.field_b != 0) {
                break L1;
              } else {
                if (-1 != (this.field_K ^ -1)) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
          }
          var2_int = rf.a(aj.a(this.field_n, false, this.field_n) + (aj.a(this.field_b, false, this.field_b) + aj.a(this.field_K, false, this.field_K)), -126);
          if ((var2_int ^ -1) < -1) {
            this.field_E.a(77, -lh.a(var2_int, (byte) -82, (long)this.field_n), -lh.a(var2_int, (byte) -63, (long)this.field_b), lh.a(var2_int, (byte) -117, (long)this.field_K), 1024 * var2_int / 205887);
            this.field_x.a(3, this.field_E);
            this.field_x.b(true);
            this.field_p = true;
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          var2_int = this.field_v;
          if (var2_int != 0) {
            if (2 == var2_int) {
              L3: {
                this.field_l = this.field_b * -8;
                this.field_h = -this.field_n * -8;
                if (this.field_l != 0) {
                  break L3;
                } else {
                  if (-1 != (this.field_h ^ -1)) {
                    break L3;
                  } else {
                    L4: {
                      if (aj.a(this.field_I, param0, this.field_I) + aj.a(this.field_t, false, this.field_t) >= aj.a(3276, false, 3276)) {
                        break L4;
                      } else {
                        if (aj.a(this.field_n, param0, this.field_n) + (aj.a(this.field_b, param0, this.field_b) - -aj.a(this.field_K, false, this.field_K)) >= aj.a(3276, false, 3276)) {
                          break L4;
                        } else {
                          this.d((byte) 112);
                          break L4;
                        }
                      }
                    }
                    return;
                  }
                }
              }
              var2_int = rf.a(aj.a(this.field_l, false, this.field_l) + aj.a(this.field_h, false, this.field_h), -125);
              if (0 != var2_int) {
                this.field_l = lh.a(var2_int, (byte) -100, (long)this.field_l);
                this.field_h = lh.a(var2_int, (byte) -107, (long)this.field_h);
                this.field_a = -lh.a(uh.field_w, (byte) -117, (long)(vn.a(this.field_h * 8, 0, uh.field_q, l.field_g) / 50));
                this.field_y = lh.a(uh.field_w, (byte) -118, (long)(vn.a(this.field_l * 8, 0, uh.field_q, l.field_g) / 50));
                this.field_d = aj.a(wn.field_l, false, this.field_K) + -this.field_K;
                this.field_K = this.field_K + this.field_d;
                this.field_b = this.field_b + this.field_y;
                this.field_n = this.field_n + this.field_a;
                this.field_u = 0;
                this.field_A = 0;
                this.field_I = 8 * this.field_b;
                this.field_t = -this.field_n * 8;
                var3 = -8 * this.field_b;
                var4_int = -8 * -this.field_n;
                if (0 > aj.a(var3, false, this.field_l) - -aj.a(var4_int, param0, this.field_h)) {
                  this.d((byte) 126);
                  break L2;
                } else {
                  L5: {
                    if (aj.a(this.field_I, param0, this.field_I) + aj.a(this.field_t, false, this.field_t) >= aj.a(3276, false, 3276)) {
                      break L5;
                    } else {
                      if (aj.a(this.field_n, param0, this.field_n) + (aj.a(this.field_b, param0, this.field_b) - -aj.a(this.field_K, false, this.field_K)) >= aj.a(3276, false, 3276)) {
                        break L5;
                      } else {
                        this.d((byte) 112);
                        break L5;
                      }
                    }
                  }
                  return;
                }
              } else {
                break L2;
              }
            } else {
              if (var2_int == 1) {
                L6: {
                  this.field_h = -8 * -this.field_n + this.field_t;
                  this.field_l = this.field_I - -(-8 * this.field_b);
                  if (this.field_l != 0) {
                    break L6;
                  } else {
                    if (this.field_h != 0) {
                      break L6;
                    } else {
                      break L2;
                    }
                  }
                }
                var2 = bm.a(-104, od.a((long)this.field_l, (long)this.field_l, false) + od.a((long)this.field_h, (long)this.field_h, false));
                if (-1L != (var2 ^ -1L)) {
                  L7: {
                    if (-2147483648L > var2) {
                      break L7;
                    } else {
                      if (-2147483648L <= (var2 ^ -1L)) {
                        L8: {
                          this.field_l = lh.a((int)var2, (byte) -128, (long)this.field_l);
                          this.field_h = lh.a((int)var2, (byte) -104, (long)this.field_h);
                          this.field_A = -aj.a(dr.field_f, false, this.field_l) / 50;
                          this.field_u = -aj.a(dr.field_f, false, this.field_h) / 50;
                          var4 = od.a((long)this.field_A, (long)this.field_A, false) + od.a((long)this.field_u, (long)this.field_u, false);
                          var6 = this.e(-14770);
                          if (var6 < var4) {
                            var8_long = bm.a(-104, var4);
                            var10_long = bm.a(-99, var6);
                            this.field_A = (int)((long)this.field_A * var10_long / var8_long);
                            this.field_u = (int)(var10_long * (long)this.field_u / var8_long);
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          L10: {
                            this.field_I = this.field_I + this.field_A;
                            this.field_t = this.field_t + this.field_u;
                            this.field_a = -lh.a(uh.field_w, (byte) -87, (long)(vn.a(this.field_h * 8, 0, uh.field_q, dr.field_f) / 50));
                            this.field_y = lh.a(uh.field_w, (byte) -122, (long)(vn.a(8 * this.field_l, 0, uh.field_q, dr.field_f) / 50));
                            this.field_d = aj.a(wn.field_l, false, this.field_K) - this.field_K;
                            this.field_I = this.field_I + vn.a(this.field_K, 0, -this.field_t, pr.field_l);
                            this.field_t = this.field_t + vn.a(this.field_K, 0, this.field_I, pr.field_l);
                            this.field_b = this.field_b + this.field_y;
                            this.field_K = this.field_K + this.field_d;
                            this.field_n = this.field_n + this.field_a;
                            this.field_K = aj.a(wn.field_l, false, this.field_K);
                            var8 = this.field_I + -8 * this.field_b;
                            var9 = this.field_t + -this.field_n * -8;
                            var10 = this.field_l + -var8;
                            var11 = -var9 + this.field_h;
                            var12 = aj.a(this.field_l, param0, var10) + aj.a(this.field_h, false, var11);
                            var13 = aj.a(var8, param0, var10) + aj.a(var9, param0, var11);
                            if (var12 >= 0) {
                              break L10;
                            } else {
                              if (var13 > 0) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          if ((var12 ^ -1) >= -1) {
                            break L2;
                          } else {
                            if (var13 >= 0) {
                              break L2;
                            } else {
                              break L9;
                            }
                          }
                        }
                        this.a((byte) 123);
                        this.field_v = 2;
                        break L2;
                      } else {
                        break L7;
                      }
                    }
                  }
                  throw new IllegalStateException("Overflow. Norm of " + pf.b(127, this.field_l) + ", " + pf.b(126, this.field_h) + " := " + cr.a((byte) 89, var2));
                } else {
                  this.field_v = 2;
                  this.a((byte) -28);
                  break L2;
                }
              } else {
                break L2;
              }
            }
          } else {
            break L2;
          }
        }
        L11: {
          if (aj.a(this.field_I, param0, this.field_I) + aj.a(this.field_t, false, this.field_t) >= aj.a(3276, false, 3276)) {
            break L11;
          } else {
            if (aj.a(this.field_n, param0, this.field_n) + (aj.a(this.field_b, param0, this.field_b) - -aj.a(this.field_K, false, this.field_K)) >= aj.a(3276, false, 3276)) {
              break L11;
            } else {
              this.d((byte) 112);
              break L11;
            }
          }
        }
    }

    final void a(int param0) {
        if (param0 <= 98) {
        }
        this.field_G = new int[12];
    }

    final long g(int param0) {
        if (param0 != -8) {
            return -16L;
        }
        return bm.a(param0 ^ 98, this.e(-14770));
    }

    final void c(int param0) {
        if (param0 != 0) {
            this.a(-20, -78);
        }
        if (this.field_s) {
            System.out.print("{");
            System.out.print(lo.a((long)this.field_g, 7697781));
            System.out.print(",");
            System.out.print(lo.a((long)this.field_k, 7697781));
            System.out.print(" ");
            this.field_x.b(param0 ^ -79);
            System.out.print("}");
        } else {
            System.out.print("out of play");
        }
    }

    final int d(int param0) {
        if (param0 != 1) {
            pq.b((byte) -120);
        }
        if (this.field_s) {
            return 21;
        }
        return 1;
    }

    private final void c(byte param0) {
        this.field_d = 0;
        this.field_a = 0;
        this.field_n = 0;
        this.field_y = 0;
        int var2 = 107 % ((54 - param0) / 48);
        this.field_K = 0;
        this.field_b = 0;
    }

    pq() {
        this.field_j = -8;
        this.field_w = 0;
        this.field_E = new hm();
        this.field_x = new hm();
        this.field_c = 0;
        this.field_p = true;
        this.field_q = null;
        this.field_o = false;
        this.field_s = true;
        this.field_x = new hm();
        this.field_E = new hm();
        this.field_v = 0;
    }

    static {
        field_F = new int[5];
        field_i = null;
        field_C = new String[]{"Great shot!", "Silky skills!", "Awesome!", "What a star!"};
        field_D = "You and <%0> are offering a rematch.";
        field_J = new hj(12, 0, 1, 0);
        field_r = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
        field_f = 0;
    }
}
