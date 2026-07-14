/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    static float[][] field_c;
    static int field_a;
    static double field_b;

    final static tb a(int param0, byte[] param1) {
        tb var2 = null;
        if (param1 != null) {
          var2 = new tb(param1, qc.field_P, mb.field_b, da.field_c, ra.field_ab, fk.field_d, cb.field_b);
          gb.a(param0 + 32415);
          if (param0 != -32466) {
            field_c = null;
            return var2;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_c = null;
        int var1 = -12 / ((param0 - -37) / 44);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new float[][]{new float[2], new float[2], new float[2], new float[2], new float[2], new float[2], new float[2], new float[2], new float[2], new float[2], new float[2], new float[2]};
        field_b = Math.atan2(1.0, 0.0);
    }
}
