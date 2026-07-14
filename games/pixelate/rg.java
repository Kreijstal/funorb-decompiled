/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rg {
    static jj field_e;
    static bb field_c;
    static String[] field_a;
    static byte[] field_d;
    static bb field_b;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 1762) {
          rg.a(-41);
          field_c = null;
          field_e = null;
          field_d = null;
          return;
        } else {
          field_c = null;
          field_e = null;
          field_d = null;
          return;
        }
    }

    final static void a(String param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        uj.field_Wb = true;
        jm.field_h.field_cb = param0;
        var2 = qa.field_f.field_a;
        var3 = qa.field_f.field_i;
        var4 = jm.field_h.field_Db.a(param0, 272, jm.field_h.field_mb);
        if (param1) {
          return;
        } else {
          var5 = -(var4 / 2) + -110 + var3 / 2 + 7;
          nc.field_e.a(var5, -(var5 * 2) + (-120 + var3), (-320 + var2) / 2, 256, 320);
          nc.field_e.field_zb = op.a(8421504, 16, 11579568, nc.field_e.field_nb, 2105376, 3);
          jm.field_h.a(16, -24 + nc.field_e.field_nb + -20, 24, 256, -24 + (nc.field_e.field_K + -24));
          hk.field_h.a(-24 + (nc.field_e.field_nb - 20), 24, 120, 256, 80);
          return;
        }
    }

    abstract void a(byte param0, we param1);

    abstract ea b(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[3];
        field_c = new bb();
        field_b = null;
        field_d = new byte[]{(byte)3, (byte)3};
    }
}
