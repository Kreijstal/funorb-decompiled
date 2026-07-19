/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd {
    static String field_b;
    static wb field_d;
    static String field_a;
    static wb field_c;

    final static void a(boolean param0) {
        pe var1 = null;
        if (param0) {
          L0: {
            field_b = (String) null;
            var1 = (pe) ((Object) wb.field_e.d(-126));
            if (var1 != null) {
              break L0;
            } else {
              var1 = new pe();
              break L0;
            }
          }
          var1.a(kh.field_l, kh.field_i, kh.field_d, -26690, kh.field_g, kh.field_j, kh.field_c, kh.field_b);
          ok.field_a.b(0, var1);
          return;
        } else {
          L1: {
            var1 = (pe) ((Object) wb.field_e.d(-126));
            if (var1 != null) {
              break L1;
            } else {
              var1 = new pe();
              break L1;
            }
          }
          var1.a(kh.field_l, kh.field_i, kh.field_d, -26690, kh.field_g, kh.field_j, kh.field_c, kh.field_b);
          ok.field_a.b(0, var1);
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != -1246) {
          field_b = (String) null;
          field_d = null;
          field_c = null;
          field_b = null;
          field_a = null;
          return;
        } else {
          field_d = null;
          field_c = null;
          field_b = null;
          field_a = null;
          return;
        }
    }

    static {
        field_a = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_d = new wb();
        field_c = new wb();
    }
}
