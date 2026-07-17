/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh extends qc {
    private int field_k;
    static String field_l;
    static String field_m;
    private int field_j;

    final pb b(byte param0) {
        if (param0 > -127) {
            return null;
        }
        return (pb) (Object) new ac();
    }

    final void a(byte param0) {
        int var2 = -16 / ((param0 - 29) / 42);
        tb.field_d.a(cb.field_p, 100, ((sh) this).field_k * (gi.field_m * 48), ((sh) this).field_j / ((sh) this).field_k);
        ((sh) this).field_j = 0;
        ((sh) this).field_k = 0;
    }

    final f a(boolean param0, int param1, int param2, int param3, ta param4) {
        RuntimeException var6 = null;
        cj stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        cj stackOut_2_0 = null;
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
              ((sh) this).field_j = ((sh) this).field_j + param3;
              if (!param0) {
                break L1;
              } else {
                field_m = null;
                break L1;
              }
            }
            ((sh) this).field_k = ((sh) this).field_k + 1;
            stackOut_2_0 = new cj(bm.field_g, 0, 0, 0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var6;
            stackOut_4_1 = new StringBuilder().append("sh.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
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

    public static void c(int param0) {
        field_l = null;
        if (param0 <= 83) {
            sh.c(100);
            field_m = null;
            return;
        }
        field_m = null;
    }

    sh() {
        ((sh) this).field_k = 0;
        ((sh) this).field_j = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Confirm Email:";
        field_l = "Enter";
    }
}
