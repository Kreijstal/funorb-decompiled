/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed extends om {
    static String[] field_y;
    static int field_z;

    public static void f(byte param0) {
        field_y = null;
        if (param0 != 87) {
            ed.f((byte) 29);
        }
    }

    final void a(int param0, int param1, int param2, int param3, qm param4, int param5) {
        oj var7 = null;
        super.a(param0, param1, param2, param3, param4, param5);
        var7 = ok.field_e;
        if (var7 != null) {
          if (((ed) this).a(param0, param2, false, param1, param3)) {
            if (!(((ed) this).field_l instanceof sk)) {
              if (!(var7.field_l instanceof sk)) {
                return;
              } else {
                ((sk) (Object) var7.field_l).a((ed) this, -27167, var7);
                ok.field_e = null;
                return;
              }
            } else {
              ((sk) (Object) ((ed) this).field_l).a((ed) this, -27167, var7);
              ok.field_e = null;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private ed(int param0, int param1, int param2, int param3, wo param4, bi param5, qm param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((ed) this).field_w = param6;
    }

    final static void a(byte param0, int param1, sc param2) {
        md var3 = tp.field_f;
        var3.d(8, param1);
        var3.a(true, param2.field_f);
        int var4 = -40 / ((param0 - 4) / 43);
        var3.c(-161478600, param2.field_k);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_z = 0;
    }
}
