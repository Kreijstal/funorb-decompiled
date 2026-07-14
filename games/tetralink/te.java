/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te extends en {
    static hl field_O;
    static String field_N;
    static String field_Q;
    static int field_P;
    static int field_R;

    final void a(int param0, boolean param1, na param2, int param3, int param4, int param5) {
        ed var7 = null;
        ed var8 = null;
        super.a(param0, param1, param2, param3, param4, param5);
        var8 = gi.field_c;
        var7 = var8;
        if (var8 != null) {
          if (((te) this).b(param4, 1343807649, param5, param3, param0)) {
            if (!(((te) this).field_s instanceof hf)) {
              if (!(var8.field_s instanceof hf)) {
                return;
              } else {
                ((hf) (Object) var8.field_s).a(var8, 92, (te) this);
                gi.field_c = null;
                return;
              }
            } else {
              ((hf) (Object) ((te) this).field_s).a(var8, 108, (te) this);
              gi.field_c = null;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void h(int param0) {
        if (param0 > -6) {
          te.h(115);
          field_N = null;
          field_Q = null;
          field_O = null;
          return;
        } else {
          field_N = null;
          field_Q = null;
          field_O = null;
          return;
        }
    }

    private te(int param0, int param1, int param2, int param3, kg param4, dn param5, na param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((te) this).field_J = param6;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "Account created successfully!";
        field_P = 480;
        field_Q = "Unable to delete friend - system busy";
    }
}
