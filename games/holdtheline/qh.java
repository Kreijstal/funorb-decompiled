/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh {
    static String[] field_b;
    static String field_a;
    static String field_d;
    static String field_e;
    static String field_c;

    final static void a(int param0, int param1) {
        L0: {
          L1: {
            if (bd.field_Q == null) {
              break L1;
            } else {
              if (null != i.field_k[param1]) {
                lc.field_d = i.field_k[param1];
                gn.a(false, i.field_k[param1], (byte) 69, 30);
                break L0;
              } else {
                break L1;
              }
            }
          }
          if ((ab.field_jb ^ -1) != 0) {
            break L0;
          } else {
            bi.field_e = 2;
            ab.field_jb = param1;
            break L0;
          }
        }
        L2: {
          if (param0 == 0) {
            break L2;
          } else {
            field_a = null;
            break L2;
          }
        }
    }

    final static boolean a(byte param0, ei param1) {
        int var2 = 0;
        int var3 = HoldTheLine.field_D;
        if (param0 != -63) {
            Object var4 = null;
            boolean discarded$0 = qh.a((byte) -114, (ei) null);
        }
        for (var2 = 0; var2 < param1.field_e; var2++) {
            if (!((vj) param1.field_b[var2]).field_q) {
                return true;
            }
        }
        return false;
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 != 30) {
            return;
        }
        field_d = null;
        field_c = null;
        field_e = null;
        field_b = null;
    }

    final static fg a(int param0) {
        if (param0 < 80) {
            fg discarded$0 = qh.a(67);
        }
        return pk.field_H;
    }

    final static boolean c(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1_ref = (Object) (Object) tf.field_n;
                    // monitorenter tf.field_n
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (qd.field_i != vj.field_l) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        // monitorexit var1_ref
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        aa.field_n = p.field_a[vj.field_l];
                        pk.field_M = d.field_b[vj.field_l];
                        if (param0 < -23) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        // monitorexit var1_ref
                        stackOut_5_0 = 0;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0 != 0;
                }
                case 7: {
                    try {
                        vj.field_l = 127 & 1 + vj.field_l;
                        // monitorexit var1_ref
                        stackOut_7_0 = 1;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0 != 0;
                }
                case 9: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1_ref
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Touring Car";
        field_d = null;
        field_e = "Leaderboard";
        field_c = "Log in";
    }
}
