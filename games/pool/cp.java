/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp {
    static int[] field_d;
    static di field_a;
    static ao field_c;
    static String field_b;

    final static boolean a(byte param0) {
        if (param0 > 72) {
          if (fq.m(0)) {
            if ((eo.field_Tb & 8) != 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_b = null;
          if (fq.m(0)) {
            if ((eo.field_Tb & 8) != 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(boolean param0) {
        db.field_Pb = rl.a((byte) -121);
        up.field_j = 0;
        if (param0) {
            field_a = null;
        }
    }

    final static long a(byte[] param0, byte param1, int param2) {
        Object var4 = null;
        if (param1 != -83) {
          var4 = null;
          return ii.a(param0, param2, 0, 154302664);
        } else {
          return ii.a(param0, param2, 0, 154302664);
        }
    }

    public static void b(boolean param0) {
        field_a = null;
        field_c = null;
        field_d = null;
        field_b = null;
        if (!param0) {
            field_c = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "members-only content";
    }
}
