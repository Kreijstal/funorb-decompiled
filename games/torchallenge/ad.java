/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends java.awt.Canvas implements java.awt.event.FocusListener {
    static boolean field_j;
    static ge field_e;
    static int[] field_h;
    java.awt.Frame field_d;
    volatile boolean field_i;
    static int[][][] field_b;
    static boolean field_a;
    static int field_c;
    static lj field_g;
    static String field_f;

    final static void a(int param0, ka param1) {
        wb.b((byte) -91);
        int var2 = 53 % ((73 - param0) / 47);
        qg.a(param1.field_y, param1.field_q, param1.field_v);
    }

    final static nf a(lj param0, lj param1, String param2, String param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        if (param4) {
          var7 = null;
          nf discarded$2 = ad.a((lj) null, (lj) null, (String) null, (String) null, false);
          var5 = param0.a(param2, -91);
          var6 = param0.a(var5, param3, (byte) 91);
          return al.a(param0, var6, var5, param1, -127);
        } else {
          var5 = param0.a(param2, -91);
          var6 = param0.a(var5, param3, (byte) 91);
          return al.a(param0, var6, var5, param1, -127);
        }
    }

    public final void paint(java.awt.Graphics param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((ad) this).field_i = true;
    }

    final static void a(java.awt.Component param0, int param1) {
        if (param1 != 0) {
          field_b = null;
          param0.setFocusTraversalKeysEnabled(false);
          param0.addKeyListener((java.awt.event.KeyListener) (Object) hl.field_d);
          param0.addFocusListener((java.awt.event.FocusListener) (Object) hl.field_d);
          return;
        } else {
          param0.setFocusTraversalKeysEnabled(false);
          param0.addKeyListener((java.awt.event.KeyListener) (Object) hl.field_d);
          param0.addFocusListener((java.awt.event.FocusListener) (Object) hl.field_d);
          return;
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != 0) {
            return;
        }
        field_h = null;
        field_f = null;
        field_e = null;
        field_b = null;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final void a(uj param0, int param1) {
        lg.a(param0, (byte) 49, ((ad) this).field_d);
        if (param1 >= -47) {
            Object var4 = null;
            ((ad) this).focusLost((java.awt.event.FocusEvent) null);
        }
    }

    ad() {
    }

    public final void update(java.awt.Graphics param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = false;
        field_b = new int[9][2][2];
        field_h = new int[8192];
        field_c = 0;
        field_a = true;
        field_f = "Confirm Email:";
    }
}
