/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hf extends IOException {
    static int field_b;
    static String field_a;

    hf(String param0) {
        super(param0);
    }

    public static void a(int param0) {
        if (param0 != 3543) {
            hf.a(-41);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static wd a(int param0, String param1, int param2) {
        wd var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        wd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = new wd(false);
              if (param0 < -19) {
                break L1;
              } else {
                var4 = (String) null;
                hf.a(49, (String) null, 1);
                break L1;
              }
            }
            var3.field_b = param2;
            var3.field_h = param1;
            stackIn_3_0 = (wd) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("hf.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_a = "Play the game without logging in just yet";
    }
}
