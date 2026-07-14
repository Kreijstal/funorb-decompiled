/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl extends lg implements sv, ft {
    cj field_g;
    static hd field_f;
    static int field_d;
    static kg[] field_e;

    final static void a(boolean param0, hd param1) {
        hd var2 = null;
        int var3 = 0;
        hd var4 = null;
        hd var5 = null;
        hd var5_ref = null;
        var3 = Kickabout.field_G;
        var4 = (hd) (Object) param1.field_jb.g(24009);
        var2 = var4;
        L0: while (true) {
          if (var4 == null) {
            if (!param0) {
              field_e = null;
              param1.field_J = 0;
              param1.field_mb = 0;
              param1.field_L = 0;
              param1.field_v = 0;
              return;
            } else {
              param1.field_J = 0;
              param1.field_mb = 0;
              param1.field_L = 0;
              param1.field_v = 0;
              return;
            }
          } else {
            var4.field_J = 0;
            var4.field_mb = 0;
            var4.field_L = 0;
            var4.field_v = 0;
            var5 = (hd) (Object) param1.field_jb.c(33);
            var5_ref = var5;
            continue L0;
          }
        }
    }

    public final void a(int param0, ga param1) {
        int var3 = -20 % ((8 - param0) / 47);
    }

    final String e(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        String stackOut_3_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var2_int = ((hl) this).field_g.l(92);
                        var3 = ((hl) this).field_g.h((byte) 48);
                        var4 = ((hl) this).field_g.m(param0);
                        var5 = th.b((byte) 113);
                        if ((var4 ^ -1) > -1891) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (var4 > var5 - 3) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = vo.a((byte) -18, sb.field_e, new String[2]);
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0;
                }
                case 5: {
                    try {
                        if (!cl.a(true, var4, var2_int, var3)) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return null;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var2 = (NumberFormatException) (Object) caughtException;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    return rr.field_c;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void f(int param0) {
        field_f = null;
        field_e = null;
        if (param0 != -3) {
            field_f = null;
        }
    }

    public hl() {
    }

    final rv a(boolean param0) {
        int var2_int = ((hl) this).field_g.l(94);
        int var3 = ((hl) this).field_g.h((byte) 48);
        int var4 = ((hl) this).field_g.m(-1);
        int var5 = th.b((byte) 108);
        if (!((var4 ^ -1) <= -1891)) {
            return jt.field_Bb;
        }
        if (var5 + -3 < var4) {
            return jt.field_Bb;
        }
        if (!(cl.a(!param0 ? true : false, var4, var2_int, var3))) {
            return jt.field_Bb;
        }
        try {
            if (false) throw (NumberFormatException) null;
            // ifeq L114
            ((hl) this).field_g = null;
        } catch (NumberFormatException numberFormatException) {
            return jt.field_Bb;
        }
        return he.field_yb;
    }

    public final boolean a(byte param0) {
        if (param0 != -28) {
            boolean discarded$0 = ((hl) this).a((byte) 110);
            return ((hl) this).field_g.b(true);
        }
        return ((hl) this).field_g.b(true);
    }

    public final void a(byte param0, ga param1) {
        ((hl) this).a(113);
        if (param0 <= 65) {
            field_d = 37;
        }
    }

    static {
    }
}
