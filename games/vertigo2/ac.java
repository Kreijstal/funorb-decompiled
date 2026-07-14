/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac extends oh {
    static String field_M;
    static byte[][] field_O;
    static String field_N;
    static r field_G;
    static String field_L;
    static String field_J;
    static int[] field_I;
    static int[] field_K;

    private ac(int param0, int param1, int param2, int param3, ur param4, uf param5, iq param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((ac) this).field_C = param6;
    }

    public static void f(byte param0) {
        field_G = null;
        field_M = null;
        field_K = null;
        field_I = null;
        if (param0 <= 61) {
          field_G = null;
          field_O = null;
          field_L = null;
          field_J = null;
          field_N = null;
          return;
        } else {
          field_O = null;
          field_L = null;
          field_J = null;
          field_N = null;
          return;
        }
    }

    final void a(iq param0, byte param1, int param2, int param3, int param4, int param5) {
        qg var7 = null;
        super.a(param0, param1, param2, param3, param4, param5);
        var7 = um.field_E;
        if (var7 != null) {
          if (((ac) this).a(0, param3, param2, param4, param5)) {
            if (!(((ac) this).field_v instanceof sh)) {
              if (!(var7.field_v instanceof sh)) {
                return;
              } else {
                ((sh) (Object) var7.field_v).a(param1 ^ -13387, var7, (ac) this);
                um.field_E = null;
                return;
              }
            } else {
              ((sh) (Object) ((ac) this).field_v).a(param1 ^ -13387, var7, (ac) this);
              um.field_E = null;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "Offensive account name";
        field_J = "<%0> might change the options - wait and see.";
        field_N = "Shortcut Reference";
        field_L = "Creating your account";
        field_O = new byte[1000][];
        field_K = new int[16384];
    }
}
