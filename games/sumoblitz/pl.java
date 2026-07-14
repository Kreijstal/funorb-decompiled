/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl extends fs {
    static int field_u;
    static String field_s;
    private int field_w;
    static String[] field_r;
    static jn field_v;
    private ok field_t;
    static int field_y;
    static String field_x;
    static String field_q;

    final void g(int param0, int param1) {
        ((pl) this).field_p = ((pl) this).field_p + 1;
        ((pl) this).field_n[((pl) this).field_p] = (byte)(param0 + ((pl) this).field_t.a(jg.a(param1, 264)));
        if (param1 != 8) {
            ((pl) this).i((byte) 39);
        }
    }

    pl(byte[] param0) {
        super(param0);
    }

    final int b(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var3 = ((pl) this).field_w >> 1570203171;
        var4 = 8 - (7 & ((pl) this).field_w);
        if (param1 >= -85) {
          return 116;
        } else {
          var5 = 0;
          ((pl) this).field_w = ((pl) this).field_w + param0;
          L0: while (true) {
            if (var4 >= param0) {
              L1: {
                if (var4 != param0) {
                  var5 = var5 + (((pl) this).field_n[var3] >> var4 - param0 & am.field_z[param0]);
                  break L1;
                } else {
                  var5 = var5 + (am.field_z[var4] & ((pl) this).field_n[var3]);
                  break L1;
                }
              }
              return var5;
            } else {
              var3++;
              var5 = var5 + ((((pl) this).field_n[var3] & am.field_z[var4]) << param0 + -var4);
              param0 = param0 - var4;
              var4 = 8;
              continue L0;
            }
          }
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = Sumoblitz.field_L ? 1 : 0;
        for (var5 = param1; param3 > var5; var5++) {
            ((pl) this).field_p = ((pl) this).field_p + 1;
            param0[var5 - -param2] = (byte)(((pl) this).field_n[((pl) this).field_p] + -((pl) this).field_t.a(256));
        }
    }

    final void i(byte param0) {
        int var2 = -18 / ((-28 - param0) / 59);
        ((pl) this).field_w = 8 * ((pl) this).field_p;
    }

    final void h(byte param0) {
        if (param0 != -63) {
            return;
        }
        ((pl) this).field_p = (((pl) this).field_w + 7) / 8;
    }

    final static void a(java.awt.Component param0, int param1) {
        Object var3 = null;
        if (param1 != 7) {
          var3 = null;
          pl.a((java.awt.Component) null, 93);
          param0.removeMouseListener((java.awt.event.MouseListener) (Object) wk.field_h);
          param0.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) wk.field_h);
          param0.removeFocusListener((java.awt.event.FocusListener) (Object) wk.field_h);
          b.field_a = 0;
          return;
        } else {
          param0.removeMouseListener((java.awt.event.MouseListener) (Object) wk.field_h);
          param0.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) wk.field_h);
          param0.removeFocusListener((java.awt.event.FocusListener) (Object) wk.field_h);
          b.field_a = 0;
          return;
        }
    }

    final void a(byte param0, int[] param1) {
        ((pl) this).field_t = new ok(param1);
        int var3 = 41 % ((param0 - 21) / 39);
    }

    public static void j(int param0) {
        field_s = null;
        if (param0 != 24599) {
          field_y = 91;
          field_q = null;
          field_x = null;
          field_v = null;
          field_r = null;
          return;
        } else {
          field_q = null;
          field_x = null;
          field_v = null;
          field_r = null;
          return;
        }
    }

    pl(int param0) {
        super(param0);
    }

    final int i(int param0) {
        if (param0 != 255) {
          ((pl) this).field_w = 51;
          ((pl) this).field_p = ((pl) this).field_p + 1;
          return ((pl) this).field_n[((pl) this).field_p] - ((pl) this).field_t.a(256) & 255;
        } else {
          ((pl) this).field_p = ((pl) this).field_p + 1;
          return ((pl) this).field_n[((pl) this).field_p] - ((pl) this).field_t.a(256) & 255;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_s = "Change display name";
        field_v = new jn();
        field_x = "level: ";
        field_q = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
