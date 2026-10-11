/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ci {
    static int[] field_b;
    static int field_d;
    private java.util.zip.Inflater field_e;
    static String field_a;
    static int field_c;

    final static int a(int param0) {
        if (param0 != 256) {
          return 54;
        }
        ep.field_l.a(true);
        if (!tf.field_c.c(param0 - 277)) {
          return jo.w(79);
        }
        return 0;
    }

    public static void a(boolean param0) {
        if (param0) {
          field_b = (int[]) null;
          field_a = null;
          field_b = null;
          return;
        }
        field_a = null;
        field_b = null;
    }

    private ci(int param0, int param1, int param2) {
    }

    final void a(byte[] param0, de param1, int param2) {
        try {
          Exception exception = null;
          RuntimeException runtimeException = null;
          RuntimeException stackIn_13_0 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param1.field_h[param1.field_j] == 31 &&
              param1.field_h[1 + param1.field_j] == -117) {
              if (null == this.field_e) {
                this.field_e = new java.util.zip.Inflater(true);
              }
              try {
                this.field_e.setInput(param1.field_h, param1.field_j + 10, param1.field_h.length + param2 - param1.field_j - 10);
                this.field_e.inflate(param0);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                exception = (Exception) (Object) decompiledCaughtException;
                this.field_e.reset();
                throw new RuntimeException("");
              }
              this.field_e.reset();
              return;
            }
            throw new RuntimeException("");
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = runtimeException;
            stackIn_13_1 = new StringBuilder().append("ci.B(");
            if (param0 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
            if (param1 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw sh.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public ci() {
        this(-1, 1000000, 1000000);
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_d = 0;
        field_b = new int[256];
        field_a = "Passwords must be between 5 and 20 characters long";
        for (var1 = 0; 256 > var1; var1++) {
          var0 = var1;
          for (var2 = 0; 8 > var2; var2++) {
            if ((1 & var0) == 1) {
              var0 = var0 >>> 1 ^ -306674912;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_b[var1] = var0;
        }
    }
}
