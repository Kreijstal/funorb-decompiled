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
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!ud.a(param0, param1, param3, (byte) -42)) {
            stackIn_2_0 = null;
            return (ri[]) (stackIn_2_0);
          }
          if (param2 <= -50) {
            stackIn_7_0 = bc.a(2);
            return stackIn_7_0;
          }
          stackIn_5_0 = (ri[]) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("pf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0) {
        rm.field_a.setLength(0);
        va.field_a = 0;
        int var1 = -16 % ((param0 + 23) / 36);
    }

    static {
        field_c = 100;
        field_e = new ja[5][];
    }
}
