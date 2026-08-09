/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj extends t {
    static java.math.BigInteger field_F;
    static k field_E;
    int field_C;
    static boolean field_J;
    int field_H;
    int field_I;
    static ad field_B;
    int field_K;
    int field_G;
    int field_D;

    final boolean a(int param0, int param1, int param2, int param3, we param4, int param5, int param6) {
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        return false;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var8_int = param1 - this.field_I - (this.field_r + param6);
                        var9 = -param0 + (-this.field_e - this.field_C) + param5;
                        if (this.field_G * this.field_G <= var9 * var9 + var8_int * var8_int) {
                            statePc = 15;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var10 = Math.atan2((double)var9, (double)var8_int) - rl.field_b;
                        if (var10 < 0.0) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var10 <= 0.0) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var10 = var10 + 3.141592653589793 / (double)this.field_K;
                        if (var12 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var10 = var10 - 3.141592653589793 / (double)this.field_K;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_D = (int)(var10 * (double)this.field_K / 6.283185307179586);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (this.field_K > this.field_D) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.field_D = this.field_D - this.field_K;
                        if (var12 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var12 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (this.field_D >= 0) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.field_D = this.field_D + this.field_K;
                        if (var12 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackIn_16_0 = 1;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0 != 0;
                }
                case 17: {
                    var8 = (RuntimeException) ((Object) caughtException);
                    stackIn_19_0 = (RuntimeException) (var8);
                    stackIn_18_0 = stackIn_19_0;
                    stackIn_19_1 = new StringBuilder().append("fj.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                    stackIn_18_1 = stackIn_19_1;
                    if (param4 == null) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_20_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_20_2 = "{...}";
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_20_2 = "null";
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    throw la.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param5 + ',' + param6 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(String[] args, String param1, int param2, int param3) {
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                ch.field_d = f.field_i;
                if (255 != param3) {
                  break L2;
                } else {
                  L3: {
                    stackIn_4_0 = -89;

                    if ((dd.field_d ^ -1) <= -14) {
                      stackIn_5_0 = stackIn_4_0;
                      stackIn_5_1 = 0;
                      break L3;
                    } else {
                      stackIn_5_0 = stackIn_4_0;
                      stackIn_5_1 = 1;
                      break L3;
                    }
                  }
                  cg.field_a = hj.a((byte) stackIn_5_0, stackIn_5_1 != 0);
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (100 > param3) {
                cg.field_a = lh.a(true, param1, param3);
                break L1;
              } else {
                if (-106 > (param3 ^ -1)) {
                  cg.field_a = lh.a(true, param1, param3);
                  break L1;
                } else {
                  cg.field_a = jj.a(args, true);
                  if (var5 == 0) {
                    break L1;
                  } else {
                    cg.field_a = lh.a(true, param1, param3);
                    break L1;
                  }
                }
              }
            }
            if (param2 == -27967) {
              break L0;
            } else {
              field_F = (java.math.BigInteger) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var4);

            stackIn_18_1 = new StringBuilder().append("fj.A(");

            if (args == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private fj() throws Throwable {
        throw new Error();
    }

    public static void c(byte param0) {
        String var2;
        field_E = null;
        if (param0 != 62) {
          var2 = (String) null;
          fj.a((String[]) null, (String) null, -117, 1);
          field_B = null;
          field_F = null;
          return;
        } else {
          field_B = null;
          field_F = null;
          return;
        }
    }

    static {
        field_F = new java.math.BigInteger("65537");
    }
}
