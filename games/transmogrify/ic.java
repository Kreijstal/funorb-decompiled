/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic {
    static int[] field_c;
    static int[] field_d;
    static int field_a;
    static int field_b;

    final static od a(bb param0, int param1) {
        od discarded$2 = null;
        od var2 = null;
        RuntimeException var2_ref = null;
        bb var3 = null;
        od stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        od stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 4) {
                break L1;
              } else {
                var3 = (bb) null;
                discarded$2 = ic.a((bb) null, -1);
                break L1;
              }
            }
            var2 = new od(param0, param0);
            lb.field_f.a(var2, param1 ^ -112);
            of.field_a.a(param0);
            stackOut_2_0 = (od) (var2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2_ref);
            stackOut_4_1 = new StringBuilder().append("ic.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        if (param0 != 1) {
            field_c = (int[]) null;
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = 0;
        if (param1 >= -18) {
          field_c = (int[]) null;
          var3 = param2 >> -1304712577 & param0 - 1;
          return var3 + ((param2 >>> -1375802817) + param2) % param0;
        } else {
          var3 = param2 >> -1304712577 & param0 - 1;
          return var3 + ((param2 >>> -1375802817) + param2) % param0;
        }
    }

    static {
        field_d = new int[4];
        field_c = new int[256];
    }
}
