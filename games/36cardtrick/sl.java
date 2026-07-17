/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl {
    static String field_c;
    static ph field_b;
    static boolean field_a;

    public static void a() {
        field_b = null;
        field_c = null;
    }

    final static void a(byte param0, int param1) {
        L0: {
          ia.field_a = (59 & param1) >> 4;
          qd.field_c = param1 >> 2 & 3;
          if (2 < ia.field_a) {
            ia.field_a = 2;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          n.field_E = param1 & 3;
          if (qd.field_c > 2) {
            qd.field_c = 2;
            break L1;
          } else {
            break L1;
          }
        }
        if (n.field_E > 2) {
          n.field_E = 2;
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
