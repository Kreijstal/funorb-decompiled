/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    private ad field_c;
    static ib field_b;
    private je field_a;
    private ad field_d;
    static int[] field_e;

    public static void a(int param0) {
        if (param0 != -18728) {
            field_b = (ib) null;
            field_b = null;
            field_e = null;
            return;
        }
        field_b = null;
        field_e = null;
    }

    final static void a(String[] args, boolean param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (nf.field_F == null) {
                break L1;
              } else {
                nf.field_F.field_G.a(args, 560186724);
                break L1;
              }
            }
            L2: {
              if (param1) {
                break L2;
              } else {
                field_b = (ib) null;
                break L2;
              }
            }
            if (sc.field_f == null) {
              break L0;
            } else {
              sc.field_f.field_H.a(args, 560186724);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("wh.D(");

            if (args == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final pi a(int param0, int param1) {
        pi var3;
        byte[] var4;
        var3 = (pi) (this.field_a.a((long)param0, (byte) 114));
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            L1: {
              if (param1 < (param0 ^ -1)) {
                break L1;
              } else {
                var4 = this.field_c.b(255, 32767 & param0, 1);
                if (!MonkeyPuzzle2.field_F) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var4 = this.field_d.b(255, param0, 1);
            break L0;
          }
          L2: {
            var3 = new pi();
            if (var4 != null) {
              var3.a(new gk(var4), true);
              break L2;
            } else {
              break L2;
            }
          }
          if (param0 >= 32768) {
            var3.e(0);
            this.field_a.a((long)param0, var3, -92);
            return var3;
          } else {
            this.field_a.a((long)param0, var3, -92);
            return var3;
          }
        }
    }

    final static void a(byte param0, le param1) {
        int incrementValue$0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (-1 == (3 & (param1.field_j | param1.field_k) ^ -1)) {
                            statePc = 13;
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
                        var2_int = 4 + -(3 & param1.field_k);
                        var3 = -(3 & param1.field_j) + 4;
                        var4 = var2_int + param1.field_k;
                        var5 = new int[var4 * (param1.field_j - -var3)];
                        var6 = var3 * var4 - -var2_int;
                        var7 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (param1.field_j <= var7) {
                            statePc = 12;
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
                        stackIn_14_0 = 0;
                        stackIn_5_0 = stackIn_14_0;
                        if (var9 != 0) {
                            statePc = 14;
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
                        var8 = stackIn_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param1.field_k <= var8) {
                            statePc = 10;
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
                        incrementValue$0 = var6;
                        var6++;
                        var5[incrementValue$0] = param1.field_s[var7 * param1.field_k - -var8];
                        var8++;
                        if (var9 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var9 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6 = var6 + var2_int;
                        var7++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var9 == 0) {
                            statePc = 3;
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
                        param1.field_k = param1.field_k + var2_int;
                        param1.field_j = param1.field_j + var3;
                        param1.field_q = param1.field_q - var3;
                        param1.field_r = param1.field_r - var2_int;
                        param1.field_s = var5;
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
                        stackIn_14_0 = param0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (stackIn_14_0 < -66) {
                            statePc = 21;
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
                        wh.a(-77);
                        return;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_19_0 = (RuntimeException) (var2);
                    stackIn_18_0 = stackIn_19_0;
                    stackIn_19_1 = new StringBuilder().append("wh.C(").append(param0).append(',');
                    stackIn_18_1 = stackIn_19_1;
                    if (param1 == null) {
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
                    throw la.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
                }
                case 21: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private wh() throws Throwable {
        throw new Error();
    }

    static {
        field_b = new ib();
    }
}
