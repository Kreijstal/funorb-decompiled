/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii {
    static mf field_a;
    static String field_b;

    final static void a(byte param0, int param1) {
        ng.field_pb = 3 & param1 >> 474699460;
        if (2 < ng.field_pb) {
            ng.field_pb = 2;
            lh.field_d = 3 & param1 >> 1758044066;
            vi.field_f = 3 & param1;
            if (param0 == 16) {
                if (!((lh.field_d ^ -1) >= -3)) {
                    lh.field_d = 2;
                }
                if (!(-3 <= (vi.field_f ^ -1))) {
                    vi.field_f = 2;
                }
                return;
            }
            ii.a(17);
            if (!((lh.field_d ^ -1) >= -3)) {
                lh.field_d = 2;
            }
            if (!(-3 <= (vi.field_f ^ -1))) {
                vi.field_f = 2;
            }
            return;
        }
        lh.field_d = 3 & param1 >> 1758044066;
        vi.field_f = 3 & param1;
        if (param0 != 16) {
            ii.a(17);
            if (!((lh.field_d ^ -1) >= -3)) {
                lh.field_d = 2;
            }
            if (!(-3 <= (vi.field_f ^ -1))) {
                vi.field_f = 2;
            }
            return;
        }
        if (!((lh.field_d ^ -1) >= -3)) {
            lh.field_d = 2;
        }
        if (!(-3 <= (vi.field_f ^ -1))) {
            vi.field_f = 2;
        }
    }

    public static void a(int param0) {
        if (param0 != 20) {
            field_a = null;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    final static boolean b(int param0) {
        if (param0 == 16836) {
          if (20 <= fc.field_a) {
            if (aa.a((byte) -84)) {
              if ((am.field_g ^ -1) < -1) {
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
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Please send me news and updates (I can unsubscribe at any time)";
    }
}
