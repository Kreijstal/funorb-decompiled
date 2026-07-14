/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rs {
    private boolean field_b;
    private int[] field_a;
    private int field_f;
    private int field_d;
    static tf field_c;
    static int field_g;
    static int field_h;
    static ri field_e;

    final static int a(boolean param0, String param1, int param2, String param3, int param4, int param5, String param6) {
        lj var7 = null;
        lj var8 = null;
        var7 = new lj(param1);
        if (param5 < 115) {
          return -95;
        } else {
          var8 = new lj(param3);
          return jd.a(var7, param2, var8, param4, param0, 21, param6);
        }
    }

    final int d(int param0, int param1) {
        if (param0 > ((rs) this).field_f) {
          throw new ArrayIndexOutOfBoundsException(param0);
        } else {
          if (param1 != -29816) {
            field_e = null;
            return ((rs) this).field_a[param0];
          } else {
            return ((rs) this).field_a[param0];
          }
        }
    }

    private final void a(int param0, int param1) {
        int var4 = -38 % ((-60 - param0) / 46);
        int[] var5 = new int[this.b(1, param1)];
        int[] var3 = var5;
        la.a(((rs) this).field_a, 0, var5, 0, ((rs) this).field_a.length);
        ((rs) this).field_a = var5;
    }

    final static boolean a(String param0, int param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Sumoblitz.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!wi.field_o.startsWith("win")) {
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
                            statePc = 9;
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
                        if (param0.startsWith("https://")) {
                            statePc = 9;
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
                        stackOut_7_0 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0 != 0;
                }
                case 9: {
                    try {
                        var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        if (param1 == -2528) {
                            statePc = 12;
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
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0 != 0;
                }
                case 12: {
                    try {
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
                        if (-1 == var2.indexOf((int) param0.charAt(var3))) {
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

    public static void a(int param0) {
        if (param0 != -26791) {
            return;
        }
        field_e = null;
        field_c = null;
    }

    final void a(byte param0, int param1) {
        if (param0 == 61) {
          if (param1 >= 0) {
            if (((rs) this).field_f < param1) {
              throw new ArrayIndexOutOfBoundsException(param1);
            } else {
              L0: {
                if (param1 != ((rs) this).field_f) {
                  la.a(((rs) this).field_a, 1 + param1, ((rs) this).field_a, param1, ((rs) this).field_f + -param1);
                  break L0;
                } else {
                  break L0;
                }
              }
              ((rs) this).field_f = ((rs) this).field_f - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
        } else {
          field_g = 27;
          if (param1 >= 0) {
            if (((rs) this).field_f < param1) {
              throw new ArrayIndexOutOfBoundsException(param1);
            } else {
              L1: {
                if (param1 != ((rs) this).field_f) {
                  la.a(((rs) this).field_a, 1 + param1, ((rs) this).field_a, param1, ((rs) this).field_f + -param1);
                  break L1;
                } else {
                  break L1;
                }
              }
              ((rs) this).field_f = ((rs) this).field_f - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
        }
    }

    private rs() throws Throwable {
        throw new Error();
    }

    private final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != 1) {
          var5 = null;
          int discarded$1 = rs.a(false, (String) null, 93, (String) null, -122, -38, (String) null);
          var3 = ((rs) this).field_a.length;
          L0: while (true) {
            if (var3 > param1) {
              return var3;
            } else {
              if (!((rs) this).field_b) {
                var3 = var3 + ((rs) this).field_d;
                continue L0;
              } else {
                if (0 == var3) {
                  var3 = 1;
                  continue L0;
                } else {
                  var3 = var3 * ((rs) this).field_d;
                  continue L0;
                }
              }
            }
          }
        } else {
          var3 = ((rs) this).field_a.length;
          L1: while (true) {
            if (var3 > param1) {
              return var3;
            } else {
              if (!((rs) this).field_b) {
                var3 = var3 + ((rs) this).field_d;
                continue L1;
              } else {
                if (0 == var3) {
                  var3 = 1;
                  continue L1;
                } else {
                  var3 = var3 * ((rs) this).field_d;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void c(int param0, int param1) {
        this.a(param1, 1 + ((rs) this).field_f, false);
        int var3 = 29 % ((-83 - param0) / 33);
    }

    private final void a(int param0, int param1, boolean param2) {
        if (!param2) {
          if (param1 > ((rs) this).field_f) {
            L0: {
              ((rs) this).field_f = param1;
              if (param1 >= ((rs) this).field_a.length) {
                this.a(99, param1);
                break L0;
              } else {
                break L0;
              }
            }
            ((rs) this).field_a[param1] = param0;
            return;
          } else {
            L1: {
              if (param1 >= ((rs) this).field_a.length) {
                this.a(99, param1);
                break L1;
              } else {
                break L1;
              }
            }
            ((rs) this).field_a[param1] = param0;
            return;
          }
        } else {
          field_e = null;
          if (param1 <= ((rs) this).field_f) {
            L2: {
              if (param1 >= ((rs) this).field_a.length) {
                this.a(99, param1);
                break L2;
              } else {
                break L2;
              }
            }
            ((rs) this).field_a[param1] = param0;
            return;
          } else {
            L3: {
              ((rs) this).field_f = param1;
              if (param1 >= ((rs) this).field_a.length) {
                this.a(99, param1);
                break L3;
              } else {
                break L3;
              }
            }
            ((rs) this).field_a[param1] = param0;
            return;
          }
        }
    }

    final int a(byte param0) {
        if (param0 <= 28) {
            return 121;
        }
        return 1 + ((rs) this).field_f;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new tf();
        field_g = 2;
        field_h = 4;
    }
}
