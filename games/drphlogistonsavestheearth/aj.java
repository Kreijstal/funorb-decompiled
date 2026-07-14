/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int[] field_b;
    static boolean field_e;
    static int[] field_a;
    static boolean field_c;
    static String field_f;
    static int field_d;

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (pj.field_G != null) {
            th.field_e = 0;
            tf.field_mb = 0;
            lk.field_j = true;
            var2 = param0.getModifiers();
            if ((16 & var2) == 0) {
            }
            if (0 == (var2 & 4)) {
            }
            if ((var2 & 8) != 0) {
            }
        }
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        wj.g(param1, param2, 1 + param0, 10000536);
        wj.g(param1, param2 - -param3, param0 + 1, 12105912);
        int var5 = 1;
        if (param2 + var5 < wj.field_e) {
            var5 = wj.field_e + -param2;
        }
        int var6 = param3;
        if (param4 <= 42) {
            return;
        }
        if (!(wj.field_j >= param2 - -var6)) {
            var6 = wj.field_j + -param2;
        }
        for (var7 = var5; var7 < var6; var7++) {
            var8 = 152 - -(48 * var7 / param3);
            var9 = var8 << -388233040 | var8 << -1421415576 | var8;
            wj.field_l[wj.field_k * (param2 - -var7) - -param1] = var9;
            wj.field_l[wj.field_k * (var7 + param2) - (-param1 - param0)] = var9;
        }
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            Throwable var3 = null;
            String var4 = null;
            String var5 = null;
            String var6 = null;
            String var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        ih.field_J = param2;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var6 = param0.getParameter("cookieprefix");
                            var5 = var6;
                            var5 = var6;
                            var4 = param0.getParameter("cookiehost");
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
                            statePc = 7;
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
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var5 = var7 + "; Expires=" + bf.a(la.a(false) - -94608000000L, (byte) -29) + "; Max-Age=" + 94608000L;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            pb.a(true, "document.cookie=\"" + var5 + "\"", param0);
                            if (param1 > 6) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            aj.a(true);
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        var3 = caughtException;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        ti.a((byte) -101, param0);
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

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (!(null == pj.field_G)) {
            th.field_e = 0;
            e.field_q = param0.getX();
            mj.field_u = param0.getY();
            lk.field_j = true;
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (!(pj.field_G == null)) {
            th.field_e = 0;
            e.field_q = param0.getX();
            mj.field_u = param0.getY();
            lk.field_j = true;
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (pj.field_G != null) {
            th.field_e = 0;
            e.field_q = param0.getX();
            mj.field_u = param0.getY();
            lk.field_j = true;
        }
    }

    final static void a(boolean param0) {
        ek var1_ref = null;
        ek var1 = (ek) (Object) tg.field_g.a((byte) -114);
        if (var1 == null) {
            var1_ref = new ek();
        }
        var1_ref.a(wj.field_j, wj.field_l, wj.field_b, wj.field_c, (byte) 69, wj.field_k, wj.field_g, wj.field_e);
        hl.field_c.a((gi) (Object) var1_ref, 255);
        if (!param0) {
            field_f = null;
            return;
        }
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = -42 % ((-14 - param0) / 46);
        field_b = null;
        field_f = null;
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(pj.field_G == null)) {
            tf.field_mb = 0;
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (param0.isPopupTrigger()) {
            param0.consume();
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (null != pj.field_G) {
            th.field_e = 0;
            e.field_q = -1;
            mj.field_u = -1;
            lk.field_j = true;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null == pj.field_G) {
            if (!(!param0.isPopupTrigger())) {
                param0.consume();
            }
            return;
        }
        th.field_e = 0;
        ee.field_d = param0.getX();
        fj.field_j = param0.getY();
        if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
            f.field_h = 1;
            tf.field_mb = 1;
            var2 = param0.getModifiers();
            lk.field_j = true;
            if (0 == (16 & var2)) {
            }
            if ((4 & var2) == -1) {
            }
            if (-1 == (8 & var2)) {
            }
            if (!(!param0.isPopupTrigger())) {
                param0.consume();
            }
            return;
        }
        f.field_h = 2;
        tf.field_mb = 2;
        var2 = param0.getModifiers();
        lk.field_j = true;
        if (0 == (16 & var2)) {
        }
        if ((4 & var2) == -1) {
        }
        if (-1 == (8 & var2)) {
        }
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    final static void a(nh param0, byte param1) {
        aj.a(true);
        wj.a(param0.field_B, param0.field_z, param0.field_C);
        if (param1 < 46) {
            field_d = -91;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
        field_f = "Mouse-over icons to select level";
        field_d = 0;
    }
}
