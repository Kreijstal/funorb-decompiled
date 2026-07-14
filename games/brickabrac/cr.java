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
        up.field_z = param6;
        gd.field_a = param3;
        u.field_g = param1;
        nb.field_a = param8;
        vd.field_f = (ih) (Object) new a();
        on.field_x = new kg(param4);
        dp.field_v = new co(vd.field_f, on.field_x);
    }

    private final void a(int param0, int param1, jp param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = BrickABrac.field_J ? 1 : 0;
          var5 = param0 + ((cr) this).field_t;
          vi.a((byte) 107, var5 + -((cr) this).field_G.field_D, param0 + ((cr) this).field_G.field_D, param1, param1 - -((cr) this).field_s);
          var6 = param0 + -((cr) this).field_K;
          if (param3 <= -56) {
            break L0;
          } else {
            ((cr) this).field_C = null;
            break L0;
          }
        }
        L1: while (true) {
          if (var5 <= var6) {
            L2: {
              sc.b(-103);
              if (param0 + ((cr) this).field_G.field_D < lb.field_i) {
                break L2;
              } else {
                fc.a(-112, ((cr) this).field_C);
                param2.c(-((cr) this).field_K, 0);
                param2.c(((cr) this).field_H * 2 + -((cr) this).field_K, 0);
                ((cr) this).field_O.b(0, 0);
                sc.b(-109);
                ((cr) this).field_C.c(param0, param1);
                break L2;
              }
            }
            L3: {
              if (lb.field_f >= var5 - ((cr) this).field_G.field_D) {
                fc.a(-51, ((cr) this).field_C);
                var7 = ((cr) this).field_t + -((cr) this).field_G.field_D + ((cr) this).field_K;
                L4: while (true) {
                  if (var7 <= 2 * ((cr) this).field_H) {
                    param2.c(-var7, 0);
                    param2.c(-var7 + 2 * ((cr) this).field_H, 0);
                    ((cr) this).field_G.b(0, 0);
                    sc.b(-117);
                    ((cr) this).field_C.c(var5 - ((cr) this).field_G.field_D, param1);
                    break L3;
                  } else {
                    var7 = var7 - ((cr) this).field_H * 2;
                    continue L4;
                  }
                }
              } else {
                break L3;
              }
            }
            return;
          } else {
            param2.c(var6, param1);
            var6 = var6 + param2.field_D;
            continue L1;
          }
        }
    }

    final void b(int param0, int param1, int param2) {
        if (param2 != 2) {
            ((cr) this).a(-106, -2, -16, (byte) 28, -96);
        }
        ((cr) this).field_M = (param0 & 16711422) >> -2007684319;
        ((cr) this).field_F = param0;
        ((cr) this).field_I = 8355711 & param1 >> 2133041761;
        ((cr) this).field_E = param1;
        this.g(-1847795903);
    }

    public static void a(byte param0) {
        field_D = null;
        field_N = null;
        if (param0 <= 36) {
            field_N = null;
        }
    }

    private final void g(int param0) {
        ((cr) this).field_P = new jp[]{this.a(((cr) this).field_E, (byte) -41, ((cr) this).field_F), this.a(((cr) this).field_I, (byte) 107, ((cr) this).field_M)};
        ((cr) this).field_G = this.a(16711422);
        ((cr) this).field_O = ((cr) this).field_G.c();
        ((cr) this).field_C = new jp(((cr) this).field_s >> -1847795903, ((cr) this).field_s);
        if (param0 != -1847795903) {
            ((cr) this).field_F = 58;
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
        if (param1 != 0) {
            return;
        }
        if (((cr) this).field_J) {
            ((cr) this).field_K = ((cr) this).field_K + 1;
            if (!(2 * ((cr) this).field_H >= ((cr) this).field_K)) {
                ((cr) this).field_K = ((cr) this).field_K - ((cr) this).field_H * 2;
            }
        }
    }

    private final jp a(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = BrickABrac.field_J ? 1 : 0;
        int var2 = ((cr) this).field_s >> 919155233;
        if (param0 != 16711422) {
            return null;
        }
        jp var3 = new jp(var2, ((cr) this).field_s);
        fc.a(-67, var3);
        for (var4 = 0; ((cr) this).field_s > var4; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (((cr) this).field_s - var4));
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
        int stackOut_4_0;
        int stackOut_3_0;
        int stackOut_7_0;
        int stackOut_6_0;
        var14 = BrickABrac.field_J ? 1 : 0;
        var4 = 93 % ((11 - param1) / 37);
        var5 = new jp(2 * ((cr) this).field_H, ((cr) this).field_s);
        fc.a(-102, var5);
        var6 = ((cr) this).field_s >> 429167745;
        var7 = 0;
        L0: while (true) {
          if (var7 >= ((cr) this).field_s) {
            sc.b(-110);
            return var5;
          } else {
            L1: {
              var8 = (var7 >> -1438782559) * (-1 + ((cr) this).field_H * 2) % (((cr) this).field_H * 2);
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
              lb.c(var8, var7, ((cr) this).field_H, var13);
              var10 = 65280 & param0;
              lb.c(-(2 * ((cr) this).field_H) + var8, var7, ((cr) this).field_H, var13);
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
            lb.c(((cr) this).field_H + var8, var7, ((cr) this).field_H, var13);
            lb.c(var8 - ((cr) this).field_H, var7, ((cr) this).field_H, var13);
            var7++;
            continue L0;
          }
        }
    }

    final static jp[] a(String param0, mf param1, String param2, int param3) {
        if (param3 != 2) {
            field_N = null;
        }
        int var4 = param1.a(param0, false);
        int var5 = param1.a(var4, param3 ^ -31, param2);
        return ae.a(var5, param3 ^ -23174, var4, param1);
    }

    private cr(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((cr) this).field_H = param4;
        ((cr) this).field_M = param7;
        ((cr) this).field_I = param8;
        ((cr) this).field_F = param5;
        ((cr) this).field_E = param6;
        ((cr) this).a(param3, param0, param1, (byte) -119, param2);
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (!(param2 == 0)) {
            return;
        }
        int var5 = ((cr) this).field_o + param1;
        int var6 = param0 + ((cr) this).field_w;
        this.a(var5, var6, ((cr) this).field_P[0], -63);
        if (!(65536 <= ((cr) this).field_L)) {
            vi.a((byte) 118, ((cr) this).field_t + var5, var5 + (((cr) this).field_L * ((cr) this).field_t >> 1222250064), var6, ((cr) this).field_s + var6);
            this.a(var5, var6, ((cr) this).field_P[1], param3 ^ 92);
            sc.b(-102);
        }
        if (param3 != -11) {
            ((cr) this).field_J = true;
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
                        eq.field_g.a(k.field_h.field_k, true, k.field_h.field_l, 0);
                        cl.field_q = ue.a(false);
                      } catch (java.io.IOException decompiledCaughtParameter) {
                        decompiledCaughtException = decompiledCaughtParameter;
                      }
                      var2 = (IOException) (Object) decompiledCaughtException;
                      hn.a((byte) 92);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  k.field_h.field_l = 0;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = new vl();
    }
}
