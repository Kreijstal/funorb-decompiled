/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa extends gn {
    static int field_j;
    int field_f;
    static java.awt.Frame field_k;
    int field_i;
    static String field_h;
    static String field_e;
    static String[] field_g;

    final static void b(int param0) {
        kd.field_s = false;
        if (!(dr.field_g == null)) {
            dr.field_g.a(5075);
        }
        int var1 = -60 % ((-56 - param0) / 56);
        if (!(0 == ov.field_b)) {
            td.a(29);
        }
        fb.field_I = 0;
    }

    private fa() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_g = null;
        field_k = null;
        field_h = null;
        field_e = null;
        int var1 = 81 % ((param0 - -6) / 41);
    }

    final static ut[] a(int param0, byte param1, int param2, sj param3) {
        RuntimeException var4 = null;
        ut[] stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        ut[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 <= -67) {
              if (cu.a(param2, param3, param0, 122)) {
                stackIn_7_0 = ub.i((byte) 78);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (ut[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("fa.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ut[]) ((Object) stackIn_5_0);
          } else {
            return stackIn_7_0;
          }
        }
    }

    static {
        field_j = 0;
        field_h = "Confirm Password: ";
        field_e = "Open in popup window";
    }
}
