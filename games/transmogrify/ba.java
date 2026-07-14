/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends wf {
    static int field_n;
    int field_p;
    byte[][][] field_g;
    int[] field_j;
    int[] field_h;
    ib[] field_o;
    static String[] field_l;
    ib[] field_m;
    int[] field_k;
    static int[] field_q;
    int field_i;

    final static hg e(int param0) {
        if (param0 > 0) {
          field_n = -53;
          return new hg(le.h(23), uf.a((byte) -76));
        } else {
          return new hg(le.h(23), uf.a((byte) -76));
        }
    }

    public static void d(int param0) {
        field_q = null;
        if (param0 != 2) {
            return;
        }
        field_l = null;
    }

    final static void a(int param0, int param1) {
        sg.field_e = param1;
        if (param0 < 104) {
            int discarded$0 = ba.a((byte) -122);
        }
    }

    final static int a(byte param0) {
        if (param0 != 101) {
            field_l = null;
            return mf.field_d;
        }
        return mf.field_d;
    }

    ba() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 2;
        field_l = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
