/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba {
    static String field_a;
    static int field_c;
    static wk field_e;
    static int field_b;
    static String field_f;
    static int[] field_d;

    final static boolean a(int param0, int param1, int param2) {
        int var3 = 0;
        if (ei.field_q != 13) {
          var3 = -28 / ((35 - param0) / 54);
          if (ei.field_q != 102) {
            if (jk.field_i != null) {
              if (!jk.field_i.a(25542, param2, param1)) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            jk.field_i.l(-128);
            return true;
          }
        } else {
          pm.a((byte) -126);
          return true;
        }
    }

    final static int a(byte param0, byte[] param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
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
            stackOut_0_0 = ok.a(0, param1, param2, (byte) 109);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("ba.A(").append(-107).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    public static void a(boolean param0) {
        field_e = null;
        field_d = null;
        field_a = null;
        field_f = null;
    }

    final static boolean a() {
        return ve.a(ge.field_m, 1, 25);
    }

    final static void b(boolean param0) {
        if (param0) {
            ba.b(true);
            pa.a(12105, ti.field_m);
            return;
        }
        pa.a(12105, ti.field_m);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Unpacking music";
        field_c = 0;
        field_f = null;
    }
}
