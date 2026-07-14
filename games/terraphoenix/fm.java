/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm {
    static bh field_b;
    static String field_a;

    final static ud a(byte[] param0, int param1) {
        ud var2 = null;
        if (param0 != null) {
          if (param1 <= 25) {
            fm.b(-84);
            var2 = new ud(param0, ha.field_s, hj.field_K, sb.field_m, rf.field_p, qc.field_b);
            mj.a((byte) 101);
            return var2;
          } else {
            var2 = new ud(param0, ha.field_s, hj.field_K, sb.field_m, rf.field_p, qc.field_b);
            mj.a((byte) 101);
            return var2;
          }
        } else {
          return null;
        }
    }

    final static kf[] a(boolean param0) {
        if (param0) {
          gd discarded$2 = fm.a(47);
          return new kf[]{te.field_g, gf.field_u, gm.field_j};
        } else {
          return new kf[]{te.field_g, gf.field_u, gm.field_j};
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != -19266) {
            field_a = null;
        }
    }

    final static gd a(int param0) {
        if (param0 != -32218) {
            return null;
        }
        return new gd(vl.b(3), kf.a(false));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Create";
    }
}
