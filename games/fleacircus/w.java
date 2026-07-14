/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class w {
    static wd field_e;
    bf field_o;
    static String field_i;
    static int field_a;
    static int field_l;
    static String field_j;
    static int field_r;
    bf field_q;
    bf field_n;
    bf field_h;
    int field_k;
    long field_m;
    ni field_d;
    ni field_f;
    byte field_g;
    volatile int field_b;
    volatile int field_c;
    fk field_p;

    abstract boolean b(byte param0);

    abstract void d(int param0);

    final static void a(int param0, String param1) {
        if (param0 != 61) {
            Object var3 = null;
            w.a(86, (String) null);
        }
    }

    final boolean a(int param0) {
        int var2 = -6 / ((-53 - param0) / 34);
        return -21 >= (((w) this).f(1) ^ -1) ? true : false;
    }

    abstract void a(byte param0);

    public static void c(int param0) {
        field_i = null;
        int var1 = 114 / ((param0 - -33) / 34);
        field_e = null;
        field_j = null;
    }

    abstract void a(Object param0, boolean param1, byte param2);

    final static dd[] a(int param0, int param1, int param2, rh param3) {
        int var4 = 0;
        var4 = -54 % ((36 - param0) / 55);
        if (!ha.a(param3, -32180, param2, param1)) {
          return null;
        } else {
          return fc.b(-128);
        }
    }

    final fk a(int param0, boolean param1, int param2, int param3, byte param4) {
        long var6 = 0L;
        fk var8 = null;
        fk stackIn_1_0 = null;
        fk stackIn_2_0 = null;
        fk stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        fk stackOut_0_0 = null;
        fk stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        fk stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var6 = (long)param2 + ((long)param3 << 2049519136);
          var8 = new fk();
          stackOut_0_0 = (fk) var8;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param1) {
            stackOut_2_0 = (fk) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (fk) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        stackIn_3_0.field_v = stackIn_3_1 != 0;
        var8.field_E = param4;
        var8.field_j = var6;
        if (param0 > 126) {
          if (!param1) {
            if ((((w) this).e(-83) ^ -1) <= -21) {
              throw new RuntimeException();
            } else {
              ((w) this).field_n.a((pa) (Object) var8, -1089421886);
              return var8;
            }
          } else {
            if (-21 < (((w) this).f(1) ^ -1)) {
              ((w) this).field_o.a((pa) (Object) var8, -1089421886);
              return var8;
            } else {
              throw new RuntimeException();
            }
          }
        } else {
          field_a = 47;
          if (!param1) {
            if ((((w) this).e(-83) ^ -1) <= -21) {
              throw new RuntimeException();
            } else {
              ((w) this).field_n.a((pa) (Object) var8, -1089421886);
              return var8;
            }
          } else {
            if (-21 < (((w) this).f(1) ^ -1)) {
              ((w) this).field_o.a((pa) (Object) var8, -1089421886);
              return var8;
            } else {
              throw new RuntimeException();
            }
          }
        }
    }

    final int e(int param0) {
        if (param0 > -52) {
          ((w) this).field_d = null;
          return ((w) this).field_n.a((byte) 67) - -((w) this).field_h.a((byte) 20);
        } else {
          return ((w) this).field_n.a((byte) 67) - -((w) this).field_h.a((byte) 20);
        }
    }

    final boolean b(int param0) {
        int var2 = -126 % ((73 - param0) / 37);
        return (((w) this).e(-88) ^ -1) <= -21 ? true : false;
    }

    final static String a(int param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_6_0 = null;
            String stackOut_5_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = fleas.field_A ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var9 = param1.getParameter("cookieprefix");
                            var3 = var9 + "settings";
                            var4 = (String) eb.a("getcookies", param1, param0 + -250);
                            var5 = m.a(';', 122, var4);
                            var6 = param0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (var5.length <= var6) {
                                statePc = 10;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var7 = var5[var6].indexOf('=');
                            if (var7 < 0) {
                                statePc = 7;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (!var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
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
                            stackOut_5_0 = var5[var6].substring(1 + var7).trim();
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
                        return stackIn_6_0;
                    }
                    case 7: {
                        try {
                            var6++;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        var2 = caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (lj.field_g != null) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        return param1.getParameter("settings");
                    }
                    case 12: {
                        return lj.field_g;
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

    final int f(int param0) {
        if (param0 != 1) {
          ((w) this).field_g = (byte) 23;
          return ((w) this).field_o.a((byte) 5) + ((w) this).field_q.a((byte) 9);
        } else {
          return ((w) this).field_o.a((byte) 5) + ((w) this).field_q.a((byte) 9);
        }
    }

    w() {
        ((w) this).field_o = new bf();
        ((w) this).field_q = new bf();
        ((w) this).field_n = new bf();
        ((w) this).field_h = new bf();
        ((w) this).field_d = new ni(6);
        ((w) this).field_c = 0;
        ((w) this).field_g = (byte) 0;
        ((w) this).field_b = 0;
        ((w) this).field_f = new ni(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new wd();
        field_i = "<%0>Trapdoor:<%1> if a flea stands on one of these, it opens and the flea falls through.";
        field_j = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
