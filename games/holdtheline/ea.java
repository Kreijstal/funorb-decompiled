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
        ((ea) this).field_L = new hj(((ea) this).field_u >> -1004214623, ((ea) this).field_u);
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
            td.a(((ea) this).field_x + var5, (((ea) this).field_x * ((ea) this).field_B >> -514821648) + var5, ((ea) this).field_u + var6, true, var6);
            this.a(param0 ^ -9530, var6, ((ea) this).field_D[1], var5);
            dm.b((byte) -10);
        }
    }

    private final void a(int param0, int param1, hj param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = HoldTheLine.field_D;
          var5 = ((ea) this).field_x + param3;
          td.a(-((ea) this).field_I.field_s + var5, ((ea) this).field_I.field_s + param3, ((ea) this).field_u + param1, true, param1);
          var6 = -((ea) this).field_H + param3;
          if (param0 == 2) {
            break L0;
          } else {
            ((ea) this).field_I = null;
            break L0;
          }
        }
        L1: while (true) {
          if (var5 <= var6) {
            L2: {
              dm.b((byte) -10);
              if (tc.field_d > param3 + ((ea) this).field_I.field_s) {
                break L2;
              } else {
                hf.a(((ea) this).field_L, -1);
                param2.a(-((ea) this).field_H, 0);
                param2.a(((ea) this).field_F * 2 - ((ea) this).field_H, 0);
                ((ea) this).field_E.d(0, 0);
                dm.b((byte) -10);
                ((ea) this).field_L.a(param3, param1);
                break L2;
              }
            }
            L3: {
              if (-((ea) this).field_I.field_s + var5 > tc.field_e) {
                break L3;
              } else {
                hf.a(((ea) this).field_L, param0 ^ -3);
                var7 = ((ea) this).field_x + (-((ea) this).field_I.field_s + ((ea) this).field_H);
                L4: while (true) {
                  if (var7 <= ((ea) this).field_F * 2) {
                    param2.a(-var7, 0);
                    param2.a(-var7 + ((ea) this).field_F * 2, 0);
                    ((ea) this).field_I.d(0, 0);
                    dm.b((byte) -10);
                    ((ea) this).field_L.a(var5 - ((ea) this).field_I.field_s, param1);
                    break L3;
                  } else {
                    var7 = var7 - ((ea) this).field_F * 2;
                    continue L4;
                  }
                }
              }
            }
            return;
          } else {
            param2.a(var6, param1);
            var6 = var6 + param2.field_s;
            continue L1;
          }
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
          var5 = ((ea) this).field_u >> -1388409919;
          var6 = 0;
          L0: while (true) {
            if (((ea) this).field_u <= var6) {
              dm.b((byte) -10);
              return var14;
            } else {
              L1: {
                var7 = (var6 >> -59102399) * (-1 + ((ea) this).field_F * 2) % (((ea) this).field_F * 2);
                var8 = param1 & 16711935;
                var9 = 65280 & param1;
                var10 = -var5 + var6;
                var11 = (int)(Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5 * 128.0) + 128;
                if ((var11 ^ -1) <= -257) {
                  stackOut_6_0 = var8 | var9;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = (var11 * var9 & 16711680 | -16711936 & var8 * var11) >>> -387144856;
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
                if (-257 >= (var11 ^ -1)) {
                  stackOut_9_0 = var8 | var9;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = (var11 * var9 & 16711680 | -16711936 & var11 * var8) >>> 367197992;
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
        int var2 = 2 / ((-72 - param0) / 48);
        int var3 = ((ea) this).field_u >> -752709535;
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
                tc.a(var6, var5, var9 << 158079056 | (var9 | var9 << -245574264));
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
        this(param0, param1, param2, param3, param4, param5, param6, (16711422 & param5) >> 778757153, 8355711 & param6 >> 1058574017);
    }

    final void a(int param0, n param1, int param2, byte param3) {
        if (((ea) this).field_K) {
            ((ea) this).field_H = ((ea) this).field_H + 1;
            if (((ea) this).field_F * 2 < ((ea) this).field_H) {
                ((ea) this).field_H = ((ea) this).field_H - ((ea) this).field_F * 2;
            }
        }
        if (param3 != -3) {
            hj discarded$0 = this.b(-85, 81, -16);
        }
    }

    final static void a(boolean param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int var5 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = HoldTheLine.field_D;
                    var1 = (Object) (Object) tf.field_n;
                    // monitorenter tf.field_n
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        cb.field_j = cb.field_j + 1;
                        if (!param0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        // monitorexit var1
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        vj.field_l = qd.field_i;
                        if (-1 < (jd.field_J ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (th.field_j == jd.field_J) {
                            statePc = 13;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var2 = na.field_r[th.field_j];
                        th.field_j = 127 & th.field_j - -1;
                        if (var2 >= 0) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        lk.field_g[var2 ^ -1] = false;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        lk.field_g[var2] = true;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5 = 0;
                        var2 = var5;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (112 <= var5) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        lk.field_g[var5] = false;
                        var5++;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        jd.field_J = th.field_j;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        qd.field_i = lj.field_b;
                        // monitorexit var1
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var3 = caughtException;
                        // monitorexit var1
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 16: {
                    throw (RuntimeException) (Object) var3;
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, boolean param2) {
        ((ea) this).field_G = param1 >> 1668780289 & 8355711;
        ((ea) this).field_A = param1;
        ((ea) this).field_M = 8355711 & param0 >> -602744959;
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
