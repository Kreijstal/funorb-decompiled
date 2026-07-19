/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    static s[] field_b;
    static String field_a;

    final static String a(boolean param0) {
        if (jq.field_fb == ht.field_k) {
            return rt.field_e;
        }
        if (!gm.field_x.a(false)) {
            return gm.field_x.b(2);
        }
        if (!param0) {
            ve.a((byte) -55, 101);
            if (!(jq.field_fb != nb.field_c)) {
                return gm.field_x.b(2);
            }
            return se.field_a;
        }
        if (!(jq.field_fb != nb.field_c)) {
            return gm.field_x.b(2);
        }
        return se.field_a;
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        int var1 = 101 % ((-44 - param0) / 35);
    }

    final static void a(byte param0, int param1) {
        L0: {
          l.field_c = param1;
          if (mg.field_d != null) {
            mg.field_d.b(param1, false);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 43) {
          return;
        } else {
          L1: {
            if (null != wt.field_e) {
              wt.field_e.a((byte) 125, param1);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    static {
        field_a = "Next";
    }
}
