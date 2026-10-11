/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jg {
    static int[] field_e;
    static boolean field_a;
    private java.util.zip.Inflater field_c;
    static int[] field_b;
    static volatile int field_d;

    public jg() {
        this(-1, 1000000, 1000000);
    }

    final static void b(int param0, int param1) {
        pl var2 = as.field_v;
        var2.g(param1, 8);
        var2.b((byte) 106, 1);
        if (param0 == 11044) {
          var2.b((byte) 79, 0);
          return;
        }
    }

    static int a(int param0, int param1) {
        return param0 ^ param1;
    }

    final void a(byte[] param0, byte param1, fs param2) {
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
            if (param2.field_n[param2.field_p] == 31 &&
              param2.field_n[1 + param2.field_p] == -117) {
              if (null == this.field_c) {
                this.field_c = new java.util.zip.Inflater(true);
              }
              if (param1 != -104) {
                this.field_c = (java.util.zip.Inflater) null;
              }
              try {
                this.field_c.setInput(param2.field_n, 10 + param2.field_p, param2.field_n.length + (-param2.field_p - 10 - 8));
                this.field_c.inflate(param0);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                exception = (Exception) (Object) decompiledCaughtException;
                this.field_c.reset();
                throw new RuntimeException("");
              }
              this.field_c.reset();
              return;
            }
            throw new RuntimeException("");
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = runtimeException;
            stackIn_15_1 = new StringBuilder().append("jg.C(");
            if (param0 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw qo.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private jg(int param0, int param1, int param2) {
    }

    public static void a(byte param0) {
        field_b = null;
        field_e = null;
        if (param0 < 2) {
          field_a = true;
        }
    }

    static {
        field_e = new int[1];
        field_a = false;
        field_d = 0;
    }
}
