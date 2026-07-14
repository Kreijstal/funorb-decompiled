/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl extends o {
    nl[] field_u;
    static int field_n;
    static String field_k;
    int field_t;
    int[] field_v;
    nl[] field_w;
    static boolean field_j;
    static int field_p;
    int[] field_o;
    int[] field_q;
    byte[][][] field_r;
    int field_l;
    static int field_x;
    static String field_s;
    static um field_m;

    final static ci c(byte param0) {
        if (param0 != 70) {
            return null;
        }
        return fg.field_d.field_Fb;
    }

    final static void a(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) bj.field_cb;
                    // monitorenter bj.field_cb
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        wh.field_f = nd.field_l;
                        qf.field_a = qf.field_a + 1;
                        hn.field_k = o.field_b;
                        if (param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        fl.b(true);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        rf.field_b = cb.field_b;
                        lf.field_O = rc.field_d;
                        rc.field_d = false;
                        th.field_d = bl.field_g;
                        re.field_m = ub.field_b;
                        ag.field_f = pd.field_Eb;
                        bl.field_g = 0;
                        // monitorexit var1
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) var2;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(boolean param0) {
        field_s = null;
        field_m = null;
        field_k = null;
        if (!param0) {
            field_s = null;
        }
    }

    final static boolean a(int[] param0, long param1, int param2, String param3, byte param4) {
        di var6 = null;
        Object var7 = null;
        CharSequence var8 = null;
        CharSequence var9 = null;
        if (!ph.a(param2, (byte) -43, param3, param1, param0)) {
          return false;
        } else {
          L0: {
            if (1 != param2) {
              break L0;
            } else {
              param2 = 0;
              break L0;
            }
          }
          if (param4 <= 99) {
            var7 = null;
            boolean discarded$1 = fl.a((int[]) null, -126L, 111, (String) null, (byte) 60);
            vk.field_g = param2;
            ij.field_c = param3;
            var8 = (CharSequence) (Object) param3;
            ec.field_f = ad.a(var8, -2);
            re.field_p = param1;
            var6 = dn.a(va.field_d, param0, vj.field_g, wk.field_c, 13911);
            pg.a((byte) -18, var6);
            return true;
          } else {
            vk.field_g = param2;
            ij.field_c = param3;
            var9 = (CharSequence) (Object) param3;
            ec.field_f = ad.a(var9, -2);
            re.field_p = param1;
            var6 = dn.a(va.field_d, param0, vj.field_g, wk.field_c, 13911);
            pg.a((byte) -18, var6);
            return true;
          }
        }
    }

    fl() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Start Game";
        field_j = true;
        field_x = 0;
        field_s = "Solicitation";
    }
}
