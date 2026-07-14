/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an implements Runnable {
    volatile boolean field_c;
    volatile tb[] field_e;
    static int[] field_d;
    static int field_b;
    static gh field_a;
    static int field_h;
    pn field_j;
    static dd field_i;
    static String[] field_g;
    volatile boolean field_f;

    final static void a(int param0, boolean param1, boolean param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        var4 = 83 % ((param3 - 35) / 50);
        if (param0 != -1) {
          if ((param0 ^ -1) != 1) {
            L0: {
              if (param1) {
                qf.a(false, (byte) -117);
                break L0;
              } else {
                break L0;
              }
            }
            i.field_e[param0].r(0);
            return;
          } else {
            pb.b();
            return;
          }
        } else {
          qf.a(param2, (byte) -122);
          return;
        }
    }

    public final void run() {
        int var1_int = 0;
        Exception var1 = null;
        tb var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = SteelSentinels.field_G;
                    ((an) this).field_f = true;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((an) this).field_c) {
                            statePc = 12;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = (stateCaught_1 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var1_int = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = (stateCaught_2 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (2 <= var1_int) {
                            statePc = 11;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = (stateCaught_3 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2 = ((an) this).field_e[var1_int];
                        if (var2 != null) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = (stateCaught_4 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = (stateCaught_5 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var2.b();
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = (stateCaught_6 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var1_int++;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = (stateCaught_7 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var1_int++;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = (stateCaught_8 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var1_int++;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = (stateCaught_9 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        a.a((byte) 118, 10L);
                        le.a((Object) null, 50, ((an) this).field_j);
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = (stateCaught_11 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 12: {
                    ((an) this).field_f = false;
                    return;
                }
                case 13: {
                    try {
                        var1 = (Exception) (Object) caughtException;
                        var5 = null;
                        sj.a((String) null, -72, (Throwable) (Object) var1);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    ((an) this).field_f = false;
                    return;
                }
                case 15: {
                    try {
                        var3 = caughtException;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 16: {
                    ((an) this).field_f = false;
                    throw (RuntimeException) (Object) var3;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_i = null;
        field_g = null;
        if (param0 != -63) {
            field_h = -29;
            field_a = null;
            return;
        }
        field_a = null;
    }

    an() {
        ((an) this).field_e = new tb[2];
        ((an) this).field_c = false;
        ((an) this).field_f = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 100;
        field_h = 20;
        field_d = new int[8192];
    }
}
