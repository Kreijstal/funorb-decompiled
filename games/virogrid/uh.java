/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh {
    static String field_g;
    static String field_d;
    private boolean field_f;
    static int field_b;
    static eh field_e;
    private String field_a;
    static int field_c;

    final boolean a(int param0) {
        if (param0 != 0) {
            ((uh) this).field_a = null;
            return ((uh) this).field_f;
        }
        return ((uh) this).field_f;
    }

    final String b(int param0) {
        int var2 = -63 / ((param0 - -89) / 34);
        return ((uh) this).field_a;
    }

    final static String a(String param0, String param1, String param2, int param3, eh param4) {
        if (param3 != -1) {
            field_d = null;
            if (!(param4.c(0))) {
                return param2;
            }
            return param1 + " - " + param4.a(param0, 95) + "%";
        }
        if (!(param4.c(0))) {
            return param2;
        }
        return param1 + " - " + param4.a(param0, 95) + "%";
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        if (-12 != (j.field_l ^ -1)) {
          if (param0 < 29) {
            return;
          } else {
            sm.a(j.field_i, true, j.field_g, ne.field_g);
            td.a(-30179, param1, 0, 0);
            return;
          }
        } else {
          rl.b((byte) 29);
          if (param0 < 29) {
            return;
          } else {
            sm.a(j.field_i, true, j.field_g, ne.field_g);
            td.a(-30179, param1, 0, 0);
            return;
          }
        }
    }

    uh(String param0, boolean param1) {
        ((uh) this).field_a = param0;
        if (((uh) this).field_a == null) {
            ((uh) this).field_a = "";
        }
        ((uh) this).field_f = param1 ? true : false;
        if (((uh) this).field_a.length() == 0) {
            ((uh) this).field_f = false;
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        param0.setFocusTraversalKeysEnabled(false);
        if (param1 <= 94) {
          field_e = null;
          param0.addKeyListener((java.awt.event.KeyListener) (Object) w.field_L);
          param0.addFocusListener((java.awt.event.FocusListener) (Object) w.field_L);
          return;
        } else {
          param0.addKeyListener((java.awt.event.KeyListener) (Object) w.field_L);
          param0.addFocusListener((java.awt.event.FocusListener) (Object) w.field_L);
          return;
        }
    }

    uh(String param0) {
        this(param0, false);
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    public static void a(boolean param0) {
        field_g = null;
        if (param0) {
            field_d = null;
            field_d = null;
            field_e = null;
            return;
        }
        field_d = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Searching for opponents";
        field_g = "Login: ";
        field_c = -1;
    }
}
