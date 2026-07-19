/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class om extends rk {
    int field_m;
    int field_v;
    int field_t;
    int field_r;
    static w field_p;
    static double field_q;
    int field_u;
    static String field_o;
    int field_n;
    static jf field_s;

    public static void a(byte param0) {
        field_p = null;
        field_s = null;
        if (param0 != -50) {
            field_p = (w) null;
            field_o = null;
            return;
        }
        field_o = null;
    }

    final static qn a(int param0, int param1, int param2, int param3, byte param4) {
        Object var5 = null;
        qn var5_ref = null;
        int var6 = 0;
        qn var7 = null;
        qn var8 = null;
        var5 = null;
        var6 = Confined.field_J ? 1 : 0;
        if (param4 == -30) {
          var5_ref = (qn) ((Object) na.field_T.a(97));
          L0: while (true) {
            if (var5_ref != null) {
              if (param0 != var5_ref.field_w) {
                var5_ref = (qn) ((Object) na.field_T.d(2123));
                continue L0;
              } else {
                return var5_ref;
              }
            } else {
              var7 = new qn();
              var7.field_s = param1;
              var7.field_w = param0;
              var7.field_o = param3;
              na.field_T.a((rk) (var7), (byte) 105);
              dh.a(param2, var7, 21821);
              return var7;
            }
          }
        } else {
          om.b(true);
          var5_ref = (qn) ((Object) na.field_T.a(97));
          L1: while (true) {
            if (var5_ref != null) {
              if (param0 != var5_ref.field_w) {
                var5_ref = (qn) ((Object) na.field_T.d(2123));
                continue L1;
              } else {
                return var5_ref;
              }
            } else {
              var8 = new qn();
              var5_ref = var8;
              var8.field_s = param1;
              var8.field_w = param0;
              var8.field_o = param3;
              na.field_T.a((rk) (var8), (byte) 105);
              dh.a(param2, var8, 21821);
              return var8;
            }
          }
        }
    }

    final static void b(boolean param0) {
        if (!param0) {
            field_s = (jf) null;
            gb.a((byte) -94, ii.b(false));
            return;
        }
        gb.a((byte) -94, ii.b(false));
    }

    private om() throws Throwable {
        throw new Error();
    }

    static {
        field_o = "Open in popup window";
    }
}
