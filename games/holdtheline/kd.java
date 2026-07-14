/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int field_c;
    static java.awt.Canvas field_b;
    static String field_a;
    static boolean field_d;

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(ic.field_d == null)) {
            u.field_R = 0;
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (null != ic.field_d) {
            uf.field_a = 0;
            in.field_f = param0.getX();
            g.field_m = param0.getY();
            sd.field_a = true;
        }
    }

    final static boolean a(int param0, byte[] param1, int param2, byte[] param3, int param4, int param5) {
        int var6 = 0;
        int var7 = HoldTheLine.field_D;
        for (var6 = 0; var6 < param5; var6++) {
            if (param1[var6 + param2] != param3[var6 + param4]) {
                return false;
            }
        }
        if (param0 != 1643) {
            field_d = true;
            return true;
        }
        return true;
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (param0.isPopupTrigger()) {
            param0.consume();
        }
    }

    final static void b(byte param0) {
        if (param0 != -54) {
            Object var2 = null;
            kd.a((java.applet.Applet) null, true);
        }
        if (!(mn.field_a)) {
            throw new IllegalStateException();
        }
        bn.field_j = true;
        ol.a(false, (byte) 71);
        bk.field_w = 0;
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (!(null == ic.field_d)) {
            uf.field_a = 0;
            in.field_f = param0.getX();
            g.field_m = param0.getY();
            sd.field_a = true;
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (null != ic.field_d) {
            uf.field_a = 0;
            in.field_f = param0.getX();
            g.field_m = param0.getY();
            sd.field_a = true;
        }
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        try {
            java.net.URL var2 = null;
            try {
                if (!param1) {
                    field_c = -65;
                }
                var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
                param0.getAppletContext().showDocument(ah.a(var2, param0, (byte) 92), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null != ic.field_d) {
            uf.field_a = 0;
            im.field_e = param0.getX();
            nl.field_f = param0.getY();
            if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
                mi.field_a = 1;
                u.field_R = 1;
            } else {
                mi.field_a = 2;
                u.field_R = 2;
            }
            var2 = param0.getModifiers();
            if ((var2 & 4) == 0) {
            }
            if ((var2 & 16) != -1) {
            }
            if (-1 == (var2 & 8)) {
            }
            sd.field_a = true;
        }
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        if (param0 >= -121) {
            field_b = null;
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (!(null == ic.field_d)) {
            uf.field_a = 0;
            u.field_R = 0;
            sd.field_a = true;
            var2 = param0.getModifiers();
            if (-1 == (var2 & 16)) {
            }
            if (-1 != (var2 & 4)) {
            }
            if (0 != (8 & var2)) {
            }
        }
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (!(ic.field_d == null)) {
            uf.field_a = 0;
            in.field_f = -1;
            g.field_m = -1;
            sd.field_a = true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Names cannot contain consecutive spaces";
    }
}
