/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk {
    String field_b;
    static jp[][] field_e;
    boolean field_d;
    static String field_g;
    static jp field_a;
    static jp field_f;
    static mh field_h;
    String field_c;

    public static void a(byte param0) {
        field_h = null;
        field_g = null;
        if (param0 >= -51) {
            return;
        }
        field_e = null;
        field_f = null;
        field_a = null;
    }

    final static void a(byte param0, java.awt.Canvas param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (param0 >= 24) {
          if ((qg.field_A ^ -1) <= -11) {
            if (il.e((byte) -94)) {
              if (i.field_j == 0) {
                lf.a(param2, -71, false);
                ck.a(param1, 0, 14209, 0);
                return;
              } else {
                kn.a(true, param1);
                return;
              }
            } else {
              lb.d();
              dg.a(false, 240, 320);
              ck.a(param1, 0, 14209, 0);
              return;
            }
          } else {
            L0: {
              var3 = 0;
              if (qc.field_i) {
                var3 = 1;
                qc.field_i = false;
                break L0;
              } else {
                break L0;
              }
            }
            po.a(da.d((byte) 103), sb.field_f, oj.b(false), var3 != 0, 0);
            return;
          }
        } else {
          return;
        }
    }

    static {
    }
}
