/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl {
    static String field_a;
    static String field_b;
    static dd[][] field_d;
    static rb field_e;
    static int field_c;

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_e = null;
        if (param0 <= 31) {
          field_e = (rb) null;
          field_d = (dd[][]) null;
          return;
        } else {
          field_d = (dd[][]) null;
          return;
        }
    }

    final static boolean a(byte param0, di param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        di var4 = null;
        byte[] var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 5) {
                break L1;
              } else {
                var4 = (di) null;
                jl.a((byte) -59, (di) null, -110);
                break L1;
              }
            }
            var5 = param1.b(param2, -31413);
            var3 = var5;
            if (var5 == null) {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              oa.a(true, var5);
              stackIn_7_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("jl.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    static {
        field_b = "<%0> are all out of lives!";
        field_a = "To <%0>: ";
    }
}
