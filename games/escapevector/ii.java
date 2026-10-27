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
        }
        lh.field_d = 3 & param1 >> 2;
        vi.field_f = 3 & param1;
        if (param0 != 16) {
          ii.a(17);
        }
        if (lh.field_d > 2) {
          lh.field_d = 2;
        }
        if (vi.field_f > 2) {
          vi.field_f = 2;
        }
    }

    public static void a(int param0) {
        if (param0 != 20) {
          field_a = (mf) null;
          field_a = null;
          field_b = null;
          return;
        }
        field_a = null;
        field_b = null;
    }

    final static boolean b(int param0) {
        if (param0 != 16836) {
          return false;
        }
        if (20 > fc.field_a) {
          return true;
        }
        if (!aa.a((byte) -84)) {
          return true;
        }
        if (am.field_g <= 0) {
          return false;
        }
        if (!NetworkGameClient.i(90)) {
          return true;
        }
        return false;
    }

    static {
        field_b = "Please send me news and updates (I can unsubscribe at any time)";
    }
}
