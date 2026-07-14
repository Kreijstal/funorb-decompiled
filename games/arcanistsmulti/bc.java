/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static String field_a;
    static int field_b;
    static mo field_c;

    final static void a(int param0, int param1) {
        ab var2 = null;
        var2 = he.field_e;
        var2.b((byte) -106, param0);
        var2.f(1, (byte) -74);
        if (param1 != -14431) {
          field_c = null;
          var2.f(1, (byte) -118);
          return;
        } else {
          var2.f(1, (byte) -118);
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
            return;
        }
        field_c = null;
        field_a = null;
    }

    final static void a(byte param0) {
        cd.d(param0 + 16777265);
        if (param0 != -50) {
            Object var2 = null;
            bc.a((String) null, true);
        }
    }

    final static void a(String param0, boolean param1) {
        if (!param1) {
            bc.a(4, -83);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "You have fallen into the water! Choose a location to teleport to. If you fail to do this within the time limit, you will forfeit the game!";
        field_b = -1;
    }
}
