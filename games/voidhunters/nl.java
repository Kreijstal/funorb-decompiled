/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl extends ksa {
    ana field_d;
    boolean field_h;
    boolean field_g;
    int field_k;
    int field_f;
    int field_i;
    static float field_n;
    static d field_e;
    int field_l;
    static int field_m;
    static String field_j;

    final static void a(int param0, int param1) {
        ana var2 = null;
        int var3 = 0;
        boolean stackIn_13_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        ana var2Lifetime1;
        var3 = VoidHunters.field_G;
        try {
          kt.field_l = param0;
          var2 = (ana) (cg.field_p.d(param1 + 13205));
          if (param1 != -13205) {
            nl.a(-88);
          }
          while (var2 != null) {
            if (var2.field_g.b((byte) -63)) {
              var2.field_e.e(128 + kt.field_l * var2.field_d >> 8);
            } else {
              var2.b(-3846);
            }
            var2 = (ana) (cg.field_p.a((byte) 61));
          }
          if (null != rd.field_o) {
            var2Lifetime1 = (ana) (rd.field_o.d(0));
            while (var2Lifetime1 != null) {
              stackIn_13_0 = var2Lifetime1.field_g.b((byte) -63);
              if (!stackIn_13_0) {
                var2Lifetime1.b(param1 ^ 15505);
              } else {
                var2Lifetime1.field_e.e(kt.field_l * var2Lifetime1.field_d + 128 >> 8);
              }
              var2Lifetime1 = (ana) (rd.field_o.a((byte) 100));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var2_ref), "nl.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 2128263208) {
          field_n = -0.17532885074615479f;
          field_e = null;
          field_j = null;
          return;
        }
        field_e = null;
        field_j = null;
    }

    nl() {
    }

    static {
        field_n = 0.20000000298023224f;
        field_j = "No";
    }
}
