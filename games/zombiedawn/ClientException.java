/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientException extends RuntimeException {
    Throwable field_c;
    String field_b;
    static int field_a;
    static String field_d;

    final static byte[] getLoadingTextFile(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 121 / ((param0 - 47) / 53);
          stackIn_1_0 = DirectByteStorage.field_f.getFileByName(param1, -101, "");
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("aj.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 <= 28) {
          ClientException.releaseStatics((byte) -72);
          field_d = null;
          return;
        }
        field_d = null;
    }

    ClientException(Throwable param0, String param1) {
        this.field_b = param1;
        this.field_c = param0;
    }

    static {
        field_d = "Overall score: ";
        field_a = 468;
    }
}
