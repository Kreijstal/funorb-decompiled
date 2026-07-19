/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib extends fj {
    private int field_Y;
    private nf field_L;
    int field_R;
    private nf[] field_X;
    static long[] field_V;
    private nf field_U;
    private int field_S;
    private int field_I;
    private int field_Z;
    boolean field_N;
    private int field_H;
    private int field_P;
    static long[][] field_T;
    private nf field_K;
    static int field_W;
    static bi field_J;
    static int[] field_M;

    public static void h(byte param0) {
        if (param0 != -20) {
            field_T = (long[][]) null;
        }
        field_M = null;
        field_V = null;
        field_T = (long[][]) null;
        field_J = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(-119, param1, param2, param3, param4);
        this.g((byte) -111);
        if (param0 >= -109) {
            this.field_Y = 98;
        }
    }

    ib(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, 8355711 & param5 >> -1738507903, 8355711 & param6 >> 1480067201);
    }

    final static int a(byte param0) {
        if (param0 == 109) {
          if (-3 >= (we.field_c ^ -1)) {
            L0: {
              if (-1 == (hc.field_m ^ -1)) {
                if (wc.field_Wb.b(0)) {
                  if (!wc.field_Wb.a("commonui", 0)) {
                    return 40;
                  } else {
                    if (i.field_r.b(param0 ^ 109)) {
                      if (i.field_r.a("commonui", 0)) {
                        if (tf.field_k.b(0)) {
                          if (!tf.field_k.a(25057)) {
                            return 80;
                          } else {
                            break L0;
                          }
                        } else {
                          return 70;
                        }
                      } else {
                        return 60;
                      }
                    } else {
                      return 50;
                    }
                  }
                } else {
                  return 20;
                }
              } else {
                L1: {
                  if (null == o.field_f) {
                    break L1;
                  } else {
                    if (o.field_f.b(param0 ^ 109)) {
                      if (!o.field_f.b("", -4308)) {
                        return 29;
                      } else {
                        if (o.field_f.a("", 0)) {
                          break L1;
                        } else {
                          return 29;
                        }
                      }
                    } else {
                      return 14;
                    }
                  }
                }
                if (wc.field_Wb.b(param0 + -109)) {
                  if (wc.field_Wb.a("commonui", 0)) {
                    if (i.field_r.b(0)) {
                      if (i.field_r.a("commonui", 0)) {
                        if (tf.field_k.b(0)) {
                          if (!tf.field_k.a(param0 + 24948)) {
                            return 86;
                          } else {
                            break L0;
                          }
                        } else {
                          return 82;
                        }
                      } else {
                        return 80;
                      }
                    } else {
                      return 71;
                    }
                  } else {
                    return 57;
                  }
                } else {
                  return 43;
                }
              }
            }
            return 100;
          } else {
            return 0;
          }
        } else {
          return 118;
        }
    }

    final static void b(boolean param0) {
        ud var1 = (ud) ((Object) ve.field_b.b((byte) 98));
        if (!(var1 != null)) {
            throw new IllegalStateException();
        }
        fn.a(var1.field_s, var1.field_u, var1.field_m);
        if (param0) {
            field_W = -15;
        }
        fn.h(var1.field_t, var1.field_n, var1.field_r, var1.field_p);
        var1.field_s = null;
        m.field_d.a((rk) (var1), (byte) -108);
    }

    final void a(int param0, boolean param1, int param2) {
        this.field_Y = (param2 & 16711422) >> 1183576513;
        this.field_Z = param0;
        this.field_I = param2;
        this.field_S = (16711422 & param0) >> -1535752223;
        if (param1) {
            return;
        }
        this.g((byte) -127);
    }

    final void a(fj param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (!this.field_N) {
                break L1;
              } else {
                this.field_H = this.field_H + 1;
                if (this.field_P * 2 >= this.field_H) {
                  break L1;
                } else {
                  this.field_H = this.field_H - 2 * this.field_P;
                  break L1;
                }
              }
            }
            L2: {
              if (param1 == 11579568) {
                break L2;
              } else {
                this.g((byte) 88);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("ib.V(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final nf b(int param0, byte param1, int param2) {
        nf discarded$1 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        nf var14 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var13 = Confined.field_J ? 1 : 0;
          if (param1 <= -75) {
            break L0;
          } else {
            discarded$1 = this.f(-60);
            break L0;
          }
        }
        var14 = new nf(2 * this.field_P, this.field_z);
        vm.a(var14, -8409);
        var5 = this.field_z >> -1325943167;
        var6 = 0;
        L1: while (true) {
          if (this.field_z <= var6) {
            ib.b(false);
            return var14;
          } else {
            L2: {
              var7 = (2 * this.field_P - 1) * (var6 >> 692616481) % (2 * this.field_P);
              var8 = 16711935 & param0;
              var9 = 65280 & param0;
              var10 = var6 + -var5;
              var11 = 128 - -(int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5));
              if (256 <= var11) {
                stackOut_6_0 = var8 | var9;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = (16711680 & var9 * var11 | -16711936 & var8 * var11) >>> 999315688;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var12 = stackIn_7_0;
              fn.b(var7, var6, this.field_P, var12);
              var9 = param2 & 65280;
              var8 = param2 & 16711935;
              fn.b(var7 + -(this.field_P * 2), var6, this.field_P, var12);
              if (256 > var11) {
                stackOut_9_0 = (var11 * var9 & 16711680 | var8 * var11 & -16711936) >>> -1122749496;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = var8 | var9;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var12 = stackIn_10_0;
            fn.b(this.field_P + var7, var6, this.field_P, var12);
            fn.b(var7 + -this.field_P, var6, this.field_P, var12);
            var6++;
            continue L1;
          }
        }
    }

    private final void a(byte param0, nf param1, int param2, int param3) {
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
        var8 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var5_int = this.field_F + param2;
            lc.a(param2 + this.field_K.field_u, -this.field_K.field_u + var5_int, param3 + this.field_z, param3, 14907);
            var6 = -this.field_H + param2;
            L1: while (true) {
              if (var6 >= var5_int) {
                L2: {
                  var7 = -39 % ((param0 - 61) / 63);
                  ib.b(false);
                  if (fn.field_c <= this.field_K.field_u + param2) {
                    vm.a(this.field_L, -8409);
                    param1.d(-this.field_H, 0);
                    param1.d(-this.field_H + this.field_P * 2, 0);
                    this.field_U.a(0, 0);
                    ib.b(false);
                    this.field_L.d(param2, param3);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (fn.field_i >= var5_int + -this.field_K.field_u) {
                    vm.a(this.field_L, -8409);
                    var7 = -this.field_K.field_u + this.field_F + this.field_H;
                    L4: while (true) {
                      if (2 * this.field_P >= var7) {
                        param1.d(-var7, 0);
                        param1.d(-var7 + 2 * this.field_P, 0);
                        this.field_K.a(0, 0);
                        ib.b(false);
                        this.field_L.d(var5_int + -this.field_K.field_u, param3);
                        break L3;
                      } else {
                        var7 = var7 - this.field_P * 2;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                break L0;
              } else {
                param1.d(var6, param3);
                var6 = var6 + param1.field_u;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var5);
            stackOut_14_1 = new StringBuilder().append("ib.B(").append(param0).append(',');
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
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final nf f(int param0) {
        int var6 = 0;
        double var7 = 0.0;
        int var9 = 0;
        int var10 = Confined.field_J ? 1 : 0;
        int var2 = this.field_z >> 1390068513;
        nf var3 = new nf(var2, this.field_z);
        vm.a(var3, -8409);
        int var4 = 0;
        int var5 = 1 % ((47 - param0) / 59);
        while (this.field_z > var4) {
            for (var6 = 0; var2 > var6; var6++) {
                var7 = (double)var6 * (double)var6 / (double)(var4 * (this.field_z - var4));
                var9 = 1;
                if (!(var7 >= 1.0)) {
                    var7 = Math.sqrt(-var7 + 1.0);
                    var9 = 1.0 > var7 ? (int)(255.0 * var7) : 255;
                }
                fn.a(var6, var4, var9 << 493168656 | (var9 << 1948765800 | var9));
            }
            var4++;
        }
        ib.b(false);
        return var3;
    }

    final static void c(boolean param0) {
        if (ki.field_c != null) {
            ki.field_c.n(10);
        }
        if (param0) {
            return;
        }
        hb.field_u = new bf();
        dn.field_b.a((fj) (hb.field_u), (byte) -72);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (!(0 == param1)) {
            return;
        }
        int var5 = this.field_q + param3;
        int var6 = this.field_m + param0;
        this.a((byte) -80, this.field_X[0], var5, var6);
        if (65536 > this.field_R) {
            lc.a((this.field_F * this.field_R >> -216969712) + var5, this.field_F + var5, var6 + this.field_z, var6, 14907);
            this.a((byte) 124, this.field_X[1], var5, var6);
            ib.b(false);
        }
        if (param2 <= 36) {
            this.field_I = -41;
        }
    }

    private final void g(byte param0) {
        this.field_X = new nf[]{this.b(this.field_Z, (byte) -81, this.field_I), this.b(this.field_S, (byte) -120, this.field_Y)};
        this.field_K = this.f(124);
        this.field_U = this.field_K.b();
        this.field_L = new nf(this.field_z >> 1572873025, this.field_z);
        if (param0 >= -105) {
            this.field_S = -14;
        }
    }

    private ib(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_P = param4;
        this.field_Y = param8;
        this.field_S = param7;
        this.field_Z = param5;
        this.field_I = param6;
        this.a(-126, param2, param1, param3, param0);
    }

    static {
        $cfr$clinit: {
            int var0 = 0;
            int var1 = 0;
            long var2 = 0L;
            long var4 = 0L;
            long var6 = 0L;
            long var8 = 0L;
            long var10 = 0L;
            long var12 = 0L;
            int var14 = 0;
            int var15 = 0;
            long stackIn_5_0 = 0L;
            long stackOut_4_0 = 0L;
            long stackOut_3_0 = 0L;
            field_V = new long[11];
            field_T = new long[8][256];
            var0 = 0;
            L0: while (true) {
              if ((var0 ^ -1) <= -257) {
                field_V[0] = 0L;
                var15 = 1;
                var0 = var15;
                L1: while (true) {
                  if (-11 > (var15 ^ -1)) {
                    field_W = 49;
                    field_M = new int[256];
                    break $cfr$clinit;
                  } else {
                    var1 = 8 * (-1 + var15);
                    field_V[var15] = pa.a(kd.a(field_T[7][var1 + 7], 255L), pa.a(kd.a(65280L, field_T[6][6 + var1]), pa.a(kd.a(field_T[5][5 + var1], 16711680L), pa.a(pa.a(kd.a(1095216660480L, field_T[3][var1 - -3]), pa.a(kd.a(field_T[2][var1 - -2], 280375465082880L), pa.a(kd.a(71776119061217280L, field_T[1][var1 + 1]), kd.a(field_T[0][var1], -72057594037927936L)))), kd.a(field_T[4][var1 + 4], 4278190080L)))));
                    var15++;
                    continue L1;
                  }
                }
              } else {
                L2: {
                  var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
                  if ((var0 & 1) != 0) {
                    stackOut_4_0 = (long)(var1 & 255);
                    stackIn_5_0 = stackOut_4_0;
                    break L2;
                  } else {
                    stackOut_3_0 = (long)(var1 >>> -773779032);
                    stackIn_5_0 = stackOut_3_0;
                    break L2;
                  }
                }
                L3: {
                  var2 = stackIn_5_0;
                  var4 = var2 << 1314941889;
                  if (-257L < (var4 ^ -1L)) {
                    break L3;
                  } else {
                    var4 = var4 ^ 285L;
                    break L3;
                  }
                }
                L4: {
                  var6 = var4 << 1816329729;
                  if (256L > var6) {
                    break L4;
                  } else {
                    var6 = var6 ^ 285L;
                    break L4;
                  }
                }
                L5: {
                  var8 = var2 ^ var6;
                  var10 = var6 << -1294171711;
                  if ((var10 ^ -1L) > -257L) {
                    break L5;
                  } else {
                    var10 = var10 ^ 285L;
                    break L5;
                  }
                }
                var12 = var2 ^ var10;
                field_T[0][var0] = rk.a(rk.a(rk.a(rk.a(var10 << -822506792, rk.a(rk.a(rk.a(var2 << -877690384, var2 << -147093320), var6 << 78574248), var2 << -1193516256)), var8 << -1145846832), var4 << -1468403896), var12);
                var14 = 1;
                L6: while (true) {
                  if ((var14 ^ -1) <= -9) {
                    var0++;
                    continue L0;
                  } else {
                    field_T[var14][var0] = rk.a(field_T[-1 + var14][var0] >>> -1886885688, field_T[var14 + -1][var0] << -1183377352);
                    var14++;
                    continue L6;
                  }
                }
              }
            }
        }
    }
}
