/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends we {
    static int[] field_y;
    boolean field_G;
    private int field_x;
    private int field_H;
    private int field_E;
    static ra field_C;
    private int field_u;
    private le field_w;
    private le[] field_z;
    private le field_B;
    private int field_v;
    private int field_F;
    private le field_A;
    int field_D;

    final void a(byte param0, int param1, int param2) {
        this.field_H = (16711422 & param1) >> 1644892769;
        this.field_x = param2;
        this.field_F = param1;
        this.field_E = 8355711 & param2 >> -1127695039;
        this.j(param0 ^ -115);
        if (param0 != -115) {
            this.field_G = false;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.j(0);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        if (-1 == (param1 ^ -1)) {
          var5 = this.field_r + param3;
          if (param0 != 30) {
            L0: {
              field_y = (int[]) null;
              var6 = this.field_e + param2;
              this.a(-82, this.field_z[0], var5, var6);
              if (this.field_D < 65536) {
                qi.a(var5 + this.field_l, true, this.field_p + var6, var5 + (this.field_D * this.field_l >> -1080957648), var6);
                this.a(-52, this.field_z[1], var5, var6);
                tj.b(653);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          } else {
            L1: {
              var6 = this.field_e + param2;
              this.a(-82, this.field_z[0], var5, var6);
              if (this.field_D < 65536) {
                qi.a(var5 + this.field_l, true, this.field_p + var6, var5 + (this.field_D * this.field_l >> -1080957648), var6);
                this.a(-52, this.field_z[1], var5, var6);
                tj.b(653);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    private final void j(int param0) {
        this.field_z = new le[]{this.b((byte) 86, this.field_x, this.field_F), this.b((byte) 86, this.field_E, this.field_H)};
        this.field_w = this.i(param0 ^ -40982079);
        this.field_A = this.field_w.a();
        if (param0 != 0) {
          this.field_F = 23;
          this.field_B = new le(this.field_p >> 1940438849, this.field_p);
          return;
        } else {
          this.field_B = new le(this.field_p >> 1940438849, this.field_p);
          return;
        }
    }

    private final le b(byte param0, int param1, int param2) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var13;
        le var14;
        int var15;
        int var16;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int var12;
        var13 = MonkeyPuzzle2.field_F ? 1 : 0;
        var14 = new le(this.field_v * 2, this.field_p);
        mc.a(param0 ^ -8551, var14);
        var5 = this.field_p >> 2141461473;
        var6 = 0;
        L0: while (true) {
          L1: {
            if (this.field_p <= var6) {
              break L1;
            } else {
              var7 = (var6 >> -998348415) * (2 * this.field_v - 1) % (this.field_v * 2);
              var8 = param2 & 16711935;
              var9 = 65280 & param2;
              var10 = -var5 + var6;
              var11 = (int)(128.0 * (Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5)) + 128;
              var16 = var11;
              var15 = 256;
              if (var13 != 0) {
                if (var15 != var16) {
                  this.field_x = -11;
                  tj.b(param0 + 567);
                  return var14;
                } else {
                  tj.b(param0 + 567);
                  return var14;
                }
              } else {
                L2: {
                  if (var15 > var16) {
                    stackIn_11_0 = (var11 * var9 & 16711680 | -16711936 & var8 * var11) >>> 1348263720;
                    break L2;
                  } else {
                    stackIn_11_0 = var9 | var8;
                    break L2;
                  }
                }
                L3: {
                  var12 = stackIn_11_0;
                  ge.a(var7, var6, this.field_v, var12);
                  var9 = 65280 & param1;
                  ge.a(-(2 * this.field_v) + var7, var6, this.field_v, var12);
                  var8 = param1 & 16711935;
                  if (256 > var11) {
                    stackIn_14_0 = (var8 * var11 & -16711936 | var9 * var11 & 16711680) >>> -673414552;
                    break L3;
                  } else {
                    stackIn_14_0 = var9 | var8;
                    break L3;
                  }
                }
                var12 = stackIn_14_0;
                ge.a(var7 + this.field_v, var6, this.field_v, var12);
                ge.a(var7 - this.field_v, var6, this.field_v, var12);
                var6++;
                if (var13 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
          }
          if (param0 != 86) {
            this.field_x = -11;
            tj.b(param0 + 567);
            return var14;
          } else {
            tj.b(param0 + 567);
            return var14;
          }
        }
    }

    jh(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (param5 & 16711422) >> -40982079, (16711422 & param6) >> 498563969);
    }

    private final void a(int param0, le param1, int param2, int param3) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        le var9 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = this.field_l + param2;
                        if (param0 < -37) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var9 = (le) null;
                        this.a(118, (le) null, -87, 86);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        qi.a(var5_int + -this.field_w.field_k, true, this.field_p + param3, param2 - -this.field_w.field_k, param3);
                        var6 = param2 + -this.field_u;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var5_int <= var6) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        param1.c(var6, param3);
                        var6 = var6 + param1.field_k;
                        if (var8 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var8 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        tj.b(653);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (ge.field_a > param2 + this.field_w.field_k) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        mc.a(-8497, this.field_B);
                        param1.c(-this.field_u, 0);
                        param1.c(this.field_v * 2 + -this.field_u, 0);
                        this.field_A.d(0, 0);
                        tj.b(653);
                        this.field_B.c(param2, param3);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (-this.field_w.field_k + var5_int > ge.field_j) {
                            statePc = 24;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        mc.a(-8497, this.field_B);
                        var7 = this.field_u + (this.field_l + -this.field_w.field_k);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var7 <= 2 * this.field_v) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7 = var7 - this.field_v * 2;
                        if (var8 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var8 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        param1.c(-var7, 0);
                        param1.c(2 * this.field_v + -var7, 0);
                        this.field_w.d(0, 0);
                        tj.b(653);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.field_B.c(-this.field_w.field_k + var5_int, param3);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_22_0 = (RuntimeException) (var5);
                    stackIn_21_0 = stackIn_22_0;
                    stackIn_22_1 = new StringBuilder().append("jh.C(").append(param0).append(',');
                    stackIn_21_1 = stackIn_22_1;
                    if (param1 == null) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_21_1);
                    stackIn_23_2 = "{...}";
                    statePc = 23;
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_23_2 = "null";
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    throw la.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ',' + param3 + ')');
                }
                case 24: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(we param0, int param1, int param2, byte param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 < -13) {
              L1: {
                if (!this.field_G) {
                  break L1;
                } else {
                  this.field_u = this.field_u + 1;
                  if (this.field_v * 2 >= this.field_u) {
                    break L1;
                  } else {
                    this.field_u = this.field_u - 2 * this.field_v;
                    return;
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
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("jh.E(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final le i(int param0) {
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        le var10 = null;
        le var11 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_32_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = MonkeyPuzzle2.field_F ? 1 : 0;
                    if (param0 != -40982079) {
                        statePc = 17;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var2 = this.field_p >> -392079999;
                    var11 = new le(var2, this.field_p);
                    mc.a(-8497, var11);
                    var4 = 0;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    stackIn_3_0 = var4 ^ -1;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (stackIn_3_0 <= (this.field_p ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    stackIn_16_0 = 0;
                    stackIn_5_0 = stackIn_16_0;
                    if (var9 != 0) {
                        statePc = 16;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var5 = stackIn_5_0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (var2 <= var5) {
                        statePc = 14;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var6 = (double)var5 * (double)var5 / (double)(var4 * (this.field_p + -var4));
                    var8 = 1;
                    stackIn_3_0 = (var6 < 1.0 ? -1 : (var6 == 1.0 ? 0 : 1));
                    stackIn_8_0 = stackIn_3_0;
                    if (var9 != 0) {
                        statePc = 3;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (stackIn_8_0 >= 0) {
                        statePc = 13;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var6 = Math.sqrt(-var6 + 1.0);
                    if (1.0 > var6) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_12_0 = 255;
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_12_0 = (int)(255.0 * var6);
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    var8 = stackIn_12_0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    ge.a(var5, var4, var8 << -1290801304 | var8 | var8 << 1231877072);
                    var5++;
                    if (var9 == 0) {
                        statePc = 6;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var4++;
                    if (var9 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = 653;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    tj.b(stackIn_16_0);
                    return var11;
                }
                case 17: {
                    this.field_B = (le) null;
                    var2 = this.field_p >> -392079999;
                    var10 = new le(var2, this.field_p);
                    mc.a(-8497, var10);
                    var4 = 0;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = var4 ^ -1;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    if (stackIn_19_0 <= (this.field_p ^ -1)) {
                        statePc = 31;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    stackIn_32_0 = 0;
                    stackIn_21_0 = stackIn_32_0;
                    if (var9 != 0) {
                        statePc = 32;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    var5 = stackIn_21_0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (var2 <= var5) {
                        statePc = 30;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var6 = (double)var5 * (double)var5 / (double)(var4 * (this.field_p + -var4));
                    var8 = 1;
                    stackIn_19_0 = (var6 < 1.0 ? -1 : (var6 == 1.0 ? 0 : 1));
                    stackIn_24_0 = stackIn_19_0;
                    if (var9 != 0) {
                        statePc = 19;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    if (stackIn_24_0 >= 0) {
                        statePc = 29;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var6 = Math.sqrt(-var6 + 1.0);
                    if (1.0 > var6) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_28_0 = 255;
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_28_0 = (int)(255.0 * var6);
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    var8 = stackIn_28_0;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    ge.a(var5, var4, var8 << -1290801304 | var8 | var8 << 1231877072);
                    var5++;
                    if (var9 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    var4++;
                    if (var9 == 0) {
                        statePc = 18;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    stackIn_32_0 = 653;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    tj.b(stackIn_32_0);
                    return var10;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        if (param0 != 7434) {
            jh.a(-65);
            field_C = null;
            field_y = null;
            return;
        }
        field_C = null;
        field_y = null;
    }

    private jh(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_F = param5;
        this.field_E = param8;
        this.field_x = param6;
        this.field_v = param4;
        this.field_H = param7;
        this.a(param3, 13361, param0, param2, param1);
    }

    static {
        field_y = new int[8192];
    }
}
