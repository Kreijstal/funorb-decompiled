/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    static volatile long field_a;
    static String field_d;
    static bi field_b;
    static String field_c;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != -30357) {
            field_c = null;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static void a(bi param0, int param1, pm param2) {
        da.a(param1, param1 + -96, param0, false, param2);
    }

    final static boolean a(byte param0) {
        if (param0 == -14) {
          if (gg.field_m != null) {
            if (!gg.field_m.b(param0 + -99)) {
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
    }

    final static bm[] a(mi param0, int param1, int param2, boolean param3) {
        if (!param3) {
          if (!mc.a(param2, param1, param0, (byte) 119)) {
            return null;
          } else {
            return Confined.g((byte) 118);
          }
        } else {
          kj.a(13);
          if (!mc.a(param2, param1, param0, (byte) 119)) {
            return null;
          } else {
            return Confined.g((byte) 118);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0L;
        field_d = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
