/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea extends n {
    private hj field_E;
    int field_B;
    private int field_F;
    private int field_C;
    private hj field_I;
    private int field_G;
    private int field_A;
    private hj[] field_D;
    private hj field_L;
    private int field_H;
    private int field_M;
    boolean field_K;

    private final void a(byte param0) {
        ((ea) this).field_D = new hj[]{this.b(127, ((ea) this).field_C, ((ea) this).field_A), this.b(127, ((ea) this).field_M, ((ea) this).field_G)};
        ((ea) this).field_I = this.a(-127);
        ((ea) this).field_E = ((ea) this).field_I.d();
        ((ea) this).field_L = new hj(((ea) this).field_u >> 1, ((ea) this).field_u);
        int var2 = 22 % ((param0 - 6) / 63);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (0 != param3) {
            return;
        }
        if (param0 != -9532) {
            ((ea) this).field_M = -82;
        }
        int var5 = ((ea) this).field_k + param2;
        int var6 = ((ea) this).field_o + param1;
        this.a(2, var6, ((ea) this).field_D[0], var5);
        if (65536 > ((ea) this).field_B) {
            td.a(((ea) this).field_x + var5, (((ea) this).field_x * ((ea) this).field_B >> 16) + var5, ((ea) this).field_u + var6, true, var6);
            this.a(param0 ^ -9530, var6, ((ea) this).field_D[1], var5);
            dm.b((byte) -10);
        }
    }

    private final void a(int param0, int param1, hj param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var5_int = ((ea) this).field_x + param3;
              td.a(-((ea) this).field_I.field_s + var5_int, ((ea) this).field_I.field_s + param3, ((ea) this).field_u + param1, true, param1);
              var6 = -((ea) this).field_H + param3;
              if (param0 == 2) {
                break L1;
              } else {
                ((ea) this).field_I = null;
                break L1;
              }
            }
            L2: while (true) {
              if (var5_int <= var6) {
                L3: {
                  dm.b((byte) -10);
                  if (tc.field_d > param3 + ((ea) this).field_I.field_s) {
                    break L3;
                  } else {
                    hf.a(((ea) this).field_L, -1);
                    param2.a(-((ea) this).field_H, 0);
                    param2.a(((ea) this).field_F * 2 - ((ea) this).field_H, 0);
                    ((ea) this).field_E.d(0, 0);
                    dm.b((byte) -10);
                    ((ea) this).field_L.a(param3, param1);
                    break L3;
                  }
                }
                L4: {
                  if (-((ea) this).field_I.field_s + var5_int > tc.field_e) {
                    break L4;
                  } else {
                    hf.a(((ea) this).field_L, param0 ^ -3);
                    var7 = ((ea) this).field_x + (-((ea) this).field_I.field_s + ((ea) this).field_H);
                    L5: while (true) {
                      if (var7 <= ((ea) this).field_F * 2) {
                        param2.a(-var7, 0);
                        param2.a(-var7 + ((ea) this).field_F * 2, 0);
                        ((ea) this).field_I.d(0, 0);
                        dm.b((byte) -10);
                        ((ea) this).field_L.a(var5_int - ((ea) this).field_I.field_s, param1);
                        break L4;
                      } else {
                        var7 = var7 - ((ea) this).field_F * 2;
                        continue L5;
                      }
                    }
                  }
                }
                break L0;
              } else {
                param2.a(var6, param1);
                var6 = var6 + param2.field_s;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("ea.B(").append(param0).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param3 + 41);
        }
    }

    private final hj b(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        hj var14 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var13 = HoldTheLine.field_D;
        var14 = new hj(((ea) this).field_F * 2, ((ea) this).field_u);
        if (param0 > 120) {
          hf.a(var14, -1);
          var5 = ((ea) this).field_u >> 1;
          var6 = 0;
          L0: while (true) {
            if (((ea) this).field_u <= var6) {
              dm.b((byte) -10);
              return var14;
            } else {
              L1: {
                var7 = (var6 >> 1) * (-1 + ((ea) this).field_F * 2) % (((ea) this).field_F * 2);
                var8 = param1 & 16711935;
                var9 = 65280 & param1;
                var10 = -var5 + var6;
                var11 = (int)(Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5 * 128.0) + 128;
                if (var11 >= 256) {
                  stackOut_6_0 = var8 | var9;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = (var11 * var9 & 16711680 | -16711936 & var8 * var11) >>> 8;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                var12 = stackIn_7_0;
                tc.b(var7, var6, ((ea) this).field_F, var12);
                var9 = 65280 & param2;
                var8 = param2 & 16711935;
                tc.b(-(((ea) this).field_F * 2) + var7, var6, ((ea) this).field_F, var12);
                if (var11 >= 256) {
                  stackOut_9_0 = var8 | var9;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = (var11 * var9 & 16711680 | -16711936 & var11 * var8) >>> 8;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              var12 = stackIn_10_0;
              tc.b(var7 - -((ea) this).field_F, var6, ((ea) this).field_F, var12);
              tc.b(var7 + -((ea) this).field_F, var6, ((ea) this).field_F, var12);
              var6++;
              continue L0;
            }
          }
        } else {
          return null;
        }
    }

    private final hj a(int param0) {
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var9 = 0;
        int var10 = HoldTheLine.field_D;
        int var2 = 2;
        int var3 = ((ea) this).field_u >> 1;
        hj var4 = new hj(var3, ((ea) this).field_u);
        hf.a(var4, -1);
        for (var5 = 0; ((ea) this).field_u > var5; var5++) {
            for (var6 = 0; var6 < var3; var6++) {
                var7 = (double)var6 * (double)var6 / (double)((-var5 + ((ea) this).field_u) * var5);
                var9 = 1;
                if (!(1.0 <= var7)) {
                    var7 = Math.sqrt(1.0 - var7);
                    var9 = var7 >= 1.0 ? 255 : (int)(var7 * 255.0);
                }
                tc.a(var6, var5, var9 << 16 | (var9 | var9 << 8));
            }
        }
        dm.b((byte) -10);
        return var4;
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.a((byte) -96);
    }

    ea(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (16711422 & param5) >> 1, 8355711 & param6 >> 1);
    }

    final void a(int param0, n param1, int param2, byte param3) {
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
              if (!((ea) this).field_K) {
                break L1;
              } else {
                ((ea) this).field_H = ((ea) this).field_H + 1;
                if (((ea) this).field_F * 2 >= ((ea) this).field_H) {
                  break L1;
                } else {
                  ((ea) this).field_H = ((ea) this).field_H - ((ea) this).field_F * 2;
                  break L1;
                }
              }
            }
            L2: {
              if (param3 == -3) {
                break L2;
              } else {
                hj discarded$2 = this.b(-85, 81, -16);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("ea.JA(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static void a(boolean param0) {
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int var5 = 0;
        Throwable decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            var1 = (Object) (Object) tf.field_n;
            synchronized (var1) {
              L1: {
                cb.field_j = cb.field_j + 1;
                L2: {
                  vj.field_l = qd.field_i;
                  if (jd.field_J < 0) {
                    var5 = 0;
                    var2 = var5;
                    L3: while (true) {
                      if (112 <= var5) {
                        jd.field_J = th.field_j;
                        break L2;
                      } else {
                        lk.field_g[var5] = false;
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    L4: while (true) {
                      if (th.field_j == jd.field_J) {
                        break L2;
                      } else {
                        var2 = na.field_r[th.field_j];
                        th.field_j = 127 & th.field_j - -1;
                        if (var2 >= 0) {
                          lk.field_g[var2] = true;
                          continue L4;
                        } else {
                          lk.field_g[~var2] = false;
                          continue L4;
                        }
                      }
                    }
                  }
                }
                qd.field_i = lj.field_b;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw kk.a((Throwable) (Object) var1_ref, "ea.I(" + 0 + 41);
        }
    }

    final void a(int param0, int param1, boolean param2) {
        ((ea) this).field_G = param1 >> 1 & 8355711;
        ((ea) this).field_A = param1;
        ((ea) this).field_M = 8355711 & param0 >> 1;
        ((ea) this).field_C = param0;
        if (param2) {
            Object var5 = null;
            ((ea) this).a(-23, (n) null, 66, (byte) -6);
        }
        this.a((byte) 70);
    }

    private ea(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((ea) this).field_F = param4;
        ((ea) this).field_C = param5;
        ((ea) this).field_M = param7;
        ((ea) this).field_A = param6;
        ((ea) this).field_G = param8;
        ((ea) this).a(param0, (byte) 122, param1, param3, param2);
    }

    static {
    }
}
