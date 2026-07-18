/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends um {
    static dl field_h;
    static String field_j;
    private int field_g;
    static ko field_k;
    private int field_i;

    final void a(byte param0) {
        int var2 = 57 / ((29 - param0) / 42);
        tb.field_d.a(ck.field_cb, 100, 48 * (gi.field_m * ((ad) this).field_i), ((ad) this).field_g / ((ad) this).field_i);
        ((ad) this).field_i = 0;
        ((ad) this).field_g = 0;
    }

    public static void c(int param0) {
        field_k = null;
        field_j = null;
        field_h = null;
    }

    final pb b(byte param0) {
        if (param0 >= -127) {
            pb discarded$0 = ((ad) this).b((byte) 105);
            return (pb) (Object) new eq();
        }
        return (pb) (Object) new eq();
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        if (!param0) {
          ((ad) this).a(true, 97, 64, -58);
          pd.field_g[param1] = pd.field_g[param1] + param2 * 100;
          return;
        } else {
          pd.field_g[param1] = pd.field_g[param1] + param2 * 100;
          return;
        }
    }

    final f a(boolean param0, int param1, int param2, int param3, ta param4) {
        RuntimeException var6 = null;
        f stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        f stackOut_2_0 = null;
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
                ((ad) this).field_g = -58;
                break L1;
              }
            }
            ((ad) this).field_i = ((ad) this).field_i + 1;
            ((ad) this).field_g = ((ad) this).field_g + param3;
            ph.a(100, (byte) 107, param1, param4);
            stackOut_2_0 = bm.field_g;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var6;
            stackOut_4_1 = new StringBuilder().append("ad.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
          throw dn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    ad() {
        ((ad) this).field_g = 0;
        ((ad) this).field_i = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Type your password again to make sure it's correct";
    }
}
