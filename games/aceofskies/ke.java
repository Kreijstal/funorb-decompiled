/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    static String[] field_c;
    static int field_b;
    static rb field_a;

    final static void a(int param0, String param1) {
        fb.field_b = param1;
        if (param0 != -1) {
            field_a = (rb) null;
        }
    }

    final static void a(int param0, rk param1, java.awt.Frame param2) {
        en var3 = null;
        int var4 = 0;
        java.awt.Frame var5 = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        L0: while (true) {
          var3 = param1.a(param2, param0 + 15850);
          L1: while (true) {
            if (((en) var3).field_a != 0) {
              if ((((en) var3).field_a ^ -1) != -2) {
                wf.a(100L, false);
                continue L0;
              } else {
                param2.setVisible(false);
                param2.dispose();
                if (param0 != 973) {
                  var5 = (java.awt.Frame) null;
                  ke.a(32, (rk) null, (java.awt.Frame) null);
                  return;
                } else {
                  return;
                }
              }
            } else {
              wf.a(10L, false);
              continue L1;
            }
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        int var1 = -105 % ((param0 - 50) / 49);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"You got the Double Gun!", "You got the Spreader Gun!", "You got the Gatling Gun!", "You got the Gun Coolant!"};
    }
}
