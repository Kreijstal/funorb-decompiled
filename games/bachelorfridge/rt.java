/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rt {
    static String field_b;
    static String field_c;
    static be[] field_a;

    public static void a(byte param0) {
        field_b = null;
        if (param0 > -53) {
            field_c = null;
            field_a = null;
            field_c = null;
            return;
        }
        field_a = null;
        field_c = null;
    }

    final static void a(String param0, String param1, int param2) {
        if (oq.field_b == null) {
          ola.field_e = new ph(param0, param1, false, true, true);
          kka.field_l.e((wj) (Object) ola.field_e, param2 + 24);
          if (param2 != 9) {
            field_a = null;
            return;
          } else {
            return;
          }
        } else {
          oq.field_b.p(param2 + -85);
          ola.field_e = new ph(param0, param1, false, true, true);
          kka.field_l.e((wj) (Object) ola.field_e, param2 + 24);
          if (param2 == 9) {
            return;
          } else {
            field_a = null;
            return;
          }
        }
    }

    final static void a(java.awt.Canvas param0, byte param1, ht param2) {
        oea.field_p = new jp();
        if (param1 < 73) {
          return;
        } else {
          oea.field_p.a(128, (byte) 39, 9);
          lfa.a(22050, param2, true, (byte) 107, oea.field_p, (java.awt.Component) (Object) param0);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<%0> is already on your friend list.";
        field_b = "Open in popup window";
        field_a = new be[71];
    }
}
