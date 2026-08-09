/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    static sl field_h;
    static hj[] field_d;
    static int field_e;
    static String field_g;
    static String field_c;
    static ki field_b;
    static long field_a;
    static String field_f;

    public static void a(byte param0) {
        field_g = null;
        field_b = null;
        field_h = null;
        if (param0 != 29) {
          am.b(-56);
          field_f = null;
          field_c = null;
          field_d = null;
          return;
        } else {
          field_f = null;
          field_c = null;
          field_d = null;
          return;
        }
    }

    final static void a(int param0) {
        if (param0 == -4062) {
          if (null == cd.field_w) {
            if (null != wf.field_b) {
              wf.field_b.c();
              return;
            } else {
              return;
            }
          } else {
            cd.field_w.c();
            if (null != wf.field_b) {
              wf.field_b.c();
              return;
            } else {
              return;
            }
          }
        } else {
          am.a(-120);
          if (null != cd.field_w) {
            cd.field_w.c();
            if (null == wf.field_b) {
              return;
            } else {
              wf.field_b.c();
              return;
            }
          } else {
            if (null != wf.field_b) {
              wf.field_b.c();
              return;
            } else {
              return;
            }
          }
        }
    }

    final static String b(int param0) {
        int var1;
        if (qc.field_g != mg.field_m) {
          if (tg.field_c == mg.field_m) {
            return pg.field_a;
          } else {
            if (!bd.field_u.a(false)) {
              return pg.field_a;
            } else {
              var1 = 8 % ((55 - param0) / 40);
              return vh.field_k;
            }
          }
        } else {
          return bh.field_e;
        }
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        Object var2 = null;
        ha var3 = null;
        int var4 = 0;
        ha stackIn_4_0 = null;
        Object stackIn_6_0 = null;
        ha stackOut_3_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 6 % ((param1 - 15) / 33);
                        var3 = (ha) ((Object) oa.field_d.b((byte) -111));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var3 == null) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        tl.a(-128, var3, param0);
                        stackOut_3_0 = (ha) ((Object) oa.field_d.d(853));
                        stackIn_6_0 = stackOut_3_0;
                        stackIn_4_0 = stackOut_3_0;
                        if (var4 != 0) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var3 = stackIn_4_0;
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackIn_6_0 = mj.field_m.b((byte) -123);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var2 = stackIn_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var2 == null) {
                            statePc = 14;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        tg.a(-126, param0);
                        var2 = mj.field_m.d(853);
                        if (var4 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        return;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var4 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        return;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var2 = caughtException;
                    throw dd.a((Throwable) (var2), "am.C(" + param0 + ',' + param1 + ')');
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_g = "CHAIN SHOT";
        field_c = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_f = "This password is part of your Player Name, and would be easy to guess";
    }
}
