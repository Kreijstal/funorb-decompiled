/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vm {
    static int field_b;
    static int field_c;
    static int[] field_a;

    final static void a(java.awt.Component param0) {
        try {
            param0.setFocusTraversalKeysEnabled(false);
            param0.addKeyListener((java.awt.event.KeyListener) (Object) kb.field_a);
            param0.addFocusListener((java.awt.event.FocusListener) (Object) kb.field_a);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "vm.A(" + (param0 != null ? "{...}" : "null") + ',' + 11631 + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (!pe.field_r) {
          if (pm.field_a) {
            return cf.a(31077, 13, 15);
          } else {
            if (mp.a(15, 13, 19297)) {
              return true;
            } else {
              if (hj.field_b) {
                return false;
              } else {
                return gf.a(13, 12, 69);
              }
            }
          }
        } else {
          return lq.field_a.a(-88, de.field_f, ji.field_r);
        }
    }

    public static void a() {
        field_a = null;
    }

    static {
    }
}
