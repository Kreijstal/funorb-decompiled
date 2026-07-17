/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kr {
    static String[] field_f;
    static ri[] field_b;
    static tf field_a;
    static int[] field_d;
    static int field_c;
    static int field_e;

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_d = null;
        if (param0 > -58) {
            field_a = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static wb[] a(int param0, ki param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        wb[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        wb[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (k.a(param1, param2, param3, -23046)) {
              int discarded$2 = -124;
              stackOut_3_0 = bw.b();
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (wb[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("kr.B(").append(19889).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_4_0;
    }

    final static void a(boolean param0, int param1, boolean param2) {
        if (!param2) {
          if (param1 > -16) {
            kr.a(28);
            jj.field_d = jj.field_d + 1;
            int discarded$8 = -56;
            o.a();
            return;
          } else {
            jj.field_d = jj.field_d + 1;
            int discarded$9 = -56;
            o.a();
            return;
          }
        } else {
          Sumoblitz.field_H = Sumoblitz.field_H + 1;
          rb.a(-129);
          if (param1 <= -16) {
            jj.field_d = jj.field_d + 1;
            int discarded$10 = -56;
            o.a();
            return;
          } else {
            kr.a(28);
            jj.field_d = jj.field_d + 1;
            int discarded$11 = -56;
            o.a();
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_a = new tf();
        field_e = 0;
        field_c = 256;
    }
}
