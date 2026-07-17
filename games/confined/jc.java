/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    static int field_e;
    static int[] field_f;
    static String field_a;
    static String[] field_d;
    static ck field_c;
    static boolean field_g;
    static String field_b;

    final static boolean a(int param0) {
        int var1 = 0;
        L0: {
          if (ai.field_i == -1) {
            if (!jj.a(1, (byte) -78)) {
              return false;
            } else {
              ai.field_i = e.field_c.c(32);
              e.field_c.field_n = 0;
              break L0;
            }
          } else {
            break L0;
          }
        }
        if (ai.field_i == -2) {
          if (!jj.a(2, (byte) -111)) {
            return false;
          } else {
            ai.field_i = e.field_c.a((byte) 25);
            e.field_c.field_n = 0;
            var1 = -122 / ((param0 - -9) / 57);
            return jj.a(ai.field_i, (byte) 43);
          }
        } else {
          var1 = -122 / ((param0 - -9) / 57);
          return jj.a(ai.field_i, (byte) 43);
        }
    }

    final static void a(String param0, int param1, float param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          og.field_h = param2;
          ui.field_b = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("jc.C(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 10265 + 44 + param2 + 41);
        }
    }

    public static void a() {
        field_d = null;
        field_f = null;
        field_a = null;
        field_c = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_f = new int[]{0, 0, 0, -65536, 0, 0, 0, 65536, 0, 0, 0, -65536};
        field_b = "You have 1 unread message!";
    }
}
