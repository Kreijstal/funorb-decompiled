/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll {
    static dm[] field_h;
    static String field_a;
    static rh field_f;
    static rf field_d;
    static boolean field_e;
    static String field_c;
    static boolean[] field_g;
    static String field_b;

    final static long a(byte param0) {
        if (param0 != 12) {
            rh var2 = (rh) null;
            ll.a(55, (byte) -55, -85, (rh) null);
        }
        return -kh.field_e + oa.a(-12520);
    }

    final static dm[] a(int param0, byte param1, int param2, rh param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        dm[] stackIn_5_0 = null;
        dm[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (mf.a(param2, param0, 117, param3)) {
              if (param1 == -81) {
                stackIn_7_0 = nf.b(255);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (dm[]) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("ll.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

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
          throw t.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (dm[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_f = null;
        field_b = null;
        field_a = null;
        field_d = null;
        field_h = null;
        if (param0 != 7) {
            return;
        }
        field_g = null;
    }

    static {
        field_a = "More suggestions";
        field_g = new boolean[7];
        field_c = "Your email address is used to identify this account";
        field_b = "Back";
    }
}
