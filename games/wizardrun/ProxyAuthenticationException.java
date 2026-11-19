/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ProxyAuthenticationException extends IOException {
    static int field_b;
    static String field_a;

    ProxyAuthenticationException(String param0) {
        super(param0);
    }

    public static void releaseStatics(int param0) {
        if (param0 != 3543) {
          ProxyAuthenticationException.releaseStatics(-41);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static NameAvailabilityRequest createNameAvailabilityError(int param0, String param1, int param2) {
        NameAvailabilityRequest var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        NameAvailabilityRequest stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new NameAvailabilityRequest(false);
          if (param0 >= -19) {
            var4 = (String) null;
            ProxyAuthenticationException.createNameAvailabilityError(49, (String) null, 1);
          }
          var3.field_b = param2;
          var3.field_h = param1;
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("hf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_a = "Play the game without logging in just yet";
    }
}
