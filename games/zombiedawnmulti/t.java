/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class t {
    static String[] field_f;
    static int field_e;
    static String field_b;
    static int field_d;
    static String field_a;
    static String[] field_c;

    abstract byte[] a(int param0);

    final static void a(ul param0, ul param1, int param2, boolean param3) {
        en.a(cm.field_b, m.field_B, (fm) (Object) jj.field_L, qc.field_u, vo.field_m, ra.field_j, param3, td.field_f, 16736511, up.field_g, rb.field_d, nq.field_v);
        wp.field_j = pb.a("lobby", param1, param2 ^ -256, "chatfilter");
        vg.field_h[2] = hj.field_h;
        vg.field_h[1] = of.field_p;
        vg.field_h[param2] = dp.field_a;
        ap.a(param0, (byte) -37, (fm) (Object) fd.field_G);
    }

    final static int b(int param0) {
        int var1 = -9 / ((param0 - -67) / 57);
        return em.field_cb;
    }

    public static void a(byte param0) {
        field_a = null;
        field_f = null;
        field_c = null;
        field_b = null;
        int var1 = -70 % ((param0 - 50) / 35);
    }

    final static void a(boolean param0, int param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var4 = param2.getGraphics();
                        dl.field_h.a(param1, var4, 2, param3);
                        var4.dispose();
                        if (!param0) {
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
                        return;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    var4_ref = (Exception) (Object) caughtException;
                    param2.repaint();
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    abstract void a(byte[] param0, byte param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_a = "Chat is currently disabled.";
        field_b = "FULL ACCESS";
    }
}
