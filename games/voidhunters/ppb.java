/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ppb {
    static ri field_c;
    static String field_d;
    static asb field_a;
    static cda field_b;

    public static void a() {
        field_a = null;
        field_c = null;
        int var1 = -26;
        field_b = null;
        field_d = null;
    }

    final static byte[] a(Object param0, int param1) {
        RuntimeException var4 = null;
        byte[] var4_array = null;
        ps var5 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_7_0 = null;
        byte[] stackOut_15_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          if (null != param0) {
            if (param0 instanceof byte[]) {
              var4_array = (byte[]) param0;
              int discarded$1 = 31783;
              stackOut_7_0 = qcb.a(32768, var4_array, param1);
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              if (param0 instanceof ps) {
                var5 = (ps) param0;
                stackOut_15_0 = var5.a(32768, -106, param1);
                stackIn_16_0 = stackOut_15_0;
                return stackIn_16_0;
              } else {
                throw new IllegalArgumentException();
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("ppb.B(");
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L0;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L0;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 44 + 1 + 44 + 32768 + 41);
        }
    }

    final static rb a(String param0, int param1, byte param2) {
        aqb var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        aqb stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        aqb stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param2 < -55) {
                break L1;
              } else {
                var4 = null;
                rb discarded$2 = ppb.a((String) null, 112, (byte) 96);
                break L1;
              }
            }
            var3 = new aqb();
            ((rb) (Object) var3).field_b = param1;
            ((rb) (Object) var3).field_a = param0;
            stackOut_2_0 = (aqb) var3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3_ref;
            stackOut_4_1 = new StringBuilder().append("ppb.C(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 41);
        }
        return (rb) (Object) stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Invisible";
        field_c = new ri(11, 0, 1, 2);
    }
}
