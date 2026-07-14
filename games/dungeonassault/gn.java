/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    private String field_j;
    String field_f;
    String field_b;
    static cn[] field_i;
    static int field_d;
    int field_a;
    private String field_e;
    int field_g;
    static int field_h;
    static cn field_c;

    final static void a(byte param0, java.awt.Component param1) {
        param1.removeMouseListener((java.awt.event.MouseListener) (Object) ib.field_f);
        param1.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) ib.field_f);
        param1.removeFocusListener((java.awt.event.FocusListener) (Object) ib.field_f);
        int var2 = -90 % ((69 - param0) / 55);
        ua.field_a = 0;
    }

    public static void a(int param0) {
        if (param0 != 194) {
            gn.a(3);
            field_i = null;
            field_c = null;
            return;
        }
        field_i = null;
        field_c = null;
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        ((gn) this).field_b = rf.field_K.a(((gn) this).field_e, (byte) -48);
        ((gn) this).field_f = rf.field_K.a(((gn) this).field_j, (byte) -48);
        var2 = oj.a(((gn) this).field_f, -1, new int[1], (se) (Object) la.field_b);
        ((gn) this).field_a = 10 + la.field_b.field_H * var2;
        if (param0 <= -68) {
          if (null != ((gn) this).field_b) {
            L0: {
              if (null == ((gn) this).field_b) {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                stackOut_11_0 = oj.a(((gn) this).field_b, -1, new int[1], (se) (Object) ne.field_c);
                stackIn_13_0 = stackOut_11_0;
                break L0;
              }
            }
            var3 = stackIn_13_0;
            ((gn) this).field_g = var3 * ne.field_c.field_H;
            ((gn) this).field_a = ((gn) this).field_a + (ne.field_c.field_H * var3 + 10);
            return;
          } else {
            ((gn) this).field_g = 0;
            return;
          }
        } else {
          var4 = null;
          gn.a((byte) 33, (java.awt.Component) null);
          if (null != ((gn) this).field_b) {
            L1: {
              if (null == ((gn) this).field_b) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = oj.a(((gn) this).field_b, -1, new int[1], (se) (Object) ne.field_c);
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            var3 = stackIn_6_0;
            ((gn) this).field_g = var3 * ne.field_c.field_H;
            ((gn) this).field_a = ((gn) this).field_a + (ne.field_c.field_H * var3 + 10);
            return;
          } else {
            ((gn) this).field_g = 0;
            return;
          }
        }
    }

    gn(String param0, String param1) {
        ((gn) this).field_j = param1;
        ((gn) this).field_e = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 32;
    }
}
