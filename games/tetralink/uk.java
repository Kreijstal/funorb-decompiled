/*
 * Decompiled by CFR-JS 0.4.0.
 */
class uk extends gb {
    static float field_x;
    static db field_t;
    static String field_u;
    static String field_v;
    static boolean[] field_w;

    final static boolean b(int param0, int param1) {
        if (0 != (param0 << param1 & hj.field_a)) {
          return true;
        } else {
          if (cf.a(qc.field_gb[param1], (byte) 118)) {
            return true;
          } else {
            return false;
          }
        }
    }

    uk() {
    }

    public static void b(byte param0) {
        field_w = null;
        if (param0 != -96) {
          uk.b((byte) 88);
          field_t = null;
          field_u = null;
          field_v = null;
          return;
        } else {
          field_t = null;
          field_u = null;
          field_v = null;
          return;
        }
    }

    static {
        field_u = "Invalid name";
        field_v = "Offensive account name";
        field_t = new db(13, 0, 1, 0);
    }
}
