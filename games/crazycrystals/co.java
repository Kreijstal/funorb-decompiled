/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class co extends qm {
    private int field_E;
    private dl field_z;
    private int field_v;
    private int field_C;
    private int field_I;
    boolean field_H;
    static String[] field_G;
    private int field_w;
    static int field_x;
    private dl[] field_y;
    static boolean field_F;
    private dl field_D;
    int field_A;
    private dl field_B;
    private int field_u;

    private final dl j() {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = CrazyCrystals.field_B;
        int var2 = ((co) this).field_f >> 1;
        dl var3 = new dl(var2, ((co) this).field_f);
        em.a((byte) 38, var3);
        for (var4 = 0; ((co) this).field_f > var4; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((-var4 + ((co) this).field_f) * var4);
                var8 = 1;
                if (!(1.0 <= var6)) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = 1.0 > var6 ? (int)(255.0 * var6) : 255;
                }
                kh.a(var5, var4, var8 << 16 | (var8 | var8 << 8));
            }
        }
        lg.a(1);
        return var3;
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        super.a(param0, param1, param2, param3, param4);
        int discarded$0 = 0;
        this.h();
    }

    private final void h() {
        int discarded$0 = 2;
        int discarded$1 = 2;
        ((co) this).field_y = new dl[]{this.a(((co) this).field_w, ((co) this).field_C), this.a(((co) this).field_u, ((co) this).field_E)};
        int discarded$2 = 255;
        ((co) this).field_z = this.j();
        ((co) this).field_B = ((co) this).field_z.c();
        ((co) this).field_D = new dl(((co) this).field_f >> 1, ((co) this).field_f);
    }

    final static int i() {
        try {
            IOException var1 = null;
            int var1_int = 0;
            ng var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_24_0 = 0;
            int stackIn_28_0 = 0;
            int stackIn_33_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_27_0 = 0;
            int stackOut_23_0 = 0;
            int stackOut_32_0 = 0;
            if (oi.field_d.field_j >= 4) {
              if (oi.field_d.field_p != -1) {
                if (oi.field_d.field_p == -2) {
                  return 4;
                } else {
                  return 1;
                }
              } else {
                return 3;
              }
            } else {
              try {
                L0: {
                  L1: {
                    if (jh.field_e != 0) {
                      break L1;
                    } else {
                      ci.field_k = cc.field_a.a(cb.field_m, false, em.field_g);
                      jh.field_e = jh.field_e + 1;
                      break L1;
                    }
                  }
                  L2: {
                    if (jh.field_e == 1) {
                      if (ci.field_k.field_a == 2) {
                        stackOut_13_0 = se.a(-1, (byte) -114);
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0;
                      } else {
                        if (ci.field_k.field_a != 1) {
                          break L2;
                        } else {
                          jh.field_e = jh.field_e + 1;
                          break L2;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (2 == jh.field_e) {
                      so.field_c = new j((java.net.Socket) ci.field_k.field_b, cc.field_a);
                      var2 = new ng(13);
                      hn.a(kn.field_q, pj.field_x, 12, var2, fk.field_v);
                      var2.a(true, 15);
                      var2.a(ah.field_e, -16384);
                      so.field_c.a(0, 114, var2.field_h, 13);
                      jh.field_e = jh.field_e + 1;
                      se.field_f = lo.a((byte) 114) - -30000L;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (jh.field_e != 3) {
                      break L4;
                    } else {
                      if (so.field_c.c(0) > 0) {
                        var1_int = so.field_c.b(5);
                        if (var1_int != 0) {
                          stackOut_27_0 = se.a(var1_int, (byte) -105);
                          stackIn_28_0 = stackOut_27_0;
                          return stackIn_28_0;
                        } else {
                          jh.field_e = jh.field_e + 1;
                          break L4;
                        }
                      } else {
                        if (~lo.a((byte) -49) >= ~se.field_f) {
                          break L4;
                        } else {
                          stackOut_23_0 = se.a(-2, (byte) -103);
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0;
                        }
                      }
                    }
                  }
                  if (jh.field_e == 4) {
                    oi.field_d.a(dm.field_h, (Object) (Object) so.field_c, false);
                    jh.field_e = 0;
                    so.field_c = null;
                    ci.field_k = null;
                    stackOut_32_0 = 0;
                    stackIn_33_0 = stackOut_32_0;
                    break L0;
                  } else {
                    return -1;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return se.a(-3, (byte) -100);
              }
              return stackIn_33_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(qm param0, int param1, int param2, int param3) {
        try {
            if (((co) this).field_H) {
                ((co) this).field_I = ((co) this).field_I + 1;
                if (((co) this).field_I > 2 * ((co) this).field_v) {
                    ((co) this).field_I = ((co) this).field_I - 2 * ((co) this).field_v;
                }
            }
            int var5_int = -58 / ((param1 - -50) / 59);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "co.N(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    co(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (16711422 & param5) >> 1, 8355711 & param6 >> 1);
    }

    private final dl a(int param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        dl var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var13 = CrazyCrystals.field_B;
        var14 = new dl(2 * ((co) this).field_v, ((co) this).field_f);
        em.a((byte) 38, var14);
        var5 = ((co) this).field_f >> 1;
        var6 = 0;
        L0: while (true) {
          if (var6 >= ((co) this).field_f) {
            lg.a(1);
            return var14;
          } else {
            L1: {
              var7 = (var6 >> 1) * (-1 + 2 * ((co) this).field_v) % (((co) this).field_v * 2);
              var8 = 16711935 & param0;
              var9 = param0 & 65280;
              var10 = -var5 + var6;
              var11 = 128 - -(int)(128.0 * (Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5));
              if (var11 < 256) {
                stackOut_4_0 = (var11 * var9 & 16711680 | var11 * var8 & -16711936) >>> 8;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = var8 | var9;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var12 = stackIn_5_0;
              kh.f(var7, var6, ((co) this).field_v, var12);
              kh.f(-(((co) this).field_v * 2) + var7, var6, ((co) this).field_v, var12);
              var9 = param1 & 65280;
              var8 = param1 & 16711935;
              if (256 <= var11) {
                stackOut_7_0 = var9 | var8;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = (16711680 & var9 * var11 | var8 * var11 & -16711936) >>> 8;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var12 = stackIn_8_0;
            kh.f(((co) this).field_v + var7, var6, ((co) this).field_v, var12);
            kh.f(-((co) this).field_v + var7, var6, ((co) this).field_v, var12);
            var6++;
            continue L0;
          }
        }
    }

    private final void a(byte param0, dl param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              var5_int = ((co) this).field_g + param3;
              qp.a(((co) this).field_z.field_l + param3, ((co) this).field_f + param2, var5_int + -((co) this).field_z.field_l, (byte) 73, param2);
              if (param0 > 0) {
                break L1;
              } else {
                ((co) this).a(-15, -31, 68, -69, (byte) -1);
                break L1;
              }
            }
            var6 = -((co) this).field_I + param3;
            L2: while (true) {
              if (var6 >= var5_int) {
                L3: {
                  lg.a(1);
                  if (((co) this).field_z.field_l + param3 >= kh.field_c) {
                    em.a((byte) 38, ((co) this).field_D);
                    param1.a(-((co) this).field_I, 0);
                    param1.a(2 * ((co) this).field_v - ((co) this).field_I, 0);
                    ((co) this).field_B.d(0, 0);
                    lg.a(1);
                    ((co) this).field_D.a(param3, param2);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (kh.field_g >= var5_int + -((co) this).field_z.field_l) {
                    em.a((byte) 38, ((co) this).field_D);
                    var7 = ((co) this).field_I + (-((co) this).field_z.field_l + ((co) this).field_g);
                    L5: while (true) {
                      if (var7 <= 2 * ((co) this).field_v) {
                        param1.a(-var7, 0);
                        param1.a(-var7 + 2 * ((co) this).field_v, 0);
                        ((co) this).field_z.d(0, 0);
                        lg.a(1);
                        ((co) this).field_D.a(-((co) this).field_z.field_l + var5_int, param2);
                        break L4;
                      } else {
                        var7 = var7 - ((co) this).field_v * 2;
                        continue L5;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                break L0;
              } else {
                param1.a(var6, param2);
                var6 = var6 + param1.field_l;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("co.A(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (!(param3 == 0)) {
            return;
        }
        int var5 = param2 - -((co) this).field_r;
        int var6 = ((co) this).field_j + param0;
        this.a((byte) 118, ((co) this).field_y[0], var6, var5);
        if (param1 > -12) {
            return;
        }
        if (!(((co) this).field_A >= 65536)) {
            qp.a((((co) this).field_A * ((co) this).field_g >> 16) + var5, ((co) this).field_f + var6, var5 - -((co) this).field_g, (byte) 73, var6);
            this.a((byte) 119, ((co) this).field_y[1], var6, var5);
            lg.a(1);
        }
    }

    public static void a(int param0) {
        field_G = null;
        if (param0 != 2) {
            co.a(-117);
        }
    }

    final void b(byte param0, int param1, int param2) {
        ((co) this).field_u = param2 >> 1 & 8355711;
        ((co) this).field_w = param2;
        ((co) this).field_C = param1;
        ((co) this).field_E = (16711422 & param1) >> 1;
        int discarded$0 = 0;
        this.h();
        int var4 = 111 / ((param0 - -60) / 40);
    }

    final static void d() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        fq var6 = null;
        L0: {
          var5 = CrazyCrystals.field_B;
          var6 = oe.field_a[2];
          var2 = 48 * var6.field_m / var6.field_p;
          var3 = var6.field_s * var2 + 24 - -(48 * var6.field_t);
          var4 = -var3 + 264;
          if (uo.field_o != 0) {
            if (uo.field_o == 1) {
              ah.a(ma.field_o, var4, 1, (byte) -53, 1);
              ah.a(dn.field_b, var4, 9, (byte) 89, 9);
              aj.a(32293, md.field_k[1], var4, 12, 9, wf.field_f);
              ah.a(fn.field_g, var4, 14, (byte) 116, 14);
              break L0;
            } else {
              if (uo.field_o != 2) {
                if (uo.field_o == 3) {
                  ah.a(lp.field_c, var4, 5, (byte) 102, 5);
                  ah.a(cl.field_i, var4, 10, (byte) -67, 10);
                  ah.a(jp.field_b, var4, 13, (byte) 101, 13);
                  ah.a(hm.field_a, var4, 19, (byte) -57, 19);
                  break L0;
                } else {
                  ah.a(g.field_a, var4, 3, (byte) 119, 3);
                  ah.a(hc.field_c, var4, 3, (byte) -71, 6);
                  aj.a(32293, md.field_k[0], var4, 9, 9, oj.field_M);
                  aj.a(32293, md.field_k[1], var4, 13, 12, am.field_f);
                  aj.a(32293, md.field_k[1], var4, 25, 25, tn.field_o);
                  aj.a(32293, md.field_k[2], var4, 28, 27, wa.field_f);
                  break L0;
                }
              } else {
                ah.a(vp.field_g, var4, 2, (byte) -94, 1);
                ah.a(rb.field_i, var4, 2, (byte) -67, 5);
                ah.a(ke.field_c, var4, 12, (byte) 97, 12);
                ah.a(fp.field_f, var4, 19, (byte) -38, 19);
                ah.a(cb.field_q, var4, 24, (byte) 122, 24);
                ah.a(oj.field_C, var4, 30, (byte) 103, 30);
                break L0;
              }
            }
          } else {
            ah.a(ao.field_d, var4, 3, (byte) -115, 3);
            ah.a(m.field_m, var4, 6, (byte) -38, 6);
            ah.a(tb.field_f, var4, 9, (byte) -63, 9);
            ah.a(cm.field_c, var4, 14, (byte) 86, 14);
            break L0;
          }
        }
    }

    private co(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((co) this).field_E = param8;
        ((co) this).field_w = param5;
        ((co) this).field_u = param7;
        ((co) this).field_C = param6;
        ((co) this).field_v = param4;
        ((co) this).a(param3, param0, param1, param2, (byte) -52);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_F = false;
    }
}
