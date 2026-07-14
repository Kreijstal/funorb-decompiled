/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj extends hg {
    static om field_l;
    String field_g;
    static String field_j;
    static int field_h;
    static String field_k;
    static int field_i;

    final static void a(int param0, byte param1) {
        L0: {
          if (mb.field_a != null) {
            mb.field_a.g(2048);
            break L0;
          } else {
            break L0;
          }
        }
        mb.field_a = hl.c(uf.field_g, 100, qm.field_c * 6144 / 64, param0);
        if (param1 != 51) {
          field_l = null;
          rk.field_e.a((wg) (Object) mb.field_a);
          return;
        } else {
          rk.field_e.a((wg) (Object) mb.field_a);
          return;
        }
    }

    public static void a(byte param0) {
        field_j = null;
        field_k = null;
        field_l = null;
        if (param0 != 123) {
            field_l = null;
        }
    }

    sj(String param0) {
        ((sj) this).field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new om(8, 0, 4, 1);
        field_j = "Discard";
        field_k = "Target locations";
    }
}
