/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc extends aa {
    static ia field_cb;
    static int[] field_ab;
    static ei field_Y;
    static t field_db;
    static int field_bb;
    static int field_Z;

    final static kl a(int param0, byte param1, lf param2) {
        if (param1 != -112) {
          qc.n(52);
          return new kl(param2, pi.field_c * param0 / 1000);
        } else {
          return new kl(param2, pi.field_c * param0 / 1000);
        }
    }

    qc(ln param0, gm param1) {
        super(param0, param1, 33, 20, 30);
    }

    final void c(gm param0, int param1) {
        if (param1 != 33) {
          field_db = null;
          super.c(param0, param1 + 0);
          return;
        } else {
          super.c(param0, param1 + 0);
          return;
        }
    }

    public static void n(int param0) {
        field_ab = null;
        field_cb = null;
        field_db = null;
        field_Y = null;
        if (param0 != 1269) {
            field_bb = -19;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Y = new ei();
    }
}
