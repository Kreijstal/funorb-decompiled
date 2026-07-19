/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd {
    static hj field_a;
    static String[] field_e;
    static int field_b;
    static int field_f;
    static tl field_h;
    static int field_c;
    static String field_d;
    static String field_g;

    final static void b(int param0) {
        int var1 = 0;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        var1 = -57 / ((param0 - 13) / 46);
        if (ad.field_b == null) {
          return;
        } else {
          var2 = ad.field_b;
          synchronized (var2) {
            L0: {
              ad.field_b = null;
              break L0;
            }
          }
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != -32311) {
          field_c = -92;
          field_h = null;
          field_g = null;
          field_d = null;
          field_a = null;
          field_e = null;
          return;
        } else {
          field_h = null;
          field_g = null;
          field_d = null;
          field_a = null;
          field_e = null;
          return;
        }
    }

    static {
        field_d = "An orb has been destroyed!";
        field_h = new tl();
        field_g = "ICE SHOT";
    }
}
