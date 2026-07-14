/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    int field_b;
    static rb field_d;
    int field_f;
    static int[][] field_e;
    static int[] field_c;
    static int field_a;

    public static void a(int param0) {
        if (param0 != 480) {
          uh discarded$2 = bi.a((byte) -77);
          field_c = null;
          field_d = null;
          field_e = null;
          return;
        } else {
          field_c = null;
          field_d = null;
          field_e = null;
          return;
        }
    }

    final static uh a(byte param0) {
        if (param0 < 48) {
            bi.a(-128);
            return (uh) (Object) new ef();
        }
        return (uh) (Object) new ef();
    }

    bi(int param0, int param1, int param2) {
        ((bi) this).field_f = param1;
        ((bi) this).field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 480;
    }
}
