/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    static vn[] field_a;

    final static void a(byte param0) {
        if (param0 <= 107) {
          field_a = (vn[]) null;
          if (df.field_h) {
            nm.field_b = false;
            df.field_h = false;
            vj.field_o = 0;
            return;
          }
          df.field_h = true;
          return;
        }
        if (df.field_h) {
          nm.field_b = false;
          df.field_h = false;
          vj.field_o = 0;
          return;
        }
        df.field_h = true;
    }

    public static void a(int param0) {
        if (param0 > -26) {
          return;
        }
        field_a = null;
    }

    final static fn a(byte param0, int param1) {
        tm var2 = null;
        tm var2Lifetime1;
        if (se.field_m.d(-117) >= 4) {
          return null;
        }
        if (param0 == 18) {
          var2 = new tm(param1);
          se.field_m.a(param0 ^ 18, var2);
          return var2.field_j;
        }
        field_a = (vn[]) null;
        var2Lifetime1 = new tm(param1);
        se.field_m.a(param0 ^ 18, var2Lifetime1);
        return var2Lifetime1.field_j;
    }

    static {
        field_a = new vn[2];
    }
}
