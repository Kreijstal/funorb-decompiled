/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni extends gn {
    static rf field_l;
    static String field_h;
    int field_j;
    static String field_e;
    static String field_q;
    static String field_p;
    static em field_m;
    int field_g;
    static String[] field_k;
    static sj field_i;
    int field_o;
    static String field_n;
    static ut[][] field_f;

    final static byte[] a(byte param0, String param1) {
        Object var3 = null;
        if (param0 > -49) {
          var3 = null;
          byte[] discarded$2 = ni.a((byte) 34, (String) null);
          return jg.field_J.a(param1, "", 4);
        } else {
          return jg.field_J.a(param1, "", 4);
        }
    }

    public static void a(int param0) {
        field_k = null;
        field_l = null;
        field_m = null;
        field_n = null;
        if (param0 != -1859) {
          return;
        } else {
          field_e = null;
          field_f = null;
          field_h = null;
          field_q = null;
          field_i = null;
          field_p = null;
          return;
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (param3 == -20859) {
          if (iw.field_l) {
            return la.field_a.a(il.field_c, (byte) 127, cc.field_e);
          } else {
            if (!kd.field_s) {
              if (sq.b(param3 + 20963, param0, param1)) {
                return true;
              } else {
                if (kb.field_C) {
                  return false;
                } else {
                  return hd.a(false, param2, param0);
                }
              }
            } else {
              return ov.a(param1, -14, param0);
            }
          }
        } else {
          return false;
        }
    }

    private ni() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "earned: <%0>";
        field_p = "<%0> wants to join";
        field_e = "My Results";
        field_k = new String[]{"4 Hours", "6 Hours", "12 Hours", "1 Day", "2 Days"};
        field_q = "Drag your players from the grid to fill each slot on the pitch.<br>Click ready when done.";
        field_n = "<%0> has no opponent and passes straight through <%1>";
    }
}
