/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ppb {
    static ri field_c;
    static String field_d;
    static asb field_a;
    static cda field_b;

    public static void a(int param0) {
        try {
            field_a = null;
            field_c = null;
            int var1_int = -52 / ((param0 - -64) / 39);
            field_b = null;
            field_d = null;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ppb.A(" + param0 + ')');
        }
    }

    final static byte[] a(Object param0, int param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        byte[] var4_array = null;
        ps var4_ref = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_9_0 = null;
        Object stackIn_12_0 = null;
        byte[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        byte[] stackOut_8_0 = null;
        byte[] stackOut_16_0 = null;
        Object stackOut_11_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          if (null == param0) {
            stackOut_3_0 = null;
            stackIn_4_0 = stackOut_3_0;
            return (byte[]) (Object) stackIn_4_0;
          } else {
            if (param0 instanceof byte[]) {
              var4_array = (byte[]) param0;
              stackOut_8_0 = qcb.a(param3, var4_array, param1, 31783);
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0;
            } else {
              if (param2) {
                if (param0 instanceof ps) {
                  var4_ref = (ps) param0;
                  stackOut_16_0 = var4_ref.a(param3, -106, param1);
                  stackIn_17_0 = stackOut_16_0;
                  return stackIn_17_0;
                } else {
                  throw new IllegalArgumentException();
                }
              } else {
                stackOut_11_0 = null;
                stackIn_12_0 = stackOut_11_0;
                return (byte[]) (Object) stackIn_12_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("ppb.B(");
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L0;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L0;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static rb a(String param0, int param1, byte param2) {
        aqb var3 = null;
        RuntimeException var3_ref = null;
        aqb stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        aqb stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param2 < -55) {
                break L1;
              } else {
                rb discarded$2 = ppb.a((String) null, 112, (byte) 96);
                break L1;
              }
            }
            var3 = new aqb();
            ((rb) (Object) var3).field_b = param1;
            ((rb) (Object) var3).field_a = param0;
            stackOut_3_0 = (aqb) var3;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("ppb.C(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
        return (rb) (Object) stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Invisible";
        field_c = new ri(11, 0, 1, 2);
    }
}
