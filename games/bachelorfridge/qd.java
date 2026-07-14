/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd extends pv {
    static String field_l;
    static float field_q;
    static String field_k;
    private double field_j;
    static String field_n;
    private int field_o;
    private int field_m;
    static String field_p;

    private final void c(int param0) {
        if (param0 >= -116) {
          return;
        } else {
          ((qd) this).field_f.field_n = ((qd) this).field_f.c((byte) -125);
          ((qd) this).field_f.field_k = ((qd) this).field_f.b(true);
          return;
        }
    }

    public static void c(byte param0) {
        field_k = null;
        if (param0 < 31) {
            return;
        }
        field_p = null;
        field_l = null;
        field_n = null;
    }

    final boolean b(boolean param0) {
        int stackIn_10_0 = 0;
        Object stackIn_10_1 = null;
        int stackIn_11_0 = 0;
        Object stackIn_11_1 = null;
        int stackIn_12_0 = 0;
        Object stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        int stackOut_9_0 = 0;
        Object stackOut_9_1 = null;
        int stackOut_11_0 = 0;
        Object stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        int stackOut_10_0 = 0;
        Object stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        ((qd) this).field_g = ((qd) this).field_g + 1;
        if (((qd) this).field_g + 1 <= this.c(false)) {
          if (((qd) this).field_m != 0) {
            L0: {
              if (1 == ((qd) this).field_g) {
                ((qd) this).field_f.field_l = ((qd) this).field_f.field_l + (int)((double)((qd) this).field_m / 39.0);
                ((qd) this).field_f.field_v.a((byte) 55, ((qd) this).field_f.field_g.field_o.field_b, 2);
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (-19 < (((qd) this).field_g ^ -1)) {
                break L1;
              } else {
                L2: {
                  stackOut_9_0 = ((qd) this).field_g;
                  stackOut_9_1 = this;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  if (param0) {
                    stackOut_11_0 = stackIn_11_0;
                    stackOut_11_1 = this;
                    stackOut_11_2 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    break L2;
                  } else {
                    stackOut_10_0 = stackIn_10_0;
                    stackOut_10_1 = this;
                    stackOut_10_2 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    stackIn_12_2 = stackOut_10_2;
                    break L2;
                  }
                }
                if (stackIn_12_0 <= this.c(stackIn_12_2 != 0) - 25) {
                  ((qd) this).field_f.field_k = this.b(-102);
                  break L1;
                } else {
                  if (!param0) {
                    field_p = null;
                    return false;
                  } else {
                    return false;
                  }
                }
              }
            }
            if (!param0) {
              field_p = null;
              return false;
            } else {
              return false;
            }
          } else {
            this.c(-123);
            return true;
          }
        } else {
          this.c(-123);
          return true;
        }
    }

    private final int c(boolean param0) {
        if (param0) {
            return -126;
        }
        return 40 * Math.abs(((qd) this).field_m) / 39;
    }

    private final int b(int param0) {
        if (param0 > -101) {
          int discarded$2 = this.c(true);
          return (int)((double)(((qd) this).field_g - 18) * ((qd) this).field_j) - -((qd) this).field_o;
        } else {
          return (int)((double)(((qd) this).field_g - 18) * ((qd) this).field_j) - -((qd) this).field_o;
        }
    }

    final static boolean a(String param0, int param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!ht.field_i.startsWith("win")) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        if (param0.startsWith("http://")) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (!param0.startsWith("https://")) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return stackIn_9_0 != 0;
                }
                case 10: {
                    try {
                        if (param1 < -119) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        qd.c((byte) -22);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        var3 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (param0.length() <= var3) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (0 == (var2.indexOf((int) param0.charAt(var3)) ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return stackIn_17_0 != 0;
                }
                case 18: {
                    try {
                        var3++;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                        stackOut_19_0 = 1;
                        stackIn_20_0 = stackOut_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return stackIn_20_0 != 0;
                }
                case 21: {
                    var2_ref = (Exception) (Object) caughtException;
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    qd(jfa param0, int param1) {
        ((qd) this).field_f = param0;
        ((qd) this).field_m = param1;
        ((qd) this).field_o = ((qd) this).field_f.field_k;
        ((qd) this).field_j = (double)((qd) this).field_m / (-43.0 + (double)this.c(false));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Add to Cart";
        field_k = "Shortcut Reference";
        field_p = "This is your RuneScape clan if you have one.";
        field_n = "Error connecting to server. Please try using a different server.";
    }
}
