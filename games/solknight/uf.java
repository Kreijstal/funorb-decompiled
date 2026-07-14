/*
 * Decompiled by CFR-JS 0.4.0.
 */
class uf extends af {
    static int field_q;
    static byte[][] field_s;
    static String field_r;
    static int field_p;

    uf(mg param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_F, -1, 2147483647, false);
    }

    public final void a(byte param0, int param1, boolean param2, int param3, rc param4) {
        if (param0 < 113) {
          L0: {
            ((uf) this).a((byte) 62, -71, true, -109, (rc) null);
            if (param2) {
              pl.a(true, param4.field_x, param4.field_t, param4.field_j + param1, param3 + param4.field_m);
              break L0;
            } else {
              break L0;
            }
          }
          super.a((byte) 117, param1, param2, param3, param4);
          return;
        } else {
          L1: {
            if (param2) {
              pl.a(true, param4.field_x, param4.field_t, param4.field_j + param1, param3 + param4.field_m);
              break L1;
            } else {
              break L1;
            }
          }
          super.a((byte) 117, param1, param2, param3, param4);
          return;
        }
    }

    uf(int param0) {
        this(ua.field_G, param0);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        var9 = SolKnight.field_L ? 1 : 0;
        if (param6 >= param7) {
          if (param0 > param6) {
            qb.a(param7, param0, param5, param2, param1, param3, 48, mi.field_f, param6);
            if (param4 > -48) {
              field_r = null;
              return;
            } else {
              return;
            }
          } else {
            if (param7 >= param0) {
              qb.a(param0, param6, param3, param2, param5, param1, 95, mi.field_f, param7);
              if (param4 > -48) {
                field_r = null;
                return;
              } else {
                return;
              }
            } else {
              qb.a(param7, param6, param1, param2, param5, param3, 75, mi.field_f, param0);
              if (param4 > -48) {
                field_r = null;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (param0 <= param7) {
            if (param0 > param6) {
              qb.a(param6, param7, param1, param2, param3, param5, 38, mi.field_f, param0);
              if (param4 <= -48) {
                return;
              } else {
                field_r = null;
                return;
              }
            } else {
              qb.a(param0, param7, param5, param2, param3, param1, 73, mi.field_f, param6);
              if (param4 <= -48) {
                return;
              } else {
                field_r = null;
                return;
              }
            }
          } else {
            qb.a(param6, param0, param3, param2, param1, param5, 98, mi.field_f, param7);
            if (param4 > -48) {
              field_r = null;
              return;
            } else {
              return;
            }
          }
        }
    }

    final static ff a(int param0, byte param1) {
        ff[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        ff[] var5 = null;
        var4 = SolKnight.field_L ? 1 : 0;
        var5 = qh.a(-89);
        var2 = var5;
        if (param1 == -121) {
          var3 = 0;
          L0: while (true) {
            if (var5.length > var3) {
              if (param0 == var5[var3].field_a) {
                return var5[var3];
              } else {
                var3++;
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          field_p = 7;
          var3 = 0;
          L1: while (true) {
            if (var5.length > var3) {
              if (param0 == var5[var3].field_a) {
                return var5[var3];
              } else {
                var3++;
                continue L1;
              }
            } else {
              return null;
            }
          }
        }
    }

    final static void a(boolean param0, int param1, int param2, rl param3) {
        int var4 = 0;
        Object var5 = null;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = -123 / ((90 - param1) / 33);
                    if (null != ah.field_a) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    kd.a(param2, (byte) 101, param3, 1048576, param0);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (null != ua.field_I) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 5: {
                    var5 = (Object) (Object) kj.field_P;
                    // monitorenter kj.field_P
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    try {
                        ua.field_I.b(param2, -1, -129);
                        if (param3 == dj.field_j) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        // monitorexit var5
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return;
                }
                case 10: {
                    try {
                        ua.field_I.a((byte) 97);
                        kj.field_P.h();
                        dj.field_j = param3;
                        if (null == dj.field_j) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ua.field_I.a(param0, dj.field_j, true);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        // monitorexit var5
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return;
                }
                case 14: {
                    try {
                        var6 = caughtException;
                        // monitorexit var5
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) var6;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void e(int param0) {
        field_s = null;
        if (param0 != 22645) {
            field_r = null;
            field_r = null;
            return;
        }
        field_r = null;
    }

    final static void a(byte param0, int param1, int param2, java.awt.Canvas param3) {
        Exception exception = null;
        java.awt.Graphics var4 = null;
        Throwable decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var4 = param3.getGraphics();
                        hj.field_e.a(param2, 0, param1, var4);
                        var4.dispose();
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 2: {
                    exception = (Exception) (Object) caughtException;
                    param3.repaint();
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (param0 != 99) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 5: {
                    field_r = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void d(int param0) {
        try {
            Exception var1 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null != pj.field_D) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (param0 == 31911) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        field_q = -95;
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        te.field_N.field_m = te.field_N.field_m + 24;
                        return;
                    }
                    case 4: {
                        try {
                            pj.field_D.a(0L, (byte) 45);
                            pj.field_D.a(te.field_N.field_l, -20291, 24, te.field_N.field_m);
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        if (param0 == 31911) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        field_q = -95;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        te.field_N.field_m = te.field_N.field_m + 24;
                        return;
                    }
                    case 8: {
                        var1 = (Exception) (Object) caughtException;
                        if (param0 != 31911) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        te.field_N.field_m = te.field_N.field_m + 24;
                        return;
                    }
                    case 10: {
                        field_q = -95;
                        te.field_N.field_m = te.field_N.field_m + 24;
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(boolean param0, boolean param1) {
        if (param0) {
            return;
        }
        u.field_b.a(19550, 0, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = -1;
    }
}
