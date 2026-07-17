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
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
              if (param0 == -107) {
                break L1;
              } else {
                field_c = -102;
                break L1;
              }
            }
            stackOut_2_0 = ok.a(0, param1, param2, (byte) 109);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ba.A(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    public static void a(boolean param0) {
        field_e = null;
        field_d = null;
        field_a = null;
        field_f = null;
    }

    final static boolean a(byte param0) {
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
