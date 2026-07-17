/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug {
    static String field_a;
    static int field_b;

    public static void a() {
        field_a = null;
    }

    final static void a(int param0) {
        if (dg.field_i == null) {
          return;
        } else {
          L0: {
            tf.a(-120, (java.awt.Canvas) (Object) dg.field_i);
            dg.field_i.a(nk.field_u, 159);
            dg.field_i = null;
            if (ki.field_D != null) {
              ki.field_D.b(false);
              break L0;
            } else {
              break L0;
            }
          }
          if (param0 >= -93) {
            field_b = -39;
            k.field_d.requestFocus();
            return;
          } else {
            k.field_d.requestFocus();
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Passwords must be between 5 and 20 letters and numbers";
    }
}
