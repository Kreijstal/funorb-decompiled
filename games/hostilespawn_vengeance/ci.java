/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static bd field_k;
    static bd field_b;
    static bd[] field_e;
    static bd field_l;
    static int[] field_a;
    static ub field_d;
    static bd field_g;
    static String[] field_i;
    static String field_c;
    static bd field_j;
    static String field_f;
    static ub field_h;

    final static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        dc.a((byte) -100);
        g.a((byte) -128, 4);
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        if (!(null == jc.field_b)) {
            sg.field_o = 0;
            lc.field_d = param0.getX();
            cm.field_b = param0.getY();
            rg.field_e = true;
        }
    }

    final static int a(int param0, CharSequence param1) {
        int var4 = 0;
        int var5 = HostileSpawn.field_I ? 1 : 0;
        int var2 = param1.length();
        int var3 = 0;
        for (var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 928035333) + (-var3 + nl.a(false, param1.charAt(var4)));
        }
        if (param0 >= -30) {
            ci.b(99);
        }
        return var3;
    }

    final static bd a(String param0, int param1, String param2, gb param3) {
        int var4 = param3.a((byte) -2, param0);
        int var5 = -39 % ((76 - param1) / 32);
        int var6 = param3.a(var4, param2, -1);
        return jc.a(param3, 65, var6, var4);
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (jc.field_b != null) {
            sg.field_o = 0;
            rf.field_o = param0.getX();
            pa.field_l = param0.getY();
            if (javax.swing.SwingUtilities.isRightMouseButton(param0)) {
                dc.field_d = 2;
                mk.field_I = 2;
            } else {
                dc.field_d = 1;
                mk.field_I = 1;
            }
            var2 = param0.getModifiers();
            if (-1 != (var2 & 16 ^ -1)) {
                cg.field_d = cg.field_d | 1;
            }
            if (0 != (var2 & 8)) {
                cg.field_d = cg.field_d | 2;
            }
            if (!((4 & var2) == 0)) {
                cg.field_d = cg.field_d | 4;
            }
            rg.field_e = true;
        }
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        if (!(jc.field_b == null)) {
            sg.field_o = 0;
            lc.field_d = param0.getX();
            cm.field_b = param0.getY();
            rg.field_e = true;
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        if (!(jc.field_b == null)) {
            sg.field_o = 0;
            lc.field_d = -1;
            cm.field_b = -1;
            rg.field_e = true;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        if (!(jc.field_b == null)) {
            mk.field_I = 0;
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        if (dl.field_l) {
            return;
        }
        if (param1 < 39) {
            return;
        }
        eh.field_g = eh.field_g - param0;
        if (!((le.field_gb ^ -1) < -1)) {
            var2 = (int)(15.0 * Math.random());
            eh.field_c.a(fg.field_b[1 + var2], (int)(30.0 * Math.random()) + 85, 2 * uh.field_i);
            le.field_gb = 50 + (int)(50.0 * Math.random());
        }
        if ((lg.field_f ^ -1) > -26) {
            lg.field_f = 25;
        }
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        if (!(!param0.isPopupTrigger())) {
            param0.consume();
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        if (!(jc.field_b == null)) {
            sg.field_o = 0;
            lc.field_d = param0.getX();
            cm.field_b = param0.getY();
            rg.field_e = true;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static void a(int param0, int param1, hm param2) {
        en var5 = s.field_b;
        var5.i(param1 ^ 19317, param0);
        var5.field_i = var5.field_i + 1;
        int var4 = var5.field_i;
        if (param1 != 2) {
            ci.b(-16);
        }
        var5.d(114, 1);
        var5.d(94, param2.field_m);
        var5.d(param1 ^ 96, param2.field_p);
        var5.b(param2.field_i, param1 + 25249);
        var5.b(param2.field_k, 25251);
        var5.b(param2.field_h, 25251);
        var5.b(param2.field_j, 25251);
        int discarded$0 = var5.f(var4, -84);
        var5.a(var5.field_i - var4, param1 + -19722);
    }

    public static void b(int param0) {
        field_e = null;
        field_i = null;
        field_l = null;
        field_k = null;
        field_d = null;
        field_h = null;
        field_g = null;
        field_f = null;
        field_a = null;
        field_c = null;
        field_j = null;
        field_b = null;
        if (param0 >= -1) {
            ci.a(-124);
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2 = 0;
        if (null != jc.field_b) {
            sg.field_o = 0;
            mk.field_I = 0;
            rg.field_e = true;
            var2 = param0.getModifiers();
            if (!((var2 & 16) == 0)) {
                cg.field_d = cg.field_d & -2;
            }
            if ((var2 & 8) != 0) {
                cg.field_d = cg.field_d & -3;
            }
            if (!(0 == (var2 & 4))) {
                cg.field_d = cg.field_d & -5;
            }
        }
        if (param0.isPopupTrigger()) {
            param0.consume();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[]{0, 0};
        field_e = new bd[25];
        field_i = new String[]{"Explore new levels", "Continue the story", "Kill more aliens"};
        field_c = "Service unavailable";
        field_d = new ub();
        field_f = "Loading levels";
        field_h = new ub();
    }
}
