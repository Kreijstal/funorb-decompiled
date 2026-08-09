/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static String field_d;
    private int[] field_a;
    static ak field_e;
    static boolean field_f;
    static dd field_b;
    static char[][] field_c;

    final static void a(boolean param0, boolean param1, String param2, int param3) {
        fh.a(-55);
        if (param3 != -22175) {
            return;
        }
        try {
            nb.field_a.i(param3 ^ 22250);
            lg.field_b = new ul(aa.field_s, (String) null, jg.field_d, param1, param0);
            ak.field_a = new ui(nb.field_a, lg.field_b);
            nb.field_a.b(ak.field_a, (byte) -35);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "fl.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(byte param0, rh param1) {
        hk var2 = null;
        try {
            if (param0 < 90) {
                rh var3 = (rh) null;
                fl.a((byte) 103, (rh) null);
            }
            hk.b(param1.a(0, "", "headers.packvorbis"));
            var2 = hk.a(param1, "jagex logo2.packvorbis", "");
            var2.b();
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "fl.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_c = (char[][]) null;
        field_b = null;
        if (param0 != 26113) {
            return;
        }
        field_d = null;
    }

    final int a(int param0, byte param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        var6 = fleas.field_A ? 1 : 0;
        var3 = (this.field_a.length >> -491016159) - 1;
        if (param1 > 114) {
          var4 = param0 & var3;
          L0: while (true) {
            L1: {
              var5 = this.field_a[1 + var4 + var4];
              if ((var5 ^ -1) != 0) {
                stackIn_15_0 = param0;
                break L1;
              } else {
                stackIn_15_0 = -1;

                if (var6 != 0) {
                  break L1;
                } else {
                  return stackIn_15_0;
                }
              }
            }
            if (stackIn_15_0 == this.field_a[var4 + var4]) {
              return var5;
            } else {
              var4 = var3 & 1 + var4;
              continue L0;
            }
          }
        } else {
          this.a(82, (byte) 96);
          var4 = param0 & var3;
          L2: while (true) {
            L3: {
              var5 = this.field_a[1 + var4 + var4];
              if ((var5 ^ -1) != 0) {
                stackIn_6_0 = param0;
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
            if (stackIn_6_0 == this.field_a[var4 + var4]) {
              return var5;
            } else {
              var4 = var3 & 1 + var4;
              continue L2;
            }
          }
        }
    }

    fl(int[] param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = fleas.field_A ? 1 : 0;
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
                        if (var2_int > (param0.length >> 1430897505) + param0.length) {
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
                        this.field_a = new int[var2_int + var2_int];
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
                        this.field_a[var3] = -1;
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
                        if (var3 >= param0.length) {
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
                        if ((this.field_a[1 + (var4 + var4)] ^ -1) == 0) {
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
                        var4 = 1 + var4 & -1 + var2_int;
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
                        this.field_a[var4 + var4] = param0[var3];
                        this.field_a[var4 + var4 - -1] = var3;
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
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_23_0 = (RuntimeException) (runtimeException);
                    stackIn_22_0 = stackIn_23_0;
                    stackIn_23_1 = new StringBuilder().append("fl.<init>(");
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
                    throw pf.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
                }
                case 25: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_d = "<%0>The entrance:<%1> the fleas will fall from the bottom of this after a short delay at the start of each level.";
        field_e = new ak();
        field_f = true;
        field_c = new char[40][21];
    }
}
