/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gk {
    static Random field_a;
    static String field_b;
    static boolean field_c;

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        int var1 = -1 / ((-32 - param0) / 60);
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param0 != -9787) {
                field_c = true;
              }
              java.net.URL var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
              param1.getAppletContext().showDocument(sh.a((byte) 114, param1, var2), "_top");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Exception var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_8_0 = var2_ref2;
            StringBuilder stackIn_8_1 = new StringBuilder().append("gk.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = "Crate";
        field_a = new Random();
        field_c = true;
    }
}
