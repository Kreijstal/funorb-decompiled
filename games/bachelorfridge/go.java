/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class go extends eo {
    int field_t;
    int field_q;
    static qh field_s;
    int field_o;
    int field_p;
    int field_n;
    int field_u;
    static String field_r;

    public static void e(int param0) {
        if (param0 < 93) {
            go.a(-26, (byte) -48, 12);
            field_s = null;
            field_r = null;
            return;
        }
        field_s = null;
        field_r = null;
    }

    final static void a(int param0, byte param1, int param2) {
        pna.field_zb[param2] = new rs(param2, param0);
        if (param1 >= -125) {
            field_r = null;
        }
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    go() {
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        if (param3 != -1049413117) {
          ((go) this).field_p = -3;
          var6 = ((go) this).field_n << -1049413117;
          var7 = ((go) this).field_o << -1657772093;
          param2 = (var6 & 15) + (param2 << -1730830236);
          param1 = (var7 & 15) + (param1 << -966370396);
          ((go) this).a(var6, var7, param2, param1, param0, param4);
          return;
        } else {
          var6 = ((go) this).field_n << -1049413117;
          var7 = ((go) this).field_o << -1657772093;
          param2 = (var6 & 15) + (param2 << -1730830236);
          param1 = (var7 & 15) + (param1 << -966370396);
          ((go) this).a(var6, var7, param2, param1, param0, param4);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Invite";
    }
}
