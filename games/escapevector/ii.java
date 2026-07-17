/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii {
    static mf field_a;
    static String field_b;

    final static void a(byte param0, int param1) {
        ng.field_pb = 3 & param1 >> 4;
        if (2 < ng.field_pb) {
            ng.field_pb = 2;
            lh.field_d = 3 & param1 >> 2;
            vi.field_f = 3 & param1;
            if (!(lh.field_d <= 2)) {
                lh.field_d = 2;
            }
            if (!(vi.field_f <= 2)) {
                vi.field_f = 2;
            }
            return;
        }
        lh.field_d = 3 & param1 >> 2;
        vi.field_f = 3 & param1;
        if (!(lh.field_d <= 2)) {
            lh.field_d = 2;
        }
        if (!(vi.field_f <= 2)) {
            vi.field_f = 2;
        }
    }

    public static void a() {
        field_a = null;
        field_b = null;
    }

    final static boolean b() {
        if (20 <= fc.field_a) {
          if (aa.a((byte) -84)) {
            if (am.field_g > 0) {
              if (g.i(90)) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Please send me news and updates (I can unsubscribe at any time)";
    }
}
