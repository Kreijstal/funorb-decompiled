/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cr extends oc {
    int field_L;
    boolean field_J;
    static vl field_N;
    private int field_K;
    private int field_M;
    private jp field_C;
    private jp[] field_P;
    private int field_I;
    private int field_F;
    static jp field_D;
    private jp field_O;
    private jp field_G;
    private int field_H;
    private int field_E;

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.g(-1847795903);
    }

    cr(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, 8355711 & param5 >> 2011111489, (param6 & 16711422) >> 512842497);
    }

    final static void a(int param0, int param1, int param2, int param3, tg param4, String param5, int param6, int param7, int param8) {
        ec.field_P = param4;
        fi.field_t = param7;
        vb.field_S = param0;
        wk.field_k = param5;
        if (param2 <= 17) {
            return;
        }
        try {
            up.field_z = param6;
            gd.field_a = param3;
            u.field_g = param1;
            nb.field_a = param8;
            vd.field_f = (ih) ((Object) new a());
            on.field_x = new kg(param4);
            dp.field_v = new co(vd.field_f, on.field_x);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "cr.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    private final void a(int param0, int param1, jp param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
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
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param0 + this.field_t;
              vi.a((byte) 107, var5_int + -this.field_G.field_D, param0 + this.field_G.field_D, param1, param1 - -this.field_s);
              var6 = param0 + -this.field_K;
              if (param3 <= -56) {
                break L1;
              } else {
                this.field_C = (jp) null;
                break L1;
              }
            }
            L2: while (true) {
              if (var5_int <= var6) {
                L3: {
                  sc.b(-103);
                  if (param0 + this.field_G.field_D < lb.field_i) {
                    break L3;
                  } else {
                    fc.a(-112, this.field_C);
                    param2.c(-this.field_K, 0);
                    param2.c(this.field_H * 2 + -this.field_K, 0);
                    this.field_O.b(0, 0);
                    sc.b(-109);
                    this.field_C.c(param0, param1);
                    break L3;
                  }
                }
                L4: {
                  if (lb.field_f >= var5_int - this.field_G.field_D) {
                    fc.a(-51, this.field_C);
                    var7 = this.field_t + -this.field_G.field_D + this.field_K;
                    L5: while (true) {
                      if (var7 <= 2 * this.field_H) {
                        param2.c(-var7, 0);
                        param2.c(-var7 + 2 * this.field_H, 0);
                        this.field_G.b(0, 0);
                        sc.b(-117);
                        this.field_C.c(var5_int - this.field_G.field_D, param1);
                        break L4;
                      } else {
                        var7 = var7 - this.field_H * 2;
                        continue L5;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                break L0;
              } else {
                param2.c(var6, param1);
                var6 = var6 + param2.field_D;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var5);
            stackOut_14_1 = new StringBuilder().append("cr.H(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
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
          throw qb.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        if (param2 != 2) {
            this.a(-106, -2, -16, (byte) 28, -96);
        }
        this.field_M = (param0 & 16711422) >> -2007684319;
        this.field_F = param0;
        this.field_I = 8355711 & param1 >> 2133041761;
        this.field_E = param1;
        this.g(-1847795903);
    }

    public static void a(byte param0) {
        field_D = null;
        field_N = null;
        if (param0 <= 36) {
            field_N = (vl) null;
        }
    }

    private final void g(int param0) {
        this.field_P = new jp[]{this.a(this.field_E, (byte) -41, this.field_F), this.a(this.field_I, (byte) 107, this.field_M)};
        this.field_G = this.a(16711422);
        this.field_O = this.field_G.c();
        this.field_C = new jp(this.field_s >> -1847795903, this.field_s);
        if (param0 != -1847795903) {
            this.field_F = 58;
        }
    }

    final static void f(byte param0) {
        if (null != bm.field_d) {
            if (bm.field_d.field_j != null) {
                bm.field_d.field_j.field_Nb = false;
            }
        }
        if (param0 >= -39) {
            cr.a(0, 110);
        }
        o.field_b = null;
        bm.field_d = null;
    }

    final void a(oc param0, byte param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
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
            if (param1 == 0) {
              L1: {
                if (!this.field_J) {
                  break L1;
                } else {
                  this.field_K = this.field_K + 1;
                  if (2 * this.field_H < this.field_K) {
                    this.field_K = this.field_K - this.field_H * 2;
                    break L1;
                  } else {
                    break L1;
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
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("cr.WA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
          throw qb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final jp a(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = BrickABrac.field_J ? 1 : 0;
        int var2 = this.field_s >> 919155233;
        if (param0 != 16711422) {
            return (jp) null;
        }
        jp var3 = new jp(var2, this.field_s);
        fc.a(-67, var3);
        for (var4 = 0; this.field_s > var4; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (this.field_s - var4));
                var8 = 1;
                if (!(1.0 <= var6)) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = var6 < 1.0 ? (int)(255.0 * var6) : 255;
                }
                lb.a(var5, var4, var8 << -1139968464 | (var8 << 360740360 | var8));
            }
        }
        sc.b(-111);
        return var3;
    }

    private final jp a(int param0, byte param1, int param2) {
        int var4 = 0;
        jp var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var14 = BrickABrac.field_J ? 1 : 0;
        var4 = 93 % ((11 - param1) / 37);
        var5 = new jp(2 * this.field_H, this.field_s);
        fc.a(-102, var5);
        var6 = this.field_s >> 429167745;
        var7 = 0;
        L0: while (true) {
          if (var7 >= this.field_s) {
            sc.b(-110);
            return var5;
          } else {
            L1: {
              var8 = (var7 >> -1438782559) * (-1 + this.field_H * 2) % (this.field_H * 2);
              var9 = param2 & 16711935;
              var10 = param2 & 65280;
              var11 = var7 - var6;
              var12 = 128 + (int)(128.0 * (Math.sqrt((double)(var6 * var6 - var11 * var11)) / (double)var6));
              if (-257 >= (var12 ^ -1)) {
                stackOut_4_0 = var9 | var10;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = (var12 * var10 & 16711680 | var9 * var12 & -16711936) >>> 358846920;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var13 = stackIn_5_0;
              lb.c(var8, var7, this.field_H, var13);
              var10 = 65280 & param0;
              lb.c(-(2 * this.field_H) + var8, var7, this.field_H, var13);
              var9 = 16711935 & param0;
              if ((var12 ^ -1) > -257) {
                stackOut_7_0 = (-16711936 & var9 * var12 | 16711680 & var10 * var12) >>> -712365656;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = var9 | var10;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var13 = stackIn_8_0;
            lb.c(this.field_H + var8, var7, this.field_H, var13);
            lb.c(var8 - this.field_H, var7, this.field_H, var13);
            var7++;
            continue L0;
          }
        }
    }

    final static jp[] a(String param0, mf param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        jp[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        jp[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
              if (param3 == 2) {
                break L1;
              } else {
                field_N = (vl) null;
                break L1;
              }
            }
            var4_int = param1.a(param0, false);
            var5 = param1.a(var4_int, param3 ^ -31, param2);
            stackOut_2_0 = ae.a(var5, param3 ^ -23174, var4_int, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("cr.B(");
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
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
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
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
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
          throw qb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    private cr(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_H = param4;
        this.field_M = param7;
        this.field_I = param8;
        this.field_F = param5;
        this.field_E = param6;
        this.a(param3, param0, param1, (byte) -119, param2);
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (!(param2 == 0)) {
            return;
        }
        int var5 = this.field_o + param1;
        int var6 = param0 + this.field_w;
        this.a(var5, var6, this.field_P[0], -63);
        if (!(65536 <= this.field_L)) {
            vi.a((byte) 118, this.field_t + var5, var5 + (this.field_L * this.field_t >> 1222250064), var6, this.field_s + var6);
            this.a(var5, var6, this.field_P[1], param3 ^ 92);
            sc.b(-102);
        }
        if (param3 != -11) {
            this.field_J = true;
        }
    }

    final static void a(int param0, int param1) {
        try {
            IOException var2 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (eq.field_g == null) {
                break L0;
              } else {
                L1: {
                  if (0 <= param0) {
                    if (q.field_i != rf.field_b) {
                      break L0;
                    } else {
                      if (-1 != (k.field_h.field_l ^ -1)) {
                        break L1;
                      } else {
                        if (cl.field_q + 10000L >= ue.a(false)) {
                          break L1;
                        } else {
                          k.field_h.e(-13413, param0);
                          break L1;
                        }
                      }
                    }
                  } else {
                    if (-1 != (k.field_h.field_l ^ -1)) {
                      break L1;
                    } else {
                      if (cl.field_q + 10000L >= ue.a(false)) {
                        break L1;
                      } else {
                        k.field_h.e(-13413, param0);
                        break L1;
                      }
                    }
                  }
                }
                if (param1 == 10000) {
                  L2: {
                    if (0 < k.field_h.field_l) {
                      try {
                        L3: {
                          eq.field_g.a(k.field_h.field_k, true, k.field_h.field_l, 0);
                          cl.field_q = ue.a(false);
                          break L3;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L4: {
                          var2 = (IOException) (Object) decompiledCaughtException;
                          hn.a((byte) 92);
                          break L4;
                        }
                      }
                      k.field_h.field_l = 0;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return;
                } else {
                  return;
                }
              }
            }
            k.field_h.field_l = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_N = new vl();
    }
}
