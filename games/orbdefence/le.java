/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class le {
    static im field_a;
    private java.util.zip.Inflater field_b;
    static int field_c;
    static String field_d;

    public le() {
        this(-1, 1000000, 1000000);
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != 1000000) {
          field_a = (im) null;
        }
    }

    final void a(byte[] param0, int param1, mg param2) {
        try {
          try {
            if (param2.field_j[param2.field_i] != 31 ||
              -117 != param2.field_j[1 + param2.field_i]) {
              throw new RuntimeException("");
            }
            if (this.field_b == null) {
              this.field_b = new java.util.zip.Inflater(true);
            }
            try {
              if (param1 != 693) {
                field_c = -106;
              }
              this.field_b.setInput(param2.field_j, 10 + param2.field_i, -8 - (10 + (param2.field_i - param2.field_j.length)));
              this.field_b.inflate(param0);
            } catch (Exception exception) {
              this.field_b.reset();
              throw new RuntimeException("");
            }
            this.field_b.reset();
          } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "le.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private le(int param0, int param1, int param2) {
    }

    final static ik a(int param0, ki param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        ik stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = param1.a(param0, true);
          var3 = var4;
          if (param2 != 10) {
            le.a(-107);
          }
          if (var4 == null) {
            return null;
          }
          stackIn_6_0 = new ik(var4);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("le.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_c = 0;
        field_a = new im();
        field_d = "Login: ";
    }
}
