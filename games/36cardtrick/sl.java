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
        ia.field_a = (59 & param1) >> -993232476;
        if (param0 > 77) {
          L0: {
            qd.field_c = param1 >> -1884794366 & 3;
            if (2 < ia.field_a) {
              ia.field_a = 2;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            n.field_E = param1 & 3;
            if (-3 > (qd.field_c ^ -1)) {
              qd.field_c = 2;
              break L1;
            } else {
              break L1;
            }
          }
          if ((n.field_E ^ -1) < -3) {
            n.field_E = 2;
            return;
          } else {
            return;
          }
        } else {
          L2: {
            field_c = (String) null;
            qd.field_c = param1 >> -1884794366 & 3;
            if (2 < ia.field_a) {
              ia.field_a = 2;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            n.field_E = param1 & 3;
            if (-3 > (qd.field_c ^ -1)) {
              qd.field_c = 2;
              break L3;
            } else {
              break L3;
            }
          }
          if ((n.field_E ^ -1) >= -3) {
            return;
          } else {
            n.field_E = 2;
            return;
          }
        }
    }

    static {
        field_c = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
