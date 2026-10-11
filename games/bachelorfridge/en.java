/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class en extends IOException {
    static ee field_a;

    en(String param0) {
        super(param0);
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -10132) {
          field_a = (ee) null;
        }
    }

    final static int a(int param0, CharSequence param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 21 / ((param2 - 41) / 37);
          stackIn_1_0 = kna.a(param0, param1, true, 24808);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("en.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
    }
}
