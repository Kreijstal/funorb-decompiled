/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    static hl[] field_d;
    static String field_a;
    static String field_c;
    static volatile boolean field_b;

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        field_c = null;
        int var1 = -15 % ((7 - param0) / 62);
    }

    final static boolean a(d param0, int param1) {
        int var3 = 0;
        var3 = StarCannon.field_A;
        L0: while (true) {
          if (-4001 < (fi.field_d ^ -1)) {
            if (null != qc.field_c[fi.field_d]) {
              fi.field_d = fi.field_d + 1;
              continue L0;
            } else {
              qc.field_c[fi.field_d] = param0;
              fi.field_d = fi.field_d + 1;
              return true;
            }
          } else {
            L1: {
              if (param1 == -4001) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            return false;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Email: ";
        field_c = "Names cannot start or end with space or underscore";
        field_b = true;
    }
}
