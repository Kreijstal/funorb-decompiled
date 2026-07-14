/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    static ll field_d;
    int field_g;
    static boolean field_e;
    static String field_b;
    static String field_f;
    static int field_h;
    static oa field_a;
    static boolean field_c;

    final static void a(long param0, int param1) {
        try {
            if (false) throw (InterruptedException) null;
            Thread.sleep(param0);
        } catch (InterruptedException interruptedException) {
        }
        if (param1 > -60) {
            field_a = null;
            return;
        }
    }

    final static String a(int param0, gn param1, String param2, String param3) {
        if (param1.b((byte) -86)) {
          if (param0 >= -6) {
            uj.a((byte) -56);
            return param2 + " - " + param1.a(0) + "%";
          } else {
            return param2 + " - " + param1.a(0) + "%";
          }
        } else {
          return param3;
        }
    }

    public static void a(byte param0) {
        field_f = null;
        if (param0 != -122) {
          uj.a((byte) -14);
          field_d = null;
          field_a = null;
          field_b = null;
          return;
        } else {
          field_d = null;
          field_a = null;
          field_b = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new ll();
        field_e = false;
        field_b = "Loading extra data";
    }
}
