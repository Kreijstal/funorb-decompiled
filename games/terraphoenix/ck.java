/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck extends java.awt.Canvas implements java.awt.event.FocusListener {
    static bm field_a;
    static String field_c;
    static int[] field_f;
    volatile boolean field_d;
    java.awt.Frame field_e;
    static int field_b;

    public final void paint(java.awt.Graphics param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final void a(he param0, int param1) {
        Object var4 = null;
        if (param1 != 4) {
          var4 = null;
          ck.a((he) null, -11, (java.awt.Frame) null);
          ck.a(param0, 103, ((ck) this).field_e);
          return;
        } else {
          ck.a(param0, 103, ((ck) this).field_e);
          return;
        }
    }

    final static void a(se param0, int param1) {
        p.field_a[rd.field_t] = param0;
        rd.field_t = rd.field_t + 1;
        if (param1 != -31661) {
            field_c = null;
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((ck) this).field_d = true;
    }

    final static java.awt.Container b(int param0) {
        if (param0 <= 112) {
            Object var2 = null;
            ck.a((he) null, 73, (java.awt.Frame) null);
            if (!(null == al.field_W)) {
                return (java.awt.Container) (Object) al.field_W;
            }
            return (java.awt.Container) (Object) dg.a(false);
        }
        if (!(null == al.field_W)) {
            return (java.awt.Container) (Object) al.field_W;
        }
        return (java.awt.Container) (Object) dg.a(false);
    }

    public static void a(int param0) {
        if (param0 != -8917) {
          field_f = null;
          field_a = null;
          field_f = null;
          field_c = null;
          return;
        } else {
          field_a = null;
          field_f = null;
          field_c = null;
          return;
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    ck() {
    }

    final static void a(he param0, int param1, java.awt.Frame param2) {
        mf var3 = null;
        int var4 = 0;
        var4 = Terraphoenix.field_V;
        L0: while (true) {
          var3 = param0.a(param2, -121);
          L1: while (true) {
            if (var3.field_d != 0) {
              if (1 == var3.field_d) {
                param2.setVisible(false);
                if (param1 <= 78) {
                  field_f = null;
                  param2.dispose();
                  return;
                } else {
                  param2.dispose();
                  return;
                }
              } else {
                gi.a((byte) -78, 100L);
                continue L0;
              }
            } else {
              gi.a((byte) -41, 10L);
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[]{1, 2, 3, 3, 2, -1, 8, 12, -1, 2, 2, 2, 13, 1, 4, 15};
        field_c = "Log in / Create account";
    }
}
