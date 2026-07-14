/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah extends java.awt.Canvas {
    static we field_b;
    private java.awt.Component field_c;
    static float field_a;

    public static void a(int param0) {
        field_b = null;
        if (param0 != -23431) {
            java.awt.Container discarded$0 = ah.b(53);
        }
    }

    final static void a(int param0, int param1, byte param2, java.awt.Canvas param3) {
        java.awt.Graphics var4 = null;
        if (param2 < 88) {
            return;
        }
        try {
            var4 = param3.getGraphics();
            ri.field_k.a(-32299, param0, var4, param1);
            var4.dispose();
        } catch (Exception exception) {
            param3.repaint();
        }
    }

    public final void update(java.awt.Graphics param0) {
        ((ah) this).field_c.update(param0);
    }

    final static java.awt.Container b(int param0) {
        if (!(aj.field_t == null)) {
            return (java.awt.Container) (Object) aj.field_t;
        }
        if (param0 != -18253) {
            return null;
        }
        return (java.awt.Container) (Object) ha.b(109);
    }

    ah(java.awt.Component param0) {
        ((ah) this).field_c = param0;
    }

    public final void paint(java.awt.Graphics param0) {
        ((ah) this).field_c.paint(param0);
    }

    static {
    }
}
