/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb extends h {
    static int field_H;
    static String field_G;
    static int[] field_I;

    final void a(int param0, int param1, int param2, oc param3, int param4, int param5) {
        dn var7 = null;
        super.a(param0, param1, param2, param3, param4, param5);
        var7 = gd.field_c;
        if (var7 != null) {
          if (((jb) this).a(param0, param2, param5, 3, param1)) {
            if (!(((jb) this).field_i instanceof em)) {
              if (var7.field_i instanceof em) {
                ((em) (Object) var7.field_i).a(-24178, var7, (jb) this);
                gd.field_c = null;
                return;
              } else {
                return;
              }
            } else {
              ((em) (Object) ((jb) this).field_i).a(-24178, var7, (jb) this);
              gd.field_c = null;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private jb(int param0, int param1, int param2, int param3, ub param4, uh param5, oc param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((jb) this).field_E = param6;
    }

    public static void i(byte param0) {
        field_I = null;
        field_G = null;
        if (param0 >= -47) {
            jb.b(-87, 55, -124);
        }
    }

    final static void b(int param0, int param1, int param2) {
        pi var3 = null;
        var3 = k.field_h;
        var3.e(-13413, param1);
        var3.a(-115, 3);
        if (param2 != 11912) {
          return;
        } else {
          var3.a(-113, 8);
          var3.b((byte) 109, param0);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new int[]{2, 3, 4, 5};
        field_G = "Checking";
    }
}
