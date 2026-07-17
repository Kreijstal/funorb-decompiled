/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hba {
    static int field_b;
    static ena field_c;
    static float[] field_a;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
    }

    final static void a(int param0, long param1, byte param2, int param3) {
        nra var5 = null;
        if (null == ql.field_k) {
          return;
        } else {
          var5 = new nra();
          if (param2 < 1) {
            field_a = null;
            var5.a(-7, param1);
            var5.a(param3, -71);
            var5.b(40, param0);
            var5.a(qa.field_b, bh.field_o, nta.field_h, cka.field_Z, -113);
            var5.a(et.field_j, nb.field_c, false, lra.field_f, cfa.field_b);
            hw.a((byte) -111, 1, 74, (bo) (Object) var5);
            return;
          } else {
            var5.a(-7, param1);
            var5.a(param3, -71);
            var5.b(40, param0);
            var5.a(qa.field_b, bh.field_o, nta.field_h, cka.field_Z, -113);
            var5.a(et.field_j, nb.field_c, false, lra.field_f, cfa.field_b);
            hw.a((byte) -111, 1, 74, (bo) (Object) var5);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
    }
}
