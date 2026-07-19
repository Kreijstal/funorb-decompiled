/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ro {
    private int field_t;
    int[] field_q;
    int[] field_j;
    private int field_b;
    private int field_n;
    int field_k;
    private int field_a;
    static String field_p;
    static boolean field_e;
    static String field_s;
    int field_m;
    private int field_u;
    static int[] field_d;
    private int field_l;
    int field_f;
    private int field_o;
    int[] field_h;
    byte field_r;
    int field_i;
    static String field_g;
    static int[][][] field_v;
    private int[] field_c;

    final static nj[] a(int param0, oq param1) {
        int discarded$12 = 0;
        int discarded$13 = 0;
        int discarded$14 = 0;
        int discarded$15 = 0;
        int discarded$16 = 0;
        int discarded$17 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        nj[] var4 = null;
        int var5 = 0;
        nj var6_ref_nj = null;
        int var6 = 0;
        Object stackIn_4_0 = null;
        nj[] stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        nj[] stackOut_11_0 = null;
        Object stackOut_3_0 = null;
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
              var2_int = param1.e(8, 92);
              if (param0 == 24) {
                break L1;
              } else {
                field_s = (String) null;
                break L1;
              }
            }
            if ((var2_int ^ -1) >= -1) {
              var3 = param1.e(12, 82);
              var4 = new nj[var3];
              var5 = 0;
              L2: while (true) {
                if (var3 <= var5) {
                  stackOut_11_0 = (nj[]) (var4);
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    if (!gk.a((byte) 118, param1)) {
                      var6 = param1.e(fr.a(16, -1 + var5), 105);
                      var4[var5] = var4[var6];
                      break L3;
                    } else {
                      var6_ref_nj = new nj();
                      discarded$12 = param1.e(24, 22);
                      discarded$13 = param1.e(24, param0 + 38);
                      var6_ref_nj.field_a = param1.e(24, 28);
                      discarded$14 = param1.e(9, 44);
                      discarded$15 = param1.e(12, 104);
                      discarded$16 = param1.e(12, 125);
                      discarded$17 = param1.e(12, 99);
                      var4[var5] = var6_ref_nj;
                      break L3;
                    }
                  }
                  var5++;
                  continue L2;
                }
              }
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var2);
            stackOut_13_1 = new StringBuilder().append("ro.D(").append(param0).append(',');
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
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (nj[]) ((Object) stackIn_4_0);
        } else {
          return stackIn_12_0;
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int[] var1_array = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var7 = null;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var16 = null;
        int[] var17 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Pool.field_O;
        try {
          L0: {
            if (em.field_K) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (null == ta.field_g) {
                  ta.field_g = bo.a(4, 47);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (!ta.field_g.field_s) {
                  break L2;
                } else {
                  var12 = oa.field_g;
                  var10 = var12;
                  var5 = var10;
                  var1_array = var5;
                  var16 = ta.field_g.field_l;
                  var3 = 0;
                  L3: while (true) {
                    if (var3 >= 8) {
                      var13 = hp.field_c;
                      var11 = var13;
                      var7 = var11;
                      var1_array = var7;
                      var17 = ta.field_g.field_l;
                      var9 = 0;
                      var3 = var9;
                      L4: while (true) {
                        if (-9 >= (var9 ^ -1)) {
                          em.field_K = true;
                          ta.field_g = null;
                          break L2;
                        } else {
                          var7[var9] = rb.b(var13[var9], var17[var9] ^ -1);
                          var9++;
                          continue L4;
                        }
                      }
                    } else {
                      var5[var3] = md.a(var12[var3], var16[var3]);
                      var3++;
                      continue L3;
                    }
                  }
                }
              }
              if (param0 <= -18) {
                L5: {
                  if (em.field_K) {
                    kk.g(47);
                    if (-19 == (ne.field_w ^ -1)) {
                      if (oe.a(false, hp.field_c)) {
                        s.field_c[18].a(0, 0, false);
                        break L5;
                      } else {
                        ne.field_w = 16;
                        fq.a(-3405, 16, sq.field_b, false);
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
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
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "ro.A(" + param0 + ')');
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

    final void a(int param0, int param1, int param2, int param3, byte param4, int[] param5) {
        RuntimeException var7 = null;
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
              param0 = param0 - param5[0];
              param1 = param1 - param5[2];
              param3 = param3 - param5[1];
              this.field_u = param5[6] * param0 + (param3 * param5[7] - -(param1 * param5[8])) >> -1468954704;
              this.field_n = param1 * param5[5] + param0 * param5[3] + param3 * param5[4] >> 1290904112;
              this.field_a = param0 * param5[9] + (param3 * param5[10] - -(param5[11] * param1)) >> 1168039984;
              if (param4 == 120) {
                break L1;
              } else {
                this.field_t = 28;
                break L1;
              }
            }
            L2: {
              this.field_l = param2;
              if (this.field_a == 0) {
                break L2;
              } else {
                if (this.field_a == 1) {
                  break L2;
                } else {
                  this.field_b = bb.a(this.field_a, this.field_n, (byte) 99);
                  this.field_o = vd.a(this.field_a, (byte) 103, this.field_u);
                  this.field_t = lo.a(this.field_l, this.field_a, (byte) 123);
                  break L2;
                }
              }
            }
            this.field_k = 0;
            this.field_i = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var7);
            stackOut_7_1 = new StringBuilder().append("ro.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param5 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final void a(ro param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              this.field_i = param0.field_f + this.field_f;
              if (param1 == -16875) {
                break L1;
              } else {
                this.field_b = 105;
                break L1;
              }
            }
            L2: {
              L3: {
                this.field_k = param0.field_m + this.field_m;
                if (0 != this.field_i) {
                  break L3;
                } else {
                  if (-1 != (this.field_k ^ -1)) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              var3_int = ke.a(false, this.field_k * this.field_k + this.field_i * this.field_i);
              if (var3_int == 0) {
                break L2;
              } else {
                this.field_i = (this.field_i << 417255944) / var3_int;
                this.field_k = (this.field_k << -1025675032) / var3_int;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("ro.G(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final boolean b(ro param0, int param1) {
        boolean discarded$2 = false;
        RuntimeException var3 = null;
        ro var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
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
              if (param1 == 24) {
                break L1;
              } else {
                var4 = (ro) null;
                discarded$2 = this.b((ro) null, -17);
                break L1;
              }
            }
            stackOut_2_0 = hk.a(99, param0.field_n, this.field_n, param0.field_u, param0.field_a, this.field_a, this.field_u);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ro.B(");
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
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 240) {
            ro.b(-41);
        }
        field_g = null;
        field_v = (int[][][]) null;
        field_s = null;
        field_p = null;
    }

    final void a(byte param0, ro param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
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
        try {
          L0: {
            L1: {
              this.field_q[0] = this.field_n;
              this.field_j[0] = this.field_u;
              this.field_c[0] = this.field_a;
              this.field_h[0] = this.field_l;
              this.field_q[1] = param1.field_n;
              this.field_j[1] = param1.field_u;
              this.field_c[1] = param1.field_a;
              this.field_h[1] = param1.field_l;
              this.field_r = ic.a(this.field_j, 0, this.field_q, this.field_h, this.field_c, param0 + -56);
              if ((this.field_r & 15) == 0) {
                this.field_q[0] = this.field_b;
                this.field_j[0] = this.field_o;
                this.field_h[0] = this.field_t;
                break L1;
              } else {
                this.field_q[0] = bb.a(this.field_c[0], this.field_q[0], (byte) 99);
                this.field_j[0] = vd.a(this.field_c[0], (byte) 69, this.field_j[0]);
                this.field_h[0] = lo.a(this.field_h[0], this.field_c[0], (byte) 84);
                break L1;
              }
            }
            L2: {
              if ((this.field_r & 240) == 0) {
                this.field_q[1] = param1.field_b;
                this.field_j[1] = param1.field_o;
                this.field_h[1] = param1.field_t;
                break L2;
              } else {
                this.field_q[1] = bb.a(this.field_c[1], this.field_q[1], (byte) 99);
                this.field_j[1] = vd.a(this.field_c[1], (byte) 68, this.field_j[1]);
                this.field_h[1] = lo.a(this.field_h[1], this.field_c[1], (byte) 83);
                break L2;
              }
            }
            L3: {
              this.field_m = this.field_j[1] - this.field_j[0];
              if (param0 == 60) {
                break L3;
              } else {
                this.field_c = (int[]) null;
                break L3;
              }
            }
            L4: {
              L5: {
                this.field_f = this.field_q[1] - this.field_q[0];
                if (0 != this.field_f) {
                  break L5;
                } else {
                  if (-1 == (this.field_m ^ -1)) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              var3_int = ke.a(false, this.field_m * this.field_m + this.field_f * this.field_f);
              if (var3_int == 0) {
                break L4;
              } else {
                this.field_m = (this.field_m << -1164665176) / var3_int;
                this.field_f = (this.field_f << 1458958504) / var3_int;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("ro.F(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    ro() {
        this.field_h = new int[2];
        this.field_q = new int[2];
        this.field_j = new int[2];
        this.field_c = new int[2];
    }

    static {
        field_p = "Game full";
        field_g = "Reject <%0> from this game";
    }
}
