/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    static vn[] field_a;

    final static void a(byte param0) {
        if (param0 > 107) {
          if (!df.field_h) {
            df.field_h = true;
            return;
          } else {
            nm.field_b = false;
            df.field_h = false;
            vj.field_o = 0;
            return;
          }
        } else {
          field_a = (vn[]) null;
          if (!df.field_h) {
            df.field_h = true;
            return;
          } else {
            nm.field_b = false;
            df.field_h = false;
            vj.field_o = 0;
            return;
          }
        }
    }

    public static void a(int param0) {
        if (param0 > -26) {
            return;
        }
        field_a = null;
    }

    final static fn a(byte param0, int param1) {
        tm var2 = null;
        if (se.field_m.d(-117) < 4) {
          if (param0 != 18) {
            field_a = (vn[]) null;
            var2 = new tm(param1);
            se.field_m.a(param0 ^ 18, var2);
            return var2.field_j;
          } else {
            var2 = new tm(param1);
            se.field_m.a(param0 ^ 18, var2);
            return var2.field_j;
          }
        } else {
          return null;
        }
    }

    static {
        field_a = new vn[2];
    }
}
