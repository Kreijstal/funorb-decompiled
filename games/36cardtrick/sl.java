/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl {
    static String field_c;
    static ph field_b;
    static boolean field_a;

    public static void a(int param0) {
        field_b = null;
        if (param0 != -3) {
          return;
        }
        field_c = null;
    }

    final static void a(byte param0, int param1) {
        ia.field_a = (59 & param1) >> 4;
        if (param0 <= 77) {
          field_c = (String) null;
          qd.field_c = param1 >> 2 & 3;
          if (!(2 >= ia.field_a)) {
            ia.field_a = 2;
          }
          n.field_E = param1 & 3;
          if (!(qd.field_c <= 2)) {
            qd.field_c = 2;
          }
          if (n.field_E > 2) {
            n.field_E = 2;
            return;
          }
          return;
        }
        qd.field_c = param1 >> 2 & 3;
        if (!(2 >= ia.field_a)) {
          ia.field_a = 2;
        }
        n.field_E = param1 & 3;
        if (!(qd.field_c <= 2)) {
          qd.field_c = 2;
        }
        if (n.field_E <= 2) {
          return;
        }
        n.field_E = 2;
    }

    static {
        field_c = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
