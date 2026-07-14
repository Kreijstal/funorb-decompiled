/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class io {
    int field_j;
    static io field_i;
    static io field_f;
    static io field_c;
    static io field_g;
    static io field_k;
    static io field_h;
    static io field_e;
    static io field_d;
    static ci field_b;
    static float[] field_a;

    final static void a(int param0, mf param1) {
        sj.field_c.a((hj) (Object) param1);
        if (param0 < 93) {
            io.a(-28);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    private io(int param0) {
        ((io) this).field_j = param0;
    }

    public static void a(int param0) {
        field_i = null;
        field_g = null;
        field_b = null;
        field_c = null;
        if (param0 != 0) {
          io.a(41);
          field_h = null;
          field_f = null;
          field_e = null;
          field_d = null;
          field_a = null;
          field_k = null;
          return;
        } else {
          field_h = null;
          field_f = null;
          field_e = null;
          field_d = null;
          field_a = null;
          field_k = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new io(1);
        field_f = new io(2);
        field_c = new io(4);
        field_g = new io(1);
        field_k = new io(2);
        field_h = new io(4);
        field_e = new io(2);
        field_d = new io(4);
        field_a = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
    }
}
