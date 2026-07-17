/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends rl {
    private int field_l;
    static long field_j;
    private int field_k;

    final f a(boolean param0, int param1, int param2, int param3, ta param4) {
        RuntimeException var6 = null;
        jo stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        jo stackOut_2_0 = null;
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
              if (!param0) {
                break L1;
              } else {
                ((tc) this).field_k = -21;
                break L1;
              }
            }
            ((tc) this).field_k = ((tc) this).field_k + param3;
            ((tc) this).field_l = ((tc) this).field_l + 1;
            stackOut_2_0 = new jo(bm.field_g, 0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var6;
            stackOut_4_1 = new StringBuilder().append("tc.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param4 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return (f) (Object) stackIn_3_0;
    }

    final pb b(byte param0) {
        if (param0 >= -127) {
            ((tc) this).field_l = 101;
            return (pb) (Object) new sh();
        }
        return (pb) (Object) new sh();
    }

    final void a(byte param0) {
        int var2 = -78 / ((29 - param0) / 42);
        tb.field_d.a(re.field_h, 100, ((tc) this).field_l * (48 * gi.field_m), ((tc) this).field_k / ((tc) this).field_l);
        ((tc) this).field_k = 0;
        ((tc) this).field_l = 0;
    }

    tc() {
        ((tc) this).field_k = 0;
        ((tc) this).field_l = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0L;
    }
}
