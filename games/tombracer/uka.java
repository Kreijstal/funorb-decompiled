/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uka extends ra {
    static jea field_M;

    final boolean C(int param0) {
        if (param0 != 1760) {
            field_M = null;
            return true;
        }
        return true;
    }

    final static void b(int param0, int param1, boolean param2) {
        mu var3 = null;
        lja var4 = null;
        String var5_ref = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        if (param1 >= -76) {
          L0: {
            var7 = null;
            iu[] discarded$1 = uka.a((cn) null, (String) null, -33, (String) null);
            var3 = vna.a(param2, param0, -117);
            if (var3 == null) {
              break L0;
            } else {
              hka.field_b.a((byte) -22, false);
              var4 = hka.field_b;
              var5_ref = ai.field_d;
              var4.field_f.a((byte) -101, 5, var5_ref);
              var4 = hka.field_b;
              var5 = jm.field_m;
              var6 = lba.field_p;
              var4.field_f.b(var6, 0, -100, 0, var5);
              break L0;
            }
          }
          iea.a(param2, (byte) -56, param0);
          return;
        } else {
          L1: {
            var3 = vna.a(param2, param0, -117);
            if (var3 == null) {
              break L1;
            } else {
              hka.field_b.a((byte) -22, false);
              var4 = hka.field_b;
              var5_ref = ai.field_d;
              var4.field_f.a((byte) -101, 5, var5_ref);
              var4 = hka.field_b;
              var5 = jm.field_m;
              var6 = lba.field_p;
              var4.field_f.b(var6, 0, -100, 0, var5);
              break L1;
            }
          }
          iea.a(param2, (byte) -56, param0);
          return;
        }
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
    }

    final static iu[] a(cn param0, String param1, int param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param0.b(param1, -7768);
        if (param2 != 5) {
          field_M = null;
          var5 = param0.a(true, param3, var4);
          return rj.a(param0, var5, var4, (byte) -82);
        } else {
          var5 = param0.a(true, param3, var4);
          return rj.a(param0, var5, var4, (byte) -82);
        }
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            field_M = null;
            return true;
        }
        return true;
    }

    final static void s(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) wna.field_n;
                    // monitorenter wna.field_n
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == -44) {
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
                        uka.t((byte) 73);
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
                        tu.field_h = tu.field_h + 1;
                        ksa.field_p = tka.field_n;
                        jba.field_j = ena.field_n;
                        sta.field_B = ee.field_a;
                        qma.field_c = lja.field_c;
                        lja.field_c = false;
                        hf.field_b = at.field_X;
                        jm.field_m = cr.field_d;
                        lba.field_p = ria.field_m;
                        at.field_X = 0;
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

    final fsa a(boolean param0, int param1, la param2) {
        fsa var11 = new fsa(param2, param0);
        var11.b((byte) -11, ((uka) this).field_k, ((uka) this).field_l);
        var11.h(param1, 0);
        var11.a(3, (byte) -12, true);
        var11.a((byte) -3, 10);
        var11.b((byte) 17, false);
        var11.g(108, 2);
        var11.l(2, 146366800);
        fra var5 = new fra(param2, param0);
        up var6 = new up(0, 10);
        var6.b(1, 14);
        var5.a(true, var6);
        var11.a((byte) 83, (nv) (Object) var5);
        eq var7 = new eq(param2, param0);
        var11.a((byte) 83, (nv) (Object) var7);
        ro var8 = ((uka) this).a((byte) -30, param2, param0);
        var11.a((wda) (Object) var8, 0);
        mfa var9 = rm.field_a;
        fu var10 = (fu) (Object) var9.a(8, param1 ^ 76);
        var10.a(false, 0);
        var11.a((gr) (Object) var5, (byte) 124, (dg) (Object) var10);
        return var11;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            field_M = null;
            return false;
        }
        return false;
    }

    public static void t(byte param0) {
        if (param0 <= 60) {
            field_M = null;
            field_M = null;
            return;
        }
        field_M = null;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            field_M = null;
            return false;
        }
        return false;
    }

    uka(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    uka(la param0, int param1) {
        super(param0, param1);
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            return true;
        }
        return false;
    }

    final int t(int param0) {
        if (param0 != 8) {
            uka.s((byte) -23);
            return 7;
        }
        return 7;
    }

    final void q(byte param0) {
        super.q(param0);
        ((uka) this).b(-110, 4194304, 4194304);
    }

    final boolean A(int param0) {
        int var2 = -18 / ((param0 - 0) / 60);
        return true;
    }

    static {
    }
}
