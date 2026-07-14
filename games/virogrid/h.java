/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h extends java.awt.Canvas implements java.awt.event.FocusListener {
    static char[] field_f;
    java.awt.Frame field_e;
    static String field_d;
    static int[] field_c;
    static String field_b;
    volatile boolean field_a;

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((h) this).field_a = true;
    }

    final static boolean a(int param0, boolean param1, CharSequence param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = Virogrid.field_F ? 1 : 0;
        if (mi.a(param0 + 5826, param1, param2)) {
          if (param0 == -4623) {
            var3 = 0;
            L0: while (true) {
              if (param2.length() > var3) {
                if (!ad.a(param2.charAt(var3), 15232)) {
                  return false;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                return true;
              }
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        if (!param0) {
          field_f = null;
          field_f = null;
          field_b = null;
          field_c = null;
          return;
        } else {
          field_f = null;
          field_b = null;
          field_c = null;
          return;
        }
    }

    final void a(int param0, pd param1) {
        ah.a((byte) 31, param1, ((h) this).field_e);
        if (param0 != 109) {
            field_f = null;
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void paint(java.awt.Graphics param0) {
    }

    h() {
    }

    public final void update(java.awt.Graphics param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_d = "You have resigned.";
        field_c = new int[]{100, 100, 100, 300, 200, 100, 100, 200, 500, 100};
        field_b = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
