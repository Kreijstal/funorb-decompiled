/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sf extends wf {
    private float field_f;
    private int field_i;
    private int field_j;
    private int field_h;
    private int field_g;
    private int field_e;

    final static Object a(boolean param0, int param1, byte[] param2) {
        ku var3 = null;
        if (param2 != null) {
          if ((param2.length ^ -1) >= param1) {
            if (!param0) {
              return (Object) (Object) param2;
            } else {
              return (Object) (Object) fg.a(param2, (byte) 121);
            }
          } else {
            var3 = new ku();
            ((af) (Object) var3).a((byte) 56, param2);
            return (Object) (Object) var3;
          }
        } else {
          return null;
        }
    }

    final int a(int param0) {
        if (param0 <= 53) {
            float discarded$0 = ((sf) this).a(true);
            return ((sf) this).field_g;
        }
        return ((sf) this).field_g;
    }

    final static ej[] d(byte param0) {
        if (param0 < 52) {
          return (ej[]) null;
        } else {
          return new ej[]{gm.field_v, o.field_c, av.field_a, pg.field_d, qe.field_e, tb.field_g, ej.field_b, kb.field_C, op.field_b, qd.field_n, rc.field_e, ct.field_H, lc.field_b, ml.field_j};
        }
    }

    final int c(byte param0) {
        if (param0 >= -73) {
            return 71;
        }
        return ((sf) this).field_i;
    }

    final static void a(byte param0, java.applet.Applet param1, String param2) {
        try {
            Throwable throwable = null;
            String var4 = null;
            String var5 = null;
            String var6 = null;
            String var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        gt.field_r = param2;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var6 = param1.getParameter("cookieprefix");
                            var5 = var6;
                            var5 = var6;
                            var4 = param1.getParameter("cookiehost");
                            var5 = var4;
                            var5 = var4;
                            var7 = var6 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
                            var5 = var7;
                            var5 = var7;
                            if (param2.length() != 0) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var5 = var7 + "; Expires=" + bt.a(false, 94608000000L + kh.a(-125)) + "; Max-Age=" + 94608000L;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            fe.a(param1, -7012, "document.cookie=\"" + var5 + "\"");
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        throwable = caughtException;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        if (param0 > -110) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        v.a(true, param1);
                        return;
                    }
                    case 9: {
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

    final int e(int param0) {
        if (param0 != 0) {
            return 32;
        }
        return ((sf) this).field_j;
    }

    final int d(int param0) {
        if (param0 != 0) {
            ((sf) this).field_i = 76;
            return ((sf) this).field_e;
        }
        return ((sf) this).field_e;
    }

    final int a(byte param0) {
        int var2 = 104 % ((70 - param0) / 34);
        return ((sf) this).field_h;
    }

    final float a(boolean param0) {
        if (param0) {
            return -0.44879353046417236f;
        }
        return ((sf) this).field_f;
    }

    private sf() throws Throwable {
        throw new Error();
    }

    static {
    }
}
