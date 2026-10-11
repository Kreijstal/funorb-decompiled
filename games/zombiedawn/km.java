/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km {
    boolean field_a;
    String field_d;
    static String field_b;
    String field_c;

    final static boolean a(int param0, int param1, wk param2, int param3) {
        RuntimeException var4 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 21405) {
            km.a((byte) 1);
          }
          stackIn_8_0 = (param1 > -48) && (param1 > -48) && ((float)param1 < (float)qj.field_d * 1.0f) && ((float)me.field_Bb * 1.0f > (float)param3);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("km.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 < 15) {
          km.a((byte) -128);
        }
    }

    static {
        field_b = "Select a location!";
    }
}
