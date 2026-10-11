/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wk {
    static int field_c;
    private java.util.zip.Inflater field_a;
    static int field_b;

    public wk() {
        this(-1, 1000000, 1000000);
    }

    private wk(int param0, int param1, int param2) {
    }

    final void a(byte[] param0, va param1, int param2) {
        try {
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          RuntimeException var4_ref = null;
          try {
            if (param1.field_k[param1.field_m] == 31 &&
              param1.field_k[1 + param1.field_m] == -117) {
              if (this.field_a == null) {
                this.field_a = new java.util.zip.Inflater(true);
              }
              try {
                this.field_a.setInput(param1.field_k, 10 + param1.field_m, -8 - param1.field_m - 10 + param1.field_k.length);
                if (param2 != 6912) {
                  return;
                }
                this.field_a.inflate(param0);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
                this.field_a.reset();
                throw new RuntimeException("");
              }
              this.field_a.reset();
              return;
            }
            throw new RuntimeException("");
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = var4_ref;
            stackIn_15_1 = new StringBuilder().append("wk.A(");
            if (param0 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
            if (param1 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw bd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = 0;
    }
}
