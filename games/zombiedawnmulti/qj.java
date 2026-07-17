/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj extends br {
    static int field_i;
    int field_f;
    static int[] field_o;
    int field_h;
    int field_g;
    static ri field_m;
    static String field_l;
    int field_k;
    static boolean field_p;
    int field_q;
    static String field_j;
    int field_n;

    final static void a(String param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              bl.field_h = param1;
              nj.field_f = true;
              h.field_L = new ne(nb.field_a, ci.field_d, param0, ch.field_e, bl.field_h);
              nb.field_a.b(3016, (cf) (Object) h.field_L);
              if (param2 > 89) {
                break L1;
              } else {
                field_j = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("qj.A(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public static void b(boolean param0) {
        field_j = null;
        field_m = null;
        field_o = null;
        field_l = null;
    }

    qj(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((qj) this).field_k = param5;
        ((qj) this).field_h = param3;
        ((qj) this).field_q = param2;
        ((qj) this).field_f = param4;
        ((qj) this).field_g = param0;
        ((qj) this).field_n = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "This will help you organise your horde. Use CTRL + '1', '2' or '3' to set unit groups, then press '1', '2' or '3' to quickly select each group.";
        field_p = true;
        field_j = "Allow spectators?";
    }
}
