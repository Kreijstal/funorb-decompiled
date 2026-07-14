/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb {
    static String field_b;
    static k field_a;
    static int field_c;

    final static boolean b(byte param0) {
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 123) {
          if (!n.b((byte) 111)) {
            if (-1 <= (tc.field_b ^ -1)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0 != 0;
          }
        } else {
          return true;
        }
    }

    public static void a(byte param0) {
        if (param0 > -27) {
            qb.a((byte) -109);
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "achievements to collect";
    }
}
