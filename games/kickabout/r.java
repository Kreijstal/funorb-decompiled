/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r {
    static String field_e;
    static String[] field_a;
    static kd field_d;
    static String[] field_b;
    static hd field_c;

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param1 == param0) {
          var2 = ng.field_a;
        }
        if (param1 == 1) {
          var2 = q.field_b;
        }
        if (2 == param1) {
          var2 = fc.field_a;
        }
        return var2;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(boolean param0) {
        fd.h(0);
        if (null != ic.field_d) {
          hm.a(-120, ic.field_d);
        }
        gs.d(98);
        vp.c(-107);
        if (!param0) {
          field_b = (String[]) null;
        }
        ba.b((byte) 44);
        if (cr.b(0)) {
          or.field_d.b(1, (byte) -106);
          c.a(0, false);
        }
        lr.b((byte) -116);
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_a = null;
        field_c = null;
        if (param0 < -17) {
          field_e = null;
          return;
        }
        r.a(-21, -111);
        field_e = null;
    }

    final boolean a(byte param0) {
        if (param0 >= -26) {
          this.a((byte) -81);
          if (this == gr.field_c) {
            return true;
          }
          if (this != bm.field_H) {
            return jn.field_rb == this ? true : false;
          }
          return true;
        }
        if (this == gr.field_c) {
          return true;
        }
        if (this == bm.field_H) {
          return true;
        }
        if (jn.field_rb != this) {
          return false;
        }
        return true;
    }

    static {
        field_a = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_e = "<%0> has resigned and left the game.";
        field_b = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
