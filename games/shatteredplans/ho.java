/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ho {
    static int field_b;
    static qr field_j;
    static nq field_f;
    static int field_c;
    static int field_a;
    static char field_h;
    static String field_g;
    static fs field_d;
    static byte[] field_i;
    static int[] field_e;

    final static void a(boolean param0, int param1) {
        if (null == bq.field_h) {
          if (param1 != 8323199) {
            ho.a(-86);
            return;
          } else {
            return;
          }
        } else {
          gf.h(gf.field_i, gf.field_a, gf.field_l + -gf.field_i, -gf.field_a + gf.field_f);
          bq.field_h.b(param0, -100);
          if (param1 == 8323199) {
            return;
          } else {
            ho.a(-86);
            return;
          }
        }
    }

    final static li a(int param0, int param1, String param2) {
        pa var3 = null;
        RuntimeException var3_ref = null;
        pa stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        pa stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3 = new pa();
            ((li) (Object) var3).field_a = param0;
            ((li) (Object) var3).field_f = param2;
            stackOut_0_0 = (pa) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("ho.B(").append(param0).append(',').append(-4276).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return (li) (Object) stackIn_1_0;
    }

    public static void a(int param0) {
        field_e = null;
        field_f = null;
        if (param0 != 520) {
          ho.a(false, 124);
          field_i = null;
          field_g = null;
          field_j = null;
          field_d = null;
          return;
        } else {
          field_i = null;
          field_g = null;
          field_j = null;
          field_d = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_g = "Enemy Production";
        field_e = new int[]{16729156, 4521796, 7829503, 8323199, 16776960, 65535, 16776960, 8388479, 8355839};
        field_i = new byte[520];
    }
}
