/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    static n field_e;
    oa field_d;
    static int field_c;
    static jp field_b;
    static mh[] field_a;
    static int[] field_f;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        if (param2 < 75) {
          return;
        } else {
          var6 = 24;
          var7 = 5;
          ((vj) this).field_d.a(var7, param1, param0, var6, param4, param3, 75);
          sj.field_d.a(np.field_a, 0, 0, rg.field_c.field_Ib, (byte) 64);
          gk.field_c.a(18, 2 + np.field_a, 0, -82 + (rg.field_c.field_Ib - ec.field_J - 2), (byte) 64);
          qj.field_u.a(18, 2 + np.field_a, -2 + (-ec.field_J + (rg.field_c.field_Ib + -80)), 82 + ec.field_J, (byte) 64);
          gf.field_f.a(true, 2, rg.field_c.field_Ib, 0, 20 + (np.field_a - -2), ec.field_J, 20, -2 + (-np.field_a + rg.field_c.field_cb) + -20);
          f.field_c.a(20, -779, ec.field_J, 2);
          return;
        }
    }

    public static void a(boolean param0) {
        Object var2 = null;
        field_e = null;
        if (!param0) {
          var2 = null;
          vj.a(true, 99, (byte) -104, (vm) null);
          field_f = null;
          field_a = null;
          field_b = null;
          return;
        } else {
          field_f = null;
          field_a = null;
          field_b = null;
          return;
        }
    }

    final static void a(boolean param0, int param1, byte param2, vm param3) {
        int var4 = 0;
        Object var5 = null;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = -2 / ((41 - param2) / 40);
                    if (null != dc.field_e) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    ul.a(1048576, param3, param1, param0, -104);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (null == m.field_f) {
                        statePc = 14;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var5 = (Object) (Object) eo.field_f;
                    // monitorenter eo.field_f
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        m.field_f.e(param1, -1, 16);
                        if (param3 != fo.field_a) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        // monitorexit var5
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    try {
                        m.field_f.f(-24774);
                        eo.field_f.b();
                        fo.field_a = param3;
                        if (null == fo.field_a) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        m.field_f.a(fo.field_a, 127, param0);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        // monitorexit var5
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return;
                }
                case 12: {
                    try {
                        var6 = caughtException;
                        // monitorexit var5
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) var6;
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    vj(String param0, mh param1) {
        String[] var3 = new String[]{param0, e.field_j, pl.field_e};
        mh[] var4 = new mh[]{param1, rg.field_c, (mh) (Object) f.field_c};
        ((vj) this).field_d = new oa(0L, eh.field_n, var3, hd.field_c, var4, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new n();
        field_f = new int[]{14, 14, 14, 14, 14, 14, 14};
    }
}
