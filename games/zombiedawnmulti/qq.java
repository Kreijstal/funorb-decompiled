/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qq {
    static cj field_b;
    static cj field_c;
    static boolean field_h;
    private int[] field_e;
    static String field_g;
    static String field_d;
    static int field_a;
    static cj field_f;

    qq(int[] param0) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 1;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var2_int > param0.length - -(param0.length >> -723639551)) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2_int = var2_int << 1;
                        if (var5 != 0) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var5 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.field_e = new int[var2_int + var2_int];
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var3 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var3 >= var2_int + var2_int) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.field_e[var3] = -1;
                        var3++;
                        if (var5 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var5 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var3 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param0.length <= var3) {
                            statePc = 25;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var5 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        return;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var4 = param0[var3] & -1 + var2_int;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (0 == (this.field_e[var4 + var4 + 1] ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var4 = var4 - -1 & var2_int - 1;
                        if (var5 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var5 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.field_e[var4 + var4] = param0[var3];
                        this.field_e[var4 + (var4 - -1)] = var3;
                        var3++;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var5 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_23_0 = (RuntimeException) (var2);
                    stackIn_22_0 = stackIn_23_0;
                    stackIn_23_1 = new StringBuilder().append("qq.<init>(");
                    stackIn_22_1 = stackIn_23_1;
                    if (param0 == null) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_24_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_24_2 = "{...}";
                    statePc = 24;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_24_2 = "null";
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    throw fa.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
                }
                case 25: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != 21) {
            return;
        }
        field_c = null;
        field_g = null;
        field_f = null;
        field_b = null;
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 == 1481485697) {
          var3 = (this.field_e.length >> 1481485697) + -1;
          var4 = var3 & param1;
          L0: while (true) {
            L1: {
              var5 = this.field_e[1 + (var4 + var4)];
              if (-1 != var5) {
                stackIn_14_0 = param1 ^ -1;
                break L1;
              } else {
                stackIn_14_0 = -1;

                if (var6 != 0) {
                  break L1;
                } else {
                  return stackIn_14_0;
                }
              }
            }
            if (stackIn_14_0 != (this.field_e[var4 - -var4] ^ -1)) {
              var4 = 1 + var4 & var3;
              continue L0;
            } else {
              return var5;
            }
          }
        } else {
          qq.b(81, 106);
          var3 = (this.field_e.length >> 1481485697) + -1;
          var4 = var3 & param1;
          L2: while (true) {
            L3: {
              var5 = this.field_e[1 + (var4 + var4)];
              if (-1 != var5) {
                stackIn_6_0 = param1 ^ -1;
                break L3;
              } else {
                stackIn_6_0 = -1;

                if (var6 != 0) {
                  break L3;
                } else {
                  return stackIn_6_0;
                }
              }
            }
            if (stackIn_6_0 != (this.field_e[var4 - -var4] ^ -1)) {
              var4 = 1 + var4 & var3;
              continue L2;
            } else {
              return var5;
            }
          }
        }
    }

    final static uj b(int param0, int param1) {
        wj var2;
        if (df.field_H) {
          if (4 <= jp.field_c.a(param0 ^ param0)) {
            return null;
          } else {
            var2 = new wj(param1);
            jp.field_c.a(var2, false);
            return var2.field_m;
          }
        } else {
          return null;
        }
    }

    static {
        field_g = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_h = false;
        field_d = "Close";
    }
}
