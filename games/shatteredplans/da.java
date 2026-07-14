/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class da implements gk {
    static pb field_e;
    static String field_a;
    private long field_b;
    private static long[] field_h;
    static int field_g;
    static String field_c;
    static int[] field_d;
    static String field_f;

    abstract u a(boolean param0);

    final static boolean a(int param0, String param1) {
        if (param0 != -30106) {
            return false;
        }
        return hb.a((byte) -90, param1) != null ? true : false;
    }

    public final String a(byte param0) {
        if (param0 != -63) {
            Object var3 = null;
            da.a((java.awt.Component) null, (qb) null, (h) null, -88, true, -43, 7, true);
        }
        if (((da) this).a(16647)) {
            return null;
        }
        if ((pr.a(14274) ^ -1L) > (((da) this).field_b - -350L ^ -1L)) {
            return null;
        }
        return ((da) this).c((byte) 125);
    }

    final static gm a(int param0, al param1) {
        gm var2 = new gm(param1, (oh) (Object) param1);
        eo.field_ab.a((byte) -113, (oh) (Object) var2);
        if (param0 > -121) {
            return null;
        }
        jp.field_Bb.a((tn) (Object) param1);
        return var2;
    }

    public static void b(byte param0) {
        field_e = null;
        field_d = null;
        field_c = null;
        if (param0 != -37) {
            return;
        }
        field_h = null;
        field_a = null;
        field_f = null;
    }

    public final void b(int param0) {
        ((da) this).field_b = pr.a(14274);
        int var2 = -57 / ((param0 - -1) / 58);
    }

    public final u c(int param0) {
        if (!(!((da) this).a(16647))) {
            return un.field_i;
        }
        int var2 = -29 / ((-80 - param0) / 35);
        if (!(((da) this).field_b - -350L <= pr.a(14274))) {
            return pd.field_h;
        }
        return ((da) this).a(false);
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                            param1.getAppletContext().showDocument(jg.a(param1, false, var2), "_top");
                            if (param0 == 1) {
                                statePc = 4;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            field_a = null;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        var2_ref = (Exception) (Object) caughtException;
                        var2_ref.printStackTrace();
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
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

    final static void a(java.awt.Component param0, qb param1, h param2, int param3, boolean param4, int param5, int param6, boolean param7) {
        ap.a(param5, param7, 10);
        aj.field_e = ap.a(param1, param0, 0, param6);
        if (param4) {
            Object var9 = null;
            da.a(-84, (java.applet.Applet) null);
        }
        hg.field_q = ap.a(param1, param0, 1, param3);
        jp.field_Bb = new vk();
        kl.field_t = param3;
        hg.field_q.a((tn) (Object) jp.field_Bb);
        u.field_b = param2;
        u.field_b.a(wm.field_b, 0);
        aj.field_e.a((tn) (Object) u.field_b);
    }

    abstract String c(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_h = new long[256];
        field_a = "<%highlight>FLEET RESIZING</col> - Once you have chosen a destination system for a move, you may <%highlight>increase or decrease</col> the number of <%glossary>fleets</col> you are sending there. This can be done via the <%highlight>tip of the arrow</col> at the destination system. Simply <%key>click</col> on the <%highlight>'+' button</col> by the arrowhead to increase how many fleets you are sending, or on the <%highlight>'-' button</col> to decrease it. Clicking the <%highlight>'X' button</col> will cancel the order completely.";
        var2 = 0;
        L0: while (true) {
          if ((var2 ^ -1) <= -257) {
            field_c = "Suggested names: ";
            field_d = new int[4];
            field_f = "Click to replay animation.";
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (var3 >= 8) {
                field_h[var2] = var0;
                var2++;
                continue L0;
              } else {
                if ((var0 & 1L ^ -1L) == -2L) {
                  var0 = -3932672073523589310L ^ var0 >>> 212923649;
                  var3++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
