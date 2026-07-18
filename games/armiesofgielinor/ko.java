/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko {
    String field_f;
    static int field_e;
    boolean field_d;
    String field_c;
    static wk field_g;
    static int field_b;
    static String field_a;

    public static void a(boolean param0) {
        field_a = null;
        field_g = null;
    }

    final static byte[] a(boolean param0, int param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        mg var5 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_12_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_11_0 = null;
        byte[] stackOut_7_0 = null;
        byte[] stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          if (param2 != null) {
            if (!(param2 instanceof byte[])) {
              if (param2 instanceof mg) {
                var5 = (mg) param2;
                stackOut_11_0 = var5.a(0);
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0;
              } else {
                L0: {
                  if (param1 >= 30) {
                    break L0;
                  } else {
                    var4 = null;
                    byte[] discarded$2 = ko.a(false, 22, (Object) null);
                    break L0;
                  }
                }
                throw new IllegalArgumentException();
              }
            } else {
              var3 = (byte[]) param2;
              if (param0) {
                stackOut_7_0 = kj.a(var3, 31732);
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                stackOut_5_0 = (byte[]) var3;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
            return (byte[]) (Object) stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("ko.A(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L1;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new wk(56, 56);
        field_b = 0;
        field_a = "Player";
    }
}
