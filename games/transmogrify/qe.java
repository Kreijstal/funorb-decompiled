/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe extends qg {
    private ti field_y;
    static String field_H;
    private ti field_C;
    static String field_I;
    static ti[] field_F;
    private ti[] field_D;
    private int field_G;
    boolean field_w;
    int field_J;
    static kh field_x;
    private int field_u;
    private ti field_K;
    private int field_M;
    private int field_L;
    private int field_t;
    private int field_B;
    static String[] field_E;
    static int[] field_z;
    static String field_v;
    static String field_A;

    private final ti h(int param0) {
        int var2 = 0;
        ti var3 = null;
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Transmogrify.field_A ? 1 : 0;
                    var2 = this.field_h >> -2114180767;
                    var3 = new ti(var2, this.field_h);
                    oj.a(var3, 256);
                    var4 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    stackIn_2_0 = var4 ^ -1;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (stackIn_2_0 <= (this.field_h ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    stackIn_16_0 = 0;
                    stackIn_4_0 = stackIn_16_0;
                    if (var9 != 0) {
                        statePc = 16;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var5 = stackIn_4_0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (var2 <= var5) {
                        statePc = 14;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + this.field_h));
                    var8 = 1;
                    stackIn_2_0 = (var6 < 1.0 ? -1 : (var6 == 1.0 ? 0 : 1));
                    stackIn_7_0 = stackIn_2_0;
                    if (var9 != 0) {
                        statePc = 2;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (stackIn_7_0 < 0) {
                        statePc = 9;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var6 = Math.sqrt(-var6 + 1.0);
                    if (1.0 <= var6) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackIn_12_0 = (int)(var6 * 255.0);
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_12_0 = 255;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    var8 = stackIn_12_0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    sb.a(var5, var4, var8 << 408496040 | var8 | var8 << 1557073104);
                    var5++;
                    if (var9 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var4++;
                    if (var9 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = param0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (stackIn_16_0 != -29239) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    fi.c(true);
                    return var3;
                }
                case 18: {
                    field_E = (String[]) null;
                    fi.c(true);
                    return var3;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0, int param1, int param2) {
        this.field_u = (param1 & 16711422) >> -1813204703;
        this.field_L = 8355711 & param2 >> -1606387295;
        this.field_B = param1;
        this.field_M = param2;
        this.c(false);
        if (param0) {
          return;
        } else {
          this.a(false, 76, -81);
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(-109, param1, param2, param3, param4);
        int var6 = 118 / ((param0 - -29) / 53);
        this.c(false);
    }

    private final ti a(byte param0, int param1, int param2) {
        ti discarded$1 = null;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        ti var14;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        L0: {
          var13 = Transmogrify.field_A ? 1 : 0;
          var14 = new ti(this.field_t * 2, this.field_h);
          oj.a(var14, param0 + 166);
          var5 = this.field_h >> -1790979455;
          if (param0 == 90) {
            break L0;
          } else {
            discarded$1 = this.h(50);
            break L0;
          }
        }
        var6 = 0;
        L1: while (true) {
          L2: {
            L3: {
              if (var6 >= this.field_h) {
                break L3;
              } else {
                var7 = (var6 >> -1974548927) * (-1 + this.field_t * 2) % (this.field_t * 2);
                var8 = param2 & 16711935;
                var9 = 65280 & param2;
                var10 = var6 - var5;
                var11 = 128 + (int)(128.0 * (Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5));
                stackIn_13_0 = -257;

                if (var13 != 0) {
                  break L2;
                } else {
                  L4: {
                    if (stackIn_13_0 >= (var11 ^ -1)) {
                      stackIn_8_0 = var9 | var8;
                      break L4;
                    } else {
                      stackIn_8_0 = (16711680 & var11 * var9 | var11 * var8 & -16711936) >>> -1794144536;
                      break L4;
                    }
                  }
                  L5: {
                    var12 = stackIn_8_0;
                    sb.d(var7, var6, this.field_t, var12);
                    sb.d(var7 - 2 * this.field_t, var6, this.field_t, var12);
                    var9 = param1 & 65280;
                    var8 = 16711935 & param1;
                    if (var11 < 256) {
                      stackIn_11_0 = (var9 * var11 & 16711680 | var11 * var8 & -16711936) >>> -811925688;
                      break L5;
                    } else {
                      stackIn_11_0 = var9 | var8;
                      break L5;
                    }
                  }
                  var12 = stackIn_11_0;
                  sb.d(var7 - -this.field_t, var6, this.field_t, var12);
                  sb.d(-this.field_t + var7, var6, this.field_t, var12);
                  var6++;
                  if (var13 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            stackIn_13_0 = 1;
            break L2;
          }
          fi.c(stackIn_13_0 != 0);
          return var14;
        }
    }

    final void a(int param0, byte param1, qg param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_w) {
                this.field_G = this.field_G + 1;
                if (this.field_G > this.field_t * 2) {
                  this.field_G = this.field_G - this.field_t * 2;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (param1 == -12) {
              break L0;
            } else {
              field_v = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("qe.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
    }

    private final void c(boolean param0) {
        if (param0) {
          this.field_u = -108;
          this.field_D = new ti[]{this.a((byte) 90, this.field_B, this.field_M), this.a((byte) 90, this.field_u, this.field_L)};
          this.field_y = this.h(-29239);
          this.field_C = this.field_y.c();
          this.field_K = new ti(this.field_h >> 1507472769, this.field_h);
          return;
        } else {
          this.field_D = new ti[]{this.a((byte) 90, this.field_B, this.field_M), this.a((byte) 90, this.field_u, this.field_L)};
          this.field_y = this.h(-29239);
          this.field_C = this.field_y.c();
          this.field_K = new ti(this.field_h >> 1507472769, this.field_h);
          return;
        }
    }

    private final void a(byte param0, ti param1, int param2, int param3) {
        ti discarded$0 = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = this.field_l + param3;
                        c.a(var5_int + -this.field_y.field_n, this.field_y.field_n + param3, (byte) -50, this.field_h + param2, param2);
                        var6 = -this.field_G + param3;
                        if (param0 == -57) {
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
                        discarded$0 = this.h(-123);
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
                        if (var6 >= var5_int) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        param1.c(var6, param2);
                        var6 = var6 + param1.field_n;
                        if (var8 != 0) {
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
                        if (var8 == 0) {
                            statePc = 3;
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
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        fi.c(true);
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
                        if (param3 - -this.field_y.field_n < sb.field_d) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        oj.a(this.field_K, 256);
                        param1.c(-this.field_G, 0);
                        param1.c(this.field_t * 2 - this.field_G, 0);
                        this.field_C.b(0, 0);
                        fi.c(true);
                        this.field_K.c(param3, param2);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var5_int + -this.field_y.field_n <= sb.field_b) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        return;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        oj.a(this.field_K, 256);
                        var7 = this.field_G + this.field_l - this.field_y.field_n;
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
                        if (2 * this.field_t >= var7) {
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
                        var7 = var7 - 2 * this.field_t;
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
                        param1.c(this.field_t * 2 - var7, 0);
                        this.field_y.b(0, 0);
                        fi.c(true);
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
                        this.field_K.c(-this.field_y.field_n + var5_int, param2);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return;
                }
                case 20: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_22_0 = (RuntimeException) (var5);
                    stackIn_21_0 = stackIn_22_0;
                    stackIn_22_1 = new StringBuilder().append("qe.D(").append(param0).append(',');
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
                    throw ch.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    qe(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, 8355711 & param5 >> -1277422143, param6 >> 342186241 & 8355711);
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5;
        int var6;
        int var7;
        if (0 == param2) {
          var5 = -77 % ((param3 - 77) / 34);
          var6 = this.field_p + param0;
          var7 = this.field_n + param1;
          this.a((byte) -57, this.field_D[0], var7, var6);
          if (65536 <= this.field_J) {
            return;
          } else {
            c.a(this.field_l + var6, (this.field_l * this.field_J >> -156630320) + var6, (byte) -50, this.field_h + var7, var7);
            this.a((byte) -57, this.field_D[1], var7, var6);
            fi.c(true);
            return;
          }
        } else {
          return;
        }
    }

    public static void i(int param0) {
        field_E = null;
        field_A = null;
        field_F = null;
        field_z = null;
        field_H = null;
        if (param0 != -156630320) {
          qe.i(-7);
          field_x = null;
          field_v = null;
          field_I = null;
          return;
        } else {
          field_x = null;
          field_v = null;
          field_I = null;
          return;
        }
    }

    private qe(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_L = param7;
        this.field_t = param4;
        this.field_M = param5;
        this.field_u = param8;
        this.field_B = param6;
        this.a(75, param1, param0, param2, param3);
    }

    static {
        field_H = "Passwords can only contain letters and numbers";
        field_I = "Continue";
        field_x = new kh("");
        field_v = "Instructions";
        field_E = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_z = new int[8192];
        field_A = "Age:";
    }
}
