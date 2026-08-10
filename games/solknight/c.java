/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c extends rc {
    private o field_A;
    private o[] field_S;
    private int field_O;
    static rl[] field_M;
    int field_R;
    private int field_I;
    private int field_F;
    private int field_K;
    static String field_E;
    private o field_G;
    private int field_N;
    private o field_P;
    static volatile int field_J;
    boolean field_B;
    static int field_H;
    private int field_D;
    static String field_L;

    private final o b(int param0, int param1, int param2) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        o var14;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        var13 = SolKnight.field_L ? 1 : 0;
        var14 = new o(2 * this.field_N, this.field_x);
        cl.a(-112, var14);
        var5 = this.field_x >> 985941857;
        var6 = 0;
        L0: while (true) {
          if (this.field_x <= var6) {
            L1: {
              if (param1 == 16711935) {
                break L1;
              } else {
                this.field_O = 56;
                break L1;
              }
            }
            mf.e(4096);
            return var14;
          } else {
            L2: {
              var7 = (var6 >> -168292607) * (-1 + 2 * this.field_N) % (2 * this.field_N);
              var8 = param0 & 16711935;
              var9 = param0 & 65280;
              var10 = var6 + -var5;
              var11 = (int)(Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5 * 128.0) + 128;
              if (var11 < 256) {
                stackIn_7_0 = (-16711936 & var8 * var11 | 16711680 & var11 * var9) >>> 206831848;
                break L2;
              } else {
                stackIn_7_0 = var8 | var9;
                break L2;
              }
            }
            L3: {
              var12 = stackIn_7_0;
              mi.b(var7, var6, this.field_N, var12);
              var9 = param2 & 65280;
              var8 = param2 & 16711935;
              mi.b(var7 + -(2 * this.field_N), var6, this.field_N, var12);
              if ((var11 ^ -1) <= -257) {
                stackIn_10_0 = var9 | var8;
                break L3;
              } else {
                stackIn_10_0 = (var9 * var11 & 16711680 | var11 * var8 & -16711936) >>> 2133927368;
                break L3;
              }
            }
            var12 = stackIn_10_0;
            mi.b(this.field_N + var7, var6, this.field_N, var12);
            mi.b(var7 - this.field_N, var6, this.field_N, var12);
            var6++;
            continue L0;
          }
        }
    }

    c(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 571924641 & 8355711, param6 >> 209702273 & 8355711);
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        this.a(-277997311);
    }

    private final void a(int param0) {
        if (param0 != -277997311) {
            field_H = -117;
        }
        this.field_S = new o[]{this.b(this.field_O, param0 + 294709246, this.field_K), this.b(this.field_I, param0 ^ -275703298, this.field_F)};
        this.field_P = this.a((byte) -119);
        this.field_A = this.field_P.b();
        this.field_G = new o(this.field_x >> -277997311, this.field_x);
    }

    final void a(int param0, int param1, int param2, rc param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (param1 == 18874) {
                break L1;
              } else {
                this.a((byte) -66, -124, 9);
                break L1;
              }
            }
            L2: {
              L3: {
                if (!this.field_B) {
                  break L3;
                } else {
                  this.field_D = this.field_D + 1;
                  if (this.field_N * 2 >= this.field_D) {
                    break L3;
                  } else {
                    this.field_D = this.field_D - this.field_N * 2;
                    break L2;
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("c.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(0 == param1)) {
            return;
        }
        int var5 = this.field_m + param2;
        int var6 = param0 - -this.field_j;
        this.a(param3, var6, this.field_S[0], var5);
        if ((this.field_R ^ -1) > -65537) {
            kf.a((byte) 97, var5 - -(this.field_t * this.field_R >> 451556400), var6, var5 - -this.field_t, this.field_x + var6);
            this.a(0, var6, this.field_S[1], var5);
            mf.e(4096);
        }
    }

    private final void a(int param0, int param1, o param2, int param3) {
        o discarded$0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = this.field_t + param3;
            kf.a((byte) 97, param3 + this.field_P.field_p, param1, -this.field_P.field_p + var5_int, this.field_x + param1);
            var6 = -this.field_D + param3;
            L1: while (true) {
              if (var5_int <= var6) {
                L2: {
                  if (param0 == 0) {
                    break L2;
                  } else {
                    discarded$0 = this.a((byte) 120);
                    break L2;
                  }
                }
                L3: {
                  mf.e(4096);
                  if (mi.field_b > this.field_P.field_p + param3) {
                    break L3;
                  } else {
                    cl.a(param0 ^ -100, this.field_G);
                    param2.d(-this.field_D, 0);
                    param2.d(-this.field_D + 2 * this.field_N, 0);
                    this.field_A.g(0, 0);
                    mf.e(param0 ^ 4096);
                    this.field_G.d(param3, param1);
                    break L3;
                  }
                }
                L4: {
                  if (mi.field_k < -this.field_P.field_p + var5_int) {
                    break L4;
                  } else {
                    cl.a(param0 + -119, this.field_G);
                    var7 = this.field_D + (-this.field_P.field_p + this.field_t);
                    L5: while (true) {
                      if (var7 <= 2 * this.field_N) {
                        param2.d(-var7, 0);
                        param2.d(-var7 + 2 * this.field_N, 0);
                        this.field_P.g(0, 0);
                        mf.e(param0 ^ 4096);
                        this.field_G.d(-this.field_P.field_p + var5_int, param1);
                        break L4;
                      } else {
                        var7 = var7 - this.field_N * 2;
                        continue L5;
                      }
                    }
                  }
                }
                break L0;
              } else {
                param2.d(var6, param1);
                var6 = var6 + param2.field_p;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("c.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L6;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, int param1, int param2) {
        this.field_F = (param1 & 16711422) >> 32005889;
        this.field_I = 8355711 & param2 >> 797935009;
        this.field_K = param1;
        int var4 = 99 / ((-54 - param0) / 58);
        this.field_O = param2;
        this.a(-277997311);
    }

    public static void d(byte param0) {
        field_E = null;
        field_M = null;
        int var1 = -97 % ((param0 - -47) / 39);
        field_L = null;
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (!Character.isISOControl(param1)) {
              if (!gb.a(param1, 126)) {
                var6 = hh.field_N;
                var2 = var6;
                var3 = param0;
                L1: while (true) {
                  if (var6.length <= var3) {
                    var2 = qk.field_k;
                    var3 = 0;
                    L2: while (true) {
                      if (var2.length <= var3) {
                        stackIn_23_0 = 0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        var4 = var2[var3];
                        if (var4 == param1) {
                          stackIn_20_0 = 1;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          var3++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    var4 = var6[var3];
                    if (param1 == var4) {
                      stackIn_13_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var3++;
                      continue L1;
                    }
                  }
                }
              } else {
                stackIn_6_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var2_ref), "c.H(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0 != 0;
              } else {
                return stackIn_23_0 != 0;
              }
            }
          }
        }
    }

    private c(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_I = param7;
        this.field_K = param6;
        this.field_F = param8;
        this.field_O = param5;
        this.field_N = param4;
        this.b(param3, param2, param0, 0, param1);
    }

    private final o a(byte param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = SolKnight.field_L ? 1 : 0;
        int var2 = this.field_x >> 148199553;
        if (param0 != -119) {
            return (o) null;
        }
        o var3 = new o(var2, this.field_x);
        cl.a(-98, var3);
        for (var4 = 0; this.field_x > var4; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + this.field_x));
                var8 = 1;
                if (1.0 > var6) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = 1.0 > var6 ? (int)(var6 * 255.0) : 255;
                }
                mi.a(var5, var4, var8 << 1261525928 | var8 | var8 << -874209264);
            }
        }
        mf.e(4096);
        return var3;
    }

    static {
        field_M = new rl[6];
        field_E = "A large asteroid field is heading for earth and the only hope are the eight Sol-Knights.  Earth must survive!  Each Sol-Knight is equipped with a different weapon to combat the threat.<br><br>Your planet's shields can only withstand 2 hits before they fall,<br>so stay vigilant.<br><br>Combos are the key to victory. They are gained by destroying asteroids accurately. If you miss a shot you will lose your combo, and any upgrades you collected will be removed unless you quickly restore the combo.<br><br>Maintaining accuracy will unlock weapon upgrades, such as rapid fire or multiple shots, at x10 and x25 combos.";
        field_J = -1;
        field_L = "Log in / Create account";
    }
}
