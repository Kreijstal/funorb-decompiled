/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qq extends dh implements op {
    private int field_T;
    static int field_P;
    private v field_S;
    static String field_Q;
    static vn field_R;

    public static void l(int param0) {
        if (param0 != -15648) {
            field_R = null;
            field_R = null;
            field_Q = null;
            return;
        }
        field_R = null;
        field_Q = null;
    }

    final void a(byte param0, v param1) {
        int var3 = 2 % ((param0 - 72) / 46);
        ((qq) this).field_S = param1;
    }

    final static boolean b(int param0, int param1, int param2) {
        if (param2 >= -6) {
            return true;
        }
        return wn.a(param0, param1, -107) & tf.a(param1, -2626, param0);
    }

    public final v a(int param0) {
        int var2 = 124 / ((-52 - param0) / 62);
        return ((qq) this).field_S;
    }

    final void g(byte param0) {
        super.g((byte) 127);
        if (param0 > 78) {
          if (null != ((qq) this).field_S) {
            ((qq) this).field_S.a((byte) -117);
            return;
          } else {
            return;
          }
        } else {
          field_Q = null;
          if (null == ((qq) this).field_S) {
            return;
          } else {
            ((qq) this).field_S.a((byte) -117);
            return;
          }
        }
    }

    final static dj a(int param0, mf param1) {
        dj var2 = null;
        if (param0 != 18416) {
          boolean discarded$2 = qq.b(-31, 81, 66);
          var2 = new dj(param1, (ms) (Object) param1);
          jf.field_c.a((ms) (Object) var2, (byte) 39);
          sj.field_c.b((hj) (Object) param1);
          return var2;
        } else {
          var2 = new dj(param1, (ms) (Object) param1);
          jf.field_c.a((ms) (Object) var2, (byte) 39);
          sj.field_c.b((hj) (Object) param1);
          return var2;
        }
    }

    qq(String param0, qm param1, int param2) {
        super(param0, param1, param2);
    }

    final String c(int param0) {
        if (((qq) this).field_k) {
          if (((qq) this).field_t != null) {
            if (param0 != -6696) {
              ((qq) this).field_S = null;
              gi.a(pi.field_e, ((qq) this).field_q - (((qq) this).field_T - ko.field_p), -95);
              return ((qq) this).field_t;
            } else {
              gi.a(pi.field_e, ((qq) this).field_q - (((qq) this).field_T - ko.field_p), -95);
              return ((qq) this).field_t;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, pk param2, int param3) {
        super.a(param0, -86, param2, param3);
        int var5 = 126 % ((param1 - -25) / 45);
        ((qq) this).field_T = ko.field_p - (((qq) this).field_r + param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = "Names should contain a maximum of 12 characters";
    }
}
