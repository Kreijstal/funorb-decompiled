/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pp extends java.awt.Canvas implements java.awt.event.FocusListener {
    volatile boolean field_b;
    static String[] field_e;
    static vh field_f;
    java.awt.Frame field_d;
    static int field_a;
    static boolean field_c;

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        ph.b(5 + param0, 7 + param3, 157, param4);
        ph.b(162 + param0, 8 + param3, 2, param4);
        ph.a(param0 - -163, 9 + param3, 2, param4);
        ph.b(4 + param0, param3 - -11, 159, param4);
        ph.a(3 + param0, 9 + param3, 2, param4);
        ph.b(param0 + 4, 8 + param3, 1, param4);
        if (param1 > -124) {
          field_f = null;
          ph.b(param0 + 5, param3 + 8, 157, param2);
          ph.b(param0 - -4, 9 + param3, 159, param2);
          ph.b(4 + param0, 10 + param3, 159, param2);
          return;
        } else {
          ph.b(param0 + 5, param3 + 8, 157, param2);
          ph.b(param0 - -4, 9 + param3, 159, param2);
          ph.b(4 + param0, 10 + param3, 159, param2);
          return;
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        ((pp) this).field_b = true;
    }

    public final void paint(java.awt.Graphics param0) {
    }

    final void a(vh param0, int param1) {
        ka.a(-119, ((pp) this).field_d, param0);
        if (param1 != 159) {
            Object var4 = null;
            ((pp) this).focusGained((java.awt.event.FocusEvent) null);
        }
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4 = 0;
        L0: {
          var4 = 0;
          if (param1) {
            var4 += 4;
            break L0;
          } else {
            break L0;
          }
        }
        if (param2 == 2) {
          if (!param0) {
            if (param3) {
              var4++;
              return qa.field_m[var4];
            } else {
              return qa.field_m[var4];
            }
          } else {
            var4 += 2;
            if (param3) {
              var4++;
              return qa.field_m[var4];
            } else {
              return qa.field_m[var4];
            }
          }
        } else {
          field_a = -28;
          if (param0) {
            var4 += 2;
            if (!param3) {
              return qa.field_m[var4];
            } else {
              var4++;
              return qa.field_m[var4];
            }
          } else {
            if (param3) {
              var4++;
              return qa.field_m[var4];
            } else {
              return qa.field_m[var4];
            }
          }
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    public static void a(int param0) {
        field_f = null;
        field_e = null;
        if (param0 != 4) {
            field_c = false;
        }
    }

    pp() {
    }

    final static void a(boolean param0) {
        if (param0) {
            pp.a(false);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_c = true;
    }
}
