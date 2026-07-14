/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb extends uf {
    static ci field_p;
    static int field_j;
    static String field_k;
    static String field_n;
    static int[] field_m;
    static jj field_h;
    static String field_l;
    static int field_i;
    byte[] field_o;

    public static void c(byte param0) {
        field_n = null;
        field_m = null;
        field_p = null;
        field_k = null;
        field_h = null;
        field_l = null;
        if (param0 != 29) {
            field_h = null;
        }
    }

    final static qj a(boolean param0, byte[] param1) {
        qj var2 = null;
        if (!param0) {
          if (param1 == null) {
            return null;
          } else {
            var2 = new qj(param1, ha.field_s, hj.field_K, field_m, rf.field_p, wb.field_a, qc.field_b);
            mj.a((byte) 95);
            return var2;
          }
        } else {
          sb.c((byte) -62);
          if (param1 == null) {
            return null;
          } else {
            var2 = new qj(param1, ha.field_s, hj.field_K, field_m, rf.field_p, wb.field_a, qc.field_b);
            mj.a((byte) 95);
            return var2;
          }
        }
    }

    sb(byte[] param0) {
        ((sb) this).field_o = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Research this topic";
        field_n = "ACT I, Reconstruction";
        field_l = "Members' Benefits";
    }
}
