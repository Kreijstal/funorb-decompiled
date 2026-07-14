/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qcb extends rqa {
    static slb field_q;
    static boolean[][] field_o;
    static String field_r;
    static llb field_p;

    final static byte[] a(int param0, byte[] param1, int param2, int param3) {
        byte[] var4 = null;
        byte[] var5 = null;
        var5 = new byte[param0];
        var4 = var5;
        if (param3 != 31783) {
          return null;
        } else {
          cua.a(param1, param2, var5, 0, param0);
          return var5;
        }
    }

    qcb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_r = null;
        field_p = null;
        field_q = null;
        if (param0 != 17231) {
            return;
        }
        field_o = null;
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          return null;
        } else {
          si.a(201, 62, param0[0].a(39));
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "The round was a draw!";
        field_q = new slb();
    }
}
