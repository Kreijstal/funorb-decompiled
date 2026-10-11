/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hi {
    private java.util.zip.Inflater field_d;
    static wh field_a;
    static int field_c;
    static dk field_b;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != -32) {
          field_b = (dk) null;
        }
    }

    private hi(int param0, int param1, int param2) {
    }

    final void a(int param0, byte[] param1, gk param2) {
        try {
          Exception exception = null;
          RuntimeException runtimeException = null;
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param2.field_g[param2.field_h] == 31 &&
              param2.field_g[param2.field_h + 1] == -117) {
              if (null == this.field_d) {
                this.field_d = new java.util.zip.Inflater(true);
              }
              try {
                if (param0 < 30) {
                  hi.a(80);
                }
                this.field_d.setInput(param2.field_g, param2.field_h + 10, -param2.field_h - 10 - 8 + param2.field_g.length);
                this.field_d.inflate(param1);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                exception = (Exception) (Object) decompiledCaughtException;
                this.field_d.reset();
                throw new RuntimeException("");
              }
              this.field_d.reset();
              return;
            }
            throw new RuntimeException("");
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = runtimeException;
            stackIn_15_1 = new StringBuilder().append("hi.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
            if (param2 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw la.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public hi() {
        this(-1, 1000000, 1000000);
    }

    static {
    }
}
