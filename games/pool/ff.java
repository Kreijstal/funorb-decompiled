/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
    static int[] field_i;
    static int[] field_a;
    static String field_g;
    static dd[][] field_f;
    static int[] field_h;
    static dd[] field_e;
    static so field_d;
    static nl field_b;
    static String field_j;
    static boolean field_c;

    final static void a(int param0, boolean param1) {
        if (param0 != 0) {
            field_c = false;
            uq.field_D.a((byte) -79, param1);
            return;
        }
        uq.field_D.a((byte) -79, param1);
    }

    public static void a(byte param0) {
        field_b = null;
        field_h = null;
        field_d = null;
        field_i = null;
        field_e = null;
        if (param0 <= 56) {
          return;
        } else {
          field_a = null;
          field_g = null;
          field_j = null;
          field_f = null;
          return;
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        fd.field_J = param1;
        if (!(em.field_P == ir.field_h)) {
            var2 = ir.field_h * ir.field_h;
            var3 = -(em.field_P * em.field_P) + var2;
            param1 = param1 + var3 * (-param1 + cb.field_g) / var2;
        }
        fl.field_q.b(param1, param0 + -2147483625, tn.field_u, 640, 120);
        mm.a(ja.field_b, param0 + cb.field_g, 0, 640, 5, 125, kj.field_j);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new dd[][]{null, null, null, null};
        field_g = "Accept draw";
        field_h = ta.a(new int[8], -120);
        field_i = ta.a(new int[8], -120);
        field_a = new int[field_h.length];
        field_b = new nl();
        field_j = "ESC - cancel this line";
        field_c = true;
    }
}
