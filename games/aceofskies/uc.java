/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc extends wf {
    boolean field_i;
    int[][] field_h;
    static qr field_l;
    int field_n;
    int field_j;
    static ll[] field_k;
    String[][] field_e;
    static vd field_g;
    static pa[] field_o;
    int field_m;
    long[][] field_f;

    public static void a(byte param0) {
        field_o = null;
        field_g = null;
        field_k = null;
        field_l = null;
        if (param0 != 35) {
            field_g = (vd) null;
        }
    }

    final static cp a(int param0, gk param1, int param2, gk param3, int param4) {
        int var5 = 0;
        if (!tn.a(param3, (byte) -127, param2, param4)) {
          return null;
        } else {
          var5 = -15 / ((param0 - 65) / 51);
          return te.a(param1.a(param4, -10470, param2), -80);
        }
    }

    final static void a(mg param0, int param1, int param2, int param3) {
        if (param1 != 25345) {
            return;
        }
        qg.field_d = param0;
        po.field_j = param2;
        ku.field_h = param3;
    }

    uc() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new qr();
    }
}
