/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    static int field_e;
    static int[] field_f;
    static String field_a;
    static String[] field_d;
    static ck field_c;
    static boolean field_g;
    static String field_b;

    final static boolean a(int param0) {
        int var1 = 0;
        L0: {
          if ((ai.field_i ^ -1) == 0) {
            if (!jj.a(1, (byte) -78)) {
              return false;
            } else {
              ai.field_i = e.field_c.c(32);
              e.field_c.field_n = 0;
              break L0;
            }
          } else {
            break L0;
          }
        }
        if (ai.field_i == -2) {
          if (!jj.a(2, (byte) -111)) {
            return false;
          } else {
            ai.field_i = e.field_c.a((byte) 25);
            e.field_c.field_n = 0;
            var1 = -122 / ((param0 - -9) / 57);
            return jj.a(ai.field_i, (byte) 43);
          }
        } else {
          var1 = -122 / ((param0 - -9) / 57);
          return jj.a(ai.field_i, (byte) 43);
        }
    }

    final static void a(String param0, int param1, float param2) {
        og.field_h = param2;
        ui.field_b = param0;
        if (param1 != 10265) {
            field_d = null;
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_f = null;
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != -92) {
            field_a = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_f = new int[]{0, 0, 0, -65536, 0, 0, 0, 65536, 0, 0, 0, -65536};
        field_b = "You have 1 unread message!";
    }
}
