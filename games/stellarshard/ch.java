/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch {
    static String field_a;
    static String field_c;
    static String field_d;
    static String field_b;

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        field_d = null;
    }

    final static Object a(int param0, boolean param1, byte[] param2) {
        sa var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        sa stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        sa stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param2 != null) {
              if (param2.length > param0) {
                var3 = new sa();
                ((i) (Object) var3).a(param2, (byte) -122);
                stackOut_5_0 = (sa) var3;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                return (Object) (Object) param2;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("ch.B(").append(param0).append(',').append(false).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return (Object) (Object) stackIn_6_0;
    }

    final static String a(boolean param0, boolean param1, boolean param2, int param3) {
        int var4 = 0;
        L0: {
          var4 = param3;
          if (param1) {
            var4 += 4;
            break L0;
          } else {
            break L0;
          }
        }
        if (param2) {
          L1: {
            var4 += 2;
            if (param0) {
              var4++;
              break L1;
            } else {
              break L1;
            }
          }
          return td.field_c[var4];
        } else {
          L2: {
            if (param0) {
              var4++;
              break L2;
            } else {
              break L2;
            }
          }
          return td.field_c[var4];
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Fullscreen";
        field_c = "to over <%0> great games";
        field_d = "Sound Off";
        field_b = "More suggestions";
    }
}
