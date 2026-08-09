/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    static cj[] field_d;
    static int field_c;
    static ja[][] field_e;
    static ri field_a;
    static ul field_b;

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        field_e = (ja[][]) null;
        if (param0 != 6345) {
            pf.a(-125);
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static ri[] a(int param0, ul param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        ri[] stackIn_5_0 = null;
        ri[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (ud.a(param0, param1, param3, (byte) -42)) {
              if (param2 <= -50) {
                stackIn_7_0 = bc.a(2);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (ri[]) null;
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

            stackIn_10_1 = new StringBuilder().append("pf.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ri[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final static void a(int param0) {
        rm.field_a.setLength(0);
        va.field_a = 0;
        int var1 = -16 % ((param0 - -23) / 36);
    }

    static {
        field_c = 100;
        field_e = new ja[5][];
    }
}
